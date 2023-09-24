package tests.negative;

import baseEntities.BaseTest;
import com.codeborne.selenide.WebDriverRunner;
import data.BoundaryValues;
import helper.DataHelper;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class IncorrectLengthFieldTest extends BaseTest {

    @Test(description = "Тест на ввод данных превышающих допустимые", groups = "negative")
    public void incorrectLengthFieldTest() {
        defaultUserLogin();
        mProjectsListStep.openAddProjectDialogWindow();
        Assert.assertEquals(mProjectsListStep.createProject(BoundaryValues.RANGE_NEGATIVE.getSize()), "The name may not be greater than 750 characters.");
    }
}
