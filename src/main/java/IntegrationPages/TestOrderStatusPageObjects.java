package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

import static IntegrationPages.TestBaseApp.getScreenshot;
import static IntegrationPages.TestBaseApp.test15;

public class TestOrderStatusPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By menu = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n");
    By test_orders = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView\n");
    By test_orders_status = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.view.ViewGroup[2]/android.widget.TextView\n");

    public TestOrderStatusPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void gotoTestOrders() throws InterruptedException {
        test15.log(LogStatus.INFO, "Ready to go to the Test Orders");
        try {
            Thread.sleep(2000);
            driver.findElement(menu).click();
            Thread.sleep(2000);
            driver.findElement(test_orders).click();
            test15.log(LogStatus.PASS, "Test Orders Page opened");
        } catch (NoSuchElementException e) {
            test15.log(LogStatus.SKIP, "Pages already stayed in Test Orders Screen");
        }
    }

    public void verifyOrderStatus(String A, String B, String C, String D, String E, String F) throws InterruptedException, IOException {
        test15.log(LogStatus.INFO, "Ready to verify the Test Orders Status");
        try {
            Thread.sleep(2000);
            String status = driver.findElement(test_orders_status).getText();
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
        } catch (NoSuchElementException e) {
            test15.log(LogStatus.FAIL, "Status not shown");
            getScreenshot("Status_TestStatus");
        }
    }

}
