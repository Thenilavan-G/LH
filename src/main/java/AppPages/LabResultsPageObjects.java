package AppPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.PerformsTouchActions;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.touch.WaitOptions;
//import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import static AppPages.AppTestBase.*;
import static Utils.AppGoogleSheet.dataList;

//import java.time.Duration;

public class LabResultsPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By labresults_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n");
    By labrsults_image = By.xpath("(//android.widget.ImageView[@content-desc=\"LifeHope Health\"])[3]\n");
    By labresults = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout\n");
    By inside_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView\n");
    //By Zeroresults_popup = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    By Testoption_image = By.id("com.lifehope:id/imageviewTestImage");
    //By Testoption_image = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[1]");
    By Testoption_Text = By.id("com.lifehope:id/textviewTestName");
    By arrowclick = By.id("com.lifehope:id/imageviewNextArrow");
    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]
    By Testoption_Title = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView\n");
    By patient_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[1]\n");
    By Order_id = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[2]\n");
    By Order_dateandtime = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[3]\n");
    By open_document1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView\n");
    // By open_document2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
    By password_field = By.id("com.google.android.apps.docs:id/password");
    By open_button = By.id("android:id/button1");
    By more_menu = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]\n");
    By document_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView\n");
    By Clickdownload_btn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView\n");
    //xpath //android.widget.TextView[@content-desc="Download"]
    By Docuallow_option = By.id("com.android.permissioncontroller:id/permission_allow_button");
    //xpath= /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]
    By Back_icon = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n");
    By closebtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton\n");
    //id com.lifehope:id/imageviewBackArrow
    By Back_to_homepage = By.id("com.lifehope:id/imageviewBackArrow");
    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView

    public LabResultsPageObjects(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }


    public void verifyHeader(String H) throws InterruptedException, IOException {
        test17.log(LogStatus.INFO, "Ready to verify Lab Results module text");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(labresults_header)).isDisplayed();
            WebElement element = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(labresults_header));
            String Header = element.getText();
            //System.out.println(Header);
            if (Header.contains(H)) {
                AppTestBase.test17.log(LogStatus.PASS, "Header text shown as per the requirement");
            } else {
                AppTestBase.test17.log(LogStatus.FAIL, "Header text not shown as per the requirement");
                getScreenshot("Lab_UI_HeaderText");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "Header text not visible");
            getScreenshot("Lab_UI_HeaderText");
        }
    }

    public void verifyLabResultsImage() throws IOException {
        test17.log(LogStatus.INFO, "Ready to verify the Lab Results module logo");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(labrsults_image));
            if (element.isDisplayed()) {
                AppTestBase.test17.log(LogStatus.PASS, "Lab Results image shown as per the requirement");
            } else {
                AppTestBase.test17.log(LogStatus.FAIL, "Lab Results image not shown as per the requirement");
                getScreenshot("Lab_UI_Image");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "Lab results image not visible");
            getScreenshot("Lab_UI_Image");
        }
    }

    public void clickLabResults() throws IOException {
        test17.log(LogStatus.INFO, "Ready to click the Lab Results");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(labresults));
            element.click();
            AppTestBase.test17.log(LogStatus.PASS, "Clicked the lab results module");
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "lab results module not visible");
            getScreenshot("Lab_Module");
        }
    }

    public void verifyInsideHeader(String h) throws IOException {
        test17.log(LogStatus.INFO, "Ready to Lab Results header");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(inside_header)).isDisplayed();
            WebElement element = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(inside_header));
            String header = element.getText();
            //System.out.println(Mobile);
            if (header.contains(h)) {
                AppTestBase.test17.log(LogStatus.PASS, "Inside Header text shown as per the requirement");
            } else {
                AppTestBase.test17.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement");
                getScreenshot("Lab_UI_Inside_HeaderText");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "Inside Header text not visible");
            getScreenshot("Lab_UI_Inside_HeaderText");
        }
    }

