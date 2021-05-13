package AppPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static AppPages.AppTestBase.getScreenshot;
import static AppPages.AppTestBase.test21;

public class LeftMenuPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By dashboard_menu = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    By contact_support = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView");
    // By text_feild = By.id("app-conversation-editor");
    //By text_feild = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.view.View/android.widget.EditText");
    //By text_feild = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.view.View/android.widget.EditText");
    //By attachment_icon = By.xpath("(//android.view.View[@content-desc=\"#\"])[2]/android.view.View/android.view.View/android.view.View");
    //By select_image = By.xpath("//android.widget.LinearLayout[@content-desc=\"20210104_153352.jpg, 1.05 MB, 4 Jan\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView");
    // By attachment_close_btn = ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[3]/android.view.View[2]");
    //By send_icon = By.xpath("(//android.view.View[@content-desc=\"#\"])[1]/android.view.View/android.view.View/android.view.View");
    By back_icon = By.id("com.lifehope:id/back_img");
    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.ImageView
    By Terms_and_conditions = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView");
    By back_icon3 = By.id("com.lifehope:id/back_img");
    By privacy_policy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView");
    By back_icon2 = By.id("com.lifehope:id/back_img");
    By logout = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView");
    By yes_btn = By.id("com.lifehope:id/button_proceed");
    ///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]
    //By cancel_btn = By.id("com.lifehope:id/button_cancel");
    ///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[1]

    public LeftMenuPageObjects(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void clickDashboardMenu() throws IOException {
        test21.log(LogStatus.INFO, "Ready to click the Menu icon");
        try {
            WebElement element = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(dashboard_menu));
            element.click();
            test21.log(LogStatus.PASS, "Menu icon Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test21.log(LogStatus.FAIL, "Dashboard icon not visible");
            getScreenshot("LM_Dash");
        }
    }

    public void clickContactSupport() throws InterruptedException, IOException {
        test21.log(LogStatus.INFO, "Verifying the Contact Support option");
        try {
            clickDashboardMenu();
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(contact_support));
            element.click();
            test21.log(LogStatus.PASS, "Contact Support option Clicked");
            Thread.sleep(12000);
            driver.findElement(back_icon).click();
        } catch (NoSuchElementException | TimeoutException e) {
            test21.log(LogStatus.FAIL, "Contact Support option not visible");
            getScreenshot("LM_ContSup");
        }
    }

//    public void sendMsg(String txt1) throws InterruptedException, IOException {
//            test21.log(LogStatus.INFO, "Ready to enter the message ");
//        try {
//            Thread.sleep(5000);
//            driver.findElement(text_feild).sendKeys(txt1);
//            Thread.sleep(5000);
//        } catch (NoSuchElementException e) {
//            test21.log(LogStatus.FAIL, "Text field not visible");
//            getScreenshot("LM_TextField");
//        }
//    }

//    public void sendAttachment() throws InterruptedException, IOException {
//    test21.log(LogStatus.INFO, "Ready to send attachment ");
//        try {
//            Thread.sleep(2000);
//            driver.findElement(attachment_icon).click();
//            Thread.sleep(5000);
//            driver.findElement(select_image).click();
//            Thread.sleep(5000);
//            //driver.findElement(send_icon).click();
//            //Thread.sleep(5000);
//            driver.findElement(back_icon).click();
//        } catch (NoSuchElementException e) {
//            test21.log(LogStatus.FAIL, "Attachment icon not visible");
//            getScreenshot("LM_AttIcon");
//        }
//    }

    public void clickTermsAndConditions() throws InterruptedException, IOException {
        test21.log(LogStatus.INFO, "Verifying the Terms and Conditions option");
        try {
            clickDashboardMenu();
            WebElement element = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(Terms_and_conditions));
            element.click();
            test21.log(LogStatus.PASS, "Terms and Conditions option Clicked");
            Thread.sleep(5000);
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
            WebElement element1 = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(back_icon3));
            element1.click();
        } catch (NoSuchElementException | TimeoutException e) {
            test21.log(LogStatus.FAIL, "Terms and Conditions not visible");
            getScreenshot("LM_TC");
        }
    }

    public void clickPrivacyPolicy() throws InterruptedException, IOException {
        test21.log(LogStatus.INFO, "Verifying Privacy Policy option");
        try {
            clickDashboardMenu();
            WebElement element = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(privacy_policy));
            element.click();
            test21.log(LogStatus.PASS, "Privacy Policy option Clicked");
            Thread.sleep(5000);
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
            WebElement element1 = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(back_icon2));
            element1.click();
        } catch (NoSuchElementException | TimeoutException e) {
            test21.log(LogStatus.FAIL, "Privacy Policy not visible");
            getScreenshot("LM_PV");
        }
    }

    public void Logout() throws IOException {
        test21.log(LogStatus.INFO, "Verifying the Logout option");
        try {
            clickDashboardMenu();
            WebElement element = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(logout));
            element.click();
            test21.log(LogStatus.PASS, "Logout option clicked");
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(yes_btn));
            element1.click();
            test21.log(LogStatus.PASS, "Logout successfully");
        } catch (NoSuchElementException | TimeoutException e) {
            test21.log(LogStatus.FAIL, "Logout option not visible");
            getScreenshot("LM_Logout");
        }
    }

}



