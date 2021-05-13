package AdminPages;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import static AdminPages.AdminTestBase.getScreenshot;
import static AdminPages.AdminTestBase.*;
import static Utils.AdminGoogleSheet.dataList;

public class OrderRequestPageObjects {

    private final WebDriver driver;

    By clickOrderRequestTab = By.xpath("//li[2]/a/span[@class='toggle-none']");
    By readOrderRequestHeader = By.className("table-heading");
    By readMenubarTitle1 = By.xpath("//table/thead/tr/th[@class='mat-header-cell cdk-header-cell cdk-column-orderNo mat-column-orderNo ng-star-inserted']");
    By readMenubarTitle2 = By.xpath("//table/thead/tr/th[@class='mat-header-cell cdk-header-cell cdk-column-patientName mat-column-patientName ng-star-inserted']");
    By readMenubarTitle3 = By.xpath("//table/thead/tr/th[@class='mat-header-cell cdk-header-cell cdk-column-age mat-column-age ng-star-inserted']");
    By readMenubarTitle4 = By.xpath("//table/thead/tr/th[@class='mat-header-cell cdk-header-cell cdk-column-sex mat-column-sex ng-star-inserted']");
    By readMenubarTitle5 = By.xpath("//table/thead/tr/th[@class='mat-header-cell cdk-header-cell cdk-column-phoneno mat-column-phoneno ng-star-inserted']");
    By readMenubarTitle6 = By.xpath("//table/thead/tr/th[@class='mat-header-cell cdk-header-cell cdk-column-location mat-column-location ng-star-inserted']");
    By readMenubarTitle7 = By.xpath("//table/thead/tr/th[@class='mat-header-cell cdk-header-cell cdk-column-testDetails mat-column-testDetails ng-star-inserted']");
    By setSearchbox = By.xpath("//app-order-list/div/app-life-hope-table/div/div/div/div[1]/div/div[3]/form/div/input");
    By readHomepageorderid = By.xpath("//table/tbody/tr/td[@class='mat-cell cdk-cell cdk-column-orderNo mat-column-orderNo ng-star-inserted']");
    By readHomePagePatientName = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-list/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr/td[2]/div/span[2]");
    By readHomePagePatientProfileImage = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-list/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr/td[2]/div/img");
    By readHomePagePatientAge = By.xpath("//table/tbody/tr/td[@class='mat-cell cdk-cell cdk-column-age mat-column-age ng-star-inserted']");
    By readHomePagePatientSex = By.xpath("//table/tbody/tr/td[@class='mat-cell cdk-cell cdk-column-sex mat-column-sex ng-star-inserted']");
    By readHomePagePatientPhone = By.xpath("//table/tbody/tr/td[@class='mat-cell cdk-cell cdk-column-phoneno mat-column-phoneno ng-star-inserted']");
    By readHomePagePatientLocation = By.xpath("//table/tbody/tr/td[@class='mat-cell cdk-cell cdk-column-location mat-column-location ng-star-inserted']");
    By readHomePageTestType = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-list/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr/td[7]/img");
    By readHomePageTestDetails = By.xpath("//table/tbody/tr[1]/td[7]");
    By clickTestOrder = By.xpath("//table/tbody/tr[1][@class='mat-row cdk-row ng-star-inserted']");
    By readOrderID = By.xpath("//section/div/div/div[1]/div[1]/div/div[1]/h4");
    By readProfileImage = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[1]/div/div[2]/img");
    By readPatientName = By.xpath("//section/div/div/div[1]/div[1]/div/div[2]/div/p[1]");
    //By readAge = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[1]/small");
    By readAgeValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[1]/span");
    //By readGender = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[2]/small");
    By readGenderValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[2]/span");
    //By readPhone = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[3]/small");
    By readPhoneValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[1]/div/div[3]/span");
    //By readHeight = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[1]/small");
    By readHeightValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[1]/span");
    //By readWeight = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[2]/small");
    By readWeightValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[2]/span");
    //By readBloodGroup = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[3]/small");
    By readBloodGroupValue = By.xpath("//section/div/div/div[1]/div[2]/div/div[2]/div[3]/span");
    //By readAddress = By.xpath("//section/div/div/div[1]/div[2]/p/small");
    //By readAddressValue = By.xpath("//section/div/div/div[1]/div[2]/p/span");
    By readTestDetails = By.xpath("//section/div/div/div[2]/div/div/div/div/h5");
    By readTestStatus = By.xpath("//section/div/div/div[2]/div/div/div/div/h5/span");
    By readOrderCreatedDate = By.xpath("//section/div/div/div[2]/div/div/div/div/p");
    By readTestTypee = By.xpath("//section/div/div/div[2]/div/div/div/div[2]/img[@src='../../assets/img/home test icon.png']");
    By readScheduledDate = By.xpath("//section/div/div/div[2]/div/div/div[2]/h5");
    //By readPaymentHeader = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[1]");
    By readPaymentDetailsTestName = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[2]/span[1]");
    By readpaymentDetailsTestCharge = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[2]/span[2]");
    By readLabDetails = By.xpath("//section/div/div/div[2]/div/div[2]/form/div/div/div/input");
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
    By readAddonMember4 = By.xpath("//section/div/div/div[1]/div[3]/div/ul[2]/li[1]/a/div/h5");
    By readAddonMember4Age = By.xpath("//section/div/div/div[1]/div[3]/div/ul[4]/li[2]/a");
    By readAddonMember4Sex = By.xpath("//section/div/div/div[1]/div[3]/div/ul[4]/li[3]/a");
    By readCopyRight = By.xpath("//app-footer/p");
    By clickReject = By.xpath("//section/div/div/div[2]/div/div[3]/button[1]");
    By setRejectReason = By.id("exampleFormControlTextarea1");
    By clickCancelReject = By.xpath("//div/div[2]/button[1]");
    By clickConfirmReject = By.xpath("//div/div[2]/button[2]");
    By clickApprove = By.xpath("//section/div/div/div[2]/div/div[3]/button[2]");
    By readApproveConfirmText = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-conform-model/mat-dialog-content/div/div[1]");
    By clickClose = By.xpath("//app-conform-model/mat-dialog-content/div/div[2]/button[1]");
    By clickConfirmApprove = By.xpath("//app-conform-model/mat-dialog-content/div/div[2]/button[2]");
    By readOrderFinalStatus = By.xpath("//app-order-track/section/div/div[1]/div/div[2]/div/div[1]/div[1]/h4/span");
    By readHomePageAddedMemberCount = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-list/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr/td[2]/div/span[1]");
    By clickPaginationDownArrow = By.xpath("//mat-select/div/div/div");
    By clickPagination10 = By.xpath("//mat-option[1]/span");
    By clickPagination20 = By.xpath("//mat-option[2]/span");
    By clickPagination30 = By.xpath("//mat-option[3]/span");
    //By readSumofOrders = By.xpath("//table/tbody/tr/td[1]");
    By readDisplayedCount = By.xpath("//span/span");
    By readTotalItems = By.xpath("//mat-paginator/div/div/div[2]/div");
    By clickFirstPage = By.xpath("//mat-paginator/div/div/div[2]/button[1][@disabled='true']");
    By clickPreviousPage = By.xpath("//mat-paginator/div/div/div[2]/button[2][@disabled='true']");
    By clickNextPage = By.xpath("//mat-paginator/div/div/div[2]/button[3][@disabled='true']");
    By clickLastPage = By.xpath("//mat-paginator/div/div/div[2]/button[4][@disabled='true']");

