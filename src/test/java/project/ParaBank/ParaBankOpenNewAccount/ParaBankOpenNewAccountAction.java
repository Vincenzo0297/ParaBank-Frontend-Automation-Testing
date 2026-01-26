package project.ParaBank.ParaBankOpenNewAccount;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ParaBankOpenNewAccountAction {

    public static Performable SelectAccountType(String accountType) {
        return Task.where("Select type of open account",
                actor -> {
                        Target SelectedAccountTarget = ParaBankOpenNewAccountNavigate.SELECT_TYPE_OF_ACCOUNT_FLEXI.of(accountType);
                        // Now perform the action to click on the target
                        actor.attemptsTo(
                                Click.on(SelectedAccountTarget)
                        );
                        actor.remember("accountType", accountType);
                        String rememberedAccountType = actor.recall("accountType");
                        Serenity.recordReportData()
                                .withTitle("Remember Account Type")
                                .andContents("Account Type: " + rememberedAccountType);
                }
        );
    }

    public static Performable SelectNewAccountNumber(String newAccountNumber) {
        return Task.where("Select new account number to transfer",
                actor -> {
                        Target SelectedNewAccountNumber = ParaBankOpenNewAccountNavigate.SELECT_NEW_ACCOUNT_NUMBER_FLEXI.of(newAccountNumber);

                        actor.attemptsTo(
                                    Click.on(SelectedNewAccountNumber)
                        );
                        actor.remember("newAccountNumber", newAccountNumber);
                        String rememberedNewAccountNumber = actor.recall("newAccountNumber");
                        Serenity.recordReportData()
                                .withTitle("Remember New Account Number")
                                .andContents("New Account Number: " + rememberedNewAccountNumber);
                }
        );
    }
}
