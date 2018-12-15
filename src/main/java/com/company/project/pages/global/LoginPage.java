package com.company.project.pages.global;

import com.company.project.constants.global.LogInConstants;
import com.company.project.utilities.SeleniumUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  public WebDriver driver;
  public SeleniumUtil seleniumUtil = new SeleniumUtil();
  public static Logger log = LogManager.getLogger();

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }



  public void login(){
    sendUserName(LogInConstants.DATA_USERNAME);
    sendpassword(LogInConstants.DATA_PASSWORD);
    clickLogin();
  }

  /**
   * @author - Yoshitha
   * @Date -11/14/2018
   * @Objective -Sending Username
   */
  public void sendUserName(String username) {
    seleniumUtil.sendKeys(driver, By.xpath(LogInConstants.XPATH_USERNAME_TEXTFIELD), username);
  }

  /**
   * @author - Yoshitha
   * @Date -11/14/2018
   * @Objective -Sending Password
   */
  public void sendpassword(String password) {
    seleniumUtil.sendKeys(driver,By.xpath(LogInConstants.XPATH_PASSWORD_TEXTFIELD),password);
  }

  /**
   * @author - Yoshitha
   * @Date -11/14/2018
   * @Objective - Clicking login button
   */

  public void clickLogin() {
    seleniumUtil.click(driver, By.xpath(LogInConstants.XPATH_LOGIN_BUTTON));
  }


  /**
   * @author - Yoshitha
   * @Date -11/14/2018
   * @Objective - Getting error message
   */
  public String getErrorMessage() {
    return seleniumUtil.getText(driver,By.id(LogInConstants.ID_ERROR_MESSAGE));
  }
}
