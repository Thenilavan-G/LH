package AdminTest;

import AdminPages.*;
import org.testng.annotations.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class LHAdminRegression extends AdminTestBase {

    @Test (dataProvider = "getData")
    public void Login_Validation(String userName, String passWord) throws IOException {
        LoginPageObjects logObj = new LoginPageObjects(driver);

        logObj.setLoginCredentials(userName, passWord);
    }

    @Test(priority = 1)
    public static void Login() throws IOException {
        LoginPageObjects logObj = new LoginPageObjects(driver);

        logObj.verifyHomepageTitle();
        logObj.verifyLoginUI("Together we all serve by faith, hope and\n" + "love but the greatest of these is love...", "Login", "Email", "Password", "Login");
        logObj.setLoginCredentials(dataList.get(16), dataList.get(17));
    }

    @Test(priority = 2)
    public static void Dashboard() throws IOException, InterruptedException {
        DashboardPageObjects dashObj = new DashboardPageObjects(driver);

        //Login();
        dashObj.verifyDoughnutChart();
        dashObj.verifyCompletedStatusIcon();
        dashObj.verifyCompletedOrderCount();
        dashObj.verifyCompletedText();
        dashObj.verifyApprovedStatusLogo();
        dashObj.verifyApprovedOrderCount();
        dashObj.verifyApprovedText();
        dashObj.verifyInProgressStatusLogo();
        dashObj.verifyInProgressOrderCount();
        dashObj.verifyInProgressText();
        dashObj.verifyPendingStatusLogo();
        dashObj.verifyPendingOrderCount();
        dashObj.verifyPendingOrderText();
        dashObj.verifyRejectedStatusLogo();
        dashObj.verifyRejectedOrderCount();
        dashObj.verifyRejectedText();
        dashObj.verifyRecentOrderQueue();
        dashObj.verifyOrderNoHeader();
        dashObj.verifyPatientNameHeader();
        dashObj.verifyAgeHeader();
        dashObj.verifySexHeader();
        dashObj.verifyPhoneNoHeader();
        dashObj.verifyLocationHeader();
        dashObj.verifyTestDetailsHeader();
        dashObj.verifyFirstOrder();
        dashObj.verifyFirstOrderPatientProfileImage();
        dashObj.verifyFirstOrderAddOnMemberCount();
        dashObj.verifyFirstOrderPatientName();
        dashObj.verifyFirstOrderPatientAge();
        dashObj.verifyFirstOrderPatientSex();
        dashObj.verifyFirstOrderPatientPhoneNo();
        dashObj.verifyFirstOrderPatientLocation();
        dashObj.verifyFirstOrderPatientTestType();
        dashObj.verifyFirstOrderPatientTestName();
        dashObj.verifyItemsPerPageText();
        dashObj.clickPageDropdown();
        dashObj.setTenItemsPerPage();
        dashObj.setTwentyItemsPerPage();
        dashObj.verifyPageNumberText();
        dashObj.setFiveItemsPerPage();
        dashObj.verifyPaginationIcon();
        dashObj.verifyPaginationPreviousIcon();
        dashObj.verifyPaginationBackIcon();
        dashObj.clickOrderRequestTab();
        dashObj.clickTestOrderTab();
        dashObj.clickLabTestDashboardTab();
    }

    @Test(priority = 3)
    public static void RecentOrderView() throws IOException, InterruptedException {
        RecentOrderQueuePageObjects recObj = new RecentOrderQueuePageObjects(driver);

        //Login();
        recObj.clickOrders();
        recObj.verifyOrderNo();
        recObj.verifyPatientName();
        recObj.verifyOrderNumber();
        recObj.verifyProfilePic();
        recObj.verifyTestOptionName();
        recObj.verifyTestType();
        recObj.verifyTestOrderStatus();
        recObj.verifyOrderDateTime();
        recObj.verifyScheduleDateTime();
        recObj.verifyPaymentDetailsText();
        recObj.verifyTestNameValue();
        recObj.verifyShippingNameValue();
        recObj.verifyTaxNameValue();
        recObj.verifyTotalNameValue();
        recObj.verifyLabDetails("Lab Details", "Choose Laboratory");
        recObj.verifyButtons("Reject", "Approve", "Reject Reason", "Cancel", "Reject", "Are you sure you want to approve the order ?", "Close", "Confirm");
        recObj.verifyPatientDetails("Age :", "Gender :", "Phone :", "Height :", "Weight :", "Blood Group :", "Address :");
        recObj.verifyAddMemberDetails("Add-on Members (Family or Co-workers)");
        recObj.verifyCopyRights();
        //recObj.setOrderConfirmation(dataList.get(18), dataList.get(19));
    }

    @Test(priority = 4)
    public static void OrderRequest() throws InterruptedException, IOException {
        OrderRequestPageObjects reqObj = new OrderRequestPageObjects(driver);

        //Login();
        reqObj.clickOrderRequestTab();
        reqObj.readOrderRequestHeader();
        reqObj.readMenubarTitle1();
        reqObj.readMenubarTitle2();
        reqObj.readMenubarTitle3();
        reqObj.readMenubarTitle4();
        reqObj.readMenubarTitle5();
        reqObj.readMenubarTitle6();
        reqObj.readMenubarTitle7();
        reqObj.clickOrderRequestTab();
        reqObj.setSearchBy(dataList.get(21));
        reqObj.readHomePageOrderDetails();
        reqObj.clickOrder();
        reqObj.readOrderNo();
        reqObj.readPatientName();
        reqObj.readPatientProfilePicture();
        reqObj.readPatientAge();
        reqObj.readPatientGender();
        reqObj.readPatientPhone();
        reqObj.readPatientHeight();
        reqObj.readPatientWeight();
        reqObj.readPatientBloodGroup();
        reqObj.readAddonMember();
        reqObj.readTestDetails();
        reqObj.readTestStatus();
        reqObj.readTestType();
        reqObj.readOrderCreatedDate();
        reqObj.readScheduledDate();
        reqObj.readPaymentDetails();
        reqObj.readLabdetails();
        reqObj.clickReject();
        reqObj.clickCancelReject();
        reqObj.clickApprove();
        reqObj.readApproveAlertMessage();
        reqObj.clickApproveClose();
        reqObj.setOrderConfirmation(dataList.get(18), dataList.get(19));
    }

    @Test(priority = 5)
    public static void OrderTrack() throws IOException {
        TestOrderTrackPageObjects ordTrack = new TestOrderTrackPageObjects(driver);

        //RecentOrderView();
        ordTrack.selectOrders(dataList.get(21));
        ordTrack.verifyTestOrderType();
    }

    @Test(priority = 6)
    public static void TestOrders() throws IOException, InterruptedException {
        TestOrdersPageObjects TestOrderObj = new TestOrdersPageObjects(driver);

        //Login();
        TestOrderObj.setTestOrder();
        TestOrderObj.ClickFilter2();
        TestOrderObj.ClickApproveOption();
        TestOrderObj.ClickFilter2();
        TestOrderObj.ClickInProgressOption();
        TestOrderObj.ClickFilter2();
        TestOrderObj.ClickCompletedOption();
        TestOrderObj.ClickFilter2();
        TestOrderObj.ClickRefundedOption();
        TestOrderObj.ClickFilter2();
        TestOrderObj.ClickRejectedOption();
        TestOrderObj.ClickFilter2();
        TestOrderObj.ClickAllOpt();
        TestOrderObj.UserDetails();
        TestOrderObj.setSearchBy(dataList.get(21));
        TestOrderObj.clearSearchBox();
        TestOrderObj.clickPaginationDownArrow();
        TestOrderObj.clickPagination10();
        TestOrderObj.clickPaginationDownArrow();
        TestOrderObj.clickPagination20();
        TestOrderObj.clickPaginationDownArrow();
        TestOrderObj.clickPagination30();
        TestOrderObj.readItemsPerPage();
        TestOrderObj.readTotalItems();
        TestOrderObj.clickFirstPage();
        TestOrderObj.clickPreviousPage();
        TestOrderObj.clickNextPage();
        TestOrderObj.clickLastPage();
    }

    @Test(priority = 7)
    public static void Settings() throws InterruptedException, IOException {
        SettingsPageObjects Set = new SettingsPageObjects(driver);

        Set.setLIcon();
        Set.setLifeHopeHealthDropdown();
        Set.setEditProfile();
        Set.setAdminHeader();
        Set.setFirstName();
        Set.setFirstNameField();
        Set.setLastName();
        Set.setLastNameField();
        Set.setEmail();
        Set.setEmailField();
        Set.setSubmit();
        Set.setLifeHopeHealthDropdown();
        Set.setChangePassword();
        Set.setPasswordHeader();
        Set.setNewPassHeader();
        Set.setNewPassField();
        Set.setConfirmPassHeader();
        Set.setConfirmPassField();
        Set.setSubmit1();
        Set.setLifeHopeHealthDropdown();
        Set.setLogout();
    }

}
