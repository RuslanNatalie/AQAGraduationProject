package tests.positive;

import baseEntities.BaseTest;
import helper.DataHelper;
import org.testng.annotations.Test;

public class CreateProjectTest extends BaseTest {

    @Test(description = "Тест на создание сущности проекта", groups = "positive")
    public void createProjectTest() {
        defaultUserLogin();
        mProjectsListStep.openAddProjectDialogWindow();
        mProjectsListStep.createProject(DataHelper.geProject()).isPageOpened();
    }
}
