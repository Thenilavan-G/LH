package AppPages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.io.IOException;

import static AppPages.AppTestBase.getScreenshot;
import static AppPages.AppTestBase.test13;

public class BookATestPageObjects {

    private final AppiumDriver<MobileElement> driver;

    //SelfTestPayment Gateway Test Name is not Displayed
    By ClickBookATest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout\n");
    //By ClickSelfTest = By.id("com.lifehope:id/textViewSelfTest");

    //HomeTest
    By ClickHomeTest = By.id("com.lifehope:id/textViewHomeTest");
    By ClickHomeTestSchedule = By.id("com.lifehope:id/button_schedule_test");
    //By ClickNextDay = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]");
    By ClickNextDay = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]");
    By ClickEveneingLabel = By.id("com.lifehope:id/textview_eveningLabel");
    //By ClickNextSecondTime = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
    By ClickNextSecondTime = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    By ClickProceedtoSchedule = By.id("com.lifehope:id/buttonConfirmSchedule");
    By ReadScheduledDate = By.id("com.lifehope:id/textview_SelectDate");

    //Common
    By ReadBookTest_Info = By.id("com.lifehope:id/textViewInfoText");
    By ReadBookTest_Covid19PCRTest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By ReadBookTest_Covid19PCRTest_Desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    //By ReadBookTest_Covid19PCRTest_Charge = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]");
    By ReadBookTest_Covid19AntibodyTest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By ReadBookTest_Covid19AntibodyTest_Desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    //By ReadBookTest_Covid19AntibodyTest_Charge = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]");
    By ReadBookTest_RPPTest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By ReadBookTest_RPPTest_Desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    //By ReadBookTest_RPPTest_Charge = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]");
    By ReadBookTest_MicrobiomeTest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By ReadBookTest_MicrobiomeTest_Desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    //By ReadBookTest_MicrobiomeTest_Charge = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]");
    By ClickCovid19PCRTest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
    By ClickCovid19AntobodyTest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
    By ClickRPPTest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
    By ClickMicrobiomeTest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
    //By ClickBackfromBookingDetails = By.id("com.lifehope:id/imageview_back_arrow");
    By ReadBookingDetails_FirstName = By.id("com.lifehope:id/edittext_name");
    By ReadBookingDetails_LastName = By.id("com.lifehope:id/edittext_lastname");
    By ReadBookingDetails_Gender = By.id("android:id/text1");
    By ReadBookingDetails_DOB = By.id("com.lifehope:id/edittext_dob");
    By ReadBookingDetails_MobileNumber = By.id("com.lifehope:id/edittext_mobile");
    By ReadBookingDetails_Address = By.id("com.lifehope:id/edittext_address");
    By ReadBookingDetails_Info = By.id("com.lifehope:id/textViewInfoText");
    By ClickTermsConditions = By.id("com.lifehope:id/textViewTerms");
    By ReadTermsConditions = By.id("com.lifehope:id/textview_dialog_heading");
    By ClickTermsConditionsOk = By.id("com.lifehope:id/button_proceed");
    By ClickTermsConditionsCheckBox = By.id("com.lifehope:id/checkBoxCondition");
    By ClickBookingDeatails_BookNow = By.id("com.lifehope:id/button_book_now");
    By ReadOrderSummary_TestDetails = By.id("com.lifehope:id/textview_test_heading");
    By ReadOrderSummary_TestDesc = By.id("com.lifehope:id/textview_test_description");
    By ReadOrderSummary_TestType = By.id("com.lifehope:id/textview_testType");
    By ReadOrderSummary_Contact_UserName = By.id("com.lifehope:id/textview_user_name");
    By ReadOrderSummary_Contact_UserNumber = By.id("com.lifehope:id/textview_user_mobile");
    By ReadOrderSummary_Contact_UserAddress = By.id("com.lifehope:id/textview_user_address");
    By ClickEditContactDetails = By.id("com.lifehope:id/imageview_editProfile");
    //By ReadBookingDetailsPageHeader = By.id("com.lifehope:id/textview_profileSetting");
    //By ReadOrderSummaty_PaymentDetails = By.id("com.lifehope:id/textview_payment_details_label");
    By ReadOrderSummary_PaymentDetails_TestName = By.id("com.lifehope:id/textview_test_name");
    By ReadOrderSummary_PaymentDetails_TestFee = By.id("com.lifehope:id/textview_test_amount");
    By ReadOrderSummary_PaymentDetails_ShippingName = By.id("com.lifehope:id/textview_shipping_charge_label");
    By ReadOrderSummary_PaymentDetails_ShippingFee = By.id("com.lifehope:id/textview_shipping_charge");
    //By ReadOrderSummary_PaymentDetails_TaxName = By.id("com.lifehope:id/textview_tax_label");
    By ReadOrderSummary_PaymentDetails_TaxFee = By.id("com.lifehope:id/textview_tax_charge");
    //By ReadOrderSummary_PaymentDetails_Total = By.id("com.lifehope:id/textview_total_label");
    //By ReadOrderSummary_PaymentDetails_TotalFee = By.id("com.lifehope:id/textview_total_charge");
    By ClickOrderSummary_Proceed = By.id("com.lifehope:id/button_book_now");
    By ReadPaymentDetails_Name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.GridView/android.view.View[1]/android.view.View[2]");
    By ReadPaymentDetails_Amount = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.GridView/android.view.View[2]/android.view.View[2]");
    By ReadPaymentDetails_Address = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.GridView/android.view.View[3]/android.view.View[2]");
    By ClickPaymentDetails_Proceed = By.id("checkout-button");
    By ClickAddonMember = By.id("com.lifehope:id/imageview_add_member");
    By SetAddonMemberName = By.id("com.lifehope:id/edittext_name");
    By SetAddonMemberAge = By.id("com.lifehope:id/edittext_age");
    By SelectAddonMemberGender = By.id("android:id/text1");
    By SetAddonMemberGender = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
    By ClickAddonMember_Add = By.id("com.lifehope:id/button_proceed");
    By ClickAddonMember_Cancel = By.id("com.lifehope:id/button_cancel");
    By ReadAddonMember_Name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
    By ReadAddonMember_Age = By.id("com.lifehope:id/textview_user_age");
    By ReadAddonMember_Gender = By.id("com.lifehope:id/textview_user_gender");
    By EditAddonMember = By.id("com.lifehope:id/imageview_edit");
    By ClickAddonMemberUpdate = By.id("com.lifehope:id/button_proceed");
    By ReadAddonMember2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]");
    By ReadAddonMember3 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]");
    By ReadAddonMember4 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView[1]");
    By ClickAddonMemberRemove = By.id("com.lifehope:id/imageview_remove");
    //By ClickAddonMemberCancel = By.id("com.lifehope:id/button_cancel");
    By ReadPaymentGateway_Email = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.widget.ListView/android.view.View[2]/android.view.View");
    By ReadPaymentGateway_TestName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView");
    By ReadPaymentGateway_TotalCharge = By.id("ProductSummary-totalAmount");
    By SetPaymentGateway_CardInfo = By.id("cardNumber");
    By SetPaymentGateway_CardExpiry = By.id("cardExpiry");
    By SetPaymentGateway_CardCVC = By.id("cardCvc");
    By SetPaymentGateway_CardName = By.id("billingName");
    By ClickPaymentGateway_BillingCountry = By.id("billingCountry");
    By SelectPaymentGateway_BillingCountry = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
    By ClickPaymentGateway_Pay = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.widget.Button");
    By ReadPaymentAlert = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View");
    By ReadTestOrderStatus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView");
    By ClickBackfromPayment = By.xpath("//android.view.View[@content-desc=\"Previous page\"]/android.view.View/android.widget.Image[1]");
    By ClickLeaveThisPage = By.id("android:id/button1");
    //By ReadPaymentAlert1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View");

    public BookATestPageObjects(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    //Clicking Book A Test
    public void ClickBookATest() throws IOException {
        test13.log(LogStatus.INFO, "Ready to Click Book a Test");
        try {
            WebElement element = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(ClickBookATest));
            element.click();
            test13.log(LogStatus.PASS, "Book a Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Book a Test Module not present");
            getScreenshot("Home Page-Book a Test");
        }
    }

    //Reading Test Info
    public void ReadTest_Info() throws IOException {
        test13.log(LogStatus.INFO, "Reading Test Info");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookTest_Info));
            String SelfTest_Info = element.getText();
            test13.log(LogStatus.PASS, SelfTest_Info);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Self Test Info is not Shown as per the Requirement");
            getScreenshot("SelfTest-Info");
        }
    }

    //Reading COVID PCR Test_Name
    public void ReadCovid19PCRTestName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Covid-19 PCR Test Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookTest_Covid19PCRTest));
            String SelfTest_Covid19PCRTestName = element.getText();
            test13.log(LogStatus.PASS, SelfTest_Covid19PCRTestName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Self Test-Covid 19 PCR Test Name is not Shown as per the Requirement");
            getScreenshot("SelfTest_Covid19PCR-TestName");
        }
    }

    //Reading COVID PCR Test Description
    public void ReadCovid19PCRTestDesc() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Covid-19 PCR Test Description");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookTest_Covid19PCRTest_Desc));
            String SelfTest_Covid19PCRTest_Desc = element.getText();
            test13.log(LogStatus.PASS, SelfTest_Covid19PCRTest_Desc);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Self Test-Covid 19 PCR Test Desc is not Shown as per the Requirement");
            getScreenshot("SelfTest_Covid19PCR-Desc");
        }
    }

    //Reading COVID PCR Test Charge
