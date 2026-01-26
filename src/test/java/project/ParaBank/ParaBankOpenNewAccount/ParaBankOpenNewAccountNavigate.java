package project.ParaBank.ParaBankOpenNewAccount;

import net.serenitybdd.screenplay.targets.Target;

public class ParaBankOpenNewAccountNavigate {

    public static Target NAVIGATE_OPEN_NEW_ACCOUNT = Target.the("Navigate to open new account")
            .locatedBy("//*[@id=\"leftPanel\"]/ul/li[1]/a");

    public static Target SELECT_TYPE_OF_ACCOUNT_FLEXI = Target.the("Select type of account")
            .locatedBy("//select[contains(@id, \"type\")]/option[contains(text(), '{0}')]");

    public static Target SELECT_NEW_ACCOUNT_NUMBER_FLEXI = Target.the("Select new account number")
            .locatedBy("//select[contains(@id, 'fromAccountId')]/option[contains(text(), '{0}')]");

    public static Target CLICK_OPEN_NEW_ACOUNT_BUTTON = Target.the("Click open new account")
            .locatedBy("//*[@id=\"openAccountForm\"]/form/div/input");
}
