package AppPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static AppPages.AppTestBase.getScreenshot;
import static AppPages.AppTestBase.test15;

public class TestOrderStatusPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By menu = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n");
    By test_orders = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView\n");
    By test_orders_status = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.view.ViewGroup[2]/android.widget.TextView\n");

    public TestOrderStatusPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void gotoTestOrders() {
        test15.log(LogStatus.INFO, "Ready to go to the Test Orders");
        try {
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(menu));
            element.click();
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_orders));
            element1.click();
            test15.log(LogStatus.PASS, "Test Orders Page opened");
        } catch (NoSuchElementException | TimeoutException e) {
            test15.log(LogStatus.SKIP, "Pages already stayed in Test Orders Screen");
        }
    }

    public void verifyOrderStatus(String A, String B, String C, String D, String E, String F) throws InterruptedException, IOException {
        test15.log(LogStatus.INFO, "Ready to verify the Test Orders Status");
        try {
            Thread.sleep(2000);
            WebElement stat = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(test_orders_status));
            String status = stat.getText();
            //System.out.println(status);
            if (status.contains(A)) {
                test15.log(LogStatus.PASS, "Order status is Pending : " + status);
            } else if (status.contains(B)) {
                test15.log(LogStatus.PASS, "Order status is Approved : " + status);
            } else if (status.contains(C)) {
                test15.log(LogStatus.PASS, "Status is InProgress : " + status);
            } else if (status.contains(D)) {
                test15.log(LogStatus.PASS, "Status is Completed : " + status);
            } else if (status.contains(E)) {
                test15.log(LogStatus.PASS, "Status is Rejected : " + status);
            } else if (status.contains(F)) {
                test15.log(LogStatus.PASS, "Status is Refunded : " + status);
            } else {
                test15.log(LogStatus.FAIL, "Status not shown : " + status);
                getScreenshot("Status_TestStatus");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test15.log(LogStatus.FAIL, "Status not shown");
            getScreenshot("Status_TestStatus");
        }
    }

}
