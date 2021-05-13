package AppPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
//import org.graalvm.compiler.hotspot.replacements.CallSiteTargetNode;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import static AppPages.AppTestBase.*;

public class VitalsPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By vitals_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n");
    By vitals_image = By.xpath("(//android.widget.ImageView[@content-desc=\"LifeHope Health\"])[4]\n");
    By vitals = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout\n");
    By band_image = By.id("com.lifehope:id/imageViewVitalImage");
    By band_header = By.id("com.lifehope:id/textViewHeading");
    By band_text = By.id("com.lifehope:id/textViewFitBandText");
    By band_pair = By.id("com.lifehope:id/buttonPairFitBand");
    By close_popup = By.id("com.lifehope:id/imageButtonClose");
    By ECG_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
    By ECG_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By ECG_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    By ECG_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By ECG_Chart = By.id("com.lifehope:id/chart1");
    By chart_inHead = By.id("com.lifehope:id/textViewLabel");
    By chart_back = By.id("com.lifehope:id/imageview_back_arrow");
    By chart_inLogo = By.id("com.lifehope:id/imageViewVitalsImage");
    By chart_date_header = By.id("com.lifehope:id/textViewHeading");
    By chart_Content = By.id("com.lifehope:id/textViewContent");
    By BPM_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
    By BPM_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By BPM_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]\n");
    By BPM_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By BPM_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By BPM_inHead = By.id("com.lifehope:id/textViewLabel");
    By BPM_1day = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"1 Day\"]");
    By BPM_7days = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"7 Days\"]/android.widget.TextView");
    By BPM_15days = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"15 Days\"]/android.widget.TextView");
    By BPM_Custom = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Custom\"]/android.widget.TextView");
    By start_Date = By.id("com.lifehope:id/editTextStartDate");
    By Month_backdate = By.xpath("//android.widget.ImageButton[@content-desc=\"Previous month\"]");
    By Month_date = By.xpath("//android.view.View[@content-desc=\"20 April 2021\"]");
    By Ok_button = By.id("android:id/button1");
    By end_Date = By.id("com.lifehope:id/editTextEndDate");
    By Month1_date = By.xpath("//android.view.View[@content-desc=\"30 April 2021\"]");
    By Ok1_button = By.id("android:id/button1");
    By Filter_btn = By.id("com.lifehope:id/buttonFilter");
    By heartrate_logo = By.id("com.lifehope:id/imageViewVitalsImage");
    By heartrate_time = By.id("com.lifehope:id/textViewHeading");
    By heartrate_chart = By.id("com.lifehope:id/temperatureChart");
    By heartrate_content = By.id("com.lifehope:id/textViewContent");
    By Share_report = By.id("com.lifehope:id/buttonShare");
    By share_copy_link = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView\n");
    //By share_report_copy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout\n");
    By Manual_Feed = By.id("com.lifehope:id/buttonAddVitals");
    //By Manual_Feed = By.id("com.lifehope:id/buttonAddVitals1");
    By date = By.id("com.lifehope:id/textViewDate");
    // By previous_month = By.xpath("//android.widget.ImageButton[@content-desc=\"Previous month\"]");
    By Month_date1 = By.xpath("//android.view.View[@content-desc=\"01 May 2021\"]");
    /* By Month_date2 = By.xpath("//android.view.View[@content-desc=\"02 May 2021\"]");
     By Month_date3 = By.xpath("//android.view.View[@content-desc=\"03 May 2021\"]");
     By Month_date4 = By.xpath("//android.view.View[@content-desc=\"04 May 2021\"]");
     By Month_date5 = By.xpath("//android.view.View[@content-desc=\"05 May 2021\"]");
     By Month_date6 = By.xpath("//android.view.View[@content-desc=\"06 May 2021\"]");
     By Month_date7 = By.xpath("//android.view.View[@content-desc=\"07 May 2021\"]");
     By Month_date8 = By.xpath("//android.view.View[@content-desc=\"08 May 2021\"]");
     By Month_date9 = By.xpath("//android.view.View[@content-desc=\"09 May 2021\"]");
     By Month_date10 = By.xpath("//android.view.View[@content-desc=\"10 May 2021\"]");
     By Month_date11 = By.xpath("//android.view.View[@content-desc=\"11 May 2021\"]");
     By Month_date12 = By.xpath("//android.view.View[@content-desc=\"12 May 2021\"]");
     By Month_date13 = By.xpath("//android.view.View[@content-desc=\"13 May 2021\"]");
     By Month_date14 = By.xpath("//android.view.View[@content-desc=\"14 May 2021\"]");
     By Month_date15 = By.xpath("//android.view.View[@content-desc=\"15 May 2021\"]");
     By Month_date16 = By.xpath("//android.view.View[@content-desc=\"16 May 2021\"]");
     By Month_date17 = By.xpath("//android.view.View[@content-desc=\"17 May 2021\"]");
     By Month_date18 = By.xpath("//android.view.View[@content-desc=\"18 May 2021\"]");
     By Month_date19 = By.xpath("//android.view.View[@content-desc=\"19 May 2021\"]");
     By Month_date20 = By.xpath("//android.view.View[@content-desc=\"20 May 2021\"]");
     By Month_date21 = By.xpath("//android.view.View[@content-desc=\"21 May 2021\"]");
     By Month_date22 = By.xpath("//android.view.View[@content-desc=\"22 May 2021\"]");
     By Month_date23 = By.xpath("//android.view.View[@content-desc=\"23 May 2021\"]");
     By Month_date24= By.xpath("//android.view.View[@content-desc=\"24 May 2021\"]");
     By Month_date25= By.xpath("//android.view.View[@content-desc=\"25 May 2021\"]");
     By Month_date26 = By.xpath("//android.view.View[@content-desc=\"26 May 2021\"]");
     By Month_date27= By.xpath("//android.view.View[@content-desc=\"27 May 2021\"]");
     By Month_date28= By.xpath("//android.view.View[@content-desc=\"28 May 2021\"]");
     By Month_date29= By.xpath("//android.view.View[@content-desc=\"29 May 2021\"]");
       By Month_date30= By.xpath("//android.view.View[@content-desc=\"30 May 2021\"]");
       By Month_date31= By.xpath("//android.view.View[@content-desc=\"31 May 2021\"]");*/
    By Ok_button1 = By.id("android:id/button1");
    By time = By.id("com.lifehope:id/textViewTime");
    By hours = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"2\"]");
    By minutesclick = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"5\"]");
    By Ok_button2 = By.id("android:id/button1");
    By heartrate = By.id("com.lifehope:id/editTextHeartRate");
    By add = By.id("com.lifehope:id/buttonAddVitals");
    By back_btn = By.id("com.lifehope:id/imageview_back_arrow");
    By body_temp_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
    By body_temp_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By body_temp_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    By body_temp_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By body_temp_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By body_temp_inHead = By.id("com.lifehope:id/textViewLabel");
    By bodytemperature = By.id("com.lifehope:id/editTextBodyTemperature");
    By oxygen_level_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
    By oxygen_level_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By oxygen_leveltime = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    By oxygen_level_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By oxygen_level_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By oxygen_level_inHead = By.id("com.lifehope:id/textViewLabel");
    By oxygenlevel = By.id("com.lifehope:id/editTextOxygenLevel");
    By oxygenlevel_chart = By.id("com.lifehope:id/oxygenChart");
    By Blood_Pressure_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
    By Blood_Pressure_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By Blood_Pressure_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    By Blood_Pressurevalue = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By Blood_Pressurearrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By Blood_PressureinHead = By.id("com.lifehope:id/textViewLabel");
    By BloodPressure_systolic = By.id("com.lifehope:id/editTextSystolic");
    By BloodPressure_Diastolic = By.id("com.lifehope:id/editTextDiastolic");
    By BloodPressure_chart = By.id("com.lifehope:id/bloodPressureChart");
    By Weight_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
    By Weight_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By Weight_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    By Weight_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By Weight_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By Weight_inHead = By.id("com.lifehope:id/textViewLabel");
    By Weight = By.id("com.lifehope:id/editTextWeight");
    By Weight_chart = By.id("com.lifehope:id/temperatureChart");
    By Blood_Glucose_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
    By Blood_Glucose_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By Blood_Glucose_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
    By Blood_Glucose_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By Blood_Glucose_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By Blood_Glucose_inHead = By.id("com.lifehope:id/textViewLabel");
    By Blood_Glucose_mealtype = By.id("android:id/text1");
    By Blood_Glucose_fasting = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
    By Blood_Glucose = By.id("com.lifehope:id/editTextGlucose");
    By Blood_Glucose_chart = By.id("com.lifehope:id/bloodGlucoseChart");
    By Blood_Glucose_details = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");


    public VitalsPageObjects(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }


    public void setVitals_header(String H) throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to verify the Vitals module text");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(vitals_header)).isDisplayed();
            Thread.sleep(5000);
            String Header = driver.findElement(vitals_header).getText();
            //System.out.println(Header);
            if (Header.contains(H)) {
                test18.log(LogStatus.PASS, "Header text shown as per the requirement : " + Header);
            } else {
                test18.log(LogStatus.FAIL, "Header text not shown as per the requirement : " + Header);
                getScreenshot("Vitals_UI_HeaderText");
            }
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Vitals header not visible");
            getScreenshot("Vital_Header");
        }
    }

    public void setVitals_image() throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to verify the Vitals module logo");
        try {
            WebElement e1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(vitals_image));
            if (e1.isDisplayed()) {
                test18.log(LogStatus.PASS, "vitals image shown as per the requirement");
            } else {
                test18.log(LogStatus.FAIL, "vitals_image image not shown as per the requirement");
                getScreenshot("vitals_UI_Image");
            }
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Vitals image not visible");
            getScreenshot("Vital_Image");
        }
    }

    public void setVitals(String H) throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to click the Vitals");
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, 10);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(vitals)).isDisplayed();
//            WebElement element = new WebDriverWait(driver, 20)
//                    .until(driver -> driver.findElement(vitals));
//            String Header = element.getText();
//            //System.out.println(Header);
//            if (Header.contains(H)) {
//                AppTestBase.test17.log(LogStatus.PASS, "Header text shown as per the requirement");
//            } else {
//                AppTestBase.test17.log(LogStatus.FAIL, "Header text not shown as per the requirement");
//                getScreenshot("Vit_UI_HeaderText");
//            }
//        } catch (NoSuchElementException | TimeoutException e) {
//            AppTestBase.test17.log(LogStatus.FAIL, "Header text not visible");
//            getScreenshot("Vit_UI_HeaderText");
//        }
        try {
            WebElement e1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(vitals));
            e1.click();
            test18.log(LogStatus.PASS, "Vitals module clicked");
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Vitals module not visible");
            getScreenshot("Vital_Module");
        }
    }

    public void verifyBand(String H) throws IOException, InterruptedException {
        test18.log(LogStatus.INFO, "Ready to verify the band popup screen");
        Thread.sleep(2000);
        try {
            WebElement e1 = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(band_image));
            if (e1.isDisplayed()) {
                test18.log(LogStatus.PASS, "LifeHope Health Band Image is visible");
            } else {
                test18.log(LogStatus.FAIL, "LifeHope Health Band Image is not visible");
                getScreenshot("Vital_BandImage");
            }
            WebElement e2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(band_header));
            String h = e2.getText();
            if (h.equals(H)) {
                test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h);
            } else {
                test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h);
                getScreenshot("Vital_BandHeader");
            }
            WebElement e3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(band_text));
            String h1 = e3.getText();
            if (h1.equals("null") || h1.isEmpty()) {
                test18.log(LogStatus.FAIL, "Band Content not shown as per the requirement : " + h1);
                getScreenshot("Vital_BandContent");
            } else {
                test18.log(LogStatus.PASS, "Band Content shown as per the requirement : " + h1);
            }
            WebElement e4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(close_popup));
            //driver.findElement(band_pair).click();
            e4.click();
            test18.log(LogStatus.SKIP, "Pair fit band button clicked");
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.PASS, "Pair Fit Band button is not clicked");
        }
    }

    public void verifyECG(String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException {
        test18.log(LogStatus.INFO, "Ready to verify the ECG");
        try {
            Thread.sleep(5000);
            {
                WebElement e1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(ECG_logo));
                if (e1.isDisplayed()) {
                    test18.log(LogStatus.PASS, "ECG logo is visible");
                } else {
                    test18.log(LogStatus.FAIL, "ECG logo is not visible");
                    getScreenshot("Vital_ECGLogo");
                }
                WebElement e2 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(ECG_header));
                String h = e2.getText();
                if (h.equals(H)) {
                    test18.log(LogStatus.PASS, "ECG - Header text shown as per the requirement : " + h);
                } else {
                    test18.log(LogStatus.FAIL, "ECG - Header text not shown as per the requirement : " + h);
                    getScreenshot("Vital_ECGHeader");
                }
                WebElement e3 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(ECG_time));
                String h1 = e3.getText();
                if (h1.equals("null") || h1.isEmpty()) {
                    test18.log(LogStatus.FAIL, "ECG - Date and Time not shown as per the requirement : " + h1);
                    getScreenshot("Vital_ECGTime");
                } else {
                    test18.log(LogStatus.PASS, "ECG - Date and Time shown as per the requirement : " + h1);
                }
                try {
                    WebElement e4 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(ECG_arrow));
                    e4.click();
                    test18.log(LogStatus.PASS, "ECG - Arrow icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "ECG - Arrow icon not visible");
                    getScreenshot("Vitals_ECGArrow");
                }
                try {
                    WebElement e5 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(chart_inHead));
                    String h2 = e5.getText();
                    if (h2.contains(H)) {
                        test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                    } else {
                        test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                        getScreenshot("Vital_ECGInHeader");
                    }
                    WebElement e6 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_inLogo));
                    if (e6.isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_ECGInLogo");
                    }
                    WebElement e7 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_date_header));
                    String h3 = e7.getText();
                    if (h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Dates not shown as per the requirement : " + h3);
                        getScreenshot("Vital_ECGTime");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Dates shown as per the requirement : " + h3);
                    }
                    WebElement e8 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(ECG_Chart));
                    if (e8.isDisplayed()) {
                        test18.log(LogStatus.PASS, "ECG - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "ECG - Chart is not visible");
                        getScreenshot("Vital_ECGChart");
                    }
                    Thread.sleep(2000);
                    Dimension dimension = driver.manage().window().getSize();
                    int scrollStart = (int) (dimension.getHeight() * 0.5);
                    int scrollEnd = (int) (dimension.getHeight() * 0.2);
                    new TouchAction((PerformsTouchActions) driver)
                            .press(PointOption.point(0, scrollStart))
                            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                            .moveTo(PointOption.point(0, scrollEnd))
                            .release().perform();
                    WebElement e9 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_Content));
                    String h4 = e9.getText();
                    if (h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_ECGContent");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    /*try {
                        Thread.sleep(2000);
                        driver.findElement(chart_Filter).click();
                        test18.log(LogStatus.PASS, "ECG - Filter icon clicked");
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "ECG- Filter option is not visible");
                        getScreenshot("Vitals_ECGFilter");
                    }*/
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "ECG chart data is not visible");
                    getScreenshot("Vitals_ECGChartData");
                }
                Thread.sleep(2000);
                driver.findElement(chart_back).click();
                test18.log(LogStatus.PASS, "ECG Chart - Clicked the back icon");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test18.log(LogStatus.FAIL, "ECG is not visible");
            getScreenshot("Vitals_ECG");
        }
    }

    public void verifyHeartRate(String D, String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException, InterruptedException {

        test18.log(LogStatus.INFO, "Ready to verify the Heart Rate (BPM)");
        try {
            Thread.sleep(2000);
            WebElement e1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(BPM_logo));
            if (e1.isDisplayed()) {
                test18.log(LogStatus.PASS, "BPM logo is visible");
            } else {
                test18.log(LogStatus.FAIL, "BPM logo is not visible");
                getScreenshot("Vital_BPMLogo");
            }
            WebElement e2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(BPM_header));
            String h = e2.getText();
            if (h.equals(H)) {
                test18.log(LogStatus.PASS, "BPM - Header text shown as per the requirement : " + h);
            } else {
                test18.log(LogStatus.FAIL, "BPM - Header text not shown as per the requirement : " + h);
                getScreenshot("Vital_BPMHeader");
            }
            WebElement e3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(BPM_time));
            String h1 = e3.getText();
            if (h1.equals("null") || h1.isEmpty()) {
                test18.log(LogStatus.SKIP, "BPM - Date and Time not shown as per the requirement : " + h1);
                getScreenshot("Vital_BPMTime");
            } else {
                test18.log(LogStatus.PASS, "BPM - Date and Time shown as per the requirement : " + h1);
            }
            WebElement e4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(BPM_value));
            String v = e4.getText();
            if (v.equals("null") || v.isEmpty()) {
                test18.log(LogStatus.SKIP, "BPM - Recent entered value not shown as per the requirement : " + v);
                getScreenshot("Vital_BPMValue");
            } else {
                test18.log(LogStatus.PASS, "BPM - Recent entered value shown as per the requirement : " + v);
            }
            try {
                WebElement e5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(BPM_arrow));
                e5.click();
                test18.log(LogStatus.PASS, "BPM - Arrow icon clicked");
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Arrow icon not visible");
                getScreenshot("Vitals_BPMArrow");
            }
            Thread.sleep(2000);
            try {
                WebElement e6 = new WebDriverWait(driver, 10)
                        .until(driver -> driver.findElement(BPM_inHead));
                String h2 = e6.getText();
                if (h2.contains(H)) {
                    test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                } else {
                    test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                    getScreenshot("Vital_BPMInHeader");
                }
                Thread.sleep(2000);
                Dimension dimension = driver.manage().window().getSize();
                int scrollStart = (int) (dimension.getHeight() * 0.5);
                int scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    WebElement e7 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Manual_Feed));
                    e7.click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
