package AppPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static AppPages.AppTestBase.getScreenshot;
import static AppPages.AppTestBase.test14;
import static Utils.AppGoogleSheet.dataList;

public class TestOrdersInfoPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By menu = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n");
    By test_orders = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView\n");
    By test_image = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView\n");
    //By test_count = By.id("com.lifehope:id/layout_testcount");
    By test_count = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView\n");
    By test_orders_head = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView\n");
    By test_no_data = By.id("com.lifehope:id/textview_no_data");
    By test_orders_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]\n");
    By test_orders_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]\n");
    By test_orders_Sched_price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[3]\n");
    By test_orders_price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[4]\n");
    By test_orders_id = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView\n");
    By test_orders_status = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.view.ViewGroup[2]/android.widget.TextView\n");
    By test_type = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.view.ViewGroup[1]/android.widget.TextView\n");
    By arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView\n");
    By info_icon = By.id("com.lifehope:id/imageviewInfo");
    By addon_header = By.id("com.lifehope:id/textview_add_members_label");
    By patient_name_first = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]\n");
    By patient_age_first = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]\n");
    By patient_gender_first = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]\n");
    By patient_name_second = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]\n");
    By patient_age_second = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]\n");
    By patient_gender_second = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[3]\n");
    By patient_name_third = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]\n");
    By patient_age_third = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]\n");
    By patient_gender_third = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[3]\n");
    By patient_name_fourth = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView[1]\n");
    By patient_age_fourth = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView[2]\n");
    By patient_gender_fourth = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView[3]\n");
    By payment_details_header = By.id("com.lifehope:id/textview_payment_details_label");
    //By test_name_price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]\n");
    By test_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]\n");
    By test_name2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]\n");
    By test_price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]\n");
    By test_price2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]\n");
    //By shipping_name_price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]\n");
    By shipping_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]\n");
    By shipping_name2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]\n");
    By shipping_price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]\n");
    By shipping_price2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]\n");
    //By tax_name_price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]\n");
    By tax_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]\n");
    By tax_name2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]\n");
    By tax_price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]\n");
    By tax_price2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]\n");
    By total = By.id("com.lifehope:id/textview_total_label");
    By total_price = By.id("com.lifehope:id/textview_total_charge");
    By info_close = By.id("com.lifehope:id/imageview_close");
    By test_total_price = By.id("com.lifehope:id/textview_price");

    public TestOrdersInfoPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void clickMenu() throws InterruptedException, IOException {
        test14.log(LogStatus.INFO, "Ready to click the Menu Icon");
        try {
            WebElement element = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(menu));
            element.click();
            test14.log(LogStatus.PASS, "Menu icon Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Menu icon not visible");
            getScreenshot("Info_Menu");
        }
    }

    public void clickTestOrders() throws IOException {
        test14.log(LogStatus.INFO, "Ready to click Test Orders Option");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_orders));
            element.click();
            test14.log(LogStatus.PASS, "My Test Orders option Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "My Test Orders option not visible");
            getScreenshot("Info_MyTO");
        }
    }

    public void verifyTestOrdersTitle() throws IOException {
        test14.log(LogStatus.INFO, "Ready to verify the Test Orders Title");
        try {
            WebElement element = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(test_orders_head));
            String title = element.getText();
            if (title.equals("My Test Orders")) {
                test14.log(LogStatus.PASS, "Test Orders Title shown as per the requirement");
            } else {
                test14.log(LogStatus.FAIL, "Test Orders Title not shown as per the requirement");
                getScreenshot("Info_TestTitle");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Test order title not visible");
            getScreenshot("Info_TOTitle");
        }
    }

    public void verifyTestOrders() throws IOException, InterruptedException {
        try {
            test14.log(LogStatus.INFO, "Ready to verify the Test Orders List");
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(test_no_data));
            String data = element.getText();
            if (data.equals("null")) {
                test14.log(LogStatus.FAIL, "Test Orders data : " + data);
                getScreenshot("Info_NoData");
            } else {
                test14.log(LogStatus.PASS, "Test Orders data : " + data);
            }
            Thread.sleep(2000);
            driver.navigate().back();
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.INFO, "Ready to verify the Test Order Image");
            verifyTestImage();
            test14.log(LogStatus.INFO, "Ready to verify the Test Count");
            verifyTestCount();
            test14.log(LogStatus.INFO, "Ready to verify the Test Order Name");
            verifyTestName();
            test14.log(LogStatus.INFO, "Ready to verify the Test Order Date");
            verifyTestDate();
            verifyScheduleTime();
            //verifyTestPrice();
            test14.log(LogStatus.INFO, "Ready to verify the Test Order Type");
            verifyTestType();
            test14.log(LogStatus.INFO, "Ready to verify the Order Status");
            verifyOrderStatus();
            test14.log(LogStatus.INFO, "Ready to verify the Order Id");
            verifyOrderId();
            test14.log(LogStatus.INFO, "Ready to go to the Test Order Info");
            gotoTestInfo();
            test14.log(LogStatus.INFO, "Ready to verify the payment header");
            verifyPaymentHeader();
            test14.log(LogStatus.INFO, "Ready to verify the Test name and price");
            verifyTestNameAndPrice();
            test14.log(LogStatus.INFO, "Ready to verify the Shipping name and Price");
            verifyShippingNameAndPrice();
            test14.log(LogStatus.INFO, "Ready to verify the Total name and price");
            verifyTotalNameAndPrice();
            test14.log(LogStatus.INFO, "Ready to click the close info");
            closeInfo();
            test14.log(LogStatus.INFO, "Ready to verify the Add-on members");
            verifyAddOnMember();
            test14.log(LogStatus.INFO, "Ready to click the close info");
            closeInfo();
            Thread.sleep(2000);
            driver.navigate().back();
        }
    }

    public void verifyTestImage() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_image));
            if (element.isDisplayed()) {
                test14.log(LogStatus.PASS, "Test image visible");
            } else {
                test14.log(LogStatus.FAIL, "Test image not visible");
                getScreenshot("Info_TestImage");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Test image not visible");
            getScreenshot("Info_TImage");
        }
    }

    public void verifyTestCount() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_count));
            if (element.isDisplayed()) {
                String testCount = driver.findElement(test_count).getText();
                //System.out.println(testCount);
                test14.log(LogStatus.PASS, "Test Count visible : " + testCount);
            } else {
                test14.log(LogStatus.INFO, "Test Count not visible");
                getScreenshot("Info_TestCount");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.SKIP, "Test Count not visible");
        }
    }

    public void verifyTestName() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_orders_name));
            if (element.isDisplayed()) {
                String testName = driver.findElement(test_orders_name).getText();
                //System.out.println(testName);
                test14.log(LogStatus.PASS, "Test Name visible : " + testName);
            } else {
                test14.log(LogStatus.FAIL, "Test name not visible");
                getScreenshot("Info_TestName");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Test name not visible");
            getScreenshot("Info_TestName");
        }
    }

    public void verifyTestDate() throws InterruptedException, IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_orders_date));
            if (element.isDisplayed()) {
                String testName = driver.findElement(test_orders_date).getText();
                //System.out.println(testName);
                test14.log(LogStatus.PASS, "Test Order date visible : " + testName);
            } else {
                test14.log(LogStatus.FAIL, "Test Order date not visible");
                getScreenshot("Info_OrderDate");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Test Order date not visible");
            getScreenshot("Info_OrderDate");
        }
    }

    public void verifyScheduleTime() throws IOException {
        test14.log(LogStatus.INFO, "Ready to verify the Test Schedule Time & Price");
        try {
            //Thread.sleep(2000);
            WebElement payProceed = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(test_orders_Sched_price));
            if (payProceed.isDisplayed()) {
                String testPrice = driver.findElement(test_orders_Sched_price).getText();
                //System.out.println(testPrice);
                if (testPrice.contains("$")) {
                    test14.log(LogStatus.SKIP, "Schedule Time is not visible");
                    test14.log(LogStatus.INFO, "Ready to verify the Test Order Price");
                    test14.log(LogStatus.PASS, "Test Price is : " + testPrice);
                } else if (testPrice.equals("null") || testPrice.isEmpty()) {
                    test14.log(LogStatus.INFO, "Ready to verify the Test Order Price");
                    test14.log(LogStatus.WARNING, "Test Price is not visible: " + testPrice);
                } else {
                    test14.log(LogStatus.INFO, "Ready to verify the Test Schedule Time");
                    test14.log(LogStatus.PASS, "Test Schedule Time Visible : " + testPrice);
                    verifyTestPrice();
                }
            } else {
                test14.log(LogStatus.FAIL, "Test Schedule Time & Test Price are not visible");
                getScreenshot("Info_TestSchedule");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.WARNING, "Test Schedule Time and Test Price are not visible");
        }
    }

    public void verifyTestPrice() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_orders_price));
            if (element.isDisplayed()) {
                String schedPrice = driver.findElement(test_orders_price).getText();
                //System.out.println(schedPrice);
                test14.log(LogStatus.PASS, "Test Order Price Visible : " + schedPrice);
            } else {
                test14.log(LogStatus.FAIL, "Test Order Price Visible");
                getScreenshot("Info_OrderPrice");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Test Order Price Visible");
            getScreenshot("Info_OrderPrice");
        }
    }

    public void verifyTestType() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_type));
            if (element.isDisplayed()) {
                String testType = driver.findElement(test_type).getText();
                //System.out.println(testType);
                test14.log(LogStatus.PASS, "Test Order Type visible : " + testType);
            } else {
                test14.log(LogStatus.FAIL, "Test Order Type not visible");
                getScreenshot("Info_TestType");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Test Order Type not visible");
            getScreenshot("Info_TestType");
        }
    }

    public void verifyOrderStatus() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_orders_status));
            if (element.isDisplayed()) {
                String testStatus = driver.findElement(test_orders_status).getText();
                //System.out.println(testStatus);
                test14.log(LogStatus.PASS, "Order Status visible : " + testStatus);
            } else {
                test14.log(LogStatus.FAIL, "Order Status not visible");
                getScreenshot("Info_OrderStatus");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Order Status not visible");
            getScreenshot("Info_OrderStatus");
        }
    }

    public void verifyOrderId() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_orders_id));
            if (element.isDisplayed()) {
                String orderId = driver.findElement(test_orders_id).getText();
                //System.out.println(orderId);
                String[] split = StringUtils.split(orderId, ":");
                //System.out.println("1 : " + split[1]);
                dataList.remove(22);
                dataList.add(22, split[1]);
                test14.log(LogStatus.PASS, "Order Id visible : " + orderId);
            } else {
                test14.log(LogStatus.FAIL, "Order Id not visible");
                getScreenshot("Info_OrderId");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Order Id not visible");
            getScreenshot("Info_OrderId");
        }
    }

    public void gotoTestInfo() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(arrow));
            element.click();
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(info_icon));
            element1.click();
            test14.log(LogStatus.PASS, "Info icon Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Info icon not visible");
            getScreenshot("Info_Icon");
        }
    }

    public void verifyPaymentHeader() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(payment_details_header));
            String paymentHeader = element.getText();
            //System.out.println(paymentHeader);
            if (paymentHeader.contains("Payment Details")) {
                test14.log(LogStatus.PASS, "Payment details header shown as per the requirement : " + paymentHeader);
            } else {
                test14.log(LogStatus.FAIL, "Payment details header not shown as per the requirement : " + paymentHeader);
                getScreenshot("Info_PaymentDetail");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Payment details header not visible");
            getScreenshot("Info_PaymentDetail");
        }
    }

    public void verifyTestNameAndPrice() throws IOException {
        //Thread.sleep(2000);
        try {
            //Thread.sleep(2000);
            WebElement payProceed = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(payment_details_header));
            if (payProceed.isDisplayed()) {
                try {
                    //Thread.sleep(2000);
                    WebElement payProceed1 = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(test_name2));
                    String testName2 = payProceed1.getText();
                    //System.out.println(testName1);
                    if (testName2.equals("null")) {
                        test14.log(LogStatus.FAIL, "Test name not visible");
                        getScreenshot("Info_TestName");
                    } else if (testName2.contains("Test")) {
                        test14.log(LogStatus.PASS, "Test name visible : " + testName2);
                    } else {
                        test14.log(LogStatus.FAIL, "Test name not visible");
                        getScreenshot("Info_TestName");
                    }
                    //Thread.sleep(2000);
                    WebElement payProceed2 = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(test_price2));
                    String testPrices2 = payProceed2.getText();
                    //System.out.println(testPrices);
                    if (testPrices2.equals("null")) {
                        test14.log(LogStatus.FAIL, "Test price not visible");
                        getScreenshot("Info_TestPrice");
                    } else if (testPrices2.contains("$")) {
                        test14.log(LogStatus.PASS, "Test price visible : " + testPrices2);
                    } else {
                        test14.log(LogStatus.FAIL, "Test price not visible");
                        getScreenshot("Info_TestPrice");
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    //Thread.sleep(2000);
                    try {
                        WebElement payProceed1 = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(test_name));
                        String testName = payProceed1.getText();
                        //System.out.println(testName1);
                        if (testName.equals("null")) {
                            test14.log(LogStatus.FAIL, "Test name not visible");
                            getScreenshot("Info_TestName");
                        } else if (testName.contains("Test")) {
                            test14.log(LogStatus.PASS, "Test name is visible : " + testName);
                        } else {
                            test14.log(LogStatus.FAIL, "Test name not visible");
                            getScreenshot("Info_TestName");
                        }
                        //Thread.sleep(2000);
                        WebElement payProceed2 = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(test_price));
                        String testPrices = payProceed2.getText();
                        //System.out.println(testPrices);
                        if (testPrices.equals("null")) {
                            test14.log(LogStatus.FAIL, "Test price not visible");
                            getScreenshot("Info_TestPrice");
                        } else if (testPrices.contains("$")) {
                            test14.log(LogStatus.PASS, "Test price is visible : " + testPrices);
                        } else {
                            test14.log(LogStatus.FAIL, "Test price not visible");
                            getScreenshot("Info_TestPrice");
                        }
                    } catch (NoSuchElementException | TimeoutException e1) {
                        test14.log(LogStatus.WARNING, "Test name and price not visible");
                        getScreenshot("Info_TestNamePrice");
                    }
                }
            } else {
                test14.log(LogStatus.FAIL, "Payment details header not visible");
                getScreenshot("Info_PayHead");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Test name and price not visible");
            getScreenshot("Info_TestNamePrice");
        }
    }

    public void verifyShippingNameAndPrice() throws IOException {
        //Thread.sleep(2000);
        try {
            //Thread.sleep(2000);
            WebElement payProceed1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(payment_details_header));
            if (payProceed1.isDisplayed()) {
                //Thread.sleep(2000);
                try {
                    WebElement tax = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(tax_name2));
                    if (tax.isDisplayed()) {
                        try {
                            WebElement payProceed2 = new WebDriverWait(driver, 1)
                                    .until(driver -> driver.findElement(shipping_name2));
                            String testName2 = payProceed2.getText();
                            //System.out.println(testName1);
                            if (testName2.equals("null") || testName2.isEmpty()) {
                                test14.log(LogStatus.FAIL, "Shipping name not visible");
                                getScreenshot("Info_ShipName");
                            } else if (testName2.contains("Ship")) {
                                test14.log(LogStatus.PASS, "Shipping name visible : " + testName2);
                                WebElement payProceed3 = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(shipping_price2));
                                String testPrices2 = payProceed3.getText();
                                //System.out.println(testPrices);
                                if (testPrices2.equals("null") || testPrices2.isEmpty()) {
                                    test14.log(LogStatus.FAIL, "Shipping price not visible");
                                    getScreenshot("Info_ShipPrice");
                                } else if (testPrices2.contains("$")) {
                                    test14.log(LogStatus.PASS, "Shipping price visible : " + testPrices2);
                                    test14.log(LogStatus.INFO, "Ready to verify Tax name and Price");
                                    verifyTaxNamePrice2();
                                } else {
                                    test14.log(LogStatus.SKIP, "Shipping price not visible");
                                }
                            } else {
                                test14.log(LogStatus.SKIP, "Shipping name and price not visible");
                            }
                        } catch (NoSuchElementException | TimeoutException e) {
                            test14.log(LogStatus.SKIP, "Shipping name and price not visible");
                        }
                    } else {
                        try {
                            WebElement payProceed2 = new WebDriverWait(driver, 1)
                                    .until(driver -> driver.findElement(shipping_name2));
                            String testName2 = payProceed2.getText();
                            //System.out.println(testName1);
                            if (testName2.equals("null") || testName2.isEmpty()) {
                                test14.log(LogStatus.FAIL, "Tax name not visible");
                                getScreenshot("Info_TaxName");
                            } else if (testName2.contains("Tax")) {
                                test14.log(LogStatus.PASS, "Tax name visible : " + testName2);
                                WebElement payProceed3 = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(shipping_price2));
                                String testPrices2 = payProceed3.getText();
                                //System.out.println(testPrices);
                                if (testPrices2.equals("null") || testPrices2.isEmpty()) {
                                    test14.log(LogStatus.FAIL, "Tax price not visible");
                                    getScreenshot("Info_TaxPrice");
                                } else if (testPrices2.contains("$")) {
                                    test14.log(LogStatus.PASS, "Tax price visible : " + testPrices2);
                                } else {
                                    test14.log(LogStatus.FAIL, "Tax price not visible");
                                }
                            } else {
                                test14.log(LogStatus.FAIL, "Tax name and price not visible");
                                getScreenshot("Info_TaxName");
                            }
                        } catch (NoSuchElementException | TimeoutException e) {
                            test14.log(LogStatus.SKIP, "Shipping name and price not visible");
                        }
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    try {
                        WebElement tax = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(tax_name));
                        if (tax.isDisplayed()) {
                            try {
                                WebElement payProceed2 = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(shipping_name));
                                String testName2 = payProceed2.getText();
                                //System.out.println(testName1);
                                if (testName2.equals("null") || testName2.isEmpty()) {
                                    test14.log(LogStatus.FAIL, "Shipping name not visible");
                                    getScreenshot("Info_ShipName");
                                } else if (testName2.contains("Ship")) {
                                    test14.log(LogStatus.PASS, "Shipping name visible : " + testName2);
                                    WebElement payProceed3 = new WebDriverWait(driver, 1)
                                            .until(driver -> driver.findElement(shipping_price));
                                    String testPrices2 = payProceed3.getText();
                                    //System.out.println(testPrices);
                                    if (testPrices2.equals("null") || testPrices2.isEmpty()) {
                                        test14.log(LogStatus.FAIL, "Shipping price not visible");
                                        getScreenshot("Info_ShipPrice");
                                    } else if (testPrices2.contains("$")) {
                                        test14.log(LogStatus.PASS, "Shipping price visible : " + testPrices2);
                                        test14.log(LogStatus.INFO, "Ready to verify Tax name and Price");
                                        verifyTaxNamePrice2();
                                    } else {
                                        test14.log(LogStatus.SKIP, "Shipping price not visible");
                                    }
                                } else {
                                    test14.log(LogStatus.SKIP, "Shipping name and price not visible");
                                    test14.log(LogStatus.INFO, "Ready to verify Tax name and Price");
                                    verifyTaxNamePrice();
                                }
                            } catch (NoSuchElementException | TimeoutException e1) {
                                test14.log(LogStatus.SKIP, "Shipping name and price not visible");
                            }
                        } else {
                            try {
                                WebElement payProceed2 = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(shipping_name));
                                String testName2 = payProceed2.getText();
                                //System.out.println(testName1);
                                if (testName2.equals("null") || testName2.isEmpty()) {
                                    test14.log(LogStatus.FAIL, "Tax name not visible");
                                    getScreenshot("Info_TaxName");
                                } else if (testName2.contains("Tax")) {
                                    test14.log(LogStatus.PASS, "Tax name visible : " + testName2);
                                    WebElement payProceed3 = new WebDriverWait(driver, 1)
                                            .until(driver -> driver.findElement(shipping_price));
                                    String testPrices2 = payProceed3.getText();
                                    //System.out.println(testPrices);
                                    if (testPrices2.equals("null") || testPrices2.isEmpty()) {
                                        test14.log(LogStatus.FAIL, "Tax price not visible");
                                        getScreenshot("Info_TaxPrice");
                                    } else if (testPrices2.contains("$")) {
                                        test14.log(LogStatus.PASS, "Tax price visible : " + testPrices2);
                                    } else {
                                        test14.log(LogStatus.FAIL, "Tax price not visible");
                                    }
                                } else {
                                    test14.log(LogStatus.FAIL, "Tax name and price not visible");
                                    getScreenshot("Info_TaxName");
                                }
                            } catch (NoSuchElementException | TimeoutException e1) {
                                test14.log(LogStatus.SKIP, "Shipping name and price not visible");
                            }
                        }
                    } catch (NoSuchElementException | TimeoutException e1) {
                        test14.log(LogStatus.SKIP, "Shipping name and price not visible");
                        test14.log(LogStatus.INFO, "Ready to verify Tax name and Price");
                        verifyTaxNamePrice();
                    }
                }
            } else {
                test14.log(LogStatus.FAIL, "Payment details header not visible");
                getScreenshot("Info_PayHead");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.SKIP, "Shipping name and price not visible");
        }
    }

    public void verifyTaxNamePrice() throws IOException {
        //Thread.sleep(2000);
        try {
            //Thread.sleep(2000);
            WebElement payProceed = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(payment_details_header));
            if (payProceed.isDisplayed()) {
                try {
                    //Thread.sleep(2000);
                    WebElement payProceed1 = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(shipping_name2));
                    String testName2 = payProceed1.getText();
                    //System.out.println("Tax name : " + testName2);
                    if (testName2.equals("null")) {
                        test14.log(LogStatus.FAIL, "Tax name not visible");
                        getScreenshot("Info_TaxName");
                    } else if (testName2.contains("Tax")) {
                        test14.log(LogStatus.PASS, "Tax name visible : " + testName2);
                    } else {
                        test14.log(LogStatus.FAIL, "Tax name not visible");
                        getScreenshot("Info_TaxName");
                    }
                    //Thread.sleep(2000);
                    WebElement payProceed2 = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(shipping_price2));
                    String testPrices2 = payProceed2.getText();
                    //System.out.println(testPrices);
                    if (testPrices2.equals("null")) {
                        test14.log(LogStatus.FAIL, "Tax price not visible");
                        getScreenshot("Info_TaxPrice");
                    } else if (testPrices2.contains("$")) {
                        test14.log(LogStatus.PASS, "Tax price visible : " + testPrices2);
                    } else {
                        test14.log(LogStatus.FAIL, "Tax price not visible");
                        getScreenshot("Info_TaxPrice");
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    //Thread.sleep(2000);
                    try {
                        WebElement payProceed1 = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(shipping_name));
                        String testName = payProceed1.getText();
                        //System.out.println("Tax name is : " + testName);
                        if (testName.equals("null")) {
                            test14.log(LogStatus.FAIL, "Tax name not visible");
                            getScreenshot("Info_TaxName");
                        } else if (testName.contains("Tax")) {
                            test14.log(LogStatus.PASS, "Tax name is visible : " + testName);
                        } else {
                            test14.log(LogStatus.FAIL, "Tax name not visible");
                            getScreenshot("Info_TaxName");
                        }
                        //Thread.sleep(2000);
                        WebElement payProceed2 = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(shipping_price));
                        String testPrices = payProceed2.getText();
                        //System.out.println(testPrices);
                        if (testPrices.equals("null")) {
                            test14.log(LogStatus.FAIL, "Tax price not visible");
                            getScreenshot("Info_TaxPrice");
                        } else if (testPrices.contains("$")) {
                            test14.log(LogStatus.PASS, "Tax price is visible : " + testPrices);
                        } else {
                            test14.log(LogStatus.FAIL, "Tax price not visible");
                            getScreenshot("Info_TaxPrice");
                        }
                    } catch (NoSuchElementException | TimeoutException e1) {
                        test14.log(LogStatus.WARNING, "Tax name and price not visible");
                    }
                }
            } else {
                test14.log(LogStatus.FAIL, "Payment details header not visible");
                getScreenshot("Info_PayHead");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Tax name and price not visible");
            getScreenshot("Info_TaxNamePrice");
        }
    }

    public void verifyTaxNamePrice2() throws IOException {
        //Thread.sleep(2000);
        try {
            //Thread.sleep(2000);
            WebElement payProceed = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(payment_details_header));
            if (payProceed.isDisplayed()) {
                try {
                    //Thread.sleep(2000);
                    WebElement payProceed1 = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(tax_name2));
                    String testName2 = payProceed1.getText();
                    //System.out.println("Tax name : " + testName2);
                    if (testName2.equals("null")) {
                        test14.log(LogStatus.FAIL, "Tax name not visible");
                        getScreenshot("Info_TaxName");
                    } else if (testName2.contains("Tax")) {
                        test14.log(LogStatus.PASS, "Tax name visible : " + testName2);
                    } else {
                        test14.log(LogStatus.FAIL, "Tax name not visible");
                        getScreenshot("Info_TaxName");
                    }
                    //Thread.sleep(2000);
                    WebElement payProceed2 = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(tax_price2));
                    String testPrices2 = payProceed2.getText();
                    //System.out.println(testPrices);
                    if (testPrices2.equals("null")) {
                        test14.log(LogStatus.FAIL, "Tax price not visible");
                        getScreenshot("Info_TaxPrice");
                    } else if (testPrices2.contains("$")) {
                        test14.log(LogStatus.PASS, "Tax price visible : " + testPrices2);
                    } else {
                        test14.log(LogStatus.FAIL, "Tax price not visible");
                        getScreenshot("Info_TaxPrice");
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    //Thread.sleep(2000);
                    try {
                        WebElement payProceed1 = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(tax_name));
                        String testName = payProceed1.getText();
                        //System.out.println("Tax name is : " + testName);
                        if (testName.equals("null")) {
                            test14.log(LogStatus.FAIL, "Tax name not visible");
                            getScreenshot("Info_TaxName");
                        } else if (testName.contains("Tax")) {
                            test14.log(LogStatus.PASS, "Tax name is visible : " + testName);
                        } else {
                            test14.log(LogStatus.FAIL, "Tax name not visible");
                            getScreenshot("Info_TaxName");
                        }
                        //Thread.sleep(2000);
                        WebElement payProceed2 = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(tax_price));
                        String testPrices = payProceed2.getText();
                        //System.out.println(testPrices);
                        if (testPrices.equals("null")) {
                            test14.log(LogStatus.FAIL, "Tax price not visible");
                            getScreenshot("Info_TaxPrice");
                        } else if (testPrices.contains("$")) {
                            test14.log(LogStatus.PASS, "Tax price is visible : " + testPrices);
                        } else {
                            test14.log(LogStatus.FAIL, "Tax price not visible");
                            getScreenshot("Info_TaxPrice");
                        }
                    } catch (NoSuchElementException | TimeoutException e1) {
                        test14.log(LogStatus.WARNING, "Tax name and price not visible");
                    }
                }
            } else {
                test14.log(LogStatus.FAIL, "Payment details header not visible");
                getScreenshot("Info_PayHead");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Tax name and price not visible");
            getScreenshot("Info_TaxNamePrice");
        }
    }

    public void verifyTotalNameAndPrice() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(info_close));
            element.click();
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_total_price));
            String tot = element1.getText();
            String[] split = StringUtils.split(tot, "$ ");
            String tot2 = split[1];
            //System.out.println(tot1);
            //System.out.println(tot2);
            WebElement element2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(info_icon));
            element2.click();
            WebElement element3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(total));
            if (element3.isDisplayed()) {
                String totalName = driver.findElement(total).getText();
                test14.log(LogStatus.PASS, "Total name visible : " + totalName);
            } else {
                test14.log(LogStatus.FAIL, "Total name not visible");
                getScreenshot("Info_TotalName");
            }
            WebElement element4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(total_price));
            if (element4.isDisplayed()) {
                String totalPrice = driver.findElement(total_price).getText();
                String[] split1 = StringUtils.split(totalPrice, "$ ");
                String totPrice1 = split1[0];
                //System.out.println(totPrice1);
                test14.log(LogStatus.PASS, "Total price visible : " + totalPrice);
                if (tot2.equals(totPrice1)) {
                    test14.log(LogStatus.PASS, "Total price values are same with test orders page price value");
                    test14.log(LogStatus.INFO, "Info Price value : " + totalPrice);
                    test14.log(LogStatus.INFO, "Page Price value : " + tot);
                } else {
                    test14.log(LogStatus.WARNING, "Total price values are not same with test orders page price value");
                    test14.log(LogStatus.INFO, "Info Price value : " + totalPrice);
                    test14.log(LogStatus.INFO, "Page Price value : " + tot);
                    getScreenshot("Info_TotalPrice");
                }
            } else {
                test14.log(LogStatus.FAIL, "Total price not visible");
                getScreenshot("Info_TotalPrice");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.FAIL, "Total name and price not visible");
            getScreenshot("Info_TotalNamePrice");
        }
    }

    public void closeInfo() throws InterruptedException, IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(info_close));
            element.click();
            test14.log(LogStatus.PASS, "Info close icon Clicked");
            Thread.sleep(2000);
            driver.navigate().back();
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.SKIP, "Info close icon not visible");
            Thread.sleep(2000);
            driver.navigate().back();
            getScreenshot("Info_CloseIcon");
        }
    }

    public void verifyAddOnMember() throws InterruptedException, IOException {
        try {
            WebElement element = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(test_count));
            String testCount = element.getText();
            //System.out.println(testCount);
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(arrow));
            element1.click();
            WebElement element2 = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(info_icon));
            element2.click();
            WebElement element3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(addon_header));
            String addHeader = element3.getText();
            //System.out.println(addHeader);
            if (addHeader.contains("Add New Member \n" + "(Family or Co-workers")) {
                test14.log(LogStatus.PASS, "Add-On Header Shown as per the requirement : " + addHeader);
            } else {
                test14.log(LogStatus.FAIL, "Add-On Header not shown as per the requirement : " + addHeader);
                getScreenshot("Info_AddOnHeader");
            }
            if (testCount.contains("+1")) {
                WebElement element4 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_name_first));
                String patientName = element4.getText();
                //System.out.println(patientName);
                if (patientName.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient name not visible : " + patientName);
                    getScreenshot("Info_PatientName");
                } else {
                    test14.log(LogStatus.PASS, "Patient name is visible : " + patientName);
                }
                WebElement element5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_age_first));
                String patientAge = element5.getText();
                //System.out.println(patientAge);
                if (patientAge.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient age not visible : " + patientAge);
                    getScreenshot("Info_PatientAge");
                } else {
                    test14.log(LogStatus.PASS, "Patient age is visible : " + patientAge);
                }
                WebElement element6 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_gender_first));
                String patientGender = element6.getText();
                //System.out.println(patientGender);
                if (patientGender.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient gender not visible : " + patientGender);
                    getScreenshot("Info_PatientGender");
                } else {
                    test14.log(LogStatus.PASS, "Patient gender is visible : " + patientGender);
                }
            } else if (testCount.contains("+2")) {
                WebElement element4 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_name_first));
                String patientName = element4.getText();
                //System.out.println(patientName);
                if (patientName.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 1 name not visible : " + patientName);
                    getScreenshot("Info_Patient1Name");
                } else {
                    test14.log(LogStatus.PASS, "Patient 1 name is visible : " + patientName);
                }
                WebElement element5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_age_first));
                String patientAge = element5.getText();
                //System.out.println(patientAge);
                if (patientAge.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 1 age not visible : " + patientAge);
                    getScreenshot("Info_Patient1Age");
                } else {
                    test14.log(LogStatus.PASS, "Patient 1 age is visible : " + patientAge);
                }
                WebElement element6 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_gender_first));
                String patientGender = element6.getText();
                //System.out.println(patientGender);
                if (patientGender.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 1 gender not visible : " + patientGender);
                    getScreenshot("Info_Patient1Gender");
                } else {
                    test14.log(LogStatus.PASS, "Patient 1 gender is visible : " + patientGender);
                }
                WebElement element7 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_name_second));
                String patientName2 = element7.getText();
                //System.out.println(patientName2);
                if (patientName2.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 2 name not visible : " + patientName2);
                    getScreenshot("Info_Patient2Name");
                } else {
                    test14.log(LogStatus.PASS, "Patient 2 name is visible : " + patientName2);
                }
                WebElement element8 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_age_second));
                String patientAge2 = element8.getText();
                //System.out.println(patientAge2);
                if (patientAge2.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 2 age not visible : " + patientAge2);
                    getScreenshot("Info_Patient2Age");
                } else {
                    test14.log(LogStatus.PASS, "Patient 2 age is visible : " + patientAge2);
                }
                WebElement element9 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_gender_second));
                String patientGender2 = element9.getText();
                //System.out.println(patientGender2);
                if (patientGender2.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 2 gender not visible : " + patientGender2);
                    getScreenshot("Info_Patient2Gender");
                } else {
                    test14.log(LogStatus.PASS, "Patient 2 gender is visible : " + patientGender2);
                }
            } else if (testCount.contains("+3")) {
                WebElement element4 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_name_first));
                String patientName = element4.getText();
                //System.out.println(patientName);
                if (patientName.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 1 name not visible : " + patientName);
                    getScreenshot("Info_Patient1Name");
                } else {
                    test14.log(LogStatus.PASS, "Patient 1 name is visible : " + patientName);
                }
                WebElement element5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_age_first));
                String patientAge = element5.getText();
                //System.out.println(patientAge);
                if (patientAge.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 1 age not visible : " + patientAge);
                    getScreenshot("Info_Patient1Age");
                } else {
                    test14.log(LogStatus.PASS, "Patient 1 age is visible : " + patientAge);
                }
                WebElement element6 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_gender_first));
                String patientGender = element6.getText();
                //System.out.println(patientGender);
                if (patientGender.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 1 gender not visible : " + patientGender);
                    getScreenshot("Info_Patient1Gender");
                } else {
                    test14.log(LogStatus.PASS, "Patient 1 gender is visible : " + patientGender);
                }
                WebElement element7 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_name_second));
                String patientName2 = element7.getText();
                //System.out.println(patientName2);
                if (patientName2.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 2 name not visible : " + patientName2);
                    getScreenshot("Info_Patient2Name");
                } else {
                    test14.log(LogStatus.PASS, "Patient 2 name is visible : " + patientName2);
                }
                WebElement element8 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_age_second));
                String patientAge2 = element8.getText();
                //System.out.println(patientAge2);
                if (patientAge2.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 2 age not visible : " + patientAge2);
                    getScreenshot("Info_Patient2Age");
                } else {
                    test14.log(LogStatus.PASS, "Patient 2 age is visible : " + patientAge2);
                }
                WebElement element9 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_gender_second));
                String patientGender2 = element9.getText();
                //System.out.println(patientGender2);
                if (patientGender2.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 2 gender not visible : " + patientGender2);
                    getScreenshot("Info_Patient2Gender");
                } else {
                    test14.log(LogStatus.PASS, "Patient 2 gender is visible : " + patientGender2);
                }
                WebElement element10 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_name_third));
                String patientName3 = element10.getText();
                //System.out.println(patientName3);
                if (patientName3.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 3 name not visible : " + patientName3);
                    getScreenshot("Info_Patient3Name");
                } else {
                    test14.log(LogStatus.PASS, "Patient 3 name is visible : " + patientName3);
                }
                WebElement element11 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_age_third));
                String patientAge3 = element11.getText();
                //System.out.println(patientAge3);
                if (patientAge3.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 3 age not visible : " + patientAge3);
                    getScreenshot("Info_Patient3Age");
                } else {
                    test14.log(LogStatus.PASS, "Patient 3 age is visible : " + patientAge3);
                }
                WebElement element12 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_gender_third));
                String patientGender3 = element12.getText();
                //System.out.println(patientGender3);
                if (patientGender3.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 3 gender not visible : " + patientGender3);
                    getScreenshot("Info_Patient3Gender");
                } else {
                    test14.log(LogStatus.PASS, "Patient 3 gender is visible : " + patientGender3);
                }
            } else if (testCount.contains("+4")) {
                WebElement element4 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_name_first));
                String patientName = element4.getText();
                //System.out.println(patientName);
                if (patientName.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 1 name not visible : " + patientName);
                    getScreenshot("Info_Patient1Name");
                } else {
                    test14.log(LogStatus.PASS, "Patient 1 name is visible : " + patientName);
                }
                WebElement element5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_age_first));
                String patientAge = element5.getText();
                //System.out.println(patientAge);
                if (patientAge.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 1 age not visible : " + patientAge);
                    getScreenshot("Info_Patient1Age");
                } else {
                    test14.log(LogStatus.PASS, "Patient 1 age is visible : " + patientAge);
                }
                WebElement element6 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_gender_first));
                String patientGender = element6.getText();
                //System.out.println(patientGender);
                if (patientGender.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 1 gender not visible : " + patientGender);
                    getScreenshot("Info_Patient1Gender");
                } else {
                    test14.log(LogStatus.PASS, "Patient 1 gender is visible : " + patientGender);
                }
                WebElement element7 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_name_second));
                String patientName2 = element7.getText();
                //System.out.println(patientName2);
                if (patientName2.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 2 name not visible : " + patientName2);
                    getScreenshot("Info_Patient2Name");
                } else {
                    test14.log(LogStatus.PASS, "Patient 2 name is visible : " + patientName2);
                }
                WebElement element8 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_age_second));
                String patientAge2 = element8.getText();
                //System.out.println(patientAge2);
                if (patientAge2.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 2 age not visible : " + patientAge2);
                    getScreenshot("Info_Patient2Age");
                } else {
                    test14.log(LogStatus.PASS, "Patient 2 age is visible : " + patientAge2);
                }
                WebElement element9 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_gender_second));
                String patientGender2 = element9.getText();
                //System.out.println(patientGender2);
                if (patientGender2.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 2 gender not visible : " + patientGender2);
                    getScreenshot("Info_Patient2Gender");
                } else {
                    test14.log(LogStatus.PASS, "Patient 2 gender is visible : " + patientGender2);
                }
                WebElement element10 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_name_third));
                String patientName3 = element10.getText();
                //System.out.println(patientName3);
                if (patientName3.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 3 name not visible : " + patientName3);
                    getScreenshot("Info_Patient3Name");
                } else {
                    test14.log(LogStatus.PASS, "Patient 3 name is visible : " + patientName3);
                }
                WebElement element11 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_age_third));
                String patientAge3 = element11.getText();
                //System.out.println(patientAge3);
                if (patientAge3.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 3 age not visible : " + patientAge3);
                    getScreenshot("Info_Patient3Age");
                } else {
                    test14.log(LogStatus.PASS, "Patient 3 age is visible : " + patientAge3);
                }
                WebElement element12 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(patient_gender_third));
                String patientGender3 = element12.getText();
                //System.out.println(patientGender3);
                if (patientGender3.contains("null")) {
                    test14.log(LogStatus.FAIL, "Patient 3 gender not visible : " + patientGender3);
                    getScreenshot("Info_Patient3Gender");
                } else {
                    test14.log(LogStatus.PASS, "Patient 3 gender is visible : " + patientGender3);
                }
            }
            WebElement element4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(patient_name_fourth));
            String patientName4 = element4.getText();
            //System.out.println(patientName4);
            if (patientName4.contains("null")) {
                test14.log(LogStatus.FAIL, "Patient 4 name not visible : " + patientName4);
                getScreenshot("Info_Patient4Name");
            } else {
                test14.log(LogStatus.PASS, "Patient 4 name is visible " + patientName4);
            }
            WebElement element5 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(patient_age_fourth));
            String patientAge4 = element5.getText();
            //System.out.println(patientAge4);
            if (patientAge4.contains("null")) {
                test14.log(LogStatus.FAIL, "Patient 4 age not visible : " + patientAge4);
                getScreenshot("Info_Patient4Age");
            } else {
                test14.log(LogStatus.PASS, "Patient 4 age is visible : " + patientAge4);
            }
            WebElement element6 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(patient_gender_fourth));
            String patientGender4 = element6.getText();
            //System.out.println(patientGender4);
            if (patientGender4.contains("null")) {
                test14.log(LogStatus.FAIL, "Patient 4 gender not visible : " + patientGender4);
                getScreenshot("Info_Patient4Gender");
            } else {
                test14.log(LogStatus.PASS, "Patient 4 gender is visible : " + patientGender4);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test14.log(LogStatus.SKIP, "Add on Member window not visible");
        }
    }

}

