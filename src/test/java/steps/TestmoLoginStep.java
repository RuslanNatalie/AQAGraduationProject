package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import models.UserForUITest;
import pages.TestmoAuthPage;

public class TestmoLoginStep extends BaseStep {
    public TestmoLoginStep() {
        super();
    }

    @Description("set testmo account keys and click login button")
    public TestmoAuthPage setTestmoAccount( UserForUITest mUser) {
        mTestmoLoginPage.loginAccountAreaClick();
        mTestmoLoginPage.insertTestmoAccount(mUser.getTestmoAccount());
        mTestmoLoginPage.goButtonClick();
        return mTestmoAuthPage;
    }
}

