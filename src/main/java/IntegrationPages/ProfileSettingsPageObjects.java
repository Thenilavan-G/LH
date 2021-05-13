package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

import static IntegrationPages.TestBaseApp.*;

public class ProfileSettingsPageObjects {
    public AppiumDriver<MobileElement> driver;

    public ProfileSettingsPageObjects(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    // location & profile settings screen
    //By location = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");

    By menubar = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    By menu_name = By.id("com.lifehope:id/textview_header_name");
    By menu_phone = By.id("com.lifehope:id/textView_header_mobile");
    By edit = By.id("com.lifehope:id/edit");
    By edit2 = By.id("com.lifehope:id/viewProfile");
    By image = By.id("com.lifehope:id/imageview_select_image");
    By allow = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By allow1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    //By allow1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    By camera = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
    //By camera = By.id("com.lifehope:id/camera_pic");
    By cameraclick = By.id("com.sec.android.app.camera:id/shutter_button");
    //By cameraclick = By.xpath("(//GLButton[@content-desc=\"NONE\"])[2]");
    By ok = By.id("com.sec.android.app.camera:id/done_button");
    By crop_ok = By.id("com.lifehope:id/menu_crop");
    // By camera1 = By.id("com.lifehope:id/camera_pic");
   /* By gallery = By.id("com.lifehope:id/gallery_pic");
    By galleryclick = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView");
    //By galleryclick = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView\n");
    By downloads = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView");
    By downloadimage1 = By.xpath("(//android.widget.FrameLayout[@content-desc=\"Button\"])[1]/android.widget.ImageView");*/
    By firstname = By.id("com.lifehope:id/edittext_name");
    By lastname = By.id("com.lifehope:id/edittext_lastname");
    By gender = By.id("android:id/text1");
    By female = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
    By dob = By.id("com.lifehope:id/edittext_dob");
    /* By year = By.id("android:id/date_picker_header_year");
     By yearselect = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[1]");
     By month = By.xpath("//android.view.View[@content-desc=\"13 December 1995\"]");
     By ok1 = By.id("android:id/button1");*/
    //By email = By.id("com.lifehope:id/edittext_email");
    By email = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText\n");
    //By mobilenumber = By.id("com.lifehope:id/edittext_mobile");
    //By confirmmobilenumber = By.id("com.lifehope:id/imageview_otp_verification");
    //By proceed = By.id("com.lifehope:id/button_proceed");
    //By enter_otp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView\n");
    //By verify_btn = By.id("com.lifehope:id/buttonVerify");
    //UI page objects
    //By header = By.id("com.lifehope:id/textview_profileSetting\n");
    By address = By.id("com.lifehope:id/edittext_address");
    By newprofilelocation = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By change = By.id("com.lifehope:id/textview_change_location");
    By change_loc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]\n");
    By editaddress = By.id("com.lifehope:id/places_autocomplete_edit_text");
    By enteraddress = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]");
    By landmark = By.id("com.lifehope:id/edittext_land_mark");
    By saveaddress = By.id("com.lifehope:id/button_address");
    By medicalinfo = By.id("com.lifehope:id/textview_select_Medical_info");
    By height = By.id("com.lifehope:id/edittext_height_feet");
    By h_done = By.id("com.lifehope:id/buttonProceed");
    By weight = By.id("com.lifehope:id/edittext_weight");
    By bloodgroup = By.id("android:id/text1");
    By bloodgroupselection = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[8]");
    By tickmark = By.id("com.lifehope:id/textViewDone");
    By allow_location = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By edit_header = By.id("com.lifehope:id/textview_profileSetting");
    //By edit_back = By.id("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    By edit_pro_image = By.id("com.lifehope:id/profile_image");
    By edit_user_name = By.id("com.lifehope:id/textview_user_name");
    By edit_user_age = By.id("com.lifehope:id/textview_user_age");
    By edit_bi_title = By.id("com.lifehope:id/textview_basic_info_label");
    By edit_bi_mobile_text = By.id("com.lifehope:id/textview_mobile_info_label");
    By edit_bi_mobile = By.id("com.lifehope:id/textview_mobile_info");
    By edit_bi_email_text = By.id("com.lifehope:id/textview_email_info_label");
    By edit_bi_email = By.id("com.lifehope:id/textview_email_info");
    By edit_bi_address_text = By.id("com.lifehope:id/textview_address_info_label");
    By edit_bi_address = By.id("com.lifehope:id/textview_address_info");
    By edit_mi_title = By.id("com.lifehope:id/textview_medical_info_label");
    By edit_bi_height_text = By.id("com.lifehope:id/textview_height_info_label");
    By edit_bi_height = By.id("com.lifehope:id/textview_height_info");
    By edit_bi_weight_text = By.id("com.lifehope:id/textview_weight_info_label");
    By edit_bi_weight = By.id("com.lifehope:id/textview_weight_info");
    By edit_bi_blood_text = By.id("com.lifehope:id/textview_blood_info_label");
    By edit_bi_blood = By.id("com.lifehope:id/textview_blood_info");
    By edit_camera_icon = By.id("com.lifehope:id/imageview_select_image");
    By edit_allow_per = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By edit_gal_pic = By.id("com.lifehope:id/gallery_pic");
    By edit_gal_sel_image = By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout[1]\n");
    By edit_gal_crop_done = By.id("com.lifehope:id/menu_crop");
    //By edit_update = By.id("com.lifehope:id/textViewDone");

    By loc_message = By.id("com.android.permissioncontroller:id/permission_message");
    By allow_loc = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By deny_loc = By.id("com.android.permissioncontroller:id/permission_deny_button");

    public void setGallery() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to update the image from the Gallery");
        Thread.sleep(2000);
        try {
            driver.findElement(edit_camera_icon).click();
            Thread.sleep(2000);
            try {
                if (driver.findElement(edit_allow_per).isDisplayed()) {
                    driver.findElement(edit_allow_per).click();
                    Thread.sleep(2000);
                    driver.findElement(edit_allow_per).click();
                    test20.log(LogStatus.INFO, "Allow permission selected");
                } else {
                    test20.log(LogStatus.INFO, "Allow permission not visible");
                }
            } catch (NoSuchElementException e) {
                test20.log(LogStatus.INFO, "Allow permission not visible");
            }
            Thread.sleep(2000);
            driver.findElement(edit_gal_pic).click();
            Thread.sleep(5000);
            driver.findElement(edit_gal_sel_image).click();
            Thread.sleep(2000);
            driver.findElement(edit_gal_crop_done).click();
            Thread.sleep(2000);
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.WARNING, "Camera edit icon not visible");
            getScreenshot("Edit_CamIcon");
        }
    }

    public void verifyInfo(String H, String BI, String BIM, String BIE, String BIA, String MI, String MIH, String MIW, String MIB) throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to verify the Profile Info");
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_header).getText();
            if (tit.equals("null")) {
                test20.log(LogStatus.FAIL, "Edit page header name not shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.PASS, "Edit page header name shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page header name not visible");
            getScreenshot("Edit_header");
        }
        Thread.sleep(2000);
        try {
            if (driver.findElement(edit_pro_image).isDisplayed()) {
                test20.log(LogStatus.PASS, "Profile Image Displayed");
            } else {
                test20.log(LogStatus.FAIL, "Profile Image not Displayed");
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Profile Image not visible");
            getScreenshot("Edit_ProImage");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_user_name).getText();
            if (tit.contains("null")) {
                test20.log(LogStatus.FAIL, "Edit page user name not shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.PASS, "Edit page user name shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page user name not visible");
            getScreenshot("Edit_UserName");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_user_age).getText();
            if (tit.contains("null")) {
                test20.log(LogStatus.FAIL, "Edit page user age not shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.PASS, "Edit page user age shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page age name not visible");
            getScreenshot("Edit_UserAge");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_title).getText();
            if (tit.contains(BI)) {
                test20.log(LogStatus.PASS, "Edit page basic info text shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.FAIL, "Edit page basic info text not shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info text name not visible");
            getScreenshot("Edit_BI");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_mobile_text).getText();
            if (tit.contains(BIM)) {
                test20.log(LogStatus.PASS, "Edit page basic info mobile text shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.FAIL, "Edit page basic info mobile text not shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info mobile text not visible");
            getScreenshot("Edit_BI_Mob");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_mobile).getText();
            if (tit.contains("null")) {
                test20.log(LogStatus.FAIL, "Edit page basic info mobile number not shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.PASS, "Edit page basic info mobile number shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info mobile number not visible");
            getScreenshot("Edit_BI_MobNum");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_email_text).getText();
            if (tit.contains(BIE)) {
                test20.log(LogStatus.PASS, "Edit page basic info email text shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.FAIL, "Edit page basic info email text not shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info email text not visible");
            getScreenshot("Edit_BI_Email");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_email).getText();
            if (tit.contains("null")) {
                test20.log(LogStatus.FAIL, "Edit page basic info email not shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.PASS, "Edit page basic info email shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info email not visible");
            getScreenshot("Edit_BI_EmailId");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_address_text).getText();
            if (tit.contains(BIA)) {
                test20.log(LogStatus.PASS, "Edit page basic info address text shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.FAIL, "Edit page basic info address text not shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info address text not visible");
            getScreenshot("Edit_BI_Add");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_address).getText();
            if (tit.contains("null")) {
                test20.log(LogStatus.FAIL, "Edit page basic info address not shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.PASS, "Edit page basic info address shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info address not visible");
            getScreenshot("Edit_BI_Address");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_mi_title).getText();
            if (tit.contains(MI)) {
                test20.log(LogStatus.PASS, "Edit page medical info text shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.FAIL, "Edit page medical info text not shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page medical info text name not visible");
            getScreenshot("Edit_MI");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_height_text).getText();
            if (tit.contains(MIH)) {
                test20.log(LogStatus.PASS, "Edit page medical info height text shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.FAIL, "Edit page medical info height text not shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info height text not visible");
            getScreenshot("Edit_MI_H");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_height).getText();
            if (tit.contains("null")) {
                test20.log(LogStatus.FAIL, "Edit page medical info height not shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.PASS, "Edit page medical info height shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info height not visible");
            getScreenshot("Edit_MI_HV");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_weight_text).getText();
            if (tit.contains(MIW)) {
                test20.log(LogStatus.PASS, "Edit page medical info weight text shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.FAIL, "Edit page medical info weight text not shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info weight text not visible");
            getScreenshot("Edit_MI_W");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_weight).getText();
            if (tit.contains("null")) {
                test20.log(LogStatus.FAIL, "Edit page medical info weight not shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.PASS, "Edit page medical info weight shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info weight not visible");
            getScreenshot("Edit_MI_WV");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_blood_text).getText();
            if (tit.contains(MIB)) {
                test20.log(LogStatus.PASS, "Edit page medical info blood group text shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.FAIL, "Edit page medical info blood group text not shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info blood group text not visible");
            getScreenshot("Edit_MI_B");
        }
        Thread.sleep(2000);
        try {
            String tit = driver.findElement(edit_bi_blood).getText();
            if (tit.contains("null")) {
                test20.log(LogStatus.FAIL, "Edit page medical info blood group not shown as per the requirement : " + tit);
            } else {
                test20.log(LogStatus.PASS, "Edit page medical info blood group shown as per the requirement : " + tit);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit page basic info blood group not visible");
            getScreenshot("Edit_MI_BG");
        }

    }

//    public void setLocation() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(15000);
//            driver.findElement(location).click();
//        } catch (NoSuchElementException e) {
//            test20.log(LogStatus.FAIL, "Location field not visible");
//            test11.log(LogStatus.FAIL, "Location field not visible");
//            getScreenshot("P_Loc");
//        }
//    }

    public void setMenubar() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the Menu icon");
        try {
            Thread.sleep(5000);
            driver.findElement(menubar).click();
            test20.log(LogStatus.PASS, "Menu bar clicked");
            Thread.sleep(2000);
            String uN = driver.findElement(menu_name).getText();
            if(uN.equals("null")) {
                test20.log(LogStatus.FAIL, "Menu bar - Profile name not shown : " + uN);
                getScreenshot("Menu_Name");
            } else {
                test20.log(LogStatus.PASS, "Menu bar - Profile name is : " + uN);
            }
            Thread.sleep(2000);
            String uP = driver.findElement(menu_phone).getText();
            if(uN.equals("null")) {
                test20.log(LogStatus.FAIL, "Menu bar - User Phone number not shown : " + uP);
                getScreenshot("Menu_Phone");
            } else {
                test20.log(LogStatus.PASS, "Menu bar - User Phone number is : " + uP);
            }
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Menu bar not visible");
            getScreenshot("P_Menu");
        }
    }

    public void setEdit() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the Edit button");
        try {
            Thread.sleep(5000);
            driver.findElement(edit).click();
            test20.log(LogStatus.PASS, "Edit icon clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit icon not visible");
            getScreenshot("P_EditIcon");
        }
    }

    public void setEdit2() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the profile settings edit button");
        try {
            Thread.sleep(5000);
            driver.findElement(edit2).click();
            test20.log(LogStatus.PASS, "Edit icon clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Edit 2 icon not visible");
            getScreenshot("P_EditIcon2");
        }
    }

    public void setImage() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the Image edit icon");
        try {
            Thread.sleep(5000);
            driver.findElement(image).click();
            //test20.log(LogStatus.PASS, "Edit image icon clicked");
            test11.log(LogStatus.PASS, "Edit image icon clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Edit image icon not visible");
            test11.log(LogStatus.FAIL, "Edit image icon not visible");
            getScreenshot("P_EditImgIcon");
        }
    }

    public void setAllow() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the Allow location");
        try {
            Thread.sleep(2000);
            driver.findElement(allow).click();
            //test20.log(LogStatus.PASS, "Allow clicked");
            test11.log(LogStatus.PASS, "Allow clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.SKIP, "Allow not visible");
            test11.log(LogStatus.SKIP, "Allow not visible");
            getScreenshot("P_Allow");
        }
    }

    public void setAllow1() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the Allow location");
        try {
            Thread.sleep(2000);
            driver.findElement(allow1).click();
            //test20.log(LogStatus.PASS, "Allow clicked");
            test11.log(LogStatus.PASS, "Allow clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.SKIP, "Allow 1 not visible");
            test11.log(LogStatus.SKIP, "Allow 1 not visible");
            getScreenshot("P_Allow1");
        }
    }

    public void setCamera() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the Camera edit icon");
        try {
            Thread.sleep(5000);
            driver.findElement(camera).click();
            //test20.log(LogStatus.PASS, "Camera edit icon clicked");
            test11.log(LogStatus.PASS, "Camera edit icon clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Camera edit icon not visible");
            test11.log(LogStatus.FAIL, "Camera edit icon not visible");
            getScreenshot("P_CamIcon");
        }
    }

    public void setCameraclick() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to select the Camera options");
        try {
            Thread.sleep(3000);
            driver.findElement(cameraclick).click();
            //test20.log(LogStatus.PASS, "Camera option selected");
            test11.log(LogStatus.PASS, "Camera option selected");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Camera option not visible");
            test11.log(LogStatus.FAIL, "Camera option not visible");
            getScreenshot("P_CamClickIcon");
        }
    }

    public void setOk() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the OK button");
        try {
            Thread.sleep(5000);
            driver.findElement(ok).click();
            Thread.sleep(5000);
            driver.findElement(crop_ok).click();
            //test20.log(LogStatus.PASS, "Camera OK button clicked");
            test11.log(LogStatus.PASS, "Camera OK button clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Camera OK button not visible");
            test11.log(LogStatus.FAIL, "Camera OK button not visible");
            getScreenshot("P_CamOK");
        }
    }

//    public void setCamera1() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(5000);
//            //driver.findElement(camera1).click();
//            driver.findElement(image).click();
//        } catch (NoSuchElementException e) {
//            test20.log(LogStatus.FAIL, "Camera 1 icon not visible");
//            test11.log(LogStatus.FAIL, "Camera 1 icon not visible");
//            getScreenshot("P_CamIcon1");
//        }
//    }

    public void setFirstname(String fname) throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the First Name");
        try {
            Thread.sleep(15000);
            driver.findElement(firstname).clear();
            Thread.sleep(2000);
            driver.findElement(firstname).sendKeys(fname);
            //test20.log(LogStatus.PASS, "First Name value passed");
            test11.log(LogStatus.PASS, "First Name value passed");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "First Name field not visible");
            test11.log(LogStatus.FAIL, "First Name field not visible");
            getScreenshot("P_FNField");
        }
    }

    public void setLastname(String lname) throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to enter the Last Name");
        try {
            Thread.sleep(2000);
            driver.findElement(lastname).clear();
            Thread.sleep(2000);
            driver.findElement(lastname).sendKeys(lname);
            Thread.sleep(2000);
            driver.navigate().back();
            //test20.log(LogStatus.PASS, "Last Name value passed");
            test11.log(LogStatus.PASS, "Last Name value passed");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Last Name field not visible");
            test11.log(LogStatus.FAIL, "Last Name field not visible");
            getScreenshot("P_LNField");
        }
    }

    public void setGender() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the Gender field");
        try {
            Thread.sleep(2000);
            driver.findElement(gender).click();
            //test20.log(LogStatus.PASS, "Gender field clicked");
            test11.log(LogStatus.PASS, "Gender field clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Gender field not visible");
            test11.log(LogStatus.FAIL, "Gender field not visible");
            getScreenshot("P_GField");
        }
    }

    public void setFemale() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to select the gender option");
        try {
            Thread.sleep(2000);
            driver.findElement(female).click();
            //test20.log(LogStatus.PASS, "Gender - female option selected");
            test11.log(LogStatus.PASS, "Gender - female option selected");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Gender select option not visible");
            test11.log(LogStatus.FAIL, "Gender select option not visible");
            getScreenshot("P_GOption");
        }
    }

    public void setDob(String DOB) throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to enter the DOB value");
        try {
            Thread.sleep(2000);
            driver.findElement(dob).sendKeys(DOB);
            Thread.sleep(2000);
            driver.hideKeyboard();
            //driver.navigate().back();
            //test20.log(LogStatus.PASS, "DOB field clicked");
            test11.log(LogStatus.PASS, "DOB field clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "DOB field not visible");
            test11.log(LogStatus.FAIL, "DOB field not visible");
            getScreenshot("P_DOBField");
        }
    }

    /*public void setYear() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(year).click();
    }

    public void setYearselect() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(yearselect).click();
    }

    public void setOk1() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(ok1).click();
    }

    public void setMonth() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(month).click();
    }*/

    public void setEmail(String Email) throws InterruptedException {
        test11.log(LogStatus.INFO, "Ready to enter the email id");
        try {
            Thread.sleep(3000);
            driver.findElement(email).click();
//            Thread.sleep(2000);
//            driver.findElement(email).clear();
            Thread.sleep(2000);
            driver.findElement(email).sendKeys(Email);
            Thread.sleep(500);
            driver.navigate().back();
            test11.log(LogStatus.PASS, "Email id passed");
            //test20.log(LogStatus.PASS, "Email id passed");
        } catch (NoSuchElementException e) {
            //System.out.println("Email Element not visible");
            test11.log(LogStatus.SKIP, "Email field not visible");
            //test20.log(LogStatus.SKIP, "Email field not visible");
        }
    }

//    public void setMobilenumber(String mobile) throws InterruptedException, IOException {
//        try {
//            Thread.sleep(15000);
//            driver.findElement(mobilenumber).clear();
//            Thread.sleep(15000);
//            driver.findElement(mobilenumber).sendKeys(mobile);
//        } catch (NoSuchElementException e) {
//            test20.log(LogStatus.FAIL, "Mobile field not visible");
//            test11.log(LogStatus.FAIL, "Mobile field not visible");
//            getScreenshot("P_MobField");
//        }
//    }

//    public void setConfirmmobilenumber() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(10000);
//            driver.findElement(confirmmobilenumber).click();
//        } catch (NoSuchElementException e) {
//            test20.log(LogStatus.FAIL, "Confirmation screen not visible");
//            test11.log(LogStatus.FAIL, "Confirmation screen not visible");
//            getScreenshot("P_MobConf");
//        }
//    }

//    public void setProceed() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(10000);
//            driver.findElement(proceed).click();
//        } catch (NoSuchElementException e) {
//            test20.log(LogStatus.FAIL, "Proceed button not visible");
//            test11.log(LogStatus.FAIL, "Proceed button not visible");
//            getScreenshot("P_ProBut");
//        }
//    }

//    public void setOTP(String First, String Second, String Third, String Fourth, String Fifth, String Sixth) throws InterruptedException, IOException {
//        try {
//            Thread.sleep(5000);
//            driver.findElement(enter_otp).sendKeys(First, Second, Third, Fourth, Fifth, Sixth);
//        } catch (NoSuchElementException e) {
//            test20.log(LogStatus.FAIL, "OTP field not visible");
//            test11.log(LogStatus.FAIL, "OTP field not visible");
//            getScreenshot("P_OTPField");
//        }
//    }

//    public void clickVerify() throws InterruptedException {
//        try {
//            Thread.sleep(5000);
//            driver.findElement(verify_btn).click();
//        } catch (NoSuchElementException e) {
//            test20.log(LogStatus.SKIP, "OTP is valid");
//            test11.log(LogStatus.SKIP, "OTP is valid");
//        }
//    }

    public void setAddress() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the address field");
        try {
            Thread.sleep(5000);
            driver.findElement(address).click();
            //test20.log(LogStatus.PASS, "Address field selected");
            test11.log(LogStatus.PASS, "Address field selected");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Address field not visible");
            test11.log(LogStatus.FAIL, "Address field not visible");
            getScreenshot("P_AddField");
        }
    }

    public void confirmLocation(String L, String P) throws InterruptedException, IOException {
        test9.log(LogStatus.INFO, "Ready to configure the Location");
        try {
            Thread.sleep(5000);
            String loc = driver.findElement(loc_message).getText();
            if (loc.contains(L)) {
                test11.log(LogStatus.PASS, "Location text showing as per the requirement");
            } else {
                test11.log(LogStatus.FAIL, "Location text not showing as per the requirement");
                getScreenshot("Gmail_Location");
            }
            if (P.contains("Allow")) {
                Thread.sleep(2000);
                driver.findElement(allow_loc).click();
            } else {
                Thread.sleep(2000);
                driver.findElement(deny_loc).click();
            }
        } catch (NoSuchElementException e) {
            test11.log(LogStatus.FAIL, "Location permission Screen not visible");
            getScreenshot("Gmail_LocPer");
        }
    }

    public void setNewprofilelocation() throws InterruptedException {
        test11.log(LogStatus.INFO, "Ready to click the Allow location");
        Thread.sleep(5000);
        try {
            driver.findElement(newprofilelocation).click();
            //test20.log(LogStatus.PASS, "Location clicked");
            test11.log(LogStatus.PASS, "Location clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.SKIP, "Location field not visible");
            test11.log(LogStatus.SKIP, "Location field not visible");
        }
    }

    public void setChange() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the Change address button");
        try {
            Thread.sleep(5000);
            driver.findElement(change).click();
            Thread.sleep(3000);
            //test20.log(LogStatus.PASS, "Change button clicked");
            test11.log(LogStatus.PASS, "Change button clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Change button not visible");
            test11.log(LogStatus.FAIL, "Change button not visible");
            getScreenshot("P_CButton");
        }
    }

    public void setEditaddress(String adrs) throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to enter the address in the search field");
        try {
            Thread.sleep(3000);
            driver.findElement(editaddress).sendKeys(adrs);
            //test20.log(LogStatus.PASS, "Search field clicked");
            test11.log(LogStatus.PASS, "Search field clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Search field not visible");
            test11.log(LogStatus.FAIL, "Search field not visible");
            getScreenshot("P_SearchField");
        }
    }

    public void setEnteraddress() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to select the address from the list");
        try {
            Thread.sleep(3000);
            driver.findElement(enteraddress).click();
            //test20.log(LogStatus.PASS, "Entered the address");
            test11.log(LogStatus.PASS, "Entered the address");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Can't able enter the address");
            test11.log(LogStatus.FAIL, "Can't able enter the address");
            getScreenshot("P_AField");
        }
    }

    public void setLandmark(String land) throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to enter the landmark");
        try {
            Thread.sleep(2000);
            driver.findElement(landmark).sendKeys(land);
            //test20.log(LogStatus.PASS, "landmark field clicked");
            test11.log(LogStatus.PASS, "landmark field clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "landmark field not visible");
            test11.log(LogStatus.FAIL, "landmark field not visible");
            getScreenshot("P_LandField");
        }
    }

    public void setSaveaddress() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the save address button");
        try {
//        Thread.sleep(1000);
//        driver.navigate().back();
            Thread.sleep(1000);
            driver.hideKeyboard();
            Thread.sleep(3000);
            driver.findElement(saveaddress).click();
            //test20.log(LogStatus.PASS, "Address save button clicked");
            test11.log(LogStatus.PASS, "Address save button clicked");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Address save button not visible");
            test11.log(LogStatus.FAIL, "Address save button not visible");
            getScreenshot("P_AddSaveBut");
        }
    }

    public void setMedicalinfo() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the on Medical Info section");
        Thread.sleep(2000);
        try {
            driver.findElement(medicalinfo).click();
            Thread.sleep(2000);
            //System.out.println("Medical info page is showing as per the requirement");
            test11.log(LogStatus.PASS, "Medical info page is showing as per the requirement");
            //test20.log(LogStatus.PASS, "Medical info page is showing as per the requirement");
        } catch (NoSuchElementException e) {
            //System.out.println("Medical info page is not showing as per the requirement");
            test11.log(LogStatus.FAIL, "Medical info page is not showing as per the requirement");
            //test20.log(LogStatus.FAIL, "Medical info page is not showing as per the requirement");
            getScreenshot("Pro_Med");
        }
    }

    public void setHeight() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to select the height option");
        try {
            Thread.sleep(5000);
            driver.findElement(height).click();
            Thread.sleep(2000);
            driver.findElement(h_done).click();
            //test20.log(LogStatus.PASS, "Height field selected");
            test11.log(LogStatus.PASS, "Height field selected");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Height field not visible");
            test11.log(LogStatus.FAIL, "Height field not visible");
            getScreenshot("P_HField");
        }
    }

    public void setWeight(String wt) throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to enter the weight");
        try {
            Thread.sleep(2000);
            driver.findElement(weight).sendKeys(wt);
            //test20.log(LogStatus.PASS, "Weight field selected");
            test11.log(LogStatus.PASS, "Weight field selected");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Weight field not visible");
            test11.log(LogStatus.FAIL, "Weight field not visible");
            getScreenshot("P_WField");
        }
    }

    public void setBloodgroup() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the Blood group field");
        try {
            Thread.sleep(2000);
            driver.findElement(bloodgroup).click();
            //test20.log(LogStatus.PASS, "Blood Group field selected");
            test11.log(LogStatus.PASS, "Blood Group field selected");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Blood Group field not visible");
            test11.log(LogStatus.FAIL, "Blood Group field not visible");
            getScreenshot("P_BGField");
        }
    }

    public void setBloodgroupselection() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to select the Blood group option");
        try {
            Thread.sleep(3000);
            driver.findElement(bloodgroupselection).click();
            //test20.log(LogStatus.FAIL, "Bloog group selected");
            test11.log(LogStatus.PASS, "Bloog group selected");
        } catch (NoSuchElementException e) {
            //test20.log(LogStatus.FAIL, "Bloog group selection list not visible");
            test11.log(LogStatus.FAIL, "Bloog group selection list not visible");
            getScreenshot("P_BGList");
        }
    }

    public void setTickmark() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to click the save button");
        try {
            Thread.sleep(5000);
            driver.findElement(tickmark).click();
            test11.log(LogStatus.PASS, "Save button clicked");
            //test20.log(LogStatus.PASS, "Save button clicked");
        } catch (NoSuchElementException e) {
            test11.log(LogStatus.FAIL, "Save button not visible");
            //test20.log(LogStatus.FAIL, "Save button not visible");
            getScreenshot("P_PSave");
        }
    }

    public void allowLocation() throws InterruptedException, IOException {
        test11.log(LogStatus.INFO, "Ready to allow the location permission");
        try {
            Thread.sleep(5000);
            driver.findElement(allow_location).click();
            test11.log(LogStatus.INFO, "Location Permission selected");
            //test20.log(LogStatus.INFO, "Location Permission selected");
        } catch (NoSuchElementException e) {
            test11.log(LogStatus.SKIP, "Location Permission not visible");
            //test20.log(LogStatus.SKIP, "Location Permission not visible");
            getScreenshot("P_LocPer");
        }
    }

