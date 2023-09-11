package tests;

import baseEntities.BaseTest;
import helper.DataHelper;
import models.User;
import org.testng.annotations.Test;

public class SuccessLoginTest extends BaseTest {

    @Test(groups = "positive")
    public void successLoginFirsUser() {
        User mUser = DataHelper.getFirsCorrectUser();
        mStartStep.loginButtonClick().isPageOpened();
        mTestmoLoginStep.setTestmoAccount(mUser.getTestmoAccount()).isPageOpened();
        mTestmoAuthStep.login(mUser).isPageOpened();
    }
}
