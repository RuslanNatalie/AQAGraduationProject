package baseEntities;

import pages.*;

public class BaseStep {
    protected StartPage mStartPage;
    protected TestmoLoginPage mTestmoLoginPage;
    protected TestmoAuthPage mTestmoAuthPage;
    protected ProjectsListPage mProjectsListPage;
    protected ProjectDetailsPage mProjectDetailsPage;
    protected AdminProjectPage mAdminProjectPage;

    public BaseStep() {
        mStartPage = new StartPage();
        mTestmoLoginPage = new TestmoLoginPage();
        mTestmoAuthPage = new TestmoAuthPage();
        mProjectsListPage = new ProjectsListPage();
        mProjectDetailsPage = new ProjectDetailsPage();
        mAdminProjectPage = new AdminProjectPage();
    }
}