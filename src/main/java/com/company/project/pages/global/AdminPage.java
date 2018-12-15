package com.company.project.pages.global;

import com.company.project.constants.global.AdminConstants;
import com.company.project.constants.global.PimConstants;
import com.company.project.utilities.SeleniumUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

  public WebDriver driver;
  public SeleniumUtil seleniumUtil = new SeleniumUtil();
  public static Logger log = LogManager.getLogger();

  public AdminPage(WebDriver driver) {
    this.driver = driver;
  }


  public void navigateToUsers(){
      seleniumUtil.hover(driver,By.id(AdminConstants.ID_ADMIN_TAB));
      seleniumUtil.hover(driver,By.id(AdminConstants.ID_USER_MANAGEMENT_TAB));
      seleniumUtil.hoverAndClick(driver,By.id(AdminConstants.ID_USERS));
  }



  /** @author - Yoshitha
   * @Date -11/15/2018
   * @Objective -sending username
   */
  public void sendUserName(String username) {
      seleniumUtil.sendKeys(driver, By.xpath(AdminConstants.ID_SEARCH_USERNAME_TEXTFIELD), username);
  }
    /** @author - Yoshitha
     * @Date -11/15/2018
     * @Objective -sending ID EMPLOYEE NAME
     */
    public void sendEmployeeName(String employeename) {
        seleniumUtil.sendKeys(driver, By.xpath(AdminConstants.ID_SEARCH_EMPLOYEE_NAME_TEXTFIELD), employeename);
    }

    /**
     * @author - Yoshitha
     * @Date -11/15/2018
     * @Objective - Clicking add button
     */

    public void clickAdd() {
        seleniumUtil.click(driver, By.id(AdminConstants.ID_ADD_BUTTON));
    }

    public void clickDeleteUser(){
        seleniumUtil.click(driver,By.id(AdminConstants.ID_DELETE_BUTTON));
    }

    public void clickResetUser(){
        seleniumUtil.click(driver,By.id(AdminConstants.ID_RESET_BUTTON));
    }

    public void clickSearchUser(){
        seleniumUtil.click(driver,By.id(AdminConstants.ID_SEARCH_BUTTON));
    }


    //searching user

    public void sendUsernameInSearching(String username){
     seleniumUtil.sendKeys(driver,By.id(AdminConstants.ID_SEARCH_USERNAME_TEXTFIELD),username);
    }

    public void sendUserRoleInSearching(String idSearchUserRoleDropdown){
        seleniumUtil.sendKeys(driver,By.id(AdminConstants.ID_SEARCH_USERROLE_DROPDOWN),"ESS");
    }

    public void sendEmployeeNameInSearching(String employeename ){
        seleniumUtil.sendKeys(driver,By.id(AdminConstants.ID_SEARCH_EMPLOYEE_NAME_TEXTFIELD),employeename);
    }

    public void sendStatusInSearching(String idSearchStatusDropdown){
        seleniumUtil.sendKeys(driver,By.id(AdminConstants.ID_SEARCH_STATUS_DROPDOWN),"disabled");
    }




    public void clickSearchButton(){
        seleniumUtil.click(driver,By.id(AdminConstants.ID_SEARCH_BUTTON));
    }

    public void clickResetButton(){
        seleniumUtil.click(driver,By.id(AdminConstants.ID_RESET_BUTTON));
    }

    //Adding user

    public void sendUserRoleInAdding(String idAddUserroleDropdown){
        seleniumUtil.sendKeys(driver, By.id(AdminConstants.ID_ADD_USERROLE_DROPDOWN),"ESS");

    }

    public void sendEmployeeNameInAdding(String employeename){
        seleniumUtil.sendKeys(driver,By.id(AdminConstants.ID_ADD_EMPLOYEENAME_TEXTFIELD),employeename);
    }

    public void sendUsernameInAdding(String username){
        seleniumUtil.sendKeys(driver,By.id(AdminConstants.ID_ADD_USERNAME_TEXTFIELD),username);
    }

    public void sendStatusInAdding(String idAddStatusDropdown){
        seleniumUtil.sendKeys(driver,By.id(AdminConstants.ID_ADD_STATUS_DROPDOWN),"Disabled");
    }

    public void sendPasswordInAdding(String password){
        seleniumUtil.sendKeys(driver,By.id(AdminConstants.ID_ADD_PASSWORD_TEXTFIELD),password);
    }

    public void sendConfirmPasswordInAdding(String confirmpassword){
        seleniumUtil.sendKeys(driver,By.id(AdminConstants.ID_ADD_CONFIRM_PASSWORD_TEXTFIELD),confirmpassword);
    }

    public void clickSaveButton() {
        seleniumUtil.click(driver, By.id(AdminConstants.ID_ADD_SAVE_BUTTON));
    }

    public void clickCancelButton(){
        seleniumUtil.click(driver,By.id(AdminConstants.ID_ADD_CANCEL_BUTTON));
    }



}
