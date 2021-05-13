package AppPages;

import com.relevantcodes.extentreports.LogStatus;
import freemarker.template.TemplateException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static AppPages.AppTestBase.getScreenshot;
import static AppPages.AppTestBase.test16;

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
    By sample_receivers = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n");
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

    public void gotoTestOrders() {
        test16.log(LogStatus.INFO, "Ready to go to the Test Orders");
        try {
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(menu));
            element.click();
            WebElement element1 = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_orders));
            element1.click();
            test16.log(LogStatus.PASS, "Test Orders page opened");
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.SKIP, "Pages already stayed in Test Orders Screen");
        }
    }

    public void gotoOrderTrack(String H) throws IOException {
        test16.log(LogStatus.INFO, "Ready to go to the Test Orders Track Screen");
        try {
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(arrow));
            element.click();
            WebElement element1 = new WebDriverWait(driver, 20)
                    .until(driver -> driver.findElement(track_head));
            String head = element1.getText();
            //System.out.println(head);
            if (head.contains(H)) {
                test16.log(LogStatus.PASS, "Tracking page header shown as per the requirement : " + head);
            } else {
                test16.log(LogStatus.FAIL, "Tracking page header not shown as per the requirement : " + head);
                getScreenshot("Track_Header");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Tracking page header not shown");
            getScreenshot("Track_Header");
        }
    }

    public void verifyOrderInfo() throws IOException {
        test16.log(LogStatus.INFO, "Ready to verify the Test Orders Info");
        try {
            WebElement element = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(test_name));
            String testName = element.getText();
            //System.out.println(testName);
            if (testName.contains("null")) {
                test16.log(LogStatus.FAIL, "Test name not shown : " + testName);
                getScreenshot("Track_TestName");
            } else {
                test16.log(LogStatus.PASS, "Test name visible : " + testName);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Test name not shown");
            getScreenshot("Track_TestName");
        }
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_date));
            String testDate = element.getText();
            //System.out.println(testDate);
            if (testDate.contains("null")) {
                test16.log(LogStatus.FAIL, "Test date not shown : " + testDate);
                getScreenshot("Track_TestDate");
            } else {
                test16.log(LogStatus.PASS, "Test date visible : " + testDate);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Test date not shown");
            getScreenshot("Track_TestDate");
        }
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(sched_time));
            String testSchedule = element.getText();
            //System.out.println(testSchedule);
            if (testSchedule.contains("null")) {
                test16.log(LogStatus.FAIL, "Schedule time not shown : " + testSchedule);
                getScreenshot("Track_ScheduleTime");
            } else {
                test16.log(LogStatus.PASS, "Schedule time visible : " + testSchedule);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.INFO, "This is not a scheduled order");
        }
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_price));
            String testPrice = element.getText();
            //System.out.println(testPrice);
            if (testPrice.contains("null")) {
                test16.log(LogStatus.FAIL, "Test price not shown : " + testPrice);
                getScreenshot("Track_TestPrice");
            } else {
                test16.log(LogStatus.PASS, "Test price visible : " + testPrice);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Test price not shown");
            getScreenshot("Track_TestPrice");
        }
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_image));
            String testImage = element.getText();
            //System.out.println(testImage);
            if (testImage.contains("null")) {
                test16.log(LogStatus.FAIL, "Test image not shown");
                getScreenshot("Track_TestImage");
            } else {
                test16.log(LogStatus.PASS, "Test image visible");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Test image not shown");
            getScreenshot("Track_TestImage");
        }
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_count));
            String testCount = element.getText();
            //System.out.println(testCount);
            if (testCount.contains("null")) {
                test16.log(LogStatus.FAIL, "Test count not shown : " + testCount);
                getScreenshot("Track_TestCount");
            } else {
                test16.log(LogStatus.PASS, "Test count visible : " + testCount);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.INFO, "There is no Add-On members");
        }
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_type));
            String testType = element.getText();
            //System.out.println(testType);
            if (testType.contains("null")) {
                test16.log(LogStatus.FAIL, "Test type not shown : " + testType);
                getScreenshot("Track_TestType");
            } else {
                test16.log(LogStatus.PASS, "Test type visible : " + testType);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Test type not shown");
            getScreenshot("Track_TestType");
        }
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            //System.out.println(testStatus);
            if (testStatus.contains("null")) {
                test16.log(LogStatus.FAIL, "Test status not shown : " + testStatus);
                getScreenshot("Track_TestStatus");
            } else {
                test16.log(LogStatus.PASS, "Test status visible : " + testStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Test status not shown");
            getScreenshot("Track_TestStatus");
        }
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_order_id));
            String orderId = element.getText();
            //System.out.println(orderId);
            if (orderId.contains("null")) {
                test16.log(LogStatus.FAIL, "Order ID not shown : " + orderId);
                getScreenshot("Track_OrderId");
            } else {
                test16.log(LogStatus.PASS, "Order ID visible : " + orderId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Order ID not shown");
            getScreenshot("Track_OrderId");
        }
    }

    public void verifyTestOrderPlaceScreen(String H, String D) throws InterruptedException, IOException {
        test16.log(LogStatus.INFO, "Ready to verify the Test Order Place Screen");
        try {
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(order_place));
                String placeHead = element.getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestPlaceTitle");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestPlaceTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(order_place_desc));
                String placeDesc = element.getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestPlaceDesc");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestPlaceDesc");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(user_name));
                String placeName = element.getText();
                //System.out.println(placeName);
                if (placeName.contains("null")) {
                    test16.log(LogStatus.FAIL, "User name not shown");
                    getScreenshot("Track_TestPlaceUser");
                } else {
                    test16.log(LogStatus.PASS, "User name visible : " + placeName);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "User name not shown");
                getScreenshot("Track_TestPlaceUser");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(place_date));
                String placeDate = element.getText();
                //System.out.println(placeDate);
                if (placeDate.contains("null")) {
                    test16.log(LogStatus.FAIL, "Order placed date not shown");
                    getScreenshot("Track_TestPlaceDate");
                } else {
                    test16.log(LogStatus.PASS, "Order placed date visible : " + placeDate);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Order placed date not shown");
                getScreenshot("Track_TestPlaceDate");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(progress_place));
                if (element.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Order place screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Order place screen indication not visible");
                    getScreenshot("Track_TestPlaceIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Order place screen indication not visible");
                getScreenshot("Track_TestPlaceIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Order place screen not visible");
            getScreenshot("Track_PlaceScreen");
        }
    }

    public void verifyTestOrderConfirmScreen(String H, String D) throws IOException {
        test16.log(LogStatus.INFO, "Ready to verify the Test Order Confirmation Screen");
        try {
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(order_confirm));
                String placeHead = element.getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestConfTitle");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestConfTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(order_conf_desc));
                String placeDesc = element.getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestConfDesc");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestConfDesc");
            }
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("Approved")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(conf_name));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestConfUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestConfUser");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(conf_date));
                    String placeDate = element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Order confirmed date not shown");
                        getScreenshot("Track_TestConfDate");
                    } else {
                        test16.log(LogStatus.PASS, "Order confirmed date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Order confirmed date not shown");
                    getScreenshot("Track_TestConfDate");
                }
            } else {
                test16.log(LogStatus.SKIP, "Order is not in Approved Status");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(progress_conf));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Order confirmed screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Order confirmed screen indication not visible");
                    getScreenshot("Track_TestConfIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Order confirmed screen indication not visible");
                getScreenshot("Track_TestConfIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Order Confirmed screen not visible");
            getScreenshot("Track_ConfScreen");
        }
    }

    public void verifyTestKitShipScreen(String H, String D) throws InterruptedException, IOException {
        try {
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_kit_ship));
                String placeHead = element.getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestKitTitle");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestKitTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_kit_desc));
                String placeDesc = element.getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestKitDesc");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestKitDesc");
            }
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("InProgress")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_kit_user));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "User name not shown");
                        getScreenshot("Track_TestKitUser");
                    } else {
                        test16.log(LogStatus.PASS, "User name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "User name not shown");
                    getScreenshot("Track_TestKitUser");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_kit_date));
                    String placeDate = element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Kit Shipped date not shown");
                        getScreenshot("Track_TestKitDate");
                    } else {
                        test16.log(LogStatus.PASS, "Kit Shipped date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Kit Shipped date not shown");
                    getScreenshot("Track_TestKitDate");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_kit_ship_id));
                    String placeDates = element1.getText();
                    //System.out.println(placeDates);
                    if (placeDates.contains("null")) {
                        test16.log(LogStatus.FAIL, "Kit Shipping ID not shown");
                        getScreenshot("Track_TestKitId");
                    } else {
                        test16.log(LogStatus.PASS, "Kit Shipping ID visible : " + placeDates);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Kit Shipping ID not shown");
                    getScreenshot("Track_TestKitId");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress State");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_progress_kit_ship));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test Kit Shipped screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test Kit Shipped screen indication not visible");
                    getScreenshot("Track_TestKitIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Test Kit Shipped screen indication not visible");
                getScreenshot("Track_TestKitIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
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
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_kit_return));
                String placeHead = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestRetTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_kit_ret_desc));
                String placeDesc = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestRetDesc");
            }
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("InProgress")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_kit_ret_user));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "User name not shown");
                        getScreenshot("Track_TestRetUser");
                    } else {
                        test16.log(LogStatus.PASS, "User name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "User name not shown");
                    getScreenshot("Track_TestRetUser");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_kit_ret_date));
                    String placeDate = element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Kit Return date not shown");
                        getScreenshot("Track_TestRetDate");
                    } else {
                        test16.log(LogStatus.PASS, "Kit Return date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Kit Return date not shown");
                    getScreenshot("Track_TestRetDate");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_kit_ret_id));
                    String placeDates = element1.getText();
                    if (placeDates.contains("null")) {
                        test16.log(LogStatus.FAIL, "Kit Return ID not shown");
                        getScreenshot("Track_TestRetId");
                    } else {
                        test16.log(LogStatus.PASS, "Kit Return ID visible : " + placeDates);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Kit Return ID not shown");
                    getScreenshot("Track_TestRetId");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_progress_return));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test Kit Return screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test Kit Return screen indication not visible");
                    getScreenshot("Track_TestRetIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Test Kit Return screen indication not visible");
                getScreenshot("Track_TestRetIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Kit return screen not visible");
            getScreenshot("Track_KitRetScreen");
        }
    }

    public void verifyTestOrderDoctorScreen(String H, String D) throws IOException {
        try {
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(doctor_visit));
                String placeHead = element.getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestDocTitle");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestDocTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(doctor_visit_desc));
                String placeDesc = element.getText();
                //System.out.println(placeDesc);
                if (placeDesc.contains(D)) {
                    test16.log(LogStatus.PASS, "Description shown as per the requirement : " + placeDesc);
                } else {
                    test16.log(LogStatus.FAIL, "Description not shown as per the requirement : " + placeDesc);
                    getScreenshot("Track_TestDocDesc");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestDocDesc");
            }
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("InProgress")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(doctor_name));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Doctor name not shown");
                        getScreenshot("Track_TestDocName");
                    } else {
                        test16.log(LogStatus.PASS, "Doctor name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Doctor name not shown");
                    getScreenshot("Track_TestDocName");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(doctor_arrv_date));
                    String placeDate = element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Doctor arrived date not shown");
                        getScreenshot("Track_TestDocArrDate");
                    } else {
                        test16.log(LogStatus.PASS, "Doctor arrived date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Doctor arrived date not shown");
                    getScreenshot("Track_TestDocArrDate");
                }
