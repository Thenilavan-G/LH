package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static IntegrationPages.TestBaseAdmin.getScreenshot;
import static IntegrationPages.TestBaseAdmin.test2;

public class DashboardPageObjects {

    private final WebDriver driver;

    By doughnut_chart = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[1]/div[1]/canvas[1]");
    By completedlogo = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By completedorderno = By.xpath("//div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h3");
    By completedtext = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]");
    By approvedlogo = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By approvedcount = By.xpath("//div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    By approvedtext = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/h5[1]");
    By inprogresslogo = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By inprogresscount = By.xpath("//div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    By inprogresstext = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]");
    By pendinglogo = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By pendingordercount = By.xpath("//div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    By pendingordertext = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h5[1]");
    By rejectedlogo = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By rejectedordercount = By.xpath("//div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    By rejectedtext = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/h5[1]");
    By recentorderqueue = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]");
    By order_noheader = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[1]");
    By patientnameheader = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[2]");
    By ageheader = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[3]");
    By sexheader = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[4]");
    By phonenoheader = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[5]");
    By locationheader = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[6]");
    By testdetailsheader = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[7]");
    By order1 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]");
    By patientimage1 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/img[1]");
    By addonmembercount1 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]");
    By patientname1 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/span[1]");
    By age1 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]");
    By sex1 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]");
    By phoneno1 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]");
    By location1 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]");
    By testtype1 = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-dashboard/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[7]/img");
    By testname1 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]");
    By order2 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]");
    By Patientimage2 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/img[1]");
    By patientname2 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]");
    By age2 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]");
    By sex2 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[4]");
    By phoneno2 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[5]");
    By location2 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[6]");
    By testtype2 = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[2]/td[7]/span/img[@src='../../assets/img/home test icon.png']");
    // By testtype2 = By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[7]");
    By clickOrderRequestTab = By.xpath("//li[2]/a/span[@class='toggle-none']");
    By testorder = By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/app-left-menu[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]");
    By labtestdashboard = By.xpath("/html/body/app-root/div[1]/div/div[2]/app-left-menu/div/div/div/ul/li[1]/div/a/span");
    By itemsperpagetext = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/div[1]");
    By itemsperpage = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]");
    //By dropdown = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]");
    By itemspageselect_10 = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]");
    By itemspageselect_20 = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[3]/span[1]");
    //*[@id="mat-option-2"]/div
    By pagenumbertext = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[2]/mat-paginator[1]/div[1]/div[1]/div[2]/div[1]");
    By itemspageselect_5 = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
    By pagination_icon = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[2]/mat-paginator[1]/div[1]/div[1]/div[2]/button[3]/span[1]/*[1]");
    By paginationprevious_icon = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[2]/mat-paginator[1]/div[1]/div[1]/div[2]/button[2]/span[1]/*[1]");
    By Paginationback_icon = By.xpath("//body/app-root[1]/div[1]/div[1]/div[3]/app-dashboard[1]/div[1]/app-life-hope-table[1]/div[1]/div[1]/div[1]/div[2]/div[2]/mat-paginator[1]/div[1]/div[1]/div[2]/button[1]/span[1]/*[1]");

    private Object IOException;

    public DashboardPageObjects(WebDriver driver) {

        this.driver = driver;
    }

    public void verifyDoughnutChart() throws IOException {
        test2.log(LogStatus.INFO, "Ready to display Doughnut chart");
        try {
            WebElement doughnutChart = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(doughnut_chart));
            if(doughnutChart.isDisplayed()) {
                test2.log(LogStatus.PASS, "Doughnut chart  shown as per requirement");
            } else {
                test2.log(LogStatus.FAIL, "Doughnut chart  not shown as per the requirement");
                getScreenshot("Dough_UI");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Doughnut chart  not shown as per the requirement");
            getScreenshot("Dough_UI");
        }
    }

    public void verifyCompletedStatusIcon() throws IOException {
        test2.log(LogStatus.INFO, " Ready to verify the Completed Logo Symbol");
        try {
            WebElement completed = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(completedlogo));
            if(completed.isDisplayed()) {
                test2.log(LogStatus.PASS, "Completed Logo symbol is visible");
            } else {
                test2.log(LogStatus.FAIL, "Completed Logo symbol is not visible");
                getScreenshot(" completed_Logo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Completed Logo symbol is not visible");
            getScreenshot(" completed_Logo");
        }
    }

    public void verifyCompletedOrderCount() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Completed order number to be displayed");
        //Thread.sleep(2000);
        try {
            WebElement completed = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(completedorderno));
            String completedOrder = completed.getText();
            if (completedOrder.equals("null")) {
                test2.log(LogStatus.FAIL, " Completed_order count is not displayed : " + completedOrder);
                getScreenshot(" Completed_order_count");
            } else {
                test2.log(LogStatus.PASS, "Completed order Count : " + completedOrder);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "  Completed order count  not shown as per the requirement");
        }
    }

    public void verifyCompletedText() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Completed order number text to be displayed");
        try {
            WebElement comptext = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(completedtext));
            String completedT = comptext.getText();
            if (completedT.equals("null")) {
                test2.log(LogStatus.FAIL, "Completed text not shown as per the requirement : " + completedT);
                getScreenshot(" Completed_text");
            } else {
                test2.log(LogStatus.PASS, "Completed text shown as per the requirement :" + completedT);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "  Completed text  not shown as per the requirement");
        }
    }

    public void verifyApprovedStatusLogo() throws IOException {
        test2.log(LogStatus.INFO, "Ready to verify the approved logo");
        try {
            WebElement aprvlogo = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(approvedlogo));
            if(aprvlogo.isDisplayed()) {
                test2.log(LogStatus.PASS, "Approved logo is shown as per the requirement");
            } else {
                test2.log(LogStatus.FAIL, " Approved logo logo not shown as per the requirement");
                getScreenshot(" approved_logo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " Approved logo logo not shown as per the requirement");
            getScreenshot(" approved_logo");
        }
    }

    public void verifyApprovedOrderCount() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Approved order count is to be displayed");
        try {
            WebElement aprvcount = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(approvedcount));
            String approvedCount = aprvcount.getText();
            if (approvedCount.equals("null")) {
                test2.log(LogStatus.FAIL, "Approved count not shown as per the requirement : " + approvedCount);
                getScreenshot(" approved_count");
            } else {
                test2.log(LogStatus.PASS, "Approved count is : " + approvedCount);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Approved count not shown as per the requirement");
        }
    }

    public void verifyApprovedText() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Approved text is to be displayed");
        try {
            WebElement aprvtext = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(approvedtext));
            String approvedText = aprvtext.getText();
            if (approvedText.equals("null")) {
                test2.log(LogStatus.FAIL, " approved text not shown as per the requirement");
                getScreenshot(" approved_text");
            } else {
                test2.log(LogStatus.PASS, "Approved text is : " + approvedText);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "  approved text not shown as per the requirement");
        }
    }

    public void verifyInProgressStatusLogo() throws IOException {
        test2.log(LogStatus.INFO, "In-progress logo to be displayed");
        try {
            WebElement inlogo = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(inprogresslogo));
            if(inlogo.isDisplayed()) {
                test2.log(LogStatus.PASS, "In-progress logo  shown as per the requirement ");
            } else {
                test2.log(LogStatus.FAIL, " In-progress logo not shown as per the requirement");
                getScreenshot("In-progress_logo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " In-progress logo not shown as per the requirement");
            getScreenshot("In-progress_logo");
        }
    }

    public void verifyInProgressOrderCount() throws IOException {
        test2.log(LogStatus.INFO, "In-progress count to be displayed");
        try {
            WebElement incount = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(inprogresscount));
            String inProgressCount = incount.getText();
            if (inProgressCount.equals("null")) {
                test2.log(LogStatus.FAIL, "In-progress count not shown as per the requirement : " + inProgressCount);
                getScreenshot("In-progress_count");
            } else {
                test2.log(LogStatus.PASS, "In Progress order count is : " + inProgressCount);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " In-progress count not shown as per the requirement");
        }
    }

    public void verifyInProgressText() throws IOException {
        test2.log(LogStatus.INFO, "In-progress text to be displayed");
        try {
            WebElement intext = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(inprogresstext));
            String inText = intext.getText();
            if (inText.equals("null")) {
                test2.log(LogStatus.FAIL, "In progress text not shown as per the requirement : " + inText);
                getScreenshot("Inprogress_text");
            } else {
                test2.log(LogStatus.PASS, "In Progress text is : " + inText);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " Inprogress text not shown as per the requirement");
        }
    }

    public void verifyPendingStatusLogo() throws IOException {
        test2.log(LogStatus.INFO, "Pending logo to be displayed");
        try {
            WebElement pendlogo = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(pendinglogo));
            if (pendlogo.isDisplayed()) {
                test2.log(LogStatus.PASS, "Pending logo shown as per the requirement");
            } else {
                test2.log(LogStatus.FAIL, "Pending logo not shown as per the requirement");
                getScreenshot("pending_logo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " pending logo not shown as per the requirement");
        }
    }

    public void verifyPendingOrderCount() throws IOException {
        test2.log(LogStatus.INFO, "Pending order count to be displayed");
        try {
            WebElement pendcount = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(pendingordercount));
            String pendingCount = pendcount.getText();
            if (pendingCount.equals("null")) {
                test2.log(LogStatus.FAIL, "Pending order count  not shown as per the requirement : " + pendingCount);
                getScreenshot("pendingorder_count");
            } else {
                test2.log(LogStatus.PASS, "Pending order count is : " + pendingCount);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " Pending order count  not shown as per the requirement");
        }
    }

    public void verifyPendingOrderText() throws IOException {
        test2.log(LogStatus.INFO, "Pending text to be displayed");
        try {
            WebElement pendtext = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(pendingordertext));
            String pendingorderText = pendtext.getText();
            if (pendingorderText.equals("null")) {
                test2.log(LogStatus.FAIL, "Pending text  not shown as per the requirement : " + pendingorderText);
                getScreenshot("pendingorder_text");
            } else {
                test2.log(LogStatus.PASS, "Pending order text is : " + pendingorderText);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " Pending text not shown as per the requirement");
        }
    }

    public void verifyRejectedStatusLogo() throws IOException {
        test2.log(LogStatus.INFO, "Rejected logo to be displayed");
        try {
            WebElement rejectlogo = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(rejectedlogo));
            if(rejectlogo.isDisplayed()) {
                test2.log(LogStatus.PASS, "Rejected logo is shown as peer the requirement");
            } else {
                test2.log(LogStatus.FAIL, " Rejected logo not shown as per the requirement");
                getScreenshot("reject_logo");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " Rejected logo not shown as per the requirement");
            getScreenshot("reject_logo");
        }
    }

    public void verifyRejectedOrderCount() throws IOException {
        test2.log(LogStatus.INFO, "Rejected order count to be displayed");
        try {
            WebElement rejectcount = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(rejectedordercount));
            String rejected_count = rejectcount.getText();
            if (rejected_count.equals("null")) {
                test2.log(LogStatus.FAIL, "Rejected count not shown as per the requirement : " + rejected_count);
                getScreenshot("reject_count");
            } else {
                test2.log(LogStatus.PASS, "Rejected order count is : " + rejected_count);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " Rejected count not shown as per the requirement");
        }
    }

    public void verifyRejectedText() throws IOException {
        test2.log(LogStatus.INFO, "Rejected text to be displayed");
        try {
            WebElement reject = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(rejectedtext));
            String Rejected_text = reject.getText();
            if(Rejected_text.equals("null")) {
                test2.log(LogStatus.FAIL, "Rejected text not shown as per the requirement");
                getScreenshot("Rejected_text");
            } else {
                test2.log(LogStatus.PASS, "Rejected text is : " + Rejected_text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Rejected text not shown as per the requirement");
            getScreenshot("Rejected_text");
        }
    }

    public void verifyRecentOrderQueue() throws IOException {
        test2.log(LogStatus.INFO, "Recent Order Queue header text to be displayed");
        try {
            WebElement roq = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(recentorderqueue));
            String Recent_order_queue = roq.getText();
            if(Recent_order_queue.equals("null")) {
                test2.log(LogStatus.FAIL, "Recent Order Queue header text not shown as per the requirement");
                getScreenshot("Recentorderqueue");
            } else {
                test2.log(LogStatus.PASS, "Recent Order Queue header text is : " + Recent_order_queue);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Recent Order Queue header text not shown as per the requirement");
            getScreenshot("Recentorderqueue");
        }
    }

    public void verifyOrderNoHeader() throws IOException {
        test2.log(LogStatus.INFO, "Order No. header text to be displayed");
        try {
            WebElement ONheader = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(order_noheader));
            String order_number = ONheader.getText();
            if(order_number.equals("null")) {
                test2.log(LogStatus.FAIL, "Order No. header not shown as per the requirement");
                getScreenshot("Order_NO_header");
            } else {
                test2.log(LogStatus.PASS, "Order No is : " + order_number);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Order No. header not shown as per the requirement");
            getScreenshot("Order_NO_header");
        }
    }

    public void verifyPatientNameHeader() throws IOException {
        test2.log(LogStatus.INFO, "Patient name header text to be displayed");
        try {
            WebElement Pheader = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(patientnameheader));
            String Ptext = Pheader.getText();
            if(Ptext.equals("null")) {
                test2.log(LogStatus.FAIL, "Patient name header not shown as per the requirement");
                getScreenshot("patientname_header");
            } else {
                test2.log(LogStatus.PASS, " Patient name header shown as per the requirement : " + Ptext);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Patient name header not shown as per the requirement");
            getScreenshot("patientname_header");
        }
    }

    public void verifyAgeHeader() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Age header to be displayed");
        //Thread.sleep(5000);
        try {
            WebElement Aheader = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(ageheader));
            String Atext = Aheader.getText();
            if(Atext.equals("null")) {
                test2.log(LogStatus.FAIL, "Age header not shown as per the requirement");
                getScreenshot("Age_header");
            } else {
                test2.log(LogStatus.PASS, " Age header shown as per the requirement : " + Atext);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Age header not shown as per the requirement");
            getScreenshot("Age_header");
        }
    }

    public void verifySexHeader() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Sex header to be displayed");
        //Thread.sleep(5000);
        try {
            WebElement Sheader = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(sexheader));
            String Stext = Sheader.getText();
            if(Stext.equals("null")) {
                test2.log(LogStatus.FAIL, "Sex header not shown as per the requirement");
                getScreenshot("Sex_header");
            } else {
                test2.log(LogStatus.PASS, " Sex header shown as per the requirement : " + Stext);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Sex header not shown as per the requirement");
            getScreenshot("Sex_header");
        }
    }

    public void verifyPhoneNoHeader() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Phone no. header to be displayed");
        //Thread.sleep(5000);
        try {
            WebElement PHNheader = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(phonenoheader));
            String Ptext = PHNheader.getText();
            if(Ptext.equals("null")) {
                test2.log(LogStatus.FAIL, "Phone no. header not shown as per the requirement");
                getScreenshot("Phone_no.");
            } else {
                test2.log(LogStatus.PASS, " Phone no. header shown as per the requirement : " + Ptext);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Phone no. header not shown as per the requirement");
            getScreenshot("Phone_no.");
        }
    }

    public void verifyLocationHeader() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Location header to be displayed");
        //Thread.sleep(5000);
        try {
            WebElement Locheader = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(locationheader));
            String Ltext = Locheader.getText();
            if(Ltext.equals("null")) {
                test2.log(LogStatus.FAIL, "Location header not shown as per the requirement");
                getScreenshot("location header");
            } else {
                test2.log(LogStatus.PASS, "Location header shown as per the requirement : " + Ltext);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Location header not shown as per the requirement");
            getScreenshot("location header");
        }
    }

    public void verifyTestDetailsHeader() throws IOException {
        test2.log(LogStatus.INFO, "Test details header to be displayed");
        try {
            WebElement TDheader = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(testdetailsheader));
            String TDtext = TDheader.getText();
            if(TDtext.equals("null")) {
                test2.log(LogStatus.FAIL, "Test details header not shown as per the requirement");
                getScreenshot("Test details header");
            } else {
                test2.log(LogStatus.PASS, " Test details header shown as per the requirement : " + TDtext);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Test details header not shown as per the requirement");
            getScreenshot("Test details header");
        }
    }

    public void verifyFirstOrder() throws IOException {
        test2.log(LogStatus.INFO, "Ready to verify the First Order number1");
        try {
            WebElement O1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(order1));
            String O1text = O1.getText();
            if(O1text.equals("null")) {
                test2.log(LogStatus.FAIL, " Order_no1 is  not displayed");
                getScreenshot("order1 number");
            } else {
                test2.log(LogStatus.PASS, " Order_no1 is displayed : " + O1text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, " Order_no1 is  not displayed");
            getScreenshot("order1 number");
        }
    }

    public void verifyFirstOrderPatientProfileImage() throws IOException {
        test2.log(LogStatus.INFO, "Ready to verify  the first order Patient image1");
        try {
            WebElement PI = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(patientimage1));
            if(PI.isDisplayed()) {
                test2.log(LogStatus.PASS, "First order Patient image is displayed");
            } else {
                test2.log(LogStatus.FAIL, "First order Patient image is not dispalyed");
                getScreenshot("patientimage_1");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "First order Patient image is not dispalyed");
            getScreenshot("patientimage_1");
        }
    }

    public void verifyFirstOrderAddOnMemberCount() throws IOException {
        test2.log(LogStatus.INFO, "Ready to verify the Add_on_member count for the first order");
        try {
            WebElement AMC = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(addonmembercount1));
            String AMCtext = AMC.getText();
            if(AMCtext.equals("null")) {
                test2.log(LogStatus.SKIP, "Add_on_member count for the first order is not displayed");
                getScreenshot("addonmembercount_1");
            } else {
                test2.log(LogStatus.PASS, " Add_on_member count for the first order is displayed");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.SKIP, "Add_on_member count for the first order is not displayed");
            getScreenshot("addonmembercount_1");
        }
    }

    public void verifyFirstOrderPatientName() throws IOException {
        test2.log(LogStatus.INFO, "Ready to verify the first order Patient name1");
        try {
            WebElement patientnme = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(patientname1));
            String PN1text = patientnme.getText();
            if(PN1text.equals("null")) {
                test2.log(LogStatus.FAIL, "First order Patient name1 is not displayed");
                getScreenshot("patientname_1");
            } else {
                test2.log(LogStatus.PASS, "First order Patient name1 is displayed: " + PN1text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "First order Patient name1 is not displayed");
            getScreenshot("patientname_1");
        }
    }

    public void verifyFirstOrderPatientAge() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Ready to verify the first order patient Age1");
        //Thread.sleep(5000);
        try {
            WebElement age_1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(age1));
            String A1text = age_1.getText();
            if(A1text.equals("null")) {
                test2.log(LogStatus.FAIL, "First order patient Age1 is not displayed");
                getScreenshot("Age_1");
            } else {
                test2.log(LogStatus.PASS, "First order patient Age1 is displayed: " + A1text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "First order patient Age1 is not displayed");
            getScreenshot("Age_1");
        }
    }

    public void verifyFirstOrderPatientSex() throws IOException {
        test2.log(LogStatus.INFO, "Ready to verify the first order patient Gender1");
        try {
            WebElement Sex_1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(sex1));
            String S1text = Sex_1.getText();
            if(S1text.equals("null")) {
                test2.log(LogStatus.FAIL, "First order patient Gender1 is not displayed");
                getScreenshot("Sex_1");
            } else {
                test2.log(LogStatus.PASS, "First order patient Gender1 is displayed: " + S1text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "First order patient Gender1 is not displayed");
            getScreenshot("Sex_1");
        }
    }

    public void verifyFirstOrderPatientPhoneNo() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Ready to verify the first order patient Phone number1");
        //Thread.sleep(5000);
        try {
            WebElement phoneno_1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(phoneno1));
            String PN1text = phoneno_1.getText();
            if(PN1text.equals("null")) {
                test2.log(LogStatus.FAIL, "First order patient Phone number1 is not displayed");
                getScreenshot("phoneno_1");
            } else {
                test2.log(LogStatus.PASS, "First order patient Phone number1 is displayed : " + PN1text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "First order patient Phone number1 is not displayed");
            getScreenshot("phoneno_1");
        }
    }

    public void verifyFirstOrderPatientLocation() throws IOException {
        test2.log(LogStatus.INFO, "Ready to verify the first order patient Location1");
        try {
            WebElement location_1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(location1));
            String L1text = location_1.getText();
            if(L1text.equals("null")) {
                test2.log(LogStatus.FAIL, "First order patient Location1 is not displayed ");
                getScreenshot("location_1");
            } else {
                test2.log(LogStatus.PASS, "First order patient Location1 is displayed : " + L1text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "First order patient Location1 is not displayed ");
            getScreenshot("location_1");
        }
    }

    public void verifyFirstOrderPatientTestType() throws IOException {
        test2.log(LogStatus.INFO, "Ready to verify the first order Test type");
        try {
            WebElement TestOrderlistpageTestType = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(testtype1));
            String h = TestOrderlistpageTestType.getAttribute("src");
            if(h.contains("home")) {
                test2.log(LogStatus.PASS, "It's a Home Test");
            } else if(h.contains("self")){
                test2.log(LogStatus.PASS, "It's a Self Test");
            } else {
                test2.log(LogStatus.FAIL, "Test type not visible");
                getScreenshot("testtype_1");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Test type not visible");
            getScreenshot("testtype_1");
        }
    }

    public void verifyFirstOrderPatientTestName() throws IOException {
        test2.log(LogStatus.INFO, "Ready to verify the first order Test name");
        try {
            WebElement testname = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(testname1));
            String TN1text = testname.getText();
            if(TN1text.equals("null")) {
                test2.log(LogStatus.FAIL, "First order Test name is not displayed");
                getScreenshot("Testname1");
            } else {
                test2.log(LogStatus.PASS, "First order Test name is displayed: " + TN1text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "First order Test name is not displayed");
            getScreenshot("Testname1");
        }
    }

//    public void setOrder2() throws IOException, InterruptedException {
//        try {
//            test2.log(LogStatus.INFO, "Ready to verify the Second order number");
//            WebElement order = new WebDriverWait(driver, 1)
//                    .until(driver -> driver.findElement(order2));
//            String O2 = order.getText();
//            test2.log(LogStatus.PASS, "Order_no2 is displayed  : " + O2);
//        } catch (NoSuchElementException | TimeoutException e) {
//            test2.log(LogStatus.FAIL, "Order_no2 is not displayed");
//            getScreenshot("order2");
//        }
//    }
//
//    public void setPatientimage2() throws IOException, InterruptedException {
//        try {
//            test2.log(LogStatus.INFO, "Ready to verify  the Second order Patient image2");
//            WebElement image = new WebDriverWait(driver, 10)
//                    .until(driver -> driver.findElement(Patientimage2));
//            test2.log(LogStatus.PASS, "Second order Patient image is displayed");
//        } catch (NoSuchElementException | TimeoutException e) {
//            test2.log(LogStatus.FAIL, "Second order Patient image is not displayed");
//            getScreenshot("Patientimage_2");
//        }
//    }
//
//    public void setPatientname2() throws IOException, InterruptedException {
//
//        try {
//            test2.log(LogStatus.INFO, "Ready to verify the Second test order Patient name2");
//            WebElement name = new WebDriverWait(driver, 1)
//                    .until(driver -> driver.findElement(patientname2));
//            String PN2 = name.getText();
//            //System.out.println(PN2);
//            test2.log(LogStatus.PASS, "Second test order Patient name2 is displayed: " + PN2);
//        } catch (NoSuchElementException | TimeoutException e) {
//            test2.log(LogStatus.FAIL, "Second test order Patient name2 is not displayed");
//            getScreenshot("patientname2");
//        }
//    }
//
//    public void setAge2() throws IOException, InterruptedException {
//        try {
//            test2.log(LogStatus.INFO, "Ready to Verify the Second test ordered Age2");
//            WebElement age = new WebDriverWait(driver, 1)
//                    .until(driver -> driver.findElement(age2));
//            String A2text = age.getText();
//            //System.out.println(A2text);
//            test2.log(LogStatus.PASS, "Second test ordered Age2 is displayed: " + A2text);
//        } catch (NoSuchElementException | TimeoutException e) {
//            test2.log(LogStatus.FAIL, "Second test ordered Age2 is not displayed");
//            getScreenshot("Age_2");
//        }
//    }
//
//    public void setSex2() throws IOException, InterruptedException {
//
//        try {
//            test2.log(LogStatus.INFO, "Ready to Verify the Second test ordered Gender2");
//            WebElement sex = new WebDriverWait(driver, 1)
//                    .until(driver -> driver.findElement(age2));
//            String S2text = sex.getText();
//            //System.out.println(S2text);
//            test2.log(LogStatus.PASS, "Second test ordered Gender2 is displayed: " + S2text);
//        } catch (NoSuchElementException | TimeoutException e) {
//            test2.log(LogStatus.FAIL, "Second test ordered Gender2 is not displayed");
//            getScreenshot("Sex_2");
//        }
//    }
//
//    public void setPhoneno2() throws IOException, InterruptedException {
//
//        try {
//            test2.log(LogStatus.INFO, "Ready to Verify the Second test ordered Phone_number2");
//            WebElement phoneno = new WebDriverWait(driver, 1)
//                    .until(driver -> driver.findElement(phoneno2));
//            String PHN2text = phoneno.getText();
//            //System.out.println(PHN2text);
//            test2.log(LogStatus.PASS, " Second test ordered Phone_number2 is displayed: " + PHN2text);
//        } catch (NoSuchElementException | TimeoutException e) {
//            test2.log(LogStatus.FAIL, "Second test ordered Phone_number2 is  not displayed");
//            getScreenshot("phoneno_2");
//        }
//    }
//
//    public void setLocation2() throws IOException, InterruptedException {
//
//        try {
//            test2.log(LogStatus.INFO, "Ready to Verify the Second test ordered Location2");
//            WebElement location = new WebDriverWait(driver, 1)
//                    .until(driver -> driver.findElement(location2));
//            String loc2text = location.getText();
//            //System.out.println(loc2text);
//            test2.log(LogStatus.PASS, "Second test ordered Location2 is displayed : " + loc2text);
//        } catch (NoSuchElementException | TimeoutException e) {
//            test2.log(LogStatus.FAIL, "Second test ordered Location2 is  not displayed");
//            getScreenshot("location_2");
//        }
//    }
//
//    public void setTesttype2() throws InterruptedException, IOException {
//        try {
//            test2.log(LogStatus.INFO, "Ready to Verify the Second ordered test type2");
//            WebElement TestOrderlistpageTestType = new WebDriverWait(driver, 1)
//                    .until(driver -> driver.findElement(testtype2));
//            TestOrderlistpageTestType.getAttribute("src");
//            //driver.findElement(readTestOrderlistpageTestType);
//            test2.log(LogStatus.PASS, "It's a Home Test");
//        } catch (NoSuchElementException | TimeoutException e) {
//            test2.log(LogStatus.WARNING, "It's a Self Test");
//            getScreenshot("testtype_2");
//        }
//    }

    public void verifyItemsPerPageText() throws InterruptedException, java.io.IOException {
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,600)");
        try {
            WebElement items = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(itemsperpagetext));
            String IPPtext = items.getText();
            if(IPPtext.equals("null")) {
                test2.log(LogStatus.FAIL, "Items per page text  not shown as per the requirement");
                getScreenshot("itemsperpage_text");
            } else {
                test2.log(LogStatus.PASS, " Items per page text shown as per the requirement : " + IPPtext);
            }
        } catch (NoSuchElementException e) {
            test2.log(LogStatus.FAIL, "Items per page text  not shown as per the requirement");
            getScreenshot("itemsperpage_text");
        }
    }

    public void clickPageDropdown() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Ready to Click Pagination Arrow");
        try {
            Thread.sleep(1000);
            WebElement PG = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(itemsperpage));
            PG.click();
            test2.log(LogStatus.PASS, "Pagination Arrow is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Pagination Arrow is not Clicked");
            getScreenshot("PaginationArrow");
        }
    }

   /* public void setDropdown() throws IOException, InterruptedException {
        WebElement itemsDP = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(dropdown));
        String DPP = itemsDP.getText();
        System.out.println(dropdown);
        try {
            driver.findElement(dropdown).click();
            test2.log(LogStatus.PASS, "dropdown shown as per the requirement :" +DPP);
        } catch (NoSuchElementException e) {
            test2.log(LogStatus.FAIL, "dropdown  not shown as per the requirement : " +DPP);
            getScreenshot("drop_down");
        }
    }*/

    public void setTenItemsPerPage() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Ready to Click Items per page 10");
        try {
            Thread.sleep(2000);
            WebElement Itemspage_select = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(itemspageselect_10));
            Itemspage_select.click();
            test2.log(LogStatus.PASS, "Items per page 10 is visible");
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Items per page 10 is not visible");
            getScreenshot("itemsperpage_select_10");
        }
    }

    public void setTwentyItemsPerPage() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Ready to Click Items per page 20");
        try {
            clickPageDropdown();
            Thread.sleep(2000);
            WebElement Itemspage_select = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(itemspageselect_20));
            Itemspage_select.click();
            test2.log(LogStatus.PASS, "Items per page 20 is visible");
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Items per page 20 is not visible");
            getScreenshot("itemsperpage_select_20");
        }
    }

    public void verifyPageNumberText() throws java.io.IOException {
        try {
            WebElement itemsPNtext = new WebDriverWait(driver, 1)
                .until(driver -> driver.findElement(pagenumbertext));
            String PNtext = itemsPNtext.getText();
            if(PNtext.equals("null")) {
                test2.log(LogStatus.FAIL, "Page number text  not shown as per the requirement :" + PNtext);
                getScreenshot("pagenumber_text");
            } else {
                test2.log(LogStatus.PASS, " Page number text shown as per the requirement : " + PNtext);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Page number text  not shown as per the requirement :");
            getScreenshot("pagenumber_text");
        }
    }

    public void setFiveItemsPerPage() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Ready to Click Items page select 5");
        try {
            clickPageDropdown();
            Thread.sleep(2000);
            WebElement Itemspage_select = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(itemspageselect_5));
            Itemspage_select.click();
            test2.log(LogStatus.PASS, "Items per page 5 is clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Items per page 5 is not clicked");
            getScreenshot("itemsperpage_select_5");
        }
    }

    public void verifyPaginationIcon() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Ready to Click pagination_icon");
        try {
            Thread.sleep(2000);
            WebElement paginationicon = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(pagination_icon));
            paginationicon.click();
            test2.log(LogStatus.PASS, "Pagination_icon clicked ");
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Pagination_icon is not clicked");
            getScreenshot("paginationicon");
        }
    }

    public void verifyPaginationPreviousIcon() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Ready to Click Pagination previous_icon");
        try {
            Thread.sleep(2000);
            WebElement Paginationpreviousicon = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(paginationprevious_icon));
            Paginationpreviousicon.click();
            test2.log(LogStatus.PASS, "Pagination previous_icon is clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Pagination previous_icon is not clicked");
            getScreenshot("pagination previous_icon");
        }
    }

    public void verifyPaginationBackIcon() throws IOException, InterruptedException {
        test2.log(LogStatus.INFO, "Ready to Click pagination back_icon");
        try {
            Thread.sleep(2000);
            WebElement Paginationbackicon = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Paginationback_icon));
            Paginationbackicon.click();
            test2.log(LogStatus.PASS, "Pagination back_icon is clicked ");
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "pagination back_icon is not clicked");
            getScreenshot("pagination back_icon");
        }
    }

    public void clickOrderRequestTab() throws InterruptedException, IOException {
        test2.log(LogStatus.INFO, "Ready to Click Order Request");
        try {
            Thread.sleep(8000);
            WebElement OrderRequesttab = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickOrderRequestTab));
            OrderRequesttab.click();
            test2.log(LogStatus.PASS, "Order Request is Clicked");
            String url = driver.getCurrentUrl();
            if(url.contains("order-request")) {
                test2.log(LogStatus.PASS, "It's redirects to Order Request Page");
            } else {
                test2.log(LogStatus.FAIL, "It's not redirects to Order Request Page");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Order Request is not Clicked");
            getScreenshot("Order Request-Tab");
        }
    }

    public void clickTestOrderTab() throws InterruptedException, IOException {
        test2.log(LogStatus.INFO, "Ready to Click test order");
        try {
            Thread.sleep(8000);
            WebElement testordertab = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(testorder));
            testordertab.click();
            test2.log(LogStatus.PASS, "Test order is Clicked");
            String url = driver.getCurrentUrl();
            if(url.contains("test-order")) {
                test2.log(LogStatus.PASS, "It's redirects to Test Order Page");
            } else {
                test2.log(LogStatus.FAIL, "It's not redirects to Test Order Page");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Test order is not Clicked");
            getScreenshot("Testorder-Tab");
        }
    }

    public void clickLabTestDashboardTab() throws InterruptedException, IOException {
        test2.log(LogStatus.INFO, "Ready to Click Lab Test Dashboard");
        try {
            Thread.sleep(8000);
            WebElement labtest_dashboard = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(labtestdashboard));
            labtest_dashboard.click();
            test2.log(LogStatus.PASS, "Lab Test Dashboard is Clicked");
            Thread.sleep(2000);
            String url = driver.getCurrentUrl();
            if(url.contains("dashboard")) {
                test2.log(LogStatus.PASS, "It's redirects to Dashboard Page");
            } else {
                test2.log(LogStatus.FAIL, "It's not redirects to Dashboard Page");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test2.log(LogStatus.FAIL, "Lab Test Dashboard is not Clicked");
            getScreenshot("Lab_test_dashboard-Tab");
        }
    }

}






