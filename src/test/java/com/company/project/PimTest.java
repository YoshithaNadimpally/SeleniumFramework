package com.company.project;

import com.company.project.constants.global.AdminConstants;
import com.company.project.constants.global.PimConstants;
import com.company.project.pages.global.AdminPage;
import com.company.project.pages.global.LoginPage;
import com.company.project.pages.global.PimPage;
import com.company.project.utilities.SeleniumUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PimTest {

    public static Logger log = LogManager.getLogger();
    private WebDriver driver = null;
    private LoginPage loginPage;
    private AdminPage adminPage;
    private PimPage pimPage ;
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
        adminPage = new AdminPage(driver);
        pimPage = new PimPage(driver);

        //Logging in
        loginPage.login();
    }

    @Test(priority = 1)
    public void validateSearchingEmployee(){
        pimPage.navigateToEmployeeList();
        pimPage.sendEmployeeNameInEmployeeList("Fiona Grace");
        pimPage.sendIdInEmployeeList("12345");
        pimPage.sendEmploymentStatusInEmployeeList(PimConstants.ID_EMPLOYMENT_STATUS_IN_EMPLOYEE_LIST);
        pimPage.sendIncludeInEmployeeList(PimConstants.ID_INCLUDE_IN_EMPLOYEE_LIST);
        pimPage.sendSuperviorNameInEmployeeList("Thomas Fleming");
        pimPage.sendJobTitleInEmployeeList(PimConstants.ID_JOB_TITLE_IN_EMPLOYEE_LIST);
        pimPage.sendSubunitInEmployeeList(PimConstants.ID_SUB_UNIT_IN_EMPLOYEE_LIST);
        pimPage.clickSearchButtonInEmployeeList();
        seleniumUtil.sleep(10);
    }
}
