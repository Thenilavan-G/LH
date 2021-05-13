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

public class MobileNumberSignupPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By none_of_above = By.id("com.google.android.gms:id/cancel");
    By mobile_number_field = By.id("com.lifehope:id/edittext_mobile_number");
    By number_popup = By.id("android:id/text1");
    By signup_button = By.id("com.lifehope:id/button_sign_up");
    By popup_header = By.id("com.lifehope:id/textview_header");
    By popup_msg = By.id("com.lifehope:id/textview_dialog_heading");
    By yes_btn = By.id("com.lifehope:id/button_proceed");
    By edit_btn = By.id("com.lifehope:id/button_cancel");
    By no_internet_text = By.id("com.lifehope:id/tv_title");
    By close_internet = By.id("com.lifehope:id/button_failure");
    By retry_internet = By.id("com.lifehope:id/button_success");

    public MobileNumberSignupPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void verifyPopup() {
        test2.log(LogStatus.INFO, "Ready to verify the Popup");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(none_of_above)).click();
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.SKIP, "Pop up not visible");
        }
        try {
            WebElement tcBox = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(close_internet));
            tcBox.click();
            test2.log(LogStatus.WARNING, "There is no Internet Connection");
            Thread.sleep(1000);
            tcBox.click();
            driver.closeApp();
            test2.log(LogStatus.WARNING, "App Closed");
        } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
            test2.log(LogStatus.SKIP, "Internet Connections are available");
        }
    }

    public void setMobileNumber(String mobileNo) throws IOException {
        test2.log(LogStatus.INFO, "Ready to enter the Mobile number");
        try {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOfElementLocated(none_of_above)).click();
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(mobile_number_field));
                element.sendKeys(mobileNo);
                test2.log(LogStatus.PASS, "Mobile number entered");
            } catch (TimeoutException e) {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(mobile_number_field));
                element.sendKeys(mobileNo);
                test2.log(LogStatus.PASS, "Mobile number entered");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Mobile number field not visible");
            getScreenshot("Login_MobField");
        }
    }

    public void clickSignup() throws IOException {
        test2.log(LogStatus.INFO, "Ready to click Signup button");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(signup_button));
            element.click();
            test2.log(LogStatus.PASS, "Clicked the Signup button");
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Signup button not visible");
            getScreenshot("Login_SignButton");
        }
    }

    public void verifyPopupUi(String H, String M, String E, String Y) throws InterruptedException, IOException {
        test2.log(LogStatus.INFO, "Ready to verify the Number confirmation Popup UI");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(popup_header));
            String head = element.getText();
            //System.out.println(head);
            if (head.contains(H)) {
                test2.log(LogStatus.PASS, "Popup header text showing as per the requirement : " + head);
            } else {
                test2.log(LogStatus.WARNING, "Popup header text not showing as per the requirement : " + head);
                getScreenshot("Login_UI_Popup");
            }
            WebElement element2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(popup_msg));
            String msg = element2.getText();
            //System.out.println(msg);
            if (msg.contains(M)) {
                test2.log(LogStatus.PASS, "Popup message text showing as per the requirement : " + msg);
            } else {
                test2.log(LogStatus.INFO, "Popup message text not showing as per the requirement : " + msg);
                getScreenshot("Login_UI_PopupMsg");
            }
            WebElement element3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(edit_btn));
            String edit = element3.getText();
            //System.out.println(edit);
            if (edit.contains(E)) {
                test2.log(LogStatus.PASS, "Popup edit button text showing as per the requirement : " + edit);
            } else {
                test2.log(LogStatus.FAIL, "Popup edit button text not showing as per the requirement : " + edit);
                getScreenshot("Login_UI_PopupEdit");
            }
            WebElement element4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(yes_btn));
            String yes = element4.getText();
            //System.out.println(yes);
            if (yes.contains(Y)) {
                test2.log(LogStatus.PASS, "Popup yes button text showing as per the requirement : " + yes);
            } else {
                test2.log(LogStatus.FAIL, "Popup yes button text not showing as per the requirement : " + yes);
                getScreenshot("Login_UI_PopupYes");
            }
            driver.findElement(edit_btn).click();
            WebElement element6 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_number_field));
            element6.clear();
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Login ui screen not visible");
            getScreenshot("Login_UIScreen");
        }
    }

    public void validateMobileField() throws InterruptedException, IOException {
        test2.log(LogStatus.INFO, "Ready to validate the Mobile Number Field");
        try {
            test2.log(LogStatus.INFO, "Enter greater than 10 numeric values");
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_number_field));
            element.sendKeys("111111111111");
            Thread.sleep(1000);
            driver.navigate().back();
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_number_field));
            String mobText = element1.getText();
            //System.out.println(mobText);
            test2.log(LogStatus.PASS, "Accepted numeric values : " + mobText);
            if (mobText.equals("(111) 111-1111")) {
                test2.log(LogStatus.PASS, "It accepts only 10 numeric values");
            } else {
                test2.log(LogStatus.FAIL, "It accepts above 10 numeric values");
            }
            WebElement element2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(signup_button));
            element2.click();
            getScreenshot("Login_UI_Mob_Great_Val");
            try {
                WebElement element3 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(edit_btn));
                if (element3.isDisplayed()) {
                    //System.out.println("Mobile number accepted");
                    test2.log(LogStatus.PASS, "Mobile number is valid");
                    WebElement element4 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(edit_btn));
                    element4.click();
                } else {
                    //System.out.println("Mobile number not accepted");
                    test2.log(LogStatus.FAIL, "Mobile number is not valid");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test2.log(LogStatus.INFO, "It doesn't allow to the next step");
            }
            WebElement element3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_number_field));
            element3.clear();
            test2.log(LogStatus.INFO, "Enter less than 10 numeric values");
            driver.findElement(mobile_number_field).sendKeys("111111111");
            Thread.sleep(1000);
            driver.navigate().back();
            WebElement element4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_number_field));
            String mobText1 = element4.getText();
            //System.out.println(mobText1);
            test2.log(LogStatus.PASS, "Accepted numeric values : " + mobText1);
            WebElement element5 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(signup_button));
            element5.click();
            getScreenshot("Login_UI_Mob_Less_Val");
            try {
                WebElement element6 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(edit_btn));
                if (element6.isDisplayed()) {
                    //System.out.println("Mobile number accepted");
                    test2.log(LogStatus.FAIL, "Mobile number is valid");
                    WebElement element7 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(edit_btn));
                    element7.click();
                } else {
                    //System.out.println("Mobile number not accepted");
                    test2.log(LogStatus.PASS, "Mobile number is not valid");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test2.log(LogStatus.INFO, "It doesn't allow to the next step");
            }
            WebElement element6 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_number_field));
            element6.clear();
            test2.log(LogStatus.INFO, "Enter special characters");
            driver.findElement(mobile_number_field).sendKeys("..........");
            WebElement element7 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(mobile_number_field));
            String mobText2 = element7.getText();
            //System.out.println(mobText2);
            test2.log(LogStatus.PASS, "Accepted special characters : " + mobText2);
            if (mobText.contains("null")) {
                test2.log(LogStatus.PASS, "It doesn't accept the Special Characters");
            } else {
                test2.log(LogStatus.WARNING, "It accepts the Special Characters");
            }
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(2000);
            WebElement element8 = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(signup_button));
            element8.click();
            getScreenshot("Login_UI_Mob_Spec_Val");
            try {
                WebElement element9 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(edit_btn));
                if (element9.isDisplayed()) {
                    //System.out.println("Mobile number accepted");
                    test2.log(LogStatus.FAIL, "Mobile number is valid");
                    WebElement element10 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(edit_btn));
                    element10.click();
                } else {
                    //System.out.println("Mobile number not accepted");
                    test2.log(LogStatus.PASS, "Mobile number is not valid");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test2.log(LogStatus.INFO, "It doesn't allow to the next step");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Mobile number field not visible");
            getScreenshot("Login_MobileField");
        }
    }

    public void verifyMobileNumber(String mobileNo) throws InterruptedException, IOException {
        test2.log(LogStatus.INFO, "Ready to enter the valid Mobile Number");
        try {
            driver.hideKeyboard();
            WebElement tcBo = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(mobile_number_field));
            tcBo.click();
            try {
                WebElement tcBox = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(number_popup));
                tcBox.click();
                WebElement tcBox1 = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(number_popup));
                tcBox1.clear();
            } catch (NoSuchElementException | TimeoutException e) {
                //System.out.println("Number popup not displayed");
            }
            WebElement tcBox = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(mobile_number_field));
            tcBox.sendKeys(mobileNo);
            driver.hideKeyboard();
//            Thread.sleep(2000);
//            driver.navigate().back();
            WebElement tcBox1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(signup_button));
            tcBox1.click();
            WebElement tcBox2 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(yes_btn));
            tcBox2.click();
            test2.log(LogStatus.PASS, "OTP page opened");
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Mobile number field not visible");
            getScreenshot("Login_MField");
        }
    }

}