//    public void ReadCovid19PCRTestCharge() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(2000);
//            String SelfTest_Covid19PCRTest_Charge = driver.findElement(ReadBookTest_Covid19PCRTest_Charge).getText();
//            test13.log(LogStatus.PASS, SelfTest_Covid19PCRTest_Charge);
//        } catch (NoSuchElementException e) {
//            test13.log(LogStatus.FAIL, "Self Test-Covid 19 PCR Test Desc is not Shown as per the Requirement");
//            getScreenshot("SelfTest_Covid19PCR-Charge");
//        }
//    }

    //Clicking  COVID PCR Test-Book Now
    public void ClickCovid19PCRTest() throws IOException {
        test13.log(LogStatus.INFO, "Success-Displayed Covid-19 PCR Test description");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickCovid19PCRTest));
            element.click();
            test13.log(LogStatus.PASS, "Book a Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Book a Test is not Clicked");
            getScreenshot("Covid19 PCR Test-Book Now");
        }
    }

    //Clicking Back From Booking Details
//    public void ClickBackFromBookingDetails() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(5000);
//            driver.findElement(ClickBackfromBookingDetails).click();
//            test13.log(LogStatus.PASS, "Back From Boking details is clicked");
//        } catch (NoSuchElementException e) {
//            test13.log(LogStatus.FAIL, "Back From Boking details is not clicked");
//            getScreenshot("Covid19 PCR Test-Click Back");
//        }
//    }

    //Reading COVID Antibody TestName
    public void ReadCovid19AntibodyTestName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Covid-19 Antibody Test Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookTest_Covid19AntibodyTest));
            String SelfTest_Covid19AntibodyTestName = element.getText();
            test13.log(LogStatus.PASS, SelfTest_Covid19AntibodyTestName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Self Test-Covid19 Antibody Test Name is not Shown as per the Requirement");
            getScreenshot("SelfTest_Covid19Antibody TestName");
        }
    }

    //Reading COVID Antibody Test Description
    public void ReadCovid19AntibodyTestDesc() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Covid-19 Antibody Test Description");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookTest_Covid19AntibodyTest_Desc));
            String SelfTest_Covid19AntiTest_Desc = element.getText();
            test13.log(LogStatus.PASS, SelfTest_Covid19AntiTest_Desc);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Self Test-Covid 19 Antibody Test Desc is not Shown as per the Requirement");
            getScreenshot("SelfTest_Covid19Antibody-Desc");
        }
    }

    //Reading COVID PCR Test Charge
