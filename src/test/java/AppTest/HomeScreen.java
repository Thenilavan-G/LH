package AppTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class HomeScreen extends AppTestBase {

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
    public void MobileNumber_Signup() throws InterruptedException, IOException {
        MobileNumberSignupPageObjects mobileObj = new MobileNumberSignupPageObjects(driver);

        mobileObj.verifyPopup();
        mobileObj.setMobileNumber("'1111111111");
        mobileObj.clickSignup();
        mobileObj.verifyPopupUi("NUMBER CONFIRMATION: \n" + "+91 (111) 111-1111", "Is your mobile number \n" + "above Correct?", "Edit", "Yes");
        mobileObj.validateMobileField();
        mobileObj.verifyMobileNumber("4800000000");
    }

    @Test(priority = 3)
    public void OTP_Page_UI() throws InterruptedException, IOException {
        OtpUiPageObjects otpObj = new OtpUiPageObjects(driver);

        otpObj.verifyHeader("Waiting to automatically detect and \n" + "send sms to+11111111118");
        otpObj.verifyMobileNumberField("Enter 6 digit sms verification code", "Didn't receive the code? Resend code");
        otpObj.verifyButton("Verify");
    }

    @Test(priority = 4)
    public void OTP_Page() throws InterruptedException, IOException {
        OtpPageObjects otpObj = new OtpPageObjects(driver);

        otpObj.setWithOutOTP();
        otpObj.setInvalidOTP(dataList.get(2), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        otpObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        otpObj.clickResendOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        otpObj.clickVerify();
        Thread.sleep(10000);
        otpObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test(priority = 5)
    public void Home_Screen_UI() throws InterruptedException, IOException {
        HomeScreenUIPageObjects HomeUIObj = new HomeScreenUIPageObjects(driver);

        HomeUIObj.setHomeScreenLogo();
        HomeUIObj.setHomepageDescription("Now abide these, faith, hope & love but the greatest of these is Love.\n" + "  1 Cor 13:13");
        HomeUIObj.setCalendar();
        HomeUIObj.setClock();
        HomeUIObj.setWeather();
        HomeUIObj.setText("What are you looking for?");
        HomeUIObj.setQuickHealthTestLogo();
        HomeUIObj.setQuickHealthTestText("Quick Health Test");
        HomeUIObj.setBookATestLogo();
        HomeUIObj.setBookATestText("Book a Test");
        HomeUIObj.setLabResultsLogo();
        HomeUIObj.setLabResultsText("Lab Results");
        HomeUIObj.setVitalsLogo();
        HomeUIObj.setVitalsText("Vitals");
        HomeUIObj.setBannerSlider();
    }

    @Test(priority = 6)
    public void Logout() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.Logout();
    }

}
