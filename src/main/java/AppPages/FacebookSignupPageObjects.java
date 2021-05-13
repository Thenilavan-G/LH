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

public class FacebookSignupPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By none_of_above = By.id("com.google.android.gms:id/cancel");
    By facebook = By.id("com.lifehope:id/image_facebook");
    By fb_email = By.id("m_login_email");
    By fb_pwd = By.id("m_login_password");
    By fb_sign_button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.widget.Button\n");
    By fb_continue = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button\n");
    By fb_cont_bottom_link = By.xpath("//android.view.View[@content-desc=\"Privacy Policy\"]/android.widget.TextView\n");
    //By fb_link_body = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView\n");
    By fb_cancel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button\n");
    By fb_logout = By.id("android:id/button1");
    //By fb_cancel_logout = By.id("android:id/button2");
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

    public FacebookSignupPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyPopup() {
        test6.log(LogStatus.INFO, "Ready to verify the Popup");
        test7.log(LogStatus.INFO, "Ready to verify the Popup");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(none_of_above)).click();
            test6.log(LogStatus.SKIP, "Pop up screen verified");
            test7.log(LogStatus.SKIP, "pop up screen verified");
        } catch (TimeoutException e) {
            test6.log(LogStatus.SKIP, "Pop up screen not visible");
            test7.log(LogStatus.SKIP, "pop up screen not visible");
        }
    }

    public void clickFacebook() throws IOException {
        test6.log(LogStatus.INFO, "Ready to click Facebook Provider");
        test7.log(LogStatus.INFO, "Ready to click Facebook Provider");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(facebook));
            element.click();
            test6.log(LogStatus.PASS, "Facebook module selected");
            test7.log(LogStatus.PASS, "Facebook module selected");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Facebook module not visible");
            test7.log(LogStatus.FAIL, "Facebook module not visible");
            getScreenshot("FB_Module");
        }
    }

    public void setFacebookCredentials(String Email, String Password) throws InterruptedException {
        test6.log(LogStatus.INFO, "Ready to pass Facebook Credentials");
        test7.log(LogStatus.INFO, "Ready to pass Facebook Credentials");
        try {
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(fb_logout));
            element.click();
        } catch (NoSuchElementException | TimeoutException e) {
            try {
                WebElement element = new WebDriverWait(driver, 50)
                        .until(driver -> driver.findElement(fb_email));
                element.clear();
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(fb_email));
                element1.sendKeys(Email);
                WebElement element2 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(fb_pwd));
                element2.clear();
                WebElement element3 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(fb_pwd));
                element3.sendKeys(Password);
                Thread.sleep(2000);
                driver.hideKeyboard();
                WebElement element4 = new WebDriverWait(driver, 10)
                        .until(driver -> driver.findElement(fb_sign_button));
                element4.click();
                test6.log(LogStatus.PASS, "Facebook credentials passed");
                test7.log(LogStatus.PASS, "Facebook credentials passed");
                WebElement element5 = new WebDriverWait(driver, 20)
                        .until(driver -> driver.findElement(fb_cont_bottom_link));
                element5.click();
