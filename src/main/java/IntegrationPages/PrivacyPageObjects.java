package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static IntegrationPages.TestBaseApp.*;

public class PrivacyPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By none_of_above = By.id("com.google.android.gms:id/cancel");
    By back = By.id("com.lifehope:id/back_img");

    public PrivacyPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyPopup() {
        test10.log(LogStatus.INFO, "Ready to verify the Popup");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(none_of_above)).click();
        } catch (TimeoutException e) {
            test10.log(LogStatus.SKIP, "There is no pop up");
        }
    }

    public void clickPrivacy() throws InterruptedException, IOException {
        test10.log(LogStatus.INFO, "Ready to click Privacy Policy");
        try {
            Thread.sleep(5000);
            TouchAction touchAction = new TouchAction(driver);
            touchAction.tap(PointOption.point((int) 600.0, (int) 1421.0)).perform();
            //touchAction.tap(new PointOption().withCoordinates((int) 629.4, (int) 2131.1)).perform();

            Thread.sleep(5000);
            driver.findElement(back).click();
        } catch (NoSuchElementException e) {
            test10.log(LogStatus.WARNING, "Privacy Policy link not visible");
            getScreenshot("Login_PVP");
        }
    }

}
