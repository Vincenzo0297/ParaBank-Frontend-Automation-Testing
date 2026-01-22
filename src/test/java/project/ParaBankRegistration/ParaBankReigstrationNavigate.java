package project.ParaBankRegistration;

import net.serenitybdd.screenplay.targets.Target;

public class ParaBankReigstrationNavigate {

    public static Target USERNAME_FIELD = Target.the("Enter User Name")
            .locatedBy("//*[@id=\"loginPanel\"]/form/div[1]/input");

    public static Target PASSWORD_FIELD = Target.the("password")
            .locatedBy("//*[@id=\"loginPanel\"]/form/div[2]/input");

    public static Target LOGIN_BUTTON = Target.the("Login button")
            .locatedBy("//*[@id=\"loginPanel\"]/form/div[3]/input");

    public static Target CLICK_REGISTRATION_BUTTON = Target.the("Click Registration button")
            .locatedBy("//*[@id=\"loginPanel\"]/p[2]/a");

    public static Target ACCOUNT_FIRST_NAME = Target.the("Enter Account first name")
            .locatedBy("//*[@id=\"customer.firstName\"]");

    public static Target ACCOUNT_LAST_NAME = Target.the("Enter Account last name")
            .locatedBy("//*[@id=\"customer.lastName\"]");

    public static Target ACCOUNT_ADDRESS = Target.the("Enter Account address")
            .locatedBy("//*[@id=\"customer.address.street\"]");

    public static Target ACCOUNT_CITY = Target.the("Enter Account city")
            .locatedBy("//*[@id=\"customer.address.city\"]");

    public static Target ACCOUNT_STATE = Target.the("Enter Account state")
            .locatedBy("//*[@id=\"customer.address.state\"]");

    public static Target ACCOUNT_ZIP_CODE = Target.the("Enter Account zip code")
            .locatedBy("//*[@id=\"customer.address.zipCode\"]");

    public static Target ACCOUNT_PHONE_NUMBER = Target.the("Enter Account phone number")
            .locatedBy("//*[@id=\"customer.phoneNumber\"]");

    public static Target ACCOUNT_SSN = Target.the("Enter Account ssn")
            .locatedBy("//*[@id=\"customer.ssn\"]");

    public static final Target ENTER_CREDENTIAL_USER_NAME = Target.the("user name").
            locatedBy("//*[@id=\"customer.username\"]");

    public static final Target ENTER_CREDENTIAL_PASSWORD = Target.the("password").
            locatedBy("//*[@id=\"customer.password\"]");

    public static final Target ENTER_CONFIRM_PASSWORD = Target.the("confirm password").
            locatedBy("//*[@id=\"repeatedPassword\"]");

    public static Target VALIDATE_INVALID_MESSAGE = Target.the("validate error messaga")
            .locatedBy("//*[@id=\"rightPanel\"]/p[contains(text(),'{0}')]");

}

