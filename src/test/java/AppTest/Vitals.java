package AppTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AppPages.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class Vitals extends AppTestBase {

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
    public void Vital() throws InterruptedException, IOException {
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

    @Test(priority = 4)
    public void Logout() throws InterruptedException, IOException {
        LeftMenuPageObjects leftObj = new LeftMenuPageObjects(driver);

        leftObj.Logout();
    }

}
