package AppTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class LoginWithGmail extends AppTestBase {

    @Test(priority = 1)
    public void Login_Page_UI() throws InterruptedException, IOException {
        LoginUiPageObjects uiObj = new LoginUiPageObjects(driver);

        uiObj.verifyPopup();
        uiObj.verifyHeader("Join LifeHope Health™, the fastest way to track, test & report your family’s health to keep everyone healthy, happy and blessed.");
        uiObj.verifyMobileNumberField("Mobile Number");
        uiObj.verifySignupButton("Sign Up / Sign In");
        uiObj.verifyFacebookLogo();
        uiObj.verifyGmailLogo();
        uiObj.verifyBottomText("By proceeding you agree to our T&C and Privacy Policy");
    }

    @Test(priority = 2)
    public void Gmail_Page_UI() throws InterruptedException, IOException {
        GmailUiPageObjects uiObj = new GmailUiPageObjects(driver);

        uiObj.verifyAppLogo();
        uiObj.verifyText("to continue to LifeHope Health");
        uiObj.verifyBottomText("To continue, Google will share your name, email address and profile picture with LifeHope Health.");
    }

    @Test(priority = 3)
    public void Gmail_Signup() throws InterruptedException, IOException {
        GmailSignupPageObjects gObj = new GmailSignupPageObjects(driver);

        gObj.verifyPopup();
        gObj.clickGmail();
        gObj.selectGmail();
        gObj.verifyMobileNumber(dataList.get(0));
        gObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        gObj.verifyUI("Enter your mobile number to \n" + "Login or Sign up", "Mobile Number", "+1", "Next", dataList.get(10));
        gObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test(priority = 4)
    public void Logout() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.Logout();
    }

}
