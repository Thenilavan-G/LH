package AppPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static AppPages.AppTestBase.*;

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
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(google));
            element.click();
            test9.log(LogStatus.PASS, "Clicked the Gmail module");
            Thread.sleep(2000);
        } catch (NoSuchElementException | TimeoutException e) {
            test9.log(LogStatus.FAIL, "Gmail module not visible");
            getScreenshot("Gmail_Module");
        }
    }

    public void selectGmail() throws IOException {
        test9.log(LogStatus.INFO, "Ready tp select Gmail");
        try {
            WebElement element = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(select_gmail));
            element.click();
            test9.log(LogStatus.PASS, "Gmail selected from the list");
        } catch (NoSuchElementException | TimeoutException e) {
            test9.log(LogStatus.FAIL, "Gmail list not visible");
            getScreenshot("Gmail_List");
        }
    }

    public void verifyMobileNumber(String mobileNo) throws IOException {
        test7.log(LogStatus.INFO, "Ready to enter the valid Mobile Number");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_number_field));
            element.sendKeys(mobileNo);
//            Thread.sleep(2000);
//            driver.navigate().back();
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(signup_button));
            element1.click();
            WebElement element2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(yes_btn));
            element2.click();
            test9.log(LogStatus.PASS, "OTP page opened");
        } catch (NoSuchElementException | TimeoutException e) {
            test9.log(LogStatus.SKIP, "Mobile number field not visible");
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
        test9.log(LogStatus.INFO, "Ready to verify the OTP Page");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(verify_text));
            String header = element.getText();
            if (header.contains(H)) {
                test9.log(LogStatus.PASS, "Header Text showing as per the requirement");
            } else {
                test9.log(LogStatus.FAIL, "Header Text not showing for as per the requirement");
                getScreenshot("Gmail_UI_HeadText");
            }
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_field_head));
            String mobile = element1.getText();
            if (mobile.contains(M)) {
                test9.log(LogStatus.PASS, "Mobile Field Text showing as per the requirement");
            } else {
                test9.log(LogStatus.FAIL, "Mobile Field Text not showing for as per the requirement");
                getScreenshot("Gmail_UI_MobileField");
            }
            WebElement element2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(verify_country_code));
            String country = element2.getText();
            if (country.contains(C)) {
                test9.log(LogStatus.PASS, "Country Code showing as per the requirement");
            } else {
                test9.log(LogStatus.WARNING, "Country Code not showing for as per the requirement");
                getScreenshot("Gmail_UI_CountryCode");
            }
            WebElement element3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(next_btn));
            String next = element3.getText();
            if (next.contains(N)) {
                test9.log(LogStatus.PASS, "Next button showing as per the requirement");
            } else {
                test9.log(LogStatus.FAIL, "Next button not showing for as per the requirement");
                getScreenshot("Gmail_UI_NextButton");
            }
            try {
                WebElement element4 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(enter_number));
                element4.sendKeys(mobileNo);
                test9.log(LogStatus.PASS, "Entered the Mobile number");
                WebElement element5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(next_btn));
                element5.click();
                test9.log(LogStatus.PASS, "Clicked the Next button");
            } catch (NoSuchElementException | TimeoutException e) {
                test9.log(LogStatus.FAIL, "Mobile number screen not visible");
                getScreenshot("Gmail_MobNum");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test9.log(LogStatus.FAIL, "Gmail screen not visible");
            getScreenshot("Gmail_Screen");
        }
    }

    public void confirmLocation(String L, String P) throws InterruptedException, IOException {
        test9.log(LogStatus.INFO, "Ready to configure the Location");
        try {
            WebElement element = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(loc_message));
            String loc = element.getText();
            if (loc.contains(L)) {
                test9.log(LogStatus.PASS, "Location text showing as per the requirement");
            } else {
                test9.log(LogStatus.FAIL, "Location text not showing as per the requirement");
                getScreenshot("Gmail_Location");
            }
            if (P.contains("Allow")) {
                Thread.sleep(1000);
                driver.findElement(allow_loc).click();
            } else {
                Thread.sleep(1000);
                driver.findElement(deny_loc).click();
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test9.log(LogStatus.FAIL, "Location permission Screen not visible");
            getScreenshot("Gmail_LocPer");
        }
    }

}
