package tests;

import baseEntities.BaseTest;
import helper.DataHelper;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest extends BaseTest {
    private static final String mFileName = "photo_2023.jpg";

    private String initFilePath() {
        String pathToFile = UploadFileTest.class.getClassLoader().getResource(mFileName).getPath();
        return pathToFile.substring(1, pathToFile.length());
    }

    @Test
    public void handleUploadFileTest() {
        User mUser = DataHelper.getFirsCorrectUser();
        mStartStep.loginButtonClick().isPageOpened();
        mTestmoLoginStep.setTestmoAccount(mUser.getTestmoAccount()).isPageOpened();
        mTestmoAuthStep.login(mUser).isPageOpened();
        mProjectsListStep.openAddProjectDialogWindow();
        mProjectsListStep.uploadImage(initFilePath());
        Assert.assertTrue(mProjectsListStep.checkSuccessUpload());
    }
}
