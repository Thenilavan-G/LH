package IntegrationPages;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static IntegrationPages.TestBaseAdmin.test3;
import static IntegrationPages.TestBaseAdmin.*;

public class RecentOrderQueuePageObjects {

    private final WebDriver driver;

    By rec_h = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-dashboard/div/app-life-hope-table/div/div/div/div[1]/div/div[1]/h4");
    By order_id = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-dashboard/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]");
    By add_on_count = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-dashboard/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/span[1]");
    By select_order = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-dashboard/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr[1]");
    By test_type = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[1]/div[1]/div[2]/img");
    By lab_details_self = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/form/h5");
    By lab_details_home = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/form/h4");
    By choose_lab = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/form/div/div/label");
    By lab_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/form/div/div/div/input");
    By reject = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[3]/button[1]");
    By rej_reason_text = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-reject-model/div/div[1]/label");
    By rej_reason = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-reject-model/div/div[1]/textarea");
    //By rej_reason = By.xpath("//div[@id='cdk-overlay-1']/mat-dialog-container/app-reject-model/div/div/textarea");
    By rej_cancel = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-reject-model/div/div[2]/button[1]");
    By rej_reject = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-reject-model/div/div[2]/button[2]");
    By rej_mandatory = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-reject-model/div/span");
    By approve = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[3]/button[2]");
    By app_text = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-conform-model/mat-dialog-content/div/div[1]");
    By app_close = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-conform-model/mat-dialog-content/div/div[2]/button[1]");
    By app_confirm = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-conform-model/mat-dialog-content/div/div[2]/button[2]");
    By order_status = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-order-track/section/div/div[1]/div/div[2]/div/div[1]/div[1]/h4/span");
    //By order_status = By.xpath("//div[@class='col-md-6']/div/div/div/h4/span");
    By age_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[1]/div/div[1]/small");
    By age_value = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[1]/div/div[1]/span");
    By gender_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[1]/div/div[2]/small");
    By gender_value = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[1]/div/div[2]/span");
    By phone_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[1]/div/div[3]/small");
    By phone_value = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[1]/div/div[3]/span");
    By height_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[2]/div[1]/small");
    By height_value = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[2]/div[1]/span");
    By weight_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[2]/div[2]/small");
    By weight_value = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[2]/div[2]/span");
    By blood_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[2]/div[3]/small");
    By blood_value = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/div/div[2]/div[3]/span");
    By address_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/p/small");
    By address_value = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[2]/p/span");
    By add_mem_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/h4");
    By add_one_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[1]/li[1]/a/div/h5");
    By add_one_age = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[1]/li[2]/a");
    By add_one_gender = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[1]/li[3]/a");
    By add_two_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[2]/li[1]/a/div/h5");
    By add_two_age = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[2]/li[2]/a");
    By add_two_gender = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[2]/li[3]/a");
    By add_three_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[3]/li[1]/a/div/h5");
    By add_three_age = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[3]/li[2]/a");
    By add_three_gender = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[3]/li[3]/a");
    By add_four_name = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[4]/li[1]/a/div/h5");
    By add_four_age = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[4]/li[2]/a");
    By add_four_gender = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[3]/div/ul[4]/li[3]/a");
    By copy_rights = By.xpath("/html/body/app-root/div[1]/div/div[4]/app-footer/p");
    By lad_dashboard = By.xpath("/html/body/app-root/div[1]/div/div[2]/app-left-menu/div/div/div/ul/li[1]/div/a/span");

    //By Order_No = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[1]/div[1]/div/div[1]/h4");
    By Order_No = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[1]/div/div[1]/h4");
    //By PatientName = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[1]/div[1]/div/div[2]/div/p[1]");
    By PatientName = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[1]/div/div[2]/div/p[1]");
    By Order_No2 = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[1]/div[1]/div/div[2]/div/p[2]");
    //By Order_No2 = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[1]/div[1]/div/div[2]/div/p[2]");
    By profile_pic = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[1]/div[1]/div/div[2]/img");
    By Test_Option_Name = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[1]/div[1]/div[1]/h5");
    //By Test_type = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[1]/div[1]/div[2]/img");
    By Test_type = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[1]/div[1]/div[2]/img");
    By Test_Status = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[1]/div[1]/div[1]/h5/span");
    By Order_Date_Time = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[1]/div[1]/div[1]/p");
    By Schedule_Date_Time = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[1]/div[2]/h5");
    By Payment_Details_Text = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/div/div[1]");
    By Test_option_name = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/div/div[2]/span[1]");
    //By Add_on_member_count = By.xpath("//*[@id=\"content\"]/div/div[3]/app-dashboard/div/app-life-hope-table/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/span[2]");
    By Test_total_value = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/div/div[2]/span[2]");
    By Shipping_Charge_Text = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/div/div[3]/span[1]");
    By Shipping_Charge_Value = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/div/div[3]/span[2]");

    By Tax_text = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/div/div[3]/span[1]");
    By Tax_Value = By.xpath("//*[@id=\"content\"]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/div/div[3]/span[2]");
    By Total_text = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/div/div[4]/span[1]");
    By Total_Value = By.xpath("/html/body/app-root/div[1]/div/div[3]/app-approve-status/section/div/div/div[2]/div/div[2]/div/div[4]/span[2]");

    public RecentOrderQueuePageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOrders() throws IOException, InterruptedException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            test3.log(LogStatus.INFO, "Ready to Click Recent Order Queue List");
            Thread.sleep(2000);
            try {
                WebElement Recent_h = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(rec_h));
                String r = Recent_h.getText();
                System.out.println(r);
                if (r.equals("null")) {
                    test3.log(LogStatus.WARNING, "There is no orders in the Recent Order Queue List");
                    getScreenshot("RO_List");
                } else {
                    try {
                        WebElement ordId = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(order_id));
                        if (ordId.isDisplayed()) {
                            driver.findElement(select_order).click();
                            test3.log(LogStatus.PASS, "Clicked the Order from the Recent Order Queue List");
                        } else {
                            test3.log(LogStatus.FAIL, "Orders are not listed");
                        }
                    } catch (NoSuchElementException | TimeoutException e) {
                        test3.log(LogStatus.FAIL, "Orders are not listed in the Recent Order Queue List");
                    }
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "no orders in the Recent Order Queue List");
                getScreenshot("RO_List");
            }
        }
    }

    public void verifyOrderNo() throws IOException, InterruptedException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            Thread.sleep(5000);
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Order_No));
                String ordNo = orderId.getText();
                //String[] split = StringUtils.split(ordNo, ": ");
                if (ordNo.isEmpty()) {
                    test3.log(LogStatus.FAIL, " Order no is not displayed : " + ordNo);
                    getScreenshot("RO_OrdNo");
                } else {
                    test3.log(LogStatus.PASS, " Order no is displayed : " + ordNo);
                    //dataList.remove(21);
                    //dataList.add(21, split[2]);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, " Order no is not displayed");
                getScreenshot("RO_OrdNo");
            }
        }
    }

    public void verifyPatientName() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(PatientName));
                String ordId = orderId.getText();
                if (ordId.equals("null")) {
                    test3.log(LogStatus.FAIL, " Patient name is not displayed : " + ordId);
                    getScreenshot("RO_PName");
                } else {
                    test3.log(LogStatus.PASS, " Patient name is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, " Order no is not displayed");
                getScreenshot("RO_PName");
            }
        }
    }

    public void verifyOrderNumber() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Order_No2));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, " Order no is not displayed : " + ordId);
                    getScreenshot("RO_OrdNo2");
                } else {
                    test3.log(LogStatus.PASS, " Order no is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, " Order no is not displayed");
                getScreenshot("RO_OrdNo2");
            }
        }
    }

    public void verifyProfilePic() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement adminImage = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(profile_pic));
                String image = adminImage.getAttribute("src");
                if (image.contains(".jpeg") || image.contains(".jpg")) {
                    test3.log(LogStatus.PASS, "Profile Image shown as per the requirement");
                } else {
                    test3.log(LogStatus.FAIL, "Profile Image not shown as per the requirement");
                    getScreenshot("RO_ProImage");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.WARNING, " Profile Image is not displayed");
                getScreenshot("RO_ProImage");
            }
        }
    }

    public void verifyTestOptionName() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Test_Option_Name));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, " Test name is not displayed : " + ordId);
                    getScreenshot("RO_TName");
                } else {
                    test3.log(LogStatus.PASS, " Test name is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, " Test name is not displayed");
                getScreenshot("RO_TName");
            }
        }
    }

    public void verifyTestType() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement adminImage = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Test_type));
                String image = adminImage.getAttribute("src");
                if (image.contains("home")) {
                    test3.log(LogStatus.PASS, "Test type shown as per the requirement. Test Type : 'H' ");
                } else if (image.contains("self")) {
                    test3.log(LogStatus.PASS, "Test type shown as per the requirement. Test Type : 'S' ");
                } else {
                    test3.log(LogStatus.FAIL, "Test type not shown as per the requirement");
                    getScreenshot("RO_TType");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, " Test Type is not displayed");
                getScreenshot("RO_TType");
            }
        }
    }

    public void verifyTestOrderStatus() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Test_Status));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Test Status is not displayed : " + ordId);
                    getScreenshot("RO_TStatus");
                } else {
                    test3.log(LogStatus.PASS, "Test Status is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Test Status is not displayed");
                getScreenshot("RO_TStatus");
            }
        }
    }

    public void verifyOrderDateTime() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Order_Date_Time));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Order date and time is not displayed : " + ordId);
                    getScreenshot("RO_ODate");
                } else {
                    test3.log(LogStatus.PASS, "Order date and time is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Order date and time is not displayed");
                getScreenshot("RO_ODate");
            }
        }
    }

    public void verifyScheduleDateTime() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Schedule_Date_Time));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Scheduled date and time is not displayed : " + ordId);
                    getScreenshot("RO_SDate");
                } else {
                    test3.log(LogStatus.PASS, "Scheduled date and time is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.WARNING, "Scheduled date and time is not displayed");
                getScreenshot("RO_SDate");
            }
        }
    }

    public void verifyPaymentDetailsText() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Payment_Details_Text));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Payment details text is not displayed : " + ordId);
                    getScreenshot("RO_PayDText");
                } else {
                    test3.log(LogStatus.PASS, "Payment details text is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Payment details text is not displayed");
                getScreenshot("RO_PayDText");
            }
        }
    }

    public void verifyTestNameValue() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Test_option_name));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Test name is not displayed : " + ordId);
                    getScreenshot("RO_TAName");
                } else {
                    test3.log(LogStatus.PASS, "Test name is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Test name is not displayed");
                getScreenshot("RO_TAName");
            }
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Test_total_value));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Test total value is not displayed : " + ordId);
                    getScreenshot("RO_TTValue");
                } else {
                    test3.log(LogStatus.PASS, "Test total value is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Test total value is not displayed");
                getScreenshot("RO_TTValue");
            }
        }
    }

    public void verifyShippingNameValue() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Shipping_Charge_Text));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Shipping Charge Text is not displayed : " + ordId);
                    getScreenshot("RO_ShipText");
                } else if (ordId.contains("Ship") || ordId.contains("FedEx")) {
                    test3.log(LogStatus.PASS, "Shipping Charge Text is displayed : " + ordId);
                    try {
                        WebElement ordeId = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(Shipping_Charge_Value));
                        String orId = ordeId.getText();
                        if (orId == null) {
                            test3.log(LogStatus.FAIL, "Shipping Charge value is not displayed : " + orId);
                            getScreenshot("RO_ShipValue");
                        } else {
                            test3.log(LogStatus.PASS, "Shipping Charge value is displayed : " + orId);
                        }
                    } catch (NoSuchElementException | TimeoutException e) {
                        test3.log(LogStatus.WARNING, "Shipping Charge value is not displayed");
                        getScreenshot("RO_ShipValue");
                    }
                } else {
                    test3.log(LogStatus.SKIP, "Shipping Charge Text is not available");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.WARNING, "Shipping Charge Text is not displayed");
                getScreenshot("RO_ShipText");
            }
        }
    }

    public void verifyTaxNameValue() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Tax_text));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Tax Text is not displayed : " + ordId);
                    getScreenshot("RO_TaxText");
                } else {
                    test3.log(LogStatus.PASS, "Tax Text is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Tax Text is not displayed");
                getScreenshot("RO_TaxText");
            }
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Tax_Value));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Tax Value is not displayed : " + ordId);
                    getScreenshot("RO_TaxValue");
                } else {
                    test3.log(LogStatus.PASS, "Tax Value is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Tax Value is not displayed");
                getScreenshot("RO_TaxValue");
            }
        }
    }

    public void verifyTotalNameValue() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Total_text));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Total Text is not displayed : " + ordId);
                    getScreenshot("RO_TotalText");
                } else {
                    test3.log(LogStatus.PASS, "Total Text is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Total Text is not displayed");
                getScreenshot("RO_TotalText");
            }
            try {
                WebElement orderId = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(Total_Value));
                String ordId = orderId.getText();
                if (ordId == null) {
                    test3.log(LogStatus.FAIL, "Total Value is not displayed : " + ordId);
                    getScreenshot("RO_TotalValue");
                } else {
                    test3.log(LogStatus.PASS, "Total Value is displayed : " + ordId);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Total Value is not displayed");
                getScreenshot("RO_TotalValue");
            }
        }
    }

    public void verifyLabDetails(String L, String C) throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement testType = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(test_type));
                String a = testType.getAttribute("src");
                if (a.contains("home%20test%20icon.png")) {
                    WebElement lab = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(lab_details_home));
                    String text = lab.getText();
                    if (L.equals(text)) {
                        test3.log(LogStatus.PASS, "Lab details text shown as per the requirement : " + text);
                    } else {
                        test3.log(LogStatus.FAIL, "Lab details text not shown as per the requirement : " + text);
                        getScreenshot("RO_Lab");
                    }
                } else {
                    WebElement lab = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(lab_details_self));
                    String text = lab.getText();
                    if (L.equals(text)) {
                        test3.log(LogStatus.PASS, "Lab details text shown as per the requirement : " + text);
                    } else {
                        test3.log(LogStatus.FAIL, "Lab details text not shown as per the requirement : " + text);
                        getScreenshot("RO_Lab");
                    }
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Lab details text not visible ");
                getScreenshot("RO_Lab");
            }
            try {
                WebElement cLab = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(choose_lab));
                String text = cLab.getText();
                //System.out.println(text);
                if (C.equals(text)) {
                    test3.log(LogStatus.PASS, "Choose Lab text shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Choose Lab text not shown as per the requirement : " + text);
                    getScreenshot("RO_ChooseLab");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Choose Lab text not visible ");
                getScreenshot("RO_ChooseLab");
            }
            try {
                WebElement nLab = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(lab_name));
                String text = nLab.getText();
                //System.out.println(text);
                if (text == null) {
                    test3.log(LogStatus.FAIL, "Lab name not shown as per the requirement : " + text);
                    getScreenshot("RO_ChooseLab");
                } else {
                    test3.log(LogStatus.PASS, "Lab name shown as per the requirement : " + text);
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Lab name not visible ");
                getScreenshot("RO_LabName");
            }
        }
    }

    public void verifyButtons(String R, String A, String RRT, String RCB, String RRB, String AHN, String ACL, String ACF) throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement rej = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(reject));
                String text = rej.getText();
                //System.out.println(text);
                if (R.equals(text)) {
                    test3.log(LogStatus.PASS, "Reject name shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Reject name not shown as per the requirement : " + text);
                    getScreenshot("RO_RejName");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Reject name not visible ");
                getScreenshot("RO_RejName");
            }
            try {
                WebElement app = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(approve));
                String text = app.getText();
                //System.out.println(text);
                if (A.equals(text)) {
                    test3.log(LogStatus.PASS, "Approve name shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Approve name not shown as per the requirement : " + text);
                    getScreenshot("RO_ApprName");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Approve name not visible ");
                getScreenshot("RO_ApprName");
            }
            try {
                driver.findElement(approve).click();
                test3.log(LogStatus.PASS, "Approve Button Clicked");
                try {
                    WebElement appBox = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(app_text));
                    if (appBox.isDisplayed()) {
                        test3.log(LogStatus.PASS, "Approved Confirmation popup opened");
                        WebElement ageT = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(app_text));
                        String text = ageT.getText();
                        if (AHN.equals(text)) {
                            test3.log(LogStatus.PASS, "Approve popup text shown as per the requirement : " + text);
                        } else {
                            test3.log(LogStatus.FAIL, "Approve popup text not shown as per the requirement : " + text);
                            getScreenshot("RO_AHName");
                        }
                        WebElement rejCT = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(app_close));
                        String text1 = rejCT.getText();
                        if (ACL.equals(text1)) {
                            test3.log(LogStatus.PASS, "Approve - Close button name shown as per the requirement : " + text1);
                        } else {
                            test3.log(LogStatus.FAIL, "Approve - Close button name not shown as per the requirement : " + text1);
                            getScreenshot("RO_AClName");
                        }
                        WebElement rejRT = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(app_confirm));
                        String text2 = rejRT.getText();
                        if (ACF.equals(text2)) {
                            test3.log(LogStatus.PASS, "Approve - Confirm button name shown as per the requirement : " + text2);
                        } else {
                            test3.log(LogStatus.FAIL, "Approve - Confirm button name not shown as per the requirement : " + text2);
                            getScreenshot("RO_ACfName");
                        }
                        WebElement rejC = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(app_close));
                        rejC.click();
                        test3.log(LogStatus.INFO, "Approve - Close button clicked");
                    } else {
                        test3.log(LogStatus.FAIL, "Approved popup not opened");
                        getScreenshot("RO_ABox");
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test3.log(LogStatus.FAIL, "Approved popup not visible ");
                    getScreenshot("RO_ABox");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Approve Button not visible ");
                getScreenshot("RO_AButton");
            }
            try {
                driver.findElement(reject).click();
                test3.log(LogStatus.PASS, "Reject Button Clicked");
                try {
                    WebElement rejBox = new WebDriverWait(driver, 1)
                            .until(driver -> driver.findElement(rej_reason_text));
                    if (rejBox.isDisplayed()) {
                        test3.log(LogStatus.PASS, "Rejected Reason text box opened");
                        WebElement ageT = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(rej_reason_text));
                        String text = ageT.getText();
                        if (RRT.equals(text)) {
                            test3.log(LogStatus.PASS, "Rejected Reason name shown as per the requirement : " + text);
                        } else {
                            test3.log(LogStatus.FAIL, "Rejected Reason name not shown as per the requirement : " + text);
                            getScreenshot("RO_RRName");
                        }
                        WebElement rejCT = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(rej_cancel));
                        String text1 = rejCT.getText();
                        if (RCB.equals(text1)) {
                            test3.log(LogStatus.PASS, "Rejected Reason Cancel button name shown as per the requirement : " + text1);
                        } else {
                            test3.log(LogStatus.FAIL, "Rejected Reason Cancel button name not shown as per the requirement : " + text1);
                            getScreenshot("RO_RRCBName");
                        }
                        WebElement rejRT = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(rej_reject));
                        String text2 = rejRT.getText();
                        if (RRB.equals(text2)) {
                            test3.log(LogStatus.PASS, "Rejected Reason Reject button name shown as per the requirement : " + text2);
                        } else {
                            test3.log(LogStatus.FAIL, "Rejected Reason Reject button name not shown as per the requirement : " + text2);
                            getScreenshot("RO_RRRBName");
                        }
                        WebElement rejC = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(rej_cancel));
                        rejC.click();
                        test3.log(LogStatus.INFO, "Rejected Reason Cancel button clicked");
                    } else {
                        test3.log(LogStatus.FAIL, "Rejected popup not opened");
                        getScreenshot("RO_RBox");
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test3.log(LogStatus.FAIL, "Rejected popup not visible ");
                    getScreenshot("RO_RBox");
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Reject Button not visible ");
                getScreenshot("RO_RButton");
            }
        }
    }

    public void setOrderConfirmation(String C, String RR) throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            String url = driver.getCurrentUrl();
            //System.out.println(url);
            if (url.contains("order-track")) {
                WebElement dash = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(lad_dashboard));
                dash.click();
                try {
                    WebElement orderId = new WebDriverWait(driver, 10)
                            .until(driver -> driver.findElement(order_id));
                    if (orderId.isDisplayed()) {
                        driver.findElement(select_order).click();
                        test3.log(LogStatus.PASS, "Clicked the Order from the Recent Order Queue List");
                    } else {
                        test3.log(LogStatus.WARNING, "There is no orders in the Recent Order Queue List");
                        getScreenshot("RO_List");
                    }
                } catch (NoSuchElementException | IOException | TimeoutException e) {
                    test3.log(LogStatus.WARNING, "There is no orders in the Recent Order Queue List");
                    getScreenshot("RO_List");
                }
            } else {
                test3.log(LogStatus.INFO, "Pages already stayed in the Order view page");
            }
            try {
                if (C.equals("No")) {
                    try {
                        WebElement rej = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(approve));
                        rej.click();
                        test3.log(LogStatus.INFO, "Approve button clicked");
                        WebElement rejRB = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(app_confirm));
                        rejRB.click();
                        test3.log(LogStatus.INFO, "Approve - Confirm button clicked");
                    } catch (NoSuchElementException e) {
                        test3.log(LogStatus.FAIL, "Approve button not visible");
                        getScreenshot("RO_ABut");
                    }
                } else {
                    try {
                        WebElement re = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(reject));
                        re.click();
                        test3.log(LogStatus.PASS, "Reject button clicked");
                        WebElement rejRe = new WebDriverWait(driver, 2)
                                .until(driver -> driver.findElement(rej_reason));
                        rejRe.sendKeys(RR);
                        test3.log(LogStatus.INFO, "Rejected Reason value passed : " + RR);
                        WebElement rejRB = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(rej_reject));
                        rejRB.click();
                        test3.log(LogStatus.INFO, "Reject Reason - Reject button clicked");
                    } catch (NoSuchElementException | TimeoutException e) {
                        test3.log(LogStatus.FAIL, "Rejected Reason text box not opened");
                        getScreenshot("RO_RRBox");
                    }
                }
                getOrderStatus();
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Approve and Reject buttons are not visible ");
                getScreenshot("RO_ARButton");
            }
        }
    }

    public void verifyPatientDetails(String A, String G, String P, String H, String W, String B, String AD) throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement ageT = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(age_text));
                String text = ageT.getText();
                //System.out.println(text);
                if (A.equals(text)) {
                    test3.log(LogStatus.PASS, "Age name shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Age name not shown as per the requirement : " + text);
                    getScreenshot("RO_AgeName");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Age name not visible ");
                getScreenshot("RO_AgeName");
            }
            try {
                WebElement ageV = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(age_value));
                String text = ageV.getText();
                //System.out.println(text);
                if (text == null) {
                    test3.log(LogStatus.FAIL, "Age value not shown as per the requirement : " + text);
                    getScreenshot("RO_AgeValue");
                } else {
                    test3.log(LogStatus.PASS, "Age value shown as per the requirement : " + text);
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Age value not visible ");
                getScreenshot("RO_AgeValue");
            }
            try {
                WebElement genT = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(gender_text));
                String text = genT.getText();
                //System.out.println(text);
                if (G.equals(text)) {
                    test3.log(LogStatus.PASS, "Gender name shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Gender name not shown as per the requirement : " + text);
                    getScreenshot("RO_GenderName");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Gender name not visible ");
                getScreenshot("RO_GenderName");
            }
            try {
                WebElement genV = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(gender_value));
                String text = genV.getText();
                //System.out.println(text);
                if (text == null) {
                    test3.log(LogStatus.FAIL, "Gender value not shown as per the requirement : " + text);
                    getScreenshot("RO_GenderValue");
                } else {
                    test3.log(LogStatus.PASS, "Gender value shown as per the requirement : " + text);
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Gender value not visible ");
                getScreenshot("RO_GenderValue");
            }
            try {
                WebElement phoT = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(phone_text));
                String text = phoT.getText();
                //System.out.println(text);
                if (P.equals(text)) {
                    test3.log(LogStatus.PASS, "Phone name shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Phone name not shown as per the requirement : " + text);
                    getScreenshot("RO_PhoneName");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Phone name not visible ");
                getScreenshot("RO_PhoneName");
            }
            try {
                WebElement phoV = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(phone_value));
                String text = phoV.getText();
                //System.out.println(text);
                if (text == null) {
                    test3.log(LogStatus.FAIL, "Phone value not shown as per the requirement : " + text);
                    getScreenshot("RO_PhoneValue");
                } else {
                    test3.log(LogStatus.PASS, "Phone value shown as per the requirement : " + text);
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Phone value not visible ");
                getScreenshot("RO_PhoneValue");
            }
            try {
                WebElement heightT = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(height_text));
                String text = heightT.getText();
                //System.out.println(text);
                if (H.equals(text)) {
                    test3.log(LogStatus.PASS, "Height name shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Height name not shown as per the requirement : " + text);
                    getScreenshot("RO_HeightName");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Height name not visible ");
                getScreenshot("RO_HeightName");
            }
            try {
                WebElement heightV = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(height_value));
                String text = heightV.getText();
                //System.out.println(text);
                if (text == null) {
                    test3.log(LogStatus.FAIL, "Height value not shown as per the requirement : " + text);
                    getScreenshot("RO_HeightValue");
                } else {
                    test3.log(LogStatus.PASS, "Height value shown as per the requirement : " + text);
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Height value not visible ");
                getScreenshot("RO_HeightValue");
            }
            try {
                WebElement weightT = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(weight_text));
                String text = weightT.getText();
                //System.out.println(text);
                if (W.equals(text)) {
                    test3.log(LogStatus.PASS, "Weight name shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Weight name not shown as per the requirement : " + text);
                    getScreenshot("RO_WeightName");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Weight name not visible ");
                getScreenshot("RO_WeightName");
            }
            try {
                WebElement weightV = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(weight_value));
                String text = weightV.getText();
                //System.out.println(text);
                if (text == null) {
                    test3.log(LogStatus.FAIL, "Weight value not shown as per the requirement : " + text);
                    getScreenshot("RO_WeightValue");
                } else {
                    test3.log(LogStatus.PASS, "Weight value shown as per the requirement : " + text);
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Weight value not visible ");
                getScreenshot("RO_WeightValue");
            }
            try {
                WebElement bloodT = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(blood_text));
                String text = bloodT.getText();
                //System.out.println(text);
                if (B.equals(text)) {
                    test3.log(LogStatus.PASS, "Blood name shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Blood name not shown as per the requirement : " + text);
                    getScreenshot("RO_BloodName");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Blood name not visible ");
                getScreenshot("RO_BloodName");
            }
            try {
                WebElement bloodV = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(blood_value));
                String text = bloodV.getText();
                //System.out.println(text);
                if (text == null) {
                    test3.log(LogStatus.FAIL, "Blood value not shown as per the requirement : " + text);
                    getScreenshot("RO_BloodValue");
                } else {
                    test3.log(LogStatus.PASS, "Blood value shown as per the requirement : " + text);
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Blood value not visible ");
                getScreenshot("RO_BloodValue");
            }
            try {
                WebElement addT = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(address_text));
                String text = addT.getText();
                //System.out.println(text);
                if (AD.equals(text)) {
                    test3.log(LogStatus.PASS, "Address name shown as per the requirement : " + text);
                } else {
                    test3.log(LogStatus.FAIL, "Address name not shown as per the requirement : " + text);
                    getScreenshot("RO_AddressName");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Address name not visible ");
                getScreenshot("RO_AddressName");
            }
            try {
                WebElement addV = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(address_value));
                String text = addV.getText();
                //System.out.println(text);
                if (text == null) {
                    test3.log(LogStatus.FAIL, "Address value not shown as per the requirement : " + text);
                    getScreenshot("RO_AddressValue");
                } else {
                    test3.log(LogStatus.PASS, "Address value shown as per the requirement : " + text);
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Address value not visible ");
                getScreenshot("RO_AddressValue");
            }
        }
    }

    public void verifyAddMemberDetails(String A) throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement memH = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(add_mem_text));
                String text = memH.getText();
                //System.out.println(text);
                if (A.equals(text)) {
                    test3.log(LogStatus.PASS, "Add on member header name shown as per the requirement : " + text);
                    ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
                    try {
                        WebElement addN = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_one_name));
                        String oneN = addN.getText();
                        //System.out.println(text);
                        if (oneN == null) {
                            test3.log(LogStatus.FAIL, "First patient name not shown as per the requirement : " + oneN);
                            getScreenshot("RO_FN");
                        } else {
                            test3.log(LogStatus.PASS, "First patient name shown as per the requirement : " + oneN);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "First patient name not visible ");
                        getScreenshot("RO_FN");
                    }
                    try {
                        WebElement addA = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_one_age));
                        String oneA = addA.getText();
                        //System.out.println(text);
                        if (oneA == null) {
                            test3.log(LogStatus.FAIL, "First patient age not shown as per the requirement : " + oneA);
                            getScreenshot("RO_FA");
                        } else {
                            test3.log(LogStatus.PASS, "First patient age shown as per the requirement : " + oneA);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "First patient age not visible ");
                        getScreenshot("RO_FA");
                    }
                    try {
                        WebElement addG = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_one_gender));
                        String oneG = addG.getText();
                        //System.out.println(text);
                        if (oneG == null) {
                            test3.log(LogStatus.FAIL, "First patient gender not shown as per the requirement : " + oneG);
                            getScreenshot("RO_FG");
                        } else {
                            test3.log(LogStatus.PASS, "First patient gender shown as per the requirement : " + oneG);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "First patient gender not visible ");
                        getScreenshot("RO_FG");
                    }
                    try {
                        WebElement addN = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_two_name));
                        String oneN = addN.getText();
                        //System.out.println(text);
                        if (oneN == null) {
                            test3.log(LogStatus.FAIL, "Second patient name not shown as per the requirement : " + oneN);
                            getScreenshot("RO_SN");
                        } else {
                            test3.log(LogStatus.PASS, "Second patient name shown as per the requirement : " + oneN);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "Second patient name not visible ");
                        getScreenshot("RO_SN");
                    }
                    try {
                        WebElement addA = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_two_age));
                        String oneA = addA.getText();
                        //System.out.println(text);
                        if (oneA == null) {
                            test3.log(LogStatus.FAIL, "Second patient age not shown as per the requirement : " + oneA);
                            getScreenshot("RO_SA");
                        } else {
                            test3.log(LogStatus.PASS, "Second patient age shown as per the requirement : " + oneA);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "Second patient age not visible ");
                        getScreenshot("RO_SA");
                    }
                    try {
                        WebElement addG = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_two_gender));
                        String oneG = addG.getText();
                        //System.out.println(text);
                        if (oneG == null) {
                            test3.log(LogStatus.FAIL, "Second patient gender not shown as per the requirement : " + oneG);
                            getScreenshot("RO_SG");
                        } else {
                            test3.log(LogStatus.PASS, "Second patient gender shown as per the requirement : " + oneG);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "Second patient gender not visible ");
                        getScreenshot("RO_SG");
                    }
                    try {
                        WebElement addN = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_three_name));
                        String oneN = addN.getText();
                        //System.out.println(text);
                        if (oneN == null) {
                            test3.log(LogStatus.FAIL, "Third patient name not shown as per the requirement : " + oneN);
                            getScreenshot("RO_TN");
                        } else {
                            test3.log(LogStatus.PASS, "Third patient name shown as per the requirement : " + oneN);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "Third patient name not visible ");
                        getScreenshot("RO_TN");
                    }
                    try {
                        WebElement addA = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_three_age));
                        String oneA = addA.getText();
                        //System.out.println(text);
                        if (oneA == null) {
                            test3.log(LogStatus.FAIL, "Third patient age not shown as per the requirement : " + oneA);
                            getScreenshot("RO_TA");
                        } else {
                            test3.log(LogStatus.PASS, "Third patient age shown as per the requirement : " + oneA);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "Third patient age not visible ");
                        getScreenshot("RO_TA");
                    }
                    try {
                        WebElement addG = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_three_gender));
                        String oneG = addG.getText();
                        //System.out.println(text);
                        if (oneG == null) {
                            test3.log(LogStatus.FAIL, "Third patient gender not shown as per the requirement : " + oneG);
                            getScreenshot("RO_TG");
                        } else {
                            test3.log(LogStatus.PASS, "Third patient gender shown as per the requirement : " + oneG);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "Third patient gender not visible ");
                        getScreenshot("RO_TG");
                    }
                    try {
                        WebElement addN = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_four_name));
                        String oneN = addN.getText();
                        //System.out.println(text);
                        if (oneN == null) {
                            test3.log(LogStatus.FAIL, "Fourth patient name not shown as per the requirement : " + oneN);
                            getScreenshot("RO_FouN");
                        } else {
                            test3.log(LogStatus.PASS, "Fourth patient name shown as per the requirement : " + oneN);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "Fourth patient name not visible ");
                        getScreenshot("RO_FouN");
                    }
                    try {
                        WebElement addA = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_four_age));
                        String oneA = addA.getText();
                        //System.out.println(text);
                        if (oneA == null) {
                            test3.log(LogStatus.FAIL, "Fourth patient age not shown as per the requirement : " + oneA);
                            getScreenshot("RO_FouA");
                        } else {
                            test3.log(LogStatus.PASS, "Fourth patient age shown as per the requirement : " + oneA);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "Fourth patient age not visible ");
                        getScreenshot("RO_FouA");
                    }
                    try {
                        WebElement addG = new WebDriverWait(driver, 1)
                                .until(driver -> driver.findElement(add_four_gender));
                        String oneG = addG.getText();
                        //System.out.println(text);
                        if (oneG == null) {
                            test3.log(LogStatus.FAIL, "Fourth patient gender not shown as per the requirement : " + oneG);
                            getScreenshot("RO_FouG");
                        } else {
                            test3.log(LogStatus.PASS, "Fourth patient gender shown as per the requirement : " + oneG);
                        }
                    } catch (NoSuchElementException | IOException | TimeoutException e) {
                        test3.log(LogStatus.SKIP, "Fourth patient gender not visible ");
                        getScreenshot("RO_FouG");
                    }
                } else {
                    test3.log(LogStatus.FAIL, "Add on member header name not shown as per the requirement : " + text);
                    getScreenshot("RO_MemHeader");
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.WARNING, "Add on members window not available ");
                getScreenshot("RO_MemHeader");
            }
        }
    }

    public void verifyCopyRights() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement cR = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(copy_rights));
                String text = cR.getText();
                //System.out.println(text);
                if (text == null) {
                    test3.log(LogStatus.FAIL, "Copy Rights text not shown as per the requirement : " + text);
                    getScreenshot("RO_CR");
                } else {
                    test3.log(LogStatus.PASS, "Copy Rights text shown as per the requirement : " + text);
                }
            } catch (NoSuchElementException | IOException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Copy Rights text not visible ");
                getScreenshot("RO_CR");
            }
        }
    }

    public void getOrderStatus() throws IOException {
        if(driver.getCurrentUrl().contains("order-track")) {
            test3.log(LogStatus.INFO, "It's stayed in Order track page");
        } else {
            try {
                WebElement ordStatus = new WebDriverWait(driver, 1)
                        .until(driver -> driver.findElement(order_status));
                String text4 = ordStatus.getText();
                if (text4 == null) {
                    test3.log(LogStatus.FAIL, "Order Status not showing");
                    getScreenshot("RO_OrderStatus");
                } else {
                    test3.log(LogStatus.PASS, "Order Status is : " + text4);
                }
            } catch (NoSuchElementException | TimeoutException e) {
                test3.log(LogStatus.FAIL, "Order Status not visible");
                getScreenshot("RO_OrdStatus");
            }
        }
    }

}