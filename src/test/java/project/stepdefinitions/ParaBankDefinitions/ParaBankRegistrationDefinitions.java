package project.stepdefinitions.ParaBankDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import UilityFunctions.WaitSeconds;
import UilityFunctions.CSVDataReader;
import project.ParaBank.ParaBankRegistration.ParaBankRegistrationActions;
import project.ParaBank.ParaBankRegistration.ParaBankReigstrationNavigate;
import java.util.List;

public class ParaBankRegistrationDefinitions {

    @Given("{actor} login to the para bank page")
    public void userIsOnTheLoginPage(Actor actor) {
        actor.attemptsTo(
                ParaBankRegistrationActions.navigateToLoginPage(),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} input username {string}")
    public void userInputUsernameUsername(Actor actor, String username) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterUserName(CSVDataReader.actor(username)),
                WaitSeconds.Now()
        );
    }

    @And("{actor} input password {string}")
    public void userInputPassword(Actor actor, String password) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterPassword(CSVDataReader.actor(password)),
                WaitSeconds.Now()
        );
    }

    @And("{actor} Click on the Login button")
    public void userClickLoginButton(Actor actor){
        actor.attemptsTo(
                Click.on(ParaBankReigstrationNavigate.LOGIN_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} Click on the Registration button")
    public void userClickOnTheRegistrationButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ParaBankReigstrationNavigate.CLICK_REGISTRATION_BUTTON)
        );
    }

    @Then("{actor} sign up for ParaBank Account")
    public void userSignUpForParaBankAccount(Actor actor, List<String> AccountRegistration) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterAccountFirstName(CSVDataReader.actor(AccountRegistration.get(0))),
                WaitSeconds.Now(),
                ParaBankRegistrationActions.enterAccountLastName(CSVDataReader.actor(AccountRegistration.get(1))),
                WaitSeconds.Now(),
                ParaBankRegistrationActions.enterAccountAddress(CSVDataReader.actor(AccountRegistration.get(2))),
                WaitSeconds.Now(),
                ParaBankRegistrationActions.enterAccountCity(CSVDataReader.actor(AccountRegistration.get(3))),
                WaitSeconds.Now(),
                ParaBankRegistrationActions.enterAccountState(CSVDataReader.actor(AccountRegistration.get(4))),
                WaitSeconds.Now(),
                ParaBankRegistrationActions.enterAccountZipCode(CSVDataReader.actor(AccountRegistration.get(5))),
                WaitSeconds.Now(),
                ParaBankRegistrationActions.enterAccountPhone(CSVDataReader.actor(AccountRegistration.get(6))),
                WaitSeconds.Now(),
                ParaBankRegistrationActions.enterAccountSSN(CSVDataReader.actor(AccountRegistration.get(7))),
                WaitSeconds.Now()
        );
    }

    @And("{actor} enter account username {string}")
    public void userEnterAccountUsernameAccountUsername(Actor actor, String CredentialUserName) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterCredentialUserName(CSVDataReader.actor(CredentialUserName)),
                WaitSeconds.Now()
        );
    }

    @And("{actor} enter account password {string}")
    public void userEnterAccountPasswordAccountPassword(Actor actor, String CredentialPassword) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterCredentialPassword(CSVDataReader.actor(CredentialPassword)),
                WaitSeconds.Now()
        );
    }

    @And("{actor} enter account Confirm password {string}")
    public void userEnterAccountConfirmPasswordAccountConfirmPassword(Actor actor, String CredentialConfirmPassword) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterCredentialConfirmPassword(CSVDataReader.actor(CredentialConfirmPassword)),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} validate invalid user login")
    public void userValidateInvalidUserLogin(Actor actor) {
        actor.attemptsTo(
                ParaBankRegistrationActions.validateUserLogin(),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} Click on the register button")
    public void userClickOnTheRegisterButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ParaBankReigstrationNavigate.CLICK_REGISTER_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} Verify the account username")
    public void userVerifyTheAccountUsername(Actor actor) {
        actor.attemptsTo(
                ParaBankRegistrationActions.verifyLoginUserName(),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} Click on the Log Out button")
    public void userClickOnTheLogOutButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ParaBankReigstrationNavigate.CLICK_ON_LOG_OUT_BUTTON),
                WaitSeconds.Now()
        );
    }
}
