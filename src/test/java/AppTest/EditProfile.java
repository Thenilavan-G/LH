package AppTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

public class EditProfile extends AppTestBase {

    @Test(priority = 1)
    public void MobileNumber_Signup() throws InterruptedException, IOException {
        MobileNumberSignupPageObjects mobileObj = new MobileNumberSignupPageObjects(driver);

        mobileObj.verifyPopup();
        mobileObj.verifyMobileNumber("4800000000");
    }

    @Test(priority = 2)
    public void OTP_Page() throws InterruptedException, IOException {
        OtpPageObjects otpObj = new OtpPageObjects(driver);

        otpObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        Thread.sleep(10000);
        otpObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test(priority = 3)
    public void Profile_Edit() throws InterruptedException, IOException {
        ProfileSettingsPageObjects menuObj = new ProfileSettingsPageObjects(driver);

        menuObj.setMenubar();
        menuObj.setEdit();
        menuObj.verifyInfo("Profile Settings", "Basic Information", "Mobile", "Email", "Address", "Medical Information", "Height", "Weight", "Blood Group");
        menuObj.setEdit2();
        menuObj.setGallery();

        ProfileSettingsPageObjects BIObj = new ProfileSettingsPageObjects(driver);

        BIObj.editFirstname("Robert");
        BIObj.editLastname("Joseph");
        BIObj.editGender();
        BIObj.editFemale();
        BIObj.editDob("12121998");
        BIObj.editEmail("robert@gmail.com");
        BIObj.editClickAddress();
        BIObj.editNewprofilelocation();
        BIObj.editChange();
        BIObj.editAddress(dataList.get(17));
        BIObj.editEnteraddress();
        BIObj.editLandmark(dataList.get(18));
        BIObj.editSaveaddress();

        ProfileSettingsPageObjects MIObj = new ProfileSettingsPageObjects(driver);

        MIObj.editMedicalinfo();
        MIObj.editHeight();
        MIObj.editWeight("411");
        MIObj.editBloodgroup();
        MIObj.editBloodgroupselection();
        MIObj.editTickmark();
    }

    @Test(priority = 4)
    public void Logout() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.Logout();
    }

}