//                try {
//                    Thread.sleep(2000);
//                    //String body = driver.findElement(fb_link_body).getText();
//                    //System.out.println(body);
//                } catch (NoSuchElementException e1) {
//                    test6.log(LogStatus.FAIL, "There is no data in the Fb privacy policy page");
//                    test7.log(LogStatus.FAIL, "There is no data in the Fb privacy policy page");
//                    getScreenshot("FB_PrivacyPolicy");
//                }
                Thread.sleep(2000);
                driver.navigate().back();
                WebElement element6 = new WebDriverWait(driver, 30)
                        .until(driver -> driver.findElement(fb_continue));
                element6.click();
            } catch (NoSuchElementException | TimeoutException e1) {
                try {
                    WebElement element = new WebDriverWait(driver, 50)
                            .until(driver -> driver.findElement(fb_cont_bottom_link));
                    element.click();
                    //Thread.sleep(2000);
                    //String body = driver.findElement(fb_link_body).getText();
                    //System.out.println(body);
                    Thread.sleep(2000);
                    driver.navigate().back();
                    WebElement element1 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(fb_cancel));
                    element1.click();
                    WebElement element3 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(facebook));
                    element3.click();
                    WebElement element2 = new WebDriverWait(driver, 30)
                            .until(driver -> driver.findElement(fb_continue));
                    element2.click();
                } catch (NoSuchElementException | TimeoutException e2) {
                    test6.log(LogStatus.SKIP, "FB continue button not visible");
                    test7.log(LogStatus.SKIP, "FB continue button not visible");
                }
            }
        }
    }

    public void verifyMobileNumber(String mobileNo) throws IOException {
        test6.log(LogStatus.INFO, "Ready to enter the valid Mobile Number");
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
            test6.log(LogStatus.PASS, "OTP page opened");
            test7.log(LogStatus.PASS, "OTP page opened");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.SKIP, "Mobile number field not visible");
            test7.log(LogStatus.SKIP, "Mobile number field not visible");
        }
    }

    public void setValidOTP(String First, String Second, String Third, String Fourth, String Fifth, String Sixth) throws InterruptedException, IOException {
        test6.log(LogStatus.INFO, "Ready to Pass the Valid OTP");
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
            test6.log(LogStatus.PASS, "Entered the valid OTP");
            test7.log(LogStatus.PASS, "Entered the valid OTP");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.SKIP, "OTP field not visible");
            test7.log(LogStatus.SKIP, "OTP field not visible");
        }
    }

    public void verifyUI(String H, String M, String C, String N, String mobileNo, String T) throws InterruptedException {
        test6.log(LogStatus.INFO, "Ready to verify the OTP Page");
        test7.log(LogStatus.INFO, "Ready to verify the OTP Page");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(verify_text));
            String header = element.getText();
            if (header.contains(H)) {
                test6.log(LogStatus.PASS, "Header Text showing as per the requirement : " + header);
                test7.log(LogStatus.PASS, "Header Text showing as per the requirement : " + header);
            } else if (header.contains(T)) {
                test6.log(LogStatus.PASS, "Header Text showing as per the requirement : " + header);
                test7.log(LogStatus.PASS, "Header Text showing as per the requirement : " + header);
            } else {
                test6.log(LogStatus.FAIL, "Header Text not showing for as per the requirement");
                test7.log(LogStatus.FAIL, "Header Text not showing for as per the requirement");
                getScreenshot("FB_UI_Header");
            }
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_field_head));
            String mobile = element1.getText();
            if (mobile.contains(M)) {
                test6.log(LogStatus.PASS, "Mobile Field Text showing as per the requirement");
                test7.log(LogStatus.PASS, "Mobile Field Text showing as per the requirement");
            } else {
                test6.log(LogStatus.FAIL, "Mobile Field Text not showing for as per the requirement");
                test7.log(LogStatus.FAIL, "Mobile Field Text not showing for as per the requirement");
                getScreenshot("FB_UI_MobileFieldText");
            }
            WebElement element2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(verify_country_code));
            String country = element2.getText();
            if (country.contains(C)) {
                test6.log(LogStatus.PASS, "Country Code showing as per the requirement : " + country);
                test7.log(LogStatus.PASS, "Country Code showing as per the requirement : " + country);
            } else {
                test6.log(LogStatus.WARNING, "Country Code not showing for as per the requirement : " + country);
                test7.log(LogStatus.WARNING, "Country Code not showing for as per the requirement : " + country);
                getScreenshot("FB_UI_CountryCode");
            }
            WebElement element3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(next_btn));
            String next = element3.getText();
            if (next.contains(N)) {
                test6.log(LogStatus.PASS, "Next button showing as per the requirement");
                test7.log(LogStatus.PASS, "Next button showing as per the requirement");
            } else {
                test6.log(LogStatus.FAIL, "Next button not showing for as per the requirement");
                test7.log(LogStatus.FAIL, "Next button not showing for as per the requirement");
                getScreenshot("FB_UI_NextButton");
            }
            try {
                WebElement element4 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(enter_number));
                element4.sendKeys(mobileNo);
                test6.log(LogStatus.PASS, "Entered the mobile number");
                test7.log(LogStatus.PASS, "Entered the mobile number");
                WebElement element5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(next_btn));
                element5.click();
            } catch (NoSuchElementException e) {
                test6.log(LogStatus.FAIL, "Can't able to pass the mobile number");
                test7.log(LogStatus.FAIL, "Can't able to pass the mobile number");
                getScreenshot("FB_MobNum");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.SKIP, "Default OTP Page visible");
            test7.log(LogStatus.SKIP, "Default OTP Page visible");
        }
    }

    public void confirmLocation(String L, String P) throws InterruptedException, IOException {
        test6.log(LogStatus.INFO, "Ready to configure the Location");
        test7.log(LogStatus.INFO, "Ready to configure the Location");
        try {
            WebElement element = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(loc_message));
            String loc = element.getText();
            if (loc.contains(L)) {
                test6.log(LogStatus.PASS, "Location text showing as per the requirement : " + loc);
                test7.log(LogStatus.PASS, "Location text showing as per the requirement : " + loc);
            } else {
                test6.log(LogStatus.FAIL, "Location text not showing as per the requirement : " + loc);
                test7.log(LogStatus.FAIL, "Location text not showing as per the requirement : " + loc);
                getScreenshot("FB_UI_LocationText");
            }
            if (P.contains("Allow")) {
                Thread.sleep(1000);
                driver.findElement(allow_loc).click();
            } else {
                Thread.sleep(1000);
                driver.findElement(deny_loc).click();
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Location permission screen not visible");
            test7.log(LogStatus.WARNING, "Location permission screen not visible");
            getScreenshot("FB_LocPer");
        }
    }

}
