package tests.gui.negative;

import baseEntities.BaseTest;
import helper.DataHelper;
import models.UserForUITest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IncorrectDataTest extends BaseTest {

    @Test(description = "Тест на уиспользование некорректных данных при вводе логина во время авторизации", groups = "negative")
    public void incorrectDataTest() {
        UserForUITest mUser = DataHelper.getFirsCorrectUser();
        mTestmoLoginStep.setTestmoAccount(mUser.getTestmoAccount()).isPageOpened();
        Assert.assertEquals(mTestmoAuthStep.loginWithIncorrectData(mUser), "The email must be a valid email address.");
    }
}