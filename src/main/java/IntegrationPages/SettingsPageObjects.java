package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static IntegrationPages.TestBaseAdmin.*;

public class SettingsPageObjects {

    private final WebDriver driver;
    By L_icon = By.xpath("//app-header-profile/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]");
    By lifehopehealth_dropdown = By.xpath("//button[@id='button-basic']");
    By editprofile = By.xpath("//app-header-profile/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]");
    By admin_header = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-user-settings[1]/section[1]/div[1]/div[1]/div[1]/h3[1]");
    By first_name = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-user-settings[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/label[1]");
    By firstname_field= By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-user-settings[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
    By last_name = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-user-settings[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/label[1]");
    By lastname_field = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-user-settings[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By email = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-user-settings[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/label[1]");
    By email_field = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-user-settings[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
    By submit = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-user-settings[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");
    By changepassword = By.xpath("//app-header-profile/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]");
    By password_header = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-change-password[1]/section[1]/div[1]/div[1]/div[1]/h3[1]");
    By newpswd_header = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-change-password[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/label[1]");
    By newpswd_field = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-change-password[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
    By confirmpswd_header = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-change-password[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/label[1]");
    By confirmpswd_field = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-change-password[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By submit_1 = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-change-password[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");
    By logout = By.xpath("//app-header-profile/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");

    private Object IOException;

    public SettingsPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void setLIcon() throws IOException {
        try {
            WebElement Licon = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(L_icon));
            String test = Licon.getText();
            if (test == null) {
                test7.log(LogStatus.FAIL, "L_icon is not displayed : " + test);
                getScreenshot("L_icon");
            } else {
                test7.log(LogStatus.PASS, "L_icon is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test7.log(LogStatus.FAIL, "L_icons not displayed");
            getScreenshot("L_icon");
        }
    }

    public void setLifeHopeHealthDropdown() throws IOException, InterruptedException {
        Thread.sleep(5000);
        try {
            WebElement view = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(lifehopehealth_dropdown));
            if (view.isDisplayed()) {
                driver.findElement(lifehopehealth_dropdown).click();
                test7.log(LogStatus.PASS, "Clicked the lifehopehealth_dropdown");
            } else {
                test7.log(LogStatus.FAIL, "lifehopehealth_dropdown is not clicked ");
                getScreenshot("life hope health_dropdown");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test7.log(LogStatus.WARNING, "lifehopehealth_dropdown is not clicked");
            getScreenshot("life hope health_dropdown");
        }
    }

    public void setEditProfile() throws IOException, InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement view = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(editprofile));
            if (view.isDisplayed()) {
                driver.findElement(editprofile).click();
                test7.log(LogStatus.PASS, "Clicked the Edit profile option");
            } else {
                test7.log(LogStatus.FAIL, "Edit profile option is not clicked ");
                getScreenshot("Editprofile_option");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test7.log(LogStatus.WARNING, "Edit profile option is not clicked");
            getScreenshot("Editprofile_option");
        }
    }

    public void setAdminHeader() throws IOException {
        try {
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(admin_header));
            String test = admin.getText();
            if (test == null) {
                test7.log(LogStatus.FAIL, "admin_header is not displayed: " + test);
                getScreenshot("admin_header");
            } else {
                test7.log(LogStatus.PASS, "admin_header is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test7.log(LogStatus.FAIL, "admin_header is not displayed");
            getScreenshot("admin_header");
        }
    }

    public void setFirstName() throws IOException {

        try {
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(first_name));
            String test = admin.getText();
            if (test == null) {
                test7.log(LogStatus.FAIL, "First Name header is not displayed: " + test);
                getScreenshot("FN_header");
            } else {
                test7.log(LogStatus.PASS, "First Name header is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test7.log(LogStatus.FAIL, "First Name header is not displayed");
            getScreenshot("FN_header");
        }
    }

    public void setFirstNameField() throws InterruptedException {
        try{
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(firstname_field));
            test7.log(LogStatus.INFO, "Clear the first name field");
            Thread.sleep(2000);
            driver.findElement(firstname_field).clear();
            test7.log(LogStatus.PASS,"First name field cleared successfully");
            Thread.sleep(2000);
            test7.log(LogStatus.INFO, " Enter the data in first name field");
            driver.findElement(firstname_field).sendKeys("Life Hope");
            test7.log(LogStatus.PASS," First name data entered successfully");
        }catch(NoSuchElementException | TimeoutException e){
            test7.log(LogStatus.FAIL, " First name field is not cleared and entered ");
        }
    }

    public void setLastName() throws IOException {

        try {
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(last_name));
            String test = admin.getText();
            if (test == null) {
                test7.log(LogStatus.FAIL, "Last Name header is not displayed: " + test);
                getScreenshot("LN_header");
            } else {
                test7.log(LogStatus.PASS, "Last Name header is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test7.log(LogStatus.FAIL, "First Name header is not displayed");
            getScreenshot("LN_header");
        }
    }

    public void setLastNameField() throws InterruptedException {
        try{
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(lastname_field));
            test7.log(LogStatus.INFO, "Clear the last name field");
            Thread.sleep(2000);
            driver.findElement(lastname_field).clear();
            test7.log(LogStatus.PASS,"last name field cleared successfully");
            Thread.sleep(2000);
            test7.log(LogStatus.INFO, " Enter the data in last name field");
            driver.findElement(lastname_field).sendKeys("Health");
            test7.log(LogStatus.PASS," Last name data entered successfully");
        }catch(NoSuchElementException | TimeoutException e){
            test7.log(LogStatus.FAIL, " Last name field is not cleared and entered ");
        }
    }

    public void setEmail() throws IOException {

        try {
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(email));
            String test = admin.getText();
            if (test == null) {
                test7.log(LogStatus.FAIL, "Email header is not displayed: " + test);
                getScreenshot("email_header");
            } else {
                test7.log(LogStatus.PASS, "Email header is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test7.log(LogStatus.FAIL, "Email header is not displayed");
            getScreenshot("email_header");
        }
    }

    public void setEmailField() throws IOException {
        try {
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(email_field));
            String test = admin.getText();
            if (test == null) {
                test7.log(LogStatus.FAIL, "Email field text is not displayed: " + test);
                getScreenshot("email_text");
            } else {
                test7.log(LogStatus.PASS, "Email field text is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException | java.io.IOException e) {
            test7.log(LogStatus.FAIL, "Email field text is not displayed");
            getScreenshot("email_text");
        }
    }

    public void setSubmit() throws IOException, InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement view = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(submit));
            if (view.isDisplayed()) {
                driver.findElement(submit).click();
                test7.log(LogStatus.PASS, "Clicked the submit button");
            } else {
                test7.log(LogStatus.FAIL, "submit button is not clicked ");
                getScreenshot("submit_button");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test7.log(LogStatus.WARNING, "submit button is not clicked");
            getScreenshot("submit_button");
        }
    }

    public void setChangePassword() throws IOException, InterruptedException {
        Thread.sleep(3000);
        try {
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(changepassword));
            if (admin.isDisplayed()) {
                driver.findElement(changepassword).click();
                test7.log(LogStatus.PASS, "Change Password is clicked");
            } else {
                test7.log(LogStatus.FAIL, "Change Password is not clicked");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test7.log(LogStatus.FAIL, "Change Password is not clicked");
            getScreenshot("changepassword_option");
        }
    }

    public void setPasswordHeader() throws IOException {

        try {
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(password_header));
            String test = admin.getText();
            if (test == null) {
                test7.log(LogStatus.FAIL, "Password header is not displayed: " + test);
                getScreenshot("password_header");
            } else {
                test7.log(LogStatus.PASS, "Password header is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test7.log(LogStatus.FAIL, "Password header is not displayed");
            getScreenshot("password_header");
        }
    }

    public void setNewPassHeader() throws IOException {

        try {
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(newpswd_header));
            String test = admin.getText();
            if (test == null) {
                test7.log(LogStatus.FAIL, "New Password header is not displayed: " + test);
                getScreenshot("Newpassword_header");
            } else {
                test7.log(LogStatus.PASS, "New Password header is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test7.log(LogStatus.FAIL, "New Password header is not displayed");
            getScreenshot("Newpassword_header");
        }
    }

    public void setNewPassField() {
        try{
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(newpswd_field));
            test7.log(LogStatus.INFO, "enter the password text in the field");
            Thread.sleep(2000);
            driver.findElement(newpswd_field).sendKeys("Qwerty@123");
            test7.log(LogStatus.PASS,"password text entered successfully");
            Thread.sleep(2000);
            test7.log(LogStatus.INFO, " clear the data in password field");
            driver.findElement(newpswd_field).clear();
            test7.log(LogStatus.PASS,"Data cleared in password field");
        }catch(NoSuchElementException | TimeoutException | InterruptedException e){
            test7.log(LogStatus.FAIL, " Data not cleared in password field ");
        }
    }

    public void setConfirmPassHeader() throws IOException {

        try {
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(confirmpswd_header));
            String test = admin.getText();
            if (test == null) {
                test7.log(LogStatus.FAIL, "Confirm Password header is not displayed: " + test);
                getScreenshot("Confirmpassword_header");
            } else {
                test7.log(LogStatus.PASS, "Confirm Password header is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test7.log(LogStatus.FAIL, "Confirm Password header is not displayed");
            getScreenshot("Confirmpassword_header");
        }
    }

    public void setConfirmPassField() {
        try{
            WebElement admin = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(confirmpswd_field));
            test7.log(LogStatus.INFO, "enter the Confirm  password text in the field");
            Thread.sleep(2000);
            driver.findElement(confirmpswd_field).sendKeys("Qwerty@123");
            test7.log(LogStatus.PASS,"Confirm  password text entered successfully");
            Thread.sleep(2000);
            test7.log(LogStatus.INFO, " clear the data in Confirm password field");
            driver.findElement(confirmpswd_field).clear();
            test7.log(LogStatus.PASS,"Data cleared in Confirm  password field");
        }catch(NoSuchElementException | TimeoutException | InterruptedException e){
            test7.log(LogStatus.FAIL, " Data not cleared in Confirm password field ");
        }
    }

    public void setSubmit1() throws IOException, InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement view = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(submit_1));
            if (view.isDisplayed()) {
                driver.findElement(submit_1).click();
                test7.log(LogStatus.PASS, "Clicked the submit button");
            } else {
                test7.log(LogStatus.FAIL, "submit button is not clicked ");
                getScreenshot("submit_button");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test7.log(LogStatus.WARNING, "submit button is not clicked");
            getScreenshot("submit_button");
        }
    }

    public void setLogout() throws IOException, InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement view = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(logout));
            if (view.isDisplayed()) {
                driver.findElement(logout).click();
                test7.log(LogStatus.PASS, "Clicked the logout option");
            } else {
                test7.log(LogStatus.FAIL, "logout option is not clicked ");
                getScreenshot("logout_option");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test7.log(LogStatus.WARNING, "logout_option is not clicked");
            getScreenshot("logout_option");
        }
    }

}