//                    WebElement e8 = new WebDriverWait(driver, 10)
//                            .until(driver -> driver.findElement(date));
//                    e8.click();
//                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
//                    //driver.findElement(previous_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    //Thread.sleep(2000);
//                    WebElement e9 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Month_date1));
//                    e9.click();
//                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
//                    WebElement e10 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button1));
//                    e10.click();
//                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_prev_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e11 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(time));
//                    e11.click();
//                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
//                    WebElement e12 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(hours));
//                    e12.click();
//                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
//                    WebElement e13 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(minutesclick));
//                    e13.click();
//                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
//                    WebElement e14 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button2));
//                    e14.click();
//                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    WebElement e15 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(heartrate));
                    e15.sendKeys(D);
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    WebElement e16 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(add));
                    e16.click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    WebElement e17 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_time));
                    String h11 = e17.getText();
                    if (h11.equals("null") || h11.isEmpty()) {
                        test18.log(LogStatus.FAIL, "BPM - Date and Time not shown as per the requirement : " + h11);
                        getScreenshot("Vital_BPMTime");
                    } else {
                        test18.log(LogStatus.PASS, "BPM - Date and Time shown as per the requirement : " + h11);
                    }
                    WebElement e18 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_value));
                    String v1 = e18.getText();
                    if (v1.equals("null") || v1.isEmpty()) {
                        test18.log(LogStatus.FAIL, "BPM - Recent entered value not shown as per the requirement : " + v1);
                        getScreenshot("Vital_BPMValue");
                    } else {
                        test18.log(LogStatus.PASS, "BPM - Recent entered value shown as per the requirement : " + v1);
                    }
                    try {
                        WebElement e19 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(BPM_arrow));
                        e19.click();
                        test18.log(LogStatus.PASS, "BPM - Arrow icon clicked");
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "BPM - Arrow icon not visible");
                        getScreenshot("Vitals_BPMArrow");
                    }
                    Thread.sleep(2000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
           /* Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date2).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("62");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date3).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("63");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date4).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("64");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }

            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);

            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date5).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("65");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date6).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("66");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date7).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("67");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date8).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("68");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date9).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("69");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date10).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("70");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date11).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("71");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date12).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("72");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date13).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("73");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date14).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("74");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date15).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("75");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date16).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("76");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date17).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("77");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date18).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("78");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date19).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("79");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date20).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("80");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date21).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("81");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date22).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("82");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date23).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("83");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date24).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("84");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date25).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("85");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date26).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("86");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date27).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("87");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date28).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("88");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date29).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("89");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date30).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("90");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
            Thread.sleep(2000);
            dimension = driver.manage().window().getSize();
            scrollStart = (int) (dimension.getHeight() * 0.5);
            scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date31).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                driver.findElement(heartrate).sendKeys("91");
                test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                Thread.sleep(3000);
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }*/
                Thread.sleep(2000);
                try {
                    WebElement e20 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(BPM_1day));
                    e20.click();
                    test18.log(LogStatus.PASS, "BPM - 1 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - 1 day icon not visible");
                    getScreenshot("Vitals_BPM_1day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e21 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_7days));
                    e21.click();
                    test18.log(LogStatus.PASS, "BPM - 7 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - 7 day icon not visible");
                    getScreenshot("Vitals_BPM_7day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e22 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_15days));
                    e22.click();
                    test18.log(LogStatus.PASS, "BPM -15day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - 15 day icon not visible");
                    getScreenshot("Vitals_BPM_15day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e23 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_Custom));
                    e23.click();
                    test18.log(LogStatus.PASS, "BPM_Custom icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM_Custom icon not visible");
                    getScreenshot("Vitals_BPM_Custom");
                }
                Thread.sleep(2000);
                try {
                    WebElement e24 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(start_Date));
                    e24.click();
                    test18.log(LogStatus.PASS, "Date screen shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement");
                    getScreenshot("Vital_BPMDatesHeader");
                }
//                Thread.sleep(2000);
//                try {
//                    driver.findElement(Month_backdate).click();
//                    test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//                } catch (NoSuchElementException e) {
//                    test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                    getScreenshot("Vitals_BPM_Date screen start date text not shown");
//                }
//                Thread.sleep(2000);
//                try {
//                    driver.findElement(Month_date).click();
//                    test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//                } catch (NoSuchElementException e) {
//                    test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                    getScreenshot("Vitals_BPM_Date screen start date text not shown");
//                }
                try {
                    WebElement e25 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok_button));
                    e25.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_BPM_start dates");
                }
                try {
                    WebElement e26 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(end_Date));
                    e26.click();
                    test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button not clicked");
                    getScreenshot("Vitals_BPM_end dates");
                }
