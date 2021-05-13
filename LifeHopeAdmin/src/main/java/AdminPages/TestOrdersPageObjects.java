package AdminPages;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static AdminPages.AdminTestBase.*;

public class TestOrdersPageObjects {

    private final WebDriver driver;

    By testorder = By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/app-left-menu[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]");
    By Filter_opt = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]/div");
    By approve_btn = By.xpath("//div[2]/div[2]/div/div/div/mat-option[2]/span");
    By Inprogress_btn = By.xpath("//div[2]/div[2]/div/div/div/mat-option[3]/span");
    By Completed_btn = By.xpath("//div[2]/div[2]/div/div/div/mat-option[4]/span");
    By Declined_btn = By.xpath("//div[2]/div[2]/div/div/div/mat-option[5]/span");
    By Refunded_btn = By.xpath("//div[2]/div[2]/div/div/div/mat-option[6]/span");
    By Rejected_btn = By.xpath("//div[2]/div[2]/div/div/div/mat-option[7]/span");
    By All_btn = By.xpath("//div[2]/div[2]/div/div/div/mat-option[1]/span");
    By Search_opt = By.xpath("//div/div/div/div[1]/div/div[3]/form/div/input");
    //By search_option = By.xpath("//div/div/div/div[1]/div/div[3]/form/div/input");
    By orderrequestorderid = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]");
    By orderrequestPatientName = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/span");
    By orderrequestPatientProfileImage = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/img[@src='https://dev-lifehope.s3.us-west-1.amazonaws.com/ProfilePic/1d5dc1cf-fbe7-4203-806d-2cb0c6be5493/1d5dc1cf-fbe7-4203-806d-2cb0c6be5493_1612184073.jpg");////table/tbody/tr[1]/td[2]/div/img[@src='https://dev-lifehope.s3.us-west-1.amazonaws.com/ProfilePic/1fc3c3db-e8d4-4011-9c48-e654d207df99/1fc3c3db-e8d4-4011-9c48-e654d207df99_1612157823.jpg']");
    By orderrequestPatientPhone = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[3]");
    By orderrequestTestDetails = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]");
    By orderrequestorderstatus = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[5]/span");
    By orderrequestTestamount = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[6]");
    By orderrequestTestType = By.xpath("//div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]/img[@src='../../assets/img/home test icon.png']");
    By clickPaginationDownArrow = By.xpath("//div/div/div/div[2]/div[2]/mat-paginator/div/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[2]/div");
    By clickPagination10 = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span");
    By clickPagination20 = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");
    By clickPagination30 = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");
    By readDisplayedCount = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[2]/mat-paginator/div/div/div[1]/mat-form-field/div/div[1]/div");
    By readTotalItems = By.xpath("//*[@id=\"content\"]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[2]/mat-paginator/div/div/div[2]/div");
    By clickFirstPage = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[2]/mat-paginator/div/div/div[2]/button[1][@disabled='true']");
    By clickPreviousPage = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[2]/mat-paginator/div/div/div[2]/button[2][@disabled='true']");
    By clickNextPage = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[2]/mat-paginator/div/div/div[2]/button[3][@disabled='true']");
    By clickLastPage = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-status-list/div/app-life-hope-table/div/div/div/div[2]/div[2]/mat-paginator/div/div/div[2]/button[4]/span[2][@disabled='true']");

    public TestOrdersPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void setTestOrder() throws InterruptedException, IOException {
        try {
            Thread.sleep(15000);
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-200)");
            test5.log(LogStatus.INFO, "Ready to Click test order");
            WebElement testordertab = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(testorder));
            testordertab.click();
            test5.log(LogStatus.PASS, "Test order is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Test order is not Clicked");
            getScreenshot("Testorder-Tab");
        }
    }

    public void ClickFilter2() throws InterruptedException, IOException {
        Thread.sleep(15000);
        try {
            test5.log(LogStatus.INFO, "Ready to Click filter option");
            WebElement Filteroption = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(Filter_opt));
            Filteroption.click();
            test5.log(LogStatus.PASS, "Filter option is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Filter option is not Clicked");
            getScreenshot("Filter option");
        }
    }

    public void ClickApproveOption() throws IOException, InterruptedException, NoSuchElementException, TimeoutException {
        try {
            //Thread.sleep(5000);
            test5.log(LogStatus.INFO, "Ready to Click Approve option");
            WebElement Approveopt = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(approve_btn));
            Approveopt.click();
            Thread.sleep(1000);
            WebElement orderST = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test5.log(LogStatus.WARNING, "Approve Status is not displayed");
                getScreenshot("Approve");
            } else {
                test5.log(LogStatus.PASS, "Approve Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "Approve Status is not displayed");
            getScreenshot("Approve");
        }
    }

    public void ClickInProgressOption() throws IOException, InterruptedException, NoSuchElementException, TimeoutException {
        try {
            //Thread.sleep(5000);
            test5.log(LogStatus.INFO, "Ready to Click Inprogress option");
            WebElement Approveopt = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(Inprogress_btn));
            Approveopt.click();
            Thread.sleep(1000);
            WebElement orderST = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test5.log(LogStatus.WARNING, "Inprogress Status is not displayed");
                getScreenshot("Inprogress");
            } else {
                test5.log(LogStatus.PASS, "Inprogress Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "Inprogress Status is not displayed");
            getScreenshot("Inprogress");
        }
    }

    public void ClickCompletedOption() throws IOException, InterruptedException, NoSuchElementException, TimeoutException {
        try {
            //Thread.sleep(5000);
            test5.log(LogStatus.INFO, "Ready to Click Completed option");
            WebElement Approveopt = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(Completed_btn));
            Approveopt.click();
            Thread.sleep(1000);
            WebElement orderST = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test5.log(LogStatus.WARNING, "Completed Status is not displayed");
                getScreenshot("Completed");
            } else {
                test5.log(LogStatus.PASS, "Completed Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "Completed Status is not displayed");
            getScreenshot("Completed");
        }
    }

    public void ClickDeclineOption() throws IOException, InterruptedException, NoSuchElementException, TimeoutException {
        try {
            //Thread.sleep(5000);
            test5.log(LogStatus.INFO, "Ready to Click Decline option");
            WebElement Approveopt = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(Declined_btn));
            Approveopt.click();
            Thread.sleep(1000);
            WebElement orderST = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test5.log(LogStatus.WARNING, "Decline Status is not displayed");
                getScreenshot("Decline");
            } else {
                test5.log(LogStatus.PASS, "Decline Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "Decline Status is not displayed");
            getScreenshot("Decline");
        }
    }

    public void ClickRefundedOption() throws IOException, InterruptedException, NoSuchElementException, TimeoutException {
        try {
            //Thread.sleep(5000);
            test5.log(LogStatus.INFO, "Ready to Click Refunded option");
            WebElement Approveopt = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(Refunded_btn));
            Approveopt.click();
            Thread.sleep(1000);
            WebElement orderST = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test5.log(LogStatus.WARNING, "Refunded Status is not displayed");
                getScreenshot("Refunded");
            } else {
                test5.log(LogStatus.PASS, "Refunded Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "Refunded Status is not displayed");
            getScreenshot("Refunded");
        }
    }

    public void ClickRejectedOption() throws IOException, InterruptedException, NoSuchElementException, TimeoutException {
        try {
            Thread.sleep(5000);
            test5.log(LogStatus.INFO, "Ready to Click Rejected option");
            WebElement Approveopt = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(Rejected_btn));
            Approveopt.click();
            Thread.sleep(1000);
            WebElement orderST = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test5.log(LogStatus.WARNING, "Rejected Status is not displayed");
                getScreenshot("Rejected");
            } else {
                test5.log(LogStatus.PASS, "Rejected Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "Rejected Status is not displayed");
            getScreenshot("Rejected");
        }
    }
    public void ClickAllOpt() throws IOException, InterruptedException, NoSuchElementException, TimeoutException {
        try {
            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-200)");
            Thread.sleep(1000);
            test5.log(LogStatus.INFO, "Ready to Click all option");
            WebElement Allopt = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(All_btn));
            Allopt.click();
            Thread.sleep(1000);
            WebElement orderST = new WebDriverWait(driver, 30)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test5.log(LogStatus.WARNING, "All Status is not displayed");
                getScreenshot("All");
            } else {
                test5.log(LogStatus.PASS, "All Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
           test5.log(LogStatus.WARNING, "All Status is not displayed");
            getScreenshot("All");
        }
    }

    public void UserDetails() throws IOException {
        try {
            test5.log(LogStatus.INFO, "TestOrderlistpage-Order Number:");
            WebElement OrderID = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestorderid));
            String Text = OrderID.getText();
            if (Text.contains("null")) {
                test5.log(LogStatus.FAIL, "Order ID was not visible" + Text);
            } else {
                test5.log(LogStatus.PASS, "Order ID is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Order No");
        }
        //Reading Patient Name
        try {
            test5.log(LogStatus.INFO, "TestOrderlistpage-Patient Name:");
            WebElement PatientName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestPatientName));
            String Text = PatientName.getText();
            if (Text.contains("null")) {
                test5.log(LogStatus.FAIL, "Patient name was not visible" + Text);
            } else {
                test5.log(LogStatus.PASS, "Patient name is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Patient Name");
        }
        //Reading  Patient Profile Image
        try {
            test5.log(LogStatus.INFO, "TestOrderlistpage-Patient Profile Image");
            WebElement ProfileImage = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestPatientProfileImage));
            String Text = ProfileImage.getAttribute("src");
            if (Text.contains(".jpg") || Text.contains(".jpeg")) {
                test5.log(LogStatus.PASS, "Profile Image visible");
            } else {
                test5.log(LogStatus.WARNING, "Profile Image not visible");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.PASS, "Patient Profile Iamge is Displayed");
            getScreenshot("Patient Profile Image");
        }
        //Reading Patient Phone
        try {
            test5.log(LogStatus.INFO, "TestOrderlistpage-Patient Phone Number:");
            WebElement PatientPhone = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestPatientPhone));
            String Text = PatientPhone.getText();
            if (Text.contains("null")) {
                test5.log(LogStatus.FAIL, "Patient Phone number was not visible" + Text);
            } else {
                test5.log(LogStatus.PASS, "Patient Phone number is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Patient Phone");
        }
        //Reading test amount
        try {
            test5.log(LogStatus.INFO, "Test Amount:");
            WebElement Testamount = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestTestamount));
            String Text = Testamount.getText();
            if (Text.contains("null")) {
                test5.log(LogStatus.FAIL, "Test Amount was not visible" + Text);
            } else {
                test5.log(LogStatus.PASS, "Test Amount is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("Test amount");
        }
        //Reading TestOrderlistpage Test Order Type
        try {
            test5.log(LogStatus.INFO, "TestOrderlistpage-Test Order Type:");
            WebElement TestOrderlistpageTestType = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestTestType));
            String Text = TestOrderlistpageTestType.getAttribute("src");
            if (Text.contains("home")) {
                test5.log(LogStatus.PASS, "It's a Home Test");
            } else {
                test5.log(LogStatus.PASS, "It's a Self Test");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.WARNING, "It's a Self Test");
            getScreenshot("TestOrderlistpage-Test Order Type");
        }
        //Reading TestOrderlistpage Test Details
        try {
            test5.log(LogStatus.INFO, "TestOrderlistpage-Test Details:");
            WebElement TestDetails = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(orderrequestTestDetails));
            String Text = TestDetails.getText();
            if (Text.contains("null")) {
                test5.log(LogStatus.FAIL, "Test Details are not visible" + Text);
            } else {
                test5.log(LogStatus.PASS, "Test Details are : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "No Order is Placed");
            getScreenshot("TestOrderlistpage-Test Details");
        }
        try {
            test5.log(LogStatus.INFO, "Ready to Verify the Test Status");
            WebElement orderST = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(orderrequestorderstatus));
            String ordStatus = orderST.getText();
            if (ordStatus == null) {
                test5.log(LogStatus.FAIL, "Test Status is not displayed");
                getScreenshot("RO_TStatus");
            } else {
                test5.log(LogStatus.PASS, "Test Status is displayed : " + ordStatus);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Test Status is not displayed");
            getScreenshot("RO_TStatus");
        }
    }

    public void setSearchBy(String Search) throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test5.log(LogStatus.INFO, "Searching Input:");
            WebElement SetSR = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(Search_opt));
            SetSR.clear();
            Thread.sleep(1000);
            SetSR.sendKeys(Search);
            Thread.sleep(2000);
            test5.log(LogStatus.PASS, Search);
            test5.log(LogStatus.INFO, "Displaying Searched Order Details:");
            String OrderID = driver.findElement(orderrequestorderid).getText();
            if (OrderID.contains("null")) {
                test5.log(LogStatus.FAIL, "Order ID not visible");
            } else {
                test5.log(LogStatus.PASS, "Order ID is" + OrderID);
            }
            String Name = driver.findElement(orderrequestPatientName).getText();
            if (Name.contains("null")) {
                test5.log(LogStatus.FAIL, "Patient name not visible");
            } else {
                test5.log(LogStatus.PASS, "Patient name is" + Name);
            }
            String Phone = driver.findElement(orderrequestPatientPhone).getText();
            if (Phone.contains("null")) {
                test5.log(LogStatus.FAIL, "Patient Phone number not visible");
            } else {
                test5.log(LogStatus.PASS, "Patient Phone is" + Phone);
            }
            String Testdetails = driver.findElement(orderrequestTestDetails).getText();
            if (Testdetails.contains("null")) {
                test5.log(LogStatus.FAIL, "Test Details are not visible");
            } else {
                test5.log(LogStatus.PASS, "Test Details is " + Testdetails);
            }
            String Orderstatus = driver.findElement(orderrequestorderstatus).getText();
            if (Orderstatus.contains("null")) {
                test5.log(LogStatus.FAIL, "Order Status not visible");
            } else {
                test5.log(LogStatus.PASS, "Order Status is" + Orderstatus);
            }
            String Testamount = driver.findElement(orderrequestTestamount).getText();
            if (Testamount.contains("null")) {
                test5.log(LogStatus.FAIL, "Test amount not visible");
            } else {
                test5.log(LogStatus.PASS, "Test amount is" + Testamount);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "No Such Item");
            getScreenshot("Search");
        }
    }

    //Clearing Search Box
    public void clearSearchBox() throws InterruptedException {
        try {
            test5.log(LogStatus.INFO, "Clearing Input:");
            WebElement SetSR = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(Search_opt));
            SetSR.clear();
            Thread.sleep(2000);
            driver.navigate().refresh();
            test5.log(LogStatus.PASS, "Input Cleared");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Input Not Cleared");
        }
    }

    //Clicking Pagination-Down Arrow
    public void clickPaginationDownArrow() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test5.log(LogStatus.INFO, "Clicking Paginagtion Arrow");
            WebElement PG = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPaginationDownArrow));
            PG.click();
            test5.log(LogStatus.PASS, "Paginagtion Arrow is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Paginagtion Arrow is not Clicked");
            getScreenshot("PaginationArrow");
        }
    }

    //Clicking Pagination10
    public void clickPagination10() throws IOException {
        try {
            test5.log(LogStatus.INFO, "Selecting Items Count 10");
            WebElement PG10 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPagination10));
            PG10.click();
            test5.log(LogStatus.PASS, "Items count Per Page is Selected");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Items Count Per Page is not Selected");
            getScreenshot("Items Per Page-Select");
        }
    }

    //Clicking Pagination20
    public void clickPagination20() throws IOException {
        try {
            test5.log(LogStatus.INFO, "Selecting Items Count 20");
            WebElement PG10 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPagination20));
            PG10.click();
            test5.log(LogStatus.PASS, "Items count Per Page is Selected");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Items Count Per Page is not Selected");
            getScreenshot("Items Per Page-Select");
        }
    }

    //Clicking Pagination 30
    public void clickPagination30() throws IOException {
        try {
            test5.log(LogStatus.INFO, "Selecting Items Count 30");
            WebElement PG10 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPagination30));
            PG10.click();
            test5.log(LogStatus.PASS, "Items count Per Page is Selected");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Items Count Per Page is not Selected");
            getScreenshot("Items Per Page-Select");
        }
    }

    //Reading Items Per Page
    public void readItemsPerPage() throws IOException {
        try {
            test5.log(LogStatus.INFO, "Items Per Page:");
            WebElement Items = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readDisplayedCount));
            String Text = Items.getText();
            test5.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Items Count Per Page is not Displayed");
            getScreenshot("Items Per Page-Select");
        }
    }

    //Reading Total Items
    public void readTotalItems() throws IOException {
        try {
            test5.log(LogStatus.INFO, "Total Items:");
            WebElement Total = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readTotalItems));
            String Text = Total.getText();
            test5.log(LogStatus.PASS, Text);
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.FAIL, "Total Items are not Displayed");
            getScreenshot("Total Items");
        }
    }

    //Clicking First Page
    public void clickFirstPage() throws IOException {
        String Text = driver.findElement(readTotalItems).getText();
        try {
            test5.log(LogStatus.INFO, "Clicking FirstPage:");
            WebElement FP = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickFirstPage));
            FP.click();
            test5.log(LogStatus.WARNING, "We are already in the First Page");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.PASS, "Page:" + Text);
            getScreenshot("Pagination-First Page");
        }
    }

    //Clicking Previous Page
    public void clickPreviousPage() throws IOException {
        String Text = driver.findElement(readTotalItems).getText();
        try {
            test5.log(LogStatus.INFO, "Clicking Previous Page:");
            WebElement PP = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPreviousPage));
            PP.click();
            test5.log(LogStatus.WARNING, "We are already in the First Page");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.PASS, "Page: " + Text);
            getScreenshot("Pagination-Previous Page");
        }
    }

    //Clicking Next Page
    public void clickNextPage() throws IOException {
        String Text = driver.findElement(readTotalItems).getText();
        try {
            test5.log(LogStatus.INFO, "Clicking Next Page:");
            WebElement NP = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickNextPage));
            NP.click();
            test5.log(LogStatus.WARNING, "Only One Page is Available");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.PASS, "Page: " + Text);
            getScreenshot("Pagination-Next Page");
        }
    }
    //Clicking Last Page
    public void clickLastPage() throws IOException {
        String Text = driver.findElement(readTotalItems).getText();
        try {
            test5.log(LogStatus.INFO, "Clicking Next Page:");
            WebElement LP = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickLastPage));
            LP.click();
            driver.navigate().refresh();
            test5.log(LogStatus.WARNING, "We Have Already Reached Last Page");
        } catch (NoSuchElementException | TimeoutException e) {
            test5.log(LogStatus.PASS, "Page: " + Text);
            getScreenshot("Pagination-Last Page");
        }
    }

}
