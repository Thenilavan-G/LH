package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

import static IntegrationPages.TestBaseApp.*;
import static IntegrationPages.TestBaseApp.getScreenshot;

public class HomeScreenUIPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By homescreen_logo = By.id("com.lifehope:id/home_logo");
    By homepage_description = By.id("com.lifehope:id/txt_bible_quote");
    By home_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView\n");
    By calendar_image = By.id("com.lifehope:id/textview_Curret_Date");
    By clock = By.id("com.lifehope:id/clock_txt");
    By weather = By.id("com.lifehope:id/textview_current_weather");
    By text = By.id("com.lifehope:id/title");
    By quickhealthtest_logo = By.xpath("(//android.widget.ImageView[@content-desc=\"LifeHope Health\"])[1]");
    By quickhealthtest_text = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n");
    By bookatest_logo = By.xpath("(//android.widget.ImageView[@content-desc=\"LifeHope Health\"])[2]");
    By bookatest_text = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n");
    By labresults_logo = By.xpath("(//android.widget.ImageView[@content-desc=\"LifeHope Health\"])[3]");
    By labresults_text = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n");
    By vitals_logo = By.xpath("(//android.widget.ImageView[@content-desc=\"LifeHope Health\"])[4]\n");
    By vitals_text = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n");
    // By banner_slider=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/com.smarteist.autoimageslider.SliderPager/android.widget.FrameLayout/android.widget.LinearLayout");
    By banner_slider = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/com.smarteist.autoimageslider.SliderPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");

    public HomeScreenUIPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void setHomeScreenLogo() throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Ready to verify the Logo");
        Thread.sleep(10000);
        try {
            if (driver.findElement(homescreen_logo).isDisplayed()) {
                test19.log(LogStatus.PASS, "App Logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "App Logo not displayed");
                getScreenshot("HomeScreen_Logo");
            }
        } catch (NoSuchElementException e) {
            test19.log(LogStatus.FAIL, "HomeScreen UI not visible");
            getScreenshot("HomeUI");
        }
    }

    public void setHomepageDescription(String desc) throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Homepage description");
        Thread.sleep(3000);
        try {
            Thread.sleep(2000);
            String description = driver.findElement(homepage_description).getText();
            System.out.println(description);
            if (description.contains(desc)) {
                test19.log(LogStatus.PASS, "HomeScreen Description shown as per the requirement : " + description);
            } else {
                test19.log(LogStatus.WARNING, "HomeScreen Description not shown as per the requirement : " + description);
                getScreenshot("Desc");
            }
        } catch (NoSuchElementException | IOException e) {
            test19.log(LogStatus.FAIL, "HomeScreen description not visible");
            getScreenshot("HomeDesc");
        }
    }

    public void setCalendar() throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Calendar Image");
        Thread.sleep(2000);
        try {
            if (driver.findElement(calendar_image).isDisplayed()) {
                test19.log(LogStatus.PASS, "Calendar image displayed");
                String date = driver.findElement(calendar_image).getText();
                test19.log(LogStatus.PASS, "Calendar date shown as per the requirement : " + date);
            } else {
                test19.log(LogStatus.FAIL, "Calendar image not displayed");
                getScreenshot("Calendar_image");
            }
        } catch (NoSuchElementException e) {
            test19.log(LogStatus.FAIL, "Calendar image not visible");
            getScreenshot("Cal_Image");
        }
    }

    public void setClock() throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Clock Image");
        Thread.sleep(2000);
        try {
            if (driver.findElement(clock).isDisplayed()) {
                test19.log(LogStatus.PASS, "Clock image displayed");
                String date = driver.findElement(clock).getText();
                test19.log(LogStatus.PASS, "Clock time shown as per the requirement : " + date);
            } else {
                test19.log(LogStatus.FAIL, "Clock image not displayed");
                getScreenshot("Clock_image");
            }
        } catch (NoSuchElementException e) {
            test19.log(LogStatus.FAIL, "Clock image not visible");
            getScreenshot("Clock_Image");
        }
    }

    public void setWeather() throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Weather Image");
        Thread.sleep(2000);
        try {
            if (driver.findElement(weather).isDisplayed()) {
                test19.log(LogStatus.PASS, "Weather image displayed");
                String date = driver.findElement(weather).getText();
                test19.log(LogStatus.PASS, "Weather value shown as per the requirement : " + date);
            } else {
                test19.log(LogStatus.FAIL, "Weather image not displayed");
                getScreenshot("Weather_image");
            }
        } catch (NoSuchElementException e) {
            test19.log(LogStatus.FAIL, "Weather image not visible");
            getScreenshot("Weather_Image");
        }
    }

    public void setText(String txt) throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Homepage text");
        Thread.sleep(2000);
        try {
            String text1 = driver.findElement(text).getText();
            //test19.log(LogStatus.PASS, "HomeScreen text: " + text1);
            Thread.sleep(2000);
            if (text1.equals(txt)) {
                test19.log(LogStatus.PASS, "Text displayed : " + text1);
            } else {
                test19.log(LogStatus.FAIL, "Text is not displayed : " + text1);
                getScreenshot("Text1");
            }
        } catch (NoSuchElementException | IOException e) {
            test19.log(LogStatus.FAIL, "LH description is not displayed");
            getScreenshot("LH_Desc");
        }
    }

    public void setQuickHealthTestLogo() throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Quick health Test module Logo");
        Thread.sleep(2000);
        try {
            if (driver.findElement(quickhealthtest_logo).isDisplayed()) {
                test19.log(LogStatus.PASS, "Quick health test logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "Quick health test logo not displayed");
                getScreenshot("HealthTestLogo");
            }
        } catch (NoSuchElementException e) {
            test19.log(LogStatus.FAIL, "Quick health test module not visible");
            getScreenshot("QuickHealthTest");
        }
    }

    public void setQuickHealthTestText(String health) throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Quick Health Test text");
        Thread.sleep(2000);
        try {
            String qht = driver.findElement(quickhealthtest_text).getText();
            //test19.log(LogStatus.PASS, "QuickHealthTest Description: " + qht);
            Thread.sleep(2000);
            if (qht.contains(health)) {
                test19.log(LogStatus.PASS, "Quick Health Test text shown as per the requirement : " + qht);
            } else {
                test19.log(LogStatus.FAIL, "Quick Health Test text not shown as per the requirement : " + qht);
                getScreenshot("QH_Text");
            }
        } catch (NoSuchElementException | IOException e) {
            test19.log(LogStatus.FAIL, "Quick Health Test module not displayed");
            getScreenshot("QH_Text");
        }
    }

    public void setBookATestLogo() throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Book a Test module Logo");
        Thread.sleep(2000);
        try {
            if (driver.findElement(bookatest_logo).isDisplayed()) {
                test19.log(LogStatus.PASS, "Book a Test logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "Book a Test logo not displayed");
                getScreenshot("BookTest_logo");
            }
        } catch (NoSuchElementException e) {
            test19.log(LogStatus.FAIL, "Book a Test module not visible");
            getScreenshot("BookTest_Module");
        }
    }

    public void setBookATestText(String test) throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Book a Test module text");
        Thread.sleep(2000);
        try {
            String bat = driver.findElement(bookatest_text).getText();
            //test19.log(LogStatus.PASS, "Bookatest Description: " + bat);
            Thread.sleep(2000);
            if (bat.contains(test)) {
                test19.log(LogStatus.PASS, "Text shown as per the requirement : " + bat);
            } else {
                test19.log(LogStatus.FAIL, " Text not shown as per the requirement : " + bat);
                getScreenshot("BookTest_Text");
            }
        } catch (NoSuchElementException | IOException e) {
            test19.log(LogStatus.FAIL, "Book a Test module not visible");
            getScreenshot("BookTest_Text");
        }
    }

    public void setLabResultsLogo() throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Lab Results module Logo");
        Thread.sleep(2000);
        try {
            if (driver.findElement(labresults_logo).isDisplayed()) {
                test19.log(LogStatus.PASS, "Lab Results logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "Lab Results logo not displayed");
                getScreenshot("Lab_logo");
            }
        } catch (NoSuchElementException e) {
            test19.log(LogStatus.FAIL, "Lab Results module not visible");
            getScreenshot("Lab_Module");
        }
    }

    public void setLabResultsText(String results) throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Lab Results module text");
        Thread.sleep(2000);
        try {
            String lab = driver.findElement(labresults_text).getText();
            //test19.log(LogStatus.PASS, "Lab Results Description: " + lab);
            Thread.sleep(2000);
            if (lab.contains(results)) {
                test19.log(LogStatus.PASS, "Text shown as per the requirement : " + lab);
            } else {
                test19.log(LogStatus.FAIL, " Text not shown as per the requirement : " + lab);
                getScreenshot("Lab_Text");
            }
        } catch (NoSuchElementException | IOException e) {
            test19.log(LogStatus.FAIL, "Lab Results module not visible");
            getScreenshot("Lab_Text");
        }
    }

    public void setVitalsLogo() throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Vitals module Logo");
        Thread.sleep(2000);
        try {
            if (driver.findElement(vitals_logo).isDisplayed()) {
                test19.log(LogStatus.PASS, "Vitals logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "Vitals logo not displayed");
                getScreenshot("Vitals_logo");
            }
        } catch (NoSuchElementException e) {
            test19.log(LogStatus.FAIL, "Vitals module not visible");
            getScreenshot("Vitals_Module");
        }
    }

    public void setVitalsText(String vitals) throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying Vitals module text");
        Thread.sleep(2000);
        try {
            String lab = driver.findElement(vitals_text).getText();
            //test19.log(LogStatus.PASS, "Lab Results Description: " + lab);
            Thread.sleep(2000);
            if (lab.contains(vitals)) {
                test19.log(LogStatus.PASS, "Text shown as per the requirement : " + lab);
            } else {
                test19.log(LogStatus.FAIL, " Text not shown as per the requirement : " + lab);
                getScreenshot("Vitals_Text");
            }
        } catch (NoSuchElementException | IOException e) {
            test19.log(LogStatus.FAIL, "Vitals Results module not visible");
            getScreenshot("Vitals_Text");
        }
    }

    public void setBannerSlider() throws InterruptedException, IOException {
        test19.log(LogStatus.INFO, "Verifying the Banner Slides");
        Thread.sleep(2000);
        try {
            String banner = driver.findElement(banner_slider).getText();
            if (banner.contains("null")) {
                test19.log(LogStatus.PASS, "Banner displayed");
            } else {
                if (driver.findElement(banner_slider).isDisplayed()) {
                    test19.log(LogStatus.PASS, "Banner displayed");
                } else {
                    test19.log(LogStatus.WARNING, "Banner not displayed");
                    getScreenshot("BannerSlider");
                }
            }
        } catch (NoSuchElementException e) {
            test19.log(LogStatus.WARNING, "Banners not visible");
            getScreenshot("BannerSlider");
        }
    }

}