//                try {
//                    Thread.sleep(2000);
//                    driver.findElement(Month1_date).click();
//                    test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//                } catch (NoSuchElementException e) {
//                    test18.log(LogStatus.FAIL, "OK Button not clicked");
//                    getScreenshot("Vitals_BPM_end dates");
//                }
                try {
                    WebElement e27 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok1_button));
                    e27.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button not clicked");
                    getScreenshot("Vitals_BPM_start dates");
                }
                try {
                    WebElement e28 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Filter_btn));
                    e28.click();
                    test18.log(LogStatus.PASS, "Add Filter button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Add Filter Button not clicked");
                    getScreenshot("Vitals_BPM_start dates");
                }
                Thread.sleep(2000);
                WebElement e29 = new WebDriverWait(driver, 10)
                        .until(driver -> driver.findElement(chart_inLogo));
                if (e29.isDisplayed()) {
                    test18.log(LogStatus.PASS, "Inside heartrate logo is visible");
                } else {
                    test18.log(LogStatus.FAIL, "Inside heartrate logo is not visible");
                    getScreenshot("Vital_BPMInLogo");
                }
                WebElement e30 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(chart_date_header));
                String h3 = e30.getText();
                if (h3.equals("null") || h3.isEmpty()) {
                    test18.log(LogStatus.FAIL, "Chart - Time not shown as per the requirement : " + h3);
                    getScreenshot("Vital_BPMTime");
                } else {
                    test18.log(LogStatus.PASS, "Chart - TIme shown as per the requirement : " + h3);
                }
                WebElement e31 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(heartrate_chart));
                if (e31.isDisplayed()) {
                    test18.log(LogStatus.PASS, "BPM - Chart is visible");
                } else {
                    test18.log(LogStatus.FAIL, "BPM - Chart is not visible");
                    getScreenshot("Vital_BPMChart");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                WebElement e32 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(chart_Content));
                String h4 = e32.getText();
                if (h4.equals("null") || h4.isEmpty()) {
                    test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                    getScreenshot("Vital_BPMContent");
                } else {
                    test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                }
                Thread.sleep(1000);
                try {
                    WebElement e33 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Share_report));
                    if (e33.isDisplayed()) {
                        String rep = driver.findElement(Share_report).getText();
                        if (rep.equals(S)) {
                            test18.log(LogStatus.PASS, "BPM - Share report button text shown as per the requirement : " + rep);
                        } else {
                            test18.log(LogStatus.FAIL, "BPM - Share report button text not shown as per the requirement : " + rep);
                            getScreenshot("Vital_BPMRepButtonText");
                        }
                        WebElement e34 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(Share_report));
                        e34.click();
                        test18.log(LogStatus.PASS, "BPM - Share button clicked");
                        //Thread.sleep(2000);
                        //driver.findElement(share_copy_link).click();
                        WebElement element1 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(share_copy_link));
                        String link = element1.getText();
                        System.out.println(link);
                        test18.log(LogStatus.INFO, "Share link : " + link);
//                        test18.log(LogStatus.INFO, "Share link ");
//                        Thread.sleep(2000);
//                        driver.findElement(share_report_copy).click();
                        test18.log(LogStatus.PASS, "Share link Copied");
                        driver.navigate().back();
                    } else {
                        test18.log(LogStatus.SKIP, "BPM - Share report option is not visible");
                        getScreenshot("Vitals_BPMShareReport");
                    }
                    try {
                        Thread.sleep(2000);
                        driver.findElement(back_btn).click();
                        test18.log(LogStatus.PASS, "Vitals page is displayed");
                    } catch (NoSuchElementException e){
                        driver.navigate().back();
                        test18.log(LogStatus.SKIP, "Vitals share option is not visible");
                        getScreenshot("Vitals_SharePage");
                    }
                    Thread.sleep(2000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.SKIP, "BPM - Share report option is not visible");
                    getScreenshot("Vitals_BPMShareReport");
                }
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
            getScreenshot("Vitals_BPMFilter");
        }
    }

    public void verifyBodyTemperature(String D, String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException, InterruptedException {

        test18.log(LogStatus.INFO, "Ready to verify the Body Temperature");
        try {
            Thread.sleep(2000);
            WebElement e1 = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(body_temp_logo));
            if (e1.isDisplayed()) {
                test18.log(LogStatus.PASS, "Body Temperature logo is visible");
            } else {
                test18.log(LogStatus.FAIL, "Body Temperature logo is not visible");
                getScreenshot("Vital_BodyTemperature_Logo");
            }
            WebElement e2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(body_temp_header));
            String h = e2.getText();
            if (h.equals(H)) {
                test18.log(LogStatus.PASS, "Body Temperature - Header text shown as per the requirement : " + h);
            } else {
                test18.log(LogStatus.FAIL, "Body Temperature - Header text not shown as per the requirement : " + h);
                getScreenshot("Vital_BodyTemperature_Header");
            }
            WebElement e3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(body_temp_time));
            String h1 = e3.getText();
            if (h1.equals("null") || h1.isEmpty()) {
                test18.log(LogStatus.SKIP, "Body Temperature - Date and Time not shown as per the requirement : " + h1);
                getScreenshot("Vital_Body Temperature_Time");
            } else {
                test18.log(LogStatus.PASS, "Body Temperature - Date and Time shown as per the requirement : " + h1);
            }
            WebElement e4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(body_temp_value));
            String v = e4.getText();
            if (v.equals("null") || v.isEmpty()) {
                test18.log(LogStatus.SKIP, "Body Temperature - Recent entered value not shown as per the requirement : " + v);
                getScreenshot("Vital_Body Temperature_Value");
            } else {
                test18.log(LogStatus.PASS, "Body Temperature - Recent entered value shown as per the requirement : " + v);
            }
            try {
                WebElement e5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(body_temp_arrow));
                e5.click();
                test18.log(LogStatus.PASS, "Body Temperature- Arrow icon clicked");
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Body Temperature - Arrow icon not visible");
                getScreenshot("Vitals_Body Temperature_Arrow");
            }
            Thread.sleep(2000);
            try {
                WebElement e6 = new WebDriverWait(driver, 10)
                        .until(driver -> driver.findElement(body_temp_inHead));
                String h2 = e6.getText();
                if (h2.contains(H)) {
                    test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                } else {
                    test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                    getScreenshot("Vital_Body Temperature_InHeader");
                }
                Thread.sleep(2000);
                Dimension dimension = driver.manage().window().getSize();
                int scrollStart = (int) (dimension.getHeight() * 0.5);
                int scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    WebElement e7 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Manual_Feed));
                    e7.click();
                    test18.log(LogStatus.PASS, "Body Temperature - Manual field icon clicked");
//                    WebElement e8 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(date));
//                    e8.click();
//                    test18.log(LogStatus.PASS, "Body Temperature Filter - Clicked the date field");
//                    //Thread.sleep(2000);
//                    //Thread.sleep(2000);
//                    //driver.findElement(previous_month).click();
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e9 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Month_date1));
//                    e9.click();
//                    test18.log(LogStatus.PASS, "Body Temperature  - Selected the Start date");
//                    WebElement e10 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button1));
//                    e10.click();
//                    test18.log(LogStatus.PASS, "Body Temperature - Clicked the OK button");
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_prev_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e11 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(time));
//                    e11.click();
//                    test18.log(LogStatus.PASS, "Body Temperature  - Selected the time field");
//                    WebElement e12 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(hours));
//                    e12.click();
//                    test18.log(LogStatus.PASS, "Body Temperature - Clicked the hours time");
//                    WebElement e13 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(minutesclick));
//                    e13.click();
//                    test18.log(LogStatus.PASS, "Body Temperature - Clicked the minutes time");
//                    WebElement e14 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button2));
//                    e14.click();
                    test18.log(LogStatus.PASS, "Body Temperature - Clicked the OK button");
                    WebElement e15 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(bodytemperature));
                    e15.sendKeys(D);
                    test18.log(LogStatus.PASS, "Body Temperature - Farenheit  value displayed");
                    WebElement e16 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(add));
                    e16.click();
                    test18.log(LogStatus.PASS, "add button is clicked");
                    Thread.sleep(2000);
                    WebElement e17 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(body_temp_time));
                    String h11 = e17.getText();
                    if (h11.equals("null") || h11.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Body Temperature - Date and Time not shown as per the requirement : " + h11);
                        getScreenshot("Vital_Body Temperature_Time");
                    } else {
                        test18.log(LogStatus.PASS, "Body Temperature - Date and Time shown as per the requirement : " + h11);
                    }
                    WebElement e18 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(body_temp_value));
                    String v1 = e18.getText();
                    if (v1.equals("null") || v1.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Body Temperature - Recent entered value not shown as per the requirement : " + v1);
                        getScreenshot("Vital_Body Temperature_Value");
                    } else {
                        test18.log(LogStatus.PASS, "Body Temperature - Recent entered value shown as per the requirement : " + v1);
                    }
                    try {
                        WebElement e19 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(body_temp_arrow));
                        e19.click();
                        test18.log(LogStatus.PASS, "Body Temperature- Arrow icon clicked");
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "Body Temperature - Arrow icon not visible");
                        getScreenshot("Vitals_Body Temperature_Arrow");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Body Temperature - Filter option is not visible");
                    getScreenshot("VitalsBody Temperature_Filter");
                }
                Thread.sleep(2000);
               /* dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date2).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date3).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date4).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }

                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);

                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date5).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("96");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date6).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("95");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date7).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("94");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date8).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("96");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date9).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("97");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date10).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date11).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date12).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("98");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date13).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("97");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date14).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date15).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date16).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("101");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date17).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("102");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date18).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date19).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("101");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date20).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date21).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date22).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date23).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date24).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date25).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("101");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date26).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date27).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date28).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date29).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date30).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date31).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(bodytemperature).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }*/

                try {
                    WebElement e20 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(BPM_1day));
                    e20.click();
                    test18.log(LogStatus.PASS, "Body Temperature - 1 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Body Temperature - 1 day icon not visible");
                    getScreenshot("Vitals_Body Temperature_1day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e21 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_7days));
                    e21.click();
                    test18.log(LogStatus.PASS, "Body Temperature- 7 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Body Temperature - 7 day icon not visible");
                    getScreenshot("Vitals_Body Temperature_7day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e22 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_15days));
                    e22.click();
                    test18.log(LogStatus.PASS, "Body Temperature -15day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Body Temperature - 15 day icon not visible");
                    getScreenshot("Vitals_Body Temperature_15day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e23 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_Custom));
                    e23.click();
                    test18.log(LogStatus.PASS, "Body Temperature_Custom icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Body Temperature_Custom icon not visible");
                    getScreenshot("Vitals_Body Temperature_Custom");
                }
                try {
                    WebElement e24 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(start_Date));
                    e24.click();
                    test18.log(LogStatus.PASS, "Date screen shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement");
                    getScreenshot("Vital_Body Temperature_DatesHeader");
                }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(Month_backdate).click();
//                test18.log(LogStatus.PASS, "Date screen shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement");
//                getScreenshot("Vital_Body Temperature_DatesHeader");
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(Month_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                getScreenshot("Vitals_Body Temperature_Date screen start date text not shown");
//            }
                try {
                    WebElement e25 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok_button));
                    e25.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_Body Temperature_start dates");
                }
                try {
                    WebElement e26 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(end_Date));
                    e26.click();
                    test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button not clicked");
                    getScreenshot("Vitals_Body Temperature_end dates");
                }
