package com.company.project;

import com.company.project.constants.global.AdminJobConstants;
import com.company.project.pages.global.AdminJobPage;
import com.company.project.pages.global.LoginPage;
import com.company.project.utilities.SeleniumUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdminJobTest {
    public static Logger log = LogManager.getLogger();
    private WebDriver driver = null;
    private LoginPage loginPage;
    private AdminJobPage adminJobPage;
    private SeleniumUtil seleniumUtil = null;
    public String uniqueNumber = "";

    @BeforeMethod
    @Parameters({"url", "browser", "browserVersion", "targetRun"})
    public void login(String url, String browser, String browserVersion, String targetRun) {

        seleniumUtil = new SeleniumUtil();

        // Creating driver object based on browser stack configuration
        if (targetRun.equalsIgnoreCase("browserStack")) {
            driver = seleniumUtil.createBrowserStackDriver(url,browser,browserVersion);
        } else if (targetRun.equalsIgnoreCase("local")) {
            driver = seleniumUtil.createDriver(url,browser);
        } else {
            log.info("Invalid `runOn` value present in testNG.xml");
            throw new SkipException("Skipping tests");
        }

        log.info("Selenium Web Driver session initiated on -" + targetRun);

        loginPage = new LoginPage(driver);
        adminJobPage = new AdminJobPage(driver);


        //Logging in
        loginPage.login();
    }
   // Positive test cases for admin/job/jobtitle
    //add job title
    @Test(priority = 1)
      public void validate(){
        adminJobPage.navigateToJobTitles();
        adminJobPage.clickAdd();
        adminJobPage.sendJobTitleInAddingJobTitles("abc"+uniqueNumber);
       // seleniumUtil.sendKeys(driver, By.id(AdminJobConstants.ID_ADD_JOBTITLE_TEXTFIELD),"tester");
        seleniumUtil.sendKeys(driver, By.id(AdminJobConstants.ID_ADD_JOB_DESCRIPTION_TEXTFIELD),"AUTOMATION TESTING");
        //seleniumUtil.sendKeys(driver, By.id(AdminJobConstants.ID_ADD_JOB_SPECIFICATION_TEXTFIELD),"Yoshitha");
        seleniumUtil.sendKeys(driver, By.id(AdminJobConstants.ID_ADD_NOTE_TEXTFIELD),"ONLY WEBBASED");
        adminJobPage.clickSave();
        seleniumUtil.sleep(10);



    }

//positive test cases for admin/job/paygrades
    //add paygrades
    @Test(priority = 10)
    public void validatePayGrades(){
        adminJobPage.navigateToPayGrades();
        adminJobPage.payGradesAdd();
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_PAY_GRADES_NAME_TEXTFIELD),"TESTER");
        adminJobPage.payGradesSave();
        seleniumUtil.sleep(10);

    }

    @Test(priority = 11)
    public void validatePayGradesCancel(){
        adminJobPage.navigateToPayGrades();
        adminJobPage.payGradesAdd();
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_PAY_GRADES_NAME_TEXTFIELD),"TESTER");
        adminJobPage.payGradesCancel();
        seleniumUtil.sleep(10);
    }


 // positive test cases for admin/job/employement ststus

    @Test(priority = 20)
    public void validateEmployementStatus(){
        adminJobPage.navigateToEmployementStatus();
        adminJobPage.employementStatusAdd();
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_EMPLOYEMENT_STATUS_NAME_TEXTFIELD),"active");
        adminJobPage.employementStatusSave();
        seleniumUtil.sleep(10);
    }

    @Test(priority = 21)
    public void validateEmployementStatusCancel(){
        adminJobPage.navigateToEmployementStatus();
        adminJobPage.employementStatusAdd();
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_EMPLOYEMENT_STATUS_NAME_TEXTFIELD),"active");
        adminJobPage.employementStatusCancel();
        seleniumUtil.sleep(10);
    }





    @AfterMethod
    public void logout() {
        log.info("Selenium Web Driver session terminated");
        driver.quit();
    }
}
