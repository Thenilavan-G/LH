package AppPages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.sql.Time;

import static AppPages.AppTestBase.*;
import static AppPages.AppTestBase.getScreenshot;


public class HomeScreenUIPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By homescreen_logo = By.id("com.lifehope:id/home_logo");
    By homepage_description = By.id("com.lifehope:id/txt_bible_quote");
    //By home_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView\n");
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

    public void setHomeScreenLogo() throws IOException {
        test19.log(LogStatus.INFO, "Ready to verify the Logo");
        try {
            WebElement element = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(homescreen_logo));
            if (element.isDisplayed()) {
                test19.log(LogStatus.PASS, "App Logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "App Logo not displayed");
                getScreenshot("HomeScreen_Logo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "HomeScreen UI not visible");
            getScreenshot("HomeUI");
        }
    }

    public void setHomepageDescription(String desc) throws IOException {
        test19.log(LogStatus.INFO, "Verifying Homepage description");
        try {
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(homepage_description));
            String description = element.getText();
            System.out.println(description);
            if (description.contains(desc)) {
                test19.log(LogStatus.PASS, "HomeScreen Description shown as per the requirement : " + description);
            } else {
                test19.log(LogStatus.WARNING, "HomeScreen Description not shown as per the requirement : " + description);
                getScreenshot("Desc");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "HomeScreen description not visible");
            getScreenshot("HomeDesc");
        }
    }

    public void setCalendar() throws IOException {
        test19.log(LogStatus.INFO, "Verifying Calendar Image");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(calendar_image));
            if (element.isDisplayed()) {
                test19.log(LogStatus.PASS, "Calendar image displayed");
                String date = driver.findElement(calendar_image).getText();
                test19.log(LogStatus.PASS, "Calendar date shown as per the requirement : " + date);
            } else {
                test19.log(LogStatus.FAIL, "Calendar image not displayed");
                getScreenshot("Calendar_image");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Calendar image not visible");
            getScreenshot("Cal_Image");
        }
    }

    public void setClock() throws IOException {
        test19.log(LogStatus.INFO, "Verifying Clock Image");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(clock));
            if (element.isDisplayed()) {
                test19.log(LogStatus.PASS, "Clock image displayed");
                String date = driver.findElement(clock).getText();
                test19.log(LogStatus.PASS, "Clock time shown as per the requirement : " + date);
            } else {
                test19.log(LogStatus.FAIL, "Clock image not displayed");
                getScreenshot("Clock_image");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Clock image not visible");
            getScreenshot("Clock_Image");
        }
    }

    public void setWeather() throws IOException {
        test19.log(LogStatus.INFO, "Verifying Weather Image");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(weather));
            if (element.isDisplayed()) {
                test19.log(LogStatus.PASS, "Weather image displayed");
                String date = driver.findElement(weather).getText();
                test19.log(LogStatus.PASS, "Weather value shown as per the requirement : " + date);
            } else {
                test19.log(LogStatus.FAIL, "Weather image not displayed");
                getScreenshot("Weather_image");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Weather image not visible");
            getScreenshot("Weather_Image");
        }
    }

    public void setText(String txt) throws IOException {
        test19.log(LogStatus.INFO, "Verifying Homepage text");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(text));
            String text1 = element.getText();
            //test19.log(LogStatus.PASS, "HomeScreen text: " + text1);
            if (text1.equals(txt)) {
                test19.log(LogStatus.PASS, "Text displayed : " + text1);
            } else {
                test19.log(LogStatus.FAIL, "Text is not displayed : " + text1);
                getScreenshot("Text1");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "LH description is not displayed");
            getScreenshot("LH_Desc");
        }
    }

    public void setQuickHealthTestLogo() throws IOException {
        test19.log(LogStatus.INFO, "Verifying Quick health Test module Logo");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(quickhealthtest_logo));
            if (element.isDisplayed()) {
                test19.log(LogStatus.PASS, "Quick health test logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "Quick health test logo not displayed");
                getScreenshot("HealthTestLogo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Quick health test module not visible");
            getScreenshot("QuickHealthTest");
        }
    }

    public void setQuickHealthTestText(String health) throws IOException {
        test19.log(LogStatus.INFO, "Verifying Quick Health Test text");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(quickhealthtest_text));
            String qht = element.getText();
            //test19.log(LogStatus.PASS, "QuickHealthTest Description: " + qht);
            if (qht.contains(health)) {
                test19.log(LogStatus.PASS, "Quick Health Test text shown as per the requirement : " + qht);
            } else {
                test19.log(LogStatus.FAIL, "Quick Health Test text not shown as per the requirement : " + qht);
                getScreenshot("QH_Text");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Quick Health Test module not displayed");
            getScreenshot("QH_Text");
        }
    }

    public void setBookATestLogo() throws IOException {
        test19.log(LogStatus.INFO, "Verifying Book a Test module Logo");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(bookatest_logo));
            if (element.isDisplayed()) {
                test19.log(LogStatus.PASS, "Book a Test logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "Book a Test logo not displayed");
                getScreenshot("BookTest_logo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Book a Test module not visible");
            getScreenshot("BookTest_Module");
        }
    }

    public void setBookATestText(String test) throws IOException {
        test19.log(LogStatus.INFO, "Verifying Book a Test module text");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(bookatest_text));
            String bat = element.getText();
            //test19.log(LogStatus.PASS, "Bookatest Description: " + bat);
            if (bat.contains(test)) {
                test19.log(LogStatus.PASS, "Text shown as per the requirement : " + bat);
            } else {
                test19.log(LogStatus.FAIL, " Text not shown as per the requirement : " + bat);
                getScreenshot("BookTest_Text");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Book a Test module not visible");
            getScreenshot("BookTest_Text");
        }
    }

    public void setLabResultsLogo() throws IOException {
        test19.log(LogStatus.INFO, "Verifying Lab Results module Logo");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(labresults_logo));
            if (element.isDisplayed()) {
                test19.log(LogStatus.PASS, "Lab Results logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "Lab Results logo not displayed");
                getScreenshot("Lab_logo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Lab Results module not visible");
            getScreenshot("Lab_Module");
        }
    }

    public void setLabResultsText(String results) throws IOException {
        test19.log(LogStatus.INFO, "Verifying Lab Results module text");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(labresults_text));
            String lab = element.getText();
            //test19.log(LogStatus.PASS, "Lab Results Description: " + lab);
            if (lab.contains(results)) {
                test19.log(LogStatus.PASS, "Text shown as per the requirement : " + lab);
            } else {
                test19.log(LogStatus.FAIL, " Text not shown as per the requirement : " + lab);
                getScreenshot("Lab_Text");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Lab Results module not visible");
            getScreenshot("Lab_Text");
        }
    }

    public void setVitalsLogo() throws IOException {
        test19.log(LogStatus.INFO, "Verifying Vitals module Logo");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(vitals_logo));
            if (element.isDisplayed()) {
                test19.log(LogStatus.PASS, "Vitals logo displayed");
            } else {
                test19.log(LogStatus.FAIL, "Vitals logo not displayed");
                getScreenshot("Vitals_logo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Vitals module not visible");
            getScreenshot("Vitals_Module");
        }
    }

    public void setVitalsText(String vitals) throws IOException {
        test19.log(LogStatus.INFO, "Verifying Vitals module text");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(vitals_text));
            String lab = element.getText();
            //test19.log(LogStatus.PASS, "Lab Results Description: " + lab);
            if (lab.contains(vitals)) {
                test19.log(LogStatus.PASS, "Text shown as per the requirement : " + lab);
            } else {
                test19.log(LogStatus.FAIL, " Text not shown as per the requirement : " + lab);
                getScreenshot("Vitals_Text");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test19.log(LogStatus.FAIL, "Vitals Results module not visible");
            getScreenshot("Vitals_Text");
        }
    }

    public void setBannerSlider() throws IOException {
        test19.log(LogStatus.INFO, "Verifying the Banner Slides");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(banner_slider));
            String banner = element.getText();
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
        } catch (NoSuchElementException | TimeoutException e) {
            test19.log(LogStatus.WARNING, "Banners not visible");
            getScreenshot("BannerSlider");
        }
    }

}