//    public void verifyLabResultPage(String P) throws InterruptedException, IOException {
//        Thread.sleep(2000);
//        try {
//            Thread.sleep(5000);
//            if (driver.findElement(Zeroresults_popup).isDisplayed()) {
//                Thread.sleep(2000);
//                String header = driver.findElement(Zeroresults_popup).getText();
//                //System.out.println(Mobile);
//                if (header.contains(P)) {
//                    AppTestBase.test17.log(LogStatus.INFO, "There is no results");
//                    if (driver.findElement(Back_to_homepage).isDisplayed()) {
//                        Thread.sleep(2000);
//                        driver.findElement(Back_to_homepage).click();
//                        AppTestBase.test17.log(LogStatus.PASS, "Back icon clicked");
//                    } else {
//                        AppTestBase.test17.log(LogStatus.FAIL, "Back icon not shown as per the requirement");
//                        getScreenshot("Lab_UI_back_icon_image");
//                        driver.navigate().back();
//                    }
//                }
//            }
//        } catch (NoSuchElementException e) {
//            AppTestBase.test17.log(LogStatus.INFO, "There is no results");
//        }
//    }

    public void verifyLabResults() throws InterruptedException {
        test17.log(LogStatus.INFO, "Ready to Verify the Lab Result page");
        try {
            WebElement element = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(arrowclick));
            if (element.isDisplayed()) {
                AppTestBase.test17.log(LogStatus.INFO, "Ready to verify  the Test option image logo");
                try {
                    verifyTestOptionImage();
                    AppTestBase.test17.log(LogStatus.PASS, "Test option image is visible");
                } catch (NoSuchElementException | IOException | TimeoutException e1) {
                    AppTestBase.test17.log(LogStatus.FAIL, "Test option image is not visible");
                    getScreenshot("LR_TImage");
                }
                AppTestBase.test17.log(LogStatus.INFO, "Ready to verify the Test option text");
                try {
                    verifyTestOptionName("Covid - 19 PCR Test-(In-Home Test)", "Covid - 19 Antibody Test-(In-Home Test)", "RPP Test-(In-Home Test)", "Microbiome Test-(In-Home Test)", "Covid - 19 PCR Test-(Self Test)", "Covid - 19 Antibody Test-(Self Test)", "RPP Test-(Self Test)", "Microbiome Test-(Self Test)");
                    AppTestBase.test17.log(LogStatus.PASS, "Test option text is visible");
                } catch (NoSuchElementException | IOException | TimeoutException e1) {
                    AppTestBase.test17.log(LogStatus.FAIL, "Test option text is not visible");
                    getScreenshot("LR_TText");
                }
                AppTestBase.test17.log(LogStatus.INFO, "Ready to open the first test option ");
                try {
                    clickArrow();
                    AppTestBase.test17.log(LogStatus.PASS, "First test option is opened");
                } catch (NoSuchElementException | TimeoutException e1) {
                    AppTestBase.test17.log(LogStatus.FAIL, "Not able to open the First test option");
                    getScreenshot("LR_FirstTest");
                }
                AppTestBase.test17.log(LogStatus.INFO, "Ready to verify the Test option Header text");
                try {
                    verifyTestOptionHeaderName("Covid - 19 PCR Test-(In-Home Test)", "Covid - 19 Antibody Test-(In-Home Test)", "RPP Test-(In-Home Test)", "Microbiome Test-(In-Home Test)", "Covid - 19 PCR Test-(Self Test)", "Covid - 19 Antibody Test-(Self Test)", "RPP Test-(Self Test)", "Microbiome Test-(Self Test)");
                    AppTestBase.test17.log(LogStatus.PASS, "Test option Header text is visible");
                } catch (NoSuchElementException | IOException | TimeoutException e1) {
                    AppTestBase.test17.log(LogStatus.FAIL, "Test option Header text is not visible");
                    getScreenshot("LR_THeader");
                }
                AppTestBase.test17.log(LogStatus.INFO, "Ready to verify the Patient Name");
                try {
                    verifyPatientName();
                    AppTestBase.test17.log(LogStatus.PASS, "Patient name is visible according to the report");
                } catch (NoSuchElementException | IOException | TimeoutException e1) {
                    AppTestBase.test17.log(LogStatus.FAIL, "Patient name is not visible according to the reportTest option text is not visible");
                    getScreenshot("LR_PName");
                }
                AppTestBase.test17.log(LogStatus.INFO, "Ready to verify the Order id");
                try {
                    verifyOrderId();
                    AppTestBase.test17.log(LogStatus.PASS, "Order id is visible according the order placed");
                } catch (NoSuchElementException | IOException | TimeoutException e1) {
                    AppTestBase.test17.log(LogStatus.FAIL, "Order id is not visible according the order placed");
                    getScreenshot("LR_OrdId");
                }
                AppTestBase.test17.log(LogStatus.INFO, "Ready to verify the Date and time");
                try {
                    verifyDateTime();
                    AppTestBase.test17.log(LogStatus.PASS, "Date and Time by report generated is visible");
                } catch (NoSuchElementException | IOException | TimeoutException e1) {
                    AppTestBase.test17.log(LogStatus.FAIL, "Date and Time by report generated is not visible");
                    getScreenshot("LR_DateTime");
                }
                AppTestBase.test17.log(LogStatus.INFO, "Ready to open the first report");
                try {
                    openFile();
                    AppTestBase.test17.log(LogStatus.PASS, "Report file opened successfully");
                } catch (NoSuchElementException | TimeoutException e1) {
                    AppTestBase.test17.log(LogStatus.FAIL, "Report file is Not opened ");
                    getScreenshot("LR_ReportFile");
                }
                AppTestBase.test17.log(LogStatus.INFO, "Ready to Download the report ");
                try {
                    downloadFile();
                    AppTestBase.test17.log(LogStatus.PASS, "Report downloaded successfully");
                } catch (NoSuchElementException | TimeoutException e1) {
                    AppTestBase.test17.log(LogStatus.FAIL, "Report is not downloaded");
                    getScreenshot("LR_RepDown");
                }
            } else {
                AppTestBase.test17.log(LogStatus.INFO, "There is no Lab results");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.INFO, "There is no Lab results");
        }
    }

    public void verifyTestOptionImage() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Testoption_image));
            if (element.isDisplayed()) {
                AppTestBase.test17.log(LogStatus.PASS, "TestOption image shown as per the requirement");
            } else {
                AppTestBase.test17.log(LogStatus.FAIL, "TestOption image not shown as per the requirement,Clicking back to homepage");
                getScreenshot("Labresults_UI_Testoption_image");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "TestOption image not shown as per the requirement,Clicking back to homepage");
            getScreenshot("LR_TestImage");
        }
    }

    public void verifyTestOptionName(String N, String O, String P, String Q, String R, String S, String T, String U) throws InterruptedException, IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Testoption_Text));
            String testOptionName = element.getText();
            //System.out.println(Mobile);
            if (testOptionName.contains(N) || testOptionName.contains(O) || testOptionName.contains(P) || testOptionName.contains(Q) || testOptionName.contains(R) || testOptionName.contains(S) || testOptionName.contains(T) || testOptionName.contains(U)) {
                AppTestBase.test17.log(LogStatus.PASS, "Test option name is shown as per the requirement : " + testOptionName);
            } else {
                AppTestBase.test17.log(LogStatus.FAIL, "Test option name not shown as per the requirement : " + testOptionName);
                getScreenshot("LabResults_TestOption_Name");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "Covid - 19 PCR Test-(Home Test) Test option name not shown as per the requirement");
            getScreenshot("LabResults_TestOption_Name");
        }
    }

    public void clickArrow() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(arrowclick));
            element.click();
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "There is no arrow icon");
            getScreenshot("LR_Arrow");
        }
    }

    public void verifyTestOptionHeaderName(String N, String O, String P, String Q, String R, String S, String T, String U) throws InterruptedException, IOException {
        try {
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(Testoption_Title));
            String testOptionHeaderName = element.getText();
            //System.out.println(Mobile);
            if (testOptionHeaderName.contains(N) || testOptionHeaderName.contains(O) || testOptionHeaderName.contains(P) || testOptionHeaderName.contains(Q) || testOptionHeaderName.contains(R) || testOptionHeaderName.contains(S) || testOptionHeaderName.contains(T) || testOptionHeaderName.contains(U)) {
                AppTestBase.test17.log(LogStatus.PASS, "Testoption Header name is shown as per the requirement");
            } else {
                AppTestBase.test17.log(LogStatus.FAIL, "Testoption Header name not shown as per the requirement");
                getScreenshot("Labresults_Testoption_Headername");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "Testoption Header name not shown as per the requirement");
            getScreenshot("Labresults_Testoption_Headername");
        }
    }

    public void verifyPatientName() throws InterruptedException, IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(patient_name));
