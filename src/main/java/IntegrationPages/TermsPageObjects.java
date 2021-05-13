package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.*;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static IntegrationPages.TestBaseApp.getScreenshot;
import static IntegrationPages.TestBaseApp.test10;

public class TermsPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By none_of_above = By.id("com.google.android.gms:id/cancel");
    //By terms_cond = By.id("com.lifehope:id/text_privacy_policy");
    By back = By.id("com.lifehope:id/back_img");

    public TermsPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyPopup() {
        test10.log(LogStatus.INFO, "Ready to verify the Popup");
        try {
            //Thread.sleep(10000);
            //driver.findElement(none_of_above).click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(none_of_above)).click();
        } catch (TimeoutException e) {
            test10.log(LogStatus.SKIP, "There is no Popup");
        }
    }

    public void clickTerms() throws InterruptedException, IOException {
        test10.log(LogStatus.INFO, "Ready to click Terms and Condition");
        try {
            Thread.sleep(5000);
            TouchAction touchAction = new TouchAction(driver);
            touchAction.tap(PointOption.point((int) 430.0, (int) 1421.0)).perform();
            //touchAction.tap(new PointOption().withCoordinates((int) 629.4, (int) 2131.1)).perform();

            Thread.sleep(5000);
            driver.findElement(back).click();
        } catch (NoSuchElementException e) {
            test10.log(LogStatus.WARNING, "Terms and Condition link not present");
            getScreenshot("Login_TC");
        }
    }

}
