package AppPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static AppPages.AppTestBase.getScreenshot;
import static AppPages.AppTestBase.test4;

public class OtpPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By enter_otp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView\n");
    By time_count = By.id("com.lifehope:id/textViewTimeCounter");
    By resend_otp = By.id("com.lifehope:id/textViewResendCode");
    By verify_btn = By.id("com.lifehope:id/buttonVerify");
    By loc_message = By.id("com.android.permissioncontroller:id/permission_message");
    By allow_loc = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By deny_loc = By.id("com.android.permissioncontroller:id/permission_deny_button");
    //By toaster = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup\n");
    By gps_text = By.id("android:id/message");
    By gps_yes = By.id("android:id/button1");
    By gps_on = By.id("com.android.settings:id/switch_widget");

    public OtpPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void setWithOutOTP() throws InterruptedException, IOException {
        test4.log(LogStatus.INFO, "Ready to Pass the Empty values in the OTP Fields");
        try {
            WebElement element = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(verify_btn));
            element.click();
            getScreenshot("OTP_Empty_Toaster");
            try {
                WebElement element1 = new WebDriverWait(driver, 10)
                        .until(driver -> driver.findElement(allow_loc));
                if (element1.isDisplayed()) {
                    test4.log(LogStatus.FAIL, "OTP fields accepts the empty values");
                } else {
                    test4.log(LogStatus.PASS, "OTP fields doesn't accepts the empty values");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test4.log(LogStatus.PASS, "OTP fields doesn't accepts the empty values");
                //getScreenshot("OTP_Empty_Toaster");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "OTP page not visible");
            getScreenshot("OTP_UIPage");
        }
    }

    public void setInvalidOTP(String First, String Second, String Third, String Fourth, String Fifth, String Sixth) throws InterruptedException, IOException {
        test4.log(LogStatus.INFO, "Ready to Pass the Incorrect values in the OTP Fields");
        try {
            try {
                Thread.sleep(2000);
                driver.findElement(enter_otp).sendKeys(First, Second, Third, Fourth, Fifth, Sixth);
            } catch (NoSuchElementException e) {
                test4.log(LogStatus.FAIL, "Can't able to pass the values");
                getScreenshot("OTP_Issue");
            }
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(verify_btn));
            element.click();
            getScreenshot("OTP_Incorrect_Toaster");
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(allow_loc));
                if (element1.isDisplayed()) {
                    test4.log(LogStatus.FAIL, "OTP fields accepts the incorrect values");
                } else {
                    test4.log(LogStatus.PASS, "OTP fields doesn't accepts the incorrect values");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test4.log(LogStatus.PASS, "OTP fields doesn't accepts the incorrect values");
                //getScreenshot("OTP_Incorrect_Toaster");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "OTP field not visible");
            getScreenshot("OTP_Field");
        }
    }

    public void setValidOTP(String First, String Second, String Third, String Fourth, String Fifth, String Sixth) throws InterruptedException, IOException {
        test4.log(LogStatus.INFO, "Ready to Pass the Valid OTP");
        try {
            Thread.sleep(2000);
            driver.findElement(enter_otp).clear();
            Thread.sleep(1000);
            driver.findElement(enter_otp).clear();
//        Thread.sleep(1000);
//        driver.findElement(enter_otp).clear();
            Thread.sleep(2000);
            driver.findElement(enter_otp).sendKeys(First, Second, Third, Fourth, Fifth, Sixth);
            test4.log(LogStatus.PASS, "Entered the valid OTP");
        } catch (NoSuchElementException e) {
            test4.log(LogStatus.FAIL, "OTP field not visible");
            getScreenshot("OTP_Field");
        }
    }

    public void clickResendOTP(String First, String Second, String Third, String Fourth, String Fifth, String Sixth) throws InterruptedException, IOException {
        test4.log(LogStatus.INFO, "Ready to Click the Resend OTP");
        try {
            Thread.sleep(5000);
            if (driver.findElement(time_count).isDisplayed()) {
                Thread.sleep(5000);
            } else {
                Thread.sleep(2000);
            }
            driver.findElement(resend_otp).click();
            Thread.sleep(1000);
            driver.findElement(enter_otp).clear();
            Thread.sleep(1000);
            driver.findElement(enter_otp).clear();
            Thread.sleep(2000);
            driver.findElement(enter_otp).sendKeys(First, Second, Third, Fourth, Fifth, Sixth);
            test4.log(LogStatus.PASS, "Entered the valid OTP");
        } catch (NoSuchElementException e) {
            test4.log(LogStatus.SKIP, "Resend OTP Link not visible");
        }
    }

    public void clickVerify() {
        test4.log(LogStatus.INFO, "Ready to click Verify button");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(verify_btn));
            element.click();
            test4.log(LogStatus.PASS, "Clicked the Verify button");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.SKIP, "Verify button not visible");
        }
    }

    public void confirmLocation(String L, String P) throws InterruptedException, IOException {
        test4.log(LogStatus.INFO, "Ready to configure the Location");
        try {
            WebElement tcBox = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(loc_message));
            String loc = tcBox.getText();
            //System.out.println(loc);
            if (loc.contains(L)) {
                test4.log(LogStatus.PASS, "Location text showing as per the requirement : " + loc);
            } else {
                test4.log(LogStatus.FAIL, "Location text not showing as per the requirement : " + loc);
                getScreenshot("OTP_LocationText");
            }
            if (P.contains("Allow")) {
                Thread.sleep(1000);
                driver.findElement(allow_loc).click();
            } else {
                Thread.sleep(1000);
                driver.findElement(deny_loc).click();
            }
            try {
                WebElement gpsLoc = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(gps_yes));
                gpsLoc.click();
                WebElement gpsON = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(gps_on));
                gpsON.click();
                Thread.sleep(1000);
                driver.navigate().back();
            } catch (NoSuchElementException | TimeoutException e) {
                test4.log(LogStatus.SKIP, "Device location is already in ON state");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.SKIP, "Location permission not visible");
        }
    }

}
