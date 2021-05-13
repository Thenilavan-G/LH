package IntegrationTest;

import IntegrationPages.TestBaseApp;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import IntegrationPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class AppTest extends TestBaseApp {

    @Test
    public static void Login_Page_UI() throws InterruptedException, IOException {
        LoginUiPageObjects uiObj = new LoginUiPageObjects(driver);

        uiObj.verifyPopup();
        uiObj.verifyHeader("Join LifeHope Health™, the fastest way to track, test & report your family’s health to keep everyone healthy, happy and blessed.");
        uiObj.verifyMobileNumberField("Mobile Number");
        uiObj.verifySignupButton("SIGN UP / SIGN IN");
        uiObj.verifyFacebookLogo();
        uiObj.verifyGmailLogo();
        uiObj.verifyBottomText("By proceeding you agree to our T&C and Privacy Policy");
    }

    @Test
    public static void MobileNumber_Signup() throws InterruptedException, IOException {
        MobileNumberSignupPageObjects mobileObj = new MobileNumberSignupPageObjects(driver);

        mobileObj.verifyPopup();
        mobileObj.verifyMobileNumber(dataList.get(0));
    }

    @Test
    public static void OTP_Page_UI() throws InterruptedException, IOException {
        OtpUiPageObjects otpObj = new OtpUiPageObjects(driver);

        otpObj.verifyHeader("Verification code has been sent to \n" + " +1(980) 000-0000");
        otpObj.verifyMobileNumberField("Enter 6 digit sms verification code", "Didn't receive the code? Resend code");
        otpObj.verifyButton("Verify");
    }

    @Test
    public static void OTP_Page() throws InterruptedException, IOException {
        OtpPageObjects otpObj = new OtpPageObjects(driver);

        otpObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        otpObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test
    public static void Facebook_Page_UI() throws InterruptedException, IOException {
        FbUiPageObjects uiObj = new FbUiPageObjects(driver);

        uiObj.verifyFbContinuePageUi("Log in to your Facebook account to connect to Life Hope", "You previously logged in to Life Hope with Facebook.\n" + "\n" + "Would you like to continue?", "LifeHope's", "Privacy Policy");
    }

    @Test
    public static void Facebook_MobileNumber_Signup() throws InterruptedException, IOException {
        FacebookSignupPageObjects fbObj = new FacebookSignupPageObjects(driver);

        fbObj.verifyPopup();
        fbObj.clickFacebook();
        fbObj.setFacebookCredentials(dataList.get(8), dataList.get(9));
        fbObj.verifyMobileNumber(dataList.get(0));
        fbObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        fbObj.verifyUI("Enter your mobile number to \n" + "Login or Sign up", "Mobile Number", "+1", "Next", dataList.get(10));
        fbObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test
    public static void Facebook_Gmail_Signup() throws InterruptedException, IOException {
        FacebookSignupPageObjects fbObj = new FacebookSignupPageObjects(driver);

        fbObj.verifyPopup();
        fbObj.clickFacebook();
        fbObj.setFacebookCredentials(dataList.get(11), dataList.get(12));
        fbObj.verifyMobileNumber(dataList.get(0));
        fbObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        fbObj.verifyUI("Enter your mobile number to \n" + "Login or Sign up", "Mobile Number", "+1", "Next", dataList.get(10));
        fbObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test
    public static void Gmail_Page_UI() throws InterruptedException, IOException {
        GmailUiPageObjects uiObj = new GmailUiPageObjects(driver);

        uiObj.verifyAppLogo();
        uiObj.verifyText("to continue to LifeHope Health");
        uiObj.verifyBottomText("To continue, Google will share your name, email address and profile picture with LifeHope Health.");
    }

    @Test
    public static void Gmail_Signup() throws InterruptedException, IOException {
        GmailSignupPageObjects gObj = new GmailSignupPageObjects(driver);

        gObj.verifyPopup();
        gObj.clickGmail();
        gObj.selectGmail();
        gObj.verifyMobileNumber(dataList.get(0));
        gObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        gObj.verifyUI("Enter your mobile number to \n" + "Login or Sign up", "Mobile Number", "+1", "Next", dataList.get(10));
        gObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test
    public static void Terms_Condition() throws InterruptedException, IOException {
        TermsPageObjects tcObj = new TermsPageObjects(driver);

        tcObj.verifyPopup();
        tcObj.clickTerms();
    }

    @Test
    public static void Privacy_Policy() throws InterruptedException, IOException {
        PrivacyPageObjects pvObj = new PrivacyPageObjects(driver);

        pvObj.verifyPopup();
        pvObj.clickPrivacy();
    }

    @Test
    public static void Profile_Settings() throws InterruptedException, IOException {
        ProfileSettingsPageObjects PSObj = new ProfileSettingsPageObjects(driver);

        PSObj.setImage();
        PSObj.setAllow();
        PSObj.setAllow1();
        PSObj.setCamera();
        PSObj.setCameraclick();
        PSObj.setOk();

        ProfileSettingsPageObjects BIObj = new ProfileSettingsPageObjects(driver);

        BIObj.setFirstname(dataList.get(13));
        BIObj.setLastname(dataList.get(14));
        BIObj.setGender();
        BIObj.setFemale();
        BIObj.setDob(dataList.get(15));
        BIObj.setEmail(dataList.get(16));
        BIObj.setAddress();
        BIObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
        BIObj.setNewprofilelocation();
        BIObj.setChange();
        BIObj.setEditaddress(dataList.get(17));
        BIObj.setEnteraddress();
        BIObj.setLandmark(dataList.get(18));
        BIObj.setSaveaddress();

        ProfileSettingsPageObjects MIObj = new ProfileSettingsPageObjects(driver);

        MIObj.setMedicalinfo();
        MIObj.setHeight();
        MIObj.setWeight(dataList.get(19));
        MIObj.setBloodgroup();
        MIObj.setBloodgroupselection();
        MIObj.setTickmark();
        MIObj.allowLocation();
    }

    @Test
    public static void Quick_Health_Test() throws InterruptedException, IOException {
        QuickHealthTestPageObjects qObj = new QuickHealthTestPageObjects(driver);

        qObj.verifyQuickTestName("Quick Health Test");
        qObj.verifyQuickTestLogo();
        qObj.clickQuickTest();
        qObj.verifyHeader("Quick Health Test");
        qObj.verifySubTitle("Self Diagnosis");
        qObj.verifyCoronaName("Coronavirus Symptoms");
        qObj.verifyCoronaLogo();
        qObj.clickCoronaSymptoms();
        qObj.verifyTakePhotoPageUI("Take a Photo", "First Name *", "Last Name *", "Gender *", "Age *", "Same as profile info", "NEXT");
        qObj.setProfileInfo(dataList.get(20), dataList.get(21), dataList.get(22), dataList.get(23), dataList.get(24));
        qObj.verifyQuesPageUI("Coronavirus Symptoms Questionnaire", "Let's check if you have any Coronavirus symptoms", "Total questions: 1 of 13", "Our interactive Coronavirus (COVID-19) self-checker helps you quickly find information about the COVID-19");
        qObj.setFirstQues("How do you feel?", dataList.get(25), "Great", "Good", "Poor", "Sick");
        qObj.setSecondQues("Total questions: 2 of 13", "Do you have a cough?", dataList.get(26), "Yes", "No");
        qObj.setThirdQues("Total questions: 3 of 13", "Do you have a sore throat?", dataList.get(27), "Yes", "No");
        qObj.setFourthQues("Total questions: 4 of 13", "Do you have a loss of taste or smell?", dataList.get(28), "Yes", "No");
        qObj.setFifthQues("Total questions: 5 of 13", "Do you have a fever greater than 102⁰F or any fever that has lasted longer than 48 hours?", dataList.get(29), "Yes", "No");
        qObj.setSixthQues("Total questions: 6 of 13", "Do you feel dizzy, Light-headed, or too weak to stand?", dataList.get(30), "Yes", "No");
        qObj.setSeventhQues("Total questions: 7 of 13", "Do you have slurred speech or seizures?", dataList.get(31), "Yes", "No");
        qObj.setEightQues("Total questions: 8 of 13", "Do you have severe or constant pain or pressure in the chest?", dataList.get(32), "Yes", "No");
        qObj.setNinthQues("Total questions: 9 of 13", "Do you have Bluish lips or face?", dataList.get(33), "Yes", "No");
        qObj.setTenthQues("Total questions: 10 of 13", "Are you having difficulty breathing? (Such as gasping for air, unable to talk without catching your breath or severe wheezing)", dataList.get(34), "Yes", "No");
        qObj.setLeventhQues("Total questions: 11 of 13", "Are you disoriented or confused?", dataList.get(35), "Yes", "No");
        qObj.setTwelthQues("Total questions: 12 of 13", "Do you see any signs of low blood pressure (too weak to stand, dizziness, lightheaded, feeling cold, pale or clammy skin)?", dataList.get(36), "Yes", "No");
        qObj.setThirteenQues("Total questions: 13 of 13", "Do you feel dehydrated such as dry lips, not urinating much or have droopy eyelids?", dataList.get(37), "Yes", "No");
        qObj.verifyConcernsUI("Enter your concerns if any:");
        qObj.verifyConcerns("No concern", "SKIP");
        qObj.verifyDiagnosisResultUI("Diagnosis Result", "Symptom Analysis", "Based on the information provided, we recommend you order a test.", "Symptom Severity", "You have completed your quick health checkup", "Share", "Book a Test");
        qObj.verifyDiagnosisResult();
        qObj.verifyDiagnosisHistory("Diagnosis History", "Coronavirus Symptoms", "Coronavirus Symptoms History", "Coronavirus Symptoms");
    }

    @Test
    public static void BookA_SelfTest_COVID19PCRTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ClickCovid19PCRTest();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(9));
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(10));
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(11));
        BookSelfObj.SetPaymentGateway_Name(dataList.get(12));
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public static void BookA_SelfTest_COVID19AntibodyTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ClickCovid19AntibodyTest();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(9));
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(10));
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(11));
        BookSelfObj.SetPaymentGateway_Name(dataList.get(12));
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public static void BookA_SelfTest_RPPTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ClickRPPTest();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(9));
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(10));
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(11));
        BookSelfObj.SetPaymentGateway_Name(dataList.get(12));
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public static void BookA_SelfTest_MicrobiomeTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ClickMicrobiomeTest();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(9));
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(10));
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(11));
        BookSelfObj.SetPaymentGateway_Name(dataList.get(12));
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public static void BookA_InHomeTest_COVID19PCRTest() throws InterruptedException, IOException {
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
    public static void BookA_InHomeTest_COVID19AntibodyTest() throws InterruptedException, IOException {
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
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(9));
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(10));
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(11));
        BookHomeObj.SetPaymentGateway_Name(dataList.get(12));
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public static void BookA_InHomeTest_RPPTest() throws InterruptedException, IOException {
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
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(9));
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(10));
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(11));
        BookHomeObj.SetPaymentGateway_Name(dataList.get(12));
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public static void BookA_InHomeTest_MicrobiomeTest() throws InterruptedException, IOException {
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
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(9));
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(10));
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(11));
        BookHomeObj.SetPaymentGateway_Name(dataList.get(12));
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public static void Test_Orders_Info() throws InterruptedException, IOException {
        TestOrdersInfoPageObjects infObj = new TestOrdersInfoPageObjects(driver);

        infObj.clickMenu();
        infObj.clickTestOrders();
        infObj.verifyTestOrdersTitle();
        infObj.verifyTestOrders();
    }

    @Test
    public static void Test_Orders_Status() throws InterruptedException, IOException {
        TestOrderStatusPageObjects statusObj = new TestOrderStatusPageObjects(driver);

        statusObj.gotoTestOrders();
        statusObj.verifyOrderStatus("Pending", "Approved", "InProgress", "Completed", "Rejected", "Refunded");
    }

    @Test
    public static void Test_Orders_Track() throws InterruptedException, IOException {
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

    @Test
    public static void Lab_Results() throws InterruptedException, IOException {
        LabResultsPageObjects labObj = new LabResultsPageObjects(driver);

        labObj.verifyHeader("Lab Results");
        labObj.verifyLabResultsImage();
        labObj.clickLabResults();
        labObj.verifyInsideHeader("Lab Results");
        labObj.verifyLabResults();
    }

    @Test
    public static void Vitals() throws InterruptedException, IOException {
        VitalsPageObjects VitalsObj = new VitalsPageObjects(driver);

        VitalsObj.setVitals_header("Vitals");
        VitalsObj.setVitals_image();
        VitalsObj.setVitals();
        VitalsObj.setVitalsinside_header("Vitals");
        VitalsObj.setEntervitals();
        VitalsObj.verifyBand("LifeHope Health Band");
        VitalsObj.setBodytemperature(dataList.get(55));
        VitalsObj.setOxygenlevel(dataList.get(56));
        VitalsObj.setWeight(dataList.get(57));
        VitalsObj.setBloodPressure(dataList.get(58));
        VitalsObj.setHeartBeats(dataList.get(59));
        VitalsObj.setDone();
        VitalsObj.verifyECG("ECG/EKG", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyHeartRate("Heart Rate (BPM)", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyBodyTemperature("Body Temperature", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyOxygenLevel("Oxygen Level (SPO2)", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyBloodPressure("Blood Pressure", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyWeight("Weight", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.backHome();
    }

    @Test
    public static void Home_Screen_UI() throws InterruptedException, IOException {
        HomeScreenUIPageObjects HomeUIObj = new HomeScreenUIPageObjects(driver);

        HomeUIObj.setHomeScreenLogo();
        HomeUIObj.setHomepageDescription("Now abide these, faith, hope & love but the greatest of these is Love.\n" + "  1 Cor 13:13");
        HomeUIObj.setCalendar();
        HomeUIObj.setClock();
        HomeUIObj.setWeather();
        HomeUIObj.setText("What are you looking for?");
        HomeUIObj.setQuickHealthTestLogo();
        HomeUIObj.setQuickHealthTestText("Quick Health Test");
        HomeUIObj.setBookATestLogo();
        HomeUIObj.setBookATestText("Book a Test");
        HomeUIObj.setLabResultsLogo();
        HomeUIObj.setLabResultsText("Lab Results");
        HomeUIObj.setVitalsLogo();
        HomeUIObj.setVitalsText("Vitals");
        HomeUIObj.setBannerSlider();
    }

    @Test
    public static void Profile_Edit() throws InterruptedException, IOException {
        ProfileSettingsPageObjects menuObj = new ProfileSettingsPageObjects(driver);

        menuObj.setMenubar();
        menuObj.setEdit();
        menuObj.verifyInfo("Profile Settings", "Basic Information", "Mobile", "Email", "Address", "Medical Information", "Height", "Weight", "Blood Group");
        menuObj.setEdit2();
        menuObj.setGallery();

        ProfileSettingsPageObjects BIObj = new ProfileSettingsPageObjects(driver);

        BIObj.editFirstname("Robert");
        BIObj.editLastname("Joseph");
        BIObj.editGender();
        BIObj.editFemale();
        BIObj.editDob("12121998");
        BIObj.editEmail("robert@gmail.com");
        BIObj.editClickAddress();
        BIObj.editNewprofilelocation();
        BIObj.editChange();
        BIObj.editAddress(dataList.get(17));
        BIObj.editEnteraddress();
        BIObj.editLandmark(dataList.get(18));
        BIObj.editSaveaddress();

        ProfileSettingsPageObjects MIObj = new ProfileSettingsPageObjects(driver);

        MIObj.editMedicalinfo();
        MIObj.editHeight();
        MIObj.editWeight("411");
        MIObj.editBloodgroup();
        MIObj.editBloodgroupselection();
        MIObj.editTickmark();
    }

    @Test
    public static void Left_Menu() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

//        leftObj.clickContactSupport();
//        leftObj.sendMsg("hi");
//        leftObj.sendAttachment();
//        leftObj.clickPrivacyPolicy();
//        leftObj.clickTermsAndConditions();
        leftObj.Logout();
    }

}