//            try {
//                Thread.sleep(2000);
//                driver.findElement(Month1_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "OK Button not clicked");
//                getScreenshot("Vitals_Body Temperature_end dates");
//            }
                try {
                    WebElement e27 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok1_button));
                    e27.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_Body Temperature_start dates");
                }
                Thread.sleep(500);
                try {
                    WebElement e28 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Filter_btn));
                    e28.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button not clicked");
                    getScreenshot("Vitals_Body Temperature_start dates");
                }
                Thread.sleep(1000);
                try {
                    WebElement e29 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_inLogo));
                    if (e29.isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_Body Temperature_InLogo");
                    }
                    WebElement e30 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_date_header));
                    String h3 = e30.getText();
                    if (h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Time not shown as per the requirement : " + h3);
                        getScreenshot("Vital_Body Temperature_Time");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - TIme shown as per the requirement : " + h3);
                    }
                    WebElement e31 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(heartrate_chart));
                    if (e31.isDisplayed()) {
                        test18.log(LogStatus.PASS, "Body Temperature - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Body Temperature - Chart is not visible");
                        getScreenshot("Vital_Body Temperature_Chart");
                    }
                    Thread.sleep(2000);
                    dimension = driver.manage().window().getSize();
                    scrollStart = (int) (dimension.getHeight() * 0.5);
                    scrollEnd = (int) (dimension.getHeight() * 0.2);
                    new TouchAction((PerformsTouchActions) driver)
                            .press(PointOption.point(0, scrollStart))
                            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                            .moveTo(PointOption.point(0, scrollEnd))
                            .release().perform();
                    Thread.sleep(2000);
                    String h4 = driver.findElement(heartrate_content).getText();
                    if (h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_Body Temperature_Content");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    Thread.sleep(1000);
                    try {
                        WebElement e32 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(Share_report));
                        if (e32.isDisplayed()) {
                            String rep = driver.findElement(Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "BodyTemp - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "BodyTemp - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_BodyTempRepButtonText");
                            }
                            WebElement e34 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(Share_report));
                            e34.click();
                            test18.log(LogStatus.PASS, "BodyTemp - Share button clicked");
                            //Thread.sleep(2000);
                            //driver.findElement(share_copy_link).click();
                            WebElement element1 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(share_copy_link));
                            String link = element1.getText();
                            System.out.println(link);
                            test18.log(LogStatus.INFO, "Share link : " + link);
                            test18.log(LogStatus.PASS, "Share link Copied");
                            driver.navigate().back();
                        } else {
                            test18.log(LogStatus.SKIP, "BodyTemp - Share report option is not visible");
                            getScreenshot("Vitals_BodyTempShareReport");
                        }
                        try {
                            Thread.sleep(2000);
                            driver.findElement(back_btn).click();
                            test18.log(LogStatus.PASS, "Vitals page is displayed");
                        } catch (NoSuchElementException e){
                            driver.navigate().back();
                            test18.log(LogStatus.SKIP, "Vitals share option is not visible");
                            getScreenshot("Vitals_SharePage");
                        }
                        Thread.sleep(2000);
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "Body Temperature - Share report option is not visible");
                        getScreenshot("Vitals_Body Temperature ShareReport");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Body Temperature - Filter option is not visible");
                    getScreenshot("Vitals_Body TemperatureFilter");
                }
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Body Temperature - Filter option is not visible");
                getScreenshot("Vitals_Body Temperature_Filter");
            }
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Body Temperature - Chart is not visible");
            getScreenshot("Vitals_Body Temperature_Chart");
        }
    }

    public void verifyOxygenLevel(String D, String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException, InterruptedException {

        test18.log(LogStatus.INFO, "Ready to verify the Heart Rate (BPM)");
        Thread.sleep(2000);
        try {
            WebElement e1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(oxygen_level_logo));
            if (e1.isDisplayed()) {
                test18.log(LogStatus.PASS, "oxygen_level logo is visible");
            } else {
                test18.log(LogStatus.FAIL, "oxygen_level logo is not visible");
                getScreenshot("Vital_oxygen_level Logo");
            }
            WebElement e2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(oxygen_level_header));
            String h = e2.getText();
            if (h.equals(H)) {
                test18.log(LogStatus.PASS, "oxygen_level - Header text shown as per the requirement : " + h);
            } else {
                test18.log(LogStatus.FAIL, "oxygen_level - Header text not shown as per the requirement : " + h);
                getScreenshot("Vital_oxygen_level_Header");
            }
            WebElement e3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(oxygen_leveltime));
            String h1 = e3.getText();
            if (h1.equals("null") || h1.isEmpty()) {
                test18.log(LogStatus.FAIL, "oxygen_level - Date and Time not shown as per the requirement : " + h1);
                getScreenshot("Vital_oxygen_level_Time");
            } else {
                test18.log(LogStatus.PASS, "oxygen_level - Date and Time shown as per the requirement : " + h1);
            }
            WebElement e4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(oxygen_level_value));
            String v = e4.getText();
            if (v.equals("null") || v.isEmpty()) {
                test18.log(LogStatus.FAIL, "oxygen_level - Recent entered value not shown as per the requirement : " + v);
                getScreenshot("Vital_oxygen_level_Value");
            } else {
                test18.log(LogStatus.PASS, "oxygen_level- Recent entered value shown as per the requirement : " + v);
            }
            try {
                WebElement e5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(oxygen_level_arrow));
                e5.click();
                test18.log(LogStatus.PASS, "oxygen_level - Arrow icon clicked");
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "oxygen_level - Arrow icon not visible");
                getScreenshot("Vitals_oxygen_level_Arrow");
            }
            Thread.sleep(2000);
            try {
                WebElement e6 = new WebDriverWait(driver, 10)
                        .until(driver -> driver.findElement(oxygen_level_inHead));
                String h2 = e6.getText();
                if (h2.contains(H)) {
                    test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                } else {
                    test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                    getScreenshot("Vital_oxygen_level_InHeader");
                }
                Thread.sleep(2000);
                Dimension dimension = driver.manage().window().getSize();
                int scrollStart = (int) (dimension.getHeight() * 0.5);
                int scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    WebElement e7 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Manual_Feed));
                    e7.click();
                    test18.log(LogStatus.PASS, "oxygen_level - Manual field icon clicked");
