package AppTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class TestOrdersTrack extends AppTestBase {

    @Test(priority = 1)
    public void MobileNumber_Signup() throws InterruptedException, IOException {
        MobileNumberSignupPageObjects mobileObj = new MobileNumberSignupPageObjects(driver);

        mobileObj.verifyPopup();
        mobileObj.verifyMobileNumber("4800000000");
    }

    @Test(priority = 2)
    public void OTP_Page() throws InterruptedException, IOException {
        OtpPageObjects otpObj = new OtpPageObjects(driver);

        otpObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        Thread.sleep(10000);
        otpObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test(priority = 3)
    public void Test_Orders_Info() throws InterruptedException, IOException {
        TestOrdersInfoPageObjects infObj = new TestOrdersInfoPageObjects(driver);

        infObj.clickMenu();
        infObj.clickTestOrders();
        infObj.verifyTestOrdersTitle();
        infObj.verifyTestOrders();
    }

    @Test(priority = 4)
    public void Test_Orders_Status() throws InterruptedException, IOException {
        TestOrderStatusPageObjects statusObj = new TestOrderStatusPageObjects(driver);

        statusObj.gotoTestOrders();
        statusObj.verifyOrderStatus("Pending", "Approved", "InProgress", "Completed", "Rejected", "Refunded");
    }

    @Test(priority = 5)
    public void Test_Orders_Track() throws InterruptedException, IOException {
        TestOrdersTrackPageObjects trackObj = new TestOrdersTrackPageObjects(driver);

        trackObj.gotoTestOrders();
        trackObj.gotoOrderTrack("My Test Order Track");
        trackObj.verifyOrderInfo();
        trackObj.verifyTestOrderPlaceScreen("Test Order Placed", "We have received your test order");
        trackObj.verifyTestOrderConfirmScreen("Test Order Confirmed", "Your test order has been confirmed");
        trackObj.verifyDoctorVisitScreen();
        trackObj.goBack();
        trackObj.backToHome();
    }

    @Test(priority = 6)
    public void Logout() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.Logout();
    }

}
