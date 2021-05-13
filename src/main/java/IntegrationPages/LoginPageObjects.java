package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

import static IntegrationPages.TestBaseAdmin.getScreenshot;
import static IntegrationPages.TestBaseAdmin.test1;
import static org.testng.Assert.assertEquals;

public class LoginPageObjects {

    private final WebDriver driver;

    By desc = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[1]/div/h4");
    By image = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[1]/div/img");
    By logo = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[2]/form/div/div[1]/img");
    By login_text = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[2]/form/div/h3");
    By email_text = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[2]/form/div/div[2]/label");
    By password_text = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[2]/form/div/div[3]/label");
    By email = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[2]/form/div/div[2]/input");
    By password = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[2]/form/div/div[3]/input");
    By login_button = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[2]/form/div/div[4]/button");
    By err_pass = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[2]/form/div/div[3]/div/div");
    By err_username = By.xpath("/html/body/app-root/div[1]/div/div[1]/app-login/div/div/div/div[2]/form/div/div[2]/div/div");

    public LoginPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomepageTitle() {
        String expectedTitle = "LifeHope Health";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
    }

    public void verifyLoginUI(String D, String L, String E, String P, String LB) throws IOException {
        if(driver.getCurrentUrl().contains("dashboard")) {
            test1.log(LogStatus.INFO, "Page stayed in the Dashboard Screen");
        } else if(driver.getCurrentUrl().contains("order-request")) {
            test1.log(LogStatus.INFO, "Page stayed in the Order Request Screen");
        } else if(driver.getCurrentUrl().contains("test-order")) {
            test1.log(LogStatus.INFO, "Page stayed in the Test Order Screen");
        } else if(driver.getCurrentUrl().contains("order-track")) {
            test1.log(LogStatus.INFO, "Page stayed in the Order Track Screen");
        } else if(driver.getCurrentUrl().contains("approve-status")) {
            test1.log(LogStatus.INFO, "Page stayed in the Order Approve Screen");
        } else {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOfElementLocated(login_button));
//            boolean value = driver.findElement(desc).isEnabled();
//            System.out.println(value);
                String descp = driver.findElement(desc).getText();
                //System.out.println(descp);
                if (D.equals(descp)) {
                    test1.log(LogStatus.PASS, "Description shown as per the requirement : " + descp);
                } else {
                    test1.log(LogStatus.FAIL, "Description not shown as per the requirement : " + descp);
                    getScreenshot("Login_Desc");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test1.log(LogStatus.FAIL, "Login Page Description not visible ");
                getScreenshot("Login_Desc");
            }
            try {
                WebElement adminImage = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(image));
                String image = adminImage.getAttribute("src");
                if (image.contains("login-img.png")) {
                    test1.log(LogStatus.PASS, "Image shown as per the requirement");
                } else {
                    test1.log(LogStatus.FAIL, "Image not shown as per the requirement");
                    getScreenshot("Login_Image");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test1.log(LogStatus.FAIL, "Login Page Image not visible ");
                getScreenshot("Login_Image");
            }
            try {
                WebElement adminLogo = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(logo));
                String log = adminLogo.getAttribute("src");
                if (log.contains("logo-1.svg")) {
                    test1.log(LogStatus.PASS, "Logo shown as per the requirement");
                } else {
                    test1.log(LogStatus.FAIL, "Logo not shown as per the requirement");
                    getScreenshot("Login_Logo");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test1.log(LogStatus.FAIL, "Login Page Logo not visible ");
                getScreenshot("Login_Logo");
            }
            try {
                WebElement login = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(login_text));
                String text = login.getText();
                //System.out.println(text);
                if (L.equals(text)) {
                    test1.log(LogStatus.PASS, "Login text shown as per the requirement : " + text);
                } else {
                    test1.log(LogStatus.FAIL, "Login text not shown as per the requirement : " + text);
                    getScreenshot("Login_Logo");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test1.log(LogStatus.FAIL, "Login text not visible ");
                getScreenshot("Login_Text");
            }
            try {
                WebElement email = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(email_text));
                String text = email.getText();
                //System.out.println(text);
                if (E.equals(text)) {
                    test1.log(LogStatus.PASS, "Email text shown as per the requirement : " + text);
                } else {
                    test1.log(LogStatus.FAIL, "Email text not shown as per the requirement : " + text);
                    getScreenshot("Login_EText");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test1.log(LogStatus.FAIL, "Email text not visible ");
                getScreenshot("Login_EText");
            }
            try {
                WebElement password = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(password_text));
                String text = password.getText();
                //System.out.println(text);
                if (P.equals(text)) {
                    test1.log(LogStatus.PASS, "Password text shown as per the requirement : " + text);
                } else {
                    test1.log(LogStatus.FAIL, "Password text not shown as per the requirement : " + text);
                    getScreenshot("Login_PText");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test1.log(LogStatus.FAIL, "Password text not visible ");
                getScreenshot("Login_PText");
            }
            try {
                WebElement logB = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(login_button));
                String text = logB.getText();
                //System.out.println(text);
                if (LB.equals(text)) {
                    test1.log(LogStatus.PASS, "Login button text shown as per the requirement : " + text);
                } else {
                    test1.log(LogStatus.FAIL, "Login button text not shown as per the requirement : " + text);
                    getScreenshot("Login_LBText");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test1.log(LogStatus.FAIL, "Login button text not visible ");
                getScreenshot("Login_LBText");
            }
        }
    }

    public void setLoginCredentials(String userName, String passWord) throws IOException {
        if (driver.getCurrentUrl().contains("dashboard")) {
            test1.log(LogStatus.INFO, "Page stayed in the Dashboard Screen");
        } else if (driver.getCurrentUrl().contains("order-request")) {
            test1.log(LogStatus.INFO, "Page stayed in the Order Request Screen");
        } else if (driver.getCurrentUrl().contains("test-order")) {
            test1.log(LogStatus.INFO, "Page stayed in the Test Order Screen");
        } else if (driver.getCurrentUrl().contains("order-track")) {
            test1.log(LogStatus.INFO, "Page stayed in the Order Track Screen");
        } else if (driver.getCurrentUrl().contains("approve-status")) {
            test1.log(LogStatus.INFO, "Page stayed in the Order Approve Screen");
        } else {
            try {
                WebElement setEmail = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(email));
                setEmail.clear();
                setEmail.sendKeys(userName);
                WebElement setPassword = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(password));
                setPassword.clear();
                setPassword.sendKeys(passWord);
                test1.log(LogStatus.INFO, "Login credentials passed successfully ");
                WebElement loginButton = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(login_button));
                loginButton.click();
                try {
                    WebElement userErr = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(err_username));
                    String errUser = userErr.getText();
                    //System.out.println(errUser);
                    if (errUser.equals("null")) {
                        test1.log(LogStatus.PASS, "Valid user name Passed");
                    } else {
                        test1.log(LogStatus.FAIL, "User name is Invalid : " + " " + errUser);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test1.log(LogStatus.PASS, "Valid user name Passed");
                }
                try {
                    WebElement passErr = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(err_pass));
                    String errPass = passErr.getText();
                    //System.out.println(errPass);
                    if (errPass.equals("null")) {
                        test1.log(LogStatus.PASS, "Valid password Passed");
                    } else {
                        test1.log(LogStatus.FAIL, "Password is Invalid : " + errPass);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test1.log(LogStatus.PASS, "Valid password Passed");
                }
                //Thread.sleep(1000);
                String url = driver.getCurrentUrl();
                //System.out.println(url);
                if (url.contains("dashboard")) {
                    test1.log(LogStatus.PASS, "Login Credentials are accepted");
                } else {
                    test1.log(LogStatus.WARNING, "Invalid credentials are not accepted");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test1.log(LogStatus.FAIL, "Login credentials fields are not visible ");
                getScreenshot("Login_Cred");
            }
        }
    }

}
