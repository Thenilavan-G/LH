package AdminPages;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static AdminPages.AdminTestBase.*;
import static AdminPages.AdminTestBase.getScreenshot;
import static Utils.AdminGoogleSheet.dataList;

public class TestOrderTrackPageObjects {

    private final WebDriver driver;

    By orderrequestorderid = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]");
    By orderrequestPatientName = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr/td[2]/div/span");
    By orderrequestPatientProfileImage = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/img[@src='https://dev-lifehope.s3.us-west-1.amazonaws.com/ProfilePic/1d5dc1cf-fbe7-4203-806d-2cb0c6be5493/1d5dc1cf-fbe7-4203-806d-2cb0c6be5493_1612184073.jpg");////table/tbody/tr[1]/td[2]/div/img[@src='https://dev-lifehope.s3.us-west-1.amazonaws.com/ProfilePic/1fc3c3db-e8d4-4011-9c48-e654d207df99/1fc3c3db-e8d4-4011-9c48-e654d207df99_1612157823.jpg']");
    By orderrequestPatientPhone = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[3]");
    By orderrequestTestDetails = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]");
    By orderrequestorderstatus = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[5]/span");
    By orderrequestTestamount = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[6]");
    By orderrequestTestType = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr/td[4]/span/img");
    By s_orderrequestTestType = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr/td[4]/img");
    By click_first_row = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr");
    By PatientName = By.xpath("//section/div/div[1]/div/div[1]/div/div/div/p[1]/span");
    By Order_No = By.xpath("//section/div/div[1]/div/div[1]/div/div/div/p[2]");
    By lad_Details = By.xpath("//section/div/div[1]/div/div[1]/div/div/div/p[3]");
    By profile_pic = By.xpath("//section/div/div[1]/div/div[1]/div/div/img[@src='https://dev-lifehope.s3.us-west-1.amazonaws.com/ProfilePic/1d5dc1cf-fbe7-4203-806d-2cb0c6be5493/1d5dc1cf-fbe7-4203-806d-2cb0c6be5493_1612184073.jpg");
    By Order_No2 = By.xpath("//section/div/div[1]/div/div[2]/div/div[1]/div[1]/h4");
    By Test_Status = By.xpath("//section/div/div[1]/div/div[2]/div/div[1]/div[1]/h4/span");
    By Test_type = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[1]/div/div[2]/div/div[2]/img");
    By Test_option_icon = By.xpath("//section/div/div[1]/div/div[2]/div/div[1]/div[2]/img");
    By Test_Option_Name = By.xpath("//section/div/div[1]/div/div[2]/div/div[1]/div[2]/div/h5");
    By Order_Date_Time = By.xpath("//section/div/div[1]/div/div[2]/div/div[1]/div[2]/div/p");
    By Schedule_Date_Time = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[1]/div/div[2]/div/div[3]/div[1]/h5");
    By view_more_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[1]/div/div[2]/div/div[3]/div[2]");
    //By View_more_opt = By.className("btn viewmore-btn");
    By View_more_opt1 = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[1]/div/div[2]/div/div[3]/div/button");
    By View_more_opt2 = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[1]/div/div[2]/div/div[3]/div[2]/button");
    By readOrderID = By.xpath("//section/div/div/div[1]/div[1]/div/div[1]/h4");
    By readProfileImage = By.xpath("//section/div/div/div[1]/div[1]/div/div[2]/img[@src='https://dev-lifehope.s3.us-west-1.amazonaws.com/ProfilePic/1d5dc1cf-fbe7-4203-806d-2cb0c6be5493/1d5dc1cf-fbe7-4203-806d-2cb0c6be5493_1612184073.jpg");
    By readPatientName = By.xpath("//section/div/div/div[1]/div[1]/div/div[2]/div/p[1]");
    By readAge = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[1]/small");
    By readAgeValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[1]/span");
    By readGender = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[2]/small");
    By readGenderValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[2]/span");
    By readPhone = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[3]/small");
    By readPhoneValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[3]/span");
    By readHeight = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[1]/small");
    By readHeightValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[1]/span");
    By readWeight = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[2]/small");
    By readWeightValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[2]/span");
    By readBloodGroup = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[3]/small");
    By readBloodGroupValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[3]/span");
    By readAddress = By.xpath("//section/div/div/div[1]/div[2]/p/small");
    By readAddressValue = By.xpath("//section/div/div/div[1]/div[2]/p/span");
    By readAddonMember = By.xpath("//section/div/div/div[1]/div[3]/div/h4");
    By readAddonMember1 = By.xpath("//section/div/div/div[1]/div[3]/div/ul[1]/li[1]/a/div/h5");
    By readAddonMember1Age = By.xpath("//section/div/div/div[1]/div[3]/div/ul[1]/li[2]/a");
    By readAddonMember1Sex = By.xpath("//section/div/div/div[1]/div[3]/div/ul[1]/li[3]/a");
    By readAddonMember2 = By.xpath("//section/div/div/div[1]/div[3]/div/ul[2]/li[1]/a/div/h5");
    By readAddonMember2Age = By.xpath("//section/div/div/div[1]/div[3]/div/ul[2]/li[2]/a");
    By readAddonMember2Sex = By.xpath("//section/div/div/div[1]/div[3]/div/ul[2]/li[3]/a");
    By readAddonMember3 = By.xpath("//section/div/div/div[1]/div[3]/div/ul[3]/li[1]/a/div/h5");
    By readAddonMember3Age = By.xpath("//section/div/div/div[1]/div[3]/div/ul[3]/li[2]/a");
    By readAddonMember3Sex = By.xpath("//section/div/div/div[1]/div[3]/div/ul[3]/li[3]/a");
    By readAddonMember4 = By.xpath("//section/div/div/div[1]/div[3]/div/ul[4]/li[1]/a/div/h5");
    By readAddonMember4Age = By.xpath("//section/div/div/div[1]/div[3]/div/ul[4]/li[2]/a");
    By readAddonMember4Sex = By.xpath("//section/div/div/div[1]/div[3]/div/ul[4]/li[3]/a");
    By readTestDetails = By.xpath("//section/div/div/div[2]/div/div/div/div/h5");
    By readTestStatus = By.xpath("//section/div/div/div[2]/div/div/div/div/h5/span");
    By readTestTypee = By.xpath("//section/div/div/div[2]/div/div/div/div[2]/img[@src='../../assets/img/home test icon.png']");
    By readOrderCreatedDate = By.xpath("//section/div/div/div[2]/div/div/div/div/p");
    By readScheduledDate = By.xpath("//section/div/div/div[2]/div/div/div[2]/h5");
    By readPaymentHeader = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[1]");
    By readPaymentDetailsTestName = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[2]/span[1]");
    By readpaymentDetailsTestCharge = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[2]/span[2]");
    By readPaymentDetailsHomeTestTaxName = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[3]/span[1]");
    By readPaymentDetailsHomeTestTaxCharge = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[3]/span[2]");
    By readPaymentDetailsHomeTestTotal = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[4]/span[1]");
    By readPaymentDetailsHomeTestTotalCharge = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[4]/span[2]");
    By Cancel_opt = By.xpath("//div/div/div[2]/div/div[3]/button");
    By copy_rights = By.xpath("//div[1]/div/div[4]/app-footer/p");

    By test_order_menu = By.xpath("/html/body/app-root/div[1]/div/div[2]/app-left-menu/div/div/div/ul/li[3]/a");
    By search_box = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[1]/div/div[3]/form/div/input");
    By select_ord = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr");
    By test_type = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[1]/div/div[2]/div/div[2]/img");
    //By user_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[1]/div/div[1]/div/div/div/p[1]/span");
    By test_ord_place = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[1]/div/div[2]/h5");
    By place_date = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[1]/div/div[2]/span[1]");
    By place_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[1]/div/div[2]/span[2]");
    By test_ord_conf = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[2]/div/div[2]/h5");
    By conf_date = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[2]/div/div[2]/span[1]");
    By conf_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[2]/div/div[2]/span[2]");
    By doctor_visit = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[3]/div/div[2]/h5");
    By doctor_date = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[3]/div/div[2]/span[1]");
    By doctor_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[3]/div/div[2]/span[2]");
    By doctor_number = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[3]/p");
    By doc_text_header = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/div/div/div/h5");
    By doc_text_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[1]/div/input");
    By doc_text_number = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/div/input");
    By doc_text_remarks = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[2]/div/input");
    //By pic_date_time_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[4]/div/app-date-time/form/mat-form-field/div/div[1]/div[1]/span/label/mat-placeholder");
    By doc_text_calendar = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[4]/div/app-date-time/form/mat-form-field/div/div[1]/div[2]/mat-datetimepicker-toggle/button");
    By calendar_nxt_month = By.xpath("/html/body/div[2]/div[2]/div/mat-datetimepicker-content/mat-datetimepicker-calendar/div[2]/div/div/div[3]");
    By calendar_day = By.xpath("/html/body/div[2]/div[2]/div/mat-datetimepicker-content/mat-datetimepicker-calendar/div[2]/mat-datetimepicker-month-view/table/tbody/tr[1]/td[2]/div");
    By select_time = By.xpath("/html/body/div[2]/div[2]/div/mat-datetimepicker-content/mat-datetimepicker-calendar/div[2]/mat-datetimepicker-clock/div/div[3]/div[11]");
    By select_min = By.xpath("/html/body/div[2]/div[2]/div/mat-datetimepicker-content/mat-datetimepicker-calendar/div[2]/mat-datetimepicker-clock/div/div[4]/div[1]");
    By reject_button = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[5]/button[1]");
    By rej_popup_text = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-reject-model/div/div[1]/label");
    By rej_reason_text = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-reject-model/div/div[1]/textarea");
    By rej_cancel = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-reject-model/div/div[2]/button[1]");
    By rej_reject = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-reject-model/div/div[2]/button[2]");
    By next_button = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[5]/button[2]");
    By next_popup_text = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-conform-model/mat-dialog-content/div/div[1]");
    By next_close = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-conform-model/mat-dialog-content/div/div[2]/button[1]");
    By next_confirm = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-conform-model/mat-dialog-content/div/div[2]/button[2]");
    By test_sample_rec = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[4]/div/div[2]/h5");
    By sample_rec_date = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[4]/div/div[2]/span[1]");
    By sample_rec_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[4]/div/div[2]/span[2]");
    By sample_rec_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/div/div/div/h5");
    By sample_text_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[1]/div/input");
    By sample_text_remarks = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[2]/div/input");
    By back_button = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/button[1]");
    By test_in_progress = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[5]/div/div[2]/h5");
    By in_date = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[5]/div/div[2]/span[1]");
    By in_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[5]/div/div[2]/span[2]");
    By in_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/div/div/div/h5");
    By in_text_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[1]/div/input");
    By in_remarks = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[2]/div/input");
    By in_calendar = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[4]/div/app-date-time/form/mat-form-field/div/div[1]/div[2]");
    By in_calendar_nxt_month = By.xpath("/html/body/div[2]/div[2]/div/mat-datetimepicker-content/mat-datetimepicker-calendar/div[2]/div/div/div[3]");
    By in_calendar_day = By.xpath("/html/body/div[2]/div[2]/div/mat-datetimepicker-content/mat-datetimepicker-calendar/div[2]/mat-datetimepicker-month-view/table/tbody/tr[1]/td[3]/div");
    By test_rep_generate = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[2]/div/ul/li[6]/div/div[2]/h5");
    By rep_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/div[1]/div/div/h5");
    By rep_text_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[1]/div/input");
    By rep_text_remarks = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/form/div/div/div/div[2]/div/input");
    By rep_upload_button = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/app-ordertrack-form/div/div/div/div/div[2]/button");
    By upload_header_text = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-addonmember/div/h3");
    By upload_user_name = By.xpath("//div[@class='cdk-overlay-pane']/mat-dialog-container/app-addonmember/div/table/tbody/tr/td/span");
    By choose_file_button = By.xpath("//div[@class='cdk-overlay-pane']/mat-dialog-container/app-addonmember/div/table/tbody/tr/td[2]/div/div");
    //By choose_one_button = By.xpath("//div[@class='cdk-overlay-pane']/mat-dialog-container/app-addonmember/div/table/tbody[1]/tr/td[2]/div/div");
    By choose_two_button = By.xpath("//div[@class='cdk-overlay-pane']/mat-dialog-container/app-addonmember/div/table/tbody[2]/tr/td[2]/div/div");
    By choose_three_button = By.xpath("//div[@class='cdk-overlay-pane']/mat-dialog-container/app-addonmember/div/table/tbody[3]/tr/td[2]/div/div");
    By choose_four_button = By.xpath("//div[@class='cdk-overlay-pane']/mat-dialog-container/app-addonmember/div/table/tbody[4]/tr/td[2]/div/div");
    By choose_five_button = By.xpath("//div[@class='cdk-overlay-pane']/mat-dialog-container/app-addonmember/div/table/tbody[5]/tr/td[2]/div/div");
    By upload_user_name2 = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-addonmember/div/table/tbody[2]/tr/td[1]/span");
    By upload_user_name3 = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-addonmember/div/table/tbody[3]/tr/td[1]/span");
    By upload_user_name4 = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-addonmember/div/table/tbody[4]/tr/td[1]/span");
    By upload_user_name5 = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-addonmember/div/table/tbody[5]/tr/td[1]/span");
    //By upload_close = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-addonmember/div/div/button[1]");
    By upload_submit = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-addonmember/div/div/button[2]");
    By notify = By.xpath("/div/snack-bar-container/div/div/app-snackbar/div/span[2]");
    By generate_rep_button = By.xpath("//div[@class='ng-star-inserted']/div/div/div/form/div/div/div/div[3]/button");
    By ord_status = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[1]/div/div[2]/div/div[1]/div[1]/h4/span");

    By s_orderno = By.xpath("//thead/tr[1]/th[1]");
    By s_patientname = By.xpath("//thead/tr[1]/th[2]");
    By s_phonenumber = By.xpath("//thead/tr[1]/th[3]");
    By s_orderstatus = By.xpath("//thead/tr[1]/th[5]");
    By s_price = By.xpath("//thead/tr[1]/th[6]");
    By s_testdetails = By.xpath("//thead/tr[1]/th[4]");
    By s_profile_pic = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By s_patientName1 = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]/span[1]");
    By s_order_No = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[2]");
    By s_address = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[3]");
    By s_order_status = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/span[1]");
    By s_testdetail1 = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/img[1]");
    By s_testimage = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]");
    By s_testname = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h5[1]");
    By s_scheduledatetime = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/p[1]");
    By s_viewmore = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]");
    By s_orderno1 = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]");
    By s_patientnameview = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]");
    By s_orderno_3 = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[2]");
    By s_profileimage2 = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]");
    By s_test_name = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]");
    By s_order_status1 = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]/span[1]");
    By s_test_type = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/img[1]");
    By s_Schedule_Date_Time = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]");
    By s_Payment_Details_Text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]");
    By s_test_option_name = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]");
    By s_test_total_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/span[2]");
    By s_shippingchargetext = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]");
    By s_shippingchargevalue = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[2]");
    By s_tax_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/span[1]");
    By s_tax_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/span[2]");
    By s_total_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/span[1]");
    By s_total_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/span[2]");
    By s_age_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/small[1]");
    By s_age_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]");
    By s_gender_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/small[1]");
    By s_gender_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]");
    By s_phone_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/small[1]");
    By s_phone_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]");
    By s_height_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/small[1]");
    By s_height_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]");
    By s_weight_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/small[1]");
    By s_weight_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]");
    By s_blood_group_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/small[1]");
    By s_blood_group_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/span[1]");
    By s_address_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/p[1]/small[1]");
    By s_address_value = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[2]/p[1]/span[1]");
    By s_addon_mem_header_text = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/h4[1]");
    By s_add_on_first_name = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/div[1]");
    By s_add_on_first_age = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]");
    By s_add_on_first_sex = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/a[1]");
    By s_add_on_second_name = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[2]/li[1]/a[1]/div[1]");
    By s_add_on_second_age = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[2]/li[2]/a[1]");
    By s_add_on_second_sex = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[2]/li[3]/a[1]");
    By s_add_on_third_name = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[3]/li[1]/a[1]/div[1]");
    By s_add_on_third_age = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[3]/li[2]/a[1]");
    By s_add_on_third_sex = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[3]/li[3]/a[1]");
    By s_add_on_fourth_name = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[4]/li[1]/a[1]/div[1]");
    By s_add_on_fourth_age = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[4]/li[2]/a[1]");
    By s_add_on_fourth_sex = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[4]/li[3]/a[1]");
    By s_cancel = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-approve-status[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]");
    By s_test_placed = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]");
    By s_test_confirmed = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]");
    By s_fedex_number = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/p[1]");
    By s_test_shipped = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]");
    By s_test_returned = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/div[1]");
    By s_testsample_receive = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/div[1]");
    By s_test_inprogress = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/div[1]");
    By s_test_generated = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-order-track[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/div[1]");
    By s_copyrights = By.xpath("//body/app-root[1]/div[1]/div[1]/div[4]/app-footer[1]/p[1]");

    By s_setRejectReason = By.id("exampleFormControlTextarea1");
    By s_clickRejectcancel = By.xpath("//app-reject-model/div/div[2]/button[1]");
    By s_clickRejectConfirm = By.xpath("//app-reject-model/div/div[2]/button[2]");

    By s_readConfirmTextDialogBox = By.xpath("//app-conform-model/mat-dialog-content/div/div[1]");
    By s_clickCloseDialogBox = By.xpath("//app-conform-model/mat-dialog-content/div/div[2]/button[1]");
    By s_clickConfirmDialogBox = By.xpath("//app-conform-model/mat-dialog-content/div/div[2]/button[2]");

    By s_readTestOrderPlacedStatus = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[1]/div/div[2]/h5");
    By s_readTestOrderPlacedDate = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[1]/div/div[2]/span[1]");
    By s_readTestOrderPlacedPerson = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[1]/div/div[2]/span[2]");
    By s_readTestOrderConfirmedStatus = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[2]/div/div[2]/h5");
    By s_readTestOrderConfirmedDate = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[2]/div/div[2]/span[1]");
    By s_readTestOrderConfirmedPerson = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[2]/div/div[2]/span[2]");
    By s_readTestKitShippedBlock = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[3]/div/div[2]");
    By s_readTestKitShippedHeader = By.xpath("//app-ordertrack-form/div/div/div/div/div/div/div/h5");
    By s_setTestKitShippedName = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[1]/div/input");
    By s_setTestKitShippedRemarks = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[2]/div/input");
    By s_setTestKitShippedFedex = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/div/input");
    By s_clickTestKitShippedNext = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[4]/button[2]");
    By s_clickTestKitShippedNext2 = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[4]/button");
    By s_clickTestKitShippedReject = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[4]/button[1]");

    By s_readTestKitShippedStatus = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[3]/div/div[2]/h5");
    By s_readTestKitShippedDate = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[3]/div/div[2]/span[1]");
    By s_readTestKitShippedName = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[3]/div/div[2]/span[2]");
    By readTestKitShippedFedex = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[3]/p");
    By s_readTestkitReturnHeader = By.xpath("//app-ordertrack-form/div/div/div/div/div/div/div/h5");
    By s_setTestKitreturnShippingID = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[1]/div/input");
    By s_setTestKitReturnShippingName = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[2]/div/input");
    By s_clickTestKitReturnBack = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/button[1]");
    By s_clickTestKitReturnNext = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/button[2]");
    By s_readTestKitReturnStatus = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[4]/div/div[2]/h5");
    By s_readTestKitReturnDate = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[4]/div/div[2]/span[1]");
    By s_readTestKitReturnName = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[4]/div/div[2]/span[2]");
    By s_readTestKitReturnShippingDetails = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[4]/p");
    By s_readTestSampleReceivedHeader = By.xpath("//app-ordertrack-form/div/div/div/div/div/div/div/h5");
    By s_setTestSampleReceivedName = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[1]/div/input");
    By s_setTestSampleReceivedRemarks = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[2]/div/input");
    By s_clickTestSampleReceivedBack = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/button[1]");
    By s_clickTestSampleReceivedNext = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/button[3]");
    By s_clickTestSampleReceivedReject = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/button[2]");
    By s_readTestSampleReceivedStatus = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[5]/div/div[2]/h5");
    By s_readTestSampleReceivedDate = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[5]/div/div[2]/span[1]");
    By s_readTestSampleReceivedName = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[5]/div/div[2]/span[2]");
    By s_readTestInProgressHeader = By.xpath("//app-ordertrack-form/div/div/div/div/div/div/div/h5");
    By s_setTestinProgressName = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[1]/div/input");
    By s_setTestinProgressRemarks = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[2]/div/input");
    By s_setTestinProgressLab = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/div/input");

    By s_clickTestinProgressCalender = By.xpath("//mat-datetimepicker-toggle/button/span[1]/mat-icon");
    By readCalenderYear = By.xpath("//mat-datetimepicker-calendar/div/div");
    By s_selectNextMonth = By.xpath("//mat-datetimepicker-calendar/div[2]/div/div[1]/div[3]");
    By s_selectDay = By.xpath("//mat-datetimepicker-month-view/table/tbody/tr[1]/td[2]/div");
    By s_selectHour = By.xpath("//mat-datetimepicker-clock/div/div[3]/div[10]");
    By s_selectMins = By.xpath("//mat-datetimepicker-clock/div/div[4]/div[7]");

    By clickCurrentMonth = By.xpath("//table/tbody/tr/td[@class='mat-datetimepicker-calendar-body-cell mat-datetimepicker-calendar-body-active ng-star-inserted']");
    By clickCurrentday = By.xpath("//mat-datetimepicker-month-view/table/tbody/tr/td[@class = 'mat-datetimepicker-calendar-body-cell mat-datetimepicker-calendar-body-active ng-star-inserted']");
    By clickCurrentHour = By.xpath("//mat-datetimepicker-clock/div/div[3]/div[@class='mat-datetimepicker-clock-cell mat-datetimepicker-clock-cell-disabled mat-datetimepicker-clock-cell-selected ng-star-inserted']");
    By s_clickTestinProgressBack = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[5]/button[1]");
    By s_clickTestinProgressNext = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[5]/button[2]");
    By s_readTestinProgressStatus = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[6]/div/div[2]/h5");
    By s_readTestinProgressDate = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[6]/div/div[2]/span[1]");
    By s_readTestinProgressName = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[6]/div/div[2]/span[2]");
    By s_readTestReportGenerateHeader = By.xpath("//app-ordertrack-form/div/div/div/div/div[1]/div/div/h5");
    By s_setTestReportGenerateName = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[1]/div/input");
    By s_setTestReportGenerateRemarks = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[2]/div/input");
    By s_clickTestReportUpload = By.xpath("//app-ordertrack-form/div/div/div/div/div[2]/button");
    By s_readTestReportUploadHeader = By.xpath("//app-addonmember/div/h3");
    By s_readMember1 = By.xpath("//app-addonmember/div/table/tbody[1]/tr/td[1]/span");
    By s_readMember2 = By.xpath("//app-addonmember/div/table/tbody[2]/tr/td[1]/span");
    By s_readMember3 = By.xpath("//app-addonmember/div/table/tbody[3]/tr/td[1]/span");
    By s_readMember4 = By.xpath("//app-addonmember/div/table/tbody[4]/tr/td[1]/span");
    By s_readMember5 = By.xpath("//app-addonmember/div/table/tbody[5]/tr/td[1]/span");
    By s_clickMember1Upload = By.xpath("//app-addonmember/div/table/tbody[1]/tr/td[2]/div/div/input");
    By s_clickMember2Upload = By.xpath("//app-addonmember/div/table/tbody[2]/tr/td[2]/div/div/input");
    By s_clickMember3Upload = By.xpath("//app-addonmember/div/table/tbody[3]/tr/td[2]/div/div/input");
    By s_clickMember4Upload = By.xpath("//app-addonmember/div/table/tbody[4]/tr/td[2]/div/div/input");
    By s_clickMember5Upload = By.xpath("//app-addonmember/div/table/tbody[5]/tr/td[2]/div/div/input");
    By s_clickCloseTestReportUpload = By.xpath("//app-addonmember/div/div/button[1]");
    By s_clickConfirmTestReportUpload = By.xpath("//app-addonmember/div/div/button[2]");
    By s_clickGenerateReport = By.xpath("//app-ordertrack-form/div/div/div/div/form/div/div/div/div[3]/button");
    By s_readTestReportGeneratedStatus = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[7]/div/div[2]/h5");
    By s_readTestReportGeneratedDate = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[7]/div/div[2]/span[1]");
    By s_readTestReportGeneratedName = By.xpath("//app-order-track/section/div/div[2]/div/ul/li[7]/div/div[2]/span[2]");
    By s_readFinalStatus = By.xpath("//app-order-track/section/div/div[1]/div/div[2]/div/div[1]/div[1]/h4/span");

    public TestOrderTrackPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOrders(String ord) throws IOException {
        try {
            Thread.sleep(8000);
            driver.findElement(test_order_menu).click();
            WebElement search = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(search_box));
            search.clear();
            Thread.sleep(1000);
            search.sendKeys(ord);
            Thread.sleep(5000);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(2000);
            setOrderNo();
            setPatientName();
            setPhoneNumber();
            setOrderStatus();
            setPrice();
            setTestDetails();
            ReadUserDetails();
            Thread.sleep(2000);
            driver.findElement(select_ord).click();
        } catch (NoSuchElementException | TimeoutException | InterruptedException | AWTException e) {
            test6.log(LogStatus.WARNING, "Test orders menu option is not visible");
            getScreenshot("Track_MenuTestOrder");
        }
    }

    public void verifyTestOrderType() throws IOException {
        try {
            Thread.sleep(2000);
            WebElement verifyType = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(test_type));
            String type = verifyType.getAttribute("src");
            System.out.println(type);
            if (type.contains("home%20test%20icon.png")) {
                test6.log(LogStatus.PASS, "This is Home Test order");verifyPatientName();
                verifyOrderNo();
                verifyLabDetails();
                verifyProfilePic();
                verifyOrderNumber();
                verifyOrderStatus();
                verifyTestType();
                VerifyTestDetailsIcon();
                VerifyTestDetails();
                VerifyOrderCreatedDate();
                VerifySchDate();
                clickViewMoreOption();
                readOrderNo();
                readPatientProfilePicture();
                readPatientName();
                readPatientAge();
                readPatientGender();
                readPatientPhone();
                readPatientHeight();
                readPatientWeight();
                readPatientBloodGroup();
                readPatientAddress();
                readAddonMember();
                readTestDetails();
                readTestStatus();
                readTestType();
                readOrderCreatedDate();
                readScheduledDate();
                readPaymentDetails();
                verifyCancelOption();
                verifyOrderPlaced("Test Order Placed");
                verifyOrderConfirmed("Test Order Confirmed");
                verifyDoctorVisit("Doctor will visit your place", dataList.get(22), dataList.get(23), dataList.get(24), "Reject Reason", "Cancel", "Reject", "Are you sure you want to confirm the next process?", "Close", "Confirm", "Next", dataList.get(25), dataList.get(26));
                verifySampleReceive("Test Sample Received", dataList.get(27), dataList.get(28), dataList.get(29), dataList.get(30));
                verifyInProgress("Test in Progress", "Test In Progress", dataList.get(31), dataList.get(32));
                verifyReportGeneration("Test Report Generated", dataList.get(33), dataList.get(34), "Upload", "Test report upload", dataList.get(35), "Generate Report");
                verifyCopyRights();
            } else {
                test6.log(LogStatus.INFO, "This is Self Test order");
                setProfilePic();
                setPatientName1();
                setOrderNo1();
                setAddress();
                setOrderStatus1();
                setTestDetail1();
                //setTestImage();
                setTestName();
                setScheduleDateTime();
                setViewMore();
                setOrderNo2();
                setPatientNameView();
                setOrderNo3();
                setProfileImage2();
                setTestName1();
                verifyTestOrderStatus1();
                setTestType();
                setScheduleDateTime1();
                setPaymentDetailsText();
                setTestOptionName();
                setShippingChargeText();
                setTaxText();
                setTotalText();
                setPatientDetails("Age :", "Gender :", "Phone :", "Height :", "Weight :", "Blood Group :", "Address :");
                verifyAddMemberDetails("Add-on Members (Family or Co-workers)");
                setCancel();
                setTestPlaced();
                setTestConfirmed();
                setFedExNumber();
                setTestShipped();
                setTestReturned();
                setTestSampleReceive();
                setTestInProgress();
                setTestGenerated();
                readTestOrderPlacedStatus();
                readTestOrderConfirmedStatus();
                setTestKitShipped(dataList.get(37), dataList.get(38), dataList.get(39));
                clickTestKitShippedReject(dataList.get(25), dataList.get(26));
                readTestKitShippedStatus();
                setTestkitReturnShipping(dataList.get(40), dataList.get(41));
                readTestKitReturnStatus();
                setTestSample(dataList.get(42), dataList.get(38));
                clickTestSampleReject(dataList.get(25), dataList.get(26));
                readTestSampleStatus();
                setTestinProgress(dataList.get(43), dataList.get(38), dataList.get(44));
                clickTestinProgressCalender();
                clickTestinProgressCalender_Schedule();
                clickTestinProgressNext();
                readTestInProgressStatus();
                Thread.sleep(20000);
                setTestReportName(dataList.get(45), dataList.get(38));
                clickTestReportUpload();
                clickUploadMember1(dataList.get(35));
                clickUploadMember2(dataList.get(35));
                clickUploadMember3(dataList.get(35));
                clickUploadMember4(dataList.get(35));
                clickUploadMember5(dataList.get(35));
                clickTestReportUploadConfirm();
                clickGenerateReport();
                readTestReportStatus();
                readTestReportGenerateDate();
                readTestReportGeneratedName();
                readTestFinalStatus();
                readCopyRights();
            }
        } catch (NoSuchElementException | TimeoutException | InterruptedException | AWTException e) {
            test6.log(LogStatus.WARNING, "Test order type is not visible");
            getScreenshot("Track_TestType");
        }
    }

    public void verifyOrderPlaced(String text) throws IOException {
        try {
            WebElement verifyPlace = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(test_ord_place));
            String place = verifyPlace.getText();
            //System.out.println(place);
            if (text.equals(place)) {
                test6.log(LogStatus.PASS, "Text shown as per the requirement : " + place);
            } else {
                test6.log(LogStatus.FAIL, "Text not shown as per the requirement : " + place);
                getScreenshot("Track_PlaceText");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Placed text not visible");
            getScreenshot("Track_PlaceText");
        }
        try {
            WebElement verifyPlace = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(place_date));
            String place = verifyPlace.getText();
            //System.out.println(place);
            if (text.equals("null")) {
                test6.log(LogStatus.FAIL, "Date not shown as per the requirement : " + place);
                getScreenshot("Track_PlaceDate");
            } else {
                test6.log(LogStatus.PASS, "Date shown as per the requirement : " + place);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Placed date not visible");
            getScreenshot("Track_PlaceDate");
        }
        try {
            WebElement verifyPlace = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(place_name));
            String place = verifyPlace.getText();
            //System.out.println(place);
            if (place.equals("null")) {
                test6.log(LogStatus.FAIL, "User name not shown as per the requirement : " + place);
                getScreenshot("Track_PlaceName");
            } else {
                test6.log(LogStatus.PASS, "User name shown as per the requirement : " + place);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Placed - User name not visible");
            getScreenshot("Track_PlaceName");
        }
        getOrderStatus();
    }

    public void verifyOrderConfirmed(String text) throws IOException {
        try {
            WebElement verifyPlace = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(test_ord_conf));
            String place = verifyPlace.getText();
            //System.out.println(place);
            if (text.equals(place)) {
                test6.log(LogStatus.PASS, "Text shown as per the requirement : " + place);
            } else {
                test6.log(LogStatus.FAIL, "Text not shown as per the requirement : " + place);
                getScreenshot("Track_ConfText");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Confirmed text not visible");
            getScreenshot("Track_ConfText");
        }
        try {
            WebElement verifyPlace = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(conf_date));
            String place = verifyPlace.getText();
            //System.out.println(place);
            if (place.equals("null")) {
                test6.log(LogStatus.FAIL, "Date not shown as per the requirement : " + place);
                getScreenshot("Track_ConfDate");
            } else {
                test6.log(LogStatus.PASS, "Date shown as per the requirement : " + place);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Confirmed date not visible");
            getScreenshot("Track_ConfDate");
        }
        try {
            WebElement verifyPlace = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(conf_name));
            String place = verifyPlace.getText();
            //System.out.println(place);
            if (place.equals("null")) {
                test6.log(LogStatus.FAIL, "Admin name not shown as per the requirement : " + place);
                getScreenshot("Track_ConfName");
            } else {
                test6.log(LogStatus.PASS, "Admin name shown as per the requirement : " + place);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Confirmed - Admin name not visible");
            getScreenshot("Track_ConfName");
        }
        getOrderStatus();
    }

    public void verifyDoctorVisit(String text, String DN, String PN, String R, String RRT, String RC, String RR, String AHT, String ACL, String ACF, String N, String RRC, String RRI) throws IOException {
        WebElement ord = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(ord_status));
        String ordS = ord.getText();
        if (ordS.contains("Rejected")) {
            test6.log(LogStatus.WARNING, "Doctor will visit Screen - Order Status is : " + ordS);
        } else if (ordS.contains("Refunded")) {
            test6.log(LogStatus.WARNING, "Doctor will visit Screen - Order Status is : " + ordS);
        } else {
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(doctor_visit));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (text.equals(place)) {
                    test6.log(LogStatus.PASS, "Text shown as per the requirement : " + place);
                } else {
                    test6.log(LogStatus.FAIL, "Text not shown as per the requirement : " + place);
                    getScreenshot("Track_DocText");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Doctor will visit text not visible");
                getScreenshot("Track_DocText");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(doc_text_header));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (text.equals(place)) {
                    test6.log(LogStatus.PASS, "Header Text shown as per the requirement : " + place);
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(doc_text_name));
                        setEmail.sendKeys(DN);
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Doctor name enter field not visible");
                        getScreenshot("Track_DocNameField");
                    }
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(doc_text_number));
                        setEmail.sendKeys(PN);
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Doctor phone number enter field not visible");
                        getScreenshot("Track_DocPhoneField");
                    }
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(doc_text_remarks));
                        setEmail.sendKeys(R);
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Doctor remarks enter field not visible");
                        getScreenshot("Track_DocReField");
                    }
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(doc_text_calendar));
                        setEmail.click();
                        WebElement setMonth = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(calendar_nxt_month));
                        setMonth.click();
                        Thread.sleep(2000);
                        driver.findElement(calendar_day).click();
                        WebElement setTime = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(select_time));
                        setTime.click();
                        WebElement setMin = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(select_min));
                        setMin.click();
                    } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
                        test6.log(LogStatus.FAIL, "Doctor select calendar field not visible");
                        getScreenshot("Track_DocCalField");
                    }
                    if (RRC.equals("No")) {
                        try {
                            WebElement clickNxt = new WebDriverWait(driver, 1)
                                    .until(driver -> driver.findElement(next_button));
                            String nxtT = clickNxt.getText();
                            if (N.equals(nxtT)) {
                                test6.log(LogStatus.PASS, "Next button Text shown as per the requirement : " + nxtT);
                            } else {
                                test6.log(LogStatus.FAIL, "Next button Text not shown as per the requirement : " + nxtT);
                                getScreenshot("Track_NxtBText");
                            }
                            clickNxt.click();
                            try {
                                WebElement nxtH = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(next_popup_text));
                                String nxtHT = nxtH.getText();
                                //System.out.println(text1);
                                if (AHT.equals(nxtHT)) {
                                    test6.log(LogStatus.PASS, "Header Text shown as per the requirement : " + nxtHT);
                                } else {
                                    test6.log(LogStatus.FAIL, "Header Text not shown as per the requirement : " + nxtHT);
                                    getScreenshot("Track_NxtHeaderText");
                                }
                                WebElement nxtCl = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(next_close));
                                String nxtClT = nxtCl.getText();
                                //System.out.println(cancel);
                                if (ACL.equals(nxtClT)) {
                                    test6.log(LogStatus.PASS, "Close button Text shown as per the requirement : " + nxtClT);
                                } else {
                                    test6.log(LogStatus.FAIL, "Close button Text not shown as per the requirement : " + nxtClT);
                                    getScreenshot("Track_NxtCloseButton");
                                }
                                WebElement nxtConf = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(next_confirm));
                                String nxtCfT = nxtConf.getText();
                                //System.out.println(reject);
                                if (ACF.equals(nxtCfT)) {
                                    test6.log(LogStatus.PASS, "Confirm button Text shown as per the requirement : " + nxtCfT);
                                } else {
                                    test6.log(LogStatus.FAIL, "Confirm button Text not shown as per the requirement : " + nxtCfT);
                                    getScreenshot("Track_NxtConfButton");
                                }
                                nxtConf.click();
                                getNotification();
                                getOrderStatus();
                            } catch (NoSuchElementException | TimeoutException e) {
                                test6.log(LogStatus.FAIL, "Next button popup not visible");
                                getScreenshot("Track_NxtPopup");
                            }
                        } catch (NoSuchElementException | TimeoutException e) {
                            test6.log(LogStatus.FAIL, "Doctor screen Next button not visible");
                            getScreenshot("Track_DocNxtButton");
                        }
                    } else {
                        try {
                            WebElement rejB = new WebDriverWait(driver, 1)
                                    .until(driver -> driver.findElement(reject_button));
                            String rejBT = rejB.getText();
                            if (RR.equals(rejBT)) {
                                test6.log(LogStatus.PASS, "Reject button Text shown as per the requirement : " + rejBT);
                            } else {
                                test6.log(LogStatus.FAIL, "Reject button Text not shown as per the requirement : " + rejBT);
                                getScreenshot("Track_RejBText");
                            }
                            rejB.click();
                            try {
                                WebElement rejH = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(rej_popup_text));
                                String rejHT = rejH.getText();
                                //System.out.println(text1);
                                if (RRT.equals(rejHT)) {
                                    test6.log(LogStatus.PASS, "Header Text shown as per the requirement : " + rejHT);
                                } else {
                                    test6.log(LogStatus.FAIL, "Header Text not shown as per the requirement : " + rejHT);
                                    getScreenshot("Track_RejHeaderText");
                                }
                                WebElement rejCB = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(rej_cancel));
                                String rejCT = rejCB.getText();
                                //System.out.println(cancel);
                                if (RC.equals(rejCT)) {
                                    test6.log(LogStatus.PASS, "Cancel button Text shown as per the requirement : " + rejCT);
                                } else {
                                    test6.log(LogStatus.FAIL, "Cancel button Text not shown as per the requirement : " + rejCT);
                                    getScreenshot("Track_RejCanButton");
                                }
                                WebElement rejRB = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(rej_reject));
                                String rejRT = rejRB.getText();
                                //System.out.println(cancel);
                                if (RR.equals(rejRT)) {
                                    test6.log(LogStatus.PASS, "Reject button Text shown as per the requirement : " + rejRT);
                                } else {
                                    test6.log(LogStatus.FAIL, "Reject button Text not shown as per the requirement : " + rejRT);
                                    getScreenshot("Track_RejRejButton");
                                }
                                WebElement setReason = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(rej_reason_text));
                                setReason.sendKeys(RRI);
                                WebElement rejRBT = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(rej_reject));
                                rejRBT.click();
                                test6.log(LogStatus.PASS, "Reject Reason Popup - Clicked the Reject button");
                                getNotification();
                                getOrderStatus();
                            } catch (NoSuchElementException | TimeoutException e) {
                                test6.log(LogStatus.FAIL, "Reject Reason popup not visible");
                                getScreenshot("Track_RejPopup");
                            }
                        } catch (NoSuchElementException | TimeoutException e) {
                            test6.log(LogStatus.FAIL, "Doctor screen Reject button not visible");
                            getScreenshot("Track_DocRejButton");
                        }
                    }
                } else {
                    test6.log(LogStatus.SKIP, "Header Text not shown as per the requirement : " + place);
                    getScreenshot("Track_DocHeaderText");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Doctor will visit header text not visible");
                getScreenshot("Track_DocHeaderText");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(doctor_date));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (text.equals("null")) {
                    test6.log(LogStatus.FAIL, "Date not shown as per the requirement : " + place);
                    getScreenshot("Track_DocVisitDate");
                } else {
                    test6.log(LogStatus.PASS, "Date shown as per the requirement : " + place);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Doctor visit date not visible");
                getScreenshot("Track_DocVisitDate");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(doctor_name));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (place.equals(DN)) {
                    test6.log(LogStatus.PASS, "Doctor name shown as per the requirement : " + place);
                } else {
                    test6.log(LogStatus.SKIP, "Doctor name not shown as per the requirement : " + place);
                    getScreenshot("Track_DocName");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Doctor name not visible");
                getScreenshot("Track_DocName");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(doctor_number));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (place.equals(PN)) {
                    test6.log(LogStatus.WARNING, "Phone number not shown as per the US format : " + place);
                } else if (place.equals("null")) {
                    test6.log(LogStatus.FAIL, "Phone number not shown as per the requirement : " + place);
                    getScreenshot("Track_DocPhone");
                } else {
                    test6.log(LogStatus.PASS, "Phone number shown as per the requirement : " + place);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Doctor Phone number not visible");
                getScreenshot("Track_DocPhone");
            }
            getOrderStatus();
        }
    }

    public void verifySampleReceive(String text, String SN, String R, String RRC, String RR) throws IOException {
        WebElement ord = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(ord_status));
        String ordS = ord.getText();
        if (ordS.contains("Rejected")) {
            test6.log(LogStatus.WARNING, "Sample Receiver Screen - Order Status is : " + ordS);
        } else if (ordS.contains("Refunded")) {
            test6.log(LogStatus.WARNING, "Sample Receiver Screen - Order Status is : " + ordS);
        } else {
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(test_sample_rec));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (text.equals(place)) {
                    test6.log(LogStatus.PASS, "Text shown as per the requirement : " + place);
                } else {
                    test6.log(LogStatus.FAIL, "Text not shown as per the requirement : " + place);
                    getScreenshot("Track_RecText");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Test Sample Receive text not visible");
                getScreenshot("Track_RecText");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(sample_rec_text));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (text.equals(place)) {
                    test6.log(LogStatus.PASS, "Header Text shown as per the requirement : " + place);
                    try {
                        if (driver.findElement(back_button).isDisplayed()) {
                            test6.log(LogStatus.PASS, "Back button is shown as per the requirement");
                        } else {
                            test6.log(LogStatus.FAIL, "Back button is not shown as per the requirement");
                            getScreenshot("Track_RecBack");
                        }
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Back button not visible");
                        getScreenshot("Track_RecBackButton");
                    }
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(sample_text_name));
                        setEmail.sendKeys(SN);
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Receiver name enter field not visible");
                        getScreenshot("Track_RecNameField");
                    }
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(sample_text_remarks));
                        setEmail.sendKeys(R);
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Receiver remarks enter field not visible");
                        getScreenshot("Track_RecReField");
                    }
                    if (RRC.equals("No")) {
                        try {
                            Thread.sleep(2000);
                            Robot robot = new Robot();
                            //Move to back button
                            robot.keyPress(KeyEvent.VK_TAB);
                            robot.keyRelease(KeyEvent.VK_TAB);
                            //Move to reject button
                            robot.keyPress(KeyEvent.VK_TAB);
                            robot.keyRelease(KeyEvent.VK_TAB);
                            //Move to next button
                            robot.keyPress(KeyEvent.VK_TAB);
                            robot.keyRelease(KeyEvent.VK_TAB);
                            robot.keyPress(KeyEvent.VK_ENTER);
                            robot.keyRelease(KeyEvent.VK_ENTER);
                            test6.log(LogStatus.PASS, "Next button is Clicked");
                            try {
                                WebElement setConf = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(next_confirm));
                                setConf.click();
                                getNotification();
                            } catch (NoSuchElementException | TimeoutException e) {
                                test6.log(LogStatus.FAIL, "Next button popup not visible");
                                getScreenshot("Track_NxtPopup");
                            }
                        } catch (NoSuchElementException | TimeoutException | InterruptedException | AWTException e) {
                            test6.log(LogStatus.FAIL, "Next button is not visible");
                            getScreenshot("Track_RecNxtB");
                        }
                    } else {
                        try {
                            Thread.sleep(2000);
                            Robot robot = new Robot();
                            //Move to back button
                            robot.keyPress(KeyEvent.VK_TAB);
                            robot.keyRelease(KeyEvent.VK_TAB);
                            //Move to reject button
                            robot.keyPress(KeyEvent.VK_TAB);
                            robot.keyRelease(KeyEvent.VK_TAB);
                            robot.keyPress(KeyEvent.VK_ENTER);
                            robot.keyRelease(KeyEvent.VK_ENTER);
                            test6.log(LogStatus.PASS, "Reject button is Clicked");
                            try {
                                WebElement setReason = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(rej_reason_text));
                                setReason.sendKeys(RR);
                                WebElement rejRBT = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(rej_reject));
                                rejRBT.click();
                                test6.log(LogStatus.PASS, "Reject Reason Popup - Clicked the Reject button");
                                getNotification();
                                getOrderStatus();
                            } catch (NoSuchElementException | TimeoutException e) {
                                test6.log(LogStatus.FAIL, "Reject Reason popup is not visible");
                                getScreenshot("Track_RejPopup");
                            }
                        } catch (NoSuchElementException | TimeoutException | InterruptedException | AWTException e) {
                            test6.log(LogStatus.FAIL, "Reject button is not visible");
                            getScreenshot("Track_RecRejB");
                        }
                    }
                } else {
                    test6.log(LogStatus.SKIP, "Header Text not shown as per the requirement : " + place);
                    getScreenshot("Track_RecHeaderText");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Sample Receive header text not visible");
                getScreenshot("Track_RecHeaderText");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(sample_rec_date));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (place.equals("null")) {
                    test6.log(LogStatus.FAIL, "Date not shown as per the requirement : " + place);
                    getScreenshot("Track_RecDate");
                } else {
                    test6.log(LogStatus.PASS, "Date shown as per the requirement : " + place);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Receiver date not visible");
                getScreenshot("Track_RecDate");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(sample_rec_name));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (place.equals(SN)) {
                    test6.log(LogStatus.PASS, "Receiver name shown as per the requirement : " + place);
                } else {
                    test6.log(LogStatus.SKIP, "Receiver name not shown as per the requirement : " + place);
                    getScreenshot("Track_RecName");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Receiver name not visible");
                getScreenshot("Track_RecName");
            }
            getOrderStatus();
        }

    }

    public void verifyInProgress(String text, String HT, String IN, String R) throws IOException {
        WebElement ord = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(ord_status));
        String ordS = ord.getText();
        if (ordS.contains("Rejected")) {
            test6.log(LogStatus.WARNING, "Test In Progress Screen - Order Status is : " + ordS);
        } else if (ordS.contains("Refunded")) {
            test6.log(LogStatus.WARNING, "Test In Progress Screen - Order Status is : " + ordS);
        } else {
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(test_in_progress));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (text.equals(place)) {
                    test6.log(LogStatus.PASS, "Text shown as per the requirement : " + place);
                } else {
                    test6.log(LogStatus.FAIL, "Text not shown as per the requirement : " + place);
                    getScreenshot("Track_InText");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Test In Progress text not visible");
                getScreenshot("Track_InText");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(in_text));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (HT.equals(place)) {
                    test6.log(LogStatus.PASS, "Header Text shown as per the requirement : " + place);
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(in_text_name));
                        setEmail.sendKeys(IN);
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Enter the name field not visible");
                        getScreenshot("Track_InNameField");
                    }
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(in_remarks));
                        setEmail.sendKeys(R);
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "In Progress remarks enter field not visible");
                        getScreenshot("Track_InReField");
                    }
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(in_calendar));
                        setEmail.click();
                        try {
                            Thread.sleep(2000);
                            driver.findElement(in_calendar_nxt_month).click();
                        } catch (NoSuchElementException | TimeoutException | ElementClickInterceptedException e) {
                            test6.log(LogStatus.SKIP, "Calendar - next month select option not visible");
                        }
                        Thread.sleep(2000);
                        driver.findElement(in_calendar_day).click();
                        WebElement setTime = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(select_time));
                        setTime.click();
                        WebElement setMin = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(select_min));
                        setMin.click();
                    } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
                        test6.log(LogStatus.FAIL, "In Progress select calendar field not visible");
                        getScreenshot("Track_InCalField");
                    }
                    try {
                        WebElement setB = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(back_button));
                        if (setB.isDisplayed()) {
                            test6.log(LogStatus.PASS, "Back button is shown as per the requirement");
                        } else {
                            test6.log(LogStatus.FAIL, "Back button is not shown as per the requirement");
                            getScreenshot("Track_InBack");
                        }
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.SKIP, "Back button not visible");
                        getScreenshot("Track_InBackButton");
                    }
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(next_button));
                        setEmail.click();
                        try {
                            WebElement setConf = new WebDriverWait(driver, 1)
                                    .until(driver -> driver.findElement(next_confirm));
                            setConf.click();
                            getNotification();
                        } catch (NoSuchElementException | TimeoutException e) {
                            test6.log(LogStatus.FAIL, "Next button popup not visible");
                            getScreenshot("Track_NxtPopup");
                        }
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Receiver screen Next button not visible");
                        getScreenshot("Track_RecNxtButton");
                    }
                } else {
                    test6.log(LogStatus.SKIP, "Header Text not shown as per the requirement : " + place);
                    getScreenshot("Track_InHeaderText");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "In Progress Header text not visible");
                getScreenshot("Track_InHeaderText");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(in_date));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (place.equals("null")) {
                    test6.log(LogStatus.FAIL, "Date not shown as per the requirement : " + place);
                    getScreenshot("Track_InDate");
                } else {
                    test6.log(LogStatus.PASS, "Date shown as per the requirement : " + place);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "In Progress date not visible");
                getScreenshot("Track_InDate");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(in_name));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (place.equals(IN)) {
                    test6.log(LogStatus.PASS, "In Progress user name shown as per the requirement : " + place);
                } else {
                    test6.log(LogStatus.SKIP, "In Progress user name not shown as per the requirement : " + place);
                    getScreenshot("Track_InName");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "In Progress name not visible");
                getScreenshot("Track_InName");
            }
            getOrderStatus();
        }
    }

    public void verifyReportGeneration(String text, String RN, String R, String U, String UHT, String Img, String G) throws IOException, AWTException {
        WebElement ord = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(ord_status));
        String ordS = ord.getText();
        if (ordS.contains("Rejected")) {
            test6.log(LogStatus.WARNING, "Report Generate Screen - Order Status is : " + ordS);
        } else if (ordS.contains("Refunded")) {
            test6.log(LogStatus.WARNING, "Report Generate Screen - Order Status is : " + ordS);
        } else {
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(test_rep_generate));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (text.equals(place)) {
                    test6.log(LogStatus.PASS, "Text shown as per the requirement : " + place);
                } else {
                    test6.log(LogStatus.FAIL, "Text not shown as per the requirement : " + place);
                    getScreenshot("Track_RepText");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.FAIL, "Report Generation text not visible");
                getScreenshot("Track_RepText");
            }
            try {
                WebElement verifyPlace = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(rep_text));
                String place = verifyPlace.getText();
                //System.out.println(place);
                if (text.equals(place)) {
                    test6.log(LogStatus.PASS, "Header Text shown as per the requirement : " + place);
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(rep_text_name));
                        setEmail.sendKeys(RN);
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Enter the name field not visible");
                        getScreenshot("Track_RepNameField");
                    }
                    try {
                        if (driver.findElement(rep_upload_button).isDisplayed()) {
                            test6.log(LogStatus.PASS, "Upload button is shown as per the requirement");
                            WebElement setEmail = new WebDriverWait(driver, 1)
                                    .until(driver -> driver.findElement(rep_upload_button));
                            String up = setEmail.getText();
                            if (up.equals(U)) {
                                test6.log(LogStatus.PASS, "Upload button Text shown as per the requirement : " + up);
                            } else {
                                test6.log(LogStatus.FAIL, "Upload button Text not shown as per the requirement : " + up);
                                getScreenshot("Track_UpButtonText");
                            }
                            setEmail.click();
                            try {
                                WebElement setText = new WebDriverWait(driver, 1)
                                        .until(driver -> driver.findElement(upload_header_text));
                                String uText = setText.getText();
                                if (uText.equals(UHT)) {
                                    test6.log(LogStatus.PASS, "Header Text shown as per the requirement : " + uText);
                                } else {
                                    test6.log(LogStatus.FAIL, "Header Text not shown as per the requirement : " + uText);
                                    getScreenshot("Track_UpHeaderText");
                                }
                                try {
                                    WebElement setTex = new WebDriverWait(driver, 10)
                                            .until(driver -> driver.findElement(upload_user_name));
                                    String name = setTex.getText();
                                    if (name.equals("null")) {
                                        test6.log(LogStatus.PASS, "User name shown as per the requirement : " + uText);
                                    } else {
                                        test6.log(LogStatus.SKIP, "User name not shown as per the requirement : " + uText);
                                        getScreenshot("Track_UpUserName");
                                    }
                                } catch (NoSuchElementException | TimeoutException e) {
                                    test6.log(LogStatus.WARNING, "User name not visible");
                                    getScreenshot("Track_UpUserName");
                                }
                                try {
                                    Thread.sleep(2000);
                                    WebElement setChoose = new WebDriverWait(driver, 1)
                                            .until(driver -> driver.findElement(choose_file_button));
                                    setChoose.click();
                                    test6.log(LogStatus.PASS, "Clicked the Choose file button");

                                    Thread.sleep(2000);
                                    StringSelection ss = new StringSelection(Img);
                                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

                                    Robot robot = new Robot();

                                    robot.keyPress(KeyEvent.VK_CONTROL);
                                    robot.keyPress(KeyEvent.VK_V);
                                    robot.keyRelease(KeyEvent.VK_V);
                                    robot.keyRelease(KeyEvent.VK_CONTROL);
                                    robot.keyPress(KeyEvent.VK_ENTER);
                                    robot.keyRelease(KeyEvent.VK_ENTER);
                                    test6.log(LogStatus.PASS, "Uploaded the report file");
                                    clickUploadSubmit();
                                } catch (NoSuchElementException | TimeoutException | AWTException | InterruptedException e1) {
                                    test6.log(LogStatus.FAIL, "Choose button not visible");
                                    getScreenshot("Track_UpChButton");
                                }
                            } catch (NoSuchElementException | TimeoutException e) {
                                test6.log(LogStatus.FAIL, "Upload Popup screen not visible");
                                getScreenshot("Track_RepUpPopup");
                            }
                        } else {
                            test6.log(LogStatus.FAIL, "Upload button is not shown as per the requirement");
                            getScreenshot("Track_RepUpButton");
                        }
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Upload button not visible");
                        getScreenshot("Track_RepUpBT");
                    }
                    try {
                        WebElement setEmail = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(rep_text_remarks));
                        setEmail.sendKeys(R);
                        test6.log(LogStatus.PASS, "Entered the remarks : " + R);
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Report remarks enter field not visible");
                        getScreenshot("Track_RepReField");
                    }
                    try {
                        WebElement gButton = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(generate_rep_button));
                        String genB = gButton.getText();
                        if (genB.equals(G)) {
                            test6.log(LogStatus.PASS, "Button text shown as per the requirement : " + genB);
                        } else {
                            test6.log(LogStatus.FAIL, "Button text not shown as per the requirement : " + genB);
                            getScreenshot("Track_GenRepBT");
                        }
                        gButton.click();
                        test6.log(LogStatus.PASS, "Generate Report button clicked");
                        try {
                            WebElement setClo = new WebDriverWait(driver, 1)
                                    .until(driver -> driver.findElement(next_close));
                            setClo.click();
                            test6.log(LogStatus.PASS, "Popup Close button clicked");
                            WebElement gButton1 = new WebDriverWait(driver, 1)
                                    .until(driver -> driver.findElement(generate_rep_button));
                            gButton1.click();
                            test6.log(LogStatus.PASS, "Again Generate Report button clicked");
                            Thread.sleep(1000);
                            Robot robot = new Robot();
                            robot.keyPress(KeyEvent.VK_TAB);
                            robot.keyRelease(KeyEvent.VK_TAB);
                            robot.keyPress(KeyEvent.VK_ENTER);
                            robot.keyRelease(KeyEvent.VK_ENTER);
                            test6.log(LogStatus.PASS, "Popup Confirm button clicked");
                            getNotification();
                        } catch (NoSuchElementException | TimeoutException | AWTException | InterruptedException e) {
                            test6.log(LogStatus.FAIL, "Next button popup not visible");
                            getScreenshot("Track_NxtPopup");
                        }
                    } catch (NoSuchElementException | TimeoutException e) {
                        test6.log(LogStatus.FAIL, "Generate report button is not visible");
                        getScreenshot("Track_GenRepButton");
                    }
                } else {
                    test6.log(LogStatus.FAIL, "Header Text not shown as per the requirement : " + place);
                    getScreenshot("Track_RepHeaderText");
                }
            } catch (NoSuchElementException |
                    TimeoutException e) {
                test6.log(LogStatus.FAIL, "Report Header text not visible");
                getScreenshot("Track_RepHeaderText");
            }
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            getOrderStatus();
        }
    }

    public void uploadSecondReport() {
        try {
            WebElement setChoose = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(choose_two_button));
            if (setChoose.isDisplayed()) {
                setChoose.click();
                test6.log(LogStatus.PASS, "Clicked the Choose file button 2");

                Thread.sleep(2000);
                Robot robot = new Robot();

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                test6.log(LogStatus.PASS, "Uploaded the report file");
                try {
                    WebElement setTex = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(upload_user_name2));
                    String name = setTex.getText();
                    if (name.equals("null") || name.isEmpty()) {
                        test6.log(LogStatus.FAIL, "User name 2 not shown as per the requirement : " + name);
                        getScreenshot("Track_UpUserName2");
                    } else {
                        test6.log(LogStatus.PASS, "User name 2 shown as per the requirement : " + name);
                    }
                } catch (NoSuchElementException | TimeoutException | IOException e) {
                    test6.log(LogStatus.WARNING, "User name not visible");
                }
            } else {
                test6.log(LogStatus.SKIP, "Choose button 2 not visible");
            }
        } catch (NoSuchElementException | TimeoutException | AWTException | InterruptedException e1) {
            test6.log(LogStatus.SKIP, "Choose button 2 not visible");
        }
    }

    public void uploadThirdReport() {
        try {
            WebElement setChoose = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(choose_three_button));
            if (setChoose.isDisplayed()) {
                setChoose.click();
                test6.log(LogStatus.PASS, "Clicked the Choose file button 3");

                Thread.sleep(2000);
                Robot robot = new Robot();

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                test6.log(LogStatus.PASS, "Uploaded the report file");
                try {
                    WebElement setTex = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(upload_user_name3));
                    String name = setTex.getText();
                    if (name.equals("null") || name.isEmpty()) {
                        test6.log(LogStatus.FAIL, "User name 3 not shown as per the requirement : " + name);
                        getScreenshot("Track_UpUserName3");
                    } else {
                        test6.log(LogStatus.PASS, "User name 3 shown as per the requirement : " + name);
                    }
                } catch (NoSuchElementException | TimeoutException | IOException e) {
                    test6.log(LogStatus.WARNING, "User name 3 not visible");
                }
            } else {
                test6.log(LogStatus.SKIP, "Choose button 3 not visible");
            }
        } catch (NoSuchElementException | TimeoutException | AWTException | InterruptedException e1) {
            test6.log(LogStatus.SKIP, "Choose button 3 not visible");
        }
    }

    public void uploadFourthReport() {
        try {
            WebElement setChoose = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(choose_four_button));
            if (setChoose.isDisplayed()) {
                setChoose.click();
                test6.log(LogStatus.PASS, "Clicked the Choose file button 4");

                Thread.sleep(2000);
                Robot robot = new Robot();

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                test6.log(LogStatus.PASS, "Uploaded the report file");
                try {
                    WebElement setTex = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(upload_user_name4));
                    String name = setTex.getText();
                    if (name.equals("null") || name.isEmpty()) {
                        test6.log(LogStatus.FAIL, "User name 4 not shown as per the requirement : " + name);
                        getScreenshot("Track_UpUserName4");
                    } else {
                        test6.log(LogStatus.PASS, "User name 4 shown as per the requirement : " + name);
                    }
                } catch (NoSuchElementException | TimeoutException | IOException e) {
                    test6.log(LogStatus.WARNING, "User name 4 not visible");
                }
            } else {
                test6.log(LogStatus.SKIP, "Choose button 4 not visible");
            }
        } catch (NoSuchElementException | TimeoutException | AWTException | InterruptedException e1) {
            test6.log(LogStatus.SKIP, "Choose button 4 not visible");
        }
    }

    public void uploadFifthReport() {
        try {
            WebElement setChoose = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(choose_five_button));
            if (setChoose.isDisplayed()) {
                setChoose.click();
                test6.log(LogStatus.PASS, "Clicked the Choose file button 5");

                Thread.sleep(2000);
                Robot robot = new Robot();

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                test6.log(LogStatus.PASS, "Uploaded the report file");
                try {
                    WebElement setTex = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(upload_user_name5));
                    String name = setTex.getText();
                    if (name.equals("null") || name.isEmpty()) {
                        test6.log(LogStatus.FAIL, "User name 5 not shown as per the requirement : " + name);
                        getScreenshot("Track_UpUserName5");
                    } else {
                        test6.log(LogStatus.PASS, "User name 5 shown as per the requirement : " + name);
                    }
                } catch (NoSuchElementException | TimeoutException | IOException e) {
                    test6.log(LogStatus.WARNING, "User name 5 not visible");
                }
            } else {
                test6.log(LogStatus.SKIP, "Choose button 5 not visible");
            }
        } catch (NoSuchElementException | TimeoutException | AWTException | InterruptedException e1) {
            test6.log(LogStatus.SKIP, "Choose button 5 not visible");
        }
    }

    public void clickUploadSubmit() throws IOException {
        try {
            WebElement submit = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(upload_submit));
            Thread.sleep(2000);
            if (submit.isEnabled()) {
                submit.click();
                test6.log(LogStatus.PASS, "Upload Popup submit button Clicked");
            } else {
                uploadSecondReport();
                try {
                    WebElement submit2 = new WebDriverWait(driver, 5)
                            .until(driver -> driver.findElement(upload_submit));
                    Thread.sleep(2000);
                    if (submit2.isEnabled()) {
                        submit2.click();
                        test6.log(LogStatus.PASS, "Upload Popup submit button Clicked");
                    } else {
                        uploadThirdReport();
                        try {
                            WebElement submit3 = new WebDriverWait(driver, 5)
                                    .until(driver -> driver.findElement(upload_submit));
                            Thread.sleep(2000);
                            if (submit3.isEnabled()) {
                                submit3.click();
                                test6.log(LogStatus.PASS, "Upload Popup submit button Clicked");
                            } else {
                                uploadFourthReport();
                                try {
                                    WebElement submit4 = new WebDriverWait(driver, 5)
                                            .until(driver -> driver.findElement(upload_submit));
                                    Thread.sleep(2000);
                                    if (submit4.isEnabled()) {
                                        submit4.click();
                                        test6.log(LogStatus.PASS, "Upload Popup submit button Clicked");
                                    } else {
                                        uploadFifthReport();
                                        try {
                                            WebElement submit5 = new WebDriverWait(driver, 5)
                                                    .until(driver -> driver.findElement(upload_submit));
                                            Thread.sleep(2000);
                                            if (submit5.isEnabled()) {
                                                submit5.click();
                                                test6.log(LogStatus.PASS, "Upload Popup submit button Clicked");
                                            } else {
                                                test6.log(LogStatus.SKIP, "Upload Popup Submit button not visible");
                                            }
                                        } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
                                            test6.log(LogStatus.WARNING, "Upload Popup Submit button not visible");
                                            getScreenshot("Track_RepUpPopSubBT");
                                        }
                                    }
                                } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
                                    test6.log(LogStatus.WARNING, "Upload Popup Submit button not visible");
                                    getScreenshot("Track_RepUpPopSubBT");
                                }
                            }
                        } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
                            test6.log(LogStatus.WARNING, "Upload Popup Submit button not visible");
                            getScreenshot("Track_RepUpPopSubBT");
                        }
                    }
                } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
                    test6.log(LogStatus.WARNING, "Upload Popup Submit button not visible");
                    getScreenshot("Track_RepUpPopSubBT");
                }
            }
        } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
            test6.log(LogStatus.WARNING, "Upload Popup Submit button not visible");
            getScreenshot("Track_RepUpPopSubBT");
        }
    }

    public void getOrderStatus() throws IOException {
        try {
            WebElement ord = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ord_status));
            String ordS = ord.getText();
            if (ordS.equals("null")) {
                test6.log(LogStatus.FAIL, "Order status is not shown as per the requirement : " + ordS);
                getScreenshot("Track_OrdS");
            } else {
                test6.log(LogStatus.PASS, "Order status is shown as per the requirement : " + ordS);
            }
        } catch (NoSuchElementException |
                TimeoutException e) {
            test6.log(LogStatus.FAIL, "Order status is not visible");
            getScreenshot("Track_OrdS");
        }
    }

    public void storeOrderStatus() throws IOException {
        try {
            Thread.sleep(2000);
            WebElement ord = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ord_status));
            String ordS = ord.getText();
            //dataList.remove(36);
            //dataList.add(36, ordS);
            if (ordS.equals("null")) {
                test6.log(LogStatus.FAIL, "Order status is not shown as per the requirement : " + ordS);
                getScreenshot("Track_OrdS");
            } else {
                test6.log(LogStatus.PASS, "Order status is shown as per the requirement : " + ordS);
            }
        } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
            test6.log(LogStatus.FAIL, "Order status is not visible");
            getScreenshot("Track_OrdS");
        }
    }

    public void getNotification() throws IOException {
        getScreenshot("Track_Not");
        try {
            Thread.sleep(100);
            getScreenshot("Track_Noti");
            WebElement setNot = driver.findElement(notify);
            String noty = setNot.getText();
            //System.out.println(noty);
            if (noty.equals("null")) {
                test6.log(LogStatus.WARNING, "Notification not visible : " + noty);
            } else {
                test6.log(LogStatus.PASS, "Notification text is : " + noty);
            }
        } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
            test6.log(LogStatus.WARNING, "Can't able to get the notification text");
            getScreenshot("Track_Notify");
        }
    }

    public void readTestOrderListPageOrderNo() throws IOException {
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Order Number:");
            WebElement OrderID = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestorderid));
            String Text = OrderID.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Order number not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Order number is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Order No");
        }
    }

    //Reading Patient Name
    public void readTestOrderListPagePatientName() throws IOException {
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Patient Name:");
            WebElement PatientName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestPatientName));
            String Text = PatientName.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient name not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient name is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Patient name is not displayed");
            getScreenshot("TestOrderlistpage-Patient Name");
        }
    }

    //Reading  Patient Profile Image
    public void readTestOrderListPageProfileImage() throws IOException {
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Patient Profile Image");
            WebElement ProfileImage = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestPatientProfileImage));
            String img = ProfileImage.getAttribute("src");
            if (img.contains(".jpg") || img.contains(".jpeg")) {
                test6.log(LogStatus.WARNING, "Patient Profile Image was Displayed");
            } else {
                test6.log(LogStatus.WARNING, "Patient Profile Image was not Displayed");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.PASS, "Patient Profile Iamge is Displayed");
            getScreenshot("Patient Profile Image");
        }
    }

    //Reading Patient Phone
    public void readTestOrderListPagePatientPhone() throws IOException {
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Patient Phone Number:");
            WebElement PatientPhone = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestPatientPhone));
            String Text = PatientPhone.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient Phone number not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient Phone number is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Patient Phone");
        }
    }

    //Reading test amount
    public void readTestOrderListPagePatientTestAmount() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Amount:");
            WebElement Testamount = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestTestamount));
            String Text = Testamount.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Test amount not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Test amount is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("Test amount");
        }
    }

    //Reading TestOrderlistpage Test Details
    public void readTestOrderListPageTestDetails() throws IOException {
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Test Details:");
            WebElement TestDetails = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestTestDetails));
            String Text = TestDetails.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Test Details are not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Test Detail is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Test Details");
        }
    }

    public void verifyTestOrderStatus() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ready to Verify the Test Status");
            WebElement orderST = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test6.log(LogStatus.FAIL, "Test Status is not displayed");
                getScreenshot("RO_TStatus");
            } else {
                test6.log(LogStatus.PASS, "Test Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Status is not displayed");
            getScreenshot("RO_TStatus");
        }
    }

    public void ClickFirstRow() throws InterruptedException, IOException {
        try {
            Thread.sleep(5000);
            test6.log(LogStatus.INFO, "Ready to Click the first row");
            WebElement Firstrow = new WebDriverWait(driver, 100)
                    .until(driver -> driver.findElement(click_first_row));
            Firstrow.click();
            test6.log(LogStatus.PASS, " First row is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "First row  is not Clicked");
            getScreenshot("First row ");
        }
    }

    public void verifyPatientName() throws IOException {
        try {
            //Thread.sleep(15000);
            test6.log(LogStatus.INFO, "Ready to Verify Patient name");
            WebElement orderId = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(PatientName));
            String Patientname = orderId.getText();
            if (Patientname.equals("null")) {
                test6.log(LogStatus.FAIL, " Patient name is not displayed ");
                getScreenshot("RO_PName");
            } else {
                test6.log(LogStatus.PASS, " Patient name is displayed : " + Patientname);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Patient name is not displayed");
            getScreenshot("RO_PName");
        }
    }

    public void verifyOrderNo() throws IOException, InterruptedException {
        //Thread.sleep(10000);
        try {
            test6.log(LogStatus.INFO, "Ready to Verify Order Number");
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Order_No));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, " Order_no is not displayed");
                getScreenshot("RO_OrdNo");
            } else {
                test6.log(LogStatus.PASS, " Order_no is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Order_no is not displayed");
            getScreenshot("RO_OrdNo");
        }
    }

    public void verifyLabDetails() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ready to Verify the labdetails");
            WebElement Labdetails = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(lad_Details));
            String Labdet = Labdetails.getText();
            if (Labdet == null) {
                test6.log(LogStatus.FAIL, "Lab details is not displayed");
                getScreenshot("Lab details");
            } else {
                test6.log(LogStatus.PASS, " Lab details is displayed");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Lab details is not displayed");
            getScreenshot("Lab details");
        }
    }

    public void verifyProfilePic() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ready to Verify the Profile Image");
            WebElement adminImage = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(profile_pic));
            String Image = adminImage.getAttribute("src");
            if (Image.contains(".jpeg") || Image.contains(".jpg")) {
                test6.log(LogStatus.WARNING, " Profile Image is not displayed");
                getScreenshot("ProImage");
            } else if(Image.contains(".svg")) {
                test6.log(LogStatus.WARNING, "Test Image was showing instead of the Profile Image");
                getScreenshot("RO_ProImage");
            } else {
                test6.log(LogStatus.FAIL, "Profile Image not shown as per the requirement");
                getScreenshot("RO_ProImage");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.PASS, "Profile Image shown as per the requirement");
        }
    }

    public void verifyOrderNumber() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ready to Verify inside Order number");
            WebElement orderId2 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Order_No2));
            String ordId2 = orderId2.getText();
            if (ordId2 == null) {
                test6.log(LogStatus.FAIL, " Order_no is not displayed : " + ordId2);
                getScreenshot("RO_OrdNo2");
            } else {
                test6.log(LogStatus.PASS, " Order_no is displayed : " + ordId2);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Order_no is not displayed");
            getScreenshot("RO_OrdNo2");
        }
    }

    public void verifyOrderStatus() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ready to Verify the Test Status");
            WebElement orderST = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(Test_Status));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test6.log(LogStatus.FAIL, "Test Status is not displayed : " + ordStatus);
                getScreenshot("RO_TStatus");
            } else {
                test6.log(LogStatus.PASS, "Test Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Status is not displayed");
            getScreenshot("RO_TStatus");
        }
    }

    public void verifyTestType() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ready to Verify the Test type");
            WebElement adminImage = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Test_type));
            String image = adminImage.getAttribute("src");
            if (image.contains("home")) {
                test6.log(LogStatus.PASS, "Test type shown as per the requirement. Test Type : 'H' ");
            } else if (image.contains("self")) {
                test6.log(LogStatus.PASS, "Test type shown as per the requirement. Test Type : 'S' ");
            } else {
                test6.log(LogStatus.FAIL, "Test type not shown as per the requirement");
                getScreenshot("RO_TType");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Test Type is not displayed");
            getScreenshot("RO_TType");
        }
    }

    public void VerifyTestDetailsIcon() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ordered Test icon:");
            WebElement TestName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Test_option_icon));
            if (TestName.isDisplayed()) {
                test6.log(LogStatus.PASS, "Test icon is displayed");
            } else {
                test6.log(LogStatus.WARNING, "Test icon not displayed");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test icon is not Displayed");
            getScreenshot("Test icon");
        }
    }

    public void VerifyTestDetails() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ordered Test Name:");
            WebElement TestName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Test_Option_Name));
            String Text = TestName.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Test Detail not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Test Detail is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Name is not Displayed");
            getScreenshot("Test Name");
        }
    }

    public void VerifyOrderCreatedDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Order Created Date and Time:");
            WebElement OC = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Order_Date_Time));
            String Text = OC.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Order Created date was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Order Created date is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.PASS, "Order Created Date is not Displayed");
            getScreenshot("Order Date");
        }
    }

    public void VerifySchDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ready to verify the Scheduled Date and Time:");
            WebElement Schedule = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Schedule_Date_Time));
            String Text = Schedule.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Scheduled date is not available");
            } else {
                test6.log(LogStatus.PASS, "Scheduled date is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Scheduled date is not available");
            try {
                test6.log(LogStatus.INFO, "Ready to Click View more option");
                WebElement Viewmore_opt = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(View_more_opt1));
                String v = Viewmore_opt.getText();
                if (v.contains("View More")) {
                    test6.log(LogStatus.PASS, "View more text shown as per the requirement : " + v);
                    Thread.sleep(3000);
                    driver.findElement(View_more_opt1).click();
                } else {
                    test6.log(LogStatus.FAIL, "View more text not shown as per the requirement : " + v);
                    getScreenshot("View_more");
                }
            } catch (NoSuchElementException | IOException | TimeoutException | InterruptedException e1) {
                test6.log(LogStatus.WARNING, "View more option is not clicked");
                getScreenshot("View_more");
            }
        }
    }

    // Clicking View more option
    public void clickViewMoreOption() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ready to Click View more option");
            WebElement Viewmore_opt = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(View_more_opt2));
            String v = Viewmore_opt.getText();
            if (v.contains("View More")) {
                test6.log(LogStatus.PASS, "View more text shown as per the requirement : " + v);
                Thread.sleep(3000);
                driver.findElement(View_more_opt2).click();
            } else {
                test6.log(LogStatus.FAIL, "View more text not shown as per the requirement : " + v);
                getScreenshot("View_more");
            }
        } catch (NoSuchElementException | IOException | TimeoutException | InterruptedException e) {
            test6.log(LogStatus.WARNING, "View more option is not clicked");
            getScreenshot("View_more");
        }
    }

    //Reading Order No
    public void readOrderNo() throws IOException, InterruptedException {
        try {
            Thread.sleep(10000);
            test6.log(LogStatus.INFO, "Order No:");
            WebElement OrderNo = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readOrderID));
            String Text = OrderNo.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Order number was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Order number is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Order No is not Displayed");
            getScreenshot("Test Order No");
        }
    }

    //Reading Patient Profile Picture
    public void readPatientProfilePicture() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Profile Image");
            WebElement ProfileImg = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readProfileImage));
            String Text = ProfileImg.getAttribute("src");
            if (Text.contains(".jpg") || Text.contains(".jpeg")) {
                test6.log(LogStatus.PASS, "Profile Picture visible");
            } else {
                test6.log(LogStatus.PASS, "Profile Picture not visible");
            }
            getScreenshot("Patient Profile Image");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.PASS, "Profile Image is Displayed");
        }
    }

    //Reading Patient Name
    public void readPatientName() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Patient Name:");
            WebElement PatientName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readPatientName));
            String Text = PatientName.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient name was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient name is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Patient's Name is not Displayed");
            getScreenshot("Patient Name");
        }
    }

    //Reading Patient Age
    public void readPatientAge() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Patient's Age:");
            WebElement PatientAge = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readAgeValue));
            String Text = PatientAge.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient age was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient age is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Patient's Age is not Displayed");
            getScreenshot("Patient Age");
        }
    }

    //Reading Patient Gender
    public void readPatientGender() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Patient's Gender:");
            WebElement PatientGender = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readGenderValue));
            String Text = PatientGender.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient Gender was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient Gender is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Patient Gender is not Displayed");
            getScreenshot("Patient Gender");
        }
    }

    //Reading Patient Phone
    public void readPatientPhone() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Patient's Phone Number:");
            WebElement PatientPhone = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readPhoneValue));
            String Text = PatientPhone.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient Phone number was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient Phone number is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Patient's Phone is not Displayed");
            getScreenshot("Patient Phone");
        }
    }

    //Reading Patient Height
    public void readPatientHeight() throws InterruptedException, IOException {
        try {
            test6.log(LogStatus.INFO, "Patient's Height:");
            WebElement PatientHeight = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHeightValue));
            String Text = PatientHeight.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient Height was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient Height is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Patient's Height is not Displayed");
            getScreenshot("Patient Height");
        }
    }

    //Reading Patient Weight
    public void readPatientWeight() throws InterruptedException, IOException {
        try {

            test6.log(LogStatus.INFO, "Patient's Weight:");
            WebElement PatientWeight = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readWeightValue));
            String Text = PatientWeight.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient Weight was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient Weight is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Patient's Weight is not Displayed");
            getScreenshot("Patient Weight");
        }
    }

    //Reading Patient Blood Group
    public void readPatientBloodGroup() throws InterruptedException, IOException {
        try {
            test6.log(LogStatus.INFO, "Patient's Blood Group:");
            WebElement Blood = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readBloodGroupValue));
            String Text = Blood.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient Blood group was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient Blood group is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Patient's Blood Group is not Displayed");
            getScreenshot("Patient Blood Group");
        }
    }

    public void readPatientAddress() throws IOException {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,200)");
            test6.log(LogStatus.INFO, "Patient's Address:");
            WebElement Add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readAddressValue));
            String Text = Add.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient Address was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient Address is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Patient's Address is not Displayed");
            getScreenshot("Patient Address");
        }
    }

    //Reading Add on Member1
    public void readAddonMember() throws InterruptedException, IOException, AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        try {
            Thread.sleep(2000);
            test6.log(LogStatus.INFO, "Add on Member Header");
            if (driver.findElement(readAddonMember).isDisplayed()) {
                WebElement AddonMember = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember));
                String Text = AddonMember.getText();
                if (Text.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member header was not visible" + Text);
                } else {
                    test6.log(LogStatus.PASS, "Member header is : " + Text);
                }
                test6.log(LogStatus.INFO, "Add on Member1 Name:");
                WebElement AddonMember1Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember1));
                String Text1 = AddonMember1Name.getText();
                if (Text1.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member name was not visible" + Text1);
                } else {
                    test6.log(LogStatus.PASS, "Member name is : " + Text1);
                }
                test6.log(LogStatus.INFO, "Add on Member1 Age:");
                WebElement AddonMember1Age = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember1Age));
                String Text2 = AddonMember1Age.getText();
                if (Text2.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member age was not visible" + Text2);
                } else {
                    test6.log(LogStatus.PASS, "Member age is : " + Text2);
                }
                test6.log(LogStatus.INFO, "Add on Member1 Gender:");
                WebElement AddonMember1Sex = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember1Sex));
                String Text3 = AddonMember1Sex.getText();
                if (Text3.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member gender was not visible" + Text3);
                } else {
                    test6.log(LogStatus.PASS, "Member gender is : " + Text3);
                }
                readAddonMember2();
                readAddonMember3();
                readAddonMember4();
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on Member is not Added");
            getScreenshot("Add on Members");
        }
    }

    //Reading Add on Member2
    public void readAddonMember2() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Add on Member2 Name");
            if (driver.findElement(readAddonMember2).isDisplayed()) {
                WebElement AddonMember2Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember2));
                String Text = AddonMember2Name.getText();
                if (Text.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member header was not visible" + Text);
                } else {
                    test6.log(LogStatus.PASS, "Member header is : " + Text);
                }
                test6.log(LogStatus.INFO, "Add on Member2 Age");
                WebElement AddonMember2Age = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember2Age));
                String Text2 = AddonMember2Age.getText();
                if (Text2.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member age was not visible" + Text2);
                } else {
                    test6.log(LogStatus.PASS, "Member age is : " + Text2);
                }
                test6.log(LogStatus.INFO, "Add on Member2 Gender");
                WebElement AddonMember2Sex = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember2Sex));
                String Text3 = AddonMember2Sex.getText();
                if (Text3.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member gender was not visible" + Text3);
                } else {
                    test6.log(LogStatus.PASS, "Member gender is : " + Text3);
                }
            } else {
                test6.log(LogStatus.FAIL, "Add on Member2 Details not Displayed");
                getScreenshot("Add on Members2");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on Member2 is not Added");
            getScreenshot("Add on Members2");
        }
    }

    //Reading Add on Member3
    public void readAddonMember3() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Add on Member3 Name");
            if (driver.findElement(readAddonMember3).isDisplayed()) {
                WebElement AddonMember3Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember3));
                String Text = AddonMember3Name.getText();
                if (Text.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member name was not visible" + Text);
                } else {
                    test6.log(LogStatus.PASS, "Member name is : " + Text);
                }
                test6.log(LogStatus.INFO, "Add on Member3 Age");
                WebElement AddonMember3Age = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember3Age));
                String Text2 = AddonMember3Age.getText();
                if (Text2.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member age was not visible" + Text2);
                } else {
                    test6.log(LogStatus.PASS, "Member age is : " + Text2);
                }
                test6.log(LogStatus.INFO, "Add on Member3 Gender");
                WebElement AddonMember3Sex = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember3Sex));
                String Text3 = AddonMember3Sex.getText();
                if (Text3.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member gender was not visible" + Text3);
                } else {
                    test6.log(LogStatus.PASS, "Member gender is : " + Text3);
                }
            } else {
                test6.log(LogStatus.FAIL, "Add on Member3 Details not Displayed");
                getScreenshot("Add on Members3");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on Member3 is not Added");
            getScreenshot("Add on Member3");
        }
    }

    //Reading Add on Member4
    public void readAddonMember4() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Add on Member4 Name");
            if (driver.findElement(readAddonMember4).isDisplayed()) {
                WebElement AddonMember4Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember4));
                String Text = AddonMember4Name.getText();
                if (Text.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member name was not visible" + Text);
                } else {
                    test6.log(LogStatus.PASS, "Member name is : " + Text);
                }
                test6.log(LogStatus.INFO, "Add on Member4 Age");
                WebElement AddonMember4Age = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember4Age));
                String Text2 = AddonMember4Age.getText();
                if (Text2.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member age was not visible" + Text2);
                } else {
                    test6.log(LogStatus.PASS, "Member age is : " + Text2);
                }
                test6.log(LogStatus.INFO, "Add on Member4 Gender");
                WebElement AddonMember4Sex = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember4Sex));
                String Text3 = AddonMember4Sex.getText();
                if (Text3.contains("null")) {
                    test6.log(LogStatus.FAIL, "Member gender was not visible" + Text3);
                } else {
                    test6.log(LogStatus.PASS, "Member gender is : " + Text3);
                }
            } else {
                test6.log(LogStatus.FAIL, "Add on Member4 Details not Displayed");
                getScreenshot("Add on Members4");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on Member4 is not Added");
            getScreenshot("Add on Member4");
        }
    }

    //Reading Test Details
    public void readTestDetails() throws IOException {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,-1000)");
            test6.log(LogStatus.INFO, "Ordered Test Name:");
            WebElement TestName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readTestDetails));
            String Text = TestName.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Test Details not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Test Detail is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Name is not Displayed");
            getScreenshot("Test Name");
        }
    }

    //Reading Test Status
    public void readTestStatus() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ordered Test Status:");
            WebElement TestStatus = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readTestStatus));
            String Text = TestStatus.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Test Order Status not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Test Order Status is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Status is not Displayed");
            getScreenshot("Test Status");
        }
    }

    //Reading Test Type
    public void readTestType() throws InterruptedException, IOException {
        try {
            Thread.sleep(1000);
            test6.log(LogStatus.INFO, "Ordered Test Type:");
            WebElement Schedule = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readTestTypee));
            String Text = Schedule.getAttribute("src");
            if (Text.contains("home")) {
                test6.log(LogStatus.PASS, "It's Home Test");
            } else {
                test6.log(LogStatus.PASS, "It's Self Test");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.PASS, "It's a SelfTest");
            getScreenshot("Test Type");
        }
    }

    //Reading Order Created Date
    public void readOrderCreatedDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Order Created Date and Time:");
            WebElement OC = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readOrderCreatedDate));
            String Text = OC.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Order Created date not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Order Created date is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.PASS, "Order Created Date is not Displayed");
            getScreenshot("Order Date");
        }
    }

    // Reading Schedule Date
    public void readScheduledDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Scheduled Date and Time:");
            WebElement Schedule = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readScheduledDate));
            String Text = Schedule.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Order Scheduled date not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Order Scheduled date is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.SKIP, "It's a SELF TEST or Home Test is not Scheduled");
            getScreenshot("Schedule");
        }
    }

    //Reading Payment Details
    public void readPaymentDetails() throws InterruptedException {
        test6.log(LogStatus.INFO, "Payment Details:");
        Thread.sleep(2000);
        if (driver.findElement(readTestTypee).isDisplayed())
            Thread.sleep(2000);
        test6.log(LogStatus.INFO, "Test Name:");
        WebElement TestName = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(readPaymentDetailsTestName));
        String Text = TestName.getText();
        if (Text.contains("null")) {
            test6.log(LogStatus.FAIL, "Test name not visible" + Text);
        } else {
            test6.log(LogStatus.PASS, "Test name is : " + Text);
        }
        test6.log(LogStatus.INFO, "Test Charge:");
        WebElement TestCharge = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(readpaymentDetailsTestCharge));
        String Text1 = TestCharge.getText();
        if (Text1.contains("null")) {
            test6.log(LogStatus.FAIL, "Test Charge not visible" + Text1);
        } else {
            test6.log(LogStatus.PASS, "Test Charge is : " + Text1);
        }
        test6.log(LogStatus.INFO, "Tax Charge:");
        WebElement TaxCharge = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(readPaymentDetailsHomeTestTaxCharge));
        String Text2 = TaxCharge.getText();
        if (Text2.contains("null")) {
            test6.log(LogStatus.FAIL, "Tax Charge not visible" + Text2);
        } else {
            test6.log(LogStatus.PASS, "Tax Charge is : " + Text2);
        }
        test6.log(LogStatus.INFO, "Total Charge:");
        WebElement TotalCharge = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(readPaymentDetailsHomeTestTotalCharge));
        String Text3 = TotalCharge.getText();
        if (Text3.contains("null")) {
            test6.log(LogStatus.FAIL, "Total Charge not visible" + Text3);
        } else {
            test6.log(LogStatus.PASS, "Total Charge is : " + Text3);
        }
    }

    public void verifyCancelOption() throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Ready to Verify the Cancel Text");
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Cancel_opt));
            String Cancel_text = orderId.getText();
            if (Cancel_text == null) {
                test6.log(LogStatus.FAIL, "Cancel text is not displayed : " + Cancel_text);
                getScreenshot("Cancel_text");
            } else {
                test6.log(LogStatus.PASS, "Cancel text is displayed : " + Cancel_text);
                try {
                    test6.log(LogStatus.INFO, "Ready to click the cancel button");
                    Thread.sleep(5000);
                    driver.findElement(Cancel_opt).click();
                    test6.log(LogStatus.PASS, "Cancel button is clicked");
                } catch (NoSuchElementException | TimeoutException e) {
                    test6.log(LogStatus.FAIL, "Cancel button is not clicked");
                    getScreenshot("Cancel_text");
                }
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Cancel_text is not displayed");
            getScreenshot("Cancel_text");
        }
    }

    public void verifyCopyRights() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Ready to Verify the Copy Rights text");
            WebElement cR = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(copy_rights));
            String text = cR.getText();
            //System.out.println(text);
            if (text == null) {
                test6.log(LogStatus.FAIL, "Copy Rights text not shown as per the requirement : " + text);
                getScreenshot("RO_CR");
            } else {
                test6.log(LogStatus.PASS, "Copy Rights text shown as per the requirement : " + text);
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Copy Rights text not visible ");
            getScreenshot("RO_CR");
        }
    }

    public void setOrderNo() throws IOException {
        try {
            WebElement orderheader = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_orderno));
            if (orderheader.isDisplayed()) {
                driver.findElement(s_orderno).getText();
                test6.log(LogStatus.PASS, "Orderno. header is displayed");
            } else {
                test6.log(LogStatus.FAIL, "Orderno. header is not displayed");
                getScreenshot("Order_number");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Orderno. header is not displayed");
            getScreenshot("Order_number");
        }
    }

    public void setPatientName() throws IOException {
        try {
            WebElement patient = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_patientname));
            if (patient.isDisplayed()) {
                driver.findElement(s_patientname).getText();
                test6.log(LogStatus.PASS, "patientname header is displayed");
            } else {
                test6.log(LogStatus.FAIL, "patientname header is not displayed");
                getScreenshot("patient_name");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "patientname header is not displayed");
            getScreenshot("patient_name");
        }
    }

    public void setPhoneNumber() throws IOException {
        try {
            WebElement phoneno = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_phonenumber));
            if (phoneno.isDisplayed()) {
                driver.findElement(s_phonenumber).getText();
                test6.log(LogStatus.PASS, "phonenumber header is displayed");
            } else {
                test6.log(LogStatus.FAIL, "phonenumber header is not displayed");
                getScreenshot("phone_number");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "phonenumber header is not displayed");
            getScreenshot("phone_number");
        }
    }

    public void setOrderStatus() throws IOException {

        try {
            WebElement ordst = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_orderstatus));
            if (ordst.isDisplayed()) {
                driver.findElement(s_orderstatus).getText();
                test6.log(LogStatus.PASS, "Order Status header is displayed");
            } else {
                test6.log(LogStatus.FAIL, "Order Status header is not displayed");
                getScreenshot("order_status");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Order Status header is not displayed");
            getScreenshot("order_status");
        }
    }

    public void setPrice() throws IOException {

        try {
            WebElement price1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_price));
            if (price1.isDisplayed()) {
                driver.findElement(s_price).getText();
                test6.log(LogStatus.PASS, "Price header is displayed");
            } else {
                test6.log(LogStatus.FAIL, "Price header is not displayed");
                getScreenshot("Price");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Price header is not displayed");
            getScreenshot("Price");
        }
    }

    public void setTestDetails() throws IOException, InterruptedException {
        Thread.sleep(5000);
        try {
            WebElement testStatus = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_testdetails));
            if (testStatus.isDisplayed()) {
//                WebElement self= driver.findElement(By.xpath("//img[contains(@src,'../../assets/img/self test icon.png')]"));
//                //WebElement home= driver.findElement(By.xpath("//img[contains(@src,'../../assets/img/home test icon.png')]"));
//                self.click();
//                //home.click();
                driver.findElement(s_testdetails).getText();
                test6.log(LogStatus.PASS, "Testdetails header is displayed");
            } else {
                test6.log(LogStatus.FAIL, "Testdetails  header is not displayed");
                getScreenshot("test_details");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Testdetails  header is not displayed");
            getScreenshot("test_details");
        }
    }

    public void setProfilePic() throws IOException {
        try {
            WebElement Image = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_profile_pic));
            String image = Image.getAttribute("src");
            if (image.contains(".jpeg") || image.contains(".jpg")) {
                test6.log(LogStatus.PASS, "Profile Image shown as per the requirement");
            } else if(image.contains(".svg")) {
                test6.log(LogStatus.WARNING, "Test Image was showing instead of the Profile Image");
                getScreenshot("RO_ProImage");
            } else {
                test6.log(LogStatus.FAIL, "Profile Image not shown as per the requirement");
                getScreenshot("ProfImage");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, " Profile Image is not displayed");
            getScreenshot("ProfImage");
        }
    }

    public void setPatientName1() throws IOException {
        try {
            WebElement PName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_patientName1));
            String patient = PName.getText();
            test6.log(LogStatus.PASS, " Patient name is displayed : " + patient);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Patient name is not displayed");
            getScreenshot("P_Name");
        }
    }

    public void setOrderNo1() throws IOException {
        try {
            WebElement ordNo1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_order_No));
            String ordNo = ordNo1.getText();
            if (ordNo == null) {
                test6.log(LogStatus.FAIL, " Order_no is not displayed : " + ordNo);
                getScreenshot("Ord_No");
            } else {
                test6.log(LogStatus.PASS, " Order_no is displayed : " + ordNo);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Order_no is not displayed");
            getScreenshot("Ord_No");
        }
    }

    public void setAddress() throws IOException {
        try {
            WebElement add = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_address));
            String adrs = add.getText();
            if (adrs == null) {
                test6.log(LogStatus.FAIL, " Address is not displayed : " + adrs);
                getScreenshot("Ord_No");
            } else {
                test6.log(LogStatus.PASS, " Address is displayed : " + adrs);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Address is not displayed");
            getScreenshot("Address");
        }
    }

    public void setOrderStatus1() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_order_status));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " order status is not displayed : " + stat);
                getScreenshot("Ord_status");
            } else {
                test6.log(LogStatus.PASS, " order status is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " order status is not displayed");
            getScreenshot("Ord_status");
        }
    }

    public void setTestDetail1() throws IOException {

        try {
            WebElement TestImage = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_testdetail1));
            String image = TestImage.getAttribute("src");
            if (image.contains("home")) {
                test6.log(LogStatus.PASS, "Test type shown as per the requirement. Test Type : 'H' ");
            } else if (image.contains("self")) {
                test6.log(LogStatus.PASS, "Test type shown as per the requirement. Test Type : 'S' ");
            } else {
                test6.log(LogStatus.FAIL, "Test type not shown as per the requirement");
                getScreenshot("Test_detail");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Test Type is not displayed");
            getScreenshot("Test_detail");
        }
    }

    public void setTestImage() throws IOException {
        try {
            WebElement testImg = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_testimage));
            if (testImg.isDisplayed()) {
                WebElement img = driver.findElement(By.xpath("//img[contains(@src,'https://dev-lifehope.s3.us-west-1.amazonaws.com/DefaultImages/BookaTest/covid_19_antibody_test_icon.svg')]"));
                img.click();
                test6.log(LogStatus.PASS, "Test type image shown as per the requirement");
            } else {
                test6.log(LogStatus.FAIL, "Test type image not shown as per the requirement");
                getScreenshot("Test_image");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, " Image is not displayed");
            getScreenshot("Test_image");
        }
    }

    public void setTestName() throws IOException {
        try {
            WebElement TName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_testname));
            String test = TName.getText();
            if (test == null) {
                test6.log(LogStatus.FAIL, "Test name is not displayed : " + test);
                getScreenshot("RO_TAName");
            } else {
                test6.log(LogStatus.PASS, "Test name is displayed : " + test);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test name is not displayed");
            getScreenshot("T_Name");
        }
    }

    public void setScheduleDateTime() throws IOException {
        try {
            WebElement schd = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_scheduledatetime));
            String dttm = schd.getText();
            if (dttm == null) {
                test6.log(LogStatus.FAIL, "Created Order date and time is not displayed");
                getScreenshot("S_DateTime");
            } else {
                test6.log(LogStatus.PASS, "Created Order date and time is displayed : " + dttm);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Created Order date and time is not displayed");
            getScreenshot("S_DateTime");
        }
    }

    public void setViewMore() throws IOException, InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement view = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_viewmore));
            if (view.isDisplayed()) {
                driver.findElement(s_viewmore).click();
                test6.log(LogStatus.PASS, "Clicked the Viewmore option");
            } else {
                test6.log(LogStatus.FAIL, "Viewmore option is not clicked ");
                getScreenshot("View_more");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Viewmore option is not clicked");
            getScreenshot("View_more");
        }
    }

    public void setOrderNo2() throws IOException, InterruptedException {
        Thread.sleep(5000);
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_orderno1));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, " Order_no is not displayed : " + ordId);
                getScreenshot("Ord_No");
            } else {
                test6.log(LogStatus.PASS, " Order_no is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Order_no is not displayed");
            getScreenshot("Ord_No");
        }
    }

    public void setPatientNameView() throws IOException {
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_patientnameview));
            String ordId = orderId.getText();
            if (ordId.equals("null")) {
                test6.log(LogStatus.FAIL, " Patient name is not displayed : " + ordId);
                getScreenshot("PName");
            } else {
                test6.log(LogStatus.PASS, " Patient name is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Patient name is not displayed");
            getScreenshot("PName");
        }
    }

    public void setOrderNo3() throws IOException {
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_orderno_3));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, " Order_no is not displayed : " + ordId);
                getScreenshot("OrdNo3");
            } else {
                test6.log(LogStatus.PASS, " Order_no is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Order_no is not displayed");
            getScreenshot("OrdNo3");
        }
    }

    public void setProfileImage2() throws IOException {
        try {
            WebElement Image = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_profileimage2));
            String image = Image.getAttribute("src");
            if (image.contains(".jpeg") || image.contains(".jpg")) {
                test6.log(LogStatus.PASS, "Profile Image shown as per the requirement");
            } else if(image.contains(".svg")) {
                test6.log(LogStatus.WARNING, "Test Image was showing instead of the Profile Image");
                getScreenshot("RO_ProImage");
            } else {
                test6.log(LogStatus.FAIL, "Profile Image not shown as per the requirement");
                getScreenshot("Pro_Image");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, " Profile Image is not displayed");
            getScreenshot("Pro_Image");
        }
    }

    public void setTestName1() throws IOException {
        try {
            WebElement testName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_name));
            String testN = testName.getText();
            if (testN == null) {
                test6.log(LogStatus.FAIL, " Test name is not displayed : " + testN);
                getScreenshot("T_Name");
            } else {
                test6.log(LogStatus.PASS, " Test name is displayed : " + testN);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Test name is not displayed");
            getScreenshot("T_Name");
        }
    }

    public void verifyTestOrderStatus1() throws IOException {
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_order_status1));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Test Status is not displayed : " + ordId);
                getScreenshot("O_Status");
            } else {
                test6.log(LogStatus.PASS, "Test Status is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Status is not displayed");
            getScreenshot("O_Status");
        }
    }

    public void setTestType() throws IOException {
        try {
            WebElement adminImage = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_type));
            String image = adminImage.getAttribute("src");
            if (image.contains("home")) {
                test6.log(LogStatus.PASS, "Test type shown as per the requirement. Test Type : 'H' ");
            } else if (image.contains("self")) {
                test6.log(LogStatus.PASS, "Test type shown as per the requirement. Test Type : 'S' ");
            } else {
                test6.log(LogStatus.FAIL, "Test type not shown as per the requirement");
                getScreenshot("T_Type");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Test Type is not displayed");
            getScreenshot("T_Type");
        }
    }

    public void setScheduleDateTime1() throws IOException {
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_Schedule_Date_Time));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Created Order date and time is not displayed : " + ordId);
                getScreenshot("SDate");
            } else {
                test6.log(LogStatus.PASS, "Created Order date and time is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Created Order date and time is not displayed");
            getScreenshot("SDate");
        }
    }

    public void setPaymentDetailsText() throws IOException {
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_Payment_Details_Text));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Payment details text is not displayed : " + ordId);
                getScreenshot("Payment_Text");
            } else {
                test6.log(LogStatus.PASS, "Payment details text is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Payment details text is not displayed");
            getScreenshot("Payment_Text");
        }
    }

    public void setTestOptionName() throws IOException {
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_option_name));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Test name is not displayed : " + ordId);
                getScreenshot("T_Name");
            } else {
                test6.log(LogStatus.PASS, "Test name is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test name is not displayed");
            getScreenshot("T_Name");
        }

        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_total_value));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Total Value is not displayed : " + ordId);
                getScreenshot("Total_Value");
            } else {
                test6.log(LogStatus.PASS, "Total Value is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Total Value is not displayed");
            getScreenshot("Total_Value");
        }
    }

    public void setShippingChargeText() throws IOException {
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_shippingchargetext));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Shipping Charge Text is not displayed : " + ordId);
                getScreenshot("Ship_Text");
            } else {
                test6.log(LogStatus.PASS, "Shipping Charge Text is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Shipping Charge Text is not displayed");
            getScreenshot("Ship_Text");
        }
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_shippingchargevalue));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Shipping Charge value is not displayed : " + ordId);
                getScreenshot("Ship_Value");
            } else {
                test6.log(LogStatus.PASS, "Shipping Charge value is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Shipping Charge value is not displayed");
            getScreenshot("Ship_Value");
        }
    }

    public void setTaxText() throws IOException {
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_tax_text));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Tax Text is not displayed : " + ordId);
                getScreenshot("Tax_Text");
            } else {
                test6.log(LogStatus.PASS, "Tax Text is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Tax Text is not displayed");
            getScreenshot("Tax_Text");
        }
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_tax_value));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Tax Value is not displayed : " + ordId);
                getScreenshot("Tax_Value");
            } else {
                test6.log(LogStatus.PASS, "Tax Value is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Tax Value is not displayed");
            getScreenshot("Tax_Value");
        }
    }

    public void setTotalText() throws IOException {
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_total_text));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Total Text is not displayed : " + ordId);
                getScreenshot("Total_Text");
            } else {
                test6.log(LogStatus.PASS, "Total Text is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Total Text is not displayed");
            getScreenshot("Total_Text");
        }
        try {
            WebElement orderId = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_total_value));
            String ordId = orderId.getText();
            if (ordId == null) {
                test6.log(LogStatus.FAIL, "Total Value is not displayed : " + ordId);
                getScreenshot("Total_Value");
            } else {
                test6.log(LogStatus.PASS, "Total Value is displayed : " + ordId);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Total Value is not displayed");
            getScreenshot("Total_Value");
        }
    }

    public void setPatientDetails(String A, String G, String P, String H, String W, String B, String Add) throws IOException {
        try {
            WebElement ageT = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_age_text));
            String text = ageT.getText();
            //System.out.println(text);
            if (A.equals(text)) {
                test6.log(LogStatus.PASS, "Age name is displayed : " + text);
            } else {
                test6.log(LogStatus.FAIL, "Age name not shown as per the requirement : " + text);
                getScreenshot("RO_AgeName");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Age name not visible ");
            getScreenshot("RO_AgeName");
        }
        try {
            WebElement ageV = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_age_value));
            String text = ageV.getText();
            //System.out.println(text);
            if (text == null) {
                test6.log(LogStatus.FAIL, "Age value is  not displayed : " + text);
                getScreenshot("RO_AgeValue");
            } else {
                test6.log(LogStatus.PASS, "Age value is displayed : " + text);
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Age value not visible ");
            getScreenshot("RO_AgeValue");
        }
        try {
            WebElement genT = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_gender_text));
            String text = genT.getText();
            //System.out.println(text);
            if (G.equals(text)) {
                test6.log(LogStatus.PASS, "Gender name is displayed : " + text);
            } else {
                test6.log(LogStatus.FAIL, "Gender name not shown as per the requirement : " + text);
                getScreenshot("RO_GenderName");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Gender name not visible ");
            getScreenshot("RO_GenderName");
        }
        try {
            WebElement genV = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_gender_value));
            String text = genV.getText();
            //System.out.println(text);
            if (text == null) {
                test6.log(LogStatus.FAIL, "Gender value not shown as per the requirement : " + text);
                getScreenshot("RO_GenderValue");
            } else {
                test6.log(LogStatus.PASS, "Gender value is displayed: " + text);
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Gender value not visible ");
            getScreenshot("RO_GenderValue");
        }
        try {
            WebElement phoT = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_phone_text));
            String text = phoT.getText();
            //System.out.println(text);
            if (P.equals(text)) {
                test6.log(LogStatus.PASS, "Phone text name is displayed : " + text);
            } else {
                test6.log(LogStatus.FAIL, "Phone name not shown as per the requirement : " + text);
                getScreenshot("RO_PhoneName");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Phone name not visible ");
            getScreenshot("RO_PhoneName");
        }
        try {
            WebElement phoV = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_phone_value));
            String text = phoV.getText();
            //System.out.println(text);
            if (text == null) {
                test6.log(LogStatus.FAIL, "Phone value not shown as per the requirement : " + text);
                getScreenshot("RO_PhoneValue");
            } else {
                test6.log(LogStatus.PASS, "Phone value is displayed : " + text);
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Phone value not visible ");
            getScreenshot("RO_PhoneValue");
        }
        try {
            WebElement heightT = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_height_text));
            String text = heightT.getText();
            //System.out.println(text);
            if (H.equals(text)) {
                test6.log(LogStatus.PASS, "Height name is displayed : " + text);
            } else {
                test6.log(LogStatus.FAIL, "Height name not shown as per the requirement : " + text);
                getScreenshot("RO_HeightName");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Height name not visible ");
            getScreenshot("RO_HeightName");
        }
        try {
            WebElement heightV = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_height_value));
            String text = heightV.getText();
            //System.out.println(text);
            if (text == null) {
                test6.log(LogStatus.FAIL, "Height value not shown as per the requirement : " + text);
                getScreenshot("RO_HeightValue");
            } else {
                test6.log(LogStatus.PASS, "Height value is displayed : " + text);
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Height value not visible ");
            getScreenshot("RO_HeightValue");
        }
        try {
            WebElement weightT = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_weight_text));
            String text = weightT.getText();
            // System.out.println(text);
            if (W.equals(text)) {
                test6.log(LogStatus.PASS, "Weight name is displayed : " + text);
            } else {
                test6.log(LogStatus.FAIL, "Weight name not shown as per the requirement : " + text);
                getScreenshot("RO_WeightName");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Weight name not visible ");
            getScreenshot("RO_WeightName");
        }
        try {
            WebElement weightV = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_weight_value));
            String text = weightV.getText();
            //System.out.println(text);
            if (text == null) {
                test6.log(LogStatus.FAIL, "Weight value not shown as per the requirement : " + text);
                getScreenshot("RO_WeightValue");
            } else {
                test6.log(LogStatus.PASS, "Weight value is displayed : " + text);
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Weight value not visible ");
            getScreenshot("RO_WeightValue");
        }
        try {
            WebElement bloodT = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_blood_group_text));
            String text = bloodT.getText();
            //System.out.println(text);
            if (B.equals(text)) {
                test6.log(LogStatus.PASS, "Blood name is displayed : " + text);
            } else {
                test6.log(LogStatus.FAIL, "Blood name not shown as per the requirement : " + text);
                getScreenshot("RO_BloodName");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Blood name not visible ");
            getScreenshot("RO_BloodName");
        }
        try {
            WebElement bloodV = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_blood_group_value));
            String text = bloodV.getText();
            // System.out.println(text);
            if (text == null) {
                test6.log(LogStatus.FAIL, "Blood group value not shown as per the requirement : " + text);
                getScreenshot("RO_BloodValue");
            } else {
                test6.log(LogStatus.PASS, "Blood group value is displayed : " + text);
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Blood value not visible ");
            getScreenshot("RO_BloodValue");
        }
        try {
            WebElement addT = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_address_text));
            String text = addT.getText();
            // System.out.println(text);
            if (Add.equals(text)) {
                test6.log(LogStatus.PASS, "Address name shown as per the requirement : " + text);
            } else {
                test6.log(LogStatus.FAIL, "Address name not shown as per the requirement : " + text);
                getScreenshot("RO_AddressName");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Address name not visible ");
            getScreenshot("RO_AddressName");
        }
        try {
            WebElement addV = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_address_value));
            String text = addV.getText();
            // System.out.println(text);
            if (text == null) {
                test6.log(LogStatus.FAIL, "Address value not shown as per the requirement : " + text);
                getScreenshot("RO_AddressValue");
            } else {
                test6.log(LogStatus.PASS, "Address value is displayed : " + text);
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Address value not visible ");
            getScreenshot("RO_AddressValue");
        }
    }

    public void verifyAddMemberDetails(String A) throws IOException {
        try {
            WebElement memH = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_addon_mem_header_text));
            String text = memH.getText();
            //System.out.println(text);
            if (A.equals(text)) {
                test6.log(LogStatus.PASS, "Add on member header name shown as per the requirement : " + text);
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
                try {
                    WebElement addN = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_first_name));
                    String oneN = addN.getText();
                    //System.out.println(text);
                    if (oneN == null) {
                        test6.log(LogStatus.FAIL, "First patient name not shown as per the requirement : " + oneN);
                        getScreenshot("RO_FN");
                    } else {
                        test6.log(LogStatus.PASS, "First patient name shown as per the requirement : " + oneN);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "First patient name not visible ");
                    getScreenshot("RO_FN");
                }
                try {
                    WebElement addA = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_first_age));
                    String oneA = addA.getText();
                    //System.out.println(text);
                    if (oneA == null) {
                        test6.log(LogStatus.FAIL, "First patient age not shown as per the requirement : " + oneA);
                        getScreenshot("RO_FA");
                    } else {
                        test6.log(LogStatus.PASS, "First patient age shown as per the requirement : " + oneA);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "First patient age not visible ");
                    getScreenshot("RO_FA");
                }
                try {
                    WebElement addG = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_first_sex));
                    String oneG = addG.getText();
                    //System.out.println(text);
                    if (oneG == null) {
                        test6.log(LogStatus.FAIL, "First patient gender not shown as per the requirement : " + oneG);
                        getScreenshot("RO_FG");
                    } else {
                        test6.log(LogStatus.PASS, "First patient gender shown as per the requirement : " + oneG);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "First patient gender not visible ");
                    getScreenshot("RO_FG");
                }
                try {
                    WebElement addN = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_second_name));
                    String oneN = addN.getText();
                    //System.out.println(text);
                    if (oneN == null) {
                        test6.log(LogStatus.FAIL, "Second patient name not shown as per the requirement : " + oneN);
                        getScreenshot("RO_SN");
                    } else {
                        test6.log(LogStatus.PASS, "Second patient name shown as per the requirement : " + oneN);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "Second patient name not visible ");
                    getScreenshot("RO_SN");
                }
                try {
                    WebElement addA = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_second_age));
                    String oneA = addA.getText();
                    //System.out.println(text);
                    if (oneA == null) {
                        test6.log(LogStatus.FAIL, "Second patient age not shown as per the requirement : " + oneA);
                        getScreenshot("RO_SA");
                    } else {
                        test6.log(LogStatus.PASS, "Second patient age shown as per the requirement : " + oneA);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "Second patient age not visible ");
                    getScreenshot("RO_SA");
                }
                try {
                    WebElement addG = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_second_sex));
                    String oneG = addG.getText();
                    //System.out.println(text);
                    if (oneG == null) {
                        test6.log(LogStatus.FAIL, "Second patient gender not shown as per the requirement : " + oneG);
                        getScreenshot("RO_SG");
                    } else {
                        test6.log(LogStatus.PASS, "Second patient gender shown as per the requirement : " + oneG);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "Second patient gender not visible ");
                    getScreenshot("RO_SG");
                }
                try {
                    WebElement addN = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_third_name));
                    String oneN = addN.getText();
                    //System.out.println(text);
                    if (oneN == null) {
                        test6.log(LogStatus.FAIL, "Third patient name not shown as per the requirement : " + oneN);
                        getScreenshot("RO_TN");
                    } else {
                        test6.log(LogStatus.PASS, "Third patient name shown as per the requirement : " + oneN);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "Third patient name not visible ");
                    getScreenshot("RO_TN");
                }
                try {
                    WebElement addA = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_third_age));
                    String oneA = addA.getText();
                    //System.out.println(text);
                    if (oneA == null) {
                        test6.log(LogStatus.FAIL, "Third patient age not shown as per the requirement : " + oneA);
                        getScreenshot("RO_TA");
                    } else {
                        test6.log(LogStatus.PASS, "Third patient age shown as per the requirement : " + oneA);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "Third patient age not visible ");
                    getScreenshot("RO_TA");
                }
                try {
                    WebElement addG = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_third_sex));
                    String oneG = addG.getText();
                    //System.out.println(text);
                    if (oneG == null) {
                        test6.log(LogStatus.FAIL, "Third patient gender not shown as per the requirement : " + oneG);
                        getScreenshot("RO_TG");
                    } else {
                        test6.log(LogStatus.PASS, "Third patient gender shown as per the requirement : " + oneG);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "Third patient gender not visible ");
                    getScreenshot("RO_TG");
                }
                try {
                    WebElement addN = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_fourth_name));
                    String oneN = addN.getText();
                    //System.out.println(text);
                    if (oneN == null) {
                        test6.log(LogStatus.FAIL, "Fourth patient name not shown as per the requirement : " + oneN);
                        getScreenshot("RO_FouN");
                    } else {
                        test6.log(LogStatus.PASS, "Fourth patient name shown as per the requirement : " + oneN);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "Fourth patient name not visible ");
                    getScreenshot("RO_FouN");
                }
                try {
                    WebElement addA = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_fourth_age));
                    String oneA = addA.getText();
                    //System.out.println(text);
                    if (oneA == null) {
                        test6.log(LogStatus.FAIL, "Fourth patient age not shown as per the requirement : " + oneA);
                        getScreenshot("RO_FouA");
                    } else {
                        test6.log(LogStatus.PASS, "Fourth patient age shown as per the requirement : " + oneA);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "Fourth patient age not visible ");
                    getScreenshot("RO_FouA");
                }
                try {
                    WebElement addG = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(s_add_on_fourth_sex));
                    String oneG = addG.getText();
                    //System.out.println(text);
                    if (oneG == null) {
                        test6.log(LogStatus.FAIL, "Fourth patient gender not shown as per the requirement : " + oneG);
                        getScreenshot("RO_FouG");
                    } else {
                        test6.log(LogStatus.PASS, "Fourth patient gender shown as per the requirement : " + oneG);
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test6.log(LogStatus.SKIP, "Fourth patient gender not visible ");
                    getScreenshot("RO_FouG");
                }
            } else {
                test6.log(LogStatus.FAIL, "Add on member header name not shown as per the requirement : " + text);
                getScreenshot("RO_MemHeader");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on members window not available ");
            getScreenshot("RO_MemHeader");
        }
    }

    public void setCancel() throws IOException, InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement can = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_cancel));
            if (can.isDisplayed()) {
                driver.findElement(s_cancel).click();
                test6.log(LogStatus.PASS, "Clicked the cancel button");
            } else {
                test6.log(LogStatus.FAIL, "cancel button is not clicked");
                getScreenshot("cancel");
            }
        } catch (NoSuchElementException | IOException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "cancel button is not clicked");
            getScreenshot("cancel");
        }
    }

    public void setTestPlaced() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_placed));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " Test Order Placed  status is not displayed : " + stat);
                getScreenshot("Test_placed");
            } else {
                test6.log(LogStatus.PASS, " Test Order Placed status is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Test Order Placed status is not displayed");
            getScreenshot("Test_placed");
        }
    }

    public void setTestConfirmed() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_confirmed));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " Test Order Confirmed  status is not displayed : " + stat);
                getScreenshot("Test_Confirmed");
            } else {
                test6.log(LogStatus.PASS, " Test Order Confirmed status is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Test Order Confirmed status is not displayed");
            getScreenshot("Test_Confirmed");
        }
    }

    public void setFedExNumber() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_fedex_number));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " Fedex_number is not displayed : " + stat);
                getScreenshot("Fedex_number");
            } else {
                test6.log(LogStatus.PASS, " Fedex_number  is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Fedex_number  is not displayed");
            getScreenshot("Fedex_number");
        }
    }

    public void setTestShipped() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_shipped));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " Test Kit Shipped status is not displayed : " + stat);
                getScreenshot("Test_Kit_Shipped");
            } else {
                test6.log(LogStatus.PASS, " Test Kit Shipped status is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Test Kit Shipped status is not displayed");
            getScreenshot("Test_Kit_Shipped");
        }
    }

    public void setTestReturned() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_returned));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " Test Kit Returned To Lab status is not displayed : " + stat);
                getScreenshot("TestKit_Returned");
            } else {
                test6.log(LogStatus.PASS, "Test Kit Returned To Lab status is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Test Kit Returned To Lab status is not displayed");
            getScreenshot("TestKit_Returned ");
        }
    }

    public void setTestSampleReceive() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_testsample_receive));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " Test Sample Received status is not displayed : " + stat);
                getScreenshot("TestSample_Received");
            } else {
                test6.log(LogStatus.PASS, "Test Sample Received status is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, " Test Sample Received status is not displayed");
            getScreenshot("TestSample_Received ");
        }
    }

    public void setTestInProgress() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_inprogress));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " Test in Progress status is not displayed : " + stat);
                getScreenshot("Test_in_Progress");
            } else {
                test6.log(LogStatus.PASS, "Test in Progress status is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test in Progress status is not displayed");
            getScreenshot("Test_in_Progress ");
        }
    }

    public void setTestGenerated() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_test_generated));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " Test Report Generated status is not displayed : " + stat);
                getScreenshot("Test_Report_Generated");
            } else {
                test6.log(LogStatus.PASS, "Test Report Generated status is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Report Generated status is not displayed");
            getScreenshot("Test_Report_Generated");
        }
    }

    public void readCopyRights() throws IOException {
        try {
            WebElement status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_copyrights));
            String stat = status.getText();
            if (stat == null) {
                test6.log(LogStatus.FAIL, " Copyrights is not displayed : " + stat);
                getScreenshot("Copyrights");
            } else {
                test6.log(LogStatus.PASS, "Copyrights is displayed : " + stat);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Copyrights is not displayed");
            getScreenshot("Copyrights ");
        }
    }

    //Reading Test Order Placed Status
    public void readTestOrderPlacedStatus() throws IOException, InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        try {
            test6.log(LogStatus.INFO, "Test Order Placed Status:");
            WebElement Status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestOrderPlacedStatus));
            String Text = Status.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order is not Placed Successfully");
            getScreenshot("TestOrder Placed Status");
        }
    }

    //Reading Test Order Placed Date
    public void readTestOrderPlacedDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Order Placed Date:");
            WebElement Date = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestOrderPlacedDate));
            String Text = Date.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Placed Date is not Displayed");
            getScreenshot("TestOrder Placed Date");
        }
    }

    //Reading Test Order Placed Person
    public void readTestOrderPlacedPerson() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Order Placed Person:");
            WebElement Person = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestOrderPlacedPerson));
            String Text = Person.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Placed Person is not Displayed");
            getScreenshot("TestOrder Placed Person");
        }
    }

    //Reading Test Order Confirmed Status
    public void readTestOrderConfirmedStatus() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Order Confirmed Status:");
            WebElement Status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestOrderConfirmedStatus));
            String Text = Status.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order confirmed Status is not Displayed");
            getScreenshot("TestOrder Confirmed Status");
        }
    }

    //Reading Test Order Confirmed Date
    public void readTestOrderConfirmedDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Order Confirmed Date:");
            WebElement Date = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestOrderConfirmedDate));
            String Text = Date.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Confirmed Date not Displayed");
            getScreenshot("TestOrder Confirmed Date");
        }
    }

    //Reading Test Order Confirmed Person
    public void readTestOrderConfirmedPerson() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Order Confirmed Person:");
            WebElement Person = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestOrderConfirmedPerson));
            String Text = Person.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Order Confirmed Person is not Displayed");
            getScreenshot("TestOrder confirmed Person");
        }
    }

    //Read Test Kit Shipped Header
    public void readTestKitShippedHeader() throws IOException {
        test6.log(LogStatus.INFO, "Test Kit Shipped Header: ");
        try {
            String t = driver.findElement(s_readTestKitShippedDate).getText();
            if (t.equals("null")) {
                WebElement Header = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_readTestKitShippedHeader));
                String Text = Header.getText();
                test6.log(LogStatus.PASS, Text);
            } else {
                test6.log(LogStatus.PASS, "Test Order is in InProgress Status");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Header = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_readTestKitShippedHeader));
                String Text = Header.getText();
                test6.log(LogStatus.PASS, Text);
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Header is not Displayed");
                getScreenshot("Test Kit Shipped Header");
            }
        }
    }

    public void setTestKitShipped(String N, String R, String F) throws IOException {
        test6.log(LogStatus.INFO, "Test Kit Shipped Details: ");
        try {
            String t = driver.findElement(s_readTestKitShippedDate).getText();
            if (t.equals("null")) {
                WebElement Name = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_setTestKitShippedName));
                Name.sendKeys(N);
                WebElement Remarks = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_setTestKitShippedRemarks));
                Remarks.sendKeys(R);
                WebElement Fedex = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_setTestKitShippedFedex));
                Fedex.sendKeys(F);
                test6.log(LogStatus.PASS, "Test Kit Shipped Name: " +N);
                test6.log(LogStatus.PASS, "Test Kit Shipped Remarks: " +R);
                test6.log(LogStatus.PASS, "Test Kit Shipped Fedex: " +F);

            } else {
                test6.log(LogStatus.PASS, "Test Order is in InProgress Status");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Name = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_setTestKitShippedName));
                Name.sendKeys(N);
                WebElement Remarks = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_setTestKitShippedRemarks));
                Remarks.sendKeys(R);
                WebElement Fedex = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_setTestKitShippedFedex));
                Fedex.sendKeys(F);
                test6.log(LogStatus.PASS, "Test Kit Shipped Name: " +N);
                test6.log(LogStatus.PASS, "Test Kit Shipped Remarks: " +R);
                test6.log(LogStatus.PASS, "Test Kit Shipped Fedex: " +F);
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Test Kit Shipped Name is not Entered");
                getScreenshot("Test Kit Shipped Name");
            }
        }
    }


    //Clicking Test Kit Shipped Next2
    public void clickTestKitShippedNext2() throws IOException {
        test6.log(LogStatus.INFO, "Clicking Test Kit Shipped Next: ");
        try {
            WebElement Next = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(s_clickTestKitShippedNext2));
            Next.click();
            test6.log(LogStatus.PASS, "Test Kit Shipped-Next is Clicked");
        } catch (NoSuchElementException | TimeoutException e1) {
            test6.log(LogStatus.WARNING, "Test Kit Shipped-Next is not Clicked or The Process is already Completed");
            getScreenshot("Test Kit Shipped-Next");
        }
    }

    //Clicking Test Kit Shipped Reject
    public void clickTestKitShippedReject(String RJ, String RR) throws IOException, InterruptedException {
        if(RJ.equals("No")) {
            try {
                test6.log(LogStatus.INFO, "Clicking Test Kit Shipped-Reject or Approve:");
                WebElement Approve = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickTestKitShippedNext));
                Approve.click();
                clickConfirm();
                test6.log(LogStatus.PASS, "Approve is Clicked");
            }catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.SKIP, "Test Kit Shipped-Next button is not visible");
            }}
        else {
            try {
                WebElement Reject = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickTestKitShippedReject));
                Reject.click();
                WebElement Reject_Reason = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_setRejectReason));
                Reject_Reason.sendKeys(RR);
                WebElement Reject_Confirm = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickRejectConfirm));
                Reject_Confirm.click();
                test6.log(LogStatus.PASS, "Reject is Clicked");
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.SKIP, "Test Kit Shipped-Next button is not visible");
            }
        }}


    //Clicking Reject-Cancel
    public void clickCancelReject() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Clicking Reject Cancel:");
            WebElement Cancel = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(s_clickRejectcancel));
            Cancel.click();
            test6.log(LogStatus.PASS, "Reject-Cancel is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Reject-Cancel is not Clicked");
            getScreenshot("Reject-Cancel");
        }
    }


    //Reading Approve Confirmation Text
    public void readConfirmationText() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Confirmation Message:");
            WebElement ConfirmText = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(s_readConfirmTextDialogBox));
            String Text = ConfirmText.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Confirmation Message is not Displayed or the Order is Processed Already");
            getScreenshot("Reject-Confirm");
        }
    }

    //Clicking Confirm-Close
    public void clickCloseConfirm() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test6.log(LogStatus.INFO, "Clicking Confirm-Close:");
            WebElement Close = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(s_clickCloseDialogBox));
            Close.click();
            test6.log(LogStatus.PASS, "Confirm-Close is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Confirmation Message is not Displayed or the Order is Processed Already");
            getScreenshot("Confirm-Close");
        }
    }

    //Clicking Approve-Confirm
    public void clickConfirm() throws IOException, InterruptedException {
        try {
            Thread.sleep(5000);
            test6.log(LogStatus.INFO, "Clicking Next-Confirm:");
            WebElement Close = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(s_clickConfirmDialogBox));
            Close.click();
            test6.log(LogStatus.PASS, "Next-Confirm is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "The Process is Already Completed or Confirm is not Clicked");
            getScreenshot("Next-Confirm");
        }
    }

    //Reading Test Kit Shipped Status
    public void readTestKitShippedStatus() throws IOException, InterruptedException {
        try {
            Thread.sleep(5000);
            test6.log(LogStatus.INFO, "Test Kit Shipped Status:");
            WebElement Status = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(s_readTestKitShippedStatus));
            String Text = Status.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Kit Shipped Status is not Displayed");
            getScreenshot("Test Kit Shipped-Status");
        }
    }

    //Reading Test Kit Shipped Date
    public void readTestKitShippedDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Kit Shipped Date:");
            WebElement Date = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestKitShippedDate));
            String Text = Date.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Kit Shipped Date is not Displayed");
            getScreenshot("Test Kit Shipped-Date");
        }
    }

    //Reading Test Kit Shipped Name
    public void readTestKitShippedName() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Kit Shipped Name:");
            WebElement Name = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestKitShippedName));
            String Text = Name.getText();
            test6.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Kit Shipped Name is not Displayed");
            getScreenshot("Test Kit Shipped-Name");
        }
    }

    //Reading Test Kit Return to Lab Header
    public void readTestKitReturnHeader() throws IOException {
        test6.log(LogStatus.INFO, "Test Kit Return to Lab Header: ");
        try {
            String t = driver.findElement(s_readTestKitReturnDate).getText();
            if (t.equals("null")) {
                WebElement Header = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_readTestkitReturnHeader));
                String Text = Header.getText();
                test6.log(LogStatus.PASS, Text);
            } else {
                test6.log(LogStatus.PASS, "Process is Already Completed");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Header = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_readTestkitReturnHeader));
                String Text = Header.getText();
                test6.log(LogStatus.PASS, Text);
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Header is not Displayed");
                getScreenshot("Test Kit Return-Header");
            }
        }
    }

    //Entering Test Kit Return Shipping ID
    public void setTestkitReturnShipping(String I, String N) throws IOException, InterruptedException {
        test6.log(LogStatus.INFO, "Test Kit Return to Lab Details:");
        try {
            String t = driver.findElement(s_readTestKitReturnDate).getText();
            if (t.equals("null")) {
                WebElement ShippingID = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestKitreturnShippingID));
                ShippingID.sendKeys(I);
                WebElement ShippingName = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestKitReturnShippingName));
                ShippingName.sendKeys(N);
                WebElement Next = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_clickTestKitReturnNext));
                Next.click();
                clickConfirm();
                test6.log(LogStatus.PASS, "Test Kit Return to Lab Shipping ID: " +I);
                test6.log(LogStatus.PASS, "Test Kit Return to Lab Shipping Name: " +N);
            } else {
                test6.log(LogStatus.PASS, "Process is Already Completed");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement ShippingID = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestKitreturnShippingID));
                ShippingID.sendKeys(I);
                WebElement ShippingName = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestKitReturnShippingName));
                ShippingName.sendKeys(N);
                WebElement Next = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_clickTestKitReturnNext));
                Next.click();
                clickConfirm();
                test6.log(LogStatus.PASS, "Test Kit Return to Lab Shipping ID: " +I);
                test6.log(LogStatus.PASS, "Test Kit Return to Lab Shipping Name: " +N);
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "No Such Element in Test Kit Return to Lab");
                getScreenshot("Test Kit Return-Shipping ID");
            }
        }
    }


    //Test Kit Return to Lab Status
    public void readTestKitReturnStatus() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test6.log(LogStatus.INFO, "Test Kit Return to Lab Status:");
            WebElement Status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestKitReturnStatus));
            String T = Status.getText();
            test6.log(LogStatus.PASS, T);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Status is not Displayed");
            getScreenshot("Test Kit Returned-Status");
        }
    }

    //Reading Test Kit Return to Lab Date
    public void readTestKitReturnDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Kit Return to Lab Date:");
            WebElement Date = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestKitReturnDate));
            String D = Date.getText();
            test6.log(LogStatus.PASS, D);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Date is not Displayed");
            getScreenshot("Test Kit Returned-Date");
        }
    }

    //Reading Test Kit Return to Lab Shipping Details
    public void readTestKitReturnShippingDetails() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Kit Return to Lab Shipping Details:");
            WebElement Ship = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestKitReturnShippingDetails));
            String S = Ship.getText();
            test6.log(LogStatus.PASS, S);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Shipping Details are not Displayed");
            getScreenshot("Test Kit Returned-Shipping Details");
        }
    }

    //Reading Test Kit Return to Lab Name
    public void readTestKitReturnName() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Kit Return to Lab Approved By:");
            WebElement Name = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestKitReturnName));
            String N = Name.getText();
            test6.log(LogStatus.PASS, N);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Name is not Displayed");
            getScreenshot("Test Kit Returned-Name");
        }
    }

    //Reading Test Sample Header
    public void readTestSampleHeader() throws IOException {
        test6.log(LogStatus.INFO, "Test Sample Received Header: ");
        try {
            String t = driver.findElement(s_readTestSampleReceivedDate).getText();
            if (t.equals("null")) {
                WebElement Header = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_readTestSampleReceivedHeader));
                String N = Header.getText();
                test6.log(LogStatus.PASS, N);
            } else {
                test6.log(LogStatus.PASS, "Process is Already Completed");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Header = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_readTestSampleReceivedHeader));
                String N = Header.getText();
                test6.log(LogStatus.PASS, N);
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Header is not Displayed");
                getScreenshot("Test Sample Received-Header");
            }
        }
    }


    //Entering Test Sample Name
    public void setTestSample(String N, String R) throws IOException {
        test6.log(LogStatus.INFO, "Test Sample Received Details: ");
        try {
            String t = driver.findElement(s_readTestSampleReceivedDate).getText();
            if (t.equals("null")) {
                WebElement Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestSampleReceivedName));
                Name.sendKeys(N);
                WebElement Rem = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestSampleReceivedRemarks));
                Rem.sendKeys(R);
                test6.log(LogStatus.PASS, "Test Sample Name: " +N);
                test6.log(LogStatus.PASS, "Test Sample Remarks: " +R);
            } else {
                test6.log(LogStatus.PASS, "Process is Already Completed");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestSampleReceivedName));
                Name.sendKeys(N);
                WebElement Rem = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestSampleReceivedRemarks));
                Rem.sendKeys(R);
                test6.log(LogStatus.PASS, "Test Sample Name: " +N);
                test6.log(LogStatus.PASS, "Test Sample Remarks: " +R);
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Name is neither Entered nor Displayed");
                getScreenshot("Test Sample Received-Name");
            }
        }
    }

    public void clickTestSampleReject(String RJ, String RR) throws IOException, InterruptedException {
        if(RJ.equals("No")) {
            try {
                test6.log(LogStatus.INFO, "Clicking Test sample Received Approve:");
                WebElement Approve = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickTestSampleReceivedNext));
                Approve.click();
                clickConfirm();
                test6.log(LogStatus.PASS, "Approve is Clicked");
            }catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.SKIP, "Test Kit Shipped-Next button is not visible");
            }}
        else {
            try {
                test6.log(LogStatus.INFO, "Clicking Test sample Received Reject:");
                WebElement Reject = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickTestSampleReceivedReject));
                Reject.click();
                WebElement Reject_Reason = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_setRejectReason));
                Reject_Reason.sendKeys(RR);
                WebElement Reject_Confirm = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickRejectConfirm));
                Reject_Confirm.click();
                test6.log(LogStatus.PASS, "Reject is Clicked");
            } catch (NoSuchElementException | TimeoutException e) {
                test6.log(LogStatus.SKIP, "Test Kit Shipped-Next button is not visible");
            }
        }}




    //Reading Test Sample Received Status
    public void readTestSampleStatus() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test6.log(LogStatus.INFO, "Test Sample Received Status:");
            WebElement Status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestSampleReceivedStatus));
            String S = Status.getText();
            test6.log(LogStatus.PASS, S);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Status is not Displayed");
            getScreenshot("Test Sample Received-Status");
        }
    }

    //Reading Test Sample Received Date
    public void readTestSampleDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Sample Date:");
            WebElement Date = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestSampleReceivedDate));
            String D = Date.getText();
            test6.log(LogStatus.PASS, D);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Date is not Displayed");
            getScreenshot("Test Sample Received-Date");
        }
    }

    //Reading Test Sample Received Name
    public void readTestSampleName() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Sample Name:");
            WebElement Name = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestSampleReceivedName));
            String N = Name.getText();
            test6.log(LogStatus.PASS, N);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Remarks is not Displayed");
            getScreenshot("Test Sample Received-Remarks");
        }
    }

    //Reading Test In Progress Header
    public void readTestInProgressHeader() throws IOException {
        test6.log(LogStatus.INFO, "Test In Progress Header: ");
        try {
            String t = driver.findElement(s_readTestinProgressDate).getText();
            if (t.equals("null")) {
                WebElement Header = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_readTestInProgressHeader));
                String H = Header.getText();
                test6.log(LogStatus.PASS, H);
            } else {
                test6.log(LogStatus.PASS, "Process is Already Completed");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Header = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_readTestInProgressHeader));
                String H = Header.getText();
                test6.log(LogStatus.PASS, H);
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Header is not Displayed");
                getScreenshot("Test In Progress-Header");
            }
        }
    }

    //Entering Test in Progress Name
    public void setTestinProgress(String N, String R, String L) throws IOException, InterruptedException {
        test6.log(LogStatus.INFO, "Test InProgress Details: ");
        try {
            String t = driver.findElement(s_readTestinProgressDate).getText();
            if (t.equals("null")) {
                WebElement Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestinProgressName));
                Name.sendKeys(N);
                WebElement Re = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestinProgressRemarks));
                Re.sendKeys(R);
                WebElement Lab = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestinProgressLab));
                test6.log(LogStatus.PASS, "Test in Progress Name: " +N);
                test6.log(LogStatus.PASS, "Test in Progress Remarks: " +R);
                test6.log(LogStatus.PASS, "Test in Progress Lab: " +L);
            } else {
                test6.log(LogStatus.PASS, "Process is Already Completed");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestinProgressName));
                Name.sendKeys(N);
                WebElement Re = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestinProgressRemarks));
                Re.sendKeys(R);
                WebElement Lab = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_setTestinProgressLab));
                test6.log(LogStatus.PASS, "Test in Progress Name: " +N);
                test6.log(LogStatus.PASS, "Test in Progress Remarks: " +R);
                test6.log(LogStatus.PASS, "Test in Progress Lab: " +L);
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Name is neither Entered nor Displayed");
                getScreenshot("Test In Progress-Name");
            }
        }

    }


    //Clicking Calendar
    public void clickTestinProgressCalender() throws IOException {
        test6.log(LogStatus.INFO, "Clicking Calendar: ");
        try {
            String t = driver.findElement(s_readTestinProgressDate).getText();
            if (t.equals("null")) {
                WebElement Calender = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_clickTestinProgressCalender));
                Calender.click();
                test6.log(LogStatus.PASS, "Calendar is Clicked");
            } else {
                test6.log(LogStatus.PASS, "Process is Already Completed");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Calender = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_clickTestinProgressCalender));
                Calender.click();
                test6.log(LogStatus.PASS, "Calendar is Clicked");
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Lab Calendar is not Clicked");
                getScreenshot("Test In Progress-Calendar");
            }
        }
    }

    //Selecting Month in Calendar
    public void clickTestinProgressCalender_Schedule() throws IOException {
        test6.log(LogStatus.INFO, "Selecting Calendar-Month: ");
        try {
            String t = driver.findElement(s_readTestinProgressDate).getText();
            if (t.equals("null")) {
                WebElement Month = new WebDriverWait(driver, 3)
                        .until(driver -> driver.findElement(s_selectNextMonth));
                Month.click();
                WebElement Day = new WebDriverWait(driver, 3)
                        .until(driver -> driver.findElement(s_selectDay));
                Day.click();
                WebElement Hour = new WebDriverWait(driver, 3)
                        .until(driver -> driver.findElement(s_selectHour));
                Hour.click();
                WebElement Mins = new WebDriverWait(driver, 3)
                        .until(driver -> driver.findElement(s_selectMins));
                Mins.click();
                test6.log(LogStatus.PASS, "Schedule is Selected");
            } else {
                test6.log(LogStatus.PASS, "Process is Already Completed");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Month = new WebDriverWait(driver, 3)
                        .until(driver -> driver.findElement(s_selectNextMonth));
                Month.click();
                WebElement Day = new WebDriverWait(driver, 3)
                        .until(driver -> driver.findElement(s_selectDay));
                Day.click();
                WebElement Hour = new WebDriverWait(driver, 3)
                        .until(driver -> driver.findElement(s_selectHour));
                Hour.click();
                WebElement Mins = new WebDriverWait(driver, 3)
                        .until(driver -> driver.findElement(s_selectMins));
                Mins.click();
                test6.log(LogStatus.PASS, "Schedule is Selected");
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Month is not Selected");
                getScreenshot("Test In Progress-Calendar-Month");
            }
        }
    }

    //Clicking Test in Progress-Next
    public void clickTestinProgressNext() throws IOException, InterruptedException {
        test6.log(LogStatus.INFO, "Clicking Next: ");
        try {
            String t = driver.findElement(s_readTestinProgressDate).getText();
            if (t.equals("null")) {
                WebElement Next = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_clickTestinProgressNext));
                Next.click();
                clickConfirm();
                test6.log(LogStatus.PASS, "Next is Clicked");
            } else {
                test6.log(LogStatus.PASS, "Process is Already Completed");
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement Next = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_clickTestinProgressNext));
                Next.click();
                clickConfirm();
                test6.log(LogStatus.PASS, "Next is Clicked");
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Next is not Clicked");
                getScreenshot("Test In Progress-Next");
            }
        }
    }

    //Reading Test in Progress Status
    public void readTestInProgressStatus() throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Test in Progress Status:");
            WebElement Status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestinProgressStatus));
            String S = Status.getText();
            test6.log(LogStatus.PASS, S);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Status is not Displayed");
            getScreenshot("Test In Progress-Status");
        }
    }

    //Reading Test in Progress Date
    public void readTestInProgressDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test in Progress Date:");
            WebElement date = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestinProgressDate));
            String D = date.getText();
            test6.log(LogStatus.PASS, D);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Date is not Displayed");
            getScreenshot("Test In Progress-date");
        }
    }

    //Reading Test in Progress Name
    public void readTestInProgressName() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test in Progress Name:");
            WebElement Name = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestinProgressName));
            String N = Name.getText();
            test6.log(LogStatus.PASS, N);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Name is not Displayed");
            getScreenshot("Test In Progress-Name");
        }
    }

    //Reading Test Report Header
    public void readTestReportHeader() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Report Generated Header:");
            WebElement Header = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestReportGenerateHeader));
            String H = Header.getText();
            test6.log(LogStatus.PASS, H);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Header is not Displayed");
            getScreenshot("Test Report Generated-Header");
        }
    }

    //Entering Test Report Details
    public void setTestReportName(String N, String R) throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Entering Test Report Name:");
            WebElement Name = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_setTestReportGenerateName));
            Name.sendKeys(N);
            WebElement Remarks = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_setTestReportGenerateRemarks));
            Remarks.sendKeys(R);
            test6.log(LogStatus.PASS, N);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Report Name is not Entered");
            getScreenshot("Test Report-Name");
        }
    }

    //Click Test Report Upload
    public void clickTestReportUpload() throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Clicking Test Report Generate-Upload");
            WebElement Upload = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_clickTestReportUpload));
            Upload.click();
            test6.log(LogStatus.PASS, "Upload is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Upload is not Clicked");
            getScreenshot("Test Report-Upload");
        }
    }

    //Reading Test Report Upload Header
    public void readTestReportUploadHeader() throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Test Report Upload Header:");
            WebElement Header = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestReportUploadHeader));
            String H = Header.getText();
            test6.log(LogStatus.PASS, H);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Header is not Displayed");
            getScreenshot("Test Report Upload-Header");
        }
    }

    //Clicking Upload-Member1
    public void clickUploadMember1(String U) throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Uploading Test Report-Member1");
            if (driver.findElement(s_readMember1).isDisplayed()) {
                WebElement Upload = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickMember1Upload));
                Thread.sleep(1000);
                Upload.sendKeys(U);
                test6.log(LogStatus.PASS, "Report is Uploaded");
            } else {
                test6.log(LogStatus.WARNING, "Add on Member1 is not Added");
                getScreenshot("Test Report Upload-Member1");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on Member1 is not Added");
            getScreenshot("Test Report Upload-Member1");
        }
    }

    //Clicking Upload Member2
    public void clickUploadMember2(String U) throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Uploading Test Report-Member2");
            if (driver.findElement(s_readMember2).isDisplayed()) {
                WebElement Upload = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickMember2Upload));
                Thread.sleep(1000);
                Upload.sendKeys(U);
                test6.log(LogStatus.PASS, "Report is Uploaded");
            } else {
                test6.log(LogStatus.WARNING, "Add on Member2 is not Added");
                getScreenshot("Test Report Upload-Member2");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on Member2 is not Added");
            getScreenshot("Test Report Upload-Member2");
        }
    }

    //Clicking Upload-Member3
    public void clickUploadMember3(String U) throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Uploading Test Report-Member3");
            if (driver.findElement(s_readMember3).isDisplayed()) {
                WebElement Upload = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickMember3Upload));
                Thread.sleep(1000);
                Upload.sendKeys(U);
                test6.log(LogStatus.PASS, "Report is Uploaded");
            } else {
                test6.log(LogStatus.WARNING, "Add on Member3 is not Added");
                getScreenshot("Test Report Upload-Member3");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on Member3 is not Added");
            getScreenshot("Test Report Upload-Member3");
        }
    }

    //Clicking Upload Member4
    public void clickUploadMember4(String U) throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Uploading Test Report-Member4");
            if (driver.findElement(s_readMember4).isDisplayed()) {
                WebElement Upload = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickMember4Upload));
                Thread.sleep(1000);
                Upload.sendKeys(U);
                test6.log(LogStatus.PASS, "Report is Uploaded");
            } else {
                test6.log(LogStatus.WARNING, "Add on Member4 is not Added");
                getScreenshot("Test Report Upload-Member4");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on Member4 is not Added");
            getScreenshot("Test Report Upload-Member4");
        }
    }

    //Clicking Upload Member5
    public void clickUploadMember5(String U) throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Uploading Test Report-Member5");
            if (driver.findElement(s_readMember5).isDisplayed()) {
                WebElement Upload = new WebDriverWait(driver, 5)
                        .until(driver -> driver.findElement(s_clickMember5Upload));
                Thread.sleep(1000);
                Upload.sendKeys(U);
                test6.log(LogStatus.PASS, "Report is Uploaded");
            } else {
                test6.log(LogStatus.WARNING, "Add on Member5 is not Added");
                getScreenshot("Test Report Upload-Member5");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "Add on Member5 is not Added");
            getScreenshot("Test Report Upload-Member5");
        }
    }


    //Clicking Report Upload Confirm
    public void clickTestReportUploadConfirm() throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "Clicking Test Report Generate-Upload-Confirm");
            WebElement Confirm = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_clickConfirmTestReportUpload));
            Confirm.click();
            test6.log(LogStatus.PASS, "Uploading is Done");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Upload is not Done");
            getScreenshot("Test Report-Upload-Confirm");
        }
    }

    //Clicking Generate Report
    public void clickGenerateReport() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test6.log(LogStatus.INFO, "Clicking Generate Report");
            WebElement Report = new WebDriverWait(driver, 5)
                    .until(driver -> driver.findElement(s_clickGenerateReport));
            Report.click();
            Thread.sleep(1000);
            clickConfirm();
            test6.log(LogStatus.PASS, "Report Generated");
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Report is not Generated");
            getScreenshot("Test Report Generate");
        }
    }

    //Reading Test report Status
    public void readTestReportStatus() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test6.log(LogStatus.INFO, "Test Report Generated Status:");
            WebElement Status = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestReportGeneratedStatus));
            String S = Status.getText();
            test6.log(LogStatus.PASS, S);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Status is not Displayed");
            getScreenshot("Test Report Generate-Status");
        }
    }

    //Reading Test Report Generate date
    public void readTestReportGenerateDate() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Report Generated Date:");
            WebElement date = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestReportGeneratedDate));
            String D = date.getText();
            test6.log(LogStatus.PASS, D);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Date is not Displayed");
            getScreenshot("Test Report Generated-date");
        }
    }

    //Reading Test Report Generate Name
    public void readTestReportGeneratedName() throws IOException {
        try {
            test6.log(LogStatus.INFO, "Test Report Generated Name:");
            WebElement Name = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(s_readTestReportGeneratedName));
            String N = Name.getText();
            test6.log(LogStatus.PASS, N);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Name is not Displayed");
            getScreenshot("Test Report Generated-Name");
        }
    }

    //Reading Test Order Final Status
    public void readTestFinalStatus() throws InterruptedException, IOException {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-600)");
        try {
            test6.log(LogStatus.INFO, "Test Order Final Status:");
            WebElement Status = new WebDriverWait(driver, 3)
                    .until(driver -> driver.findElement(s_readFinalStatus));
            String S = Status.getText();
            test6.log(LogStatus.PASS, S);
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Final Status is not Displayed");
            getScreenshot("Test Order Final Status");
        }
    }

    public void ReadUserDetails() throws IOException, InterruptedException {
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Order Number:");
            WebElement OrderID = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestorderid));
            String Text = OrderID.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Order ID was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Order ID is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Order No");
        }
        //Reading Patient Name
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Patient Name:");
            WebElement PatientName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestPatientName));
            String Text = PatientName.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient name was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient name is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Patient Name");
        }
        //Reading  Patient Profile Image
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Patient Profile Image");
            WebElement ProfileImage = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestPatientProfileImage));
            String Text = ProfileImage.getAttribute("src");
            if (Text.contains(".jpg") || Text.contains(".jpeg")) {
                test6.log(LogStatus.PASS, "Profile Image visible");
            } else {
                test6.log(LogStatus.WARNING, "Profile Image not visible");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.PASS, "Patient Profile Iamge is Displayed");
            getScreenshot("Patient Profile Image");
        }
        //Reading Patient Phone
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Patient Phone Number:");
            WebElement PatientPhone = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestPatientPhone));
            String Text = PatientPhone.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Patient Phone number was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Patient Phone number is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Patient Phone");
        }
        //Reading test amount
        try {
            test6.log(LogStatus.INFO, "Test Amount:");
            WebElement Testamount = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestTestamount));
            String Text = Testamount.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Test Amount was not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Test Amount is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("Test amount");
        }
        //Reading TestOrderlistpage Test Order Type
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Test Order Type:");
            WebElement TestOrderlistpageTestType = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestTestType));
            String Text = TestOrderlistpageTestType.getAttribute("src");
            if (Text.contains("home")) {
                test6.log(LogStatus.PASS, "It's a Home Test");
            } else if(Text.contains("self")){
                test6.log(LogStatus.PASS, "It's a Self Test");
            } else {
                test6.log(LogStatus.WARNING, "Test type not visible");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            Thread.sleep(2000);
            try {
                WebElement TestOrderlistpageTestType = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(s_orderrequestTestType));
                String Text = TestOrderlistpageTestType.getAttribute("src");
                if (Text.contains("home")) {
                    test6.log(LogStatus.PASS, "It's a Home Test");
                } else if (Text.contains("self")) {
                    test6.log(LogStatus.PASS, "It's a Self Test");
                } else {
                    test6.log(LogStatus.WARNING, "Test type not visible");
                }
            } catch (NoSuchElementException | TimeoutException e1) {
                test6.log(LogStatus.FAIL, "Test type not shown");
                getScreenshot("TestOrderListPage-Test Order Type");
            }
        }
        //Reading TestOrderlistpage Test Details
        try {
            test6.log(LogStatus.INFO, "TestOrderlistpage-Test Details:");
            WebElement TestDetails = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestTestDetails));
            String Text = TestDetails.getText();
            if (Text.contains("null")) {
                test6.log(LogStatus.FAIL, "Test Details are not visible" + Text);
            } else {
                test6.log(LogStatus.PASS, "Test Details are : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Test Details");
        }
        try {
            test6.log(LogStatus.INFO, "Ready to Verify the Test Status");
            WebElement orderST = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test6.log(LogStatus.FAIL, "Test Status is not displayed");
                getScreenshot("RO_TStatus");
            } else {
                test6.log(LogStatus.PASS, "Test Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test6.log(LogStatus.FAIL, "Test Status is not displayed");
            getScreenshot("RO_TStatus");
        }
    }

}

