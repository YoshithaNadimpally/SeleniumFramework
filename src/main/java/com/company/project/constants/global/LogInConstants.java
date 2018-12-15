package com.company.project.constants.global;

/** Created by pavankovurru on 12/1/16. */
public class LogInConstants {

  // test data
  /**
   * @author - Yoshitha
   * @Date -11/14/2018
   * @Objective -Test data
   */
  public static final String DATA_USERNAME = "admin";
  public static final String DATA_PASSWORD = "admin123";
  public static final String DATA_INCORRECT_USERNAME = "admin123";
  public static final String DATA_INCORRECT_PASSWORD = "Admin";
  public static final String DATA_ERRORMESSAGE_EMPTY_USERNAME ="Username cannot be empty";
  public static final String DATA_ERRORMESSAGE_EMPTY_PASSWORD = "Password cannot be empty";
  public static final String DATA_ERRORMESSAGE_INCORRECT_USERNAME = "Invalid credentials";
  public static final String DATA_ERRORMESSAGE_INCORRECT_PASSWORD = "Invalid credentials";
  public static final String DATA_ERRORMESSAGE_UPPERCASE_PASSWORD = "Invalid credentials";
  public static final String DATA_ERRORMESSAGE_INCORRECT_USERNAME_PASSWORD = "Invalid credentials";



  // element locators
  /**
   * @author - Yoshitha
   * @Date -11/14/2018
   * @Objective - Element locators for username,password,login button and error message
   */
  public static final String XPATH_USERNAME_TEXTFIELD ="//input[@id='txtUsername']";
  public static final String XPATH_PASSWORD_TEXTFIELD = "//input[@id='txtPassword']";
  public static final String XPATH_LOGIN_BUTTON = "//input[@id='btnLogin']";
  public static final String ID_ERROR_MESSAGE = "spanMessage";

  public static final String LOCATOR_SWITCH_BUTTON_XPATH = "//div[contains(text(),'Switch')]";
}
