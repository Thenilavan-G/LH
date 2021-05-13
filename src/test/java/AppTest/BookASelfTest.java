package AppTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class BookASelfTest extends AppTestBase {

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
        otpObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test(priority = 3)
    public void BookA_SelfTest_COVID19PCRTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ClickCovid19PCRTest();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.SetPaymentGateway_CardNumber("4111111111111111");
        BookSelfObj.SetPaymentGateway_CardEXP("1223");
        BookSelfObj.SetPaymentGateway_CVC("123");
        BookSelfObj.SetPaymentGateway_Name("John");
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_SelfTest_COVID19AntibodyTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ClickCovid19AntibodyTest();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.SetPaymentGateway_CardNumber("4111111111111111");
        BookSelfObj.SetPaymentGateway_CardEXP("1223");
        BookSelfObj.SetPaymentGateway_CVC("123");
        BookSelfObj.SetPaymentGateway_Name("John");
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_SelfTest_RPPTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ClickRPPTest();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.SetPaymentGateway_CardNumber("4111111111111111");
        BookSelfObj.SetPaymentGateway_CardEXP("1223");
        BookSelfObj.SetPaymentGateway_CVC("123");
        BookSelfObj.SetPaymentGateway_Name("John");
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_SelfTest_MicrobiomeTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ClickMicrobiomeTest();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.SetPaymentGateway_CardNumber("4111111111111111");
        BookSelfObj.SetPaymentGateway_CardEXP("1223");
        BookSelfObj.SetPaymentGateway_CVC("123");
        BookSelfObj.SetPaymentGateway_Name("John");
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test(priority = 4)
    public void Test_Orders_Info() throws InterruptedException, IOException {
        TestOrdersInfoPageObjects infObj = new TestOrdersInfoPageObjects(driver);

        infObj.clickMenu();
        infObj.clickTestOrders();
        infObj.verifyTestOrdersTitle();
        infObj.verifyTestOrders();
    }

    @Test
    public void Logout() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.clickDashboardMenu();
        leftObj.Logout();
    }

}
