package IntegrationTest;

import Utils.IntegrationGoogleSheet;
import org.testng.annotations.*;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class SingleOrder extends IntegrationGoogleSheet {

    @BeforeTest
    public void setApp() {
        AppTest.startTest();
        AdminTest.startTest();
    }

    @Test(priority = 1)
    public void loginApp() throws IOException, InterruptedException {
        AppTest.launchApp();
        AppTest.MobileNumber_Signup();
        AppTest.OTP_Page();
    }

    @Test(priority = 2)
    public void bookTest() throws IOException, InterruptedException {
        //Self-Test
//        AppTest.BookA_SelfTest_COVID19PCRTest();
//        AppTest.BookA_SelfTest_COVID19AntibodyTest();
//        AppTest.BookA_SelfTest_RPPTest();
//        AppTest.BookA_SelfTest_MicrobiomeTest();

        //Home-Test
        AppTest.BookA_InHomeTest_COVID19PCRTest();
//        AppTest.BookA_InHomeTest_COVID19AntibodyTest();
//        AppTest.BookA_InHomeTest_RPPTest();
//        AppTest.BookA_InHomeTest_MicrobiomeTest();
    }

    @Test(priority = 3)
    public void leftMenu() throws IOException, InterruptedException {
        AppTest.Test_Orders_Info();
        AppTest.Left_Menu();
    }

    @Test(priority = 4)
    public void loginAdmin() throws IOException {
        AdminTest.openBrowser();
        AdminTest.Login();
    }

    @Test(priority = 5)
    public void updateOrderStatus() throws IOException, InterruptedException {
        AdminTest.OrderRequest();
        AdminTest.OrderTrack();
    }

    @Test(priority = 6)
    public void closeBrowser() {
        AdminTest.closeBrowser();
    }

    @AfterTest
    public void testReport() {
        AppTest.endTest();
        AdminTest.endTest();
    }

}
