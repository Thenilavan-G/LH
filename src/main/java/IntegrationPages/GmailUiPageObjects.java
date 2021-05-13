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

public class GmailUiPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By none_of_above = By.id("com.google.android.gms:id/cancel");
    By google = By.id("com.lifehope:id/image_google");
    By gmail_app_logo = By.id("com.google.android.gms:id/app_icon");
    By gmail_text = By.id("com.google.android.gms:id/subtitle");
    By gmail_bottom_text = By.id("com.google.android.gms:id/consent_text");

    public GmailUiPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyAppLogo() throws InterruptedException, IOException {
        test8.log(LogStatus.INFO, "Ready to verify the App logo");
        try {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOfElementLocated(none_of_above)).click();
                Thread.sleep(2000);
                driver.findElement(google).click();
            } catch (TimeoutException e) {
                test8.log(LogStatus.SKIP, "Pop up not visible");
                Thread.sleep(2000);
                driver.findElement(google).click();
                test8.log(LogStatus.PASS, "Clicked the Gmail module");
            }
            Thread.sleep(8000);
            if (driver.findElement(gmail_app_logo).isDisplayed()) {
                test8.log(LogStatus.PASS, "App logo present as per the requirement");
            } else {
                test8.log(LogStatus.FAIL, "App logo not present");
                getScreenshot("Gmail_UI_AppLogos");
            }
        } catch (NoSuchElementException e) {
            test8.log(LogStatus.FAIL, "App logo not present");
            getScreenshot("Gmail_UI_AppLogos");
        }
    }

    public void verifyText(String H) throws InterruptedException, IOException {
        test8.log(LogStatus.INFO, "Ready to verify the text");
        try {
            Thread.sleep(2000);
            String Header = driver.findElement(gmail_text).getText();
            if (Header.contains(H)) {
                test8.log(LogStatus.PASS, "Header text showing as per the requirement");
            } else {
                test8.log(LogStatus.FAIL, "Header text not shown as per the requirement");
                getScreenshot("Gmail_UI_HeaderText");
            }
        } catch (NoSuchElementException e) {
            test8.log(LogStatus.FAIL, "Header text not present");
            getScreenshot("Gmail_UI_HeaderText");
        }
    }

    public void verifyBottomText(String B) throws InterruptedException, IOException {
        test8.log(LogStatus.INFO, "Ready to verify the bottom text");
        try {
            Thread.sleep(2000);
            String Bottom = driver.findElement(gmail_bottom_text).getText();
            if (Bottom.contains(B)) {
                test8.log(LogStatus.PASS, "Bottom text showing as per the requirement");
            } else {
                test8.log(LogStatus.FAIL, "Bottom text not showing as per the requirement");
                getScreenshot("Gmail_UI_BottomText");
            }
            Thread.sleep(2000);
            driver.navigate().back();
        } catch (NoSuchElementException e) {
            test8.log(LogStatus.FAIL, "Bottom text not present");
            getScreenshot("Gmail_UI_BottomText");
        }
    }

}