//    public void ReadCovid19AntiTestCharge() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(2000);
//            String SelfTest_Covid19AntiTest_Charge = driver.findElement(ReadBookTest_Covid19AntibodyTest_Charge).getText();
//            test13.log(LogStatus.PASS, SelfTest_Covid19AntiTest_Charge);
//        } catch (NoSuchElementException e) {
//            test13.log(LogStatus.FAIL, "Self Test-Covid 19 Antibody Test Charge is not Shown as per the Requirement");
//            getScreenshot("SelfTest_Covid19Antibody-Charge");
//        }
//    }

    //Clicking COVID Antibody Test-Book Now
    public void ClickCovid19AntibodyTest() throws IOException {
        test13.log(LogStatus.INFO, "Success-Displayed Covid-19 Antibody Test description");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickCovid19AntobodyTest));
            element.click();
            test13.log(LogStatus.PASS, "Covid19 Antibody Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Covid19 Antibody Test is not Clicked");
            getScreenshot("Covid19 Antibody Test-Click");
        }
    }

    //Reading RPP TestName
    public void ReadRPPTestName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying RPP Test Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookTest_RPPTest));
            String SelfTest_RPPTestName = element.getText();
            test13.log(LogStatus.PASS, SelfTest_RPPTestName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Self Test-RPP Test Name is not Shown as per the Requirement");
            getScreenshot("SelfTest_RPP TestName");
        }
    }

    //Reading RPP Test Description
    public void ReadRPPTestDesc() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Covid-19 PCR Test Description");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookTest_RPPTest_Desc));
            String SelfTest_RPPTest_Desc = element.getText();
            test13.log(LogStatus.PASS, SelfTest_RPPTest_Desc);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Self Test-RPP Test Desc is not Shown as per the Requirement");
            getScreenshot("SelfTest_RPP-Desc");
        }
    }

    //Reading COVID PCR Test Charge
//    public void ReadRPPTestCharge() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(2000);
//            String SelfTest_RPPTest_Charge = driver.findElement(ReadBookTest_RPPTest_Charge).getText();
//            test13.log(LogStatus.PASS, SelfTest_RPPTest_Charge);
//        } catch (NoSuchElementException e) {
//            test13.log(LogStatus.FAIL, "Self Test-RPP Test Charge is not Shown as per the Requirement");
//            getScreenshot("SelfTest_RPP-Charge");
//        }
//    }

    //Clicking RPP Test-Book Now
    public void ClickRPPTest() throws IOException {
        test13.log(LogStatus.INFO, "Success-Displayed Covid-19 PCR Test description");
        try {
            Dimension dimension = driver.manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.5);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickRPPTest));
            element.click();
            test13.log(LogStatus.PASS, "RPP Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "RPP Test is not Clicked");
            getScreenshot("RPP Test-Click");
        }
    }

    //Reading Microbiome TestName
    public void ReadMicrobiomeTestName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Microbiome Test Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookTest_MicrobiomeTest));
            String SelfTest_MicrobiomeTestName = element.getText();
            test13.log(LogStatus.PASS, SelfTest_MicrobiomeTestName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Self Test-Microbiome Test Name is not Shown as per the Requirement");
            getScreenshot("SelfTest_Microbiome TestName");
        }
    }

    //Reading Microbiome Test Description
    public void ReadMicrobiomeTestDesc() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Covid-19 PCR Test Description");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookTest_MicrobiomeTest_Desc));
            String SelfTest_MicrobiomeTest_Desc = element.getText();
            test13.log(LogStatus.PASS, SelfTest_MicrobiomeTest_Desc);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Self Test-Microbiome Test Desc is not Shown as per the Requirement");
            getScreenshot("SelfTest_Microbiome-Desc");
        }
    }

    //Reading Microbiome Test Charge
