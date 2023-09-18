package steps;

import baseEntities.BaseStep;
import models.User;
import pages.ProjectsListPage;

public class TestmoAuthStep extends BaseStep {
    public TestmoAuthStep() {
        super();
    }

    public ProjectsListPage login(User user) {
        mTestmoAuthPage.insertTestmoLoginAndPassword(user);
        mTestmoAuthPage.disableCheckBox();
        mTestmoAuthPage.loginButtonClick();
        return mProjectsListPage;
    }
}

