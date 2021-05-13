package AppTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class LoginWithFacebook extends AppTestBase {

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
    public void Facebook_Page_UI() throws InterruptedException, IOException {
        FbUiPageObjects uiObj = new FbUiPageObjects(driver);

        uiObj.verifyFbContinuePageUi("Log in to your Facebook account to connect to Life Hope", "You previously logged in to Life Hope with Facebook.\n" + "\n" + "Would you like to continue?", "LifeHope's", "Privacy Policy");
    }

    @Test(priority = 3)
    public void Facebook_MobileNumber_Signup() throws InterruptedException, IOException {
        FacebookSignupPageObjects fbObj = new FacebookSignupPageObjects(driver);

        fbObj.verifyPopup();
        fbObj.clickFacebook();
        fbObj.setFacebookCredentials(dataList.get(8), dataList.get(9));
        fbObj.verifyMobileNumber(dataList.get(0));
        fbObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        fbObj.verifyUI("Enter your mobile number to \n" + "Login or Sign up", "Mobile Number", "+1", "Next", dataList.get(10), "Enter your mobile number to \n" + "Login or Sign up");
        fbObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test(priority = 4)
    public void Facebook_Gmail_Signup() throws InterruptedException, IOException {
        FacebookSignupPageObjects fbObj = new FacebookSignupPageObjects(driver);

        fbObj.verifyPopup();
        fbObj.clickFacebook();
        fbObj.setFacebookCredentials(dataList.get(11), dataList.get(12));
        fbObj.verifyMobileNumber(dataList.get(0));
        fbObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        fbObj.verifyUI("Enter your mobile number to \n" + "Login or Sign up", "Mobile Number", "+1", "Next", dataList.get(10), "Enter your mobile number to \n" + "Login or Sign up");
        fbObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test(priority = 5)
    public void Logout() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.Logout();
    }

}
