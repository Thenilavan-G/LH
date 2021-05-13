package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static IntegrationPages.TestBaseApp.*;

public class GmailSignupPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By none_of_above = By.id("com.google.android.gms:id/cancel");
    By google = By.id("com.lifehope:id/image_google");
    By select_gmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]\n");
    By verify_text = By.id("com.lifehope:id/textViewHeading");
    By mobile_field_head = By.id("com.lifehope:id/textViewMobileNumber");
    By verify_country_code = By.id("com.lifehope:id/textviewCountryCode");
    By enter_number = By.id("com.lifehope:id/ediitextMobileNumber");
    By next_btn = By.id("com.lifehope:id/buttonNext");
    By loc_message = By.id("com.android.permissioncontroller:id/permission_message");
    By allow_loc = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By deny_loc = By.id("com.android.permissioncontroller:id/permission_deny_button");

    By mobile_number_field = By.id("com.lifehope:id/edittext_mobile_number");
    By signup_button = By.id("com.lifehope:id/button_sign_up");
    By yes_btn = By.id("com.lifehope:id/button_proceed");
    By enter_otp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView\n");

    public GmailSignupPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyPopup() {
        test9.log(LogStatus.INFO, "Ready to verify the Popup");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(none_of_above)).click();
        } catch (TimeoutException e) {
            test9.log(LogStatus.SKIP, "There is no pop up screen");
        }
    }

    public void clickGmail() throws InterruptedException, IOException {
        test9.log(LogStatus.INFO, "Ready to click Google Provider");
        try {
            Thread.sleep(2000);
            driver.findElement(google).click();
            test9.log(LogStatus.PASS, "Clicked the Gmail module");
            Thread.sleep(2000);
        } catch (NoSuchElementException e) {
            test9.log(LogStatus.FAIL, "Gmail module not visible");
            getScreenshot("Gmail_Module");
        }
    }

    public void selectGmail() throws InterruptedException, IOException {
        test9.log(LogStatus.INFO, "Ready tp select Gmail");
        Thread.sleep(5000);
        try {
            Thread.sleep(2000);
            driver.findElement(select_gmail).click();
            test9.log(LogStatus.PASS, "Gmail selected from the list");
        } catch (NoSuchElementException e) {
            test9.log(LogStatus.FAIL, "Gmail list not visible");
            getScreenshot("Gmail_List");
        }
    }

    public void verifyMobileNumber(String mobileNo) throws InterruptedException, IOException {
        test7.log(LogStatus.INFO, "Ready to enter the valid Mobile Number");
        try {
            Thread.sleep(2000);
            driver.findElement(mobile_number_field).sendKeys(mobileNo);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.findElement(signup_button).click();
            Thread.sleep(2000);
            driver.findElement(yes_btn).click();
            test9.log(LogStatus.PASS, "OTP page opened");
        } catch (NoSuchElementException e) {
            test9.log(LogStatus.SKIP, "Mobile number field not visible");
            getScreenshot("Login_MField");
        }
    }

    public void setValidOTP(String First, String Second, String Third, String Fourth, String Fifth, String Sixth) throws InterruptedException, IOException {
        test7.log(LogStatus.INFO, "Ready to Pass the Valid OTP");
        try {
            Thread.sleep(2000);
            driver.findElement(enter_otp).clear();
            Thread.sleep(1000);
            driver.findElement(enter_otp).clear();
//        Thread.sleep(1000);
//        driver.findElement(enter_otp).clear();
            Thread.sleep(2000);
            driver.findElement(enter_otp).sendKeys(First, Second, Third, Fourth, Fifth, Sixth);
            test9.log(LogStatus.PASS, "Entered the valid OTP");
        } catch (NoSuchElementException e) {
            test9.log(LogStatus.SKIP, "OTP field not visible");
            getScreenshot("OTP_Field");
        }
    }

    public void verifyUI(String H, String M, String C, String N, String mobileNo) throws InterruptedException, IOException {
        test7.log(LogStatus.INFO, "Ready to verify the OTP Page");
        try {
            Thread.sleep(2000);
            String header = driver.findElement(verify_text).getText();
            if (header.contains(H)) {
                test9.log(LogStatus.PASS, "Header Text showing as per the requirement");
            } else {
                test9.log(LogStatus.FAIL, "Header Text not showing for as per the requirement");
                getScreenshot("Gmail_UI_HeadText");
            }
            Thread.sleep(2000);
            String mobile = driver.findElement(mobile_field_head).getText();
            if (mobile.contains(M)) {
                test9.log(LogStatus.PASS, "Mobile Field Text showing as per the requirement");
            } else {
                test9.log(LogStatus.FAIL, "Mobile Field Text not showing for as per the requirement");
                getScreenshot("Gmail_UI_MobileField");
            }
            Thread.sleep(2000);
            String country = driver.findElement(verify_country_code).getText();
            if (country.contains(C)) {
                test9.log(LogStatus.PASS, "Country Code showing as per the requirement");
            } else {
                test9.log(LogStatus.WARNING, "Country Code not showing for as per the requirement");
                getScreenshot("Gmail_UI_CountryCode");
            }
            Thread.sleep(2000);
            String next = driver.findElement(next_btn).getText();
            if (next.contains(N)) {
                test9.log(LogStatus.PASS, "Next button showing as per the requirement");
            } else {
                test9.log(LogStatus.FAIL, "Next button not showing for as per the requirement");
                getScreenshot("Gmail_UI_NextButton");
            }
            try {
                Thread.sleep(2000);
                driver.findElement(enter_number).sendKeys(mobileNo);
                test9.log(LogStatus.PASS, "Entered the Mobile number");
                Thread.sleep(2000);
                driver.findElement(next_btn).click();
                test9.log(LogStatus.PASS, "Clicked the Next button");
            } catch (NoSuchElementException e) {
                test9.log(LogStatus.FAIL, "Mobile number screen not visible");
                getScreenshot("Gmail_MobNum");
            }
        } catch (NoSuchElementException e) {
            test9.log(LogStatus.FAIL, "Gmail screen not visible");
            getScreenshot("Gmail_Screen");
        }
    }

    public void confirmLocation(String L, String P) throws InterruptedException, IOException {
        test9.log(LogStatus.INFO, "Ready to configure the Location");
        try {
            Thread.sleep(5000);
            String loc = driver.findElement(loc_message).getText();
            if (loc.contains(L)) {
                test9.log(LogStatus.PASS, "Location text showing as per the requirement");
            } else {
                test9.log(LogStatus.FAIL, "Location text not showing as per the requirement");
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
            test9.log(LogStatus.FAIL, "Location permission Screen not visible");
            getScreenshot("Gmail_LocPer");
        }
    }

}