//    public void ReadMicrobiomeTestCharge() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(2000);
//            String SelfTest_MicrobiomeTest_Charge = driver.findElement(ReadBookTest_Covid19AntibodyTest_Charge).getText();
//            test13.log(LogStatus.PASS, SelfTest_MicrobiomeTest_Charge);
//        } catch (NoSuchElementException e) {
//            test13.log(LogStatus.FAIL, "Self Test-Microbiome Test Charge is not Shown as per the Requirement");
//            getScreenshot("SelfTest_RPP-Charge");
//        }
//    }

    //clicking MicorBiome Test-Book Now
    public void ClickMicrobiomeTest() throws IOException {
        test13.log(LogStatus.INFO, "Success-Displayed Covid-19 PCR Test description");
        try {
            Dimension dimension = driver.manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.5);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickMicrobiomeTest));
            element.click();
            test13.log(LogStatus.PASS, "Microbiome Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Microbiome Test is not Clicked");
            getScreenshot("Microbiome Test-Click");
        }
    }

    //Reading Booking Details_FirstName
    public void ReadBookingDetailsFirstName() throws IOException {
        test13.log(LogStatus.INFO, "Reading Booking Details Info");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookingDetails_FirstName));
            String FirstName = element.getText();
            test13.log(LogStatus.PASS, FirstName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "First Name is not Displayed");
            getScreenshot("Booking Details-First Name");
        }
    }

    //Reading Booking Details_LastName
    public void ReadBookingDetailslastName() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookingDetails_LastName));
            String LastName = element.getText();
            test13.log(LogStatus.PASS, LastName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Last Name is not Displayed");
            getScreenshot("Booking Details-Last Name");
        }
    }

    //Reading Booking Details_Gender
    public void ReadBookingDetailsGender() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookingDetails_Gender));
            String Gender = element.getText();
            test13.log(LogStatus.PASS, Gender);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Gender is not Displayed");
            getScreenshot("Booking Details-Gender");
        }
    }

    //Reading Booking Details_DOB
    public void ReadBookingDetailsDOB() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookingDetails_DOB));
            String DOB = element.getText();
            test13.log(LogStatus.PASS, DOB);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "DOB is not Displayed");
            getScreenshot("Booking Details-DOB");
        }
    }

    //Reading Booking Details_MobileNumber
    public void ReadBookingDetailsMobile() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookingDetails_MobileNumber));
            String MobileNumber = element.getText();
            test13.log(LogStatus.PASS, MobileNumber);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Mobile Number is not Displayed");
            getScreenshot("Booking Details-Mobile Number");
        }
    }

    //Reading Booking Details_Address
    public void ReadBookingDetailsAddress() throws InterruptedException, IOException {
        try {
            Thread.sleep(3000);
            Dimension dimension = driver.manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.5);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookingDetails_Address));
            String Address = element.getText();
            test13.log(LogStatus.PASS, Address);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Address is not Displayed");
            getScreenshot("Booking Details-Address");
        }
    }

    //Reading Booking Details_Test Info
    public void ReadBookingDetailsTestInfo() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadBookingDetails_Info));
            String info = element.getText();
            test13.log(LogStatus.PASS, "Test Info: " + info);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Test Info is not Displayed");
            getScreenshot("Booking Details-Test Info");
        }
    }

    //Clicking Terms and Conditions
    public void ClickTermsConditions() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickTermsConditions));
            element.click();
            test13.log(LogStatus.PASS, "Terms and Conditions Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Terms and Conditions not Clicked");
            getScreenshot("Booking Details-Terms and Conditions-Click");
        }
    }

    //Reading Terms And Conditions
    public void ReadTermsConditions() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadTermsConditions));
            String SelfTest_Terms = element.getText();
            test13.log(LogStatus.PASS, SelfTest_Terms);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Terms and Conditions not Displayed");
            getScreenshot("Booking Details-Read Terms and Conditions");
        }
    }

    //Reading Terms And Conditions
    public void ClickTermsConditionsOK() throws IOException {
        test13.log(LogStatus.INFO, "Reading Terms and Conditions");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickTermsConditionsOk));
            element.click();
            test13.log(LogStatus.PASS, "Clicked Ok in Terms and Conditions");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Terms and Conditions- OK is not clicked");
            getScreenshot("Booking Details-Ok in Terms and Conditions");
        }
    }

    //Clicking Terms and Conditions
    public void ClickTermsConditionsCheckBox() throws IOException {
        test13.log(LogStatus.INFO, "Accepting Terms and Conditions");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickTermsConditionsCheckBox));
            element.click();
            test13.log(LogStatus.PASS, "Accepted Terms and Conditions");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Terms and Conditions are not Accepted");
            getScreenshot("Booking Details-Accept Terms and Conditions");
        }
    }

    //Clicking Booking Details-Book Now
    public void ClickBookingDetails_BookNow() throws IOException {
        test13.log(LogStatus.INFO, "Clicking Book Now");
        try {
            WebElement loginButton = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(ClickBookingDeatails_BookNow));
            loginButton.click();
            //driver.findElement(ClickBookingDeatails_BookNow).click();
            //String Addresss = driver.findElement(ReadBookingDetails_Address).getText();
            test13.log(LogStatus.PASS, "Clicked Book Now button");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.PASS, "Terms and Conditions are Accepted");
            getScreenshot("Booking Details-Book Now");
        }
    }

    //Clicking Add on Member
    public void ClickAddonMember() throws IOException {
        test13.log(LogStatus.INFO, "Clicking Add on Members");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickAddonMember));
            element.click();
            test13.log(LogStatus.PASS, "Add on Member Icon is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member Icon is not Clicked");
            getScreenshot("Add on Member");
        }
    }

    //Passing input to Add on Member
    public void SetAddonMember_Name(String Name) {
        test13.log(LogStatus.INFO, "Entering Add on Member Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            element.sendKeys(Name);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member2
    public void SetAddonMember2_Name(String Name2) {
        test13.log(LogStatus.INFO, " Entering Add on Member2 Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            element.sendKeys(Name2);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member3
    public void SetAddonMember3_Name(String Name3) {
        test13.log(LogStatus.INFO, " Entering Add on Member3 Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            element.sendKeys(Name3);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member4
    public void SetAddonMember4_Name(String Name4) {
        test13.log(LogStatus.INFO, " Entering Add on Member4 Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            element.sendKeys(Name4);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member5
    public void SetAddonMember5_Name(String Name5) {
        test13.log(LogStatus.INFO, " Entering Add on Member5 Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            element.sendKeys(Name5);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member-Age
    public void SetAddonMember_Age(String Age) {
        test13.log(LogStatus.INFO, "Entering Add on Member Age");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(SetAddonMemberAge));
            element.sendKeys(Age);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member-Gender
    public void SetAddonMember_Gender() {
        test13.log(LogStatus.INFO, "Selecting Add on Member Gender");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(SelectAddonMemberGender));
            element.click();
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(SetAddonMemberGender));
            element1.click();
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Clicking Add on Member-Add
    public void ClickAddonMember_Add() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickAddonMember_Add));
            element.click();
            test13.log(LogStatus.PASS, "Add on Member Added");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member is not Added");
            getScreenshot("Add on Member-Add");
        }
    }

    //Clicking Delete Add on Member
    public void ClickAddonMember_Remove() throws IOException {
        test13.log(LogStatus.INFO, " Deleting Add on Member");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickAddonMemberRemove));
            element.click();
            test13.log(LogStatus.PASS, "Add on Member Removed");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member is not Removed");
            getScreenshot("Add on Member-Delete");
        }
    }

    //Clicking Edit Add on Member
    public void ClickAddonMember_Edit() throws IOException {
        test13.log(LogStatus.INFO, "Editing Add on Member");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(EditAddonMember));
            element.click();
            test13.log(LogStatus.PASS, "Clicked Edit in Add on Member");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Edit is not Clicked in Add on Member");
            getScreenshot("Add on Member-Edit");
        }
    }

    //Clicking Update Add on Member
    public void ClickAddonMember_Update() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickAddonMemberUpdate));
            element.click();
            test13.log(LogStatus.PASS, "Add on Member is Updated");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member is not Updated");
            getScreenshot("Add on Member-Update");
        }
    }

    //Checking Add on Member Limit
    public void AddonMemberLimit() throws IOException {
        test13.log(LogStatus.INFO, "Checking Add on Member Limit");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(SetAddonMemberAge));
            element.clear();
            test13.log(LogStatus.PASS, "Add on Member Limit is Reached");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member Limit is not Set");
            getScreenshot("Add on Member-Limit");
        }
    }

    //Cancel Add on Member
    public void AddonMembercancel() {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickAddonMember_Cancel));
            element.click();
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Reading Add on Members Name
    public void ReadAddonMembers1Name() throws InterruptedException, IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Add on Member1 Name");
        try {
            Thread.sleep(3000);
            Dimension dimension = driver.manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.5);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadAddonMember_Name));
            String AddonMember_Name = element.getText();
            test13.log(LogStatus.PASS, AddonMember_Name);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member Name is not Dispalyed");
            getScreenshot("Add on Member1-Name");
        }
    }

    //Reading Add on Members Name
    public void ReadAddonMembers1Age() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Add on Member1 Age");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadAddonMember_Age));
            String AddonMember_Age = element.getText();
            test13.log(LogStatus.PASS, AddonMember_Age);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member Age is not Dispalyed");
            getScreenshot("Add on Member1-Age");
        }
    }

    //Reading Add on Members Gender
    public void ReadAddonMembers1Gender() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Add on Member1 Gender");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadAddonMember_Gender));
            String AddonMember_Gender = element.getText();
            test13.log(LogStatus.PASS, AddonMember_Gender);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member Gender is not Dispalyed");
            getScreenshot("Add on Member1-Gender");
        }
    }

    //Reading Add on Member2 Name
    public void ReadAddonMembers2Name() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Add on Member2 Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadAddonMember2));
            String AddonMember_Name2 = element.getText();
            test13.log(LogStatus.PASS, AddonMember_Name2);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member Name is not Dispalyed");
            getScreenshot("Add on Member2-Name");
        }
    }

    //Reading Add on Member3 Name
    public void ReadAddonMembers3Name() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Add on Member3 Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadAddonMember3));
            String AddonMember_Name3 = element.getText();
            test13.log(LogStatus.PASS, AddonMember_Name3);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member Name is not Dispalyed");
            getScreenshot("Add on Member3-Name");
        }
    }

    //Reading Add on Member4 Name
    public void ReadAddonMembers4Name() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Add on Member4 Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadAddonMember4));
            String AddonMember_Name4 = element.getText();
            test13.log(LogStatus.PASS, AddonMember_Name4);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member Name is not Dispalyed");
            getScreenshot("Add on Member4-Name");
        }
    }

    //Reading Order Summary-Test Details
    public void ReadOrderSummary_TestDetailsName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Test Details Test Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_TestDetails));
            String OrderSummary_TestDetails = element.getText();
            test13.log(LogStatus.PASS, OrderSummary_TestDetails);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Test Details Name is not Dispalyed");
            getScreenshot("Order Summary-Test Details Name");
        }
    }

    //Reading Order Summary-Test Description
    public void ReadOrderSummary_TestDesc() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Test Details Test Desc");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_TestDesc));
            String OrderSummary_TestDesc = element.getText();
            test13.log(LogStatus.PASS, OrderSummary_TestDesc);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Test Desc is not Dispalyed");
            getScreenshot("Order Summary-Test Details Desc");
        }
    }

    //Reading Order Summary-Test Type
    public void ReadOrderSummary_TestType() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Test Details Test Type");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_TestType));
            String OrderSummary_TestType = element.getText();
            test13.log(LogStatus.PASS, OrderSummary_TestType);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Test Type is not Dispalyed");
            getScreenshot("Order Summary-Test Details Type");
        }
    }


    //Reading Order Summary-Contact Details Name
    public void ReadOrderSummary_ContactDetailsName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Contact Details Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_Contact_UserName));
            String SelfTest_OrderSummary_ContactUserName = element.getText();
            test13.log(LogStatus.PASS, SelfTest_OrderSummary_ContactUserName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Contact Details Name is not Dispalyed");
            getScreenshot("Order Summary-Contact Details Name");
        }
    }

    //Reading Order Summary-Contact Details Number
    public void ReadOrderSummary_ContactDetailsNumber() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Contact Details Number");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_Contact_UserNumber));
            String SelfTest_OrderSummary_ContactUserNumber = element.getText();
            test13.log(LogStatus.PASS, SelfTest_OrderSummary_ContactUserNumber);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Contact Details Number is not Dispalyed");
            getScreenshot("Order Summary-Contact Details Number");
        }
    }

    //Reading Order Summary-Contact Details Address
    public void ReadOrderSummary_ContactDetailsAddress() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Contact Details Address");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_Contact_UserAddress));
            String SelfTest_OrderSummary_ContactUserAddress = element.getText();
            test13.log(LogStatus.PASS, SelfTest_OrderSummary_ContactUserAddress);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Contact Details Address is not Dispalyed");
            getScreenshot("Order Summary-Contact Details Address");
        }
    }

    //Editing Contact Details
    public void ClickEditOrderSummary_ContactDetails() throws IOException {
        test13.log(LogStatus.INFO, "Clicking Edit Contact Details");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickEditContactDetails));
            element.click();
            //String BookingDetails = driver.findElement(ReadBookingDetailsPageHeader).getText();
            test13.log(LogStatus.PASS, "Edit Profile is Opened");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Edit Profile is not Opened");
            getScreenshot("Contact Details-Edit");
        }
    }

    //Reading Order Summary-Payment Details Test Name
    public void ReadOrderSummary_PaymentDetailsTestName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Payment Details Test Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_PaymentDetails_TestName));
            String OrderSummary_PaymentDetails_TestName = element.getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_TestName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Test Name is not Displayed");
            getScreenshot("Order Summary-Payment Details-Test Name");
        }
    }

    //Reading Order Summary-Payment Details Test Charge
    public void ReadOrderSummary_PaymentDetailsTestCharge() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Payment Details Test Charge");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_PaymentDetails_TestFee));
            String OrderSummary_PaymentDetails_TestCharge = element.getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_TestCharge);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Test Charge is not Displayed");
            getScreenshot("Order Summary-Payment Details-Test Charge");
        }
    }

    //Reading Order Summary-Payment Details Shipping Name
    public void ReadOrderSummary_PaymentDetailsShippingName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Payment Details Shipping Name");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_PaymentDetails_ShippingName));
            String OrderSummary_PaymentDetails_ShippingName = element.getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_ShippingName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Shipping Name is not Displayed");
            getScreenshot("Order Summary-Payment Details-Shipping Name");
        }
    }

    //Reading Order Summary-Payment Details Shipping Charge
    public void ReadOrderSummary_PaymentDetailsShippingCharge() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Payment Details Shipping Charge");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_PaymentDetails_ShippingFee));
            String OrderSummary_PaymentDetails_ShippingCharge = element.getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_ShippingCharge);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Shipping Charge is not Displayed");
            getScreenshot("Order Summary-Payment Details-Shipping Charge");
        }
    }
    //String SelfTest_OrderSummary_PaymentDetails_TaxName = driver.findElement(ReadOrderSummary_PaymentDetails_TaxName).getText();
    //System.out.println("Tax Name: " +SelfTest_OrderSummary_PaymentDetails_TaxName);
    //Thread.sleep(1000);

    //Reading Order Summary-Payment Details Tax Charge
    public void ReadOrderSummary_PaymentDetailsTaxCharge() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Summary-Payment Details Tax Charge");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadOrderSummary_PaymentDetails_TaxFee));
            String OrderSummary_PaymentDetails_TaxCharge = element.getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_TaxCharge);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Tax Charge is not Displayed");
            getScreenshot("Order Summary-Payment Details-Tax Charge");
        }
    }

    //Reading Order Summary-Payment Details Tax Charge
