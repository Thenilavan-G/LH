package IntegrationTest;

import Utils.IntegrationGoogleSheet;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class BookATest extends IntegrationGoogleSheet {

    @BeforeTest
    public void setApp() {
        AppTest.startTest();
    }

    @Test(priority = 1)
    public void loginApp() throws IOException, InterruptedException {
        AppTest.launchApp();
        AppTest.MobileNumber_Signup();
        AppTest.OTP_Page();
    }

    @Test(priority = 2, invocationCount = 50)
    public void bookTest() throws IOException, InterruptedException {
        //Self-Test
        AppTest.BookA_SelfTest_COVID19PCRTest();
        AppTest.BookA_SelfTest_COVID19AntibodyTest();
        AppTest.BookA_SelfTest_RPPTest();
        AppTest.BookA_SelfTest_MicrobiomeTest();

        //Home-Test
        AppTest.BookA_InHomeTest_COVID19PCRTest();
        AppTest.BookA_InHomeTest_COVID19AntibodyTest();
        AppTest.BookA_InHomeTest_RPPTest();
        AppTest.BookA_InHomeTest_MicrobiomeTest();
    }

    @AfterTest
    public void testReport() {
        AppTest.endTest();
    }

}
