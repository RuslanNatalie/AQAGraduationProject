package steps;

import baseEntities.BaseStep;
import models.create_project.Project;
import pages.ProjectDetailsPage;

public class ProjectsListStep extends BaseStep {
    public ProjectsListStep() {
        super();
    }

    public boolean isPopUpDisplayed() {
        return mProjectsListPage.isPopUpDisplayed();
    }

    public void openAddProjectDialogWindow() {
        mProjectsListPage.addProjectButtonClick();
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
}