//                    WebElement e8 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(date));
//                    e8.click();
//                    test18.log(LogStatus.PASS, "oxygen_level Filter - Clicked the date field");
//                    //driver.findElement(previous_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e9 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Month_date1));
//                    e9.click();
//                    test18.log(LogStatus.PASS, "oxygen_level  - Selected the Start date");
//                    WebElement e10 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button1));
//                    e10.click();
//                    test18.log(LogStatus.PASS, "oxygen_level  - Clicked the OK button");
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_prev_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e11 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(time));
//                    e11.click();
//                    test18.log(LogStatus.PASS, "oxygen_level  - Selected the time field");
//                    WebElement e12 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(hours));
//                    e12.click();
//                    test18.log(LogStatus.PASS, "oxygen_level - Clicked the hours time");
//                    WebElement e13 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(minutesclick));
//                    e13.click();
//                    test18.log(LogStatus.PASS, "oxygen_level - Clicked the minutes time");
//                    WebElement e14 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button2));
//                    e14.click();
                    test18.log(LogStatus.PASS, "oxygen_level - Clicked the OK button");
                    WebElement e15 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(oxygenlevel));
                    e15.sendKeys(D);
                    test18.log(LogStatus.PASS, "oxygen_level  value displayed");
                    WebElement e16 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(add));
                    e16.click();
                    test18.log(LogStatus.PASS, "oxygen_level added");
                    Thread.sleep(2000);
                    WebElement e17 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(oxygen_leveltime));
                    String h11 = e17.getText();
                    if (h11.equals("null") || h11.isEmpty()) {
                        test18.log(LogStatus.FAIL, "oxygen_level - Date and Time not shown as per the requirement : " + h11);
                        getScreenshot("Vital_oxygen_level_Time");
                    } else {
                        test18.log(LogStatus.PASS, "oxygen_level - Date and Time shown as per the requirement : " + h11);
                    }
                    WebElement e18 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(oxygen_level_value));
                    String v1 = e18.getText();
                    if (v1.equals("null") || v1.isEmpty()) {
                        test18.log(LogStatus.FAIL, "oxygen_level - Recent entered value not shown as per the requirement : " + v1);
                        getScreenshot("Vital_oxygen_level_Value");
                    } else {
                        test18.log(LogStatus.PASS, "oxygen_level- Recent entered value shown as per the requirement : " + v1);
                    }
                    try {
                        WebElement e19 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(oxygen_level_arrow));
                        e19.click();
                        test18.log(LogStatus.PASS, "oxygen_level - Arrow icon clicked");
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "oxygen_level - Arrow icon not visible");
                        getScreenshot("Vitals_oxygen_level_Arrow");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "oxygen_level - Filter option is not visible");
                    getScreenshot("Vitals_oxygen_level_Filter");
                }
                Thread.sleep(2000);
               /* dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
//                    Thread.sleep(2000);
//                    driver.findElement(previous_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date1).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("95");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date3).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("96");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date4).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("97");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }

                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);

                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date5).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("98");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date6).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date7).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date8).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("91");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date9).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("92");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date10).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("93");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date11).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("94");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date12).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("95");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date13).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("96");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date14).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("97");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date15).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("98");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date16).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date17).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date18).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date19).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date20).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("98");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date21).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date22).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("98");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date23).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date24).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("98");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date25).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date26).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("100");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date27).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("97");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date28).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("95");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date29).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("98");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date30).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("91");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date31).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(oxygenlevel).sendKeys("99");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }*/

                try {
                    WebElement e20 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(BPM_1day));
                    e20.click();
                    test18.log(LogStatus.PASS, "oxygen_level - 1 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "oxygen_level - 1 day icon not visible");
                    getScreenshot("Vitals_oxygen_level_1day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e21 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_7days));
                    e21.click();
                    test18.log(LogStatus.PASS, "oxygen_level - 7 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "oxygen_level - 7 day icon not visible");
                    getScreenshot("Vitals_oxygen_level_7day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e22 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_15days));
                    e22.click();
                    test18.log(LogStatus.PASS, "oxygen_level -15day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "oxygen_level - 15 day icon not visible");
                    getScreenshot("Vitals_oxygen_level_15day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e23 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_Custom));
                    e23.click();
                    test18.log(LogStatus.PASS, "oxygen_level_Custom icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "oxygen_level_Custom icon not visible");
                    getScreenshot("Vitals_oxygen_level_Custom");
                }
                Thread.sleep(2000);
                try {
                    WebElement e24 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(start_Date));
                    e24.click();
                    test18.log(LogStatus.PASS, "Date screen shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement");
                    getScreenshot("Vital_oxygen_level_DatesHeader");
                }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(Month_backdate).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                getScreenshot("Vitals_oxygen_level_Date screen start date text not shown");
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(Month_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                getScreenshot("Vitals_oxygen_level_Date screen start date text not shown");
//            }
                try {
                    WebElement e25 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok_button));
                    e25.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_oxygen_level_start dates");
                }
                try {
                    WebElement e26 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(end_Date));
                    e26.click();
                    test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button not clicked");
                    getScreenshot("Vitals_oxygen_level_end dates");
                }
//            try {
//                Thread.sleep(2000);
//                driver.findElement(Month1_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "OK Button not clicked");
//                getScreenshot("Vitals_oxygen_level_end dates");
//            }
                try {
                    WebElement e27 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok1_button));
                    e27.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_oxygen_level_start dates");
                }
                Thread.sleep(1000);
                try {
                    WebElement e28 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Filter_btn));
                    e28.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_oxygen_level_start dates");
                }
                Thread.sleep(1000);
                try {
                    WebElement e29 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(chart_inLogo));
                    if (e29.isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_oxygen_levelInLogo");
                    }
                    WebElement e30 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_date_header));
                    String h3 = e30.getText();
                    if (h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Time not shown as per the requirement : " + h3);
                        getScreenshot("Vital_oxygen_level_Time");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - TIme shown as per the requirement : " + h3);
                    }
                    WebElement e31 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(oxygenlevel_chart));
                    if (e31.isDisplayed()) {
                        test18.log(LogStatus.PASS, "oxygen_level - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "oxygen_level - Chart is not visible");
                        getScreenshot("Vital_oxygen_level_Chart");
                    }
                    Thread.sleep(2000);
                    dimension = driver.manage().window().getSize();
                    scrollStart = (int) (dimension.getHeight() * 0.5);
                    scrollEnd = (int) (dimension.getHeight() * 0.2);
                    new TouchAction((PerformsTouchActions) driver)
                            .press(PointOption.point(0, scrollStart))
                            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                            .moveTo(PointOption.point(0, scrollEnd))
                            .release().perform();
                    WebElement e32 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(heartrate_content));
                    String h4 = e32.getText();
                    if (h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_oxygen_level_Content");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    Thread.sleep(1000);
                    try {
                        WebElement e33 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(Share_report));
                        if (e33.isDisplayed()) {
                            String rep = driver.findElement(Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "BPM - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "BPM - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_BPMRepButtonText");
                            }
                            WebElement e34 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(Share_report));
                            e34.click();
                            test18.log(LogStatus.PASS, "BodyTemp - Share button clicked");
                            //Thread.sleep(2000);
                            //driver.findElement(share_copy_link).click();
                            WebElement element1 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(share_copy_link));
                            String link = element1.getText();
                            System.out.println(link);
                            test18.log(LogStatus.INFO, "Share link : " + link);
                            test18.log(LogStatus.PASS, "Share link Copied");
                            driver.navigate().back();
                        } else {
                            test18.log(LogStatus.SKIP, "BPM - Share report option is not visible");
                            getScreenshot("Vitals_BPMShareReport");
                        }
                        try {
                            Thread.sleep(2000);
                            driver.findElement(back_btn).click();
                            test18.log(LogStatus.PASS, "Vitals page is displayed");
                        } catch (NoSuchElementException e){
                            driver.navigate().back();
                            test18.log(LogStatus.SKIP, "Vitals share option is not visible");
                            getScreenshot("Vitals_SharePage");
                        }
                        Thread.sleep(2000);
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "oxygen_level - Share report option is not visible");
                        getScreenshot("Vitals_oxygen_level_ShareReport");
                    }

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "oxygen_level - Filter option is not visible");
                    getScreenshot("Vitals_oxygen_level_Filter");
                }
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "oxygen_level - Filter option is not visible");
                getScreenshot("Vitals_oxygen_level_Filter");
            }
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "oxygen_level - Filter option is not visible");
            getScreenshot("Vitals_oxygen_level_Filter");
        }
    }

    public void verifyBloodPressure(String D1, String D2, String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException, InterruptedException {

        test18.log(LogStatus.INFO, "Ready to verify the Heart Rate (BPM)");
        try {
            Thread.sleep(2000);
            WebElement e1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Blood_Pressure_logo));
            if (e1.isDisplayed()) {
                test18.log(LogStatus.PASS, "BloodPressure logo is visible");
            } else {
                test18.log(LogStatus.FAIL, "BloodPressure logo is not visible");
                getScreenshot("Vital_BloodPressure_Logo");
            }
            WebElement e2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Blood_Pressure_header));
            String h = e2.getText();
            if (h.equals(H)) {
                test18.log(LogStatus.PASS, "Blood Pressure - Header text shown as per the requirement : " + h);
            } else {
                test18.log(LogStatus.FAIL, "Blood Pressure - Header text not shown as per the requirement : " + h);
                getScreenshot("Vital_BloodPressure_Header");
            }
            WebElement e3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Blood_Pressure_time));
            String h1 = e3.getText();
            if (h1.equals("null") || h1.isEmpty()) {
                test18.log(LogStatus.FAIL, "BloodPressure- Date and Time not shown as per the requirement : " + h1);
                getScreenshot("Vital_BloodPressure_Time");
            } else {
                test18.log(LogStatus.PASS, "BloodPressure - Date and Time shown as per the requirement : " + h1);
            }
            WebElement e4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Blood_Pressurevalue));
            String v = e4.getText();
            if (v.equals("null") || v.isEmpty()) {
                test18.log(LogStatus.FAIL, "BloodPressure - Recent entered value not shown as per the requirement : " + v);
                getScreenshot("Vital_BloodPressure_Value");
            } else {
                test18.log(LogStatus.PASS, "BloodPressure - Recent entered value shown as per the requirement : " + v);
            }
            try {
                WebElement e5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(Blood_Pressurearrow));
                e5.click();
                test18.log(LogStatus.PASS, "BloodPressure - Arrow icon clicked");
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BloodPressure - Arrow icon not visible");
                getScreenshot("Vitals_BloodPressureArrow");
            }
            Thread.sleep(2000);
            try {
                WebElement e6 = new WebDriverWait(driver, 10)
                        .until(driver -> driver.findElement(Blood_PressureinHead));
                String h2 = e6.getText();
                if (h2.contains(H)) {
                    test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                } else {
                    test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                    getScreenshot("Vital_BloodPressure_InHeader");
                }
                Thread.sleep(2000);
                Dimension dimension = driver.manage().window().getSize();
                int scrollStart = (int) (dimension.getHeight() * 0.5);
                int scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    WebElement e7 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Manual_Feed));
                    e7.click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
