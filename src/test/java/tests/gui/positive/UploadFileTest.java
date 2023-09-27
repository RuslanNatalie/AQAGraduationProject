package tests.gui.positive;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest extends BaseTest {
    private static final String mFileName = "photo_2023.jpg";

    private String initFilePath() {
        String pathToFile = UploadFileTest.class.getClassLoader().getResource(mFileName).getPath();
        return pathToFile.substring(1, pathToFile.length());
    }

    @Test(description = "Тест на загрузку файла изображения во время создания проекта", groups = "positive")
    public void handleUploadFileTest() {
        defaultUserLogin();
        mProjectsListStep.openAddProjectDialogWindow();
        mProjectsListStep.uploadImage(initFilePath());
        Assert.assertTrue(mProjectsListStep.checkSuccessUpload());
    }
}
