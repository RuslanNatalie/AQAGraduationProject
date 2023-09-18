package tests.positive;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DialogWindowTest extends BaseTest {

    @Test(description = "Тест на проверку всплывающего сообщения создания проекта", groups = "positive")
    public void dialogWindowTest() {
        defaultUserLogin();
        mProjectsListStep.openAddProjectDialogWindow();
        Assert.assertEquals(mProjectsListStep.getAddProjectDialogTitleTextWindow(), "Add project");
    }
}
