package IntegrationPages;

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
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import static IntegrationPages.TestBaseApp.*;
import static IntegrationPages.TestBaseApp.getScreenshot;

//import java.time.Duration;

public class LabResultsPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By labresults_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n");
    By labrsults_image = By.xpath("(//android.widget.ImageView[@content-desc=\"LifeHope Health\"])[3]\n");
    By labresults = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout\n");
    By inside_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView\n");
    By Zeroresults_popup = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
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
    By document_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView\n");
    By Clickdownload_btn = By.id("com.lifehope:id/download");
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
            Thread.sleep(2000);
            String Header = driver.findElement(labresults_header).getText();
            //System.out.println(Header);
            if (Header.contains(H)) {
                test17.log(LogStatus.PASS, "Header text shown as per the requirement");
            } else {
                test17.log(LogStatus.FAIL, "Header text not shown as per the requirement");
                getScreenshot("Lab_UI_HeaderText");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "Header text not visible");
            getScreenshot("Lab_UI_HeaderText");
        }
    }

    public void verifyLabResultsImage() throws InterruptedException, IOException {
        test17.log(LogStatus.INFO, "Ready to verify the Lab Results module logo");
        try {
            Thread.sleep(2000);
            if (driver.findElement(labrsults_image).isDisplayed()) {
                test17.log(LogStatus.PASS, "Lab Results image shown as per the requirement");
            } else {
                test17.log(LogStatus.FAIL, "Lab Results image not shown as per the requirement");
                getScreenshot("Lab_UI_Image");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "Lab results image not visible");
            getScreenshot("Lab_UI_Image");
        }
    }

    public void clickLabResults() throws InterruptedException, IOException {
        test17.log(LogStatus.INFO, "Ready to click the Lab Results");
        try {
            Thread.sleep(2000);
            driver.findElement(labresults).click();
            test17.log(LogStatus.PASS, "Clicked the lab results module");
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "lab results module not visible");
            getScreenshot("Lab_Module");
        }
    }

    public void verifyInsideHeader(String h) throws InterruptedException, IOException {
        test17.log(LogStatus.INFO, "Ready to Lab Results header");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(inside_header)).isDisplayed();
            Thread.sleep(5000);
            String header = driver.findElement(inside_header).getText();
            //System.out.println(Mobile);
            if (header.contains(h)) {
                test17.log(LogStatus.PASS, "Inside Header text shown as per the requirement");
            } else {
                test17.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement");
                getScreenshot("Lab_UI_Inside_HeaderText");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "Inside Header text not visible");
            getScreenshot("Lab_UI_Inside_HeaderText");
        }
    }

    public void verifyLabResultPage(String P) throws InterruptedException, IOException {
        Thread.sleep(2000);
        try {
            Thread.sleep(5000);
            if (driver.findElement(Zeroresults_popup).isDisplayed()) {
                Thread.sleep(2000);
                String header = driver.findElement(Zeroresults_popup).getText();
                //System.out.println(Mobile);
                if (header.contains(P)) {
                    test17.log(LogStatus.INFO, "There is no results");
                    if (driver.findElement(Back_to_homepage).isDisplayed()) {
                        Thread.sleep(2000);
                        driver.findElement(Back_to_homepage).click();
                        test17.log(LogStatus.PASS, "Back icon clicked");
                    } else {
                        test17.log(LogStatus.FAIL, "Back icon not shown as per the requirement");
                        getScreenshot("Lab_UI_back_icon_image");
                        driver.navigate().back();
                    }
                }
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.INFO, "There is no results");
        }
    }

    public void verifyLabResults() throws InterruptedException {
        test17.log(LogStatus.INFO, "Ready to Verify the Lab Result page");
        Thread.sleep(3000);
        try {
            if (driver.findElement(arrowclick).isDisplayed()) {
                Thread.sleep(2000);
                test17.log(LogStatus.INFO, "Ready to verify  the Test option image logo");
                try {
                    verifyTestOptionImage();
                    test17.log(LogStatus.PASS, "Test option image is visible");
                } catch (NoSuchElementException | IOException e1) {
                    test17.log(LogStatus.FAIL, "Test option image is not visible");
                    getScreenshot("LR_TImage");
                }
                test17.log(LogStatus.INFO, "Ready to verify the Test option text");
                try {
                    verifyTestOptionName("Covid - 19 PCR Test-(In-Home Test)", "Covid - 19 Antibody Test-(In-Home Test)", "RPP Test-(In-Home Test)", "Microbiome Test-(In-Home Test)", "Covid - 19 PCR Test-(Self Test)", "Covid - 19 Antibody Test-(Self Test)", "RPP Test-(Self Test)", "Microbiome Test-(Self Test)");
                    test17.log(LogStatus.PASS, "Test option text is visible");
                } catch (NoSuchElementException | IOException e1) {
                    test17.log(LogStatus.FAIL, "Test option text is not visible");
                    getScreenshot("LR_TText");
                }
                test17.log(LogStatus.INFO, "Ready to open the first test option ");
                try {
                    clickArrow();
                    test17.log(LogStatus.PASS, "First test option is opened");
                } catch (NoSuchElementException e1) {
                    test17.log(LogStatus.FAIL, "Not able to open the First test option");
                    getScreenshot("LR_FirstTest");
                }
                test17.log(LogStatus.INFO, "Ready to verify the Test option Header text");
                try {
                    verifyTestOptionHeaderName("Covid - 19 PCR Test-(In-Home Test)", "Covid - 19 Antibody Test-(In-Home Test)", "RPP Test-(In-Home Test)", "Microbiome Test-(In-Home Test)", "Covid - 19 PCR Test-(Self Test)", "Covid - 19 Antibody Test-(Self Test)", "RPP Test-(Self Test)", "Microbiome Test-(Self Test)");
                    test17.log(LogStatus.PASS, "Test option Header text is visible");
                } catch (NoSuchElementException | IOException e1) {
                    test17.log(LogStatus.FAIL, "Test option Header text is not visible");
                    getScreenshot("LR_THeader");
                }
                test17.log(LogStatus.INFO, "Ready to verify the Patient Name");
                try {
                    verifyPatientName();
                    test17.log(LogStatus.PASS, "Patient name is visible according to the report");
                } catch (NoSuchElementException | IOException e1) {
                    test17.log(LogStatus.FAIL, "Patient name is not visible according to the reportTest option text is not visible");
                    getScreenshot("LR_PName");
                }
                test17.log(LogStatus.INFO, "Ready to verify the Order id");
                try {
                    verifyOrderId();
                    test17.log(LogStatus.PASS, "Order id is visible according the order placed");
                } catch (NoSuchElementException | IOException e1) {
                    test17.log(LogStatus.FAIL, "Order id is not visible according the order placed");
                    getScreenshot("LR_OrdId");
                }
                test17.log(LogStatus.INFO, "Ready to verify the Date and time");
                try {
                    verifyDateTime();
                    test17.log(LogStatus.PASS, "Date and Time by report generated is visible");
                } catch (NoSuchElementException | IOException e1) {
                    test17.log(LogStatus.FAIL, "Date and Time by report generated is not visible");
                    getScreenshot("LR_DateTime");
                }
                test17.log(LogStatus.INFO, "Ready to open the first report");
                try {
                    openFile();
                    test17.log(LogStatus.PASS, "Report file opened successfully");
                } catch (NoSuchElementException e1) {
                    test17.log(LogStatus.FAIL, "Report file is Not opened ");
                    getScreenshot("LR_ReportFile");
                }
                test17.log(LogStatus.INFO, "Ready to verify the Report Header Test ");
                try {
                    verifyReportHeaderName();
                    test17.log(LogStatus.PASS, "Report Header Text is visible");
                } catch (NoSuchElementException | IOException e1) {
                    test17.log(LogStatus.FAIL, "Report Header Text is not visible");
                    getScreenshot("LR_RHeader");
                }
                test17.log(LogStatus.INFO, "Ready to Download the report ");
                try {
                    downloadFile();
                    test17.log(LogStatus.PASS, "Report downloaded successfully");
                } catch (NoSuchElementException e1) {
                    test17.log(LogStatus.FAIL, "Report is not downloaded");
                    getScreenshot("LR_RepDown");
                }
            } else {
                test17.log(LogStatus.INFO, "There is no Lab results");
            }
        } catch (NoSuchElementException | IOException e) {
            test17.log(LogStatus.INFO, "There is no Lab results");
        }
    }

    public void verifyTestOptionImage() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            if (driver.findElement(Testoption_image).isDisplayed()) {
                test17.log(LogStatus.PASS, "TestOption image shown as per the requirement");
            } else {
                test17.log(LogStatus.FAIL, "TestOption image not shown as per the requirement,Clicking back to homepage");
                getScreenshot("Labresults_UI_Testoption_image");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "TestOption image not shown as per the requirement,Clicking back to homepage");
            getScreenshot("LR_TestImage");
        }
    }

    public void verifyTestOptionName(String N, String O, String P, String Q, String R, String S, String T, String U) throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String testOptionName = driver.findElement(Testoption_Text).getText();
            //System.out.println(Mobile);
            if (testOptionName.contains(N) || testOptionName.contains(O) || testOptionName.contains(P) || testOptionName.contains(Q) || testOptionName.contains(R) || testOptionName.contains(S) || testOptionName.contains(T) || testOptionName.contains(U)) {
                test17.log(LogStatus.PASS, "Test option name is shown as per the requirement : " + testOptionName);
            } else {
                test17.log(LogStatus.FAIL, "Test option name not shown as per the requirement : " + testOptionName);
                getScreenshot("LabResults_TestOption_Name");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "Covid - 19 PCR Test-(Home Test) Test option name not shown as per the requirement");
            getScreenshot("LabResults_TestOption_Name");
        }
    }

    public void clickArrow() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            driver.findElement(arrowclick).click();
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "There is no arrow icon");
            getScreenshot("LR_Arrow");
        }
    }

    public void verifyTestOptionHeaderName(String N, String O, String P, String Q, String R, String S, String T, String U) throws InterruptedException, IOException {
        try {
            Thread.sleep(5000);
            String testOptionHeaderName = driver.findElement(Testoption_Title).getText();
            //System.out.println(Mobile);
            if (testOptionHeaderName.contains(N) || testOptionHeaderName.contains(O) || testOptionHeaderName.contains(P) || testOptionHeaderName.contains(Q) || testOptionHeaderName.contains(R) || testOptionHeaderName.contains(S) || testOptionHeaderName.contains(T) || testOptionHeaderName.contains(U)) {
                test17.log(LogStatus.PASS, "Testoption Header name is shown as per the requirement");
            } else {
                test17.log(LogStatus.FAIL, "Testoption Header name not shown as per the requirement");
                getScreenshot("Labresults_Testoption_Headername");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "Testoption Header name not shown as per the requirement");
            getScreenshot("Labresults_Testoption_Headername");
        }
    }

    public void verifyPatientName() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            //String Patient_name = driver.findElement(patient_name).getText();
            //System.out.println(Mobile);x
            if (driver.findElement(patient_name).isDisplayed()) {
                //if (Patient_name .contains(PN)) {
                test17.log(LogStatus.PASS, "Patient name Text will be displayed");
            } else {
                test17.log(LogStatus.FAIL, "Patient name Text not displayed");
                getScreenshot("Labresults_Patient_name");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "Patient name Text not displayed");
            getScreenshot("Labresults_Patient_name");
        }
    }

    public void verifyOrderId() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            //String Orderid = driver.findElement(Order_id).getText();
            //System.out.println(Mobile);x
            if (driver.findElement(Order_id).isDisplayed()) {
                //if (Orderid.contains(OI)) {
                test17.log(LogStatus.PASS, "Order id is displayed");
            } else {
                test17.log(LogStatus.FAIL, "Order id is not displayed");
                getScreenshot("Labresults_Order_ID");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "Order id is not displayed");
            getScreenshot("Labresults_Order_ID");
        }
    }

    public void verifyDateTime() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            if (driver.findElement(Order_dateandtime).isDisplayed()) {
                //if (DateandTime.contains(DT)) {
                test17.log(LogStatus.PASS, "Date and time is be displayed");
            } else {
                test17.log(LogStatus.FAIL, "Order id is not displayed");
                getScreenshot("Labresults_Order_ID");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "Order id is not displayed");
            getScreenshot("Labresults_Order_ID");
        }
    }

    public void openFile() throws InterruptedException {
        try {
            Thread.sleep(2000);
            driver.findElement(open_document1).click();
            Thread.sleep(2000);
            Dimension dimension = driver.manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.7);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
        } catch (NoSuchElementException e) {
            //System.out.println("There is no file");
            test17.log(LogStatus.INFO, "There is no File");
        }
    }

    public void verifyReportHeaderName() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            if (driver.findElement(document_name).isDisplayed()) {
                // if (Reportheadername.contains(RH)) {
                test17.log(LogStatus.PASS, "Report Header name is be displayed");
            } else {
                test17.log(LogStatus.FAIL, "Report Header name is not displayed");
                getScreenshot("Labresults_Report_Header_name");
            }
        } catch (NoSuchElementException e) {
            test17.log(LogStatus.FAIL, "Report Header name is not displayed");
            getScreenshot("Labresults_Report_Header_name");
        }
    }

    public void downloadFile() throws InterruptedException {
        try {
            Thread.sleep(5000);
            driver.findElement(Clickdownload_btn).click();
            WebElement allow = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(Docuallow_option));
            allow.click();
            Thread.sleep(2000);
            driver.findElement(Back_icon).click();
            Thread.sleep(5000);
            driver.findElement(closebtn).click();
            Thread.sleep(5000);
            driver.findElement(Back_to_homepage).click();
            Thread.sleep(5000);
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
