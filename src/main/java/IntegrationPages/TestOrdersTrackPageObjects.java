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
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;
import java.time.Duration;

import static IntegrationPages.TestBaseApp.getScreenshot;
import static IntegrationPages.TestBaseApp.test16;

public class TestOrdersTrackPageObjects {

    private final AppiumDriver<MobileElement> driver;

    By menu = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n");
    By test_orders = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView\n");
    By arrow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView\n");
    By track_head = By.id("com.lifehope:id/lay_title");
    By test_name = By.id("com.lifehope:id/textview_test_heading");
    By test_image = By.id("com.lifehope:id/imageview_testImage");
    By test_date = By.id("com.lifehope:id/textview_test_date");
    By sched_time = By.id("com.lifehope:id/textview_schedule_time");
    By test_price = By.id("com.lifehope:id/textview_price");
    By test_count = By.id("com.lifehope:id/textview_count");
    By test_type = By.id("com.lifehope:id/textview_test_type");
    By test_status = By.id("com.lifehope:id/textview_test_status");
    By test_order_id = By.id("com.lifehope:id/textview_test_orderid");
    By order_place = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By order_place_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By user_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By place_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By progress_place = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.View\n");
    By order_confirm = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By order_conf_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By conf_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By conf_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By progress_conf = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.View\n");
    By doctor_visit = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By doctor_visit_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By doctor_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By doctor_arrv_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By doctor_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]\n");
    By doctor_phone = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[4]\n");
    By progress_doc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.View\n");
    By sample_receive = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By sample_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By sampler_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By sample_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By progress_sample = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.View\n");
    By test_inprogress = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By inprogress_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By lab_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]\n");
    By lab_user = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By lab_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By progress_lab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.View\n");
    By report_generate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By report_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By report_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By report_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By progress_report = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.View\n");
    By sample_receives = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By sample_descs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By sampler_names = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    //By sample_dates = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By progress_samples = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.View\n");
    By test_inprogresss = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By inprogress_descs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By lab_names = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]\n");
    //By lab_users = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    //By lab_dates = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By progress_labs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.View\n");
    By report_generates = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By report_descs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By report_names = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    //By report_dates = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By progress_reports = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.view.View\n");
    By self_kit_ship = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_kit_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_kit_user = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_kit_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_kit_ship_id = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]\n");
    By self_progress_kit_ship = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.View\n");
    By self_kit_return = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_kit_ret_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_kit_ret_user = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_kit_ret_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_kit_ret_id = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]\n");
    By self_progress_return = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.View\n");
    By self_sample_receive = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_sample_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_sampler_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_sample_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_progress_sample = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.View\n");
    By self_test_inprogress = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_inprogress_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_lab_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]\n");
    By self_lab_user = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_lab_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_progress_lab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.View\n");
    By self_report_generate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_report_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_report_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_report_date = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    By self_progress_report = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.View\n");
    By self_report_generates = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_report_descs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_report_names = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    //By self_report_dates = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_progress_reports = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.view.View\n");
    By self_kit_returns = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_kit_ret_descs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_kit_ret_users = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    //By self_kit_ret_dates = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_kit_ret_ids = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]\n");
    //By self_progress_returns = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.View\n");
    By self_sample_receives = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_sample_descs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_sampler_names = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    //By self_sample_dates = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_progress_samples = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.View\n");
    By self_test_inprogresss = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    By self_inprogress_descs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_lab_names = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]\n");
    //By self_lab_users = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    //By self_lab_dates = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_progress_labs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.View\n");
    //By self_report_generatess = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    //By self_report_descss = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_report_namess = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
    //By self_report_datess = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]\n");
    //By self_progress_reportss = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.View\n");

    By back_test_orders = By.id("com.lifehope:id/back_img");
    By back_home = By.id("com.lifehope:id/imageviewBackArrow");

    public TestOrdersTrackPageObjects(AppiumDriver<MobileElement> driver) {

        this.driver = driver;
    }

    public void gotoTestOrders() throws InterruptedException {
        test16.log(LogStatus.INFO, "Ready to go to the Test Orders");
        try {
            Thread.sleep(2000);
            driver.findElement(menu).click();
            Thread.sleep(2000);
            driver.findElement(test_orders).click();
            test16.log(LogStatus.PASS, "Test Orders page opened");
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.SKIP, "Pages already stayed in Test Orders Screen");
        }
    }

    public void gotoOrderTrack(String H) throws InterruptedException, IOException {
        test16.log(LogStatus.INFO, "Ready to go to the Test Orders Track Screen");
        try {
            Thread.sleep(5000);
            driver.findElement(arrow).click();
            Thread.sleep(2000);
            String head = driver.findElement(track_head).getText();
            //System.out.println(head);
            if (head.contains(H)) {
                test16.log(LogStatus.PASS, "Tracking page header shown as per the requirement : " + head);
            } else {
                test16.log(LogStatus.FAIL, "Tracking page header not shown as per the requirement : " + head);
                getScreenshot("Track_Header");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Tracking page header not shown");
            getScreenshot("Track_Header");
        }
    }

    public void verifyOrderInfo() throws InterruptedException, IOException {
        test16.log(LogStatus.INFO, "Ready to verify the Test Orders Info");
        Thread.sleep(5000);
        try {
            String testName = driver.findElement(test_name).getText();
            //System.out.println(testName);
            if (testName.contains("null")) {
                test16.log(LogStatus.FAIL, "Test name not shown : " + testName);
                getScreenshot("Track_TestName");
            } else {
                test16.log(LogStatus.PASS, "Test name visible : " + testName);
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Test name not shown");
            getScreenshot("Track_TestName");
        }
        Thread.sleep(2000);
        try {
            String testDate = driver.findElement(test_date).getText();
            //System.out.println(testDate);
            if (testDate.contains("null")) {
                test16.log(LogStatus.FAIL, "Test date not shown : " + testDate);
                getScreenshot("Track_TestDate");
            } else {
                test16.log(LogStatus.PASS, "Test date visible : " + testDate);
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Test date not shown");
            getScreenshot("Track_TestDate");
        }
        try {
            Thread.sleep(2000);
            String testSchedule = driver.findElement(sched_time).getText();
            //System.out.println(testSchedule);
            if (testSchedule.contains("null")) {
                test16.log(LogStatus.FAIL, "Schedule time not shown : " + testSchedule);
                getScreenshot("Track_ScheduleTime");
            } else {
                test16.log(LogStatus.PASS, "Schedule time visible : " + testSchedule);
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.INFO, "This is not a scheduled order");
        }
        Thread.sleep(2000);
        try {
            String testPrice = driver.findElement(test_price).getText();
            //System.out.println(testPrice);
            if (testPrice.contains("null")) {
                test16.log(LogStatus.FAIL, "Test price not shown : " + testPrice);
                getScreenshot("Track_TestPrice");
            } else {
                test16.log(LogStatus.PASS, "Test price visible : " + testPrice);
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Test price not shown");
            getScreenshot("Track_TestPrice");
        }
        Thread.sleep(2000);
        try {
            String testImage = driver.findElement(test_image).getText();
            //System.out.println(testImage);
            if (testImage.contains("null")) {
                test16.log(LogStatus.FAIL, "Test image not shown");
                getScreenshot("Track_TestImage");
            } else {
                test16.log(LogStatus.PASS, "Test image visible");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Test image not shown");
            getScreenshot("Track_TestImage");
        }
        try {
            Thread.sleep(2000);
            String testCount = driver.findElement(test_count).getText();
            //System.out.println(testCount);
            if (testCount.contains("null")) {
                test16.log(LogStatus.FAIL, "Test count not shown : " + testCount);
                getScreenshot("Track_TestCount");
            } else {
                test16.log(LogStatus.PASS, "Test count visible : " + testCount);
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.INFO, "There is no Add-On members");
        }
        Thread.sleep(2000);
        try {
            String testType = driver.findElement(test_type).getText();
            //System.out.println(testType);
            if (testType.contains("null")) {
                test16.log(LogStatus.FAIL, "Test type not shown : " + testType);
                getScreenshot("Track_TestType");
            } else {
                test16.log(LogStatus.PASS, "Test type visible : " + testType);
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Test type not shown");
            getScreenshot("Track_TestType");
        }
        Thread.sleep(2000);
        try {
            String testStatus = driver.findElement(test_status).getText();
            //System.out.println(testStatus);
            if (testStatus.contains("null")) {
                test16.log(LogStatus.FAIL, "Test status not shown : " + testStatus);
                getScreenshot("Track_TestStatus");
            } else {
                test16.log(LogStatus.PASS, "Test status visible : " + testStatus);
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Test status not shown");
            getScreenshot("Track_TestStatus");
        }
        Thread.sleep(2000);
        try {
            String orderId = driver.findElement(test_order_id).getText();
            //System.out.println(orderId);
            if (orderId.contains("null")) {
                test16.log(LogStatus.FAIL, "Order ID not shown : " + orderId);
                getScreenshot("Track_OrderId");
            } else {
                test16.log(LogStatus.PASS, "Order ID visible : " + orderId);
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Order ID not shown");
            getScreenshot("Track_OrderId");
        }
    }

    public void verifyTestOrderPlaceScreen(String H, String D) throws InterruptedException, IOException {
        test16.log(LogStatus.INFO, "Ready to verify the Test Order Place Screen");
        try {
            Thread.sleep(2000);
            try {
                String placeHead = driver.findElement(order_place).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestPlaceTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestPlaceTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(order_place_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestPlaceDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestPlaceDesc");
            }
            Thread.sleep(2000);
            try {
                String placeName = driver.findElement(user_name).getText();
                //System.out.println(placeName);
                if (placeName.contains("null")) {
                    test16.log(LogStatus.FAIL, "User name not shown");
                    getScreenshot("Track_TestPlaceUser");
                } else {
                    test16.log(LogStatus.PASS, "User name visible");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "User name not shown");
                getScreenshot("Track_TestPlaceUser");
            }
            Thread.sleep(2000);
            try {
                String placeDate = driver.findElement(place_date).getText();
                //System.out.println(placeDate);
                if (placeDate.contains("null")) {
                    test16.log(LogStatus.FAIL, "Order placed date not shown");
                    getScreenshot("Track_TestPlaceDate");
                } else {
                    test16.log(LogStatus.PASS, "Order placed date visible");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Order placed date not shown");
                getScreenshot("Track_TestPlaceDate");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(progress_place).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Order place screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Order place screen indication not visible");
                    getScreenshot("Track_TestPlaceIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Order place screen indication not visible");
                getScreenshot("Track_TestPlaceIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Order place screen not visible");
            getScreenshot("Track_PlaceScreen");
        }
    }

    public void verifyTestOrderConfirmScreen(String H, String D) throws InterruptedException, IOException {
        test16.log(LogStatus.INFO, "Ready to verify the Test Order Confirmation Screen");
        try {
            Thread.sleep(2000);
            try {
                String placeHead = driver.findElement(order_confirm).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestConfTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestConfTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(order_conf_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestConfDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestConfDesc");
            }
            Thread.sleep(2000);
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("Approved")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(conf_name).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestConfUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestConfUser");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(conf_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Order confirmed date not shown");
                        getScreenshot("Track_TestConfDate");
                    } else {
                        test16.log(LogStatus.PASS, "Order confirmed date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Order confirmed date not shown");
                    getScreenshot("Track_TestConfDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order not Approved");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(progress_conf).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Order confirmed screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Order confirmed screen indication not visible");
                    getScreenshot("Track_TestConfIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Order confirmed screen indication not visible");
                getScreenshot("Track_TestConfIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Order Confirmed screen not visible");
            getScreenshot("Track_ConfScreen");
        }
    }

    public void verifyTestKitShipScreen(String H, String D) throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            try {
                String placeHead = driver.findElement(self_kit_ship).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestKitTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestKitTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(self_kit_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestKitDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestKitDesc");
            }
            Thread.sleep(2000);
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("InProgress")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(self_kit_user).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "User name not shown");
                        getScreenshot("Track_TestKitUser");
                    } else {
                        test16.log(LogStatus.PASS, "User name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "User name not shown");
                    getScreenshot("Track_TestKitUser");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(self_kit_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Kit Shipped date not shown");
                        getScreenshot("Track_TestKitDate");
                    } else {
                        test16.log(LogStatus.PASS, "Kit Shipped date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Kit Shipped date not shown");
                    getScreenshot("Track_TestKitDate");
                }
                Thread.sleep(2000);
                try {
                    String placeDates = driver.findElement(self_kit_ship_id).getText();
                    //System.out.println(placeDates);
                    if (placeDates.contains("null")) {
                        test16.log(LogStatus.FAIL, "Kit Shipping ID not shown");
                        getScreenshot("Track_TestKitId");
                    } else {
                        test16.log(LogStatus.PASS, "Kit Shipping ID visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Kit Shipping ID not shown");
                    getScreenshot("Track_TestKitId");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress State");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(self_progress_kit_ship).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test Kit Shipped screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test Kit Shipped screen indication not visible");
                    getScreenshot("Track_TestKitIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Test Kit Shipped screen indication not visible");
                getScreenshot("Track_TestKitIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Kit ship screen not visible");
            getScreenshot("Track_KitShipScreen");
        }
    }

    public void verifyTestKitReturnScreen(String H, String D) throws InterruptedException, IOException {
        try {
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
                String placeHead = driver.findElement(self_kit_return).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else if (placeHead.contains("Self collected by individuals at home and returned")) {
                    String placeHeads = driver.findElement(self_kit_returns).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(H)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestSampleTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestRetTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestRetTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(self_kit_ret_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else if (placeDesc.contains("Self collected by individuals at home and returned")) {
                    String placeHeads = driver.findElement(self_kit_ret_descs).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(H)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestSampleTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestRetDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestRetDesc");
            }
            Thread.sleep(2000);
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("InProgress")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(self_kit_ret_user).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "User name not shown");
                        getScreenshot("Track_TestRetUser");
                    } else {
                        test16.log(LogStatus.PASS, "User name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "User name not shown");
                    getScreenshot("Track_TestRetUser");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(self_kit_ret_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Kit Return date not shown");
                        getScreenshot("Track_TestRetDate");
                    } else {
                        test16.log(LogStatus.PASS, "Kit Return date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Kit Return date not shown");
                    getScreenshot("Track_TestRetDate");
                }
                Thread.sleep(2000);
                try {
                    String placeDates = driver.findElement(self_kit_ret_id).getText();
                    System.out.println(placeDates);
                    if (placeDates.contains("null")) {
                        test16.log(LogStatus.FAIL, "Kit Return ID not shown");
                        getScreenshot("Track_TestRetId");
                    } else {
                        test16.log(LogStatus.PASS, "Kit Return ID visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Kit Return ID not shown");
                    getScreenshot("Track_TestRetId");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(self_progress_return).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test Kit Return screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test Kit Return screen indication not visible");
                    getScreenshot("Track_TestRetIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Test Kit Return screen indication not visible");
                getScreenshot("Track_TestRetIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Kit return screen not visible");
            getScreenshot("Track_KitRetScreen");
        }
    }

    public void verifyTestOrderDoctorScreen(String H, String D) throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            try {
                String placeHead = driver.findElement(doctor_visit).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestDocTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestDocTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(doctor_visit_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestDocDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestDocDesc");
            }
            Thread.sleep(2000);
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("InProgress")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(doctor_name).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Doctor name not shown");
                        getScreenshot("Track_TestDocName");
                    } else {
                        test16.log(LogStatus.PASS, "Doctor name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Doctor name not shown");
                    getScreenshot("Track_TestDocName");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(doctor_arrv_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Doctor arrived date not shown");
                        getScreenshot("Track_TestDocArrDate");
                    } else {
                        test16.log(LogStatus.PASS, "Doctor arrived date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Doctor arrived date not shown");
                    getScreenshot("Track_TestDocArrDate");
                }
                Thread.sleep(2000);
                try {
                    String placeDates = driver.findElement(doctor_date).getText();
                    //System.out.println(placeDates);
                    if (placeDates.contains("null")) {
                        test16.log(LogStatus.FAIL, "Doctor screen updated date not shown");
                        getScreenshot("Track_TestDocDate");
                    } else {
                        test16.log(LogStatus.PASS, "Doctor screen updated date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Doctor screen updated date not shown");
                    getScreenshot("Track_TestDocDate");
                }
                Thread.sleep(2000);
                try {
                    String docPhone = driver.findElement(doctor_phone).getText();
                    //System.out.println(docPhone);
                    if (docPhone.contains("null")) {
                        test16.log(LogStatus.FAIL, "Doctor phone number not shown");
                        getScreenshot("Track_TestDocPhone");
                    } else {
                        test16.log(LogStatus.PASS, "Doctor phone number visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Doctor phone number not shown");
                    getScreenshot("Track_TestDocPhone");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(progress_doc).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Doctor screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Doctor screen indication not visible");
                    getScreenshot("Track_TestDocIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Doctor screen indication not visible");
                getScreenshot("Track_TestDocIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Doctor screen not visible");
            getScreenshot("Track_DocScreen");
        }
    }

    public void verifyDoctorVisitScreen() throws InterruptedException, IOException {
        test16.log(LogStatus.INFO, "Ready to verify the Home or Self Test Screen");
        try {
            Thread.sleep(2000);
            String testType = driver.findElement(test_type).getText();
            if (testType.contains("H")) {
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Doctor visit screen");
                    verifyTestOrderDoctorScreen("Doctor will visit your place", "Doctor arrive at the doorstep of the patient to collect samples");
                } catch (NoSuchElementException | IOException e) {
                    test16.log(LogStatus.FAIL, "Doctor visit screen not visible");
                    getScreenshot("Track_TestDocVisit");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Sample Received screen");
                    verifyTestSampleScreen("Test Sample Received", "On the way to laboratory");
                } catch (NoSuchElementException | IOException e) {
                    test16.log(LogStatus.FAIL, "Test Sample Received screen not visible");
                    getScreenshot("Track_TestSampleReceived");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test In Progress Screen");
                    verifyTestInProgressScreen("Test in Progress", "Started testing");
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Test In Progress screen not visible");
                    getScreenshot("Track_TestInProgress");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Report Generated Screen");
                    verifyTestReportScreen("Test Report Generated", "Testing completed");
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Test Report Generated screen not visible");
                    getScreenshot("Track_TestReport");
                }
            } else {
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Kit Shipped screen");
                    verifyTestKitShipScreen("Test Kit Shipped", "Kit shipped from laboratory");
                } catch (NoSuchElementException | IOException e) {
                    test16.log(LogStatus.FAIL, "Test Kit Shipped screen not visible");
                    getScreenshot("Track_TestKitShip");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Kit Return screen");
                    verifyTestKitReturnScreen("Test Kit Returned To Lab (Optional)", "Self collected by individuals at home and returned");
                } catch (NoSuchElementException | IOException e) {
                    test16.log(LogStatus.FAIL, "Test Kit Return screen not visible");
                    getScreenshot("Track_TestKitReturn");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Sample Received screen");
                    verifySelfSampleScreen("Test Sample Received", "On the way to laboratory");
                } catch (NoSuchElementException | IOException e) {
                    test16.log(LogStatus.FAIL, "Test Sample Received screen not visible");
                    getScreenshot("Track_TestSampleReceived");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test In Progress Screen");
                    verifySelfInProgressScreen("Test in Progress", "Started testing");
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Test In Progress screen not visible");
                    getScreenshot("Track_TestInProgress");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Report Generated Screen");
                    verifySelfReportScreen("Test Report Generated", "Testing completed");
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Test Report Generated screen not visible");
                    getScreenshot("Track_TestReport");
                }
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Doctor visit screen not visible");
            getScreenshot("Track_DocVisitScreen");
        }
    }

    public void verifyTestSampleScreen(String H, String D) throws InterruptedException, IOException {
        try {
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
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            try {
                String placeHead = driver.findElement(sample_receive).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else if (placeHead.contains("Doctor will visit your place")) {
                    String placeHeads = driver.findElement(sample_receives).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(H)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestSampleTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestSampleTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestSampleTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(sample_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else if (placeDesc.contains("Doctor arrive at the doorstep of the patient to collect samples")) {
                    String placeHeads = driver.findElement(sample_descs).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(D)) {
                        test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestSampleDesc");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestSampleDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestSampleDesc");
            }
            Thread.sleep(2000);
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("InProgress")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(sampler_name).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestSampleUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestSampleUser");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(sample_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Sample received date not shown");
                        getScreenshot("Track_TestSampleDate");
                    } else {
                        test16.log(LogStatus.PASS, "Sample received date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Sample received date not shown");
                    getScreenshot("Track_TestSampleDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(progress_sample).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Sample received screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Sample received screen indication not visible");
                    getScreenshot("Track_TestSampleIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Sample received screen indication not visible");
                getScreenshot("Track_TestSampleIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Sample screen not visible");
            getScreenshot("Track_SamScreen");
        }
    }

    public void verifyTestInProgressScreen(String H, String D) throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            try {
                String placeHead = driver.findElement(test_inprogress).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else if (placeHead.contains("Test Sample Received")) {
                    String placeHeads = driver.findElement(test_inprogresss).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(H)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestSampleTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestInTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestInTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(inprogress_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else if (placeDesc.contains("On the way to laboratory")) {
                    String placeHeads = driver.findElement(inprogress_descs).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(D)) {
                        test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestInDesc");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestInDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestInDesc");
            }
            Thread.sleep(2000);
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("InProgress")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(lab_name).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Lab name not shown");
                        getScreenshot("Track_TestInLabName");
                    } else {
                        test16.log(LogStatus.PASS, "Lab name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Lab name not shown");
                    getScreenshot("Track_TestInLabName");
                }
                Thread.sleep(2000);
                try {
                    String placeNames = driver.findElement(lab_user).getText();
                    //System.out.println(placeNames);
                    if (placeNames.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestInUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestInUser");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(lab_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Test InProgress date not shown");
                        getScreenshot("Track_TestInDate");
                    } else {
                        test16.log(LogStatus.PASS, "Test InProgress date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Test InProgress date not shown");
                    getScreenshot("Track_TestInDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(progress_lab).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test InProgress screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test InProgress screen indication not visible");
                    getScreenshot("Track_TestInIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Test InProgress screen indication not visible");
                getScreenshot("Track_TestInIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "InProgress screen not visible");
            getScreenshot("Track_InProScreen");
        }
    }

    public void verifyTestReportScreen(String H, String D) throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            try {
                String placeHead = driver.findElement(report_generate).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else if (placeHead.contains("Test in Progress")) {
                    String placeHeads = driver.findElement(report_generates).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(H)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestRepTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestRepTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestRepTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(report_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else if (placeDesc.contains("Started testing")) {
                    String placeHeads = driver.findElement(report_descs).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(D)) {
                        test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestRepDesc");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestRepDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestRepDesc");
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
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("Completed")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(report_name).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestRepUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestRepUser");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(report_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Report uploaded date not shown");
                        getScreenshot("Track_TestRepDate");
                    } else {
                        test16.log(LogStatus.PASS, "Report uploaded date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Report uploaded date not shown");
                    getScreenshot("Track_TestRepDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in Completed State");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(progress_report).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test Report screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test Report screen indication not visible");
                    getScreenshot("Track_TestRepIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Test Report screen indication not visible");
                getScreenshot("Track_TestRepIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Report screen not visible");
            getScreenshot("Track_RepScreen");
        }
    }

    public void verifySelfSampleScreen(String H, String D) throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            Dimension dimension = driver.manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.5);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            try {
                String placeHead = driver.findElement(self_sample_receive).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else if (placeHead.contains("On the way to laboratory")) {
                    String placeHeads = driver.findElement(self_sample_receives).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(H)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestRepTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestSampleTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestSampleTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(self_sample_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else if (placeDesc.contains("Started testing")) {
                    String placeHeads = driver.findElement(self_sample_descs).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(D)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestRepTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestSampleDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestSampleDesc");
            }
            Thread.sleep(2000);
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("InProgress")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(self_sampler_name).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestSampleUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestSampleUser");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(self_sample_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Sample received date not shown");
                        getScreenshot("Track_TestSampleDate");
                    } else {
                        test16.log(LogStatus.PASS, "Sample received date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Sample received date not shown");
                    getScreenshot("Track_TestSampleDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(self_progress_sample).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Sample received screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Sample received screen indication not visible");
                    getScreenshot("Track_TestSampleIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Sample received screen indication not visible");
                getScreenshot("Track_TestSampleIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Self - Sample screen not visible");
            getScreenshot("Track_SSamScreen");
        }
    }

    public void verifySelfInProgressScreen(String H, String D) throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            try {
                String placeHead = driver.findElement(self_test_inprogress).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else if (placeHead.contains("Started testing")) {
                    String placeHeads = driver.findElement(self_test_inprogresss).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(H)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestRepTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestInTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestInTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(self_inprogress_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else if (placeDesc.contains("Started testing")) {
                    String placeHeads = driver.findElement(self_inprogress_descs).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(D)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestRepTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestInDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestInDesc");
            }
            Thread.sleep(2000);
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("InProgress")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(self_lab_name).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Lab name not shown");
                        getScreenshot("Track_TestInLabName");
                    } else {
                        test16.log(LogStatus.PASS, "Lab name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Lab name not shown");
                    getScreenshot("Track_TestInLabName");
                }
                Thread.sleep(2000);
                try {
                    String placeNames = driver.findElement(self_lab_user).getText();
                    //System.out.println(placeNames);
                    if (placeNames.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestInUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestInUser");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(self_lab_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Test InProgress date not shown");
                        getScreenshot("Track_TestInDate");
                    } else {
                        test16.log(LogStatus.PASS, "Test InProgress date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Test InProgress date not shown");
                    getScreenshot("Track_TestInDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(self_progress_lab).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test InProgress screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test InProgress screen indication not visible");
                    getScreenshot("Track_TestInIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Test InProgress screen indication not visible");
                getScreenshot("Track_TestInIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Self - InProgress screen not visible");
            getScreenshot("Track_SInProScreen");
        }
    }

    public void verifySelfReportScreen(String H, String D) throws InterruptedException, IOException {
        try {
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
                String placeHead = driver.findElement(self_report_generate).getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else if (placeHead.contains("Test in Progress")) {
                    String placeHeads = driver.findElement(self_report_generates).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(H)) {
                        test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestRepTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestRepTitle");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestRepTitle");
            }
            Thread.sleep(2000);
            try {
                String placeDesc = driver.findElement(self_report_desc).getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else if (placeDesc.contains("Started testing")) {
                    String placeHeads = driver.findElement(self_report_descs).getText();
                    //System.out.println(placeHeads);
                    if (placeHeads.contains(D)) {
                        test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeHeads);
                    } else {
                        test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeHeads);
                        getScreenshot("Track_TestRepDesc");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestRepDesc");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestRepDesc");
            }
            Thread.sleep(2000);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            Thread.sleep(2000);
            String testStatus = driver.findElement(test_status).getText();
            if (testStatus.contains("Completed")) {
                Thread.sleep(2000);
                try {
                    String placeName = driver.findElement(self_report_name).getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestRepUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestRepUser");
                }
                Thread.sleep(2000);
                try {
                    String placeDate = driver.findElement(self_report_date).getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Report uploaded date not shown");
                        getScreenshot("Track_TestRepDate");
                    } else {
                        test16.log(LogStatus.PASS, "Report uploaded date visible");
                    }
                } catch (NoSuchElementException e) {
                    test16.log(LogStatus.FAIL, "Report uploaded date not shown");
                    getScreenshot("Track_TestRepDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in Completed State");
            }
            Thread.sleep(2000);
            try {
                if (driver.findElement(self_progress_report).isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test Report screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test Report screen indication not visible");
                    getScreenshot("Track_TestRepIndicator");
                }
            } catch (NoSuchElementException e) {
                test16.log(LogStatus.FAIL, "Test Report screen indication not visible");
                getScreenshot("Track_TestRepIndicator");
            }
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.FAIL, "Self - Report screen not visible");
            getScreenshot("Track_SrepScreen");
        }
    }

    public void goBack() throws InterruptedException, IOException {
        test16.log(LogStatus.INFO, "Ready to click the back icon to move on Test Orders Screen");
        try {
            Thread.sleep(2000);
            driver.findElement(back_test_orders).click();
            test16.log(LogStatus.PASS, "Back to Test orders screen");
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.SKIP, "Back icon not visible");
            getScreenshot("Track_BackIcon");
            driver.navigate().back();
        }
    }

    public void backToHome() throws InterruptedException, IOException {
        test16.log(LogStatus.INFO, "Ready to click the back icon to move on Home Screen");
        try {
            Thread.sleep(2000);
            driver.findElement(back_home).click();
            test16.log(LogStatus.PASS, "Back to Home screen");
        } catch (NoSuchElementException e) {
            test16.log(LogStatus.SKIP, "Back home icon not visible");
            getScreenshot("Track_BackHomeIcon");
            driver.navigate().back();
        }
    }

}
