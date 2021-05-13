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

import static IntegrationPages.TestBaseApp.getScreenshot;
import static IntegrationPages.TestBaseApp.test5;

public class FbUiPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By none_of_above = By.id("com.google.android.gms:id/cancel");
    By facebook = By.id("com.lifehope:id/image_facebook");
    By fb_app_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.widget.Image\n");
    By fb_text = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]\n");
    By fb_cont_app_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View\n");
    By fb_cont_text = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]\n");
    By fb_cont_bottom_text = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.TextView\n");
    By fb_cont_bottom_link = By.xpath("//android.view.View[@content-desc=\"Privacy Policy\"]/android.widget.TextView\n");
    By fb_cancel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button\n");

    public FbUiPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyFbContinuePageUi(String T, String H, String B, String L) throws InterruptedException, IOException {
        test5.log(LogStatus.INFO, "Ready to verify the Facebook signup page UI");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(none_of_above)).click();
            Thread.sleep(2000);
            driver.findElement(facebook).click();
        } catch (TimeoutException e) {
            //System.out.println("There is no Popup");
            Thread.sleep(2000);
            driver.findElement(facebook).click();
        }
        try {
            Thread.sleep(5000);
            if (driver.findElement(fb_app_logo).isDisplayed()) {
                test5.log(LogStatus.PASS, "App logo is Present on Fb Page");
            } else {
                test5.log(LogStatus.FAIL, "App logo is not Present on Fb Page");
                getScreenshot("FB_UI_AppLogo");
            }
            Thread.sleep(2000);
            String text = driver.findElement(fb_text).getText();
            if (text.contains(T)) {
                test5.log(LogStatus.PASS, "Text showing as per the requirement");
            } else {
                test5.log(LogStatus.FAIL, "Text not showing as per the requirement");
                getScreenshot("FB_UI_Text");
            }
            Thread.sleep(2000);
            driver.navigate().back();
        } catch (NoSuchElementException | IOException e) {
            try {
                Thread.sleep(5000);
                if (driver.findElement(fb_cont_app_logo).isDisplayed()) {
                    test5.log(LogStatus.PASS, "App logo is Present");
                } else {
                    test5.log(LogStatus.FAIL, "App logo is not Present");
                    getScreenshot("FB_UI_AppLogo");
                }
                Thread.sleep(2000);
                String text = driver.findElement(fb_cont_text).getText();
                if (text.contains(H)) {
                    test5.log(LogStatus.PASS, "Header Text showing as per the requirement");
                } else {
                    test5.log(LogStatus.FAIL, "Header Text not showing as per the requirement");
                    getScreenshot("FB_UI_HeadText");
                }
                Thread.sleep(2000);
                String bottomText = driver.findElement(fb_cont_bottom_text).getText();
                if (bottomText.contains(B)) {
                    test5.log(LogStatus.PASS, "Bottom Text showing as per the requirement");
                } else {
                    test5.log(LogStatus.FAIL, "Bottom Text not showing as per the requirement");
                    getScreenshot("FB_UI_BottomText");
                }
                Thread.sleep(2000);
                String linkText = driver.findElement(fb_cont_bottom_link).getText();
                if (linkText.contains(L)) {
                    test5.log(LogStatus.PASS, "Link Text showing as per the requirement");
                } else {
                    test5.log(LogStatus.FAIL, "Link Text not showing as per the requirement");
                    getScreenshot("FB_UI_LinkText");
                }
                Thread.sleep(2000);
                driver.findElement(fb_cancel).click();
            } catch (NoSuchElementException e1) {
                test5.log(LogStatus.FAIL, "FB continue button not visible");
                getScreenshot("FB_UI_ContBut");
            }
        }
    }

}
