package steps;

import baseEntities.BaseStep;
import pages.TestmoLoginPage;

public class StartStep extends BaseStep {
    public StartStep() {
        super();
    }

    public TestmoLoginPage loginButtonClick() {
        mStartPage.loginButtonClick();
        return mTestmoLoginPage;
    }
}