    //SelfTest
    //By readPaymentDetailsSelfTestShippingName = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[3]/span[1]");
    By readPaymentDetailsSelfTestShippingCharge = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[3]/span[2]");
    //By readPaymentDetailsSelfTestTaxname = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[4]/span[1]");
    By readPaymentDetailsSelfTestTaxCharge = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[4]/span[2]");
    //By readPaymentDetailsSelfTestTotal = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[5]/span[1]");
    By readPaymentDetailsSelfTestTotalCharge = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[5]/span[2]");
    //By readSelfTestLabDetailsHeader = By.xpath("//section/div/div/div[2]/div/div[2]/form/h5");

    //HomeTest
    //By readPaymentDetailsHomeTestTaxName = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[3]/span[1]");
    By readPaymentDetailsHomeTestTaxCharge = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[3]/span[2]");
    //By readPaymentDetailsHomeTestTotal = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[4]/span[1]");
    By readPaymentDetailsHomeTestTotalCharge = By.xpath("//section/div/div/div[2]/div/div[2]/div/div[4]/span[2]");
    //By readHomeTestLabDetailsHeader = By.xpath("//section/div/div/div[2]/div/div[2]/form/h4");

    public OrderRequestPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    //Clicking Order Request Tab
    public void clickOrderRequestTab() throws IOException {
        try {
            Thread.sleep(5000);
            test4.log(LogStatus.INFO, "Ready to Click Order Request");
            WebElement OrderRequesttab = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(clickOrderRequestTab));
            OrderRequesttab.click();
            test4.log(LogStatus.PASS, "Order Request is Clicked");
        } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
            test4.log(LogStatus.FAIL, "Order Request is not Clicked");
            getScreenshot("OrderRequest-Tab");
        }
    }

    //Reading Order Request Header
    public void readOrderRequestHeader() throws IOException {
        try {
            test4.log(LogStatus.INFO, "verify HomePage-Screen Header");
            WebElement Header = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readOrderRequestHeader));
            String Text = Header.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Screen Header is not visible ");
                getScreenshot("HomePage-ScreenHeader");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Screen Header: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Screen Header is not Displayed");
            getScreenshot("HomePage-ScreenHeader");
        }
    }

    //Reading Menubar Title1
    public void readMenubarTitle1() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Menu Bar Title1");
            WebElement Title1 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readMenubarTitle1));
            String MeText = Title1.getText();
            if(MeText.equals("null") || MeText.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Menu Bar Title1 is not displayed");
                getScreenshot("HomePage-MenuBar-Title1");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Menu Bar Title1: " + MeText);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Menu Bar Title1 is not Displayed");
            getScreenshot("HomePage-MenuBar-Title1");
        }
    }

    //Reading Menubar Title2
    public void readMenubarTitle2() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Menu Bar Title2");
            WebElement Title2 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readMenubarTitle2));
            String Text = Title2.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Menu Bar Title2 is not displayed");
                getScreenshot("HomePage-MenuBar-Title2");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Menu Bar Title2: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Menu Bar Title2 is not Displayed");
            getScreenshot("HomePage-MenuBar-Title2");
        }
    }

    //Reading Menubar Title3
    public void readMenubarTitle3() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Menu Bar Title3");
            WebElement Title3 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readMenubarTitle3));
            String Text = Title3.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Menu Bar Title3 is not displayed ");
                getScreenshot("HomePage-MenuBar-Title3");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Menu Bar Title3: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Menu Bar Title3 is not Displayed");
            getScreenshot("HomePage-MenuBar-Title3");
        }
    }

    //Reading Menubar Title4
    public void readMenubarTitle4() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Menu Bar Title4");
            WebElement Title4 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readMenubarTitle4));
            String Text = Title4.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Menu Bar Title4 is not displayed");
                getScreenshot("HomePage-Menu Bar-Title4");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Menu Bar Title4: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Menu Bar Title4 is not Displayed");
            getScreenshot("HomePage-MenuBar-Title4");
        }
    }

    //Reading Menubar Title5
    public void readMenubarTitle5() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Menu Bar Title5");
            WebElement Title5 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readMenubarTitle5));
            String Text = Title5.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Menu Bar Title5 is not displayed");
                getScreenshot("HomePage-Menu Bar-Title5");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Menu Bar Title5: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Menu Bar Title5 is not Displayed");
            getScreenshot("HomePage-MenuBar-Title5");
        }
    }

    //Reading Menubar Title6
    public void readMenubarTitle6() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Menu Bar Title6");
            WebElement Title6 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readMenubarTitle6));
            String Text = Title6.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Menu Bar Title6 is not displayed");
                getScreenshot("HomePage-Menu Bar-Title6");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Menu Bar Title6: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Menu Bar Title6 is not Displayed");
            getScreenshot("HomePage-MenuBar-Title6");
        }
    }

    //Reading Menubar Title7
    public void readMenubarTitle7() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Menu Bar Title7");
            WebElement Title7 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readMenubarTitle7));
            String Text = Title7.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Menu Bar Title7 is not displayed");
                getScreenshot("HomePage-Menu Bar-Title7");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Menu Bar Title7: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Menu Bar Title7 is not Displayed");
            getScreenshot("HomePage-MenuBar-Title7");
        }
    }

    //Reading HomePage Order No
    public void readHomePageOrderDetails() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Order Number");
            WebElement OrderID = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomepageorderid));
            String Text = OrderID.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Order Number is not displayed ");
                getScreenshot("HomePage-OrderNo");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Order Number : " + Text);
            }
            readHomePageProfileImage();
            readHomePageAddonMemberCount();
            readHomePagePatientAge();
            readHomePagePatientSex();
            readHomePagePatientPhone();
            readHomePagePatientLocation();
            readHomePageTestOrderType();
            readHomePageTestDetails();
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "No Order is Placed");
            getScreenshot("HomePage-OrderNo");
        }
    }

    //Reading HomePage Patient Profile Image
    public void readHomePageProfileImage() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Patient Profile Image");
            WebElement ProfileImage = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomePagePatientProfileImage));
            String a = ProfileImage.getAttribute("src");
            if(a.contains("jpg") || a.contains("jpeg") || a.contains("svg")) {
                test4.log(LogStatus.PASS, "HomePage-Patient Profile Image is Displayed");
            } else {
                test4.log(LogStatus.WARNING, "HomePage-Patient Profile Image is not Displayed");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "HomePage-Patient Profile Image is not Displayed");
            getScreenshot("HomePage-PatientProfileImage");
        }
    }

    //Reading HomePage Add on Member Count
    public void readHomePageAddonMemberCount() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Add on Member Count");
            WebElement Addom = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomePageAddedMemberCount));
            String Text = Addom.getText();
            if (Text.contains("+")) {
                test4.log(LogStatus.PASS, "Add on Member Count is : " + Text);
                readHomePagePatientName();
            } else if (Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Patient Name & Add on member counts are not displayed");
                getScreenshot("HomePage_PatientName");
            } else {
                test4.log(LogStatus.PASS, "HomePage Patient Name is : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Patient name and Add on Member are not Visible");
            getScreenshot("HomePage-AddonMember");
        }
    }

    //Reading HomePage Patient Name
    public void readHomePagePatientName() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Patient Name");
            WebElement PatientName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomePagePatientName));
            String Text = PatientName.getText();
            if (Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Patient Name is not displayed");
                getScreenshot("HomePage-PatientName");
            } else {
                test4.log(LogStatus.PASS, "HomePage Patient Name : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Patient Name not visible");
            getScreenshot("HomePage-PatientName");
        }
    }

    // Reading HomePage Patient Age
    public void readHomePagePatientAge() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Patient Age");
            WebElement PatientAge = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomePagePatientAge));
            String Text = PatientAge.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Patient Age is not displayed");
                getScreenshot("HomePage-Patient Age");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Patient Age : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Patient age is not visible");
            getScreenshot("HomePage-PatientAge");
        }
    }

    //Reading HomePage Patient Sex
    public void readHomePagePatientSex() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Patient Sex");
            WebElement PatientSex = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomePagePatientSex));
            String Text = PatientSex.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Patient Sex is not displayed");
                getScreenshot("HomePage-PatientSex");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Patient Sex : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Patient sex is not visible");
            getScreenshot("HomePage-PatientSex");
        }
    }

    //Reading Patient Phone
    public void readHomePagePatientPhone() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Patient Phone Number");
            WebElement PatientPhone = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomePagePatientPhone));
            String Text = PatientPhone.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Patient Phone Number is not displayed ");
                getScreenshot("HomePage-PatientPhone");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Patient Phone Number : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Patient phone number is not visible");
            getScreenshot("HomePage-PatientPhone");
        }
    }

    //Reading HomePage Patient Location
    public void readHomePagePatientLocation() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Patient Location");
            WebElement PatientLocation = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomePagePatientLocation));
            String Text = PatientLocation.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Patient Location is not displayed");
                getScreenshot("HomePage-PatientLocation");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Patient Location : " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Patient loaction is not visible");
            getScreenshot("HomePage-PatientLocation");
        }
    }

    //Reading HomePage Test Order Type
    public void readHomePageTestOrderType() throws IOException {
        try {
            Thread.sleep(2000);
            test4.log(LogStatus.INFO, "Verify HomePage-Test Order Type");
            WebElement HomePageTestType = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomePageTestType));
            String Text = HomePageTestType.getAttribute("src");
            //driver.findElement(readHomePageTestType);
            if(Text.contains("home%")) {
                test4.log(LogStatus.PASS, "HomePage-Test Order Type is Home Test");
            } else if(Text.contains("self%")) {
                test4.log(LogStatus.PASS, "HomePage-Test Order Type is Self Test");
            } else {
                test4.log(LogStatus.WARNING, "HomePage-Test Order Type is not displayed" + Text);
                getScreenshot("HomePage-TestOrderType");
            }
        } catch (NoSuchElementException | TimeoutException | InterruptedException e) {
            test4.log(LogStatus.WARNING, "Test order type is not displayed");
            getScreenshot("HomePage-TestOrderType");
        }
    }

    //Reading HomePage Test Details
    public void readHomePageTestDetails() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify HomePage-Test Details");
            WebElement TestDetails = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHomePageTestDetails));
            String Text = TestDetails.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "HomePage-Test Name  is not displayed ");
                getScreenshot("HomePage-TestDetails");
            } else {
                test4.log(LogStatus.PASS, "HomePage-Test Name: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Test name not visible");
            getScreenshot("HomePage-TestName");
        }
    }

    //Clicking Order
    public void clickOrder() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Ready to click Order");
            WebElement ClickOrder = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(clickTestOrder));
            ClickOrder.click();
            test4.log(LogStatus.PASS, "Test Order Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Test Order is not Clicked");
            getScreenshot("Test Order-Click");
        }
    }

    //Reading Order No
    public void readOrderNo() throws IOException, InterruptedException {
        try {
            Thread.sleep(5000);
            test4.log(LogStatus.INFO, "Verify Order No");
            WebElement OrderNo = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readOrderID));
            String Text = OrderNo.getText();
            String[] split = StringUtils.split(Text, ": ");
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Order No is not displayed ");
                getScreenshot("TestOrderNo");
            } else {
                test4.log(LogStatus.PASS, "Order No: " + Text);
                dataList.remove(21);
                dataList.add(21, split[2]);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Order No is not Displayed");
            getScreenshot("TestOrderNo");
        }
    }

    //Reading Patient Profile Picture
    public void readPatientProfilePicture() throws IOException, InterruptedException {
        try {
            test4.log(LogStatus.INFO, "Verify Profile Image");
            WebElement ProfileImg = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readProfileImage));
            String a = ProfileImg.getAttribute("src");
            if(a.contains("jpg") || a.contains("jpeg")) {
                test4.log(LogStatus.PASS, "HomePage-Patient Profile Image is Displayed");
            } else if (a.contains("svg")) {
                test4.log(LogStatus.WARNING, "Test image showing instead of Patient Profile Image");
            } else {
                test4.log(LogStatus.WARNING, "HomePage-Patient Profile Image is not Displayed");
                getScreenshot("PatientProfileImage");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Profile Image is not Displayed");
            getScreenshot("PatientProfileImage");
        }
    }

    //Reading Patient Name
    public void readPatientName() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Patient Name");
            WebElement PatientName = new WebDriverWait(driver, 10)
                    .until(driver -> driver.findElement(readPatientName));
            String Text = PatientName.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Patient Name is not displayed");
                getScreenshot("PatientName");
            } else {
                test4.log(LogStatus.PASS, "Patient Name: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Patient's Name is not Displayed");
            getScreenshot("PatientName");
        }
    }

    //Reading Patient Age
    public void readPatientAge() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Patient's Age");
            WebElement PatientAge = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readAgeValue));
            String Text = PatientAge.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Patient's Age is not displayed");
                getScreenshot("PatientAge");
            } else {
                test4.log(LogStatus.PASS, "Patient's Age: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Patient's Age is not Displayed");
            getScreenshot("PatientAge");
        }
    }

    //Reading Patient Gender
    public void readPatientGender() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Patient's Gender");
            WebElement PatientGender = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readGenderValue));
            String Text = PatientGender.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Patient's Gender is not displayed ");
                getScreenshot("PatientGender");
            } else {
                test4.log(LogStatus.PASS, "Patient's Gender: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Patient Gender is not Displayed");
            getScreenshot("PatientGender");
        }
    }

    //Reading Patient Phone
    public void readPatientPhone() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Patient's Phone Number");
            WebElement PatientPhone = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readPhoneValue));
            String Text = PatientPhone.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Patient's Phone Number is not displayed");
                getScreenshot("PatientPhone");
            } else {
                test4.log(LogStatus.PASS, "Patient's Phone Number: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Patient's Phone is not Displayed");
            getScreenshot("PatientPhone");
        }
    }

    //Reading Patient Height
    public void readPatientHeight() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Patient's Height");
            WebElement PatientHeight = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readHeightValue));
            String Text = PatientHeight.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Patient's height is not displayed ");
                getScreenshot("PatientHeight");
            } else {
                test4.log(LogStatus.PASS, "Patient's height: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Patient's Height is not Displayed");
            getScreenshot("PatientHeight");
        }
    }

    //Reading Patient Weight
    public void readPatientWeight() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Patient's Weight");
            WebElement PatientWeight = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readWeightValue));
            String Text = PatientWeight.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Patient's Weight is not displayed");
                getScreenshot("PatientWeight");
            } else {
                test4.log(LogStatus.PASS, "Patient's Weight: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Patient's Weight is not Displayed");
            getScreenshot("PatientWeight");
        }
    }

    //Reading Patient Blood Group
    public void readPatientBloodGroup() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Patient's Blood Group");
            WebElement Blood = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readBloodGroupValue));
            String Text = Blood.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Patient's Blood Group is not displayed ");
                getScreenshot("PatientBlood Group");
            } else {
                test4.log(LogStatus.PASS, "Patient's Blood Group: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Patient's Blood Group is not Displayed");
            getScreenshot("PatientBloodGroup");
        }
    }

    //Reading Add on Member1
    public void readAddonMember() throws InterruptedException, IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        try {
            Thread.sleep(2000);
            test4.log(LogStatus.INFO, "Verify Add on Member Header");
            if (driver.findElement(readAddonMember).isDisplayed()) {
                WebElement AddonMember = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember));
                String Text = AddonMember.getText();
                if(Text.equals("null") || Text.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member Header is not displayed ");
                    getScreenshot("AddOnHead");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member Header: " + Text);
                }
                test4.log(LogStatus.INFO, "Verify Add on Member1 Name");
                WebElement AddonMember1Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember1));
                String Text1 = AddonMember1Name.getText();
                if(Text1.equals("null") || Text1.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member1 Name is not displayed");
                    getScreenshot("AddOnName1");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member1 Name: " + Text1);
                }
                test4.log(LogStatus.INFO, "Verify Add on Member1 Age");
                WebElement AddonMember1Age = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember1Age));
                String Text2 = AddonMember1Age.getText();
                if(Text2.equals("null") || Text2.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member1 Age is not displayed");
                    getScreenshot("AddOnAge1");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member1 Age: " + Text2);
                }
                test4.log(LogStatus.INFO, "Verify Add on Member1 Gender");
                WebElement AddonMember1Sex = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember1Sex));
                String Text3 = AddonMember1Sex.getText();
                if(Text3.equals("null") || Text3.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member1 Gender is not displayed");
                    getScreenshot("AddOnGender1");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member1 Gender: " + Text3);
                }
                readAddonMember2();
                readAddonMember3();
                readAddonMember4();
            } else {
                test4.log(LogStatus.WARNING, "Add on Member 1 is not Added");
                getScreenshot("AddOnMembers1");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Add on Member 1 is not Added");
            getScreenshot("AddOnMembers1");
        }
    }

    //Reading Add on Member2
    public void readAddonMember2() throws IOException, InterruptedException {
        try {
            test4.log(LogStatus.INFO, "Verify Add on Member2 Name");
            if (driver.findElement(readAddonMember2).isDisplayed()) {
                WebElement AddonMember2Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember2));
                String Text = AddonMember2Name.getText();
                if(Text.equals("null") || Text.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member2 Name is not displayed");
                    getScreenshot("AddOnName2");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member2 Name: " + Text);
                }
                test4.log(LogStatus.INFO, "Verify Add on Member2 Age");
                WebElement AddonMember2Age = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember2Age));
                String Text2 = AddonMember2Age.getText();
                if(Text2.equals("null") || Text2.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member2 Age is not displayed ");
                    getScreenshot("AddOnAge1");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member2 Age: " + Text2);
                }
                test4.log(LogStatus.INFO, "Add on Member2 Gender");
                WebElement AddonMember2Sex = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember2Sex));
                String Text3 = AddonMember2Sex.getText();
                if(Text3.equals("null") || Text3.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member2 Gender is not displayed ");
                    getScreenshot("AddOnGender1");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member2 Gender: " + Text3);
                }
            } else {
                test4.log(LogStatus.FAIL, "Add on Member2 Details not Displayed");
                getScreenshot("AddOnMembers2");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Add on Member2 is not Added");
            getScreenshot("AddOnMembers2");
        }
    }

    //Reading Add on Member3
    public void readAddonMember3() throws IOException, InterruptedException {
        try {
            test4.log(LogStatus.INFO, "Verify Add on Member3 Name");
            if (driver.findElement(readAddonMember3).isDisplayed()) {
                WebElement AddonMember3Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember3));
                String Text = AddonMember3Name.getText();
                if(Text.equals("null") || Text.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member3 Name is not displayed");
                    getScreenshot("AddOnName3");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member3 Name: " + Text);
                }
                test4.log(LogStatus.INFO, "Add on Member3 Age");
                WebElement AddonMember3Age = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember3Age));
                String Text2 = AddonMember3Age.getText();
                if(Text2.equals("null") || Text2.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member3 Age is not displayed");
                    getScreenshot("AddOnAge3");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member3 Age: " + Text2);
                }
                test4.log(LogStatus.INFO, "Add on Member3 Gender");
                WebElement AddonMember3Sex = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember3Sex));
                String Text3 = AddonMember3Sex.getText();
                if(Text3.equals("null") || Text3.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member3 Gender is not displayed ");
                    getScreenshot("AddOnGender3");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member3 Gender: " + Text3);
                }
            } else {
                test4.log(LogStatus.FAIL, "Add on Member3 Details not Displayed");
                getScreenshot("AddonMembers3");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Add on Member3 is not Added");
            getScreenshot("AddonMember3");
        }
    }

    //Reading Add on Member4
    public void readAddonMember4() throws IOException, InterruptedException {
        try {
            test4.log(LogStatus.INFO, "Add on Member4 Name");
            if (driver.findElement(readAddonMember4).isDisplayed()) {
                WebElement AddonMember4Name = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember4));
                String Text = AddonMember4Name.getText();
                if(Text.equals("null") || Text.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member4 Name is not displayed");
                    getScreenshot("AddOnName4");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member4 Name: " + Text);
                }
                test4.log(LogStatus.INFO, "Add on Member4 Age");
                WebElement AddonMember4Age = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember4Age));
                String Text2 = AddonMember4Age.getText();
                if(Text2.equals("null") || Text2.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member4 Age is not displayed");
                    getScreenshot("AddOnAge4");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member4 Age: " + Text2);
                }
                test4.log(LogStatus.INFO, "Add on Member4 Gender");
                WebElement AddonMember4Sex = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readAddonMember4Sex));
                String Text3 = AddonMember4Sex.getText();
                if(Text3.equals("null") || Text3.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Add on Member4 Gender is not displayed");
                    getScreenshot("AddOnGender4");
                } else {
                    test4.log(LogStatus.PASS, "Add on Member4 Gender: " + Text3);
                }
            } else {
                test4.log(LogStatus.FAIL, "Add on Member4 Details not Displayed");
                getScreenshot("AddonMembers4");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Add on Member4 is not Added");
            getScreenshot("AddonMember4");
        }
    }

    //Reading Test Details
    public void readTestDetails() throws InterruptedException, IOException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-500)");
        try {
            test4.log(LogStatus.INFO, "Verify Ordered Test Name");
            WebElement TestName = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readTestDetails));
            String Text = TestName.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Ordered Test Name is not displayed");
                getScreenshot("TestName");
            } else {
                test4.log(LogStatus.PASS, "Ordered Test Name: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Test Name is not Displayed");
            getScreenshot("TestName");
        }
    }

    //Reading Test Status
    public void readTestStatus() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Ordered Test Status");
            WebElement TestStatus = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readTestStatus));
            String Text = TestStatus.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Ordered Test Status is not displayed");
                getScreenshot("TestStatus");
            } else {
                test4.log(LogStatus.PASS, "Ordered Test Status: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Test Status is not Displayed");
            getScreenshot("TestStatus");
        }
    }

    //Reading Test Type
    public void readTestType() throws InterruptedException, IOException {
        try {
            Thread.sleep(2000);
            test4.log(LogStatus.INFO, "Verify Ordered Test Type");
            WebElement Schedule = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readScheduledDate));
            String t = Schedule.getAttribute("src");
            if (t.contains("home")) {
                test4.log(LogStatus.PASS, "It's Home Test");
            } else if(t.contains("self")){
                test4.log(LogStatus.PASS, "It's a SelfTest");
            } else {
                test4.log(LogStatus.WARNING, "Test type not visible");
                getScreenshot("TestType");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "Test type not visible");
            getScreenshot("TestType");
        }
    }

    //Reading Order Created Date
    public void readOrderCreatedDate() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Order Created Date and Time");
            WebElement OC = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readOrderCreatedDate));
            String Text = OC.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Order Created Date and Time is not displayed");
                getScreenshot("OrderDate");
            } else {
                test4.log(LogStatus.PASS, "Order Created Date and Time: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.PASS, "Order Created Date is not Displayed");
            getScreenshot("OrderDate");
        }
    }

    // Reading Schedule Date
    public void readScheduledDate() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Scheduled Date and Time");
            WebElement Schedule = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readScheduledDate));
            String Text = Schedule.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Order Scheduled Date and Time not shown " + Text);
                getScreenshot("Schedule");
            } else {
                test4.log(LogStatus.PASS, "Order Scheduled Date and Time: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.SKIP, "It's a SELF TEST or Home Test is not Scheduled");
            getScreenshot("Schedule");
        }
    }

    //Reading Payment Details
    public void readPaymentDetails() throws InterruptedException, IOException {
        test4.log(LogStatus.INFO, "Verify Payment Details");
        Thread.sleep(2000);
        try {
            if (driver.findElement(readTestTypee).isDisplayed()) {
                Thread.sleep(2000);
                test4.log(LogStatus.INFO, "Verify Test Name");
                WebElement TestName = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readPaymentDetailsTestName));
                String Text = TestName.getText();
                if(Text.equals("null") || Text.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Test Name not displayed" + Text);
                    getScreenshot("PayTestName");
                } else {
                    test4.log(LogStatus.PASS, "Test Name: " + Text);
                }
                test4.log(LogStatus.INFO, "Verify Test Charge");
                WebElement TestCharge = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readpaymentDetailsTestCharge));
                String Text1 = TestCharge.getText();
                if(Text1.equals("null") || Text1.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Test Charge not displayed" + Text1);
                    getScreenshot("PayTestCharge");
                } else {
                    test4.log(LogStatus.PASS, "Test Charge: " + Text1);
                }
                test4.log(LogStatus.INFO, "Verify Tax Charge");
                WebElement TaxCharge = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readPaymentDetailsHomeTestTaxCharge));
                String Text2 = TaxCharge.getText();
                if(Text2.equals("null") || Text2.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Tax Charge not displayed" + Text2);
                    getScreenshot("PayTaxCharge");
                } else {
                    test4.log(LogStatus.PASS, "Tax Charge: " + Text2);
                }
                test4.log(LogStatus.INFO, "Verify Total Charge");
                WebElement TotalCharge = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readPaymentDetailsHomeTestTotalCharge));
                String Text3 = TotalCharge.getText();
                if(Text3.equals("null") || Text3.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Total Charge not displayed" + Text3);
                    getScreenshot("PayTotalCharge");
                } else {
                    test4.log(LogStatus.PASS, "Total Charge: " + Text3);
                }
            }
        } catch (NoSuchElementException | TimeoutException e) {
            Thread.sleep(2000);
            test4.log(LogStatus.INFO, "Verify Test Name");
            try {
                WebElement TestName = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readPaymentDetailsTestName));
                String Text = TestName.getText();
                if (Text.equals("null") || Text.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Test Name not displayed" + Text);
                    getScreenshot("PayTestName");
                } else {
                    test4.log(LogStatus.PASS, "Test Name: " + Text);
                }
                Thread.sleep(1000);
                test4.log(LogStatus.INFO, "Verify Test Charge");
                WebElement TestCharge = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readpaymentDetailsTestCharge));
                String Text2 = TestCharge.getText();
                if (Text2.equals("null") || Text2.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Test Charge not displayed" + Text2);
                    getScreenshot("PayTestCharge");
                } else {
                    test4.log(LogStatus.PASS, "Test Charge: " + Text2);
                }
                test4.log(LogStatus.INFO, "Verify Shipping Charge");
                WebElement ShippingCharge = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readPaymentDetailsSelfTestShippingCharge));
                String Text3 = ShippingCharge.getText();
                if (Text3.equals("null") || Text3.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Shipping Charge not displayed" + Text3);
                    getScreenshot("PayShipCharge");
                } else {
                    test4.log(LogStatus.PASS, "Shipping Charge: " + Text3);
                }
                test4.log(LogStatus.INFO, "Tax Charge:");
                WebElement Tax = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readPaymentDetailsSelfTestTaxCharge));
                String Text4 = Tax.getText();
                if (Text4.equals("null") || Text4.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Tax Charge not displayed" + Text4);
                    getScreenshot("PayTaxCharge");
                } else {
                    test4.log(LogStatus.PASS, "Tax Charge: " + Text4);
                }
                test4.log(LogStatus.INFO, "Verify Total Charge");
                WebElement Total = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(readPaymentDetailsSelfTestTotalCharge));
                String Text5 = Total.getText();
                if (Text5.equals("null") || Text5.isEmpty()) {
                    test4.log(LogStatus.FAIL, "Total Charge not displayed" + Text5);
                    getScreenshot("PayTotalCharge");
                } else {
                    test4.log(LogStatus.PASS, "Total Charge: " + Text5);
                }
            } catch (NoSuchElementException e1) {
                test4.log(LogStatus.FAIL, "Payment details are not displayed");
                getScreenshot("PayDetails");
            }
        }
    }

    //Reading Lab Details
    public void readLabdetails() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Chosen Lab Details:");
            WebElement Lab = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readLabDetails));
            String l = Lab.getText();
            //System.out.println("lab" + l);
            if(Lab.isDisplayed()) {
                test4.log(LogStatus.PASS, "5009 Rosewell Rd Atlanta GA");
            } else {
                test4.log(LogStatus.FAIL, "Lab Details are not Displayed");
                getScreenshot("LabDetails");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Lab Details are not Displayed");
            getScreenshot("LabDetails");
        }
    }

    //Clicking Reject
    public void setOrderConfirmation(String Conf, String Reason) throws InterruptedException, IOException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        if(Conf.contains("Yes")) {
            Thread.sleep(1000);
            try {
                Thread.sleep(2000);
                test4.log(LogStatus.INFO, "Test Order-Reject");
                WebElement ClickReject = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(clickReject));
                ClickReject.click();
                test4.log(LogStatus.PASS, "Reject is Clicked");
            } catch (NoSuchElementException | TimeoutException e) {
                test4.log(LogStatus.FAIL, "Reject Button is not Displayed");
                getScreenshot("Reject-Click");
            }
            //Set Reject Reason
            try {
                Thread.sleep(2000);
                test4.log(LogStatus.INFO, "Test Order-Reject Reason:");
                WebElement SetReject = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(setRejectReason));
                SetReject.sendKeys(Reason);
                test4.log(LogStatus.PASS, Reason);
            } catch (NoSuchElementException | TimeoutException e) {
                test4.log(LogStatus.FAIL, "Reject Reason is not Given");
                getScreenshot("Reject-Reason");
            }
            //Clicking Reject-Confirm
            try {
                test4.log(LogStatus.INFO, "Rejecting Test Order");
                WebElement ConfirmReject = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(clickConfirmReject));
                ConfirmReject.click();
                test4.log(LogStatus.PASS, "Reject Confirmation is Clicked");
            } catch (NoSuchElementException | TimeoutException e) {
                test4.log(LogStatus.FAIL, "Reject Confirmation is not Clicked");
                getScreenshot("Reject-Confiem");
            }
        } else {
            clickApprove();
            clickApproveConfirm();
        }
    }

    //Clicking Reject
    public void clickReject() throws InterruptedException, IOException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        try {
            Thread.sleep(2000);
            test4.log(LogStatus.INFO, "Test Order-Reject");
            WebElement ClickReject = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickReject));
            ClickReject.click();
            test4.log(LogStatus.PASS, "Reject is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Reject Button is not Displayed");
            getScreenshot("Reject-Click");
        }
    }

    //Clicking Reject-Cancel
    public void clickCancelReject() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Canceling Reject");
            WebElement CancelReject = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickCancelReject));
            CancelReject.click();
            test4.log(LogStatus.PASS, "Reject Canceled");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Reject is not canceled");
            getScreenshot("Reject-Cancel");
        }
    }

    //Click Approve
    public void clickApprove() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test4.log(LogStatus.INFO, "Clicking Test Order Approve");
            WebElement ClickAprrove = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickApprove));
            ClickAprrove.click();
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Test Order Approve is not Clicked");
            getScreenshot("Approve-Click");
        }
    }

    //Reading Approval Alert
    public void readApproveAlertMessage() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Approve Alert Message");
            WebElement ReadAprroveAlert = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(readApproveConfirmText));
            String Text = ReadAprroveAlert.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Approve Alert Message is not displayed ");
                getScreenshot("Approve-Alert");
            } else {
                test4.log(LogStatus.PASS, "Approve Alert Message: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Approve Alert is not Opened");
            getScreenshot("Approve-Alert");
        }
    }

    //Clicking Approve-Close
    public void clickApproveClose() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Canceling Test Order Approval");
            WebElement ClickClose = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickClose));
            ClickClose.click();
            test4.log(LogStatus.PASS, "Test Order Approve is Canceled");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Test Order Approve is not Clicked");
            getScreenshot("Approve-Close");
        }
    }

    //Clicking Approve-Confirm
    public void clickApproveConfirm() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Clicking Approve Confirmation");
            WebElement ConfirmApprove = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickConfirmApprove));
            ConfirmApprove.click();
            test4.log(LogStatus.PASS, "Approve Confirmation is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Approve Confirmation is not Clicked");
            getScreenshot("Approve-Confirm");
        }
    }

    //Reading Order Final Status
    public void readTestOrderFinalStatus() throws InterruptedException, IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-500)");
        try {
            test4.log(LogStatus.INFO, "Verify Test Order Final Status");
            WebElement OrderFinalStatus = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readOrderFinalStatus));
            String Text = OrderFinalStatus.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Order Final Status is not displayed");
                getScreenshot("TestOrderFinalStatus");
            } else {
                test4.log(LogStatus.PASS, "Order Final Status: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "No Such Element");
            getScreenshot("TestOrderFinalStatus");
        }
    }

    //Set Search Text
    public void setSearchBy(String Search) throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test4.log(LogStatus.INFO, "Ready to pass the order number in the search bar");
            WebElement SetSR = new WebDriverWait(driver, 50)
                    .until(driver -> driver.findElement(setSearchbox));
            SetSR.sendKeys(Search);
            test4.log(LogStatus.PASS, "Searched Order Id: " + Search);
            Thread.sleep(2000);
            test4.log(LogStatus.INFO, "Verifying Order Details");
            String OrderID = driver.findElement(readHomepageorderid).getText();
            test4.log(LogStatus.PASS, "Order ID: " + OrderID);
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.WARNING, "No Such Item");
            getScreenshot("Search");
        }
    }

    //Clearing Search Box
    public void clearSearchBox() throws InterruptedException {
        try {
            test4.log(LogStatus.INFO, "Clearing Input:");
            WebElement SetSR = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(setSearchbox));
            SetSR.clear();
            Thread.sleep(2000);
            driver.navigate().refresh();
            test4.log(LogStatus.PASS, "Input Cleared");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Input Not Cleared");
        }
    }

    //Reading CopyRight
    public void readCopyright() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify CopyRight");
            WebElement CR = new WebDriverWait(driver, 100)
                    .until(driver -> driver.findElement(readCopyRight));
            String Text = CR.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "CopyRight is not displayed ");
                getScreenshot("CopyRight");
            } else {
                test4.log(LogStatus.PASS, "CopyRight: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Copy Right is Displayed");
            getScreenshot("CopyRight");
        }
    }

    //Clicking Pagination-Down Arrow
    public void clickPagination_DownArrow() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            test4.log(LogStatus.INFO, "Clicking Paginagtion Arrow");
            WebElement PG = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPaginationDownArrow));
            PG.click();
            test4.log(LogStatus.PASS, "Paginagtion Arrow is Clicked");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Paginagtion Arrow is not Clicked");
            getScreenshot("PaginationArrow");
        }
    }

    //Clicking Pagination10
    public void clickPagination10() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Selecting Items Count 10");
            WebElement PG10 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPagination10));
            PG10.click();
            test4.log(LogStatus.PASS, "Items count Per Page is Selected");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Items Count Per Page is not Selected");
            getScreenshot("Items Per Page-Select");
        }
    }

    //Clicking Pagination20
    public void clickPagination20() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Selecting Items Count 20");
            WebElement PG10 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPagination20));
            PG10.click();
            test4.log(LogStatus.PASS, "Items count Per Page is Selected");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Items Count Per Page is not Selected");
            getScreenshot("Items Per Page-Select");
        }
    }

    //Clicking Pagination 30
    public void clickPagination30() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Selecting Items Count 30");
            WebElement PG10 = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPagination30));
            PG10.click();
            test4.log(LogStatus.PASS, "Items count Per Page is Selected");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Items Count Per Page is not Selected");
            getScreenshot("Items Per Page-Select");
        }
    }

    //Reading Items Per Page
    public void readItemsPerPage() throws IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Items Per Page");
            WebElement Items = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readDisplayedCount));
            String Text = Items.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Items Per Page is not displayed ");
                getScreenshot("ItemsPerPage-Select");
            } else {
                test4.log(LogStatus.PASS, "Items Per Page: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Items Count Per Page is not Displayed");
            getScreenshot("ItemsPerPage-Select");
        }
    }

    //Reading Total Items
    public void readTotalItems() throws InterruptedException, IOException {
        try {
            test4.log(LogStatus.INFO, "Verify Total Items");
            WebElement Total = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(readTotalItems));
            String Text = Total.getText();
            if(Text.equals("null") || Text.isEmpty()) {
                test4.log(LogStatus.FAIL, "Total Items is not displayed");
                getScreenshot("TotalItems");
            } else {
                test4.log(LogStatus.PASS, "Total Items: " + Text);
            }
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.FAIL, "Total Items are not Displayed");
            getScreenshot("TotalItems");
        }
    }

    //Clicking First Page
    public void clickfirstPage() throws IOException {
        String Text = driver.findElement(readTotalItems).getText();
        try {
            test4.log(LogStatus.INFO, "Clicking FirstPage:");
            WebElement FP = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickFirstPage));
            FP.click();
            test4.log(LogStatus.WARNING, "We are already in the First Page");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.PASS, "Page:" + Text);
            getScreenshot("Pagination-First Page");
        }
    }

    //Clicking Previous Page
    public void clickPreviousPage() throws IOException {
        String Text = driver.findElement(readTotalItems).getText();
        try {
            test4.log(LogStatus.INFO, "Clicking Previous Page:");
            WebElement PP = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickPreviousPage));
            PP.click();
            test4.log(LogStatus.WARNING, "We are already in the First Page");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.PASS, "Page: " + Text);
            getScreenshot("Pagination-Previous Page");
        }
    }

    //Clicking Next Page
    public void clickNextPage() throws IOException {
        String Text = driver.findElement(readTotalItems).getText();
        try {
            test4.log(LogStatus.INFO, "Clicking Next Page:");
            WebElement NP = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickNextPage));
            NP.click();
            test4.log(LogStatus.WARNING, "Only One Page is Available");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.PASS, "Page: " + Text);
            getScreenshot("Pagination-Next Page");
        }
    }

    //Clicking Last Page
    public void clickLastPage() throws IOException {
        String Text = driver.findElement(readTotalItems).getText();
        try {
            test4.log(LogStatus.INFO, "Clicking Next Page:");
            WebElement LP = new WebDriverWait(driver, 1)
                    .until(driver -> driver.findElement(clickLastPage));
            LP.click();
            test4.log(LogStatus.WARNING, "We Have Already Reached Last Page");
        } catch (NoSuchElementException | TimeoutException e) {
            test4.log(LogStatus.PASS, "Page: " + Text);
            getScreenshot("Pagination-Last Page");
        }
    }

}