//            String pname = driver.findElement(patient_name).getText();
//            System.out.println(pname);
            if (element.isDisplayed()) {
                //if (Patient_name .contains(PN)) {
                AppTestBase.test17.log(LogStatus.PASS, "Patient name Text will be displayed");
            } else {
                AppTestBase.test17.log(LogStatus.FAIL, "Patient name Text not displayed");
                getScreenshot("Labresults_Patient_name");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "Patient name Text not displayed");
            getScreenshot("Labresults_Patient_name");
        }
    }

    public void verifyOrderId() throws InterruptedException, IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Order_id));
            String orderId = driver.findElement(Order_id).getText();
            String[] split = StringUtils.split(orderId, ":");
            //System.out.println("1 : " + split[1]);
            dataList.remove(56);
            dataList.add(56, split[1]);
            //System.out.println(dataList.get(56));
            if (element.isDisplayed()) {
                //if (Orderid.contains(OI)) {
                AppTestBase.test17.log(LogStatus.PASS, "Order id is displayed");
            } else {
                AppTestBase.test17.log(LogStatus.FAIL, "Order id is not displayed");
                getScreenshot("Labresults_Order_ID");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "Order id is not displayed");
            getScreenshot("Labresults_Order_ID");
        }
    }

    public void verifyDateTime() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Order_dateandtime));
            if (element.isDisplayed()) {
                //if (DateandTime.contains(DT)) {
                AppTestBase.test17.log(LogStatus.PASS, "Date and time is be displayed");
            } else {
                AppTestBase.test17.log(LogStatus.FAIL, "Order id is not displayed");
                getScreenshot("Labresults_Order_ID");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            AppTestBase.test17.log(LogStatus.FAIL, "Order id is not displayed");
            getScreenshot("Labresults_Order_ID");
        }
    }

    public void openFile() throws InterruptedException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(open_document1));
            element.click();
            Thread.sleep(5000);
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(password_field));
            //element1.sendKeys("1066799MARK");
            element1.sendKeys(dataList.get(56) + dataList.get(55));
            //System.out.println(dataList.get(56) + dataList.get(55));
            WebElement element2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(open_button));
            element2.click();
            Thread.sleep(2000);
//            Dimension dimension = driver.manage().window().getSize();
//            int scrollStart = (int) (dimension.getHeight() * 0.7);
//            int scrollEnd = (int) (dimension.getHeight() * 0.2);
//            new TouchAction((PerformsTouchActions) driver)
//                    .press(PointOption.point(0, scrollStart))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                    .moveTo(PointOption.point(0, scrollEnd))
//                    .release().perform();
        } catch (NoSuchElementException | TimeoutException e) {
            //System.out.println("There is no file");
            test17.log(LogStatus.INFO, "There is no File");
        }
    }

    public void downloadFile() throws InterruptedException {
        try {
            WebElement element3 = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(more_menu));
            element3.click();
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(Clickdownload_btn));
            element.click();
            WebElement allow = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(Docuallow_option));
            allow.click();
            WebElement element1 = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(Back_icon));
            element1.click();
            WebElement element2 = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(closebtn));
            element2.click();
            WebElement element4 = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(Back_to_homepage));
            element4.click();
        } catch (NoSuchElementException | TimeoutException e) {
            //System.out.println("There is no download icon");
            test17.log(LogStatus.SKIP, "There is no download icon");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
        }
    }

}
