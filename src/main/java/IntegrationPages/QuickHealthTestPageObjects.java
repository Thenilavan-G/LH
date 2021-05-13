package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static IntegrationPages.TestBaseApp.*;

public class QuickHealthTestPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By quick_test_text = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n");
    By quick_test_logo = By.xpath("(//android.widget.ImageView[@content-desc=\"LifeHope Health\"])[1]\n");
    By quick_test = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout\n");
    By quick_header = By.id("com.lifehope:id/textViewLabel");
    By quick_history_icon = By.id("com.lifehope:id/imageview_symptom");
    By back_home = By.id("com.lifehope:id/imageview_back_arrow");
    By self_diag_text = By.id("com.lifehope:id/textview_selfDiagnosis");
    By corona_text = By.id("com.lifehope:id/item_title");
    By corona_logo = By.id("com.lifehope:id/item_img");
    By corona_symp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout\n");
    By close_photo = By.id("com.lifehope:id/imageButtonClose");
    By photo_header = By.id("com.lifehope:id/textviewTakePhotoLabel");
    By take_photo_icon = By.id("com.lifehope:id/layout_TakePhoto");
    By photo_perm_text = By.id("com.android.permissioncontroller:id/permission_message");
    By allow = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By deny = By.id("com.android.permissioncontroller:id/permission_deny_button");
    By media_perm_text = By.id("com.android.permissioncontroller:id/permission_message");
    //By take_photo = By.id("com.hmdglobal.app.camera:id/shutter_button");
    By take_photo = By.id("com.sec.android.app.camera:id/shutter_button");
    //By done_photo = By.id("com.hmdglobal.app.camera:id/done_button");
    By done_photo = By.id("com.sec.android.app.camera:id/done_button");
    By crop_done = By.id("com.lifehope:id/menu_crop");
    By def_first_text = By.id("android:id/text1");
    By first_name = By.id("com.lifehope:id/edittext_name");
    By last_name = By.id("com.lifehope:id/edittext_lastname");
    By gender_name = By.id("com.lifehope:id/textview_gender_label");
    By select_gender = By.id("android:id/text1");
    By male = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]\n");
    By female = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]\n");
    By age_name = By.id("com.lifehope:id/edittext_age");
    By check_box = By.id("com.lifehope:id/checkBoxProfile");
    By first_text = By.id("com.lifehope:id/edittext_name");
    By last_text = By.id("com.lifehope:id/edittext_lastname");
    By age_text = By.id("com.lifehope:id/edittext_age");
    By gender_text = By.id("android:id/text1");
    By next_button = By.id("com.lifehope:id/buttonNext");
    By quest_header = By.id("com.lifehope:id/textview_title");
    By quest_text = By.id("com.lifehope:id/textViewLabel");
    By progress_bar = By.id("com.lifehope:id/layout_progress_holder");
    By total_ques = By.id("com.lifehope:id/txt_question_total");
    By desc = By.id("com.lifehope:id/textviewTestDescription");
    By ques_1 = By.id("com.lifehope:id/txt_question");
    By ques_1_logo = By.id("com.lifehope:id/imageViewSymptom");
    By great = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[1]/android.widget.TextView\n");
    By good = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[2]/android.widget.TextView\n");
    By poor = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[3]/android.widget.TextView\n");
    By sick = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[4]/android.widget.TextView\n");
    By yes = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[1]/android.widget.TextView\n");
    By no = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[2]/android.widget.TextView\n");
    By concerns_logo = By.id("com.lifehope:id/imageViewConcernsImage");
    By edit_concerns = By.id("com.lifehope:id/editTextConcerns");
    By skip = By.id("com.lifehope:id/button_skip");
    By submit = By.id("com.lifehope:id/button_submit");
    By diag_result_header = By.id("com.lifehope:id/textview_title");
    By symptom_title = By.id("com.lifehope:id/textview_test_details_label");
    By test_desc = By.id("com.lifehope:id/textview_test_description");
    By recom_test = By.id("com.lifehope:id/textview_test_recommended_label");
    By test_1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView\n");
    By test_2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView\n");
    By test_3 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView\n");
    By test_4 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView\n");
    By symp_sev_text = By.id("com.lifehope:id/textview_diagnosis_label");
    By sym_sev_progress_bar = By.id("com.lifehope:id/layout_progress_holder");
    By sym_sev_percentage = By.id("com.lifehope:id/textview_percentage");
    By sym_logo = By.id("com.lifehope:id/imageViewSuccess");
    By result_msg = By.id("com.lifehope:id/textview_result_message");
    By share_button = By.id("com.lifehope:id/button_share");
    By book_test_button = By.id("com.lifehope:id/button_book_test");
    //By share_copy = By.id("android:id/copy_button");
    By share_copy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout\n");
    //By copy_link = By.id("android:id/content_preview_text");
    By copy_link = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView\n");
    By back_page = By.id("android:id/contentPanel");
    By back_QuickTest = By.id("com.lifehope:id/imageview_close");
    By diag_history_header = By.id("com.lifehope:id/textViewLabel");
    By corona_diag_logo = By.id("com.lifehope:id/imageViewVitalImage");
    By corona_diag_name = By.id("com.lifehope:id/textViewVitalsName");
    By corona_diag_arrow = By.id("com.lifehope:id/imageviewNextArrow");
    By corona_diag_his = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup\n");
    By corona_his_header = By.id("com.lifehope:id/textview_title");
    By corona_his_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[1]\n");
    By corona_his_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]\n");
    By corona_his_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]\n");
    By corona_his_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\n");
    By diag_share_button = By.id("com.lifehope:id/textview_share");
    By close_diag_his = By.id("com.lifehope:id/imageview_close");
    By back_diag_his = By.id("com.lifehope:id/imageview_back_arrow");
    By back_quick_test = By.id("com.lifehope:id/imageview_back_arrow");

    public QuickHealthTestPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyQuickTestName(String T) throws InterruptedException, IOException {
        test12.log(LogStatus.INFO, "Ready to verify the quick health test module text");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(quick_test)).isDisplayed();
            Thread.sleep(2000);
            String qText = driver.findElement(quick_test_text).getText();
            //System.out.println(qText);
            if (qText.equals(T)) {
                test12.log(LogStatus.PASS, "Quick Test name shown as per the requirement : " + qText);
            } else {
                test12.log(LogStatus.FAIL, "Quick Test name not shown as per the requirement: " + qText);
                getScreenshot("QT_Name");
            }
        } catch (NoSuchElementException e) {
            test12.log(LogStatus.FAIL, "Quick Test name not shown as per the requirement");
            getScreenshot("QT_Name");
        }
    }

    public void verifyQuickTestLogo() throws InterruptedException, IOException {
        test12.log(LogStatus.INFO, "Ready to verify the quick health test module logo");
        try {
            Thread.sleep(2000);
            if (driver.findElement(quick_test_logo).isDisplayed()) {
                //System.out.println("Quick Test Logo Present");
                test12.log(LogStatus.PASS, "Quick Test logo present");
            } else {
                test12.log(LogStatus.FAIL, "Quick Test logo not present");
                getScreenshot("QT_Logo");
            }
        } catch (NoSuchElementException e) {
            test12.log(LogStatus.FAIL, "Quick Test logo not present");
            getScreenshot("QT_Logo");
        }
    }

    public void clickQuickTest() throws InterruptedException, IOException {
        test12.log(LogStatus.INFO, "Ready to click the quick health test module");
        try {
            Thread.sleep(2000);
            driver.findElement(quick_test).click();
            test12.log(LogStatus.PASS, "Quick Health Test Module clicked");
        } catch (NoSuchElementException e) {
            test12.log(LogStatus.FAIL, "Quick Health Test Module not present");
            getScreenshot("QT_Module");
        }
    }

    public void verifyHeader(String H) throws InterruptedException, IOException {
        test12.log(LogStatus.INFO, "Ready to verify the quick health test header");
        try {
            Thread.sleep(5000);
            String header = driver.findElement(quick_header).getText();
            //System.out.println(header);
            if (header.equals(H)) {
                test12.log(LogStatus.PASS, "Quick Test header shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Quick Test header not shown as per the requirement : " + header);
                getScreenshot("QT_Header");
            }
        } catch (NoSuchElementException | IOException e) {
            test12.log(LogStatus.FAIL, "Quick Test header not shown");
            getScreenshot("QT_Header");
        }
    }

    public void verifySubTitle(String S) throws IOException {
        test12.log(LogStatus.INFO, "Ready to verify the quick health test sub header");
        try {
            Thread.sleep(2000);
            String header = driver.findElement(self_diag_text).getText();
            //System.out.println(header);
            if (header.equals(S)) {
                test12.log(LogStatus.PASS, "Quick Test sub header shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Quick Test sub header not shown as per the requirement : " + header);
                getScreenshot("QT_SubHeader");
            }
        } catch (NoSuchElementException | IOException | InterruptedException e) {
            test12.log(LogStatus.FAIL, "Quick Test sub header not shown as per the requirement");
            getScreenshot("QT_SubHeader");
        }
    }

    public void verifyCoronaName(String C) throws IOException {
        test12.log(LogStatus.INFO, "Ready to verify the Coronavirus text");
        try {
            Thread.sleep(2000);
            String header = driver.findElement(corona_text).getText();
            //System.out.println(header);
            if (header.equals(C)) {
                test12.log(LogStatus.PASS, "Corona text shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Corona text not shown as per the requirement : " + header);
                getScreenshot("QT_CorText");
            }
        } catch (NoSuchElementException | IOException | InterruptedException e) {
            test12.log(LogStatus.FAIL, "Corona text not shown as per the requirement");
            getScreenshot("QT_CorText");
        }
    }

    public void verifyCoronaLogo() throws InterruptedException, IOException {
        test12.log(LogStatus.INFO, "Ready to verify the Coronavirus logo");
        try {
            Thread.sleep(2000);
            if (driver.findElement(corona_logo).isDisplayed()) {
                //System.out.println("Corona Logo Present");
                test12.log(LogStatus.PASS, "Corona logo present");
            } else {
                test12.log(LogStatus.FAIL, "Corona logo not present");
                getScreenshot("QT_CorLogo");
            }
        } catch (NoSuchElementException e) {
            test12.log(LogStatus.FAIL, "Corona logo not present");
            getScreenshot("QT_CorLogo");
        }
    }

    public void clickCoronaSymptoms() throws InterruptedException, IOException {
        test12.log(LogStatus.INFO, "Ready to click the Coronavirus Symptoms");
        try {
            Thread.sleep(2000);
            driver.findElement(corona_symp).click();
            test12.log(LogStatus.PASS, "Corona Symptoms tab clicked");
        } catch (NoSuchElementException e) {
            test12.log(LogStatus.FAIL, "Corona Symptoms tab not present");
            getScreenshot("QT_CorSym");
        }
    }

    public void verifyTakePhotoPageUI(String H, String F, String L, String G, String A, String C, String N) throws IOException {
        test12.log(LogStatus.INFO, "Ready to verify the Take a Photo page UI");
        try {
            Thread.sleep(2000);
            String header = driver.findElement(photo_header).getText();
            //System.out.println(header);
            if (header.equals(H)) {
                test12.log(LogStatus.PASS, "Photo header shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Photo header not shown as per the requirement : " + header);
                getScreenshot("QT_PhotoText");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Photo header not shown as per the requirement");
            getScreenshot("QT_PhotoText");
        }
        try {
            Thread.sleep(2000);
            String header = driver.findElement(first_name).getText();
            //System.out.println(header);
            if (header.equals(F)) {
                test12.log(LogStatus.PASS, "First name text shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "First name text not shown as per the requirement : " + header);
                getScreenshot("QT_PhotoFN");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "First name not shown as per the requirement");
            getScreenshot("QT_PhotoFN");
        }
        try {
            Thread.sleep(2000);
            String header = driver.findElement(last_name).getText();
            //System.out.println(header);
            if (header.equals(L)) {
                test12.log(LogStatus.PASS, "Last name text shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Last name text not shown as per the requirement : " + header);
                getScreenshot("QT_PhotoLN");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "First name not shown as per the requirement");
            getScreenshot("QT_PhotoLN");
        }
        try {
            Thread.sleep(2000);
            String header = driver.findElement(gender_name).getText();
            //System.out.println(header);
            if (header.equals(G)) {
                test12.log(LogStatus.PASS, "Gender name text shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Gender name text not shown as per the requirement : " + header);
                getScreenshot("QT_PhotoGender");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Gender name not shown as per the requirement");
            getScreenshot("QT_PhotoGender");
        }
        try {
            Thread.sleep(2000);
            String header = driver.findElement(age_name).getText();
            //System.out.println(header);
            if (header.equals(A)) {
                test12.log(LogStatus.PASS, "Age name text shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Age name text not shown as per the requirement : " + header);
                getScreenshot("QT_PhotoAge");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Age name not shown as per the requirement");
            getScreenshot("QT_PhotoAge");
        }
        try {
            Thread.sleep(2000);
            String header = driver.findElement(check_box).getText();
            //System.out.println(header);
            if (header.equals(C)) {
                test12.log(LogStatus.PASS, "Check box name text shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Check box name text not shown as per the requirement : " + header);
                getScreenshot("QT_PhotoCheck");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Check box name not shown as per the requirement");
            getScreenshot("QT_PhotoCheck");
        }
        try {
            Thread.sleep(2000);
            String header = driver.findElement(next_button).getText();
            //System.out.println(header);
            if (header.equals(N)) {
                test12.log(LogStatus.PASS, "Next button name text shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Next button name text not shown as per the requirement : " + header);
                getScreenshot("QT_PhotoNext");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Next button name not shown as per the requirement");
            getScreenshot("QT_PhotoNext");
        }
    }

    public void setProfileImage(String P, String M) throws IOException {
        try {
            Thread.sleep(2000);
            driver.findElement(take_photo_icon).click();
            Thread.sleep(2000);
            try {
                if (driver.findElement(photo_perm_text).isDisplayed()) {
                    Thread.sleep(2000);
                    String photo = driver.findElement(photo_perm_text).getText();
                    //System.out.println(photo);
                    if (photo.equals(P)) {
                        test12.log(LogStatus.PASS, "Photo permission text shown as per the requirement : " + photo);
                    } else {
                        test12.log(LogStatus.FAIL, "Photo permission text not shown as per the requirement : " + photo);
                    }
                    try {
                        Thread.sleep(2000);
                        driver.findElement(allow).click();
                    } catch (NoSuchElementException e) {
                        test12.log(LogStatus.INFO, "Photo permission not visible");
                    }
                } else {
                    test12.log(LogStatus.FAIL, "Photo permission not visible");
                    getScreenshot("QT_PhotoPerm");
                }
                Thread.sleep(2000);
                if (driver.findElement(media_perm_text).isDisplayed()) {
                    Thread.sleep(2000);
                    String media = driver.findElement(media_perm_text).getText();
                    //System.out.println(media);
                    if (media.equals(M)) {
                        test12.log(LogStatus.PASS, "Media permission text shown as per the requirement : " + media);
                    } else {
                        test12.log(LogStatus.PASS, "Media permission text not shown as per the requirement : " + media);
                    }
                    try {
                        Thread.sleep(2000);
                        driver.findElement(allow).click();
                    } catch (NoSuchElementException e) {
                        test12.log(LogStatus.INFO, "Media permission not visible");
                    }
                } else {
                    test12.log(LogStatus.FAIL, "Media permission not visible");
                    getScreenshot("QT_MediaPerm");
                }
            } catch (NoSuchElementException e) {
                test12.log(LogStatus.INFO, "Photo permission not visible");
            }
            Thread.sleep(5000);
            driver.findElement(take_photo).click();
            Thread.sleep(5000);
            driver.findElement(done_photo).click();
            Thread.sleep(5000);
            driver.findElement(crop_done).click();
            Thread.sleep(2000);
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Can't able to set profile Image");
            getScreenshot("QT_PhotoImage");
        }
    }

    public void setProfileInfo(String F, String L, String G, String A, String S) throws IOException {
        try {
//            Thread.sleep(5000);
//            driver.findElement(first_name).sendKeys(F);
//            Thread.sleep(2000);
//            if(driver.findElement(def_first_text).isDisplayed()) {
//                System.out.println("Default text shown");
//                Thread.sleep(2000);
//                driver.findElement(def_first_text).click();
//            } else {
//                System.out.println("Default text not shown");
//                Thread.sleep(2000);
//                driver.findElement(last_name).sendKeys(L);
//            }
//            Thread.sleep(2000);
//            driver.findElement(select_gender).click();
//            Thread.sleep(2000);
//            if(G.equals("Male")) {
//                driver.findElement(male).click();
//            } else {
//                driver.findElement(female).click();
//            }
//            Thread.sleep(2000);
//            driver.findElement(age_name).sendKeys(A);
            Thread.sleep(5000);
            if (S.equals("TRUE")) {
                driver.findElement(check_box).click();
                Thread.sleep(2000);
                String fName = driver.findElement(first_text).getText();
                //System.out.println(fName);
                if (fName.equals("null")) {
                    test12.log(LogStatus.FAIL, "First name shown empty : " + fName);
                    getScreenshot("QT_FN");
                } else {
                    test12.log(LogStatus.PASS, "First name shown: " + fName);
                }
                Thread.sleep(2000);
                String lName = driver.findElement(last_text).getText();
                //System.out.println(lName);
                if (lName.equals("null")) {
                    test12.log(LogStatus.FAIL, "Last name shown empty : " + lName);
                    getScreenshot("QT_LN");
                } else {
                    test12.log(LogStatus.PASS, "Last name shown : " + lName);
                }
                Thread.sleep(2000);
                String GName = driver.findElement(gender_text).getText();
                //System.out.println(GName);
                if (GName.equals("null")) {
                    test12.log(LogStatus.FAIL, "Gender name shown empty : " + GName);
                    getScreenshot("QT_GN");
                } else {
                    test12.log(LogStatus.PASS, "Gender name shown : " + GName);
                }
                Thread.sleep(2000);
                String AName = driver.findElement(age_text).getText();
                //System.out.println(AName);
                if (AName.equals("null")) {
                    test12.log(LogStatus.FAIL, "Age value shown empty : " + AName);
                    getScreenshot("QT_AV");
                } else {
                    test12.log(LogStatus.PASS, "Age value shown : " + AName);
                }
            } else {
                test12.log(LogStatus.FAIL, "Same as Profile Info not clicked");
                getScreenshot("QT_PhotoCheckBox");
            }
            Thread.sleep(2000);
            driver.findElement(next_button).click();
            try {
                Thread.sleep(2000);
                if (driver.findElement(next_button).isDisplayed()) {
                    Thread.sleep(2000);
                    setProfileImage("Allow LifeHope Health to take pictures and record video?", "Allow LifeHope Health to access photos, media and files on your device?");
                    Thread.sleep(15000);
                    driver.findElement(next_button).click();
                }
            } catch (NoSuchElementException e) {
                //System.out.println("Next button not visible");
            }
        } catch (InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "can't able to set Profile Info");
            getScreenshot("QT_ProInfo");
        }
    }

    public void verifyQuesPageUI(String H, String S, String T, String D) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to verify the Questionnaire Page UI");
        Thread.sleep(5000);
        try {
            Thread.sleep(5000);
            String header = driver.findElement(quest_header).getText();
            //System.out.println(header);
            if (header.equals(H)) {
                test12.log(LogStatus.PASS, "Question page header text shown as per the requirement : " + header);
            } else {
                test12.log(LogStatus.FAIL, "Question page header text not shown as per the requirement : " + header);
                getScreenshot("QT_QHeader");
            }
            Thread.sleep(5000);
            String sub = driver.findElement(quest_text).getText();
            //System.out.println(sub);
            if (sub.equals(S)) {
                test12.log(LogStatus.PASS, "Question page text shown as per the requirement : " + sub);
            } else {
                test12.log(LogStatus.FAIL, "Question page text not shown as per the requirement : " + sub);
                getScreenshot("QT_QSubHeader");
            }
            Thread.sleep(5000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Question total text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Question total text not shown as per the requirement : " + total);
                getScreenshot("QT_QTotal");
            }
            Thread.sleep(5000);
            String d = driver.findElement(desc).getText();
            //System.out.println(d);
            if (d.equals(D)) {
                test12.log(LogStatus.PASS, "Question description text shown as per the requirement : " + d);
            } else {
                test12.log(LogStatus.FAIL, "Question description text not shown as per the requirement : " + d);
                getScreenshot("QT_QDesc");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question page UI not shown as per the requirement");
            getScreenshot("QT_QUi");
        }
    }

    public void setFirstQues(String Q, String A, String A1, String A2, String A3, String A4) throws IOException {
        test12.log(LogStatus.INFO, "Ready to answer the First Question");
        try {
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 1 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 1 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques1Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 1 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 1 logo not shown as per the requirement");
                getScreenshot("QT_Ques1Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(great).isDisplayed()) {
                String gt = driver.findElement(great).getText();
                //System.out.println(gt);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + gt);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Ans1");
            }
            Thread.sleep(2000);
            if (driver.findElement(good).isDisplayed()) {
                String gd = driver.findElement(good).getText();
                //System.out.println(gd);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + gd);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_Ans2");
            }
            Thread.sleep(2000);
            if (driver.findElement(poor).isDisplayed()) {
                String pr = driver.findElement(poor).getText();
                //System.out.println(pr);
                test12.log(LogStatus.PASS, "Answer 3 text shown as per the requirement : " + pr);
            } else {
                test12.log(LogStatus.FAIL, "Answer 3 text not shown as per the requirement");
                getScreenshot("QT_Ans3");
            }
            Thread.sleep(2000);
            if (driver.findElement(sick).isDisplayed()) {
                String sk = driver.findElement(sick).getText();
                //System.out.println(sk);
                test12.log(LogStatus.PASS, "Answer 4 text shown as per the requirement : " + sk);
            } else {
                test12.log(LogStatus.FAIL, "Answer 4 text not shown as per the requirement");
                getScreenshot("QT_Ans4");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Great":
                    driver.findElement(great).click();
                    break;
                case "Good":
                    driver.findElement(good).click();
                    break;
                case "Poor":
                    driver.findElement(poor).click();
                    break;
                case "Sick":
                    driver.findElement(sick).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 1 not shown as per the requirement");
            getScreenshot("QT_Ques1");
        }
    }

    public void setSecondQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Second Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot2Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 2 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 2 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques2Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 2 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 2 logo not shown as per the requirement");
                getScreenshot("QT_Ques2Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes2");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No2");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 2 not shown as per the requirement");
            getScreenshot("QT_Ques2");
        }
    }

    public void setThirdQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Third Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot3Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 3 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 3 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques3Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 3 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 3 logo not shown as per the requirement");
                getScreenshot("QT_Ques3Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes3");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No3");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 3 not shown as per the requirement");
            getScreenshot("QT_Ques3");
        }
    }

    public void setFourthQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Fourth Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot4Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 4 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 4 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques4Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 4 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 4 logo not shown as per the requirement");
                getScreenshot("QT_Ques4Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes4");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No4");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 4 not shown as per the requirement");
            getScreenshot("QT_Ques4");
        }
    }

    public void setFifthQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Fifth Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot5Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 5 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 5 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques5Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 5 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 5 logo not shown as per the requirement");
                getScreenshot("QT_Ques5Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes5");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No5");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 5 not shown as per the requirement");
            getScreenshot("QT_Ques5");
        }
    }

    public void setSixthQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Sixth Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot6Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 6 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 6 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques6Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 6 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 6 logo not shown as per the requirement");
                getScreenshot("QT_Ques6Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes6");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No6");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 6 not shown as per the requirement");
            getScreenshot("QT_Ques6");
        }
    }

    public void setSeventhQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Seventh Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot7Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 7 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 7 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques7Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 7 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 7 logo not shown as per the requirement");
                getScreenshot("QT_Ques7Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes7");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No7");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 7 not shown as per the requirement");
            getScreenshot("QT_Ques7");
        }
    }

    public void setEightQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Eight Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot8Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 8 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 8 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques8Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 8 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 8 logo not shown as per the requirement");
                getScreenshot("QT_Ques8Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes8");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No8");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 8 not shown as per the requirement");
            getScreenshot("QT_Ques8");
        }
    }

    public void setNinthQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Ninth Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot9Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 9 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 9 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques9Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 9 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 9 logo not shown as per the requirement");
                getScreenshot("QT_Ques9Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes9");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No9");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 9 not shown as per the requirement");
            getScreenshot("QT_Ques9");
        }
    }

    public void setTenthQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Tenth Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot10Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 10 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 10 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques10Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 10 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 10 logo not shown as per the requirement");
                getScreenshot("QT_Ques10Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes10");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No10");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 10 not shown as per the requirement");
            getScreenshot("QT_Ques10");
        }
    }

    public void setLeventhQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Leventh Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot11Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 11 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 11 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques11Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 11 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 11 logo not shown as per the requirement");
                getScreenshot("QT_Ques11Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes11");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No11");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 11 not shown as per the requirement");
            getScreenshot("QT_Ques11");
        }
    }

    public void setTwelthQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Twelth Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot12Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 12 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 12 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques12Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 12 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 12 logo not shown as per the requirement");
                getScreenshot("QT_Ques12Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes12");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No12");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 12 not shown as per the requirement");
            getScreenshot("QT_Ques12");
        }
    }

    public void setThirteenQues(String T, String Q, String A, String A1, String A2) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to answer the Thirteenth Question");
        Thread.sleep(5000);
        try {
            Thread.sleep(3000);
            String total = driver.findElement(total_ques).getText();
            //System.out.println(total);
            if (total.equals(T)) {
                test12.log(LogStatus.PASS, "Total Question text shown as per the requirement : " + total);
            } else {
                test12.log(LogStatus.FAIL, "Total Question text not shown as per the requirement : " + total);
                getScreenshot("QT_Tot13Text");
            }
            Thread.sleep(2000);
            String ques = driver.findElement(ques_1).getText();
            //System.out.println(ques);
            if (ques.equals(Q)) {
                test12.log(LogStatus.PASS, "Question 13 text shown as per the requirement : " + ques);
            } else {
                test12.log(LogStatus.FAIL, "Question 13 text not shown as per the requirement : " + ques);
                getScreenshot("QT_Ques13Text");
            }
            Thread.sleep(2000);
            if (driver.findElement(ques_1_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Question 13 logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Question 13 logo not shown as per the requirement");
                getScreenshot("QT_Ques13Logo");
            }
            Thread.sleep(2000);
            if (driver.findElement(yes).isDisplayed()) {
                Thread.sleep(1000);
                String y = driver.findElement(yes).getText();
                //System.out.println(y);
                test12.log(LogStatus.PASS, "Answer 1 text shown as per the requirement : " + y);
            } else {
                test12.log(LogStatus.FAIL, "Answer 1 text not shown as per the requirement");
                getScreenshot("QT_Yes13");
            }
            Thread.sleep(2000);
            if (driver.findElement(no).isDisplayed()) {
                String n = driver.findElement(no).getText();
                //System.out.println(n);
                test12.log(LogStatus.PASS, "Answer 2 text shown as per the requirement : " + n);
            } else {
                test12.log(LogStatus.FAIL, "Answer 2 text not shown as per the requirement");
                getScreenshot("QT_No13");
            }
            Thread.sleep(2000);
            switch (A) {
                case "Yes":
                    driver.findElement(yes).click();
                    break;
                case "No":
                    driver.findElement(no).click();
                    break;
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Question 13 not shown as per the requirement");
            getScreenshot("QT_Ques13");
        }
    }

    public void verifyConcernsUI(String C) throws IOException {
        test12.log(LogStatus.INFO, "Ready to verify the Concerns Page UI");
        try {
            Thread.sleep(2000);
            if (driver.findElement(concerns_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Concern logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Concern logo not shown as per the requirement");
                getScreenshot("QT_ConLogo");
            }
            Thread.sleep(2000);
            if (driver.findElement(edit_concerns).isDisplayed()) {
                String concern = driver.findElement(edit_concerns).getText();
                //System.out.println(concern);
                if (concern.equals(C)) {
                    test12.log(LogStatus.PASS, "Concern text shown as per the requirement : " + concern);
                } else {
                    test12.log(LogStatus.FAIL, "Concern text not shown as per the requirement : " + concern);
                }
            } else {
                test12.log(LogStatus.FAIL, "Concern text not shown as per the requirement");
                getScreenshot("QT_ConText");
            }
            Thread.sleep(2000);
            if (driver.findElement(skip).isDisplayed()) {
                String sk = driver.findElement(skip).getText();
                //System.out.println(sk);
                if (sk.equals("SKIP")) {
                    test12.log(LogStatus.PASS, "Skip button text shown as per the requirement : " + sk);
                } else {
                    test12.log(LogStatus.FAIL, "Skip button text not shown as per the requirement");
                    getScreenshot("QT_SkipText");
                }
            } else {
                test12.log(LogStatus.FAIL, "Skip button not shown as per the requirement");
                getScreenshot("QT_Skip");
            }
            Thread.sleep(2000);
            if (driver.findElement(submit).isDisplayed()) {
                String sk = driver.findElement(submit).getText();
                //System.out.println(sk);
                if (sk.equals("SUBMIT")) {
                    test12.log(LogStatus.PASS, "Submit button text shown as per the requirement : " + sk);
                } else {
                    test12.log(LogStatus.FAIL, "Submit button text not shown as per the requirement");
                    getScreenshot("QT_SubmitText");
                }
            } else {
                test12.log(LogStatus.FAIL, "Submit button not shown as per the requirement");
                getScreenshot("QT_Submit");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Concern not shown as per the requirement");
            getScreenshot("QT_ConText");
        }
    }

    public void verifyConcerns(String C, String S) throws IOException {
        test12.log(LogStatus.INFO, "Ready to verify the Concerns Page");
        try {
            Thread.sleep(2000);
            //driver.findElement(edit_concerns).sendKeys(C);
            if (S.equals("SKIP")) {
                Thread.sleep(2000);
                try {
                    driver.findElement(skip).click();
                } catch (NoSuchElementException e) {
                    //Thread.sleep(2000);
                    //driver.navigate().back();
                    Thread.sleep(2000);
                    driver.findElement(skip).click();
                }
            } else {
                Thread.sleep(2000);
                try {
                    driver.findElement(submit).click();
                } catch (NoSuchElementException e) {
                    //Thread.sleep(2000);
                    //driver.navigate().back();
                    Thread.sleep(2000);
                    driver.findElement(submit).click();
                }
            }
        } catch (NoSuchElementException | InterruptedException e) {
            test12.log(LogStatus.FAIL, "Concern not shown as per the requirement");
            getScreenshot("QT_Concern");
        }
    }

    public void verifyDiagnosisResultUI(String H, String S, String D, String Sev, String R, String Sh, String B) throws IOException, InterruptedException {
        test12.log(LogStatus.INFO, "Ready to verify the Diagnosis Result Page UI");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            if (driver.findElement(diag_result_header).isDisplayed()) {
                String sk = driver.findElement(diag_result_header).getText();
                //System.out.println(sk);
                if (sk.equals(H)) {
                    test12.log(LogStatus.PASS, "Header text shown as per the requirement : " + sk);
                } else {
                    test12.log(LogStatus.FAIL, "Header text not shown as per the requirement : " + sk);
                    getScreenshot("QT_DRHeader");
                }
            } else {
                test12.log(LogStatus.FAIL, "Header text not shown as per the requirement");
                getScreenshot("QT_DRHeader");
            }
            Thread.sleep(2000);
            if (driver.findElement(symptom_title).isDisplayed()) {
                String sk = driver.findElement(symptom_title).getText();
                //System.out.println(sk);
                if (sk.equals(S)) {
                    test12.log(LogStatus.PASS, "Symptom header text shown as per the requirement : " + sk);
                } else {
                    test12.log(LogStatus.FAIL, "Symptom header text not shown as per the requirement : " + sk);
                    getScreenshot("QT_DRSym");
                }
            } else {
                test12.log(LogStatus.FAIL, "Symptom header text not shown as per the requirement");
                getScreenshot("QT_DRSym");
            }
            Thread.sleep(2000);
            if (driver.findElement(test_desc).isDisplayed()) {
                String sk = driver.findElement(test_desc).getText();
                //System.out.println(sk);
                if (sk.equals(D)) {
                    test12.log(LogStatus.PASS, "Symptom description text shown as per the requirement : " + sk);
                } else {
                    test12.log(LogStatus.INFO, "Symptom description text not shown as per the requirement : " + sk);
                    getScreenshot("QT_DRDesc");
                }
            } else {
                test12.log(LogStatus.FAIL, "Symptom description text not shown as per the requirement");
                getScreenshot("QT_DRDesc");
            }
            Thread.sleep(2000);
            if (driver.findElement(symp_sev_text).isDisplayed()) {
                String sk = driver.findElement(symp_sev_text).getText();
                //System.out.println(sk);
                if (sk.equals(Sev)) {
                    test12.log(LogStatus.PASS, "Symptom severity text shown as per the requirement : " + sk);
                } else {
                    test12.log(LogStatus.FAIL, "Symptom severity text not shown as per the requirement : " + sk);
                    getScreenshot("QT_DRSevText");
                }
            } else {
                test12.log(LogStatus.FAIL, "Symptom severity text not shown as per the requirement");
                getScreenshot("QT_DRSevText");
            }
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                String recTest = driver.findElement(recom_test).getText();
                //System.out.println(recTest);
                test12.log(LogStatus.PASS, "Recommended Test header text shown as per the requirement : " + recTest);
                Thread.sleep(2000);
                try {
                    String test1 = driver.findElement(test_1).getText();
                    //System.out.println(test1);
                    test12.log(LogStatus.PASS, "Test 1 name shown as per the requirement : " + test1);
                } catch (NoSuchElementException e) {
                    test12.log(LogStatus.FAIL, "Test 1 name not visible");
                }
                Thread.sleep(2000);
                try {
                    String test2 = driver.findElement(test_2).getText();
                    //System.out.println(test2);
                    test12.log(LogStatus.PASS, "Test 2 name shown as per the requirement : " + test2);
                } catch (NoSuchElementException e) {
                    test12.log(LogStatus.FAIL, "Test 2 name not visible");
                }
                Thread.sleep(2000);
                try {
                    String test3 = driver.findElement(test_3).getText();
                    //System.out.println(test3);
                    test12.log(LogStatus.PASS, "Test 3 name shown as per the requirement : " + test3);
                } catch (NoSuchElementException e) {
                    test12.log(LogStatus.FAIL, "Test 3 name not visible");
                }
                Thread.sleep(2000);
                try {
                    String test4 = driver.findElement(test_4).getText();
                    //System.out.println(test4);
                    test12.log(LogStatus.PASS, "Test 4 name shown as per the requirement : " + test4);
                } catch (NoSuchElementException e) {
                    test12.log(LogStatus.FAIL, "Test 4 name not visible");
                }
            } catch (NoSuchElementException e) {
                test12.log(LogStatus.INFO, "Recommended Test not visible");
            }
            Thread.sleep(2000);
            if (driver.findElement(sym_sev_percentage).isDisplayed()) {
                String sk = driver.findElement(sym_sev_percentage).getText();
                //System.out.println(sk);
                test12.log(LogStatus.PASS, "Symptom severity percentage shown as per the requirement : " + sk);
            } else {
                test12.log(LogStatus.FAIL, "Symptom severity percentage not shown as per the requirement");
                getScreenshot("QT_DRSevPercent");
            }
            Thread.sleep(2000);
            if (driver.findElement(sym_sev_progress_bar).isDisplayed()) {
                test12.log(LogStatus.PASS, "Symptom severity progress shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Symptom severity progress not shown as per the requirement");
                getScreenshot("QT_DRSevProg");
            }
            Thread.sleep(2000);
            if (driver.findElement(sym_logo).isDisplayed()) {
                test12.log(LogStatus.PASS, "Symptom severity logo shown as per the requirement");
            } else {
                test12.log(LogStatus.FAIL, "Symptom severity logo not shown as per the requirement");
                getScreenshot("QT_DRSevlogo");
            }
            Thread.sleep(2000);
            if (driver.findElement(result_msg).isDisplayed()) {
                String sk = driver.findElement(result_msg).getText();
                //System.out.println(sk);
                if (sk.equals(R)) {
                    test12.log(LogStatus.PASS, "Result text shown as per the requirement : " + sk);
                } else {
                    test12.log(LogStatus.FAIL, "Result text not shown as per the requirement : " + sk);
                    getScreenshot("QT_DRResText");
                }
            } else {
                test12.log(LogStatus.FAIL, "Share button text not shown as per the requirement");
                getScreenshot("QT_DRResText");
            }
            Thread.sleep(2000);
            if (driver.findElement(share_button).isDisplayed()) {
                String sk = driver.findElement(share_button).getText();
                //System.out.println(sk);
                if (sk.equals(Sh)) {
                    test12.log(LogStatus.PASS, "Share button text shown as per the requirement : " + sk);
                } else {
                    test12.log(LogStatus.FAIL, "Share button text not shown as per the requirement");
                    getScreenshot("QT_DRShare");
                }
            } else {
                test12.log(LogStatus.FAIL, "Share button text not shown as per the requirement");
                getScreenshot("QT_DRShare");
            }
            Thread.sleep(2000);
            if (driver.findElement(book_test_button).isDisplayed()) {
                String sk = driver.findElement(book_test_button).getText();
                //System.out.println(sk);
                if (sk.equals(B)) {
                    test12.log(LogStatus.PASS, "Book button text shown as per the requirement : " + sk);
                } else {
                    test12.log(LogStatus.FAIL, "Book button text not shown as per the requirement");
                    getScreenshot("QT_DRBook");
                }
            } else {
                test12.log(LogStatus.FAIL, "Book button text not shown as per the requirement");
                getScreenshot("QT_DRBook");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test12.log(LogStatus.FAIL, "Diagnosis Results Page not shown as per the requirement");
            getScreenshot("QT_DR");
        }
    }

    public void verifyDiagnosisResult() throws IOException {
        test12.log(LogStatus.INFO, "Ready to verify the Diagnosis Result Page");
        try {
            Thread.sleep(2000);
            driver.findElement(share_button).click();
            test12.log(LogStatus.PASS, "Share button clicked");
            Thread.sleep(1000);
            String link = driver.findElement(copy_link).getText();
            //System.out.println(link);
            test12.log(LogStatus.INFO, "Share link : " + link);
            Thread.sleep(2000);
            driver.findElement(share_copy).click();
            test12.log(LogStatus.PASS, "Share link Copied");
//            Thread.sleep(2000);
//            driver.findElement(back_page).click();
            Thread.sleep(2000);
            driver.findElement(book_test_button).click();
            test12.log(LogStatus.PASS, "Book a Test button clicked");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        } catch (NoSuchElementException | InterruptedException e) {
            test12.log(LogStatus.FAIL, "Diagnosis Results Page not shown as per the requirement");
            getScreenshot("QT_DR");
        }
    }

    public void verifyDiagnosisHistory(String H, String CN, String CH, String CT) throws InterruptedException, IOException {
        test12.log(LogStatus.INFO, "Ready to verify the Diagnosis History Page");
        Thread.sleep(2000);
        try {
            Thread.sleep(2000);
            if (driver.findElement(quick_history_icon).isDisplayed()) {
                Thread.sleep(2000);
                driver.findElement(quick_history_icon).click();
                Thread.sleep(2000);
                String header = driver.findElement(diag_history_header).getText();
                //System.out.println(header);
                if (header.equals(H)) {
                    test12.log(LogStatus.PASS, "Diagnosis History header test shown as Per the requirement : " + header);
                } else {
                    test12.log(LogStatus.FAIL, "Diagnosis History header text not shown as Per the requirement : " + header);
                }
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    String coronaSym = driver.findElement(corona_diag_name).getText();
                    //System.out.println(coronaSym);
                    if (coronaSym.equals(CN)) {
                        test12.log(LogStatus.PASS, "Corona Symptoms test shown as Per the requirement : " + coronaSym);
                    } else {
                        test12.log(LogStatus.FAIL, "Corona Symptoms text not shown as Per the requirement : " + coronaSym);
                    }
                    Thread.sleep(2000);
                    if (driver.findElement(corona_diag_logo).isDisplayed()) {
                        test12.log(LogStatus.PASS, "Corona Symptoms logo shown as Per the requirement");
                    } else {
                        test12.log(LogStatus.FAIL, "Corona Symptoms logo not shown as Per the requirement");
                    }
                    Thread.sleep(2000);
                    driver.findElement(corona_diag_arrow).click();
                    Thread.sleep(2000);
                    try {
                        Thread.sleep(2000);
                        String symH = driver.findElement(corona_his_header).getText();
                        //System.out.println(symH);
                        if (symH.equals(CH)) {
                            test12.log(LogStatus.PASS, "Corona Symptoms history header shown as Per the requirement : " + symH);
                        } else {
                            test12.log(LogStatus.FAIL, "Corona Symptoms history header not shown as Per the requirement : " + symH);
                        }
                        Thread.sleep(2000);
                        String symT = driver.findElement(corona_his_name).getText();
                        //System.out.println(symT);
                        if (symT.equals(CT)) {
                            test12.log(LogStatus.PASS, "Corona Symptoms history text shown as Per the requirement : " + symT);
                        } else {
                            test12.log(LogStatus.FAIL, "Corona Symptoms history text not shown as Per the requirement : " + symT);
                        }
                        Thread.sleep(2000);
                        String symD = driver.findElement(corona_his_date).getText();
                        //System.out.println(symD);
                        if (symD.equals("null")) {
                            test12.log(LogStatus.FAIL, "Corona Symptoms history date not shown as Per the requirement : " + symD);
                        } else {
                            test12.log(LogStatus.PASS, "Corona Symptoms history date shown as Per the requirement : " + symD);
                        }
                        Thread.sleep(2000);
                        if (driver.findElement(corona_his_logo).isDisplayed()) {
                            test12.log(LogStatus.PASS, "Corona Symptoms history logo shown as Per the requirement");
                        } else {
                            test12.log(LogStatus.FAIL, "Corona Symptoms history logo not shown as Per the requirement");
                        }
                        Thread.sleep(2000);
                        driver.findElement(corona_his_arrow).click();
                        Thread.sleep(2000);
                        Dimension dimension = driver.manage().window().getSize();
                        int scrollStart = (int) (dimension.getHeight() * 0.5);
                        int scrollEnd = (int) (dimension.getHeight() * 0.2);
                        new TouchAction((PerformsTouchActions) driver)
                                .press(PointOption.point(0, scrollStart))
                                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                                .moveTo(PointOption.point(0, scrollEnd))
                                .release().perform();
                        Thread.sleep(2000);
                        new TouchAction((PerformsTouchActions) driver)
                                .press(PointOption.point(0, scrollStart))
                                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                                .moveTo(PointOption.point(0, scrollEnd))
                                .release().perform();
                        Thread.sleep(2000);
                        new TouchAction((PerformsTouchActions) driver)
                                .press(PointOption.point(0, scrollStart))
                                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                                .moveTo(PointOption.point(0, scrollEnd))
                                .release().perform();
                        Thread.sleep(2000);
                        new TouchAction((PerformsTouchActions) driver)
                                .press(PointOption.point(0, scrollStart))
                                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                                .moveTo(PointOption.point(0, scrollEnd))
                                .release().perform();
                        Thread.sleep(2000);
                        new TouchAction((PerformsTouchActions) driver)
                                .press(PointOption.point(0, scrollStart))
                                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                                .moveTo(PointOption.point(0, scrollEnd))
                                .release().perform();
                        Thread.sleep(2000);
                        driver.findElement(diag_share_button).click();
                        Thread.sleep(2000);
                        String link = driver.findElement(copy_link).getText();
                        //System.out.println(link);
                        test12.log(LogStatus.INFO, "Share link : " + link);
                        Thread.sleep(2000);
                        driver.findElement(share_copy).click();
                        test12.log(LogStatus.PASS, "Share link Copied");
                        Thread.sleep(2000);
                        driver.findElement(close_diag_his).click();
                        Thread.sleep(2000);
                        driver.findElement(back_diag_his).click();
                        Thread.sleep(2000);
                        driver.findElement(back_quick_test).click();
                        Thread.sleep(2000);
                        driver.findElement(back_home).click();
                        Thread.sleep(2000);
                    } catch (NoSuchElementException e) {
                        test12.log(LogStatus.WARNING, "There is no data");
                        getScreenshot("QT_CoronaSymHis");
                        driver.navigate().back();
                        Thread.sleep(2000);
                        driver.navigate().back();
                        Thread.sleep(2000);
                        driver.navigate().back();
                    }
                } catch (NoSuchElementException e) {
                    test12.log(LogStatus.WARNING, "There is no data");
                    getScreenshot("QT_CoronaDiagHis");
                    driver.navigate().back();
                    Thread.sleep(2000);
                    driver.navigate().back();
                    Thread.sleep(2000);
                    driver.navigate().back();
                }
            } else {
                test12.log(LogStatus.FAIL, "Diagnosis History icon not visible");
                getScreenshot("QT_DHIcon");
            }
        } catch (NoSuchElementException e) {
            test12.log(LogStatus.FAIL, "Diagnosis History icon not visible");
            getScreenshot("QT_DHIcon");
        }
    }

}
