package steps;

import baseEntities.BaseStep;

public class ProjectsListStep extends BaseStep {
    public ProjectsListStep() {
        super();
    }

    public boolean isPopUpDisplayed() {
        return mProjectsListPage.isPopUpDisplayed();
    }

    public void openAddProjectDialogWindow( ) {
        mProjectsListPage.addProjectButtonClick();
    }

    public void uploadImage(String pathToFile) {
        mProjectsListPage.uploadImage(pathToFile);
    }

    public boolean checkSuccessUpload() {
        return  mProjectsListPage.checkSuccessUpload();
    }
}

