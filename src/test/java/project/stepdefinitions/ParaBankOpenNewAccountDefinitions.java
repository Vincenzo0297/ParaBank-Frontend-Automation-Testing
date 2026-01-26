package project.stepdefinitions;

import UilityFunctions.WaitSeconds;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import project.ParaBankOpenNewAccount.ParaBankOpenNewAccountAction;
import project.ParaBankOpenNewAccount.ParaBankOpenNewAccountNavigate;

public class ParaBankOpenNewAccountDefinitions {

    @Then("{actor} Navigate to open new account")
    public void userNavigateToOpenNewAccount(Actor actor) {
        actor.attemptsTo(
                Click.on(ParaBankOpenNewAccountNavigate.NAVIGATE_OPEN_NEW_ACCOUNT),
                WaitSeconds.Now()
        );
    }

    @And("{actor} Select type of account {string}")
    public void userSelectTypeOfAccountAccountType(Actor actor, String AccountType) {
        actor.attemptsTo(
                ParaBankOpenNewAccountAction.SelectAccountType(AccountType),
                WaitSeconds.Now()
        );
    }

    @And("{actor} Select existing account to transfer funds into the new account {string}")
    public void userSelectExistingAccountToTransferFundsIntoTheNewAccountNewAccountNumber(Actor actor, String NewAccountNumber) {
        actor.attemptsTo(
                ParaBankOpenNewAccountAction.SelectNewAccountNumber(NewAccountNumber),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} Click on the open new account button")
    public void userClickOnTheOpenNewAccountButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ParaBankOpenNewAccountNavigate.CLICK_OPEN_NEW_ACOUNT_BUTTON),
                WaitSeconds.Now()
        );
    }
}
