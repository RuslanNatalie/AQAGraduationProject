package steps;

import baseEntities.BaseStep;
import pages.TestmoAuthPage;

public class TestmoLoginStep extends BaseStep {
    public TestmoLoginStep() {
        super();
    }

    public TestmoAuthPage setTestmoAccount() {
        mTestmoLoginPage.loginAccountAreaClick();
        mTestmoLoginPage.insertTestmoAccount();
        mTestmoLoginPage.goButtonClick();
        return mTestmoAuthPage;
    }
}