//                    WebElement e8 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(date));
//                    e8.click();
//                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
//                    //driver.findElement(previous_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e9 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Month_date1));
//                    e9.click();
//                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
//                    WebElement e10 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button1));
//                    e10.click();
//                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_prev_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e11 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(time));
//                    e11.click();
//                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
//                    WebElement e12 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(hours));
//                    e12.click();
//                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
//                    WebElement e13 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(minutesclick));
//                    e13.click();
//                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
//                    WebElement e14 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button2));
//                    e14.click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    WebElement e15 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BloodPressure_systolic));
                    e15.sendKeys(D1);
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    WebElement e16 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BloodPressure_Diastolic));
                    e16.sendKeys(D2);
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    WebElement e17 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(add));
                    e17.click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(2000);
                    WebElement e18 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Blood_Pressure_time));
                    String h11 = e18.getText();
                    if (h11.equals("null") || h11.isEmpty()) {
                        test18.log(LogStatus.FAIL, "BloodPressure- Date and Time not shown as per the requirement : " + h11);
                        getScreenshot("Vital_BloodPressure_Time");
                    } else {
                        test18.log(LogStatus.PASS, "BloodPressure - Date and Time shown as per the requirement : " + h11);
                    }
                    WebElement e19 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Blood_Pressurevalue));
                    String v1 = e19.getText();
                    if (v1.equals("null") || v1.isEmpty()) {
                        test18.log(LogStatus.FAIL, "BloodPressure - Recent entered value not shown as per the requirement : " + v1);
                        getScreenshot("Vital_BloodPressure_Value");
                    } else {
                        test18.log(LogStatus.PASS, "BloodPressure - Recent entered value shown as per the requirement : " + v1);
                    }
                    try {
                        WebElement e20 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(Blood_Pressurearrow));
                        e20.click();
                        test18.log(LogStatus.PASS, "BloodPressure - Arrow icon clicked");
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "BloodPressure - Arrow icon not visible");
                        getScreenshot("Vitals_BloodPressureArrow");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
            /*    Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date2).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("100");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("60");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date3).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("101");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("61");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date4).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("101");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("63");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date5).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date6).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("108");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("72");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date7).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("111");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("74");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date8).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("112");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("72");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date9).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("114");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("74");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date10).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("115");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("75");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date11).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date12).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("120");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("100");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date13).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date14).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date15).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date16).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date17).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date18).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date19).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date20).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date21).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date22).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date23).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date24).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date25).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date26).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date27).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date28).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date29).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date30).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BloodPressure- Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BloodPressure Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date31).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BloodPressure  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BloodPressure - Clicked the OK button");
                    driver.findElement(BloodPressure_systolic).sendKeys("110");
                    test18.log(LogStatus.PASS, "BloodPressure - Systolic value is entered");
                    driver.findElement(BloodPressure_Diastolic).sendKeys("70");
                    test18.log(LogStatus.PASS, "BloodPressure - Diastolic value is entered");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BloodPressure vitals added");
                    Thread.sleep(3000);

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }*/
                Thread.sleep(2000);
                try {
                    WebElement e21 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_1day));
                    e21.click();
                    test18.log(LogStatus.PASS, "BloodPressure- 1 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - 1 day icon not visible");
                    getScreenshot("Vitals_BloodPressure_1day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e22 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_7days));
                    e22.click();
                    test18.log(LogStatus.PASS, "BloodPressure - 7 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - 7 day icon not visible");
                    getScreenshot("Vitals_BloodPressure_7day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e23 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_15days));
                    e23.click();
                    test18.log(LogStatus.PASS, "BloodPressure-15day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - 15 day icon not visible");
                    getScreenshot("Vitals_BloodPressure_15day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e24 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_Custom));
                    e24.click();
                    test18.log(LogStatus.PASS, "BloodPressure_Custom icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure_Custom icon not visible");
                    getScreenshot("Vitals_BloodPressure_Custom");
                }
                Thread.sleep(2000);
                try {
                    WebElement e25 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(start_Date));
                    e25.click();
                    test18.log(LogStatus.PASS, "Date screen shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement");
                    getScreenshot("Vital_BloodPressure_DatesHeader");
                }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(Month_backdate).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                getScreenshot("Vitals_BloodPressure_Date screen start date text not shown");
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(Month_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                getScreenshot("Vitals_BloodPressure_Date screen start date text not shown");
//            }
                Thread.sleep(2000);
                try {
                    WebElement e26 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok_button));
                    e26.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_BloodPressure_start dates");
                }
                Thread.sleep(2000);
                try {
                    WebElement e27 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(end_Date));
                    e27.click();
                    test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button not clicked");
                    getScreenshot("Vitals_BloodPressure_end dates");
                }
//            try {
//                Thread.sleep(2000);
//                driver.findElement(Month1_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "OK Button not clicked");
//                getScreenshot("Vitals_BPM_end dates");
//            }
                Thread.sleep(2000);
                try {
                    WebElement e28 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok1_button));
                    e28.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_BPM_start dates");
                }
                Thread.sleep(500);
                try {
                    WebElement e29 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Filter_btn));
                    e29.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_BPM_start dates");
                }
                Thread.sleep(1000);
                try {
                    WebElement e30 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(chart_inLogo));
                    if (e30.isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_BPMInLogo");
                    }
                    WebElement e31 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_date_header));
                    String h3 = e31.getText();
                    if (h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Time not shown as per the requirement : " + h3);
                        getScreenshot("Vital_BPMTime");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - TIme shown as per the requirement : " + h3);
                    }
                    Thread.sleep(1000);
                    WebElement e32 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BloodPressure_chart));
                    if (e32.isDisplayed()) {
                        test18.log(LogStatus.PASS, "BloodPressure - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "BloodPressure - Chart is not visible");
                        getScreenshot("Vital_BPMChart");
                    }
                    Thread.sleep(2000);
                    dimension = driver.manage().window().getSize();
                    scrollStart = (int) (dimension.getHeight() * 0.5);
                    scrollEnd = (int) (dimension.getHeight() * 0.2);
                    new TouchAction((PerformsTouchActions) driver)
                            .press(PointOption.point(0, scrollStart))
                            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                            .moveTo(PointOption.point(0, scrollEnd))
                            .release().perform();
                    Thread.sleep(2000);
                    String h4 = driver.findElement(heartrate_content).getText();
                    if (h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_BloodPressure_Content");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    Thread.sleep(1000);
                    try {
                        WebElement e33 = new WebDriverWait(driver, 5)
                                .until(driver -> driver.findElement(Share_report));
                        if (e33.isDisplayed()) {
                            String rep = driver.findElement(Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "BPM - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "BPM - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_BPMRepButtonText");
                            }
                            WebElement e34 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(Share_report));
                            e34.click();
                            test18.log(LogStatus.PASS, "BodyTemp - Share button clicked");
                            //Thread.sleep(2000);
                            //driver.findElement(share_copy_link).click();
                            WebElement element1 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(share_copy_link));
                            String link = element1.getText();
                            System.out.println(link);
                            test18.log(LogStatus.INFO, "Share link : " + link);
                            test18.log(LogStatus.PASS, "Share link Copied");
                            driver.navigate().back();
                        } else {
                            test18.log(LogStatus.SKIP, "BPM - Share report option is not visible");
                            getScreenshot("Vitals_BPMShareReport");
                        }
                        try {
                            Thread.sleep(2000);
                            driver.findElement(back_btn).click();
                            test18.log(LogStatus.PASS, "Vitals page is displayed");
                        } catch (NoSuchElementException e){
                            driver.navigate().back();
                            test18.log(LogStatus.SKIP, "Vitals share option is not visible");
                            getScreenshot("Vitals_SharePage");
                        }
                        Thread.sleep(2000);
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "BloodPressure - Share report option is not visible");
                        getScreenshot("Vitals_BloodPressure_ShareReport");
                    }

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                    getScreenshot("Vitals_BloodPressure_Filter");
                }
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
                getScreenshot("Vitals_BloodPressure_Filter");
            }
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "BloodPressure - Filter option is not visible");
            getScreenshot("Vitals_BloodPressure_Filter");
        }
    }

    public void verifyWeight(String D, String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException, InterruptedException {

        test18.log(LogStatus.INFO, "Ready to verify the Heart Rate (BPM)");
        try {
            Thread.sleep(2000);
            WebElement e1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Weight_logo));
            if (e1.isDisplayed()) {
                test18.log(LogStatus.PASS, "Weight logo is visible");
            } else {
                test18.log(LogStatus.FAIL, "Weight logo is not visible");
                getScreenshot("Vital_Weight_Logo");
            }
            WebElement e2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Weight_header));
            String h = e2.getText();
            if (h.equals(H)) {
                test18.log(LogStatus.PASS, "Weight - Header text shown as per the requirement : " + h);
            } else {
                test18.log(LogStatus.FAIL, "Weight - Header text not shown as per the requirement : " + h);
                getScreenshot("Vital_Weight_Header");
            }
            WebElement e3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Weight_time));
            String h1 = e3.getText();
            if (h1.equals("null") || h1.isEmpty()) {
                test18.log(LogStatus.FAIL, "Weight- Date and Time not shown as per the requirement : " + h1);
                getScreenshot("Vital_Weight_Time");
            } else {
                test18.log(LogStatus.PASS, "Weight - Date and Time shown as per the requirement : " + h1);
            }
            WebElement e4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Weight_value));
            String v = e4.getText();
            if (v.equals("null") || v.isEmpty()) {
                test18.log(LogStatus.FAIL, "Weight - Recent entered value not shown as per the requirement : " + v);
                getScreenshot("Vital_Weight_Value");
            } else {
                test18.log(LogStatus.PASS, "Weight - Recent entered value shown as per the requirement : " + v);
            }
            try {
                WebElement e5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(Weight_arrow));
                e5.click();
                test18.log(LogStatus.PASS, "Weight - Arrow icon clicked");
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Weight- Arrow icon not visible");
                getScreenshot("Vitals_WeightArrow");
            }
            Thread.sleep(2000);
            try {
                WebElement e6 = new WebDriverWait(driver, 10)
                        .until(driver -> driver.findElement(Weight_inHead));
                String h2 = e6.getText();
                if (h2.contains(H)) {
                    test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                } else {
                    test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                    getScreenshot("Vital_Weight_InHeader");
                }
                Thread.sleep(2000);
                Dimension dimension = driver.manage().window().getSize();
                int scrollStart = (int) (dimension.getHeight() * 0.5);
                int scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    WebElement e7 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Manual_Feed));
                    e7.click();
                    test18.log(LogStatus.PASS, "Weight - Manual field icon clicked");
