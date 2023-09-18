package tests.positive;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopUpWindowTest extends BaseTest {

    @Test(description = "Тест на проверку всплывающего сообщения создания проекта", groups = "positive")
    public void popUpTest() {
        defaultUserLogin();
        mProjectsListStep.openAddProjectDialogWindow();
        Assert.assertEquals(mProjectsListStep.getAddProjectDialogPopUpText(),
                "You can assign project-specific permissions to users and groups. All users without project-specific permissions automatically use this configured default access (e.g. their global role).");
    }
}
