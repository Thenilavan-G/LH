package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import static IntegrationPages.TestBaseApp.*;

public class VitalsPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By vitals_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n");
    By vitals_image = By.xpath("(//android.widget.ImageView[@content-desc=\"LifeHope Health\"])[4]\n");
    By vitals = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout\n");
    By vitals_inside_header = By.id("com.lifehope:id/textViewLabel");
    By enter_vitals = By.id("com.lifehope:id/buttonValueAdd");
    By band_popup = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup\n");
    By band_image = By.id("com.lifehope:id/imageViewVitalImage");
    By band_header = By.id("com.lifehope:id/textViewHeading");
    By band_text = By.id("com.lifehope:id/textViewFitBandText");
    By band_manual = By.id("com.lifehope:id/buttonManualFeed");
    By band_pair = By.id("com.lifehope:id/buttonPairFitBand");
    By band_close = By.id("com.lifehope:id/imageButtonClose");
    By value_enter_popup = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout\n");
    By value_enter_close = By.id("com.lifehope:id/imageviewClose");
    By bodyTemperature = By.id("com.lifehope:id/edittext_temperature");
    By oxygenLevel = By.id("com.lifehope:id/edittext_breathData");
    By weight = By.id("com.lifehope:id/editTextWeight");
    By blood_pressure = By.id("com.lifehope:id/edittextBPM");
    By hearts_beats = By.id("com.lifehope:id/edittextBP");
    By done = By.id("com.lifehope:id/buttonDone");
    By ECG = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]\n");
    By ECG_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView\n");
    By ECG_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]\n");
    By ECG_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]\n");
    By ECG_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\n");
    By ECG_Chart = By.id("com.lifehope:id/chart1");
    By chart_inHead = By.id("com.lifehope:id/textViewLabel");
    By chart_back = By.id("com.lifehope:id/imageview_back_arrow");
    By chart_Filter = By.id("com.lifehope:id/imageViewHistory");
    By chart_inLogo = By.id("com.lifehope:id/imageViewVitalsImage");
    By chart_date_header = By.id("com.lifehope:id/textViewHeading");
    By chart_Content = By.id("com.lifehope:id/textViewContent");
    By chart_date_popup = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup\n");
    By chart_date_head = By.id("com.lifehope:id/textViewFilterLabel");
    By chart_start_date = By.id("com.lifehope:id/editTextStartDate");
    By chart_select_date_popup = By.id("android:id/parentPanel");
    By chart_prev_month = By.xpath("//android.widget.ImageButton[@content-desc=\"Previous month\"]\n");
    By chart_select_date = By.xpath("//android.view.View[@content-desc=\"02 March 2021\"]\n");
    By chart_date_OK_button = By.id("android:id/button1");
    By chart_end_date = By.id("com.lifehope:id/editTextEndDate");
    By chart_date_cancel_button = By.id("android:id/button2");
    By chart_select_date_cancel = By.id("com.lifehope:id/buttonCancel");
    By chart_apply_filter_button = By.id("com.lifehope:id/buttonFilter");
    By chart_Share_report = By.id("com.lifehope:id/buttonShare");
    By share_copy_link = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView\n");
    By share_report_copy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout\n");
    By BPM = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout\n");
    By BPM_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView\n");
    By BPM_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]\n");
    By BPM_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]\n");
    By BPM_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\n");
    By BPM_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\n");
    By BPM_Chart = By.id("com.lifehope:id/temperatureChart");
    By bodyTemp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup\n");
    By temp_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView\n");
    By temp_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]\n");
    By temp_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]\n");
    By temp_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\n");
    By temp_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\n");
    By temp_Chart = By.id("com.lifehope:id/temperatureChart");
    By oxyLevel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup\n");
    By oxy_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView\n");
    By oxy_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]\n");
    By oxy_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]\n");
    By oxy_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\n");
    By oxy_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\n");
    By oxy_Chart = By.id("com.lifehope:id/oxygenChart");
    By bloodPressure = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup\n");
    By bp_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView\n");
    By bp_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]\n");
    By bp_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]\n");
    By bp_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\n");
    By bp_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\n");
    By bp_Chart = By.id("com.lifehope:id/bloodPressureChart");
    By weigh = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup\n");
    By weight_logo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView\n");
    By weight_header = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]\n");
    By weight_time = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]\n");
    By weight_value = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\n");
    By weight_arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\n");
    By weight_Chart = By.id("com.lifehope:id/weightChart");
    By back_home = By.id("com.lifehope:id/imageViewBackArrow");

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
            Thread.sleep(2000);
            if (driver.findElement(vitals_image).isDisplayed()) {
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

    public void setVitals() throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to click the Vitals");
        try {
            Thread.sleep(2000);
            driver.findElement(vitals).click();
            test18.log(LogStatus.PASS, "Vitals module clicked");
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Vitals module not visible");
            getScreenshot("Vital_Module");
        }
    }

    public void setVitalsinside_header(String h) throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to verify the inside header");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(vitals_inside_header)).isDisplayed();
            Thread.sleep(5000);
            String header = driver.findElement(vitals_inside_header).getText();
            //System.out.println(Mobile);
            if (header.contains(h)) {
                test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + header);
            } else {
                test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + header);
                getScreenshot("vitalsinside_headerText");
            }
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Inside Header text not visible");
            getScreenshot("vitals_UI_inside_HeaderText");
        }
    }

    public void setEntervitals() throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to verify the Vitals enter button");
        try {
            Thread.sleep(5000);
            driver.findElement(enter_vitals).click();
            test18.log(LogStatus.PASS, "Vitals enter field clicked");
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Vitals enter field visible");
            getScreenshot("Vital_EntField");
        }
    }

    public void verifyBand(String H) throws IOException {
        test18.log(LogStatus.INFO, "Ready to verify the band popup screen");
        try {
            Thread.sleep(2000);
            if(driver.findElement(band_manual).isDisplayed()) {
                Thread.sleep(1000);
                if(driver.findElement(band_image).isDisplayed()) {
                    test18.log(LogStatus.PASS, "LifeHope Health Band Image is visible");
                } else {
                    test18.log(LogStatus.FAIL, "LifeHope Health Band Image is not visible");
                    getScreenshot("Vital_BandImage");
                }
                Thread.sleep(2000);
                String h = driver.findElement(band_header).getText();
                if(h.equals(H)) {
                    test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h);
                } else {
                    test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h);
                    getScreenshot("Vital_BandHeader");
                }
                Thread.sleep(2000);
                String h1 = driver.findElement(band_text).getText();
                if(h1.equals("null") || h1.isEmpty()) {
                    test18.log(LogStatus.FAIL, "Band Content not shown as per the requirement : " + h1);
                    getScreenshot("Vital_BandContent");
                } else {
                    test18.log(LogStatus.PASS, "Band Content shown as per the requirement : " + h1);
                }
                Thread.sleep(2000);
                driver.findElement(band_pair).click();
                test18.log(LogStatus.SKIP, "Pair fit band button clicked");
                Thread.sleep(2000);
                if(driver.findElement(enter_vitals).isDisplayed()) {
                    driver.findElement(enter_vitals).click();
                    test18.log(LogStatus.PASS, "Vitals enter field clicked");
                } else {
                    driver.findElement(band_manual).click();
                    test18.log(LogStatus.PASS, "Vitals manual enter field clicked");
                }
                Thread.sleep(2000);
                try {
                    Thread.sleep(1000);
                    driver.findElement(band_manual).click();
                    test18.log(LogStatus.PASS, "Vitals manual enter button clicked");
                }catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Vitals manual enter button not visible");
                    getScreenshot("Vital_BandManual");
                }
            } else {
                test18.log(LogStatus.WARNING, "Vitals manual enter not visible");
                getScreenshot("Vital_BandManual");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test18.log(LogStatus.FAIL, "Vitals band popup screen not visible");
            getScreenshot("Vital_BandPopup");
        }
    }

    public void setBodytemperature(String T) throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to enter the Body Temperature value");
        try {
            Thread.sleep(2000);
            driver.hideKeyboard();
            driver.findElement(bodyTemperature).sendKeys(T);
            driver.hideKeyboard();
            test18.log(LogStatus.PASS, "Body Temperature value entered : " + T);
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Body Temperature enter field visible");
            getScreenshot("Vital_BTField");
        }
    }

    public void setOxygenlevel(String L) throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to enter the Oxygen Level");
        try {
            Thread.sleep(2000);
            driver.hideKeyboard();
            driver.findElement(oxygenLevel).sendKeys(L);
            driver.hideKeyboard();
            test18.log(LogStatus.PASS, "Oxygen level value entered : " + L);
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Oxygen level enter field visible");
            getScreenshot("Vital_OXYField");
        }
    }

    public void setWeight(String W) throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to enter the Weight value");
        try {
            Thread.sleep(2000);
            driver.hideKeyboard();
            driver.findElement(weight).sendKeys(W);
            driver.hideKeyboard();
            test18.log(LogStatus.PASS, "Weight value entered : " + W);
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Weight enter field visible");
            getScreenshot("Vital_WeightField");
        }
    }

    public void setBloodPressure(String B) throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to enter the Blood Pressure value");
        try {
            Thread.sleep(2000);
            driver.hideKeyboard();
            driver.findElement(blood_pressure).sendKeys(B);
            driver.hideKeyboard();
            test18.log(LogStatus.PASS, "Blood pressure value entered : " + B);
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Blood pressure enter field visible");
            getScreenshot("Vital_BPField");
        }
    }

    public void setHeartBeats(String M) throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to enter the Heart Beat value");
        try {
            Thread.sleep(2000);
            driver.hideKeyboard();
            driver.findElement(hearts_beats).sendKeys(M);
            driver.hideKeyboard();
            test18.log(LogStatus.PASS, "Heart beat value entered : " + M);
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Heart beat enter field visible");
            getScreenshot("Vital_HBField");
        }
    }

    public void setDone() throws InterruptedException, IOException {
        test18.log(LogStatus.INFO, "Ready to click the Done button");
        try {
            Thread.sleep(2000);
            driver.findElement(done).click();
            test18.log(LogStatus.PASS, "Clicked the done button");
        } catch (NoSuchElementException e) {
            test18.log(LogStatus.FAIL, "Done button visible");
            getScreenshot("Vital_Done");
        }
    }

    public void verifyECG(String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException {
        test18.log(LogStatus.INFO, "Ready to verify the ECG");
        try {
            Thread.sleep(5000);
            if(driver.findElement(ECG).isDisplayed()) {
                Thread.sleep(1000);
                if(driver.findElement(ECG_logo).isDisplayed()) {
                    test18.log(LogStatus.PASS, "ECG logo is visible");
                } else {
                    test18.log(LogStatus.FAIL, "ECG logo is not visible");
                    getScreenshot("Vital_ECGLogo");
                }
                Thread.sleep(2000);
                String h = driver.findElement(ECG_header).getText();
                if(h.equals(H)) {
                    test18.log(LogStatus.PASS, "ECG - Header text shown as per the requirement : " + h);
                } else {
                    test18.log(LogStatus.FAIL, "ECG - Header text not shown as per the requirement : " + h);
                    getScreenshot("Vital_ECGHeader");
                }
                Thread.sleep(2000);
                String h1 = driver.findElement(ECG_time).getText();
                if(h1.equals("null") || h1.isEmpty()) {
                    test18.log(LogStatus.FAIL, "ECG - Date and Time not shown as per the requirement : " + h1);
                    getScreenshot("Vital_ECGTime");
                } else {
                    test18.log(LogStatus.PASS, "ECG - Date and Time shown as per the requirement : " + h1);
                }
                Thread.sleep(2000);
                try {
                    driver.findElement(ECG_arrow).click();
                    test18.log(LogStatus.PASS, "ECG - Arrow icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "ECG - Arrow icon not visible");
                    getScreenshot("Vitals_ECGArrow");
                }
                Thread.sleep(2000);
                try {
                    String h2 = driver.findElement(chart_inHead).getText();
                    if(h2.contains(H)) {
                        test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                    } else {
                        test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                        getScreenshot("Vital_ECGInHeader");
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(chart_inLogo).isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_ECGInLogo");
                    }
                    Thread.sleep(2000);
                    String h3 = driver.findElement(chart_date_header).getText();
                    if(h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Dates not shown as per the requirement : " + h3);
                        getScreenshot("Vital_ECGTime");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Dates shown as per the requirement : " + h3);
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(ECG_Chart).isDisplayed()) {
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
                    Thread.sleep(2000);
                    String h4 = driver.findElement(chart_Content).getText();
                    if(h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_ECGContent");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    try {
                        Thread.sleep(2000);
                        driver.findElement(chart_Filter).click();
                        test12.log(LogStatus.PASS, "ECG - Filter icon clicked");
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "ECG- Filter option is not visible");
                        getScreenshot("Vitals_ECGFilter");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "ECG chart data is not visible");
                    getScreenshot("Vitals_ECGChartData");
                }
                Thread.sleep(2000);
                driver.findElement(chart_back).click();
                test18.log(LogStatus.PASS, "ECG Chart - Clicked the back icon");
            } else {
                test18.log(LogStatus.FAIL, "ECG is not visible");
                getScreenshot("Vitals_ECG");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test18.log(LogStatus.FAIL, "ECG is not visible");
            getScreenshot("Vitals_ECG");
        }
    }

    public void verifyHeartRate(String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException {
        test18.log(LogStatus.INFO, "Ready to verify the Heart Rate (BPM)");
        try {
            Thread.sleep(2000);
            if(driver.findElement(BPM).isDisplayed()) {
                Thread.sleep(1000);
                if(driver.findElement(BPM_logo).isDisplayed()) {
                    test18.log(LogStatus.PASS, "BPM logo is visible");
                } else {
                    test18.log(LogStatus.FAIL, "BPM logo is not visible");
                    getScreenshot("Vital_BPMLogo");
                }
                Thread.sleep(2000);
                String h = driver.findElement(BPM_header).getText();
                if(h.equals(H)) {
                    test18.log(LogStatus.PASS, "BPM - Header text shown as per the requirement : " + h);
                } else {
                    test18.log(LogStatus.FAIL, "BPM - Header text not shown as per the requirement : " + h);
                    getScreenshot("Vital_BPMHeader");
                }
                Thread.sleep(2000);
                String h1 = driver.findElement(BPM_time).getText();
                if(h1.equals("null") || h1.isEmpty()) {
                    test18.log(LogStatus.FAIL, "BPM - Date and Time not shown as per the requirement : " + h1);
                    getScreenshot("Vital_BPMTime");
                } else {
                    test18.log(LogStatus.PASS, "BPM - Date and Time shown as per the requirement : " + h1);
                }
                Thread.sleep(2000);
                String v = driver.findElement(BPM_value).getText();
                if(v.equals("null") || v.isEmpty()) {
                    test18.log(LogStatus.FAIL, "BPM - Recent entered value not shown as per the requirement : " + v);
                    getScreenshot("Vital_BPMValue");
                } else {
                    test18.log(LogStatus.PASS, "BPM - Recent entered value shown as per the requirement : " + v);
                }
                Thread.sleep(2000);
                try {
                    driver.findElement(BPM_arrow).click();
                    test18.log(LogStatus.PASS, "BPM - Arrow icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM - Arrow icon not visible");
                    getScreenshot("Vitals_BPMArrow");
                }
                Thread.sleep(2000);
                try {
                    String h2 = driver.findElement(chart_inHead).getText();
                    if(h2.contains(H)) {
                        test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                    } else {
                        test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                        getScreenshot("Vital_BPMInHeader");
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(chart_inLogo).isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_BPMInLogo");
                    }
                    Thread.sleep(2000);
                    String h3 = driver.findElement(chart_date_header).getText();
                    if(h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Dates not shown as per the requirement : " + h3);
                        getScreenshot("Vital_BPMTime");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Dates shown as per the requirement : " + h3);
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(BPM_Chart).isDisplayed()) {
                        test18.log(LogStatus.PASS, "BPM - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "BPM - Chart is not visible");
                        getScreenshot("Vital_BPMChart");
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
                    String h4 = driver.findElement(chart_Content).getText();
                    if(h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_BPMContent");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    Thread.sleep(1000);
                    try {
                        if(driver.findElement(chart_Share_report).isDisplayed()) {
                            String rep = driver.findElement(chart_Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "BPM - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "BPM - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_BPMRepButtonText");
                            }
                            Thread.sleep(2000);
                            driver.findElement(chart_Share_report).click();
                            test12.log(LogStatus.PASS, "BPM - Share button clicked");
                            Thread.sleep(1000);
                            String link = driver.findElement(share_copy_link).getText();
                            test12.log(LogStatus.INFO, "Share link : " + link);
                            Thread.sleep(2000);
                            driver.findElement(share_report_copy).click();
                            test12.log(LogStatus.PASS, "Share link Copied");
                        } else {
                            test18.log(LogStatus.SKIP, "BPM - Share report option is not visible");
                            getScreenshot("Vitals_BPMShareReport");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "BPM - Share report option is not visible");
                        getScreenshot("Vitals_BPMShareReport");
                    }
                    try {
                        Thread.sleep(2000);
                        driver.findElement(chart_Filter).click();
                        test12.log(LogStatus.PASS, "BPM - Filter icon clicked");
                        try {
                            Thread.sleep(2000);
                            String d = driver.findElement(chart_date_head).getText();
                            if(d.equals(DH)) {
                                test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement : " + d);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement : " + d);
                                getScreenshot("Vital_BPMDatesHeader");
                            }
                            Thread.sleep(2000);
                            String sd = driver.findElement(chart_start_date).getText();
                            if(sd.equals(SD)) {
                                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement : " + sd);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen start date text not shown as per the requirement : " + sd);
                                getScreenshot("Vital_BPMStartDate");
                            }
                            Thread.sleep(2000);
                            String ed = driver.findElement(chart_end_date).getText();
                            if(ed.equals(ED)) {
                                test18.log(LogStatus.PASS, "Date screen end date text shown as per the requirement : " + ed);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen end date text not shown as per the requirement : " + ed);
                                getScreenshot("Vital_BPMEndDate");
                            }
                            Thread.sleep(2000);
                            String cb = driver.findElement(chart_select_date_cancel).getText();
                            if(cb.equals(CB)) {
                                test18.log(LogStatus.PASS, "Date screen cancel button text shown as per the requirement : " + cb);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen cancel button text not shown as per the requirement : " + cb);
                                getScreenshot("Vital_BPMCancel");
                            }
                            Thread.sleep(2000);
                            String ab = driver.findElement(chart_apply_filter_button).getText();
                            if(ab.equals(AFB)) {
                                test18.log(LogStatus.PASS, "Date screen apply filter button text shown as per the requirement : " + ab);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen apply filter button text not shown as per the requirement : " + ab);
                                getScreenshot("Vital_BPMApply");
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "BPM - Filter date popup screen is not visible");
                            getScreenshot("Vitals_BPMFilterPopup");
                        }
                        try {
                            Thread.sleep(2000);
                            driver.findElement(chart_start_date).click();
                            test18.log(LogStatus.PASS, "BPM Filter - Clicked the Start date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "BPM Filter - Selected the Start date");
                            Thread.sleep(2000);
                            driver.findElement(chart_end_date).click();
                            test18.log(LogStatus.PASS, "BPM Filter - Clicked the End date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "BPM Filter - Selected the End date");
                            Thread.sleep(2000);
                            driver.findElement(chart_apply_filter_button).click();
                            test18.log(LogStatus.PASS, "BPM Filter - Clicked the Apply Filter button");
                            Thread.sleep(2000);
                            if(driver.findElement(BPM_Chart).isDisplayed()) {
                                test18.log(LogStatus.PASS, "BPM Filter - Chart is visible");
                            } else {
                                test18.log(LogStatus.FAIL, "BPM Filter - Chart is not visible");
                                getScreenshot("Vital_BPMFilterChart");
                            }
                            Thread.sleep(2000);
                            String h5 = driver.findElement(chart_date_header).getText();
                            if(h5.equals("null") || h5.isEmpty() || h5.contains("Jan 1, 1970")) {
                                test18.log(LogStatus.FAIL, "Chart Filter - Dates not shown as per the requirement : " + h5);
                                getScreenshot("Vital_BPMFilterDate");
                            } else {
                                test18.log(LogStatus.PASS, "Chart Filter - Dates shown as per the requirement : " + h5);
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "BPM - Filter date popup date fields are not visible");
                            getScreenshot("Vitals_BPMFilterPopup");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "BPM - Filter option is not visible");
                        getScreenshot("Vitals_BPMFilter");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BPM chart data is not visible");
                    getScreenshot("Vitals_BPMChartData");
                }
                Thread.sleep(2000);
                driver.findElement(chart_back).click();
                test18.log(LogStatus.PASS, "BPM Chart - Clicked the back icon");
            } else {
                test18.log(LogStatus.FAIL, "BPM is not visible");
                getScreenshot("Vitals_BPM");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test18.log(LogStatus.FAIL, "BPM is not visible");
            getScreenshot("Vitals_BPM");
        }
    }

    public void verifyBodyTemperature(String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException {
        test18.log(LogStatus.INFO, "Ready to verify the Body Temperature");
        try {
            Thread.sleep(2000);
            if(driver.findElement(bodyTemp).isDisplayed()) {
                Thread.sleep(1000);
                if(driver.findElement(temp_logo).isDisplayed()) {
                    test18.log(LogStatus.PASS, "BodyTemp logo is visible");
                } else {
                    test18.log(LogStatus.FAIL, "BodyTemp logo is not visible");
                    getScreenshot("Vital_BodyTempLogo");
                }
                Thread.sleep(2000);
                String h = driver.findElement(temp_header).getText();
                if(h.equals(H)) {
                    test18.log(LogStatus.PASS, "BodyTemp - Header text shown as per the requirement : " + h);
                } else {
                    test18.log(LogStatus.FAIL, "BodyTemp - Header text not shown as per the requirement : " + h);
                    getScreenshot("Vital_BodyTempHeader");
                }
                Thread.sleep(2000);
                String h1 = driver.findElement(temp_time).getText();
                if(h1.equals("null") || h1.isEmpty()) {
                    test18.log(LogStatus.FAIL, "BodyTemp - Date and Time not shown as per the requirement : " + h1);
                    getScreenshot("Vital_BodyTempTime");
                } else {
                    test18.log(LogStatus.PASS, "BodyTemp - Date and Time shown as per the requirement : " + h1);
                }
                Thread.sleep(2000);
                String v = driver.findElement(temp_value).getText();
                if(v.equals("null") || v.isEmpty()) {
                    test18.log(LogStatus.FAIL, "BodyTemp - Recent entered value not shown as per the requirement : " + v);
                    getScreenshot("Vital_BodyTempValue");
                } else {
                    test18.log(LogStatus.PASS, "BodyTemp - Recent entered value shown as per the requirement : " + v);
                }
                Thread.sleep(2000);
                try {
                    driver.findElement(temp_arrow).click();
                    test18.log(LogStatus.PASS, "BodyTemp - Arrow icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BodyTemp - Arrow icon not visible");
                    getScreenshot("Vitals_BodyTempArrow");
                }
                Thread.sleep(2000);
                try {
                    String h2 = driver.findElement(chart_inHead).getText();
                    if(h2.contains(H)) {
                        test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                    } else {
                        test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                        getScreenshot("Vital_BodyTempInHeader");
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(chart_inLogo).isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_BodyTempInLogo");
                    }
                    Thread.sleep(2000);
                    String h3 = driver.findElement(chart_date_header).getText();
                    if(h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Dates not shown as per the requirement : " + h3);
                        getScreenshot("Vital_BodyTempTime");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Dates shown as per the requirement : " + h3);
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(temp_Chart).isDisplayed()) {
                        test18.log(LogStatus.PASS, "BodyTemp - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "BodyTemp - Chart is not visible");
                        getScreenshot("Vital_BodyTempChart");
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
                    String h4 = driver.findElement(chart_Content).getText();
                    if(h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_BodyTempContent");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    Thread.sleep(1000);
                    try {
                        if(driver.findElement(chart_Share_report).isDisplayed()) {
                            String rep = driver.findElement(chart_Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "BodyTemp - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "BodyTemp - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_BodyTempRepButtonText");
                            }
                            Thread.sleep(2000);
                            driver.findElement(chart_Share_report).click();
                            test12.log(LogStatus.PASS, "BodyTemp - Share button clicked");
                            Thread.sleep(1000);
                            String link = driver.findElement(share_copy_link).getText();
                            test12.log(LogStatus.INFO, "Share link : " + link);
                            Thread.sleep(2000);
                            driver.findElement(share_report_copy).click();
                            test12.log(LogStatus.PASS, "Share link Copied");
                        } else {
                            test18.log(LogStatus.SKIP, "BodyTemp - Share report option is not visible");
                            getScreenshot("Vitals_BodyTempShareReport");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "BodyTemp - Share report option is not visible");
                        getScreenshot("Vitals_BodyTempShareReport");
                    }
                    try {
                        Thread.sleep(2000);
                        driver.findElement(chart_Filter).click();
                        test12.log(LogStatus.PASS, "BodyTemp - Filter icon clicked");
                        try {
                            Thread.sleep(2000);
                            String d = driver.findElement(chart_date_head).getText();
                            if(d.equals(DH)) {
                                test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement : " + d);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement : " + d);
                                getScreenshot("Vital_BodyTempDatesHeader");
                            }
                            Thread.sleep(2000);
                            String sd = driver.findElement(chart_start_date).getText();
                            if(sd.equals(SD)) {
                                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement : " + sd);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen start date text not shown as per the requirement : " + sd);
                                getScreenshot("Vital_BodyTempStartDate");
                            }
                            Thread.sleep(2000);
                            String ed = driver.findElement(chart_end_date).getText();
                            if(ed.equals(ED)) {
                                test18.log(LogStatus.PASS, "Date screen end date text shown as per the requirement : " + ed);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen end date text not shown as per the requirement : " + ed);
                                getScreenshot("Vital_BodyTempEndDate");
                            }
                            Thread.sleep(2000);
                            String cb = driver.findElement(chart_select_date_cancel).getText();
                            if(cb.equals(CB)) {
                                test18.log(LogStatus.PASS, "Date screen cancel button text shown as per the requirement : " + cb);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen cancel button text not shown as per the requirement : " + cb);
                                getScreenshot("Vital_BodyTempCancel");
                            }
                            Thread.sleep(2000);
                            String ab = driver.findElement(chart_apply_filter_button).getText();
                            if(ab.equals(AFB)) {
                                test18.log(LogStatus.PASS, "Date screen apply filter button text shown as per the requirement : " + ab);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen apply filter button text not shown as per the requirement : " + ab);
                                getScreenshot("Vital_BodyTempApply");
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "BPM - Filter date popup screen is not visible");
                            getScreenshot("Vitals_BodyTempFilterPopup");
                        }
                        try {
                            Thread.sleep(2000);
                            driver.findElement(chart_start_date).click();
                            test18.log(LogStatus.PASS, "BodyTemp Filter - Clicked the Start date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "BodyTemp Filter - Selected the Start date");
                            Thread.sleep(2000);
                            driver.findElement(chart_end_date).click();
                            test18.log(LogStatus.PASS, "BodyTemp Filter - Clicked the End date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "BodyTemp Filter - Selected the End date");
                            Thread.sleep(2000);
                            driver.findElement(chart_apply_filter_button).click();
                            test18.log(LogStatus.PASS, "BodyTemp Filter - Clicked the Apply Filter button");
                            Thread.sleep(2000);
                            if(driver.findElement(temp_Chart).isDisplayed()) {
                                test18.log(LogStatus.PASS, "BodyTemp Filter - Chart is visible");
                            } else {
                                test18.log(LogStatus.FAIL, "BodyTemp Filter - Chart is not visible");
                                getScreenshot("Vital_BodyTempFilterChart");
                            }
                            Thread.sleep(2000);
                            String h5 = driver.findElement(chart_date_header).getText();
                            if(h5.equals("null") || h5.isEmpty() || h5.contains("Jan 1, 1970")) {
                                test18.log(LogStatus.FAIL, "Chart Filter - Dates not shown as per the requirement : " + h5);
                                getScreenshot("Vital_BodyTempFilterDate");
                            } else {
                                test18.log(LogStatus.PASS, "Chart Filter - Dates shown as per the requirement : " + h5);
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "BodyTemp - Filter date popup date fields are not visible");
                            getScreenshot("Vitals_BodyTempFilterPopup");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "BodyTemp - Filter option is not visible");
                        getScreenshot("Vitals_BodyTempFilter");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BodyTemp chart data is not visible");
                    getScreenshot("Vitals_BodyTempChartData");
                }
                Thread.sleep(2000);
                driver.findElement(chart_back).click();
                test18.log(LogStatus.PASS, "BodyTemp Chart - Clicked the back icon");
            } else {
                test18.log(LogStatus.FAIL, "BodyTemp is not visible");
                getScreenshot("Vitals_BodyTemp");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test18.log(LogStatus.FAIL, "BodyTemp is not visible");
            getScreenshot("Vitals_BodyTemp");
        }
    }

    public void verifyOxygenLevel(String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException {
        test18.log(LogStatus.INFO, "Ready to verify the Oxygen Level");
        try {
            Thread.sleep(2000);
            if(driver.findElement(oxyLevel).isDisplayed()) {
                Thread.sleep(1000);
                if(driver.findElement(oxy_logo).isDisplayed()) {
                    test18.log(LogStatus.PASS, "Oxy logo is visible");
                } else {
                    test18.log(LogStatus.FAIL, "Oxy logo is not visible");
                    getScreenshot("Vital_OxyLogo");
                }
                Thread.sleep(2000);
                String h = driver.findElement(oxy_header).getText();
                if(h.equals(H)) {
                    test18.log(LogStatus.PASS, "Oxy - Header text shown as per the requirement : " + h);
                } else {
                    test18.log(LogStatus.FAIL, "Oxy - Header text not shown as per the requirement : " + h);
                    getScreenshot("Vital_OxyHeader");
                }
                Thread.sleep(2000);
                String h1 = driver.findElement(oxy_time).getText();
                if(h1.equals("null") || h1.isEmpty()) {
                    test18.log(LogStatus.FAIL, "Oxy - Date and Time not shown as per the requirement : " + h1);
                    getScreenshot("Vital_OxyTime");
                } else {
                    test18.log(LogStatus.PASS, "Oxy - Date and Time shown as per the requirement : " + h1);
                }
                Thread.sleep(2000);
                String v = driver.findElement(oxy_value).getText();
                if(v.equals("null") || v.isEmpty()) {
                    test18.log(LogStatus.FAIL, "Oxy - Recent entered value not shown as per the requirement : " + v);
                    getScreenshot("Vital_OxyValue");
                } else {
                    test18.log(LogStatus.PASS, "Oxy - Recent entered value shown as per the requirement : " + v);
                }
                Thread.sleep(2000);
                try {
                    driver.findElement(oxy_arrow).click();
                    test18.log(LogStatus.PASS, "Oxy - Arrow icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Oxy - Arrow icon not visible");
                    getScreenshot("Vitals_OxyArrow");
                }
                Thread.sleep(2000);
                try {
                    String h2 = driver.findElement(chart_inHead).getText();
                    if(h2.contains(H)) {
                        test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                    } else {
                        test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                        getScreenshot("Vital_OxyInHeader");
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(chart_inLogo).isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_OxyInLogo");
                    }
                    Thread.sleep(2000);
                    String h3 = driver.findElement(chart_date_header).getText();
                    if(h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Dates not shown as per the requirement : " + h3);
                        getScreenshot("Vital_OxyTime");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Dates shown as per the requirement : " + h3);
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(oxy_Chart).isDisplayed()) {
                        test18.log(LogStatus.PASS, "Oxy - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Oxy - Chart is not visible");
                        getScreenshot("Vital_OxyChart");
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
                    String h4 = driver.findElement(chart_Content).getText();
                    if(h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_OxyContent");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    Thread.sleep(1000);
                    try {
                        if(driver.findElement(chart_Share_report).isDisplayed()) {
                            String rep = driver.findElement(chart_Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "Oxy - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "Oxy - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_OxyRepButtonText");
                            }
                            Thread.sleep(2000);
                            driver.findElement(chart_Share_report).click();
                            test12.log(LogStatus.PASS, "Oxy - Share button clicked");
                            Thread.sleep(1000);
                            String link = driver.findElement(share_copy_link).getText();
                            test12.log(LogStatus.INFO, "Share link : " + link);
                            Thread.sleep(2000);
                            driver.findElement(share_report_copy).click();
                            test12.log(LogStatus.PASS, "Share link Copied");
                        } else {
                            test18.log(LogStatus.SKIP, "Oxy - Share report option is not visible");
                            getScreenshot("Vitals_OxyShareReport");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "Oxy - Share report option is not visible");
                        getScreenshot("Vitals_OxyShareReport");
                    }
                    try {
                        Thread.sleep(2000);
                        driver.findElement(chart_Filter).click();
                        test12.log(LogStatus.PASS, "Oxy - Filter icon clicked");
                        try {
                            Thread.sleep(2000);
                            String d = driver.findElement(chart_date_head).getText();
                            if(d.equals(DH)) {
                                test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement : " + d);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement : " + d);
                                getScreenshot("Vital_OxyDatesHeader");
                            }
                            Thread.sleep(2000);
                            String sd = driver.findElement(chart_start_date).getText();
                            if(sd.equals(SD)) {
                                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement : " + sd);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen start date text not shown as per the requirement : " + sd);
                                getScreenshot("Vital_OxyStartDate");
                            }
                            Thread.sleep(2000);
                            String ed = driver.findElement(chart_end_date).getText();
                            if(ed.equals(ED)) {
                                test18.log(LogStatus.PASS, "Date screen end date text shown as per the requirement : " + ed);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen end date text not shown as per the requirement : " + ed);
                                getScreenshot("Vital_OxyEndDate");
                            }
                            Thread.sleep(2000);
                            String cb = driver.findElement(chart_select_date_cancel).getText();
                            if(cb.equals(CB)) {
                                test18.log(LogStatus.PASS, "Date screen cancel button text shown as per the requirement : " + cb);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen cancel button text not shown as per the requirement : " + cb);
                                getScreenshot("Vital_OxyCancel");
                            }
                            Thread.sleep(2000);
                            String ab = driver.findElement(chart_apply_filter_button).getText();
                            if(ab.equals(AFB)) {
                                test18.log(LogStatus.PASS, "Date screen apply filter button text shown as per the requirement : " + ab);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen apply filter button text not shown as per the requirement : " + ab);
                                getScreenshot("Vital_OxyApply");
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "Oxy - Filter date popup screen is not visible");
                            getScreenshot("Vitals_OxyFilterPopup");
                        }
                        try {
                            Thread.sleep(2000);
                            driver.findElement(chart_start_date).click();
                            test18.log(LogStatus.PASS, "Oxy Filter - Clicked the Start date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "Oxy Filter - Selected the Start date");
                            Thread.sleep(2000);
                            driver.findElement(chart_end_date).click();
                            test18.log(LogStatus.PASS, "Oxy Filter - Clicked the End date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "Oxy Filter - Selected the End date");
                            Thread.sleep(2000);
                            driver.findElement(chart_apply_filter_button).click();
                            test18.log(LogStatus.PASS, "Oxy Filter - Clicked the Apply Filter button");
                            Thread.sleep(2000);
                            if(driver.findElement(oxy_Chart).isDisplayed()) {
                                test18.log(LogStatus.PASS, "Oxy Filter - Chart is visible");
                            } else {
                                test18.log(LogStatus.FAIL, "Oxy Filter - Chart is not visible");
                                getScreenshot("Vital_OxyFilterChart");
                            }
                            Thread.sleep(2000);
                            String h5 = driver.findElement(chart_date_header).getText();
                            if(h5.equals("null") || h5.isEmpty() || h5.contains("Jan 1, 1970")) {
                                test18.log(LogStatus.FAIL, "Chart Filter - Dates not shown as per the requirement : " + h5);
                                getScreenshot("Vital_OxyFilterDate");
                            } else {
                                test18.log(LogStatus.PASS, "Chart Filter - Dates shown as per the requirement : " + h5);
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "Oxy - Filter date popup date fields are not visible");
                            getScreenshot("Vitals_OxyFilterPopup");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "Oxy - Filter option is not visible");
                        getScreenshot("Vitals_OxyFilter");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Oxy chart data is not visible");
                    getScreenshot("Vitals_OxyChartData");
                }
                Thread.sleep(2000);
                driver.findElement(chart_back).click();
                test18.log(LogStatus.PASS, "Oxy Chart - Clicked the back icon");
            } else {
                test18.log(LogStatus.FAIL, "Oxy is not visible");
                getScreenshot("Vitals_Oxy");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test18.log(LogStatus.FAIL, "Oxy is not visible");
            getScreenshot("Vitals_Oxy");
        }
    }

    public void verifyBloodPressure(String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException {
        test18.log(LogStatus.INFO, "Ready to verify the Blood Pressure");
        try {
            Thread.sleep(2000);
            if(driver.findElement(bloodPressure).isDisplayed()) {
                Thread.sleep(1000);
                if(driver.findElement(bp_logo).isDisplayed()) {
                    test18.log(LogStatus.PASS, "BP logo is visible");
                } else {
                    test18.log(LogStatus.FAIL, "BP logo is not visible");
                    getScreenshot("Vital_BPLogo");
                }
                Thread.sleep(2000);
                String h = driver.findElement(bp_header).getText();
                if(h.equals(H)) {
                    test18.log(LogStatus.PASS, "BP - Header text shown as per the requirement : " + h);
                } else {
                    test18.log(LogStatus.FAIL, "BP - Header text not shown as per the requirement : " + h);
                    getScreenshot("Vital_BPHeader");
                }
                Thread.sleep(2000);
                String h1 = driver.findElement(bp_time).getText();
                if(h1.equals("null") || h1.isEmpty()) {
                    test18.log(LogStatus.FAIL, "BP - Date and Time not shown as per the requirement : " + h1);
                    getScreenshot("Vital_BPTime");
                } else {
                    test18.log(LogStatus.PASS, "BP - Date and Time shown as per the requirement : " + h1);
                }
                Thread.sleep(2000);
                String v = driver.findElement(bp_value).getText();
                if(v.equals("null") || v.isEmpty()) {
                    test18.log(LogStatus.FAIL, "BP - Recent entered value not shown as per the requirement : " + v);
                    getScreenshot("Vital_BPValue");
                } else {
                    test18.log(LogStatus.PASS, "BP - Recent entered value shown as per the requirement : " + v);
                }
                Thread.sleep(2000);
                try {
                    driver.findElement(bp_arrow).click();
                    test18.log(LogStatus.PASS, "BP - Arrow icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BP - Arrow icon not visible");
                    getScreenshot("Vitals_BPArrow");
                }
                Thread.sleep(2000);
                try {
                    String h2 = driver.findElement(chart_inHead).getText();
                    if(h2.contains(H)) {
                        test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                    } else {
                        test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                        getScreenshot("Vital_BPInHeader");
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(chart_inLogo).isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_BPInLogo");
                    }
                    Thread.sleep(2000);
                    String h3 = driver.findElement(chart_date_header).getText();
                    if(h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Dates not shown as per the requirement : " + h3);
                        getScreenshot("Vital_BPTime");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Dates shown as per the requirement : " + h3);
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(bp_Chart).isDisplayed()) {
                        test18.log(LogStatus.PASS, "BP - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "BP - Chart is not visible");
                        getScreenshot("Vital_BPChart");
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
                    String h4 = driver.findElement(chart_Content).getText();
                    if(h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_BPContent");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    Thread.sleep(1000);
                    try {
                        if(driver.findElement(chart_Share_report).isDisplayed()) {
                            String rep = driver.findElement(chart_Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "BP - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "BP - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_BPRepButtonText");
                            }
                            Thread.sleep(2000);
                            driver.findElement(chart_Share_report).click();
                            test12.log(LogStatus.PASS, "BP - Share button clicked");
                            Thread.sleep(1000);
                            String link = driver.findElement(share_copy_link).getText();
                            test12.log(LogStatus.INFO, "Share link : " + link);
                            Thread.sleep(2000);
                            driver.findElement(share_report_copy).click();
                            test12.log(LogStatus.PASS, "Share link Copied");
                        } else {
                            test18.log(LogStatus.SKIP, "BP - Share report option is not visible");
                            getScreenshot("Vitals_BPShareReport");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "BP - Share report option is not visible");
                        getScreenshot("Vitals_BPShareReport");
                    }
                    try {
                        Thread.sleep(2000);
                        driver.findElement(chart_Filter).click();
                        test12.log(LogStatus.PASS, "BP - Filter icon clicked");
                        try {
                            Thread.sleep(2000);
                            String d = driver.findElement(chart_date_head).getText();
                            if(d.equals(DH)) {
                                test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement : " + d);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement : " + d);
                                getScreenshot("Vital_BPDatesHeader");
                            }
                            Thread.sleep(2000);
                            String sd = driver.findElement(chart_start_date).getText();
                            if(sd.equals(SD)) {
                                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement : " + sd);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen start date text not shown as per the requirement : " + sd);
                                getScreenshot("Vital_BPStartDate");
                            }
                            Thread.sleep(2000);
                            String ed = driver.findElement(chart_end_date).getText();
                            if(ed.equals(ED)) {
                                test18.log(LogStatus.PASS, "Date screen end date text shown as per the requirement : " + ed);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen end date text not shown as per the requirement : " + ed);
                                getScreenshot("Vital_BPEndDate");
                            }
                            Thread.sleep(2000);
                            String cb = driver.findElement(chart_select_date_cancel).getText();
                            if(cb.equals(CB)) {
                                test18.log(LogStatus.PASS, "Date screen cancel button text shown as per the requirement : " + cb);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen cancel button text not shown as per the requirement : " + cb);
                                getScreenshot("Vital_BPCancel");
                            }
                            Thread.sleep(2000);
                            String ab = driver.findElement(chart_apply_filter_button).getText();
                            if(ab.equals(AFB)) {
                                test18.log(LogStatus.PASS, "Date screen apply filter button text shown as per the requirement : " + ab);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen apply filter button text not shown as per the requirement : " + ab);
                                getScreenshot("Vital_BPApply");
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "BP - Filter date popup screen is not visible");
                            getScreenshot("Vitals_BPFilterPopup");
                        }
                        try {
                            Thread.sleep(2000);
                            driver.findElement(chart_start_date).click();
                            test18.log(LogStatus.PASS, "BP Filter - Clicked the Start date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "BP Filter - Selected the Start date");
                            Thread.sleep(2000);
                            driver.findElement(chart_end_date).click();
                            test18.log(LogStatus.PASS, "BP Filter - Clicked the End date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "BP Filter - Selected the End date");
                            Thread.sleep(2000);
                            driver.findElement(chart_apply_filter_button).click();
                            test18.log(LogStatus.PASS, "BP Filter - Clicked the Apply Filter button");
                            Thread.sleep(2000);
                            if(driver.findElement(bp_Chart).isDisplayed()) {
                                test18.log(LogStatus.PASS, "BP Filter - Chart is visible");
                            } else {
                                test18.log(LogStatus.FAIL, "BP Filter - Chart is not visible");
                                getScreenshot("Vital_BPFilterChart");
                            }
                            Thread.sleep(2000);
                            String h5 = driver.findElement(chart_date_header).getText();
                            if(h5.equals("null") || h5.isEmpty() || h5.contains("Jan 1, 1970")) {
                                test18.log(LogStatus.FAIL, "Chart Filter - Dates not shown as per the requirement : " + h5);
                                getScreenshot("Vital_BPFilterDate");
                            } else {
                                test18.log(LogStatus.PASS, "Chart Filter - Dates shown as per the requirement : " + h5);
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "BP - Filter date popup date fields are not visible");
                            getScreenshot("Vitals_BPFilterPopup");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "BP - Filter option is not visible");
                        getScreenshot("Vitals_BPFilter");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "BP chart data is not visible");
                    getScreenshot("Vitals_BPChartData");
                }
                Thread.sleep(2000);
                driver.findElement(chart_back).click();
                test18.log(LogStatus.PASS, "BP Chart - Clicked the back icon");
            } else {
                test18.log(LogStatus.FAIL, "BP is not visible");
                getScreenshot("Vitals_BP");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test18.log(LogStatus.FAIL, "BP is not visible");
            getScreenshot("Vitals_BP");
        }
    }

    public void verifyWeight(String H, String S, String DH, String SD, String ED, String CB, String AFB) throws IOException {
        test18.log(LogStatus.INFO, "Ready to verify the Weight");
        try {
            Thread.sleep(2000);
            if(driver.findElement(weigh).isDisplayed()) {
                Thread.sleep(1000);
                if(driver.findElement(weight_logo).isDisplayed()) {
                    test18.log(LogStatus.PASS, "Weight logo is visible");
                } else {
                    test18.log(LogStatus.FAIL, "Weight logo is not visible");
                    getScreenshot("Vital_WeightLogo");
                }
                Thread.sleep(2000);
                String h = driver.findElement(weight_header).getText();
                if(h.equals(H)) {
                    test18.log(LogStatus.PASS, "Weight - Header text shown as per the requirement : " + h);
                } else {
                    test18.log(LogStatus.FAIL, "Weight - Header text not shown as per the requirement : " + h);
                    getScreenshot("Vital_WeightHeader");
                }
                Thread.sleep(2000);
                String h1 = driver.findElement(weight_time).getText();
                if(h1.equals("null") || h1.isEmpty()) {
                    test18.log(LogStatus.FAIL, "Weight - Date and Time not shown as per the requirement : " + h1);
                    getScreenshot("Vital_WeightTime");
                } else {
                    test18.log(LogStatus.PASS, "Weight - Date and Time shown as per the requirement : " + h1);
                }
                Thread.sleep(2000);
                String v = driver.findElement(weight_value).getText();
                if(v.equals("null") || v.isEmpty()) {
                    test18.log(LogStatus.FAIL, "Weight - Recent entered value not shown as per the requirement : " + v);
                    getScreenshot("Vital_WeightValue");
                } else {
                    test18.log(LogStatus.PASS, "Weight - Recent entered value shown as per the requirement : " + v);
                }
                Thread.sleep(2000);
                try {
                    driver.findElement(weight_arrow).click();
                    test18.log(LogStatus.PASS, "Weight - Arrow icon clicked");
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Weight - Arrow icon not visible");
                    getScreenshot("Vitals_WeightArrow");
                }
                Thread.sleep(2000);
                try {
                    String h2 = driver.findElement(chart_inHead).getText();
                    if(h2.contains(H)) {
                        test18.log(LogStatus.PASS, "Inside Header text shown as per the requirement : " + h2);
                    } else {
                        test18.log(LogStatus.FAIL, "Inside Header text not shown as per the requirement : " + h2);
                        getScreenshot("Vital_WeightInHeader");
                    }
                    Thread.sleep(1000);
                    if(driver.findElement(chart_inLogo).isDisplayed()) {
                        test18.log(LogStatus.PASS, "Inside logo is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Inside logo is not visible");
                        getScreenshot("Vital_WeightInLogo");
                    }
                    Thread.sleep(2000);
                    String h3 = driver.findElement(chart_date_header).getText();
                    if(h3.equals("null") || h3.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Dates not shown as per the requirement : " + h3);
                        getScreenshot("Vital_WeightTime");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Dates shown as per the requirement : " + h3);
                    }
                    Thread.sleep(2000);
                    if(driver.findElement(weight_Chart).isDisplayed()) {
                        test18.log(LogStatus.PASS, "Weight - Chart is visible");
                    } else {
                        test18.log(LogStatus.FAIL, "Weight - Chart is not visible");
                        getScreenshot("Vital_WeightChart");
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
                    String h4 = driver.findElement(chart_Content).getText();
                    if(h4.equals("null") || h4.isEmpty()) {
                        test18.log(LogStatus.FAIL, "Chart - Content not shown as per the requirement : " + h4);
                        getScreenshot("Vital_WeightContent");
                    } else {
                        test18.log(LogStatus.PASS, "Chart - Content shown as per the requirement : " + h4);
                    }
                    Thread.sleep(1000);
                    try {
                        if(driver.findElement(chart_Share_report).isDisplayed()) {
                            String rep = driver.findElement(chart_Share_report).getText();
                            if (rep.equals(S)) {
                                test18.log(LogStatus.PASS, "Weight - Share report button text shown as per the requirement : " + rep);
                            } else {
                                test18.log(LogStatus.FAIL, "Weight - Share report button text not shown as per the requirement : " + rep);
                                getScreenshot("Vital_WeightRepButtonText");
                            }
                            Thread.sleep(2000);
                            driver.findElement(chart_Share_report).click();
                            test12.log(LogStatus.PASS, "Weight - Share button clicked");
                            Thread.sleep(1000);
                            String link = driver.findElement(share_copy_link).getText();
                            test12.log(LogStatus.INFO, "Share link : " + link);
                            Thread.sleep(2000);
                            driver.findElement(share_report_copy).click();
                            test12.log(LogStatus.PASS, "Share link Copied");
                        } else {
                            test18.log(LogStatus.SKIP, "Weight - Share report option is not visible");
                            getScreenshot("Vitals_WeightShareReport");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.SKIP, "Weight - Share report option is not visible");
                        getScreenshot("Vitals_WeightShareReport");
                    }
                    try {
                        Thread.sleep(2000);
                        driver.findElement(chart_Filter).click();
                        test12.log(LogStatus.PASS, "Weight - Filter icon clicked");
                        try {
                            Thread.sleep(2000);
                            String d = driver.findElement(chart_date_head).getText();
                            if(d.equals(DH)) {
                                test18.log(LogStatus.PASS, "Date screen Header text shown as per the requirement : " + d);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen Header text not shown as per the requirement : " + d);
                                getScreenshot("Vital_WeightDatesHeader");
                            }
                            Thread.sleep(2000);
                            String sd = driver.findElement(chart_start_date).getText();
                            if(sd.equals(SD)) {
                                test18.log(LogStatus.PASS, "Date screen start date text shown as per the requirement : " + sd);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen start date text not shown as per the requirement : " + sd);
                                getScreenshot("Vital_WeightStartDate");
                            }
                            Thread.sleep(2000);
                            String ed = driver.findElement(chart_end_date).getText();
                            if(ed.equals(ED)) {
                                test18.log(LogStatus.PASS, "Date screen end date text shown as per the requirement : " + ed);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen end date text not shown as per the requirement : " + ed);
                                getScreenshot("Vital_WeightEndDate");
                            }
                            Thread.sleep(2000);
                            String cb = driver.findElement(chart_select_date_cancel).getText();
                            if(cb.equals(CB)) {
                                test18.log(LogStatus.PASS, "Date screen cancel button text shown as per the requirement : " + cb);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen cancel button text not shown as per the requirement : " + cb);
                                getScreenshot("Vital_WeightCancel");
                            }
                            Thread.sleep(2000);
                            String ab = driver.findElement(chart_apply_filter_button).getText();
                            if(ab.equals(AFB)) {
                                test18.log(LogStatus.PASS, "Date screen apply filter button text shown as per the requirement : " + ab);
                            } else {
                                test18.log(LogStatus.FAIL, "Date screen apply filter button text not shown as per the requirement : " + ab);
                                getScreenshot("Vital_WeightApply");
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "Weight - Filter date popup screen is not visible");
                            getScreenshot("Vitals_WeightFilterPopup");
                        }
                        try {
                            Thread.sleep(2000);
                            driver.findElement(chart_start_date).click();
                            test18.log(LogStatus.PASS, "Weight Filter - Clicked the Start date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "Weight Filter - Selected the Start date");
                            Thread.sleep(2000);
                            driver.findElement(chart_end_date).click();
                            test18.log(LogStatus.PASS, "Weight Filter - Clicked the End date");
                            //Thread.sleep(2000);
                            //driver.findElement(chart_prev_month).click();
                            //Thread.sleep(2000);
                            //driver.findElement(chart_select_date).click();
                            Thread.sleep(2000);
                            driver.findElement(chart_date_OK_button).click();
                            test18.log(LogStatus.PASS, "Weight Filter - Selected the End date");
                            Thread.sleep(2000);
                            driver.findElement(chart_apply_filter_button).click();
                            test18.log(LogStatus.PASS, "Weight Filter - Clicked the Apply Filter button");
                            Thread.sleep(2000);
                            if(driver.findElement(weight_Chart).isDisplayed()) {
                                test18.log(LogStatus.PASS, "Weight Filter - Chart is visible");
                            } else {
                                test18.log(LogStatus.FAIL, "Weight Filter - Chart is not visible");
                                getScreenshot("Vital_WeightFilterChart");
                            }
                            Thread.sleep(2000);
                            String h5 = driver.findElement(chart_date_header).getText();
                            if(h5.equals("null") || h5.isEmpty() || h5.contains("Jan 1, 1970")) {
                                test18.log(LogStatus.FAIL, "Chart Filter - Dates not shown as per the requirement : " + h5);
                                getScreenshot("Vital_WeightFilterDate");
                            } else {
                                test18.log(LogStatus.PASS, "Chart Filter - Dates shown as per the requirement : " + h5);
                            }
                        } catch (NoSuchElementException e) {
                            test18.log(LogStatus.FAIL, "Weight - Filter date popup date fields are not visible");
                            getScreenshot("Vitals_WeightFilterPopup");
                        }
                    } catch (NoSuchElementException e) {
                        test18.log(LogStatus.FAIL, "Weight - Filter option is not visible");
                        getScreenshot("Vitals_WeightFilter");
                    }
                } catch (NoSuchElementException e) {
                    test18.log(LogStatus.FAIL, "Weight chart data is not visible");
                    getScreenshot("Vitals_WeightChartData");
                }
                Thread.sleep(2000);
                driver.findElement(chart_back).click();
                test18.log(LogStatus.PASS, "Weight Chart - Clicked the back icon");
            } else {
                test18.log(LogStatus.FAIL, "Weight is not visible");
                getScreenshot("Vitals_Weight");
            }
        } catch (NoSuchElementException | InterruptedException | IOException e) {
            test18.log(LogStatus.FAIL, "Weight is not visible");
            getScreenshot("Vitals_Weight");
        }
    }

    public void backHome() throws InterruptedException {
        test18.log(LogStatus.INFO, "Ready to go back to home screen");
        try {
            Thread.sleep(2000);
            driver.findElement(back_home).click();
            test18.log(LogStatus.PASS, "Clicked the back icon");
        } catch (NoSuchElementException | InterruptedException e) {
            Thread.sleep(2000);
            driver.navigate().back();
        }
    }

}