//                    WebElement e8 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(date));
//                    e8.click();
//                    test18.log(LogStatus.PASS, "Weight Filter - Clicked the date field");
//                    //Thread.sleep(2000);
//                    //driver.findElement(previous_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e9 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Month_date1));
//                    e9.click();
//                    test18.log(LogStatus.PASS, "Weight  - Selected the Start date");
//                    WebElement e10 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button1));
//                    e10.click();
//                    test18.log(LogStatus.PASS, "Weight  - Clicked the OK button");
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_prev_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e11 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(time));
//                    e11.click();
//                    test18.log(LogStatus.PASS, "Weight  - Selected the time field");
//                    WebElement e12 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(hours));
//                    e12.click();
//                    test18.log(LogStatus.PASS, "Weight - Clicked the hours time");
//                    WebElement e13 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(minutesclick));
//                    e13.click();
//                    test18.log(LogStatus.PASS, "Weight - Clicked the minutes time");
//                    WebElement e14 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button2));
//                    e14.click();
                    test18.log(LogStatus.PASS, "Weight - Clicked the OK button");
                    WebElement e15 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Weight));
                    e15.sendKeys(D);
                    test18.log(LogStatus.PASS, "Weight - Heart rate value displayed");
                    WebElement e16 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(add));
                    e16.click();
                    Thread.sleep(2000);
                    test18.log(LogStatus.PASS, "Weight added");
                    WebElement e17 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(Weight_time));
                    String h11 = e17.getText();
                    if (h11.equals("null") || h11.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Weight- Date and Time not shown as per the requirement : " + h11);
                        getScreenshot("Vital_Weight_Time");
                    } else {
                        test18.log(LogStatus.PASS, "Weight - Date and Time shown as per the requirement : " + h11);
                    }
                    WebElement e18 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Weight_value));
                    String v1 = e18.getText();
                    if (v1.equals("null") || v1.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Weight - Recent entered value not shown as per the requirement : " + v1);
                        getScreenshot("Vital_Weight_Value");
                    } else {
                        test18.log(LogStatus.PASS, "Weight - Recent entered value shown as per the requirement : " + v1);
                    }
                    try {
                        WebElement e19 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(Weight_arrow));
                        e19.click();
                        test18.log(LogStatus.PASS, "Weight - Arrow icon clicked");
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "Weight- Arrow icon not visible");
                        getScreenshot("Vitals_WeightArrow");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Weight - Filter option is not visible");
                    getScreenshot("Vitals_Weight_Filter");
                }
                /*Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date2).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("74");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date3).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("74");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date4).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("74");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }

                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);

                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date5).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("74");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date6).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("74");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date7).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("74");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date8).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("74");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date9).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("74");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date10).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("70");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date11).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("71");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date12).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("72");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date13).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("73");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date14).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("74");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date15).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("75");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date16).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("76");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date17).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("77");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date18).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("78");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date19).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("79");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date20).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("80");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date21).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("81");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date22).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("82");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date23).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("83");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date24).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("84");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date25).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("85");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date26).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("86");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date27).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("87");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date28).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("88");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date29).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("89");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date30).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("90");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    Thread.sleep(2000);
                    driver.findElement(Manual_Feed).click();
                    test18.log(LogStatus.PASS, "BPM - Manual field icon clicked");
                    Thread.sleep(2000);
                    driver.findElement(date).click();
                    test18.log(LogStatus.PASS, "BPM Filter - Clicked the date field");
                    Thread.sleep(2000);
                    driver.findElement(previous_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(Month_date31).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the Start date");
                    Thread.sleep(2000);
                    driver.findElement(Ok_button1).click();
                    test18.log(LogStatus.PASS, "BPM  - Clicked the OK button");
                    //Thread.sleep(2000);
                    //driver.findElement(chart_prev_month).click();
                    //Thread.sleep(2000);
                    //driver.findElement(chart_select_date).click();
                    Thread.sleep(2000);
                    driver.findElement(time).click();
                    test18.log(LogStatus.PASS, "BPM  - Selected the time field");
                    Thread.sleep(2000);
                    driver.findElement(hours).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the hours time");
                    Thread.sleep(2000);
                    driver.findElement(minutesclick).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the minutes time");
                    driver.findElement(Ok_button2).click();
                    test18.log(LogStatus.PASS, "BPM - Clicked the OK button");
                    driver.findElement(Weight).sendKeys("91");
                    test18.log(LogStatus.PASS, "BPM - Heart rate value displayed");
                    Thread.sleep(2000);
                    driver.findElement(add).click();
                    test18.log(LogStatus.PASS, "BPM - Heart rate(BPM) added");
                    Thread.sleep(3000);
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }*/
                Thread.sleep(2000);
                try {
                    WebElement e20 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_1day));
                    e20.click();
                    test18.log(LogStatus.PASS, "Weight- 1 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Weight - 1 day icon not visible");
                    getScreenshot("Vitals_Weight_1day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e21 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_7days));
                    e21.click();
                    test18.log(LogStatus.PASS, "Weight - 7 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Weight - 7 day icon not visible");
                    getScreenshot("Vitals_Weight_7day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e22 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_15days));
                    e22.click();
                    test18.log(LogStatus.PASS, "Weight -15day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Weight - 15 day icon not visible");
                    getScreenshot("Vitals_Weight_15day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e23 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_Custom));
                    e23.click();
                    test18.log(LogStatus.PASS, "Weight_Custom icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Weight_Custom icon not visible");
                    getScreenshot("Vitals_Weight_Custom");
                }
                Thread.sleep(2000);
                try {
                    WebElement e24 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(start_Date));
                    e24.click();
                    test18.log(LogStatus.PASS, "Date screen shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement");
                    getScreenshot("Vital_WeightDatesHeader");
                }
//            try {
//                driver.findElement(Month_backdate).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                getScreenshot("Vitals_BPM_Date screen start date text not shown");
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(Month_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                getScreenshot("Vitals_BPM_Date screen start date text not shown");
//            }
                Thread.sleep(2000);
                try {
                    WebElement e25 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok_button));
                    e25.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_BPM_start dates");
                }
                try {
                    WebElement e26 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(end_Date));
                    e26.click();
                    test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button not clicked");
                    getScreenshot("Vitals_BPM_end dates");
                }
//            try {
//                Thread.sleep(2000);
//                driver.findElement(Month1_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "OK Button not clicked");
//                getScreenshot("Vitals_BPM_end dates");
//            }
                try {
                    WebElement e27 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok1_button));
                    e27.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_BPM_start dates");
                }
                Thread.sleep(500);
                try {
                    WebElement e28 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Filter_btn));
                    e28.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_BPM_start dates");
                }
                Thread.sleep(1000);
                try {
                    WebElement e29 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_inLogo));
                    if (e29.isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_BPMInLogo");
                    }
                    WebElement e30 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_date_header));
                    String h3 = e30.getText();
                    if (h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Time not shown as per the requirement : " + h3);
                        getScreenshot("Vital_BPMTime");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - TIme shown as per the requirement : " + h3);
                    }
                    WebElement e31 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Weight_chart));
                    if (e31.isDisplayed()) {
                        test18.log(LogStatus.PASS, "Weight Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Weight  Chart is not visible");
                        getScreenshot("Vital_BPMChart");
                    }
                    Thread.sleep(2000);
                    dimension = driver.manage().window().getSize();
                    scrollStart = (int) (dimension.getHeight() * 0.5);
                    scrollEnd = (int) (dimension.getHeight() * 0.2);
                    new TouchAction((PerformsTouchActions) driver)
                            .press(PointOption.point(0, scrollStart))
                            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                            .moveTo(PointOption.point(0, scrollEnd))
                            .release().perform();
                    Thread.sleep(2000);
                    WebElement e32 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(heartrate_content));
                    String h4 = e32.getText();
                    if (h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_Weight_Content");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    Thread.sleep(1000);
                    try {
                        WebElement e33 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(Share_report));
                        if (e33.isDisplayed()) {
                            String rep = driver.findElement(Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "BPM - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "BPM - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_BPMRepButtonText");
                            }
                            WebElement e34 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(Share_report));
                            e34.click();
                            test18.log(LogStatus.PASS, "BodyTemp - Share button clicked");
                            //Thread.sleep(2000);
                            //driver.findElement(share_copy_link).click();
                            WebElement element1 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(share_copy_link));
                            String link = element1.getText();
                            System.out.println(link);
                            test18.log(LogStatus.INFO, "Share link : " + link);
                            test18.log(LogStatus.PASS, "Share link Copied");
                            driver.navigate().back();
                        } else {
                            test18.log(LogStatus.SKIP, "BPM - Share report option is not visible");
                            getScreenshot("Vitals_BPMShareReport");
                        }
                        try {
                            Thread.sleep(2000);
                            driver.findElement(back_btn).click();
                            test18.log(LogStatus.PASS, "Vitals page is displayed");
                        } catch (NoSuchElementException e){
                            driver.navigate().back();
                            test18.log(LogStatus.SKIP, "Vitals share option is not visible");
                            getScreenshot("Vitals_SharePage");
                        }
                        Thread.sleep(2000);
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "BPM - Share report option is not visible");
                        getScreenshot("Vitals_BPMShareReport");
                    }

                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                    getScreenshot("Vitals_BPMFilter");
                }
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                getScreenshot("Vitals_BPMFilter");
            }
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
            getScreenshot("Vitals_BPMFilter");
        }
    }

    public void verifyBloodGlucose(String D, String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException, InterruptedException {

        test18.log(LogStatus.INFO, "Ready to verify the Heart Rate (BPM)");
        try {
            Thread.sleep(2000);
            WebElement e1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Blood_Glucose_logo));
            if (e1.isDisplayed()) {
                test18.log(LogStatus.PASS, "Blood_Glucose logo is visible");
            } else {
                test18.log(LogStatus.FAIL, "Blood_Glucose logo is not visible");
                getScreenshot("Vital_Blood_Glucose_Logo");
            }
            WebElement e2 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Blood_Glucose_header));
            String h = e2.getText();
            if (h.equals(H)) {
                test18.log(LogStatus.PASS, "Blood_Glucose - Header text shown as per the requirement : " + h);
            } else {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Header text not shown as per the requirement : " + h);
                getScreenshot("Vital_Blood_Glucose_Header");
            }
            WebElement e3 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Blood_Glucose_time));
            String h1 = e3.getText();
            if (h1.equals("null") || h1.isEmpty()) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Date and Time not shown as per the requirement : " + h1);
                getScreenshot("Vital_Blood_Glucose_Time");
            } else {
                test18.log(LogStatus.PASS, "Blood_Glucose - Date and Time shown as per the requirement : " + h1);
            }
            WebElement e4 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(Blood_Glucose_value));
            String v = e4.getText();
            if (v.equals("null") || v.isEmpty()) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Recent entered value not shown as per the requirement : " + v);
                getScreenshot("Vital_Blood_Glucose_Value");
            } else {
                test18.log(LogStatus.PASS, "Blood_Glucose- Recent entered value shown as per the requirement : " + v);
            }
            try {
                WebElement e5 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(Blood_Glucose_arrow));
                e5.click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Arrow icon clicked");
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Arrow icon not visible");
                getScreenshot("Vitals_Blood_Glucose_Arrow");
            }
            Thread.sleep(2000);
            try {
                WebElement e6 = new WebDriverWait(driver, 10)
                        .until(driver -> driver.findElement(Blood_Glucose_inHead));
                String h2 = e6.getText();
                if (h2.contains(H)) {
                    test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                } else {
                    test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                    getScreenshot("Vital_Blood_Glucose_InHeader");
                }
                Thread.sleep(2000);
                Dimension dimension = driver.manage().window().getSize();
                int scrollStart = (int) (dimension.getHeight() * 0.5);
                int scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
                try {
                    WebElement e7 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Manual_Feed));
                    e7.click();
                    test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
