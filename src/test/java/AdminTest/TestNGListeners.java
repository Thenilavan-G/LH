package AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static AdminPages.AdminTestBase.getScreenshot;
import static AdminPages.AdminTestBase.test;

public class TestNGListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Started " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Success " + result.getName());
        test.log(LogStatus.PASS, result.getName() + " Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed " + result.getName());
        test.log(LogStatus.FAIL, result.getName() + " Failed");
        try {
            getScreenshot("TestFailed_" + result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Failed With Timeout " + result.getName());
        test.log(LogStatus.FAIL, result.getName() + " Failed");
        try {
            getScreenshot("TestFailed_With_Timeout_" + result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Failed with Success Percentage " + result.getName());
        test.log(LogStatus.FAIL, result.getName() + " Failed");
        try {
            getScreenshot("TestFailed_Within_SuccessPercentage_" + result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped " + result.getName());
        test.log(LogStatus.SKIP, result.getName() + " Skipped");
        try {
            getScreenshot("TestSkipped_" + result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finished " + context.getName());
    }

}
