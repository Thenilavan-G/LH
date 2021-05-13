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

import static AppPages.AppTestBase.*;

public class OtpUiPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By header_msg = By.id("com.lifehope:id/textViewHeading");
    By body_msg = By.id("com.lifehope:id/textViewMobileNumber");
    By time_count = By.id("com.lifehope:id/textViewTimeCounter");
    By resend_otp = By.id("com.lifehope:id/textViewResendCode");
    By verify_btn = By.id("com.lifehope:id/buttonVerify");

    public OtpUiPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyHeader(String H) throws InterruptedException, IOException {
        test3.log(LogStatus.INFO, "Ready to verify the text message");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(header_msg));
            String head = element.getText();
            if (head.contains(H)) {
                test3.log(LogStatus.PASS, "Text message shown as per the requirement : " + head);
            } else {
                test3.log(LogStatus.WARNING, "Text message not shown as per the requirement : " + head);
                getScreenshot("OTP_UI_Header");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test3.log(LogStatus.FAIL, "Text message field not visible");
            getScreenshot("OTP_TMField");
        }
    }

    public void verifyMobileNumberField(String M, String R) throws InterruptedException, IOException {
        test3.log(LogStatus.INFO, "Ready to verify the OTP field");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(body_msg));
            String msg = element.getText();
            if (msg.contains(M)) {
                test3.log(LogStatus.PASS, "Message text shown as per the requirement : " + msg);
            } else {
                test3.log(LogStatus.FAIL, "Message text not shown as per the requirement : " + msg);
                getScreenshot("OTP_UI_MessageText");
            }
            Thread.sleep(2000);
            if (driver.findElement(time_count).isDisplayed()) {
                String timer = driver.findElement(time_count).getText();
                test3.log(LogStatus.SKIP, "Timer count is : " + timer);
            } else {
                Thread.sleep(2000);
                String resend = driver.findElement(resend_otp).getText();
                if (resend.contains(R)) {
                    test3.log(LogStatus.PASS, "Resend message text shown as per the requirement : " + resend);
                } else {
                    test3.log(LogStatus.FAIL, "Resend message text not shown as per the requirement : " + resend);
                    getScreenshot("OTP_UI_ResendText");
                }
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test3.log(LogStatus.FAIL, "OTP field not visible");
            getScreenshot("OTP_MNField");
        }
    }

    public void verifyButton(String V) throws IOException {
        test3.log(LogStatus.INFO, "Ready to verify the Submit Button");
        try {
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(verify_btn));
            String verify = element.getText();
            if (verify.contains(V)) {
                test3.log(LogStatus.PASS, "Submit Button shown as per the requirement : " + verify);
            } else {
                test3.log(LogStatus.FAIL, "Submit Button shown as per the requirement : " + verify);
                getScreenshot("OTP_UI_VerifyButton");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test3.log(LogStatus.FAIL, "Verify button not visible");
            getScreenshot("OTP_VeryBt");
        }
    }

}