//                    WebElement e8 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(date));
//                    e8.click();
//                    test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
//                    //driver.findElement(previous_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e9 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Month_date1));
//                    e9.click();
//                    test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
//                    WebElement e10 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button1));
//                    e10.click();
//                    test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_prev_month).click();
//                    //Thread.sleep(2000);
//                    //driver.findElement(chart_select_date).click();
//                    WebElement e11 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(time));
//                    e11.click();
//                    test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
//                    WebElement e12 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(hours));
//                    e12.click();
//                    test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
//                    WebElement e13 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(minutesclick));
//                    e13.click();
//                    test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
//                    WebElement e14 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(Ok_button2));
//                    e14.click();
                    test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                    WebElement e15 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Blood_Glucose_mealtype));
                    e15.click();
                    test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                    WebElement e16 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Blood_Glucose_fasting));
                    e16.click();
                    test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                    WebElement e17 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Blood_Glucose));
                    e17.sendKeys(D);
                    test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                    WebElement e18 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(add));
                    e18.click();
                    test18.log(LogStatus.PASS, "Blood_Glucose added");
                    Thread.sleep(2000);
                    WebElement e19 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(Blood_Glucose_time));
                    String h11 = e19.getText();
                    if (h11.equals("null") || h11.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Blood_Glucose - Date and Time not shown as per the requirement : " + h11);
                        getScreenshot("Vital_Blood_Glucose_Time");
                    } else {
                        test18.log(LogStatus.PASS, "Blood_Glucose - Date and Time shown as per the requirement : " + h11);
                    }
                    WebElement e20 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Blood_Glucose_value));
                    String v1 = e20.getText();
                    if (v1.equals("null") || v1.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Blood_Glucose - Recent entered value not shown as per the requirement : " + v1);
                        getScreenshot("Vital_Blood_Glucose_Value");
                    } else {
                        test18.log(LogStatus.PASS, "Blood_Glucose- Recent entered value shown as per the requirement : " + v1);
                    }
                    try {
                        WebElement e21 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(Blood_Glucose_arrow));
                        e21.click();
                        test18.log(LogStatus.PASS, "Blood_Glucose- Arrow icon clicked");
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "Blood_Glucose - Arrow icon not visible");
                        getScreenshot("Vitals_Blood_Glucose_Arrow");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                    getScreenshot("Vitals_Blood_Glucose_Filter");
                }
             /*   Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("250");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date3).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("230");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date4).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("210");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }

                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);

            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date5).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date6).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date7).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date8).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date9).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date10).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date11).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date12).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date13).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date14).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date15).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date16).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date17).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date18).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date19).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date20).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date21).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date22).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date23).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date24).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date25).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date26).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date27).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date28).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date29).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date30).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
                Thread.sleep(2000);
                dimension = driver.manage().window().getSize();
                scrollStart = (int) (dimension.getHeight() * 0.5);
                scrollEnd = (int) (dimension.getHeight() * 0.2);
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release().perform();
                Thread.sleep(2000);
            try {
                Thread.sleep(2000);
                driver.findElement(Manual_Feed).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Manual field icon clicked");
                Thread.sleep(2000);
                driver.findElement(date).click();
                test18.log(LogStatus.PASS, "Blood_Glucose Filter - Clicked the date field");
                Thread.sleep(2000);
                driver.findElement(previous_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(Month_date31).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the Start date");
                Thread.sleep(2000);
                driver.findElement(Ok_button1).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Clicked the OK button");
                //Thread.sleep(2000);
                //driver.findElement(chart_prev_month).click();
                //Thread.sleep(2000);
                //driver.findElement(chart_select_date).click();
                Thread.sleep(2000);
                driver.findElement(time).click();
                test18.log(LogStatus.PASS, "Blood_Glucose  - Selected the time field");
                Thread.sleep(2000);
                driver.findElement(hours).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the hours time");
                Thread.sleep(2000);
                driver.findElement(minutesclick).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the minutes time");
                driver.findElement(Ok_button2).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose_mealtype).click();
                test18.log(LogStatus.PASS, "Blood_Glucose- Clicked the OK button");
                driver.findElement(Blood_Glucose_fasting).click();
                test18.log(LogStatus.PASS, "Blood_Glucose - Clicked the OK button");
                driver.findElement(Blood_Glucose).sendKeys("200");
                test18.log(LogStatus.PASS, "Blood_Glucose - Heart rate value displayed");
                Thread.sleep(2000);
                driver.findElement(add).click();
                test18.log(LogStatus.PASS, "Blood_Glucose added");
                Thread.sleep(3000);

            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }*/
                Thread.sleep(2000);
                try {
                    WebElement e22 = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(BPM_1day));
                    e22.click();
                    test18.log(LogStatus.PASS, "Blood_Glucose - 1 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Blood_Glucose - 1 day icon not visible");
                    getScreenshot("Vitals_Blood_Glucose_1day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e23 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_7days));
                    e23.click();
                    test18.log(LogStatus.PASS, "Blood_Glucose- 7 day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Blood_Glucose - 7 day icon not visible");
                    getScreenshot("Vitals_Blood_Glucose_7day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e24 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_15days));
                    e24.click();
                    test18.log(LogStatus.PASS, "Blood_Glucose -15day icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Blood_Glucose - 15 day icon not visible");
                    getScreenshot("Vitals_Blood_Glucose_15day graph");
                }
                Thread.sleep(2000);
                try {
                    WebElement e25 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(BPM_Custom));
                    e25.click();
                    test18.log(LogStatus.PASS, "Blood_Glucose_Custom icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Blood_Glucose_Custom icon not visible");
                    getScreenshot("Vitals_Blood_Glucose_Custom");
                }
                Thread.sleep(2000);
                try {
                    WebElement e26 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(start_Date));
                    e26.click();
                    test18.log(LogStatus.PASS, "Date screen shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement");
                    getScreenshot("Vital_Blood_Glucose_DatesHeader");
                }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(Month_backdate).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                getScreenshot("Vitals_Blood_Glucose_Date screen start date text not shown");
//            }
//            Thread.sleep(2000);
//            try {
//                driver.findElement(Month_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "Date screen start date text not shown");
//                getScreenshot("Vitals_Blood_Glucose_Date screen start date text not shown");
//            }
                Thread.sleep(2000);
                try {
                    WebElement e27 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok_button));
                    e27.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_Blood_Glucose_start dates");
                }
                Thread.sleep(2000);
                try {
                    WebElement e28 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(end_Date));
                    e28.click();
                    test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button not clicked");
                    getScreenshot("Vitals_Blood_Glucose_end dates");
                }
//            try {
//                Thread.sleep(2000);
//                driver.findElement(Month1_date).click();
//                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement");
//            } catch (NoSuchElementException e) {
//                test18.log(LogStatus.FAIL, "OK Button not clicked");
//                getScreenshot("Vitals_Blood_Glucose_end dates");
//            }
                Thread.sleep(2000);
                try {
                    WebElement e29 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Ok1_button));
                    e29.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_Blood_Glucose_start dates");
                }
                Thread.sleep(500);
                try {
                    WebElement e30 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Filter_btn));
                    e30.click();
                    test18.log(LogStatus.PASS, "OK Button clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "OK Button notclicked");
                    getScreenshot("Vitals_Blood_Glucose_start dates");
                }
                Thread.sleep(1000);
                try {
                    WebElement e31 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_inLogo));
                    if (e31.isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_Blood_Glucose_InLogo");
                    }
                    WebElement e32 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(chart_date_header));
                    String h3 = e32.getText();
                    if (h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Time not shown as per the requirement : " + h3);
                        getScreenshot("Vital_Blood_Glucose_Time");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - TIme shown as per the requirement : " + h3);
                    }
                    Thread.sleep(1000);
                    WebElement e33 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Blood_Glucose_chart));
                    if (e33.isDisplayed()) {
                        test18.log(LogStatus.PASS, "Blood_Glucose - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Blood_Glucose - Chart is not visible");
                        getScreenshot("Vital_Blood_Glucose_Chart");
                    }
                    Thread.sleep(2000);
                    dimension = driver.manage().window().getSize();
                    scrollStart = (int) (dimension.getHeight() * 0.5);
                    scrollEnd = (int) (dimension.getHeight() * 0.2);
                    new TouchAction((PerformsTouchActions) driver)
                            .press(PointOption.point(0, scrollStart))
                            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                            .moveTo(PointOption.point(0, scrollEnd))
                            .release().perform();
                    Thread.sleep(2000);
                    WebElement e35 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(heartrate_content));
                    String h4 = e35.getText();
                    if (h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_Blood_Glucose_Content");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    WebElement e36 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(Blood_Glucose_details));
                    String h5 = e36.getText();
                    if (h5.equals("null") || h5.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h5);
                        getScreenshot("Vital_Blood_Glucose_Content");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h5);
                    }
                    Thread.sleep(1000);
                    try {
                        WebElement e37 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(Share_report));
                        if (e37.isDisplayed()) {
                            String rep = driver.findElement(Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "BPM - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "BPM - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_BPMRepButtonText");
                            }
                            WebElement e34 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(Share_report));
                            e34.click();
                            test18.log(LogStatus.PASS, "BodyTemp - Share button clicked");
                            //Thread.sleep(2000);
                            //driver.findElement(share_copy_link).click();
                            WebElement element1 = new WebDriverWait(driver, 2)
                                    .until(driver -> driver.findElement(share_copy_link));
                            String link = element1.getText();
                            System.out.println(link);
                            test18.log(LogStatus.INFO, "Share link : " + link);
                            test18.log(LogStatus.PASS, "Share link Copied");
                            driver.navigate().back();
                            Thread.sleep(1000);
                            try {
                                Thread.sleep(2000);
                                driver.findElement(back_btn).click();
                                test18.log(LogStatus.PASS, "Vitals page is displayed");
                            } catch (NoSuchElementException e){
                                driver.navigate().back();
                                test18.log(LogStatus.SKIP, "Vitals share option is not visible");
                                getScreenshot("Vitals_SharePage");
                            }
                            Thread.sleep(1000);
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "Blood Glucose - Share report option is not visible");
                        getScreenshot("Vitals_Blood Glucose_ShareReport");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Blood_Glucose- Filter option is not visible");
                    getScreenshot("Vitals_Blood_Glucose_Filter");
                }
            } catch (NoSuchElementException e) {
                test18.log(LogStatus.FAIL, "Blood_Glucose- Filter option is not visible");
                getScreenshot("Vitals_Blood_Glucose_Filter");
            }
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Blood_Glucose - Filter option is not visible");
            getScreenshot("Vitals_Blood_Glucose_Filter");
        }
        Thread.sleep(2000);
        driver.navigate().back();
    }

}

