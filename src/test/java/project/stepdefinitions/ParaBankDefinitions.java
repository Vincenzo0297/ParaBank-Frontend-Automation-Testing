package project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import UilityFunctions.WaitSeconds;
import project.ParaBankRegistration.ParaBankRegistrationActions;
import project.ParaBankRegistration.ParaBankReigstrationNavigate;

import java.util.List;

public class ParaBankDefinitions {

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
                ParaBankRegistrationActions.enterUserName(username),
                WaitSeconds.Now()
        );
    }

    @And("{actor} input password {string}")
    public void userInputPassword(Actor actor, String password) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterPassword(password),
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
                ParaBankRegistrationActions.enterAccountFirstName(AccountRegistration.get(0)),
                ParaBankRegistrationActions.enterAccountLastName(AccountRegistration.get(1)),
                ParaBankRegistrationActions.enterAccountAddress(AccountRegistration.get(2)),
                ParaBankRegistrationActions.enterAccountCity(AccountRegistration.get(3)),
                ParaBankRegistrationActions.enterAccountState(AccountRegistration.get(4)),
                ParaBankRegistrationActions.enterAccountZipCode(AccountRegistration.get(5)),
                ParaBankRegistrationActions.enterAccountPhone(AccountRegistration.get(6)),
                ParaBankRegistrationActions.enterAccountSSN(AccountRegistration.get(7))
        );
    }

    @And("{actor} enter account username {string}")
    public void userEnterAccountUsernameAccountUsername(Actor actor, String CredentialUserName) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterCredentialUserName(CredentialUserName)
        );
    }

    @And("{actor} enter account password {string}")
    public void userEnterAccountPasswordAccountPassword(Actor actor, String CredentialPassword) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterCredentialPassword(CredentialPassword)
        );
    }

    @And("{actor} enter account Confirm password {string}")
    public void userEnterAccountConfirmPasswordAccountConfirmPassword(Actor actor, String CredentialConfirmPassword) {
        actor.attemptsTo(
                ParaBankRegistrationActions.enterCredentialConfirmPassword(CredentialConfirmPassword)
        );
    }

    @Then("{actor} validate invalid user login")
    public void userValidateInvalidUserLogin(Actor actor) {
        actor.attemptsTo(
                ParaBankRegistrationActions.validateUserLogin()
        );
    }
}
