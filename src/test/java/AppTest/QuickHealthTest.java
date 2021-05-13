package AppTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;


import java.io.IOException;

@Listeners(TestNGListeners.class)
public class QuickHealthTest extends AppTestBase {

    @Test(priority = 1)
    public void MobileNumber_Signup() throws InterruptedException, IOException {
        MobileNumberSignupPageObjects mobileObj = new MobileNumberSignupPageObjects(driver);

        mobileObj.verifyPopup();
        mobileObj.verifyMobileNumber("3800000000");
    }

    @Test(priority = 2)
    public void OTP_Page() throws InterruptedException, IOException {
        OtpPageObjects otpObj = new OtpPageObjects(driver);

        otpObj.setValidOTP(dataList.get(1), dataList.get(2), dataList.get(3), dataList.get(4), dataList.get(5), dataList.get(6));
        //Thread.sleep(10000);
        otpObj.confirmLocation("Allow LifeHope Health to access this device's location?", dataList.get(7));
    }

    @Test(priority = 3, invocationCount = 100)
    public void Quick_Health_Test() throws InterruptedException, IOException {
        QuickHealthTestPageObjects qObj = new QuickHealthTestPageObjects(driver);

//        qObj.verifyQuickTestName("Quick Health Test");
//        qObj.verifyQuickTestLogo();
        qObj.clickQuickTest();
//        qObj.verifyHeader("Quick Health Test");
//        qObj.verifySubTitle("Self Diagnosis");
//        qObj.verifyCoronaName("Coronavirus Symptoms");
//        qObj.verifyCoronaLogo();
        qObj.clickCoronaSymptoms();
//        qObj.verifyTakePhotoPageUI("Take a Photo", "First Name *", "Last Name *", "Gender *", "Age *", "Same as profile info", "NEXT");
        qObj.setProfileInfo(dataList.get(20), dataList.get(21), dataList.get(22), dataList.get(23), dataList.get(24));
//        qObj.verifyQuesPageUI("Coronavirus Symptoms Questionnaire", "Let's check if you have any Coronavirus symptoms", "Total questions: 1 of 13", "Our interactive Coronavirus (COVID-19) self-checker helps you quickly find information about the COVID-19");
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
//        qObj.verifyConcernsUI("Enter your concerns if any:");
        qObj.verifyConcerns("No concern", "SKIP");
//        qObj.verifyDiagnosisResultUI("Diagnosis Result", "Symptom Analysis", "Based on the information provided, we recommend you order a test.", "Symptom Severity", "You have completed your quick health checkup", "Share", "Book a Test");
//        qObj.verifyDiagnosisResult();
        Thread.sleep(2000);
        driver.navigate().back();
//        qObj.verifyDiagnosisHistory("Diagnosis History", "Coronavirus Symptoms", "Coronavirus Symptoms History", "Coronavirus Symptoms");
    }

    @Test(priority = 4)
    public void Logout() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.Logout();
    }

}
