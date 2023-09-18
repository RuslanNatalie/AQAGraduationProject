package steps;

import baseEntities.BaseStep;

public class AdminProjectStep extends BaseStep {
    public AdminProjectStep() {
        super();
    }

    public void removeLastProjectFromTable() {
        mAdminProjectPage.removeProject();
    }
}