//    public void ReadOrderSummary_PaymentDetailsTotalCharge() throws InterruptedException, IOException {
//        try {
//            Thread.sleep(1000);
//            String OrderSummary_PaymentDetails_TotalCharge = driver.findElement(ReadOrderSummary_PaymentDetails_TotalFee).getText();
//            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_TotalCharge);
//        } catch (NoSuchElementException e) {
//            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Tax Charge is not Displayed");
//            getScreenshot("Order Summary-Payment Details-Tax Charge");
//        }
//    }

    //clicking Order Summary-Proceed
    public void ClickOrderSummary_Proceed() throws IOException {
        test13.log(LogStatus.INFO, "Clicking Order Summary-Proceed");
        try {
            WebElement tcBox = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(ClickOrderSummary_Proceed));
            tcBox.click();
            test13.log(LogStatus.PASS, "Clicked Procced from Order Summary");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Proceed is not Clicking in Order Summary");
            getScreenshot("Order Summary-Proceed");
        }
    }

    //Reading Payment Details Name
    public void ReadPaymentDetailsName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Payment Details Test Name");
        try {
            WebElement element = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(ReadPaymentDetails_Name));
            String PaymentDetails_Name = element.getText();
            test13.log(LogStatus.PASS, PaymentDetails_Name);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Name is not Displayed in Payment Details");
            getScreenshot("Payment Details-Name");
        }
    }

    //Reading Payment Details Amount
    public void ReadPaymentDetailsAmount() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Payment Details Test Amount");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadPaymentDetails_Amount));
            String PaymentDetails_Amount = element.getText();
            test13.log(LogStatus.PASS, PaymentDetails_Amount);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Amount is not Displayed in Payment Details");
            getScreenshot("Payment Details-Amount");
        }
    }

    //Reading Payment Details Address
    public void ReadPaymentDetailsAddress() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Payment Details Address");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadPaymentDetails_Address));
            String PaymentDetails_Address = element.getText();
            test13.log(LogStatus.PASS, PaymentDetails_Address);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Address is not Displayed in Payment Details");
            getScreenshot("Payment Details-Address");
        }
    }

    //Clicking Payment Details-Proceed
    public void ClickPaymentDetails_Proceed() throws IOException {
        test13.log(LogStatus.INFO, "Clicking Payment Details-Proceed");
        try {
            WebElement tcBox = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(ClickPaymentDetails_Proceed));
            tcBox.click();
            test13.log(LogStatus.PASS, "Clicked Proceed from Payment Details");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Proceed is not Clicked in Payment Details");
            getScreenshot("Payment Details-Proceed");
        }
    }

    //Reading Payment Gateway TestName
    public void ReadPaymentGatewayTestName() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Payment Gateway Test Name");
        try {
            WebElement name = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(ReadPaymentGateway_TestName));
            String PaymentGateway_TestName = name.getText();
            test13.log(LogStatus.PASS, PaymentGateway_TestName);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Payment Gateway Test Name is not Displayed");
            getScreenshot("Payment Gateway-Test Name");
        }
    }

    //Reading Payment Gateway TestCarge
    public void ReadPaymentGatewayTestCharge() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Payment Gateway Test Charge");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadPaymentGateway_TotalCharge));
            String PaymentGateway_Charge = element.getText();
            test13.log(LogStatus.PASS, PaymentGateway_Charge);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Payment Gateway Test Charge is not Displayed");
            getScreenshot("Payment Gateway-Test Charge");
        }
    }

    //Reading Payment Gateway-Email
    public void ReadPaymentGateway_Email(String Email) {
        test13.log(LogStatus.INFO, "Displaying Payment Gateway Email");
        try {
            WebElement tcBox = new WebDriverWait(driver, 60)
                    .until(driver -> driver.findElement(ReadPaymentGateway_Email));
            String PaymentEmail = tcBox.getText();
            test13.log(LogStatus.PASS, PaymentEmail);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.INFO, "Entering Email");
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadPaymentGateway_Email));
            element.sendKeys(Email);
        }
    }

    //Passing card Details to Payment Gateway
    public void SetPaymentGateway_CardNumber(String Number) {
        test13.log(LogStatus.INFO, "Validating Invalid Card Details");
        WebElement tcBox = new WebDriverWait(driver, 30)
                .until(driver -> driver.findElement(SetPaymentGateway_CardInfo));
        tcBox.sendKeys(Number);
    }

    //Clear Card Details in Payment Gateway
    public void ClearPaymentGateway_CardDetails() {
        test13.log(LogStatus.INFO, "Validating Invalid Exp Details");
        WebElement element = new WebDriverWait(driver, 2)
                .until(driver -> driver.findElement(SetPaymentGateway_CardInfo));
        element.clear();
    }

    //Reading Payment Alert
    public void ReadPaymentGateway_Alert() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadPaymentAlert));
            String Alert = element.getText();
            test13.log(LogStatus.PASS, Alert);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "Alert is not Displayed");
            getScreenshot("Payment Gateway-Alert");
        }
    }

    public void ClickPaymentGateway_CardEXP() {
        WebElement element = new WebDriverWait(driver, 2)
                .until(driver -> driver.findElement(SetPaymentGateway_CardExpiry));
        element.click();
    }

    //Passing Exp Date to Payment Gateway
    public void SetPaymentGateway_CardEXP(String EXP) {
        test13.log(LogStatus.INFO, "Validating Invalid CVC Details");
        WebElement element = new WebDriverWait(driver, 2)
                .until(driver -> driver.findElement(SetPaymentGateway_CardExpiry));
        element.sendKeys(EXP);
    }

    //Clearing Card Exp
    public void ClearPaymentGateway_CardEXP() {
        WebElement element = new WebDriverWait(driver, 2)
                .until(driver -> driver.findElement(SetPaymentGateway_CardExpiry));
        element.clear();
    }

    //Passing Card CVC to Payment Gateway
    public void SetPaymentGateway_CVC(String CVC) {
        test13.log(LogStatus.INFO, "Validating Valid Payment Details");
        WebElement element = new WebDriverWait(driver, 2)
                .until(driver -> driver.findElement(SetPaymentGateway_CardCVC));
        element.sendKeys(CVC);
    }

    //Clearing CVC in Payment Gateway
    public void ClearPaymentGateway_CVC() {
        WebElement element = new WebDriverWait(driver, 2)
                .until(driver -> driver.findElement(SetPaymentGateway_CardCVC));
        element.clear();
    }

    public void ClickPaymentGateway_Name() {
        WebElement element = new WebDriverWait(driver, 2)
                .until(driver -> driver.findElement(SetPaymentGateway_CardName));
        element.click();
        //Thread.sleep(1000);
        driver.navigate().back();
    }

    //Passing Name to Payment Gateway
    public void SetPaymentGateway_Name(String Name) {
        WebElement element = new WebDriverWait(driver, 2)
                .until(driver -> driver.findElement(SetPaymentGateway_CardName));
        element.click();
        //Thread.sleep(1000);
        driver.navigate().back();
        WebElement element1 = new WebDriverWait(driver, 2)
                .until(driver -> driver.findElement(SetPaymentGateway_CardName));
        element1.sendKeys(Name);
    }

    //Passing Country to Payment Gateway
    public void SetPaymentGateway_BillCountry() throws InterruptedException {
        Thread.sleep(2000);
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.5);
        int scrollEnd = (int) (dimension.getHeight() * 0.2);
        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
        driver.findElement(ClickPaymentGateway_BillingCountry).click();
        Thread.sleep(3000);
        Dimension dimension1 = driver.manage().window().getSize();
        int scrollStart1 = (int) (dimension1.getHeight() * 0.8);
        int scrollEnd1 = (int) (dimension1.getHeight() * 0.5);
        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart1))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd1))
                .release().perform();
        driver.findElement(SelectPaymentGateway_BillingCountry).click();
    }

    //Clicking Payment Gateway-Pay
    public void ClickPaymentGateway_Pay() throws IOException {
        try {
            WebElement tcBox = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(ClickPaymentGateway_Pay));
            tcBox.click();
            test13.log(LogStatus.PASS, "Clicked Pay in Payment Gateway");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Pay is not Clicked in Payment Gateway");
            getScreenshot("Payment Gateway-Pay");
        }
    }

    //Reading the Test Order Status
    public void ReadTestOrderStatus() throws IOException {
        test13.log(LogStatus.INFO, "Displaying Order Status Details");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.visibilityOfElementLocated(ReadTestOrderStatus));
            String OrderStatus = driver.findElement(ReadTestOrderStatus).getText();
            test13.log(LogStatus.PASS, OrderStatus);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Test Order is not Placed");
            getScreenshot("Test Order Status");
            driver.findElement(ClickBackfromPayment).click();
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickLeaveThisPage));
            element.click();
        }
    }

    //Clicking Home Test
    public void ClickHomeTest() throws IOException {
        try {
            WebElement home = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(ClickHomeTest));
            home.click();
            //driver.findElement(ClickHomeTest).click();
            test13.log(LogStatus.PASS, "In-Home Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "In-Home Test is not Clicked ");
            getScreenshot("Home Page-Book a Test");
        }
    }

    //Clicking Home Test Schedule
    public void ClickHomeTestSchedule() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickHomeTestSchedule));
            element.click();
            test13.log(LogStatus.PASS, "In-Home Schedule is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "In-Home Schedule is not Clicked ");
            getScreenshot("Home Test-Schedule");
        }
    }

    public void ClickHomeTestScheduleNextDay() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickNextDay));
            element.click();
            test13.log(LogStatus.PASS, "In-Home Schedule-Next Day is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.WARNING, "In-Home Schedule Next Day is not Clicked ");
            getScreenshot("Home Test-Schedule-Day");
        }
    }

    public void ClickHomeTestScheduleNextDayEve() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickEveneingLabel));
            element.click();
            test13.log(LogStatus.PASS, "In-Home Schedule-Next Day Eve is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.WARNING, "In-Home Schedule Next Day Eve is not Clicked ");
            getScreenshot("Home Test-Schedule-Day-Eve");
        }
    }

    public void ClickHomeTestScheduleNextDayEveTime() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickNextSecondTime));
            element.click();
            test13.log(LogStatus.PASS, "In-Home Schedule-Next Day Eve Time is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.WARNING, "In-Home Schedule Next Day Eve Time is not Clicked ");
            getScreenshot("Home Test-Schedule-Day-Eve-Time");
        }
    }

    //Reading Scheduled Date
    public void ReadScheduledDate() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ReadScheduledDate));
            String OrderSummary_ScheduledDate = element.getText();
            test13.log(LogStatus.PASS, "It's a Home Test:  " + OrderSummary_ScheduledDate);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.PASS, "It's a Self Test");
            getScreenshot("Home Test-Schedule");

        }
    }

    public void ClickHomeTestScheduleProceed() throws IOException {
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(ClickProceedtoSchedule));
            element.click();
            test13.log(LogStatus.PASS, "In-Home Schedule-Proceed is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "In-Home Schedule Proceed is not Clicked ");
            getScreenshot("Home Test-Schedule-Day-Eve-Time");
        }
    }

}

	

