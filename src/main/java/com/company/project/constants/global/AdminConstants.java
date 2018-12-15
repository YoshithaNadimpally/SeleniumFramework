package com.company.project.constants.global;

public class AdminConstants {

    
    public static final String ID_ADMIN_TAB ="menu_admin_viewAdminModule";


    public static final String ID_USER_MANAGEMENT_TAB = "menu_admin_UserManagement";
    public static final String ID_USERS="menu_admin_viewSystemUsers";




    public static final String ID_JOB_TAB = "menu_admin_Job";
    public static final String ID_ORGANIZATION_TAB = "menu_admin_Organization";
    public static final String ID_QUALIFICATIONS_TAB = "menu_admin_Qualifications";
    public static final String ID_NATIONALITIES_TAB = "menu_admin_nationality";
    public static final String ID_CONFIGURATION_TAB = "menu_admin_Configuration";


    //searchiing user
    public static final String ID_SEARCH_USERNAME_TEXTFIELD = "searchSystemUser_userName";
    public static final String ID_SEARCH_USERROLE_DROPDOWN ="searchSystemUser_userType";
    public static final String ID_SEARCH_EMPLOYEE_NAME_TEXTFIELD = "searchSystemUser_employeeName_empName";
    public static final String ID_SEARCH_STATUS_DROPDOWN ="searchSystemUser_status";

    //adding user
    public static final String ID_ADD_USERNAME_TEXTFIELD = "systemUser_userName";
    public static final String ID_ADD_USERROLE_DROPDOWN ="systemUser_userType";
    public static final String ID_ADD_EMPLOYEENAME_TEXTFIELD ="systemUser_employeeName_empName";
    public static final String ID_ADD_STATUS_DROPDOWN ="systemUser_status";
    public static final String ID_ADD_PASSWORD_TEXTFIELD = "systemUser_password";
    public static final String ID_ADD_CONFIRM_PASSWORD_TEXTFIELD ="systemUser_confirmPassword";
    public static final String ID_ADD_SAVE_BUTTON = "btnSave";
    public static final String ID_ADD_CANCEL_BUTTON ="btnCancel";

    public static final String ID_SEARCH_BUTTON ="searchBtn";
    public static final String ID_RESET_BUTTON ="resetBtn";
    public static final String ID_ADD_BUTTON ="btnAdd";
    public static final String ID_DELETE_BUTTON ="btnDelete";


    public static final String XPATH_DELETING_USER = "//*[contains(text(),'%s')]/../preceding-sibling::*/input[@type='checkbox']\",\"hannah.flores\"";


    
    


}
