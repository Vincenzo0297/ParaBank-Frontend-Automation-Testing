package project.ParaBank.ParaBankRegistration;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ParaBankRegistrationActions {

    public static Performable navigateToLoginPage() {
        String environment = "environments." + Serenity.environmentVariables().getProperty("environment", "default");
        return Task.where("{0} navigates to login page",
                Open.url(Serenity.environmentVariables().getProperty(environment + ".webdriver.base.url"))
        );
    }

    public static Performable enterUserName(String username) {
        return Task.where("{0} enters username '",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(username).into(ParaBankReigstrationNavigate.USERNAME_FIELD)
                        );
                        actor.remember("username", username);
                        String rememberedUsername = actor.recall("username");
                        Serenity.recordReportData()
                                .withTitle("Remember username")
                                .andContents("username: " + rememberedUsername);
                }
        );
    }

    public static Performable enterPassword(String password) {
        return Task.where("{0} enters password ",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(password).into(ParaBankReigstrationNavigate.PASSWORD_FIELD)
                        );
                        actor.remember("password", password);
                        String rememberedPassword = actor.recall("password");
                        Serenity.recordReportData()
                                .withTitle("Remember password")
                                .andContents("password: " + rememberedPassword);
                }
        );
    }

    public static Performable validateUserLogin() {
        return Task.where("{0} verify the invalid user login message",
                actor -> {
                        String actualMessage = ParaBankReigstrationNavigate.VALIDATE_INVALID_MESSAGE.of("The username and password could not be verified").resolveFor(actor).getText();

                        actor.attemptsTo(
                                Ensure.that(actualMessage).contains("The username and password could not be verified")
                        );
                        Serenity.recordReportData()
                                .withTitle("User Login Error Message")
                                .andContents("Displayed message: " + actualMessage);
                }
        );
    }

    public static Performable enterAccountFirstName(String AccountFirstName) {
        return Task.where("Enter Account First Name",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(AccountFirstName).into(ParaBankReigstrationNavigate.ACCOUNT_FIRST_NAME)
                        );
                        actor.remember("AccountFirstName", AccountFirstName);
                        String rememberedAccountFirstName = actor.recall("AccountFirstName");
                        Serenity.recordReportData()
                                .withTitle("Remember Account First Name")
                                .andContents("Account First Name: " + rememberedAccountFirstName);
                }
        );
    }

    public static Performable enterAccountLastName(String AccountLastName) {
        return Task.where("Enter Account Last Name",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(AccountLastName).into(ParaBankReigstrationNavigate.ACCOUNT_LAST_NAME)
                        );
                        actor.remember("AccountLastName", AccountLastName);
                        String rememberedAccountLastName = actor.recall("AccountLastName");
                        Serenity.recordReportData()
                                .withTitle("Remember Account Last Name")
                                .andContents("Account Last Name: " + rememberedAccountLastName);
                }
        );
    }

    public static Performable enterAccountAddress(String AccountAddress) {
        return Task.where("Enter Account Address",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(AccountAddress).into(ParaBankReigstrationNavigate.ACCOUNT_ADDRESS)
                        );
                        actor.remember("AccountLastName", AccountAddress);
                        String rememberedAccountAddress = actor.recall("AccountAddress");
                        Serenity.recordReportData()
                                .withTitle("Remember Account Address")
                                .andContents("Account Address: " + rememberedAccountAddress);
                }
        );
    }

    public static Performable enterAccountCity(String AccountCity) {
        return Task.where("Enter Account City",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(AccountCity).into(ParaBankReigstrationNavigate.ACCOUNT_CITY)
                        );
                        actor.remember("AccountCity", AccountCity);
                        String rememberedAccountCity = actor.recall("AccountCity");
                        Serenity.recordReportData()
                                .withTitle("Remember Account City")
                                .andContents("Account City: " + rememberedAccountCity);
                }
        );
    }

    public static Performable enterAccountState(String AccountState) {
        return Task.where("Enter Account State",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(AccountState).into(ParaBankReigstrationNavigate.ACCOUNT_STATE)
                        );
                        actor.remember("AccountState", AccountState);
                        String rememberedAccountState = actor.recall("AccountState");
                        Serenity.recordReportData()
                                .withTitle("Remember Account State")
                                .andContents("Account State: " + rememberedAccountState);
                }
        );
    }

    public static Performable enterAccountZipCode(String AccountZipCode) {
        return Task.where("Enter Account Zip Code",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(AccountZipCode).into(ParaBankReigstrationNavigate.ACCOUNT_ZIP_CODE)
                        );
                        actor.remember("AccountZipCode", AccountZipCode);
                        String rememberedAccountZipCode = actor.recall("AccountZipCode");
                        Serenity.recordReportData()
                                .withTitle("Remember Account Zip Code")
                                .andContents("Account Zip Code: " + rememberedAccountZipCode);
                }
        );
    }

    public static Performable enterAccountPhone(String AccountPhone) {
        return Task.where("Enter Account Phone",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(AccountPhone).into(ParaBankReigstrationNavigate.ACCOUNT_PHONE_NUMBER)
                        );
                        actor.remember("AccountPhone", AccountPhone);
                        String rememberedAccountPhone = actor.recall("AccountPhone");
                        Serenity.recordReportData()
                                .withTitle("Remember Account Phone")
                                .andContents("Account Phone: " + rememberedAccountPhone);
                }
        );
    }

    public static Performable enterAccountSSN(String AccountSSN) {
        return Task.where("Enter Account City",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(AccountSSN).into(ParaBankReigstrationNavigate.ACCOUNT_SSN)
                        );
                        actor.remember("AccountSSN", AccountSSN);
                        String rememberedAccountSSN = actor.recall("AccountSSN");
                        Serenity.recordReportData()
                                .withTitle("Remember Account SSN")
                                .andContents("Account SSN: " + rememberedAccountSSN);
                }
        );
    }

    public static Performable enterCredentialUserName(String credentialUserName) {
        return Task.where("Enter Credential User Name",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(credentialUserName).into(ParaBankReigstrationNavigate.ENTER_CREDENTIAL_USER_NAME)
                        );
                        actor.remember("credentialUserName", credentialUserName);
                        String rememberedcredentialUserName= actor.recall("credentialUserName");
                        Serenity.recordReportData()
                                .withTitle("Remember Credential User Name")
                                .andContents("Credential User Name: " + rememberedcredentialUserName);
                }
        );
    }

    public static Performable enterCredentialPassword(String credentialPassword) {
        return Task.where("Enter Credential Password",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(credentialPassword).into(ParaBankReigstrationNavigate.ENTER_CREDENTIAL_PASSWORD)
                        );
                        actor.remember("credentialPassword", credentialPassword);
                        String rememberedcredentialPassword = actor.recall("credentialPassword");
                        Serenity.recordReportData()
                                .withTitle("Remember Credential Password")
                                .andContents("Credential Password: " + rememberedcredentialPassword);
                }
        );
    }

    public static Performable enterCredentialConfirmPassword(String credentialConfirmPassword) {
        return Task.where("Enter Credential Confirm Password",
                actor -> {
                        actor.attemptsTo(
                                Enter.theValue(credentialConfirmPassword).into(ParaBankReigstrationNavigate.ENTER_CONFIRM_PASSWORD)
                        );
                        actor.remember("credentialConfirmPassword", credentialConfirmPassword);
                        String rememberedcredentialConfirmPassword = actor.recall("credentialConfirmPassword");
                        Serenity.recordReportData()
                                .withTitle("Remember Credential Confirm Password")
                                .andContents("Credential Confirm Password: " + rememberedcredentialConfirmPassword);
                }
        );
    }

    public static Performable verifyLoginUserName() {
        return Task.where("Verify Login User Name",
                actor -> {
                        String verifyLoginUserName = ParaBankReigstrationNavigate.VERIFY_LOGIN_USER_NAME.of("Donald Trump").resolveFor(actor).getText();

                        actor.attemptsTo(
                                Ensure.that(verifyLoginUserName).contains("Donald Trump")
                        );
                        Serenity.recordReportData()
                                .withTitle("User Login Name")
                                .andContents("Displayed User Name: " + verifyLoginUserName);
                }
        );
    }
}

