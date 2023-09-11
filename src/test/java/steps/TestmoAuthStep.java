package steps;

import baseEntities.BaseStep;
import pages.ProjectsListPage;

public class TestmoAuthStep extends BaseStep {
    public TestmoAuthStep() {
        super();
    }

    public ProjectsListPage login() {
        mTestmoAuthPage.insertTestmoLoginAndPassword();
        mTestmoAuthPage.disableCheckBox();
        mTestmoAuthPage.loginButtonClick();
        return mProjectsListPage;
    }
}

