package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import pages.TestmoLoginPage;

public class StartStep extends BaseStep {
    public StartStep() {
        super();
    }

    @Step("Click on login button")
    public TestmoLoginPage loginButtonClick() {
        mStartPage.loginButtonClick();
        return mTestmoLoginPage;
    }
}
