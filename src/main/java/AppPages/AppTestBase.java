package AppPages;

import Utils.AppGoogleSheet;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppTestBase extends AppGoogleSheet {
//public class TestBase {

    public static AppiumDriver<MobileElement> driver = null;
    //public static AndroidDriver<MobileElement> driver = null;

    public static ExtentReports report;
    public static ExtentTest test;
    public static ExtentTest test1;
    public static ExtentTest test2;
    public static ExtentTest test3;
    public static ExtentTest test4;
    public static ExtentTest test5;
    public static ExtentTest test6;
    public static ExtentTest test7;
    public static ExtentTest test8;
    public static ExtentTest test9;
    public static ExtentTest test10;
    public static ExtentTest test11;
    public static ExtentTest test12;
    public static ExtentTest test13;
    public static ExtentTest test14;
    public static ExtentTest test15;
    public static ExtentTest test16;
    public static ExtentTest test17;
    public static ExtentTest test18;
    public static ExtentTest test19;
    public static ExtentTest test20;
    public static ExtentTest test21;

    @BeforeClass
    public void launchApp() throws MalformedURLException {

        File app = new File("./app/LifeHope Health 02-04-2021_V2.apk");

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("udid", "R9SMA0107WJ");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("app", app.getAbsolutePath());
        //caps.setCapability("appPackage", "com.lifehope");
        //caps.setCapability("appActivity", "com.lifehope.splash.SplashActivity");
        caps.setCapability("automationName", "uiAutomator1");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        //driver = new AppiumDriver<MobileElement>(url, caps);

        driver = new AndroidDriver(url, caps);
        System.out.println("App opened successfully");
    }

    @BeforeTest
    public void startTest() {
        String currentDate = new SimpleDateFormat("dd_MM_yyyy").format(new Date());
        File dir1 = new File("./LH_App_Report_" + currentDate + "/FailedTestScreenshots");
        dir1.mkdir();
        //report = new ExtentReports("C:\\Users\\SPLPT336\\Desktop\\LH_App_Report\\LH_App_Report" + "_" + currentDate + "\\LH_App_Report_" + currentDate + ".html");
        report = new ExtentReports("./LH_App_Report" + "_" + currentDate + "/LH_App_Report_" + currentDate + ".html");
        report.addSystemInfo("Developed By", "Testing Team - AdHash");
        report.addSystemInfo("Tested By", "Testing Team - AdHash");
        test = report.startTest("LifeHope Health - Android");
        test1 = report.startTest("Login_Page_UI");
        test2 = report.startTest("MobileNumber_Signup");
        test3 = report.startTest("OTP_Page_UI");
        test4 = report.startTest("OTP_Page");
        test5 = report.startTest("Facebook_Page_UI");
        test6 = report.startTest("Facebook_MobileNumber_Signup");
        test7 = report.startTest("Facebook_Gmail_Signup");
        test8 = report.startTest("Gmail_Page_UI");
        test9 = report.startTest("Gmail_Signup");
        test10 = report.startTest("Terms_Privacy");
        test11 = report.startTest("Profile_Settings");
        test12 = report.startTest("Quick_Health_Test");
        test13 = report.startTest("Book_A_Test");
        test14 = report.startTest("Test_Orders_Info");
        test15 = report.startTest("Test_Orders_Status");
        test16 = report.startTest("Test_Orders_Track");
        test17 = report.startTest("Lab_Results");
        test18 = report.startTest("Vitals");
        test19 = report.startTest("Home_Screen_UI_page");
        test20 = report.startTest("Profile_Edit");
        test21 = report.startTest("Left_Menu");
    }

    public static void getScreenshot(String screenshotname) throws IOException {
        String currentDate = new SimpleDateFormat("dd_MM_yyyy").format(new Date());
        File source;
        source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //String destinationFile = "C:\\Users\\SPLPT336\\Desktop\\LH_App_Report\\LH_App_Report" + "_" + currentDate + "\\FailedTestScreenshots\\" + screenshotname + ".jpg";
        String destinationFile = "./LH_App_Report_"+ currentDate + "/FailedTestScreenshots/" + screenshotname + ".jpg";
        FileUtils.copyFile(source, new File(destinationFile));
        //return destinationFile;
    }

    @AfterTest
    public void endTest() {
        report.endTest(test);
        report.flush();
    }
}
