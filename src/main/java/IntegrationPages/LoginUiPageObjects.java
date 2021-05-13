package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static IntegrationPages.TestBaseApp.*;

public class LoginUiPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By none_of_above = By.id("com.google.android.gms:id/cancel");
    By header = By.id("com.lifehope:id/text_heading");
    By mobile_no = By.id("com.lifehope:id/edittext_mobile_number");
    By signup_button = By.id("com.lifehope:id/button_sign_up");
    By facebook = By.id("com.lifehope:id/image_facebook");
    By google = By.id("com.lifehope:id/image_google");
    By bottom_text = By.id("com.lifehope:id/text_privacy_policy");

    public LoginUiPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyPopup() {
        test1.log(LogStatus.INFO, "Ready to verify the Popup");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(none_of_above)).click();
        } catch (NoSuchElementException e) {
            test1.log(LogStatus.SKIP, "Pop up not visible");
        }
    }

    public void verifyHeader(String H) throws InterruptedException, IOException {
        test1.log(LogStatus.INFO, "Ready to verify the header text");
        try {
            Thread.sleep(2000);
            String Header = driver.findElement(header).getText();
            //System.out.println(Header);
            if (Header.contains(H)) {
                test1.log(LogStatus.PASS, "Header text shown as per the requirement : " + Header);
            } else {
                test1.log(LogStatus.FAIL, "Header text not shown as per the requirement : " + Header);
                getScreenshot("Login_UI_HeaderText");
            }
        } catch (NoSuchElementException e) {
            test1.log(LogStatus.FAIL, "Header text not shown");
            getScreenshot("Login_UI_HeaderText");
        }
    }

    public void verifyMobileNumberField(String M) throws InterruptedException, IOException {
        test1.log(LogStatus.INFO, "Ready to verify the Mobile Number Field Text");
        try {
            Thread.sleep(2000);
            String Mobile = driver.findElement(mobile_no).getText();
            //System.out.println(Mobile);
            if (Mobile.contains(M)) {
                test1.log(LogStatus.PASS, "Mobile Number text shown as per the requirement : " + Mobile);
            } else {
                test1.log(LogStatus.FAIL, "Mobile Number text not shown as per the requirement : " + Mobile);
                getScreenshot("Login_UI_MobileNumField");
            }
        } catch (NoSuchElementException e) {
            test1.log(LogStatus.FAIL, "Mobile Number text not shown");
            getScreenshot("Login_UI_MobileNumField");
        }
    }

    public void verifySignupButton(String S) throws InterruptedException, IOException {
        test1.log(LogStatus.INFO, "Ready to verify the Signup button text");
        try {
            Thread.sleep(2000);
            String Signup = driver.findElement(signup_button).getText();
            //System.out.println(Signup);
            if (Signup.contains(S)) {
                test1.log(LogStatus.PASS, "Signup button text shown as per the requirement : " + Signup);
            } else {
                test1.log(LogStatus.FAIL, "Signup button text not shown as per the requirement : " + Signup);
                getScreenshot("Login_UI_Signup_Button");
            }
        } catch (NoSuchElementException e) {
            test1.log(LogStatus.FAIL, "Signup button text not shown");
            getScreenshot("Login_UI_Signup_Button");
        }
    }

    public void verifyFacebookLogo() throws InterruptedException, IOException {
        test1.log(LogStatus.INFO, "Ready to verify the Facebook Logo");
        try {
            Thread.sleep(2000);
            if (driver.findElement(facebook).isDisplayed()) {
                test1.log(LogStatus.PASS, "Facebook Logo shown as per the requirement");
            } else {
                test1.log(LogStatus.FAIL, "Facebook Logo not shown as per the requirement");
                getScreenshot("Login_UI_FBLogo");
            }
        } catch (NoSuchElementException e) {
            test1.log(LogStatus.FAIL, "Facebook Logo not shown");
            getScreenshot("Login_UI_FBLogo");
        }
    }

    public void verifyGmailLogo() throws InterruptedException, IOException {
        test1.log(LogStatus.INFO, "Ready to verify the Gmail Logo");
        try {
            Thread.sleep(2000);
            if (driver.findElement(google).isDisplayed()) {
                test1.log(LogStatus.PASS, "Gmail Logo shown as per the requirement");
            } else {
                test1.log(LogStatus.FAIL, "Gmail Logo not shown as per the requirement");
                getScreenshot("Login_UI_GmailLogo");
            }
        } catch (NoSuchElementException e) {
            test1.log(LogStatus.FAIL, "Gmail Logo not shown");
            getScreenshot("Login_UI_GmailLogo");
        }
    }

    public void verifyBottomText(String B) throws InterruptedException, IOException {
        test1.log(LogStatus.INFO, "Ready to verify the Bottom text");
        try {
            Thread.sleep(2000);
            String Bottom = driver.findElement(bottom_text).getText();
            //System.out.println(Bottom);
            if (Bottom.contains(B)) {
                test1.log(LogStatus.PASS, "Bottom text shown as per the requirement : " + Bottom);
            } else {
                test1.log(LogStatus.FAIL, "Bottom text not shown as per the requirement : " + Bottom);
                getScreenshot("Login_UI_BottomText");
            }
        } catch (NoSuchElementException e) {
            test1.log(LogStatus.FAIL, "Bottom text not shown");
            getScreenshot("Login_UI_BottomText");
        }
    }

}