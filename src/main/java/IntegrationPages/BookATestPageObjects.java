package IntegrationPages;

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

import static IntegrationPages.TestBaseApp.getScreenshot;
import static IntegrationPages.TestBaseApp.test13;

public class BookATestPageObjects {

    private final AppiumDriver<MobileElement> driver;

    //SelfTest
    By ClickBookATest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout\n");
    //By ClickSelfTest = By.id("com.lifehope:id/textViewSelfTest");
    By ClickBookTest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@text=\"Book a Test\"]");
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
    By name_suggestion = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout/android.widget.TextView\n");

    public BookATestPageObjects(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    //Clicking Book A Test
    public void ClickBookATest() throws IOException, InterruptedException {
        test13.log(LogStatus.INFO, "Ready to Click Book a Test");
        Thread.sleep(2000);
        try {
            WebElement bookTest = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(ClickBookTest));
            bookTest.click();
            test13.log(LogStatus.PASS, "Book a Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Book a Test Module not present");
            getScreenshot("Home Page-Book a Test");
        }
    }

    //Reading Test Info
    public void ReadTest_Info() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_Info = driver.findElement(ReadBookTest_Info).getText();
            test13.log(LogStatus.PASS, SelfTest_Info);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Self Test Info is not Shown as per the Requirement");
            getScreenshot("SelfTest-Info");
        }
    }

    //Reading COVID PCR Test_Name
    public void ReadCovid19PCRTestName() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_Covid19PCRTestName = driver.findElement(ReadBookTest_Covid19PCRTest).getText();
            test13.log(LogStatus.PASS, SelfTest_Covid19PCRTestName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Self Test-Covid 19 PCR Test Name is not Shown as per the Requirement");
            getScreenshot("SelfTest_Covid19PCR-TestName");
        }
    }

    //Reading COVID PCR Test Description
    public void ReadCovid19PCRTestDesc() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_Covid19PCRTest_Desc = driver.findElement(ReadBookTest_Covid19PCRTest_Desc).getText();
            test13.log(LogStatus.PASS, SelfTest_Covid19PCRTest_Desc);
        } catch (NoSuchElementException e) {
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
    public void ClickCovid19PCRTest() throws IOException, InterruptedException {
        test13.log(LogStatus.INFO, "Ready to click Covid-19 PCR Test");
        try {
            WebElement pcrTest = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(ClickCovid19PCRTest));
            pcrTest.click();
            test13.log(LogStatus.PASS, "Book a Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Book a Test is not Clicked");
            getScreenshot("Covid19 PCR Test-Book Now");
            driver.navigate().back();
            ClickBookATest();
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
    public void ReadCovid19AntibodyTestName() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_Covid19AntibodyTestName = driver.findElement(ReadBookTest_Covid19AntibodyTest).getText();
            test13.log(LogStatus.PASS, SelfTest_Covid19AntibodyTestName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Self Test-Covid19 Antibody Test Name is not Shown as per the Requirement");
            getScreenshot("SelfTest_Covid19Antibody TestName");
        }
    }

    //Reading COVID Antibody Test Description
    public void ReadCovid19AntibodyTestDesc() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_Covid19AntiTest_Desc = driver.findElement(ReadBookTest_Covid19AntibodyTest_Desc).getText();
            test13.log(LogStatus.PASS, SelfTest_Covid19AntiTest_Desc);
        } catch (NoSuchElementException e) {
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
    public void ClickCovid19AntibodyTest() throws IOException, InterruptedException {
        test13.log(LogStatus.INFO, "Ready to Click Covid-19 Antibody Test");
        try {
            WebElement antibodyTest = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(ClickCovid19AntobodyTest));
            antibodyTest.click();
            test13.log(LogStatus.PASS, "Covid19 Antibody Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Covid19 Antibody Test is not Clicked");
            getScreenshot("Covid19 Antibody Test-Click");
            driver.navigate().back();
            ClickBookATest();
        }
    }

    //Reading RPP TestName
    public void ReadRPPTestName() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_RPPTestName = driver.findElement(ReadBookTest_RPPTest).getText();
            test13.log(LogStatus.PASS, SelfTest_RPPTestName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Self Test-RPP Test Name is not Shown as per the Requirement");
            getScreenshot("SelfTest_RPP TestName");
        }
    }

    //Reading RPP Test Description
    public void ReadRPPTestDesc() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_RPPTest_Desc = driver.findElement(ReadBookTest_RPPTest_Desc).getText();
            test13.log(LogStatus.PASS, SelfTest_RPPTest_Desc);
        } catch (NoSuchElementException e) {
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
    public void ClickRPPTest() throws IOException, InterruptedException {
        test13.log(LogStatus.INFO, "Ready to Click RPP Test");
        try {
            Dimension dimension = driver.manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.5);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            WebElement rppTest = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(ClickRPPTest));
            rppTest.click();
            test13.log(LogStatus.PASS, "RPP Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "RPP Test is not Clicked");
            getScreenshot("RPP Test-Click");
            driver.navigate().back();
            ClickBookATest();
        }
    }

    //Reading Microbiome TestName
    public void ReadMicrobiomeTestName() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_MicrobiomeTestName = driver.findElement(ReadBookTest_MicrobiomeTest).getText();
            test13.log(LogStatus.PASS, SelfTest_MicrobiomeTestName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Self Test-Microbiome Test Name is not Shown as per the Requirement");
            getScreenshot("SelfTest_Microbiome TestName");
        }
    }

    //Reading Microbiome Test Description
    public void ReadMicrobiomeTestDesc() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_MicrobiomeTest_Desc = driver.findElement(ReadBookTest_MicrobiomeTest_Desc).getText();
            test13.log(LogStatus.PASS, SelfTest_MicrobiomeTest_Desc);
        } catch (NoSuchElementException e) {
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
    public void ClickMicrobiomeTest() throws IOException, InterruptedException {
        test13.log(LogStatus.INFO, "Ready to Click Microbiome Test");
        try {
            Dimension dimension = driver.manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.5);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            WebElement micTest = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(ClickMicrobiomeTest));
            micTest.click();
            test13.log(LogStatus.PASS, "Microbiome Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Microbiome Test is not Clicked");
            getScreenshot("Microbiome Test-Click");
            driver.navigate().back();
            ClickBookATest();
        }
    }

    //Reading Booking Details_FirstName
    public void ReadBookingDetailsFirstName() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String FirstName = driver.findElement(ReadBookingDetails_FirstName).getText();
            test13.log(LogStatus.PASS, FirstName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "First Name is not Displayed");
            getScreenshot("Booking Details-First Name");
        }
    }

    //Reading Booking Details_LastName
    public void ReadBookingDetailslastName() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String LastName = driver.findElement(ReadBookingDetails_LastName).getText();
            test13.log(LogStatus.PASS, LastName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Last Name is not Displayed");
            getScreenshot("Booking Details-Last Name");
        }
    }

    //Reading Booking Details_Gender
    public void ReadBookingDetailsGender() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String Gender = driver.findElement(ReadBookingDetails_Gender).getText();
            test13.log(LogStatus.PASS, Gender);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Gender is not Displayed");
            getScreenshot("Booking Details-Gender");
        }
    }

    //Reading Booking Details_DOB
    public void ReadBookingDetailsDOB() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String DOB = driver.findElement(ReadBookingDetails_DOB).getText();
            test13.log(LogStatus.PASS, DOB);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "DOB is not Displayed");
            getScreenshot("Booking Details-DOB");
        }
    }

    //Reading Booking Details_MobileNumber
    public void ReadBookingDetailsMobile() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String MobileNumber = driver.findElement(ReadBookingDetails_MobileNumber).getText();
            test13.log(LogStatus.PASS, MobileNumber);
        } catch (NoSuchElementException e) {
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
            Thread.sleep(2000);
            String Address = driver.findElement(ReadBookingDetails_Address).getText();
            test13.log(LogStatus.PASS, Address);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Address is not Displayed");
            getScreenshot("Booking Details-Address");
        }
    }

    //Reading Booking Details_Test Info
    public void ReadBookingDetailsTestInfo() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String info = driver.findElement(ReadBookingDetails_Info).getText();
            test13.log(LogStatus.PASS, "Test Info: " + info);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Test Info is not Displayed");
            getScreenshot("Booking Details-Test Info");
        }
    }

    //Clicking Terms and Conditions
    public void ClickTermsConditions() throws IOException {
        try {
            driver.findElement(ClickTermsConditions).click();
            test13.log(LogStatus.PASS, "Terms and Conditions Clicked");
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Terms and Conditions not Clicked");
            getScreenshot("Booking Details-Terms and Conditions-Click");
        }
    }

    //Reading Terms And Conditions
    public void ReadTermsConditions() throws InterruptedException, IOException {
        try {
            Thread.sleep(3000);
            String SelfTest_Terms = driver.findElement(ReadTermsConditions).getText();
            test13.log(LogStatus.PASS, SelfTest_Terms);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Terms and Conditions not Displayed");
            getScreenshot("Booking Details-Read Terms and Conditions");
        }
    }

    //Reading Terms And Conditions
    public void ClickTermsConditionsOK() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            driver.findElement(ClickTermsConditionsOk).click();
            test13.log(LogStatus.PASS, "Clicked Ok in Terms and Conditions");
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Terms and Conditions- OK is not clicked");
            getScreenshot("Booking Details-Ok in Terms and Conditions");
        }
    }

    //Clicking Terms and Conditions
    public void ClickTermsConditionsCheckBox() throws IOException {
        test13.log(LogStatus.INFO, "Accepting Terms and Conditions");
        try {
            WebElement tcBox = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(ClickTermsConditionsCheckBox));
            tcBox.click();
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
            WebElement tcBox = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ClickBookingDeatails_BookNow));
            tcBox.click();
            //String Addresss = driver.findElement(ReadBookingDetails_Address).getText();
            test13.log(LogStatus.PASS, "Clicked the Book Now button");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Book Now button is not visible");
            getScreenshot("Booking Details-Book Now");
        }
    }

    //Clicking Add on Member
    public void ClickAddonMember() throws IOException {
        test13.log(LogStatus.INFO, "Ready to click add on member icon");
        try {
            //Thread.sleep(2000);
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ClickAddonMember));
            add.click();
            test13.log(LogStatus.PASS, "Add on Member Icon is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member Icon is not Clicked");
            getScreenshot("Add on Member");
        }
    }

    //Passing input to Add on Member
    public void SetAddonMember_Name(String Name) {
        test13.log(LogStatus.INFO, "Ready to set add on member1");
        try {
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            add.sendKeys(Name);
        } catch (NoSuchElementException | TimeoutException e) {
            //System.out.println("No such Element");
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member2
    public void SetAddonMember2_Name(String Name2) {
        test13.log(LogStatus.INFO, "Ready to set add on member2");
        try {
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            add.sendKeys(Name2);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member3
    public void SetAddonMember3_Name(String Name3) {
        test13.log(LogStatus.INFO, "Ready to set add on member3");
        try {
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            add.sendKeys(Name3);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member4
    public void SetAddonMember4_Name(String Name4) {
        test13.log(LogStatus.INFO, "Ready to set add on member4");
        try {
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            add.sendKeys(Name4);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member5
    public void SetAddonMember5_Name(String Name5) {
        test13.log(LogStatus.INFO, "Ready to set add on member5");
        try {
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetAddonMemberName));
            add.sendKeys(Name5);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member-Age
    public void SetAddonMember_Age(String Age) {
        try {
            //Thread.sleep(2000);
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetAddonMemberAge));
            add.sendKeys(Age);
        } catch (NoSuchElementException | TimeoutException e) {
            //System.out.println("No Such Element");
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Passing input to Add on Member-Gender
    public void SetAddonMember_Gender() {
        try {
            //Thread.sleep(2000);
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SelectAddonMemberGender));
            add.click();
            driver.findElement(SetAddonMemberGender).click();
            //Thread.sleep(2000);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Clicking Add on Member-Add
    public void ClickAddonMember_Add() throws IOException {
        try {
            //Thread.sleep(2000);
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ClickAddonMember_Add));
            add.click();
            test13.log(LogStatus.PASS, "Add on Member Added");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Add on Member is not Added");
            getScreenshot("Add on Member-Add");
        }
    }

    //Clicking Delete Add on Member
    public void ClickAddonMember_Remove() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            driver.findElement(ClickAddonMemberRemove).click();
            test13.log(LogStatus.PASS, "Add on Member Removed");
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Add on Member is not Removed");
            getScreenshot("Add on Member-Delete");
        }
    }

    //Clicking Edit Add on Member
    public void ClickAddonMember_Edit() throws InterruptedException, IOException {
        try {
            Thread.sleep(3000);
            driver.findElement(EditAddonMember).click();
            test13.log(LogStatus.PASS, "Clicked Edit in Add on Member");
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Edit is not Clicked in Add on Member");
            getScreenshot("Add on Member-Edit");
        }
    }

    //Clicking Update Add on Member
    public void ClickAddonMember_Update() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            driver.findElement(ClickAddonMemberUpdate).click();
            test13.log(LogStatus.PASS, "Add on Member is Updated");
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Add on Member is not Updated");
            getScreenshot("Add on Member-Update");
        }
    }

    //Checking Add on Member Limit
    public void AddonMemberLimit() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            driver.findElement(SetAddonMemberAge).clear();
            test13.log(LogStatus.PASS, "Add on Member Limit is Reached");
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Add on Member Limit is not Set");
            getScreenshot("Add on Member-Limit");
        }
    }

    //Cancel Add on Member
    public void AddonMembercancel() throws InterruptedException {
        try {
            Thread.sleep(2000);
            driver.findElement(ClickAddonMember_Cancel).click();
        } catch (NoSuchElementException e) {
            //System.out.println("No Such Element");
            test13.log(LogStatus.SKIP, "No such element");
        }
    }

    //Reading Add on Members Name
    public void ReadAddonMembers1Name() throws InterruptedException, IOException {
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
            Thread.sleep(2000);
            String AddonMember_Name = driver.findElement(ReadAddonMember_Name).getText();
            test13.log(LogStatus.PASS, AddonMember_Name);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Add on Member Name is not Dispalyed");
            getScreenshot("Add on Member1-Name");
        }
    }

    //Reading Add on Members Name
    public void ReadAddonMembers1Age() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String AddonMember_Age = driver.findElement(ReadAddonMember_Age).getText();
            test13.log(LogStatus.PASS, AddonMember_Age);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Add on Member Age is not Dispalyed");
            getScreenshot("Add on Member1-Age");
        }
    }

    //Reading Add on Members Gender
    public void ReadAddonMembers1Gender() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String AddonMember_Gender = driver.findElement(ReadAddonMember_Gender).getText();
            test13.log(LogStatus.PASS, AddonMember_Gender);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Add on Member Gender is not Dispalyed");
            getScreenshot("Add on Member1-Gender");
        }
    }

    //Reading Add on Member2 Name
    public void ReadAddonMembers2Name() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String AddonMember_Name2 = driver.findElement(ReadAddonMember2).getText();
            test13.log(LogStatus.PASS, AddonMember_Name2);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Add on Member Name is not Dispalyed");
            getScreenshot("Add on Member2-Name");
        }
    }

    //Reading Add on Member3 Name
    public void ReadAddonMembers3Name() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String AddonMember_Name3 = driver.findElement(ReadAddonMember3).getText();
            test13.log(LogStatus.PASS, AddonMember_Name3);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Add on Member Name is not Dispalyed");
            getScreenshot("Add on Member3-Name");
        }
    }

    //Reading Add on Member4 Name
    public void ReadAddonMembers4Name() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String AddonMember_Name4 = driver.findElement(ReadAddonMember4).getText();
            test13.log(LogStatus.PASS, AddonMember_Name4);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Add on Member Name is not Dispalyed");
            getScreenshot("Add on Member4-Name");
        }
    }

    //Reading Order Summary-Test Details
    public void ReadOrderSummary_TestDetailsName() throws InterruptedException, IOException {
        try {
            Thread.sleep(3000);
            String OrderSummary_TestDetails = driver.findElement(ReadOrderSummary_TestDetails).getText();
            test13.log(LogStatus.PASS, OrderSummary_TestDetails);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Test Details Name is not Dispalyed");
            getScreenshot("Order Summary-Test Details Name");
        }
    }

    //Reading Order Summary-Test Description
    public void ReadOrderSummary_TestDesc() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String OrderSummary_TestDesc = driver.findElement(ReadOrderSummary_TestDesc).getText();
            test13.log(LogStatus.PASS, OrderSummary_TestDesc);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Test Desc is not Dispalyed");
            getScreenshot("Order Summary-Test Details Desc");
        }
    }

    //Reading Order Summary-Test Type
    public void ReadOrderSummary_TestType() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String OrderSummary_TestType = driver.findElement(ReadOrderSummary_TestType).getText();
            test13.log(LogStatus.PASS, OrderSummary_TestType);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Test Type is not Dispalyed");
            getScreenshot("Order Summary-Test Details Type");
        }
    }


    //Reading Order Summary-Contact Details Name
    public void ReadOrderSummary_ContactDetailsName() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String SelfTest_OrderSummary_ContactUserName = driver.findElement(ReadOrderSummary_Contact_UserName).getText();
            test13.log(LogStatus.PASS, SelfTest_OrderSummary_ContactUserName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Contact Details Name is not Dispalyed");
            getScreenshot("Order Summary-Contact Details Name");
        }
    }

    //Reading Order Summary-Contact Details Number
    public void ReadOrderSummary_ContactDetailsNumber() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String SelfTest_OrderSummary_ContactUserNumber = driver.findElement(ReadOrderSummary_Contact_UserNumber).getText();
            test13.log(LogStatus.PASS, SelfTest_OrderSummary_ContactUserNumber);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Contact Details Number is not Dispalyed");
            getScreenshot("Order Summary-Contact Details Number");
        }
    }

    //Reading Order Summary-Contact Details Address
    public void ReadOrderSummary_ContactDetailsAddress() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String SelfTest_OrderSummary_ContactUserAddress = driver.findElement(ReadOrderSummary_Contact_UserAddress).getText();
            test13.log(LogStatus.PASS, SelfTest_OrderSummary_ContactUserAddress);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Contact Details Address is not Dispalyed");
            getScreenshot("Order Summary-Contact Details Address");
        }
    }

    //Editing Contact Details
    public void ClickEditOrderSummary_ContactDetails() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            driver.findElement(ClickEditContactDetails).click();
            //String BookingDetails = driver.findElement(ReadBookingDetailsPageHeader).getText();
            test13.log(LogStatus.PASS, "Edit Profile is Opened");
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Edit Profile is not Opened");
            getScreenshot("Contact Details-Edit");
        }
    }

    //Reading Order Summary-Payment Details Test Name
    public void ReadOrderSummary_PaymentDetailsTestName() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            String OrderSummary_PaymentDetails_TestName = driver.findElement(ReadOrderSummary_PaymentDetails_TestName).getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_TestName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Test Name is not Displayed");
            getScreenshot("Order Summary-Payment Details-Test Name");
        }
    }

    //Reading Order Summary-Payment Details Test Charge
    public void ReadOrderSummary_PaymentDetailsTestCharge() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String OrderSummary_PaymentDetails_TestCharge = driver.findElement(ReadOrderSummary_PaymentDetails_TestFee).getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_TestCharge);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Test Charge is not Displayed");
            getScreenshot("Order Summary-Payment Details-Test Charge");
        }
    }

    //Reading Order Summary-Payment Details Shipping Name
    public void ReadOrderSummary_PaymentDetailsShippingName() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String OrderSummary_PaymentDetails_ShippingName = driver.findElement(ReadOrderSummary_PaymentDetails_ShippingName).getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_ShippingName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Shipping Name is not Displayed");
            getScreenshot("Order Summary-Payment Details-Shipping Name");
        }
    }

    //Reading Order Summary-Payment Details Shipping Charge
    public void ReadOrderSummary_PaymentDetailsShippingCharge() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String OrderSummary_PaymentDetails_ShippingCharge = driver.findElement(ReadOrderSummary_PaymentDetails_ShippingFee).getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_ShippingCharge);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Order Summary-Payment Details Shipping Charge is not Displayed");
            getScreenshot("Order Summary-Payment Details-Shipping Charge");
        }
    }
    //String SelfTest_OrderSummary_PaymentDetails_TaxName = driver.findElement(ReadOrderSummary_PaymentDetails_TaxName).getText();
    //System.out.println("Tax Name: " +SelfTest_OrderSummary_PaymentDetails_TaxName);
    //Thread.sleep(1000);

    //Reading Order Summary-Payment Details Tax Charge
    public void ReadOrderSummary_PaymentDetailsTaxCharge() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String OrderSummary_PaymentDetails_TaxCharge = driver.findElement(ReadOrderSummary_PaymentDetails_TaxFee).getText();
            test13.log(LogStatus.PASS, OrderSummary_PaymentDetails_TaxCharge);
        } catch (NoSuchElementException e) {
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
            WebElement ordProceed = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(ClickOrderSummary_Proceed));
            ordProceed.click();
            test13.log(LogStatus.PASS, "Clicked Procced from Order Summary");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Proceed is not Clicking in Order Summary");
            getScreenshot("Order Summary-Proceed");
        }
    }

    //Reading Payment Details Name
    public void ReadPaymentDetailsName() throws InterruptedException, IOException {
        try {
            Thread.sleep(15000);
            String PaymentDetails_Name = driver.findElement(ReadPaymentDetails_Name).getText();
            test13.log(LogStatus.PASS, PaymentDetails_Name);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Name is not Displayed in Payment Details");
            getScreenshot("Payment Details-Name");
        }
    }

    //Reading Payment Details Amount
    public void ReadPaymentDetailsAmount() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String PaymentDetails_Amount = driver.findElement(ReadPaymentDetails_Amount).getText();
            test13.log(LogStatus.PASS, PaymentDetails_Amount);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Amount is not Displayed in Payment Details");
            getScreenshot("Payment Details-Amount");
        }
    }

    //Reading Payment Details Address
    public void ReadPaymentDetailsAddress() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String PaymentDetails_Address = driver.findElement(ReadPaymentDetails_Address).getText();
            test13.log(LogStatus.PASS, PaymentDetails_Address);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Address is not Displayed in Payment Details");
            getScreenshot("Payment Details-Address");
        }
    }

    //Clicking Payment Details-Proceed
    public void ClickPaymentDetails_Proceed() throws IOException {
        test13.log(LogStatus.INFO, "Clicking Payment Details-Proceed");
        try {
            WebElement payProceed = new WebDriverWait(driver, 60)
                    .until(driver -> driver.findElement(ClickPaymentDetails_Proceed));
            payProceed.click();
            test13.log(LogStatus.PASS, "Clicked Proceed from Payment Details");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Proceed is not Clicked in Payment Details");
            getScreenshot("Payment Details-Proceed");
        }
    }

    //Reading Payment Gateway TestName
    public void ReadPaymentGatewayTestName() throws InterruptedException, IOException {
        try {
            Thread.sleep(10000);
            String PaymentGateway_TestName = driver.findElement(ReadPaymentGateway_TestName).getText();
            test13.log(LogStatus.PASS, PaymentGateway_TestName);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Payment Gateway Test Name is not Displayed");
            getScreenshot("Payment Gateway-Test Name");
        }
    }

    //Reading Payment Gateway TestCarge
    public void ReadPaymentGatewayTestCharge() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            String PaymentGateway_Charge = driver.findElement(ReadPaymentGateway_TotalCharge).getText();
            test13.log(LogStatus.PASS, PaymentGateway_Charge);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Payment Gateway Test Charge is not Displayed");
            getScreenshot("Payment Gateway-Test Charge");
        }
    }

    //Reading Payment Gateway-Email
    public void ReadPaymentGateway_Email(String Email) throws InterruptedException {
        try {
            Thread.sleep(2000);
            String PaymentEmail = driver.findElement(ReadPaymentGateway_Email).getText();
            test13.log(LogStatus.PASS, PaymentEmail);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.FAIL, "Entering Email");
            Thread.sleep(2000);
            driver.findElement(ReadPaymentGateway_Email).sendKeys(Email);
        }
    }

    //Passing card Details to Payment Gateway
    public void SetPaymentGateway_CardNumber(String Number) {
        try {
            test13.log(LogStatus.INFO, "Enter Card Details");
            WebElement payProceed = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(SetPaymentGateway_CardInfo));
            payProceed.sendKeys(Number);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Card Details Card number field not shown");
        }
    }

    //Clear Card Details in Payment Gateway
    public void ClearPaymentGateway_CardDetails() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(SetPaymentGateway_CardInfo).clear();
        Thread.sleep(2000);
    }

    //Reading Payment Alert
    public void ReadPaymentGateway_Alert() throws InterruptedException, IOException {
        Thread.sleep(2000);
        try {
            String Alert = driver.findElement(ReadPaymentAlert).getText();
            test13.log(LogStatus.PASS, Alert);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.WARNING, "Alert is not Displayed");
            getScreenshot("Payment Gateway-Alert");
        }
    }

    //Passing Exp Date to Payment Gateway
    public void SetPaymentGateway_CardEXP(String EXP) {
        try {
            WebElement tcBox = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetPaymentGateway_CardExpiry));
            tcBox.sendKeys(EXP);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Card Details Exp field not shown");
        }
    }

    //Clearing Card Exp
    public void ClearPaymentGateway_CardEXP() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(SetPaymentGateway_CardExpiry).clear();
    }

    //Passing Card CVC to Payment Gateway
    public void SetPaymentGateway_CVC(String CVC) {
        try {
            WebElement tcBox = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetPaymentGateway_CardCVC));
            tcBox.sendKeys(CVC);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Card Details CVC field not shown");
        }
    }

    //Clearing CVC in Payment Gateway
    public void ClearPaymentGateway_CVC() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(SetPaymentGateway_CardCVC).clear();
    }

    //Passing Name to Payment Gateway
    public void SetPaymentGateway_Name(String Name) throws InterruptedException {
        Thread.sleep(1000);
        try {
            WebElement tcBox = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetPaymentGateway_CardName));
            tcBox.click();
            Thread.sleep(1000);
            driver.navigate().back();
            WebElement tccBox = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SetPaymentGateway_CardName));
            Thread.sleep(1000);
            tccBox.sendKeys(Name);
        } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
            test13.log(LogStatus.FAIL, "Card Details Name field not shown");
        }
    }

    //Passing Country to Payment Gateway
    public void SetPaymentGateway_BillCountry() throws InterruptedException {
        try {
            //Thread.sleep(2000);
            Dimension dimension = driver.manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.5);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            WebElement tcBox2 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ClickPaymentGateway_BillingCountry));
            tcBox2.click();
            //driver.findElement(ClickPaymentGateway_BillingCountry).click();
            Thread.sleep(1000);
            Dimension dimension1 = driver.manage().window().getSize();
            int scrollStart1 = (int) (dimension1.getHeight() * 0.8);
            int scrollEnd1 = (int) (dimension1.getHeight() * 0.5);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart1))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd1))
                    .release().perform();
            WebElement tcBox = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(SelectPaymentGateway_BillingCountry));
            tcBox.click();
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "Can't able to select billing country");
        }
    }

    //Clicking Payment Gateway-Pay
    public void ClickPaymentGateway_Pay() throws IOException {
        try {
            WebElement loginButton = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ClickPaymentGateway_Pay));
            loginButton.click();
            test13.log(LogStatus.PASS, "Clicked Pay in Payment Gateway");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "Pay is not Clicked in Payment Gateway");
            getScreenshot("Payment Gateway-Pay");
        }
    }

    //Reading the Test Order Status
    public void ReadTestOrderStatus() throws IOException, InterruptedException {
        test13.log(LogStatus.INFO, "Displaying Order Status Details");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.visibilityOfElementLocated(ReadTestOrderStatus));
            String OrderStatus = driver.findElement(ReadTestOrderStatus).getText();
            test13.log(LogStatus.PASS, OrderStatus);
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.SKIP, "Test Order notification is not displayed");
            try {
                getScreenshot("Test Order Status");
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(ClickBackfromPayment));
                element.click();
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(ClickLeaveThisPage));
                element1.click();
                test13.log(LogStatus.FAIL, "Test Order is not Placed");
            } catch (NoSuchElementException | TimeoutException e1) {
                //System.out.println("Nos such element");
                Thread.sleep(1000);
                try {
                    WebElement tcBox = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(SetPaymentGateway_CardName));
                    tcBox.click();
                    Thread.sleep(1000);
                    driver.navigate().back();
                    WebElement tccBox = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(SetPaymentGateway_CardName));
                    Thread.sleep(1000);
                    tccBox.sendKeys("Maria");
                    ClickPaymentGateway_Pay();
                } catch (NoSuchElementException | TimeoutException | InterruptedException e2) {
                    test13.log(LogStatus.FAIL, "Card Details Name field not shown");
                }
            }
        }
    }

    //Clicking Home Test
    public void ClickHomeTest() throws IOException {
        test13.log(LogStatus.INFO, "Ready to Click In Home Test");
        try {
            WebElement loginButton = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(ClickHomeTest));
            loginButton.click();
            test13.log(LogStatus.PASS, "In-Home Test is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "In-Home Test is not Clicked ");
            getScreenshot("Home Page-Book a Test");
        }
    }

    //Clicking Home Test Schedule
    public void ClickHomeTestSchedule() throws IOException {
        test13.log(LogStatus.INFO, "Scheduling In Home Test");
        try {
            WebElement loginButton = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ClickHomeTestSchedule));
            loginButton.click();
            test13.log(LogStatus.PASS, "In-Home Schedule is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "In-Home Schedule is not Clicked ");
            getScreenshot("Home Test-Schedule");
        }
    }

    public void ClickHomeTestScheduleNextDay() throws IOException {
        test13.log(LogStatus.INFO, "Selecting Scheduling Date and Time");
        try {
            WebElement loginButton = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(ClickNextDay));
            loginButton.click();
            test13.log(LogStatus.PASS, "In-Home Schedule-Next Day is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "In-Home Schedule Next Day is not Clicked ");
            getScreenshot("Home Test-Schedule-Day");
        }
    }

    public void ClickHomeTestScheduleNextDayEve() throws IOException {
        try {
            WebElement loginButton = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ClickEveneingLabel));
            loginButton.click();
            test13.log(LogStatus.PASS, "In-Home Schedule-Next Day Eve is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "In-Home Schedule Next Day Eve is not Clicked ");
            getScreenshot("Home Test-Schedule-Day-Eve");
        }
    }

    public void ClickHomeTestScheduleNextDayEveTime() throws IOException {
        try {
            WebElement loginButton = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ClickNextSecondTime));
            loginButton.click();
            test13.log(LogStatus.PASS, "In-Home Schedule-Next Day Eve Time is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "In-Home Schedule Next Day Eve Time is not Clicked ");
            getScreenshot("Home Test-Schedule-Day-Eve-Time");
        }
    }

    //Reading Scheduled Date
    public void ReadScheduledDate() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            String OrderSummary_ScheduledDate = driver.findElement(ReadScheduledDate).getText();
            test13.log(LogStatus.PASS, "It's a Home Test:  " + OrderSummary_ScheduledDate);
        } catch (NoSuchElementException e) {
            test13.log(LogStatus.PASS, "It's a Self Test");
            getScreenshot("Home Test-Schedule");

        }
    }

    public void ClickHomeTestScheduleProceed() throws IOException {
        try {
            WebElement loginButton = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ClickProceedtoSchedule));
            loginButton.click();
            test13.log(LogStatus.INFO, "In-Home Schedule-Proceed is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test13.log(LogStatus.FAIL, "In-Home Schedule Proceed is not Clicked ");
            getScreenshot("Home Test-Schedule-Day-Eve-Time");
        }
    }

}

	

