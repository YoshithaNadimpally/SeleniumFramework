package com.company.project;

import com.company.project.constants.global.AdminConstants;
import com.company.project.pages.global.AdminPage;
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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AdminTest {
    public static Logger log = LogManager.getLogger();
    private WebDriver driver = null;
    private LoginPage loginPage;
    private AdminPage adminPage;
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

        //Logging in
        loginPage.login();
    }
    /**
     * @author - Yoshitha
     * @Date -11/14/2018
     * @Objective -validating uppercase username
     */
    //@Test(priority = 1)
    public void validate(){
        adminPage.navigateToUsers();
        seleniumUtil.sendKeys(driver, By.id(AdminConstants.ID_SEARCH_USERNAME_TEXTFIELD),"Yoshitha");
        seleniumUtil.sendKeys(driver, By.id(AdminConstants.ID_SEARCH_USERROLE_DROPDOWN),"ESS");
        seleniumUtil.sendKeys(driver, By.id(AdminConstants.ID_SEARCH_EMPLOYEE_NAME_TEXTFIELD),"Yoshitha");
        seleniumUtil.sendKeys(driver, By.id(AdminConstants.ID_SEARCH_STATUS_DROPDOWN),"Disabled");

        //adminPage.clickAdd();
        seleniumUtil.sleep(10);
    }

    //@Test(priority = 2)
    public void validateAddingUser1(){
        adminPage.navigateToUsers();
        seleniumUtil.sendKeys(driver, By.id(AdminConstants.ID_SEARCH_USERNAME_TEXTFIELD),"User20181119134811");
        seleniumUtil.sendKeys(driver, By.id(AdminConstants.ID_SEARCH_USERROLE_DROPDOWN),"ESS");
        seleniumUtil.sendKeys(driver, By.id(AdminConstants.ID_SEARCH_EMPLOYEE_NAME_TEXTFIELD),"User20181119134811");
        seleniumUtil.sendKeys(driver, By.id(AdminConstants.ID_SEARCH_STATUS_DROPDOWN),"Disabled");
        adminPage.clickAdd();
        seleniumUtil.sleep(10);
    }

    @Test(priority = 1)
    public void validateAddingUser(){
        uniqueNumber = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        adminPage.navigateToUsers();
        adminPage.clickAdd();
        adminPage.sendUserRoleInAdding(AdminConstants.ID_ADD_USERROLE_DROPDOWN);
        adminPage.sendEmployeeNameInAdding("Hannah Flores");
        adminPage.sendUsernameInAdding("User"+uniqueNumber);
        adminPage.sendStatusInAdding(AdminConstants.ID_ADD_STATUS_DROPDOWN);
        adminPage.sendPasswordInAdding("12345678");
        adminPage.sendConfirmPasswordInAdding("12345678");
        adminPage.clickSaveButton();
        seleniumUtil.sleep(10);
    }

    @Test(priority = 2)
    public void validateSearchUser(){
        adminPage.navigateToUsers();
        adminPage.sendUsernameInSearching("User"+uniqueNumber);
        adminPage.sendUserRoleInSearching(AdminConstants.ID_SEARCH_USERROLE_DROPDOWN);
        adminPage.sendEmployeeNameInSearching("Hannah Flores");
        adminPage.sendStatusInSearching(AdminConstants.ID_SEARCH_STATUS_DROPDOWN);
        adminPage.clickSearchButton();
        seleniumUtil.sleep(10);
    }

    @Test(priority = 3)
    public void validateResetUser(){
        adminPage.navigateToUsers();
        adminPage.sendUsernameInSearching("User"+uniqueNumber);
        adminPage.sendUserRoleInSearching(AdminConstants.ID_SEARCH_USERROLE_DROPDOWN);
        adminPage.sendEmployeeNameInSearching("Hannah Flores");
        adminPage.sendStatusInSearching(AdminConstants.ID_SEARCH_STATUS_DROPDOWN);
        adminPage.clickResetButton();
        seleniumUtil.sleep(10);

    }

   // @Test(priority = 4)
    public void validateDeleteUser(){
       // String.format("//*[contains(text(),'%s')]/../preceding-sibling::*/input[@type='checkbox']","hannah.flores");
        adminPage.navigateToUsers();
        seleniumUtil. hoverAndClick(driver, By.xpath(AdminConstants.XPATH_DELETING_USER));
        adminPage.clickDeleteUser();
        seleniumUtil.sleep(10);

    }



    @AfterMethod
    public void logout() {
        log.info("Selenium Web Driver session terminated");
        driver.quit();
    }
}
