package data;

import org.testng.annotations.DataProvider;
import java.io.File;

public class DataProviderForUploadImage {

    private static String initFilePath() {
        File file = new File("src/test/resources/photo_2023.jpg");
        return file.getAbsolutePath();
    }

    @DataProvider(name = "Data for upload image", parallel = true)
    public static Object[] dataForUploadImage() {
        String path = initFilePath();
        return new Object[]{path};
    }
}
