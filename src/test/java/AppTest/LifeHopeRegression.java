package AppTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class LifeHopeRegression extends AppTestBase {

    @Test
    public void Login_Page_UI() throws IOException {
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
    public void MobileNumber_Signup() throws InterruptedException, IOException {
        MobileNumberSignupPageObjects mobileObj = new MobileNumberSignupPageObjects(driver);

        mobileObj.verifyPopup();
//        mobileObj.setMobileNumber("'1111111111");
//        mobileObj.clickSignup();
//        mobileObj.verifyPopupUi("NUMBER CONFIRMATION: \n" + "+91 (111) 111-1111", "Is your mobile number \n" + "above Correct?", "Edit", "Yes");
//        mobileObj.validateMobileField();
        mobileObj.verifyMobileNumber(dataList.get(0));
    }

    @Test
    public void OTP_Page_UI() throws InterruptedException, IOException {
        OtpUiPageObjects otpObj = new OtpUiPageObjects(driver);

        otpObj.verifyHeader("Verification code has been sent to \n" + "+91 2000000072");
        otpObj.verifyMobileNumberField("Enter 6 digit sms verification code", "Didn't receive the code? Resend code");
        otpObj.verifyButton("Verify");
    }

    @Test
    public void OTP_Page() throws InterruptedException, IOException {
        OtpPageObjects otpObj = new OtpPageObjects(driver);

//        otpObj.setWithOutOTP();
//        otpObj.setInvalidOTP(dataList.get(2), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        otpObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
//        otpObj.clickResendOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
//        otpObj.clickVerify();
        otpObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test
    public void Facebook_Page_UI() throws InterruptedException, IOException {
        FbUiPageObjects uiObj = new FbUiPageObjects(driver);

        uiObj.verifyFbContinuePageUi("Log in to your Facebook account to connect to LifeHope Health", "You previously logged in to LifeHope Health with Facebook.\n" + "\n" + "Would you like to continue?", "LifeHope Health's", "Privacy Policy");
    }

    @Test
    public void Facebook_MobileNumber_Signup() throws InterruptedException, IOException {
        FacebookSignupPageObjects fbObj = new FacebookSignupPageObjects(driver);

        fbObj.verifyPopup();
        fbObj.clickFacebook();
        fbObj.setFacebookCredentials(dataList.get(8), dataList.get(9));
        fbObj.verifyMobileNumber(dataList.get(0));
        fbObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        fbObj.verifyUI("Verification code has been sent to \n" + " +91 2000000072", "Mobile Number", "+1", "Next", dataList.get(10), "Enter your mobile number to \n" + "Login or Sign up");
        fbObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test
    public void Facebook_Gmail_Signup() throws InterruptedException, IOException {
        FacebookSignupPageObjects fbObj = new FacebookSignupPageObjects(driver);

        fbObj.verifyPopup();
        fbObj.clickFacebook();
        fbObj.setFacebookCredentials(dataList.get(11), dataList.get(12));
        fbObj.verifyMobileNumber(dataList.get(0));
        fbObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        fbObj.verifyUI("Verification code has been sent to \n" + " +91 2000000072", "Mobile Number", "+1", "Next", dataList.get(10), "Enter your mobile number to \n" + "Login or Sign up");
        fbObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test
    public void Gmail_Page_UI() throws InterruptedException, IOException {
        GmailUiPageObjects uiObj = new GmailUiPageObjects(driver);

        uiObj.verifyAppLogo();
        uiObj.verifyText("to continue to LifeHope Health");
        uiObj.verifyBottomText("To continue, Google will share your name, email address and profile picture with LifeHope Health.");
    }

    @Test
    public void Gmail_Signup() throws InterruptedException, IOException {
        GmailSignupPageObjects gObj = new GmailSignupPageObjects(driver);

        gObj.verifyPopup();
        gObj.clickGmail();
        gObj.selectGmail();
        gObj.verifyMobileNumber(dataList.get(0));
        gObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        gObj.verifyUI("Verification code has been sent to \n" + " +91 2000000072", "Mobile Number", "+1", "Next", dataList.get(10));
        gObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test
    public void Terms_Condition() throws InterruptedException, IOException {
        TermsPageObjects tcObj = new TermsPageObjects(driver);

        tcObj.verifyPopup();
        tcObj.clickTerms();
    }

    @Test
    public void Privacy_Policy() throws InterruptedException, IOException {
        PrivacyPageObjects pvObj = new PrivacyPageObjects(driver);

        pvObj.verifyPopup();
        pvObj.clickPrivacy();
    }

    @Test
    public void Profile_Settings() throws InterruptedException, IOException {
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
        MIObj.allow_location();
    }

    @Test
    public void Quick_Health_Test() throws InterruptedException, IOException {
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
        qObj.setFirstQues("How do you feel?", dataList.get(25));
        qObj.setSecondQues("Total questions: 2 of 13", "Do you have a cough?", dataList.get(26));
        qObj.setThirdQues("Total questions: 3 of 13", "Do you have a sore throat?", dataList.get(27));
        qObj.setFourthQues("Total questions: 4 of 13", "Do you have a loss of taste or smell?", dataList.get(28));
        qObj.setFifthQues("Total questions: 5 of 13", "Do you have a fever greater than 102⁰F or any fever that has lasted longer than 48 hours?", dataList.get(29));
        qObj.setSixthQues("Total questions: 6 of 13", "Do you feel dizzy, Light-headed, or too weak to stand?", dataList.get(30));
        qObj.setSeventhQues("Total questions: 7 of 13", "Do you have slurred speech or seizures?", dataList.get(31));
        qObj.setEightQues("Total questions: 8 of 13", "Do you have severe or constant pain or pressure in the chest?", dataList.get(32));
        qObj.setNinthQues("Total questions: 9 of 13", "Do you have Bluish lips or face?", dataList.get(33));
        qObj.setTenthQues("Total questions: 10 of 13", "Are you having difficulty breathing? (Such as gasping for air, unable to talk without catching your breath or severe wheezing)", dataList.get(34));
        qObj.setLeventhQues("Total questions: 11 of 13", "Are you disoriented or confused?", dataList.get(35));
        qObj.setTwelthQues("Total questions: 12 of 13", "Do you see any signs of low blood pressure (too weak to stand, dizziness, lightheaded, feeling cold, pale or clammy skin)?", dataList.get(36));
        qObj.setThirteenQues("Total questions: 13 of 13", "Do you feel dehydrated such as dry lips, not urinating much or have droopy eyelids?", dataList.get(37));
        qObj.verifyConcernsUI("Enter your concerns if any:");
        qObj.verifyConcerns("No concern", "SKIP");
        qObj.verifyDiagnosisResultUI("Diagnosis Result", "Symptom Analysis", "Based on the information provided, we recommend you order a test.", "Symptom Severity", "You have completed your quick health checkup", "Share", "Book a Test");
        qObj.verifyDiagnosisResult();
        qObj.verifyDiagnosisHistory("Diagnosis History", "Coronavirus Symptoms", "Coronavirus Symptoms History", "Coronavirus Symptoms");
    }

    @Test
    public void BookA_SelfTest_COVID19PCRTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ReadTest_Info();

        //SelfTest-Covid19 PCR
        BookSelfObj.ReadCovid19PCRTestName();
        BookSelfObj.ReadCovid19PCRTestDesc();
        BookSelfObj.ClickCovid19PCRTest();
        BookSelfObj.ReadBookingDetailsFirstName();
        BookSelfObj.ReadBookingDetailslastName();
        BookSelfObj.ReadBookingDetailsGender();
        BookSelfObj.ReadBookingDetailsDOB();
        BookSelfObj.ReadBookingDetailsMobile();
        BookSelfObj.ReadBookingDetailsAddress();
        BookSelfObj.ReadBookingDetailsTestInfo();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickTermsConditions();
        BookSelfObj.ReadTermsConditions();
        BookSelfObj.ClickTermsConditionsOK();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickEditOrderSummary_ContactDetails();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember_Name(dataList.get(38));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember_Edit();
        BookSelfObj.ClickAddonMember_Update();
        BookSelfObj.ClickAddonMember_Remove();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember_Name(dataList.get(38));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember2_Name(dataList.get(40));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember3_Name(dataList.get(41));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember4_Name(dataList.get(42));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember5_Name(dataList.get(43));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.AddonMemberLimit();
        BookSelfObj.AddonMembercancel();
        BookSelfObj.ReadOrderSummary_TestDetailsName();
        BookSelfObj.ReadOrderSummary_TestDesc();
        BookSelfObj.ReadOrderSummary_TestType();
        BookSelfObj.ReadOrderSummary_ContactDetailsName();
        BookSelfObj.ReadOrderSummary_ContactDetailsNumber();
        BookSelfObj.ReadAddonMembers1Name();
        BookSelfObj.ReadAddonMembers1Age();
        BookSelfObj.ReadAddonMembers1Gender();
        BookSelfObj.ReadAddonMembers2Name();
        BookSelfObj.ReadAddonMembers3Name();
        BookSelfObj.ReadAddonMembers4Name();
        BookSelfObj.ReadOrderSummary_ContactDetailsAddress();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTestName();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTestCharge();
        BookSelfObj.ReadOrderSummary_PaymentDetailsShippingName();
        BookSelfObj.ReadOrderSummary_PaymentDetailsShippingCharge();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTaxCharge();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ReadPaymentDetailsName();
        BookSelfObj.ReadPaymentDetailsAmount();
        BookSelfObj.ReadPaymentDetailsAddress();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.ReadPaymentGatewayTestName();
        BookSelfObj.ReadPaymentGatewayTestCharge();
        BookSelfObj.ReadPaymentGateway_Email(dataList.get(44));
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(45));
        BookSelfObj.ClickPaymentGateway_CardEXP();
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CardDetails();
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(48));
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(46));
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CardEXP();
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(52));
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(47));
        BookSelfObj.ClickPaymentGateway_Name();
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CVC();
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(53));
        BookSelfObj.SetPaymentGateway_Name(dataList.get(54));
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_SelfTest_COVID19AntibodyTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ReadTest_Info();

        //SelfTest-Covid19 Antibody
        BookSelfObj.ReadCovid19AntibodyTestName();
        BookSelfObj.ReadCovid19AntibodyTestDesc();
        BookSelfObj.ClickCovid19AntibodyTest();
        BookSelfObj.ReadBookingDetailsFirstName();
        BookSelfObj.ReadBookingDetailslastName();
        BookSelfObj.ReadBookingDetailsGender();
        BookSelfObj.ReadBookingDetailsDOB();
        BookSelfObj.ReadBookingDetailsMobile();
        BookSelfObj.ReadBookingDetailsAddress();
        BookSelfObj.ReadBookingDetailsTestInfo();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickTermsConditions();
        BookSelfObj.ReadTermsConditions();
        BookSelfObj.ClickTermsConditionsOK();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickEditOrderSummary_ContactDetails();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember_Name(dataList.get(38));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember_Edit();
        BookSelfObj.ClickAddonMember_Update();
        BookSelfObj.ClickAddonMember_Remove();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember_Name(dataList.get(38));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember2_Name(dataList.get(40));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember3_Name(dataList.get(41));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember4_Name(dataList.get(42));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember5_Name(dataList.get(43));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.AddonMemberLimit();
        BookSelfObj.AddonMembercancel();
        BookSelfObj.ReadOrderSummary_TestDetailsName();
        BookSelfObj.ReadOrderSummary_TestDesc();
        BookSelfObj.ReadOrderSummary_TestType();
        BookSelfObj.ReadOrderSummary_ContactDetailsName();
        BookSelfObj.ReadOrderSummary_ContactDetailsNumber();
        BookSelfObj.ReadAddonMembers1Name();
        BookSelfObj.ReadAddonMembers1Age();
        BookSelfObj.ReadAddonMembers1Gender();
        BookSelfObj.ReadAddonMembers2Name();
        BookSelfObj.ReadAddonMembers3Name();
        BookSelfObj.ReadAddonMembers4Name();
        BookSelfObj.ReadOrderSummary_ContactDetailsAddress();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTestName();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTestCharge();
        BookSelfObj.ReadOrderSummary_PaymentDetailsShippingName();
        BookSelfObj.ReadOrderSummary_PaymentDetailsShippingCharge();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTaxCharge();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ReadPaymentDetailsName();
        BookSelfObj.ReadPaymentDetailsAmount();
        BookSelfObj.ReadPaymentDetailsAddress();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.ReadPaymentGatewayTestName();
        BookSelfObj.ReadPaymentGatewayTestCharge();
        BookSelfObj.ReadPaymentGateway_Email(dataList.get(44));
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(45));
        BookSelfObj.ClickPaymentGateway_CardEXP();
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CardDetails();
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(48));
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(46));
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CardEXP();
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(52));
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(47));
        BookSelfObj.ClickPaymentGateway_Name();
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CVC();
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(53));
        BookSelfObj.SetPaymentGateway_Name(dataList.get(54));
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_SelfTest_RPPTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ReadTest_Info();

        //SelfTest-RPP
        BookSelfObj.ReadRPPTestName();
        BookSelfObj.ReadRPPTestDesc();
        BookSelfObj.ClickRPPTest();
        BookSelfObj.ReadBookingDetailsFirstName();
        BookSelfObj.ReadBookingDetailslastName();
        BookSelfObj.ReadBookingDetailsGender();
        BookSelfObj.ReadBookingDetailsDOB();
        BookSelfObj.ReadBookingDetailsMobile();
        BookSelfObj.ReadBookingDetailsAddress();
        BookSelfObj.ReadBookingDetailsTestInfo();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickTermsConditions();
        BookSelfObj.ReadTermsConditions();
        BookSelfObj.ClickTermsConditionsOK();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickEditOrderSummary_ContactDetails();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember_Name(dataList.get(38));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember_Edit();
        BookSelfObj.ClickAddonMember_Update();
        BookSelfObj.ClickAddonMember_Remove();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember_Name(dataList.get(38));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember2_Name(dataList.get(40));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember3_Name(dataList.get(41));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember4_Name(dataList.get(42));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember5_Name(dataList.get(43));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.AddonMemberLimit();
        BookSelfObj.AddonMembercancel();
        BookSelfObj.ReadOrderSummary_TestDetailsName();
        BookSelfObj.ReadOrderSummary_TestDesc();
        BookSelfObj.ReadOrderSummary_TestType();
        BookSelfObj.ReadOrderSummary_ContactDetailsName();
        BookSelfObj.ReadOrderSummary_ContactDetailsNumber();
        BookSelfObj.ReadAddonMembers1Name();
        BookSelfObj.ReadAddonMembers1Age();
        BookSelfObj.ReadAddonMembers1Gender();
        BookSelfObj.ReadAddonMembers2Name();
        BookSelfObj.ReadAddonMembers3Name();
        BookSelfObj.ReadAddonMembers4Name();
        BookSelfObj.ReadOrderSummary_ContactDetailsAddress();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTestName();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTestCharge();
        BookSelfObj.ReadOrderSummary_PaymentDetailsShippingName();
        BookSelfObj.ReadOrderSummary_PaymentDetailsShippingCharge();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTaxCharge();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ReadPaymentDetailsName();
        BookSelfObj.ReadPaymentDetailsAmount();
        BookSelfObj.ReadPaymentDetailsAddress();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.ReadPaymentGatewayTestName();
        BookSelfObj.ReadPaymentGatewayTestCharge();
        BookSelfObj.ReadPaymentGateway_Email(dataList.get(44));
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(45));
        BookSelfObj.ClickPaymentGateway_CardEXP();
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CardDetails();
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(48));
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(46));
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CardEXP();
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(52));
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(47));
        BookSelfObj.ClickPaymentGateway_Name();
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CVC();
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(53));
        BookSelfObj.SetPaymentGateway_Name(dataList.get(54));
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_SelfTest_MicrobiomeTest() throws InterruptedException, IOException {
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookSelfObj.ClickBookATest();
        BookSelfObj.ReadTest_Info();

        //SelfTest-Microbiome
        BookSelfObj.ReadMicrobiomeTestName();
        BookSelfObj.ReadMicrobiomeTestDesc();
        BookSelfObj.ClickMicrobiomeTest();
        BookSelfObj.ReadBookingDetailsFirstName();
        BookSelfObj.ReadBookingDetailslastName();
        BookSelfObj.ReadBookingDetailsGender();
        BookSelfObj.ReadBookingDetailsDOB();
        BookSelfObj.ReadBookingDetailsMobile();
        BookSelfObj.ReadBookingDetailsAddress();
        BookSelfObj.ReadBookingDetailsTestInfo();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickTermsConditions();
        BookSelfObj.ReadTermsConditions();
        BookSelfObj.ClickTermsConditionsOK();
        BookSelfObj.ClickTermsConditionsCheckBox();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickEditOrderSummary_ContactDetails();
        BookSelfObj.ClickBookingDetails_BookNow();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember_Name(dataList.get(38));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember_Edit();
        BookSelfObj.ClickAddonMember_Update();
        BookSelfObj.ClickAddonMember_Remove();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember_Name(dataList.get(38));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember2_Name(dataList.get(40));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember3_Name(dataList.get(41));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember4_Name(dataList.get(42));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.ClickAddonMember();
        BookSelfObj.SetAddonMember5_Name(dataList.get(43));
        BookSelfObj.SetAddonMember_Age(dataList.get(39));
        BookSelfObj.SetAddonMember_Gender();
        BookSelfObj.ClickAddonMember_Add();
        BookSelfObj.AddonMemberLimit();
        BookSelfObj.AddonMembercancel();
        BookSelfObj.ReadOrderSummary_TestDetailsName();
        BookSelfObj.ReadOrderSummary_TestDesc();
        BookSelfObj.ReadOrderSummary_TestType();
        BookSelfObj.ReadOrderSummary_ContactDetailsName();
        BookSelfObj.ReadOrderSummary_ContactDetailsNumber();
        BookSelfObj.ReadAddonMembers1Name();
        BookSelfObj.ReadAddonMembers1Age();
        BookSelfObj.ReadAddonMembers1Gender();
        BookSelfObj.ReadAddonMembers2Name();
        BookSelfObj.ReadAddonMembers3Name();
        BookSelfObj.ReadAddonMembers4Name();
        BookSelfObj.ReadOrderSummary_ContactDetailsAddress();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTestName();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTestCharge();
        BookSelfObj.ReadOrderSummary_PaymentDetailsShippingName();
        BookSelfObj.ReadOrderSummary_PaymentDetailsShippingCharge();
        BookSelfObj.ReadOrderSummary_PaymentDetailsTaxCharge();
        BookSelfObj.ClickOrderSummary_Proceed();
        BookSelfObj.ReadPaymentDetailsName();
        BookSelfObj.ReadPaymentDetailsAmount();
        BookSelfObj.ReadPaymentDetailsAddress();
        BookSelfObj.ClickPaymentDetails_Proceed();
        BookSelfObj.ReadPaymentGatewayTestName();
        BookSelfObj.ReadPaymentGatewayTestCharge();
        BookSelfObj.ReadPaymentGateway_Email(dataList.get(44));
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(45));
        BookSelfObj.ClickPaymentGateway_CardEXP();
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CardDetails();
        BookSelfObj.SetPaymentGateway_CardNumber(dataList.get(48));
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(46));
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CardEXP();
        BookSelfObj.SetPaymentGateway_CardEXP(dataList.get(52));
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(47));
        BookSelfObj.ClickPaymentGateway_Name();
        BookSelfObj.ReadPaymentGateway_Alert();
        BookSelfObj.ClearPaymentGateway_CVC();
        BookSelfObj.SetPaymentGateway_CVC(dataList.get(53));
        BookSelfObj.SetPaymentGateway_Name(dataList.get(54));
        BookSelfObj.SetPaymentGateway_BillCountry();
        BookSelfObj.ClickPaymentGateway_Pay();
        BookSelfObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_InHomeTest_COVID19PCRTest() throws InterruptedException, IOException {
        BookATestPageObjects BookHomeObj = new BookATestPageObjects(driver);

        BookHomeObj.ClickBookATest();
        BookHomeObj.ClickHomeTest();
        BookHomeObj.ReadTest_Info();

        //HomeTest-Covid19 PCR
        BookHomeObj.ReadCovid19PCRTestName();
        BookHomeObj.ReadCovid19PCRTestDesc();
        BookHomeObj.ClickCovid19PCRTest();
        BookHomeObj.ReadBookingDetailsFirstName();
        BookHomeObj.ReadBookingDetailslastName();
        BookHomeObj.ReadBookingDetailsGender();
        BookHomeObj.ReadBookingDetailsDOB();
        BookHomeObj.ReadBookingDetailsMobile();
        BookHomeObj.ReadBookingDetailsAddress();
        BookHomeObj.ReadBookingDetailsTestInfo();
        BookHomeObj.ClickBookingDetails_BookNow();
        BookHomeObj.ClickTermsConditions();
        BookHomeObj.ReadTermsConditions();
        BookHomeObj.ClickTermsConditionsOK();
        BookHomeObj.ClickTermsConditionsCheckBox();

        BookHomeObj.ClickHomeTestSchedule();
        BookHomeObj.ClickHomeTestScheduleNextDay();
        BookHomeObj.ClickHomeTestScheduleNextDayEve();
        BookHomeObj.ClickHomeTestScheduleNextDayEveTime();
        BookHomeObj.ClickHomeTestScheduleProceed();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember_Name(dataList.get(38));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember_Edit();
        BookHomeObj.ClickAddonMember_Update();
        BookHomeObj.ClickAddonMember_Remove();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember_Name(dataList.get(38));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember2_Name(dataList.get(40));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember3_Name(dataList.get(41));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember4_Name(dataList.get(42));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember5_Name(dataList.get(43));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.AddonMemberLimit();
        BookHomeObj.AddonMembercancel();
        BookHomeObj.ReadOrderSummary_TestDetailsName();
        BookHomeObj.ReadOrderSummary_TestDesc();
        BookHomeObj.ReadOrderSummary_TestType();
        BookHomeObj.ReadScheduledDate();
        BookHomeObj.ReadOrderSummary_ContactDetailsName();
        BookHomeObj.ReadOrderSummary_ContactDetailsNumber();
        BookHomeObj.ReadAddonMembers1Name();
        BookHomeObj.ReadAddonMembers1Age();
        BookHomeObj.ReadAddonMembers1Gender();
        BookHomeObj.ReadAddonMembers2Name();
        BookHomeObj.ReadAddonMembers3Name();
        BookHomeObj.ReadAddonMembers4Name();
        BookHomeObj.ReadOrderSummary_ContactDetailsAddress();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTestName();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTestCharge();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTaxCharge();
        BookHomeObj.ClickOrderSummary_Proceed();
        BookHomeObj.ReadPaymentDetailsName();
        BookHomeObj.ReadPaymentDetailsAmount();
        BookHomeObj.ReadPaymentDetailsAddress();
        BookHomeObj.ClickPaymentDetails_Proceed();
        BookHomeObj.ReadPaymentGatewayTestName();
        BookHomeObj.ReadPaymentGatewayTestCharge();
        BookHomeObj.ReadPaymentGateway_Email(dataList.get(44));
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(45));
        BookHomeObj.ClickPaymentGateway_CardEXP();
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CardDetails();
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(48));
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(46));
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CardEXP();
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(52));
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(47));
        BookHomeObj.ClickPaymentGateway_Name();
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CVC();
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(53));
        BookHomeObj.SetPaymentGateway_Name(dataList.get(54));
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_InHomeTest_COVID19AntibodyTest() throws InterruptedException, IOException {
        BookATestPageObjects BookHomeObj = new BookATestPageObjects(driver);

        BookHomeObj.ClickBookATest();
        BookHomeObj.ClickHomeTest();
        BookHomeObj.ReadTest_Info();

        //HomeTest-Covid19 Antibody
        BookHomeObj.ReadCovid19AntibodyTestName();
        BookHomeObj.ReadCovid19AntibodyTestDesc();
        BookHomeObj.ClickCovid19AntibodyTest();
        BookHomeObj.ReadBookingDetailsFirstName();
        BookHomeObj.ReadBookingDetailslastName();
        BookHomeObj.ReadBookingDetailsGender();
        BookHomeObj.ReadBookingDetailsDOB();
        BookHomeObj.ReadBookingDetailsMobile();
        BookHomeObj.ReadBookingDetailsAddress();
        BookHomeObj.ReadBookingDetailsTestInfo();
        BookHomeObj.ClickBookingDetails_BookNow();
        BookHomeObj.ClickTermsConditions();
        BookHomeObj.ReadTermsConditions();
        BookHomeObj.ClickTermsConditionsOK();
        BookHomeObj.ClickTermsConditionsCheckBox();

        BookHomeObj.ClickHomeTestSchedule();
        BookHomeObj.ClickHomeTestScheduleNextDay();
        BookHomeObj.ClickHomeTestScheduleNextDayEve();
        BookHomeObj.ClickHomeTestScheduleNextDayEveTime();
        BookHomeObj.ClickHomeTestScheduleProceed();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember_Name(dataList.get(57));
        BookHomeObj.SetAddonMember_Age(dataList.get(58));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember_Edit();
        BookHomeObj.ClickAddonMember_Update();
        BookHomeObj.ClickAddonMember_Remove();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember_Name(dataList.get(38));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember_Edit();
        BookHomeObj.ClickAddonMember_Update();
        BookHomeObj.ClickAddonMember_Remove();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember_Name(dataList.get(38));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember2_Name(dataList.get(40));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember3_Name(dataList.get(41));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember4_Name(dataList.get(42));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember5_Name(dataList.get(43));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.AddonMemberLimit();
        BookHomeObj.AddonMembercancel();
        BookHomeObj.ReadOrderSummary_TestDetailsName();
        BookHomeObj.ReadOrderSummary_TestDesc();
        BookHomeObj.ReadOrderSummary_TestType();
        BookHomeObj.ReadScheduledDate();
        BookHomeObj.ReadOrderSummary_ContactDetailsName();
        BookHomeObj.ReadOrderSummary_ContactDetailsNumber();
        BookHomeObj.ReadAddonMembers1Name();
        BookHomeObj.ReadAddonMembers1Age();
        BookHomeObj.ReadAddonMembers1Gender();
        BookHomeObj.ReadAddonMembers2Name();
        BookHomeObj.ReadAddonMembers3Name();
        BookHomeObj.ReadAddonMembers4Name();
        BookHomeObj.ReadOrderSummary_ContactDetailsAddress();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTestName();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTestCharge();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTaxCharge();
        BookHomeObj.ClickOrderSummary_Proceed();
        BookHomeObj.ReadPaymentDetailsName();
        BookHomeObj.ReadPaymentDetailsAmount();
        BookHomeObj.ReadPaymentDetailsAddress();
        BookHomeObj.ClickPaymentDetails_Proceed();
        BookHomeObj.ReadPaymentGatewayTestName();
        BookHomeObj.ReadPaymentGatewayTestCharge();
        BookHomeObj.ReadPaymentGateway_Email(dataList.get(44));
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(45));
        BookHomeObj.ClickPaymentGateway_CardEXP();
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CardDetails();
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(48));
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(46));
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CardEXP();
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(52));
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(47));
        BookHomeObj.ClickPaymentGateway_Name();
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CVC();
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(53));
        BookHomeObj.SetPaymentGateway_Name(dataList.get(54));
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_InHomeTest_RPPTest() throws InterruptedException, IOException {
        BookATestPageObjects BookHomeObj = new BookATestPageObjects(driver);

        BookHomeObj.ClickBookATest();
        BookHomeObj.ClickHomeTest();
        BookHomeObj.ReadTest_Info();

        //HomeTest-RPP
        BookHomeObj.ReadRPPTestName();
        BookHomeObj.ReadRPPTestDesc();
        BookHomeObj.ClickRPPTest();
        BookHomeObj.ReadBookingDetailsFirstName();
        BookHomeObj.ReadBookingDetailslastName();
        BookHomeObj.ReadBookingDetailsGender();
        BookHomeObj.ReadBookingDetailsDOB();
        BookHomeObj.ReadBookingDetailsMobile();
        BookHomeObj.ReadBookingDetailsAddress();
        BookHomeObj.ReadBookingDetailsTestInfo();
        BookHomeObj.ClickBookingDetails_BookNow();
        BookHomeObj.ClickTermsConditions();
        BookHomeObj.ReadTermsConditions();
        BookHomeObj.ClickTermsConditionsOK();
        BookHomeObj.ClickTermsConditionsCheckBox();

        BookHomeObj.ClickHomeTestSchedule();
        BookHomeObj.ClickHomeTestScheduleNextDay();
        BookHomeObj.ClickHomeTestScheduleNextDayEve();
        BookHomeObj.ClickHomeTestScheduleNextDayEveTime();
        BookHomeObj.ClickHomeTestScheduleProceed();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember_Name(dataList.get(38));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember_Edit();
        BookHomeObj.ClickAddonMember_Update();
        BookHomeObj.ClickAddonMember_Remove();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember_Name(dataList.get(38));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember2_Name(dataList.get(40));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember3_Name(dataList.get(41));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember4_Name(dataList.get(42));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember5_Name(dataList.get(43));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.AddonMemberLimit();
        BookHomeObj.AddonMembercancel();
        BookHomeObj.ReadOrderSummary_TestDetailsName();
        BookHomeObj.ReadOrderSummary_TestDesc();
        BookHomeObj.ReadOrderSummary_TestType();
        BookHomeObj.ReadScheduledDate();
        BookHomeObj.ReadOrderSummary_ContactDetailsName();
        BookHomeObj.ReadOrderSummary_ContactDetailsNumber();
        BookHomeObj.ReadAddonMembers1Name();
        BookHomeObj.ReadAddonMembers1Age();
        BookHomeObj.ReadAddonMembers1Gender();
        BookHomeObj.ReadAddonMembers2Name();
        BookHomeObj.ReadAddonMembers3Name();
        BookHomeObj.ReadAddonMembers4Name();
        BookHomeObj.ReadOrderSummary_ContactDetailsAddress();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTestName();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTestCharge();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTaxCharge();
        BookHomeObj.ClickOrderSummary_Proceed();
        BookHomeObj.ReadPaymentDetailsName();
        BookHomeObj.ReadPaymentDetailsAmount();
        BookHomeObj.ReadPaymentDetailsAddress();
        BookHomeObj.ClickPaymentDetails_Proceed();
        BookHomeObj.ReadPaymentGatewayTestName();
        BookHomeObj.ReadPaymentGatewayTestCharge();
        BookHomeObj.ReadPaymentGateway_Email(dataList.get(44));
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(45));
        BookHomeObj.ClickPaymentGateway_CardEXP();
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CardDetails();
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(48));
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(46));
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CardEXP();
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(52));
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(47));
        BookHomeObj.ClickPaymentGateway_Name();
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CVC();
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(53));
        BookHomeObj.SetPaymentGateway_Name(dataList.get(54));
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public void BookA_InHomeTest_MicrobiomeTest() throws InterruptedException, IOException {
        BookATestPageObjects BookHomeObj = new BookATestPageObjects(driver);
        BookATestPageObjects BookSelfObj = new BookATestPageObjects(driver);

        BookHomeObj.ClickBookATest();
        BookHomeObj.ClickHomeTest();
        BookHomeObj.ReadTest_Info();

        //HomeTest-Microbiome
        BookHomeObj.ReadMicrobiomeTestName();
        BookHomeObj.ReadMicrobiomeTestDesc();
        BookHomeObj.ClickMicrobiomeTest();
        BookHomeObj.ReadBookingDetailsFirstName();
        BookHomeObj.ReadBookingDetailslastName();
        BookHomeObj.ReadBookingDetailsGender();
        BookHomeObj.ReadBookingDetailsDOB();
        BookHomeObj.ReadBookingDetailsMobile();
        BookHomeObj.ReadBookingDetailsAddress();
        BookHomeObj.ReadBookingDetailsTestInfo();
        BookHomeObj.ClickBookingDetails_BookNow();
        BookHomeObj.ClickTermsConditions();
        BookHomeObj.ReadTermsConditions();
        BookHomeObj.ClickTermsConditionsOK();
        BookHomeObj.ClickTermsConditionsCheckBox();

        BookHomeObj.ClickHomeTestSchedule();
        BookHomeObj.ClickHomeTestScheduleNextDay();
        BookHomeObj.ClickHomeTestScheduleNextDayEve();
        BookHomeObj.ClickHomeTestScheduleNextDayEveTime();
        BookHomeObj.ClickHomeTestScheduleProceed();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember_Name(dataList.get(38));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember_Edit();
        BookHomeObj.ClickAddonMember_Update();
        BookHomeObj.ClickAddonMember_Remove();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember_Name(dataList.get(38));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember2_Name(dataList.get(40));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember3_Name(dataList.get(41));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember4_Name(dataList.get(42));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.ClickAddonMember();
        BookHomeObj.SetAddonMember5_Name(dataList.get(43));
        BookHomeObj.SetAddonMember_Age(dataList.get(39));
        BookHomeObj.SetAddonMember_Gender();
        BookHomeObj.ClickAddonMember_Add();
        BookHomeObj.AddonMemberLimit();
        BookHomeObj.AddonMembercancel();
        BookHomeObj.ReadOrderSummary_TestDetailsName();
        BookHomeObj.ReadOrderSummary_TestDesc();
        BookHomeObj.ReadOrderSummary_TestType();
        BookHomeObj.ReadScheduledDate();
        BookHomeObj.ReadOrderSummary_ContactDetailsName();
        BookHomeObj.ReadOrderSummary_ContactDetailsNumber();
        BookHomeObj.ReadAddonMembers1Name();
        BookHomeObj.ReadAddonMembers1Age();
        BookHomeObj.ReadAddonMembers1Gender();
        BookHomeObj.ReadAddonMembers2Name();
        BookHomeObj.ReadAddonMembers3Name();
        BookHomeObj.ReadAddonMembers4Name();
        BookHomeObj.ReadOrderSummary_ContactDetailsAddress();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTestName();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTestCharge();
        BookHomeObj.ReadOrderSummary_PaymentDetailsTaxCharge();
        BookHomeObj.ClickOrderSummary_Proceed();
        BookHomeObj.ReadPaymentDetailsName();
        BookHomeObj.ReadPaymentDetailsAmount();
        BookHomeObj.ReadPaymentDetailsAddress();
        BookHomeObj.ClickPaymentDetails_Proceed();
        BookHomeObj.ReadPaymentGatewayTestName();
        BookHomeObj.ReadPaymentGatewayTestCharge();
        BookHomeObj.ReadPaymentGateway_Email(dataList.get(44));
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(45));
        BookHomeObj.ClickPaymentGateway_CardEXP();
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CardDetails();
        BookHomeObj.SetPaymentGateway_CardNumber(dataList.get(48));
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(46));
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CardEXP();
        BookHomeObj.SetPaymentGateway_CardEXP(dataList.get(52));
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(47));
        BookHomeObj.ClickPaymentGateway_Name();
        BookHomeObj.ReadPaymentGateway_Alert();
        BookHomeObj.ClearPaymentGateway_CVC();
        BookHomeObj.SetPaymentGateway_CVC(dataList.get(53));
        BookHomeObj.SetPaymentGateway_Name(dataList.get(54));
        BookHomeObj.SetPaymentGateway_BillCountry();
        BookHomeObj.ClickPaymentGateway_Pay();
        BookHomeObj.ReadTestOrderStatus();
    }

    @Test
    public void Test_Orders_Info() throws InterruptedException, IOException {
        TestOrdersInfoPageObjects infObj = new TestOrdersInfoPageObjects(driver);

        infObj.clickMenu();
        infObj.clickTestOrders();
        infObj.verifyTestOrdersTitle();
        infObj.verifyTestOrders();
    }

    @Test
    public void Test_Orders_Status() throws InterruptedException, IOException {
        TestOrderStatusPageObjects statusObj = new TestOrderStatusPageObjects(driver);

        statusObj.gotoTestOrders();
        statusObj.verifyOrderStatus("Pending", "Approved", "InProgress", "Completed", "Rejected", "Refunded");
    }

    @Test
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

    @Test
    public void Lab_Results() throws InterruptedException, IOException {
        LabResultsPageObjects labObj = new LabResultsPageObjects(driver);

        labObj.verifyHeader("Lab Results");
        labObj.verifyLabResultsImage();
        labObj.clickLabResults();
        labObj.verifyInsideHeader("Lab Results");
        labObj.verifyLabResults();
    }

    @Test
    public void Vitals() throws InterruptedException, IOException {
        VitalsPageObjects VitalsObj = new VitalsPageObjects(driver);

        VitalsObj.setVitals_header("Vitals");
        VitalsObj.setVitals_image();
        VitalsObj.setVitals("Vitals");
        VitalsObj.verifyBand("LifeHope Health Band");
        VitalsObj.verifyECG("ECG/EKG", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyHeartRate(dataList.get(57),"Heart Rate (BPM)", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyBodyTemperature(dataList.get(58),"BodyTemperature", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyOxygenLevel(dataList.get(59),"OxygenLevel", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyBloodPressure(dataList.get(60),dataList.get(61),"BloodPressure", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyWeight(dataList.get(61),"Weight", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
        VitalsObj.verifyBloodGlucose(dataList.get(62),"BloodGlucose", "Share Report", "Select Dates", "Start Date", "End Date", "CANCEL", "APPLY FILTER");
    }

    @Test
    public void Home_Screen_UI() throws IOException {
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
    public void Profile_Edit() throws InterruptedException, IOException {
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
    public void Left_Menu() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.clickContactSupport();
//        leftObj.sendMsg("hi");
//        leftObj.sendAttachment();
        leftObj.clickTermsAndConditions();
        leftObj.clickPrivacyPolicy();
        leftObj.Logout();
    }

}
