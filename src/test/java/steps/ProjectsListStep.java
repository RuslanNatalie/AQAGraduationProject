package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import models.create_project.Project;
import pages.ProjectDetailsPage;


public class ProjectsListStep extends BaseStep {
    public ProjectsListStep() {
        super();
    }

    @Step("open DialogWindow after click on addProjectButton")
    public void openAddProjectDialogWindow() {
        mProjectsListPage.addProjectButtonClick();
    }

    @Step("check opening DialogWindow")
    public String getAddProjectDialogTitleTextWindow() {
        return mProjectsListPage.checkDialogWindowOpen();
    }

    public String getAddProjectDialogPopUpText() {
        return mProjectsListPage.checkPopUpOpen();
    }

    public void uploadImage(String pathToFile) {
        mProjectsListPage.uploadImage(pathToFile);
    }

    public boolean checkSuccessUpload() {
        return mProjectsListPage.checkSuccessUpload();
    }

    public ProjectDetailsPage createProject(Project mProject) {
        mProjectsListPage.initProjectFields(mProject);
        return mProjectDetailsPage;
    }

    public String createProject(int size) {
        if (size == 0)
            return mProjectsListPage.initProjectNameFieldEmpty();
        else if (size == 751)
            return mProjectsListPage.initProjectNameFieldRangeNegative(size);
        else return mProjectsListPage.initProjectNameFieldPositive(size);
    }
}