//                try {
//                    WebElement element1 = new WebDriverWait(driver, 2)
//                            .until(driver -> driver.findElement(doctor_date));
//                    String placeDates = element1.getText();
//                    //System.out.println(placeDates);
//                    if (placeDates.contains("null")) {
//                        test16.log(LogStatus.FAIL, "Doctor screen updated date not shown");
//                        getScreenshot("Track_TestDocDate");
//                    } else {
//                        test16.log(LogStatus.PASS, "Doctor screen updated date visible : " + placeDates);
//                    }
//                } catch (NoSuchElementException | TimeoutException e) {
//                    test16.log(LogStatus.FAIL, "Doctor screen updated date not shown");
//                    getScreenshot("Track_TestDocDate");
//                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(doctor_date));
                    String docPhone = element1.getText();
                    //System.out.println(docPhone);
                    if (docPhone.contains("null")) {
                        test16.log(LogStatus.FAIL, "Doctor phone number not shown");
                        getScreenshot("Track_TestDocPhone");
                    } else {
                        test16.log(LogStatus.PASS, "Doctor phone number visible : " + docPhone);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Doctor phone number not shown");
                    getScreenshot("Track_TestDocPhone");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(progress_doc));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Doctor screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Doctor screen indication not visible");
                    getScreenshot("Track_TestDocIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Doctor screen indication not visible");
                getScreenshot("Track_TestDocIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Doctor screen not visible");
            getScreenshot("Track_DocScreen");
        }
    }

    public void verifyDoctorVisitScreen() throws InterruptedException, IOException {
        test16.log(LogStatus.INFO, "Ready to verify the Home or Self Test Screen");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_type));
            String testType = element.getText();
            if (testType.contains("H")) {
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Doctor visit screen");
                    verifyTestOrderDoctorScreen("Doctor will visit your place", "Doctor arrive at the doorstep of the patient to collect samples");
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Doctor visit screen not visible");
                    getScreenshot("Track_TestDocVisit");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Sample Received screen");
                    verifyTestSampleScreen("Test Sample Received", "On the way to laboratory");
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test Sample Received screen not visible");
                    getScreenshot("Track_TestSampleReceived");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test In Progress Screen");
                    verifyTestInProgressScreen("Test in Progress", "Started testing");
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test In Progress screen not visible");
                    getScreenshot("Track_TestInProgress");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Report Generated Screen");
                    verifyTestReportScreen("Test Report Generated", "Testing completed");
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test Report Generated screen not visible");
                    getScreenshot("Track_TestReport");
                }
            } else {
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Kit Shipped screen");
                    verifyTestKitShipScreen("Test Kit Shipped", "Kit shipped from laboratory");
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test Kit Shipped screen not visible");
                    getScreenshot("Track_TestKitShip");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Kit Return screen");
                    verifyTestKitReturnScreen("Test Kit Returned To Lab (Optional)", "Self collected by individuals at home and returned");
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test Kit Return screen not visible");
                    getScreenshot("Track_TestKitReturn");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Sample Received screen");
                    verifySelfSampleScreen("Test Sample Received", "On the way to laboratory");
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test Sample Received screen not visible");
                    getScreenshot("Track_TestSampleReceived");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test In Progress Screen");
                    verifySelfInProgressScreen("Test in Progress", "Started testing");
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test In Progress screen not visible");
                    getScreenshot("Track_TestInProgress");
                }
                try {
                    test16.log(LogStatus.INFO, "Ready to verify the Test Report Generated Screen");
                    verifySelfReportScreen("Test Report Generated", "Testing completed");
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test Report Generated screen not visible");
                    getScreenshot("Track_TestReport");
                }
            }
        } catch (NoSuchElementException | TimeoutException e) {
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
            try {
                WebElement element = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(sample_receive));
                String placeHead = element.getText();
                //System.out.println(placeHead);
                if (placeHead.contains(H)) {
                    test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHead);
                } else if (placeHead.contains("Doctor will visit your place") || placeHead.contains("On the way to laboratory")) {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(sample_receives));
                    String place = element1.getText();
                    if (place.contains("Test in Progress")) {
                        WebElement element2 = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(sample_receive));
                        String placeHeads = element2.getText();
                        //System.out.println(placeHeads);
                        if (placeHeads.contains(H)) {
                            test16.log(LogStatus.PASS, "Title shown as per the requirement : " + placeHeads);
                        } else {
                            test16.log(LogStatus.FAIL, "Title not showing as per the requirement : " + placeHeads);
                            getScreenshot("Track_TestSampleTitle");
                        }
                    } else {
                        test16.log(LogStatus.FAIL, "Title was not shown as per the requirement : " + placeHead);
                        getScreenshot("Track_TestSampleTitle");
                    }
                } else {
                    test16.log(LogStatus.FAIL, "Title not shown as per the requirement : " + placeHead);
                    getScreenshot("Track_TestSampleTitle");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestSampleTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(sample_desc));
                String placeDesc = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestSampleDesc");
            }
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("InProgress")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(sampler_name));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestSampleUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestSampleUser");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(sample_date));
                    String placeDate = element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Sample received date not shown");
                        getScreenshot("Track_TestSampleDate");
                    } else {
                        test16.log(LogStatus.PASS, "Sample received date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Sample received date not shown");
                    getScreenshot("Track_TestSampleDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(progress_sample));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Sample received screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Sample received screen indication not visible");
                    getScreenshot("Track_TestSampleIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Sample received screen indication not visible");
                getScreenshot("Track_TestSampleIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Sample screen not visible");
            getScreenshot("Track_SamScreen");
        }
    }

    public void verifyTestInProgressScreen(String H, String D) throws IOException {
        try {
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(test_inprogress));
                String placeHead = element.getText();
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
                } else if (placeHead.contains("Test Report Generated")) {
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestInTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(inprogress_desc));
                String placeDesc = element.getText();
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
                } else if (placeDesc.contains("Testing completed")) {
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestInDesc");
            }
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("InProgress")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(lab_name));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Lab name not shown");
                        getScreenshot("Track_TestInLabName");
                    } else {
                        test16.log(LogStatus.PASS, "Lab name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Lab name not shown");
                    getScreenshot("Track_TestInLabName");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(lab_user));
                    String placeNames = element1.getText();
                    //System.out.println(placeNames);
                    if (placeNames.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestInUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible : " + placeNames);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestInUser");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(lab_date));
                    String placeDate = element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Test InProgress date not shown");
                        getScreenshot("Track_TestInDate");
                    } else {
                        test16.log(LogStatus.PASS, "Test InProgress date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test InProgress date not shown");
                    getScreenshot("Track_TestInDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(progress_lab));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test InProgress screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test InProgress screen indication not visible");
                    getScreenshot("Track_TestInIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Test InProgress screen indication not visible");
                getScreenshot("Track_TestInIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "InProgress screen not visible");
            getScreenshot("Track_InProScreen");
        }
    }

    public void verifyTestReportScreen(String H, String D) throws InterruptedException, IOException {
        try {
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(report_generate));
                String placeHead = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestRepTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(report_desc));
                String placeDesc = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
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
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("Completed")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(report_name));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestRepUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestRepUser");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(report_date));
                    String placeDate = element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Report uploaded date not shown");
                        getScreenshot("Track_TestRepDate");
                    } else {
                        test16.log(LogStatus.PASS, "Report uploaded date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Report uploaded date not shown");
                    getScreenshot("Track_TestRepDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in Completed State");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(progress_report));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test Report screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test Report screen indication not visible");
                    getScreenshot("Track_TestRepIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Test Report screen indication not visible");
                getScreenshot("Track_TestRepIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
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
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_sample_desc));
                String placeDesc = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestSampleDesc");
            }
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("InProgress")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_sampler_name));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestSampleUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestSampleUser");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_sample_date));
                    String placeDate = element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Sample received date not shown");
                        getScreenshot("Track_TestSampleDate");
                    } else {
                        test16.log(LogStatus.PASS, "Sample received date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Sample received date not shown");
                    getScreenshot("Track_TestSampleDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_progress_sample));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Sample received screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Sample received screen indication not visible");
                    getScreenshot("Track_TestSampleIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Sample received screen indication not visible");
                getScreenshot("Track_TestSampleIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Self - Sample screen not visible");
            getScreenshot("Track_SSamScreen");
        }
    }

    public void verifySelfInProgressScreen(String H, String D) throws IOException {
        try {
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_test_inprogress));
                String placeHead = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestInTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_inprogress_desc));
                String placeDesc = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestInDesc");
            }
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("InProgress")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_lab_name));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Lab name not shown");
                        getScreenshot("Track_TestInLabName");
                    } else {
                        test16.log(LogStatus.PASS, "Lab name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Lab name not shown");
                    getScreenshot("Track_TestInLabName");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_lab_user));
                    String placeNames = element1.getText();
                    //System.out.println(placeNames);
                    if (placeNames.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestInUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible : " + placeNames);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestInUser");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_lab_date));
                    String placeDate =element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Test InProgress date not shown");
                        getScreenshot("Track_TestInDate");
                    } else {
                        test16.log(LogStatus.PASS, "Test InProgress date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Test InProgress date not shown");
                    getScreenshot("Track_TestInDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in InProgress state");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_progress_lab));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test InProgress screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test InProgress screen indication not visible");
                    getScreenshot("Track_TestInIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Test InProgress screen indication not visible");
                getScreenshot("Track_TestInIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
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
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_report_generate));
                String placeHead = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Title not shown as per the requirement");
                getScreenshot("Track_TestRepTitle");
            }
            try {
                WebElement element = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_report_desc));
                String placeDesc = element.getText();
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
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Description not shown as per the requirement");
                getScreenshot("Track_TestRepDesc");
            }
            Thread.sleep(2000);
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(test_status));
            String testStatus = element.getText();
            if (testStatus.contains("Completed")) {
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_report_name));
                    String placeName = element1.getText();
                    //System.out.println(placeName);
                    if (placeName.contains("null")) {
                        test16.log(LogStatus.FAIL, "Person name not shown");
                        getScreenshot("Track_TestRepUser");
                    } else {
                        test16.log(LogStatus.PASS, "Person name visible : " + placeName);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Person name not shown");
                    getScreenshot("Track_TestRepUser");
                }
                try {
                    WebElement element1 = new WebDriverWait(driver, 2)
                            .until(driver -> driver.findElement(self_report_date));
                    String placeDate = element1.getText();
                    //System.out.println(placeDate);
                    if (placeDate.contains("null")) {
                        test16.log(LogStatus.FAIL, "Report uploaded date not shown");
                        getScreenshot("Track_TestRepDate");
                    } else {
                        test16.log(LogStatus.PASS, "Report uploaded date visible : " + placeDate);
                    }
                } catch (NoSuchElementException | TimeoutException e) {
                    test16.log(LogStatus.FAIL, "Report uploaded date not shown");
                    getScreenshot("Track_TestRepDate");
                }
            } else {
                test16.log(LogStatus.INFO, "Order is not in Completed State");
            }
            try {
                WebElement element1 = new WebDriverWait(driver, 2)
                        .until(driver -> driver.findElement(self_progress_report));
                if (element1.isDisplayed()) {
                    test16.log(LogStatus.PASS, "Test Report screen indication visible");
                } else {
                    test16.log(LogStatus.FAIL, "Test Report screen indication not visible");
                    getScreenshot("Track_TestRepIndicator");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test16.log(LogStatus.FAIL, "Test Report screen indication not visible");
                getScreenshot("Track_TestRepIndicator");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.FAIL, "Self - Report screen not visible");
            getScreenshot("Track_SrepScreen");
        }
    }

    public void goBack() {
        test16.log(LogStatus.INFO, "Ready to click the back icon to move on Test Orders Screen");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(back_test_orders));
            element.click();
            test16.log(LogStatus.PASS, "Back to Test orders screen");
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.SKIP, "Back icon not visible");
            driver.navigate().back();
        }
    }

    public void backToHome() {
        test16.log(LogStatus.INFO, "Ready to click the back icon to move on Home Screen");
        try {
            WebElement element = new WebDriverWait(driver, 2)
                    .until(driver -> driver.findElement(back_home));
            element.click();
            test16.log(LogStatus.PASS, "Back to Home screen");
        } catch (NoSuchElementException | TimeoutException e) {
            test16.log(LogStatus.SKIP, "Back home icon not visible");
            driver.navigate().back();
        }
    }

}
