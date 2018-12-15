package com.company.project.pages.global;

import com.company.project.constants.global.AdminConstants;
import com.company.project.constants.global.PimConstants;
import com.company.project.utilities.SeleniumUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDateTime;


public class PimPage {
  public WebDriver driver;
  public SeleniumUtil seleniumUtil = new SeleniumUtil();
  public static Logger log = LogManager.getLogger();

  public PimPage(WebDriver driver) {
    this.driver = driver;
  }

  public void navigateToEmployeeList() {
    seleniumUtil.hover(driver, By.id(PimConstants.ID_PIM_TAB));
    seleniumUtil.hoverAndClick(driver, By.id(PimConstants.ID_EMPLOYEE_LIST_TAB));

  }

  // Employee information in employee list
  public void sendEmployeeNameInEmployeeList(String employeeName) {
    seleniumUtil.sendKeys(
        driver, By.id(PimConstants.ID_EMPLOYEENAME_IN_EMPLOYEE_LIST), employeeName);
  }

  public void sendIdInEmployeeList(String id) {
    seleniumUtil.sendKeys(driver, By.id(PimConstants.ID_ID_IN_EMPLOYEE_LIST), id);
  }

  public void sendEmploymentStatusInEmployeeList(String employmentStatus) {
    seleniumUtil.sendKeys(
        driver, By.id(PimConstants.ID_EMPLOYMENT_STATUS_IN_EMPLOYEE_LIST), "Full-Time Permanent");
  }

  public void sendIncludeInEmployeeList(String include) {
    seleniumUtil.sendKeys(
        driver, By.id(PimConstants.ID_INCLUDE_IN_EMPLOYEE_LIST), "Current Employees Only");
  }

  public void sendSuperviorNameInEmployeeList(String supervisorname) {
    seleniumUtil.sendKeys(
        driver, By.id(PimConstants.ID_SUPERVISOR_NAME_IN_EMPLOYEE_LIST), supervisorname);
  }

  public void sendJobTitleInEmployeeList(String jobtitle) {
    seleniumUtil.sendKeys(driver, By.id(PimConstants.ID_JOB_TITLE_IN_EMPLOYEE_LIST), "IT Manager");
  }

  public void sendSubunitInEmployeeList(String subunit) {
    seleniumUtil.sendKeys(driver, By.id(PimConstants.ID_SUB_UNIT_IN_EMPLOYEE_LIST), "All");
  }

  // buttons

  public void clickSearchButtonInEmployeeList() {
    seleniumUtil.click(driver, By.id(PimConstants.ID_SEARCH_IN_EMPLOYEE_LIST));
  }

  public void clickResetButtonInEmployeeList() {
    seleniumUtil.click(driver, By.id(PimConstants.ID_RESET_IN_EMPLOYEE_LIST));
  }

  public void clickDeleteButtonInEmployeeList() {
    seleniumUtil.click(driver, By.id(PimConstants.ID_DELETE_IN_EMPLOYEE_LIST));
  }

  public void clickAddButtonInEmployeeList() {
    seleniumUtil.click(driver, By.id(PimConstants.ID_ADD_IN_EMPLOYEE_LIST));
  }
    }