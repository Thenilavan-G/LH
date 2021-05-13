package AppTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class BookAInHomeTest extends AppTestBase {

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
    public void BookA_InHomeTest_COVID19PCRTest() throws InterruptedException, IOException {
        BookATestPageObjects BookHomeObj = new BookATestPageObjects(driver);

        BookHomeObj.ClickBookATest();
        BookHomeObj.ClickHomeTest();
        BookHomeObj.ClickCovid19PCRTest();
        BookHomeObj.ClickTermsConditionsCheckBox();
        BookHomeObj.ClickHomeTestSchedule();
        BookHomeObj.ClickHomeTestScheduleNextDay();
        BookHomeObj.ClickHomeTestScheduleNextDayEve();
        BookHomeObj.ClickHomeTestScheduleNextDayEveTime();
        BookHomeObj.ClickHomeTestScheduleProceed();
        BookHomeObj.ClickOrderSummary_Proceed();
        BookHomeObj.ClickPaymentDetails_Proceed();
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(9));
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(10));
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(11));
        BookHomeObj.SetPaymentGateway_Name(dataList.get(12));
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_InHomeTest_COVID19AntibodyTest() throws InterruptedException, IOException {
        BookATestPageObjects BookHomeObj = new BookATestPageObjects(driver);

        BookHomeObj.ClickBookATest();
        BookHomeObj.ClickHomeTest();
        BookHomeObj.ClickCovid19AntibodyTest();
        BookHomeObj.ClickTermsConditionsCheckBox();
        BookHomeObj.ClickHomeTestSchedule();
        BookHomeObj.ClickHomeTestScheduleNextDay();
        BookHomeObj.ClickHomeTestScheduleNextDayEve();
        BookHomeObj.ClickHomeTestScheduleNextDayEveTime();
        BookHomeObj.ClickHomeTestScheduleProceed();
        BookHomeObj.ClickOrderSummary_Proceed();
        BookHomeObj.ClickPaymentDetails_Proceed();
        BookHomeObj.SetPaymentGateway_CardNumber("4111111111111111");
        BookHomeObj.SetPaymentGateway_CardEXP("1223");
        BookHomeObj.SetPaymentGateway_CVC("123");
        BookHomeObj.SetPaymentGateway_Name("John");
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_InHomeTest_RPPTest() throws InterruptedException, IOException {
        BookATestPageObjects BookHomeObj = new BookATestPageObjects(driver);

        BookHomeObj.ClickBookATest();
        BookHomeObj.ClickHomeTest();
        BookHomeObj.ClickRPPTest();
        BookHomeObj.ClickTermsConditionsCheckBox();
        BookHomeObj.ClickHomeTestSchedule();
        BookHomeObj.ClickHomeTestScheduleNextDay();
        BookHomeObj.ClickHomeTestScheduleNextDayEve();
        BookHomeObj.ClickHomeTestScheduleNextDayEveTime();
        BookHomeObj.ClickHomeTestScheduleProceed();
        BookHomeObj.ClickOrderSummary_Proceed();
        BookHomeObj.ClickPaymentDetails_Proceed();
        BookHomeObj.SetPaymentGateway_CardNumber("4111111111111111");
        BookHomeObj.SetPaymentGateway_CardEXP("1223");
        BookHomeObj.SetPaymentGateway_CVC("123");
        BookHomeObj.SetPaymentGateway_Name("John");
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_InHomeTest_MicrobiomeTest() throws InterruptedException, IOException {
        BookATestPageObjects BookHomeObj = new BookATestPageObjects(driver);

        BookHomeObj.ClickBookATest();
        BookHomeObj.ClickHomeTest();
        BookHomeObj.ClickMicrobiomeTest();
        BookHomeObj.ClickTermsConditionsCheckBox();
        BookHomeObj.ClickHomeTestSchedule();
        BookHomeObj.ClickHomeTestScheduleNextDay();
        BookHomeObj.ClickHomeTestScheduleNextDayEve();
        BookHomeObj.ClickHomeTestScheduleNextDayEveTime();
        BookHomeObj.ClickHomeTestScheduleProceed();
        BookHomeObj.ClickOrderSummary_Proceed();
        BookHomeObj.ClickPaymentDetails_Proceed();
        BookHomeObj.SetPaymentGateway_CardNumber("4111111111111111");
        BookHomeObj.SetPaymentGateway_CardEXP("1223");
        BookHomeObj.SetPaymentGateway_CVC("123");
        BookHomeObj.SetPaymentGateway_Name("John");
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test(priority = 4)
    public void Test_Orders_Info() throws InterruptedException, IOException {
        TestOrdersInfoPageObjects infObj = new TestOrdersInfoPageObjects(driver);

        infObj.clickMenu();
        infObj.clickTestOrders();
        infObj.verifyTestOrdersTitle();
        infObj.verifyTestOrders();
    }

//    @Test(priority = 5)
//    public void Logout() throws InterruptedException, IOException {
//        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);
//
//        leftObj.clickDashboardMenu();
//        leftObj.Logout();
//    }

}
