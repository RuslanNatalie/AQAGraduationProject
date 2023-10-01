package data;

import org.testng.annotations.DataProvider;
import tests.gui.positive.UploadFileTest;

public class DataProviderForUploadImage {

    private static String initFilePath() {
        String pathToFile = UploadFileTest.class.getClassLoader().getResource("photo_2023.jpg").getPath();
        return pathToFile.substring(1, pathToFile.length());
    }

    @DataProvider(name = "Data for upload image", parallel = true)
    public static Object[] dataForUploadImage() {
        String path = initFilePath();
        return new Object[]{path};
    }
}