//    public void setHeader() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(2000);
//            //System.out.println(Header);
//            if (driver.findElement(header).isDisplayed()) {
//                Thread.sleep(2000);
//                //System.out.println("Header text showing as per the requirement");
//                test11.log(LogStatus.PASS, "Header text showing as per the requirement");
//                test20.log(LogStatus.PASS, "Header text showing as per the requirement");
//            } else {
//                //System.out.println("Header text not showing as per the requirement");
//                test11.log(LogStatus.FAIL, "Header text not showing as per the requirement");
//                test20.log(LogStatus.FAIL, "Header text not showing as per the requirement");
//            }
//        } catch (NoSuchElementException e) {
//            test11.log(LogStatus.FAIL, "Header text not visible");
//            test20.log(LogStatus.FAIL, "Header text not visible");
//            getScreenshot("P_PHeader");
//        }
//    }

    public void editFirstname(String fname) throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to enter the First Name");
        try {
            Thread.sleep(15000);
            driver.findElement(firstname).clear();
            Thread.sleep(2000);
            driver.findElement(firstname).sendKeys(fname);
            test20.log(LogStatus.PASS, "First Name value passed");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "First Name field not visible");
            getScreenshot("P_FNField");
        }
    }

    public void editLastname(String lname) throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to enter the Last Name");
        try {
            Thread.sleep(2000);
            driver.findElement(lastname).clear();
            Thread.sleep(2000);
            driver.findElement(lastname).sendKeys(lname);
            Thread.sleep(2000);
            driver.navigate().back();
            test20.log(LogStatus.PASS, "Last Name value passed");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Last Name field not visible");
            getScreenshot("P_LNField");
        }
    }

    public void editGender() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the Gender field");
        try {
            Thread.sleep(2000);
            driver.findElement(gender).click();
            test20.log(LogStatus.PASS, "Gender field clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Gender field not visible");
            getScreenshot("P_GField");
        }
    }

    public void editFemale() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to select the gender option");
        try {
            Thread.sleep(2000);
            driver.findElement(female).click();
            test20.log(LogStatus.PASS, "Gender - female option selected");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Gender select option not visible");
            getScreenshot("P_GOption");
        }
    }

    public void editDob(String DOB) throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to enter the DOB value");
        try {
            Thread.sleep(2000);
            driver.findElement(dob).sendKeys(DOB);
            Thread.sleep(2000);
            driver.hideKeyboard();
            //driver.navigate().back();
            test20.log(LogStatus.PASS, "DOB field clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "DOB field not visible");
            getScreenshot("P_DOBField");
        }
    }

    public void editEmail(String Email) throws InterruptedException {
        test20.log(LogStatus.INFO, "Ready to enter the email id");
        try {
            Thread.sleep(3000);
            driver.findElement(email).click();
//            Thread.sleep(2000);
//            driver.findElement(email).clear();
            Thread.sleep(2000);
            driver.findElement(email).sendKeys(Email);
            Thread.sleep(500);
            driver.navigate().back();
            test20.log(LogStatus.PASS, "Email id passed");
        } catch (NoSuchElementException e) {
            //System.out.println("Email Element not visible");
            test20.log(LogStatus.SKIP, "Email field not visible");
        }
    }

    public void editClickAddress() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the address field");
        try {
            Thread.sleep(5000);
            driver.findElement(address).click();
            test20.log(LogStatus.PASS, "Address field selected");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Address field not visible");
            getScreenshot("P_AddField");
        }
    }

    public void editNewprofilelocation() throws InterruptedException {
        test20.log(LogStatus.INFO, "Ready to click the Allow option");
        try {
            Thread.sleep(5000);
            driver.findElement(newprofilelocation).click();
            test20.log(LogStatus.PASS, "Location clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.SKIP, "Location field not visible");
        }
    }

    public void editChange() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the Change address button");
        try {
            Thread.sleep(5000);
            if(driver.findElement(change).isDisplayed()) {
                Thread.sleep(2000);
                driver.findElement(change).click();
            } else {
                driver.findElement(change_loc).click();
            }
            test20.log(LogStatus.PASS, "Change button clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Change button not visible");
            getScreenshot("P_CButton");
        }
    }

    public void editAddress(String adrs) throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to enter the address in the search field");
        try {
            Thread.sleep(5000);
            driver.findElement(editaddress).sendKeys(adrs);
            test20.log(LogStatus.PASS, "Search field clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Search field not visible");
            getScreenshot("P_SearchField");
        }
    }

    public void editEnteraddress() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to select the address from the list");
        try {
            Thread.sleep(3000);
            driver.findElement(enteraddress).click();
            test20.log(LogStatus.PASS, "Entered the address");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Can't able enter the address");
            getScreenshot("P_AField");
        }
    }

    public void editLandmark(String land) throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the landmark field");
        try {
            Thread.sleep(2000);
            driver.findElement(landmark).sendKeys(land);
            test20.log(LogStatus.PASS, "landmark field clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "landmark field not visible");
            getScreenshot("P_LandField");
        }
    }

    public void editSaveaddress() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the Save button");
        try {
//        Thread.sleep(1000);
//        driver.navigate().back();
            Thread.sleep(1000);
            driver.hideKeyboard();
            Thread.sleep(5000);
            driver.findElement(saveaddress).click();
            test20.log(LogStatus.PASS, "Address save button clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Address save button not visible");
            getScreenshot("P_AddSaveBut");
            driver.navigate().back();
        }
    }

    public void editMedicalinfo() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the on Medical Info Section");
        Thread.sleep(2000);
        try {
            driver.findElement(medicalinfo).click();
            Thread.sleep(2000);
            test20.log(LogStatus.PASS, "Medical info page is showing as per the requirement");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Medical info page is not showing as per the requirement");
            getScreenshot("Pro_Med");
        }
    }

    public void editHeight() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the Height filed");
        try {
            Thread.sleep(5000);
            driver.findElement(height).click();
            Thread.sleep(2000);
            driver.findElement(h_done).click();
            test20.log(LogStatus.PASS, "Height field selected");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Height field not visible");
            getScreenshot("P_HField");
        }
    }

    public void editWeight(String wt) throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the Weight field");
        try {
            Thread.sleep(2000);
            driver.findElement(weight).sendKeys(wt);
            test20.log(LogStatus.PASS, "Weight field selected");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Weight field not visible");
            getScreenshot("P_WField");
        }
    }

    public void editBloodgroup() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the Blood group field");
        try {
            Thread.sleep(2000);
            driver.findElement(bloodgroup).click();
            test20.log(LogStatus.PASS, "Blood Group field selected");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Blood Group field not visible");
            getScreenshot("P_BGField");
        }
    }

    public void editBloodgroupselection() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the the Blood group field");
        try {
            Thread.sleep(3000);
            driver.findElement(bloodgroupselection).click();
            test20.log(LogStatus.PASS, "Blood group selected");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Blood group selection list not visible");
            getScreenshot("P_BGList");
        }
    }

    public void editTickmark() throws InterruptedException, IOException {
        test20.log(LogStatus.INFO, "Ready to click the Update button");
        try {
            Thread.sleep(5000);
            driver.findElement(tickmark).click();
            test20.log(LogStatus.PASS, "Save button clicked");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.FAIL, "Save button not visible");
            getScreenshot("P_PSave");
        }
    }

    public void editAllow_location() throws InterruptedException, IOException {
        try {
            Thread.sleep(5000);
            driver.findElement(allow_location).click();
            test20.log(LogStatus.INFO, "Location Permission selected");
        } catch (NoSuchElementException e) {
            test20.log(LogStatus.SKIP, "Location Permission not visible");
            getScreenshot("P_LocPer");
        }
    }

}

