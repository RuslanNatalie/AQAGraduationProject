package baseEntities;

import pages.*;

public class BaseStep {
    protected TestmoLoginPage mTestmoLoginPage;
    protected TestmoAuthPage mTestmoAuthPage;
    protected ProjectsListPage mProjectsListPage;
    protected ProjectDetailsPage mProjectDetailsPage;
    protected AdminProjectPage mAdminProjectPage;

    public BaseStep() {
        mTestmoLoginPage = new TestmoLoginPage();
        mTestmoAuthPage = new TestmoAuthPage();
        mProjectsListPage = new ProjectsListPage();
        mProjectDetailsPage = new ProjectDetailsPage();
        mAdminProjectPage = new AdminProjectPage();
    }
}