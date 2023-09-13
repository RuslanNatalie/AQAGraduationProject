package steps;

import baseEntities.BaseStep;
import pages.TestmoAuthPage;

public class TestmoLoginStep extends BaseStep {
    public TestmoLoginStep() {
        super();
    }

    public TestmoAuthPage setTestmoAccount(String testmoAccount) {
        mTestmoLoginPage.loginAccountAreaClick();
        mTestmoLoginPage.insertTestmoAccount(testmoAccount);
        mTestmoLoginPage.goButtonClick();
        return mTestmoAuthPage;
    }
}

