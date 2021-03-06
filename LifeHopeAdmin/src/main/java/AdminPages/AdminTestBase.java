package AdminPages;

import Utils.AdminGoogleSheet;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AdminTestBase extends AdminGoogleSheet {

    public static WebDriver driver;

    public static ExtentReports report;
    public static ExtentTest test;
    public static ExtentTest test1;
    public static ExtentTest test2;
    public static ExtentTest test3;
    public static ExtentTest test4;
    public static ExtentTest test5;
    public static ExtentTest test6;
    public static ExtentTest test7;

    @BeforeClass
    public static void openBrowser() {
        if (dataList.get(0).contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "./driver/chrome/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
            driver.get(dataList.get(1));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } else if (dataList.get(0).contains("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "./driver/firefox/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("--disable-notifications");
            driver = new FirefoxDriver(options);
            driver.get(dataList.get(1));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } else {
            System.setProperty("webdriver.ie.driver", "./driver/ie/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            InternetExplorerOptions options = new InternetExplorerOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.destructivelyEnsureCleanSession();
            driver.get(dataList.get(1));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    }

    @BeforeTest
    public static void startTest() {
        String currentDate = new SimpleDateFormat("dd_MM_yyyy").format(new Date());
        //report = new ExtentReports("C:\\Users\\Splpt336\\Desktop\\LH_Admin_Report\\LH_Admin_Report" + "_" + currentDate +"\\LH_Admin_Report_"+ currentDate + ".html");
        report = new ExtentReports("./LH_Admin_Report" + "_" + currentDate + "/LH_Admin_Report_" + currentDate + ".html");
        report.addSystemInfo("Developed By", "Testing Team - AdHash");
        report.addSystemInfo("Tested By", "Testing Team - AdHash");
        test = report.startTest("LifeHope Health - Admin");
        test1 = report.startTest("Login");
        test2 = report.startTest("Dashboard");
        test3 = report.startTest("Recent_Order_Queue");
        test4 = report.startTest("Order_Request");
        test5 = report.startTest("Test_Orders");
        test6 = report.startTest("Order_Track");
        test7 = report.startTest("Settings");
    }

    public static void getScreenshot(String screenshotname) throws IOException {
        String currentDate = new SimpleDateFormat("dd_MM_yyyy").format(new Date());
        File source;
        source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destinationFile = "./LH_Admin_Report_" + currentDate + "/FailedTestScreenshots/" + screenshotname + ".jpg";
        FileUtils.copyFile(source, new File(destinationFile));
    }

    @DataProvider
    public Object[][] getData() {

        Object[][] data = new Object[8][2];

        // Invalid Username & Invalid Password (Special)
        data[0][0] = " ";
        data[0][1] = " ";

        // Invalid Username & Invalid Password (Special)
        data[1][0] = dataList.get(2);
        data[1][1] = dataList.get(3);

        // Invalid Username & Invalid Password (Numeric)
        data[2][0] = dataList.get(4);
        data[2][1] = dataList.get(5);

        // Invalid Username & Invalid Password (Special + Numeric)
        data[3][0] = dataList.get(6);
        data[3][1] = dataList.get(7);

        // Invalid Username & Invalid Password (Alpha + Numeric)
        data[4][0] = dataList.get(8);
        data[4][1] = dataList.get(9);

        // Invalid Username & Invalid Password (Alpha + Special + Numeric)
        data[5][0] = dataList.get(10);
        data[5][1] = dataList.get(11);

        // Invalid Username & Invalid Password (Alpha)
        data[6][0] = dataList.get(12);
        data[6][1] = dataList.get(13);

        // Invalid Username & Invalid Password
        data[7][0] = dataList.get(14);
        data[7][1] = dataList.get(15);

        return data;
    }

    @AfterTest
    public static void endTest() {
        report.endTest(test);
        report.flush();
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

}
