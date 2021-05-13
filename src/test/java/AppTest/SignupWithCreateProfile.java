package AppTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)

public class SignupWithCreateProfile extends AppTestBase {

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
    public void Profile_Settings() throws InterruptedException, IOException {
        ProfileSettingsPageObjects PSObj = new ProfileSettingsPageObjects(driver);

        PSObj.setImage();
        PSObj.setAllow();
        PSObj.setAllow1();
        PSObj.setCamera();
        PSObj.setCameraclick();
        PSObj.setOk();

        ProfileSettingsPageObjects BIObj = new ProfileSettingsPageObjects(driver);

        BIObj.setFirstname(dataList.get(13));
        BIObj.setLastname(dataList.get(14));
        BIObj.setGender();
        BIObj.setFemale();
        BIObj.setDob(dataList.get(15));
        BIObj.setEmail(dataList.get(16));
        BIObj.setAddress();
        BIObj.setNewprofilelocation();
        BIObj.setChange();
        BIObj.setEditaddress(dataList.get(17));
        BIObj.setEnteraddress();
        BIObj.setLandmark(dataList.get(18));
        BIObj.setSaveaddress();

        ProfileSettingsPageObjects MIObj = new ProfileSettingsPageObjects(driver);

        MIObj.setMedicalinfo();
        MIObj.setHeight();
        MIObj.setWeight(dataList.get(19));
        MIObj.setBloodgroup();
        MIObj.setBloodgroupselection();
        MIObj.setTickmark();
        MIObj.allow_location();
    }

    @Test(priority = 6)
    public void Logout() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.Logout();
    }

}
