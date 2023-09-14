package baseEntities;

import pages.*;

public class BaseStep {
    protected StartPage mStartPage;
    protected TestmoLoginPage mTestmoLoginPage;
    protected TestmoAuthPage mTestmoAuthPage;
    protected ProjectsListPage mProjectsListPage;

    public BaseStep() {
        mStartPage = new StartPage();
        mTestmoLoginPage = new TestmoLoginPage();
        mTestmoAuthPage = new TestmoAuthPage();
        mProjectsListPage = new ProjectsListPage();
    }
}