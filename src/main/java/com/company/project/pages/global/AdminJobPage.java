package com.company.project.pages.global;

import com.company.project.constants.global.AdminConstants;
import com.company.project.constants.global.AdminJobConstants;
import com.company.project.utilities.SeleniumUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminJobPage {
    public WebDriver driver;
    public SeleniumUtil seleniumUtil = new SeleniumUtil();
    public static Logger log = LogManager.getLogger();

    public AdminJobPage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateToJobTitles(){
        seleniumUtil.hover(driver, By.id(AdminJobConstants.ID_ADMIN_TAB));
        seleniumUtil.hover(driver,By.id(AdminJobConstants.ID_ADMIN_JOB_TAB));
        seleniumUtil.hoverAndClick(driver,By.id(AdminJobConstants.ID_JOB_TITLES_TAB));
    }

    public void navigateToPayGrades(){
        seleniumUtil.hover(driver, By.id(AdminJobConstants.ID_ADMIN_TAB));
        seleniumUtil.hover(driver,By.id(AdminJobConstants.ID_ADMIN_JOB_TAB));
        seleniumUtil.hoverAndClick(driver,By.id(AdminJobConstants.ID_PAY_GRADES_TAB));
    }

    public void navigateToEmployementStatus(){
        seleniumUtil.hover(driver, By.id(AdminJobConstants.ID_ADMIN_TAB));
        seleniumUtil.hover(driver,By.id(AdminJobConstants.ID_ADMIN_JOB_TAB));
        seleniumUtil.hoverAndClick(driver,By.id(AdminJobConstants.ID_EMPLOYEMENT_STATUS_TAB));
    }

    public void navigateToJobCategories(){
        seleniumUtil.hover(driver, By.id(AdminJobConstants.ID_ADMIN_TAB));
        seleniumUtil.hover(driver,By.id(AdminJobConstants.ID_ADMIN_JOB_TAB));
        seleniumUtil.hoverAndClick(driver,By.id(AdminJobConstants.ID_JOB_CATEGORIES_TAB));
    }

    public void navigateToWorkShifts(){
        seleniumUtil.hover(driver, By.id(AdminJobConstants.ID_ADMIN_TAB));
        seleniumUtil.hover(driver,By.id(AdminJobConstants.ID_ADMIN_JOB_TAB));
        seleniumUtil.hoverAndClick(driver,By.id(AdminJobConstants.ID_WORK_SHIFTS_TAB));
    }

// JOB TITLES

    public void clickAdd() {
        seleniumUtil.click(driver, By.id(AdminJobConstants.ID_JOBTITLES_ADD_BUTTON));
    }

    public void clickDelete(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_JOBTITLES_DELETE_BUTTON));
    }

    public void clickSave() {
        seleniumUtil.click(driver, By.id(AdminJobConstants.ID_JOBTITLES_SAVE_BUTTON));
    }

    public void clickCancel(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_JOBTITLES_CANCEL_BUTTON));
    }


    //Adding job titles

    public void sendJobTitleInAddingJobTitles(String jobtitle){
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_ADD_JOBTITLE_TEXTFIELD),jobtitle);
    }

    public void sendJobDescriptionInAddingJobTitles(String jobDescription){
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_ADD_JOB_DESCRIPTION_TEXTFIELD),jobDescription);
    }

    public void sendJobSpecificationInAddingJobTitles(String jobSpecification){
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_ADD_JOB_SPECIFICATION_TEXTFIELD),jobSpecification);
    }

    public void sendNoteInAddingJobTitles(String note){
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_ADD_NOTE_TEXTFIELD),note);
    }


    // PAY GRADES

    public void payGradesAdd(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_PAY_GRADES_ADD_BUTTON));
    }

    public void payGradesDelete(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_PAY_GRADES_DELETE_BUTTON));
    }

    public void payGradesSave(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_PAY_GRADES_SAVE_BUTTON));
    }

    public void payGradesCancel(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_PAY_GRADES_CANCEL_BUTTON));
    }

    //add paygrades

    public void sendNameInPayGrades(String name){
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_PAY_GRADES_NAME_TEXTFIELD),name);
    }



    // EMPLOYEMENT STATUS

    public void employementStatusAdd(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_EMPLOYEMENT_STATUS_ADD_BUTTON));
    }

    public void employementStatusDelete(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_EMPLOYEMENT_STATUS_DELETE_BUTTON));
    }

    public void employementStatusSave(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_EMPLOYEMENT_STATUS_SAVE_BUTTON));
    }

    public void employementStatusCancel(){
        seleniumUtil.click(driver,By.id(AdminJobConstants.ID_EMPLOYEMENT_STATUS_CANCEL_BUTTON));
    }

    // add employement status

    public void sendNameInEmployementStatus(String name){
        seleniumUtil.sendKeys(driver,By.id(AdminJobConstants.ID_EMPLOYEMENT_STATUS_NAME_TEXTFIELD),name);
    }

}

