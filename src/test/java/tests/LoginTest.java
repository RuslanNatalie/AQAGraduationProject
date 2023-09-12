package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void resultTestHW() {
        mStartStep.loginButtonClick().isPageOpened();
        mTestmoLoginStep.setTestmoAccount().isPageOpened();
        mTestmoAuthStep.login().isPageOpened();
    }
}