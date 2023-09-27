package helper;

import configuration.ReadProperties;
import models.UserForUITest;
import models.create_project.Project;
import models.create_project.Role;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import tests.gui.positive.UploadFileTest;

public class DataHelper {
    static Logger logger = LogManager.getLogger(DataHelper.class);

    private static String initFilePath(String mFileName) {
        String pathToFile = UploadFileTest.class.getClassLoader().getResource(mFileName).getPath();
        return pathToFile.substring(1, pathToFile.length());
    }

    public static UserForUITest getFirsCorrectUser() {
        UserForUITest mUser = new UserForUITest.Builder()
                .withTestmoAccount(ReadProperties.getTestmoAccount())
                .withLogin(ReadProperties.getTestmoLogin())
                .withPassword(ReadProperties.getTestmoPassword())
                .build();
        return mUser;
    }

    public static UserForUITest getSecondCorrectUser() {
        UserForUITest mUser = new UserForUITest.Builder()
                .withTestmoAccount(ReadProperties.getTestmoAccount())
                .withLogin(ReadProperties.getTestmoLogin())
                .withPassword(ReadProperties.getTestmoPassword())
                .build();
        return mUser;
    }

    public static UserForUITest getIncorectdUser() {
        UserForUITest mUser = new UserForUITest.Builder()
                .withTestmoAccount("incorrectTestmoAccount")
                .withLogin("incorrectLogin")
                .withPassword("incorrectPassword")
                .build();
        return mUser;
    }


    public static Project geProject() {
        Project mProject = new Project.Builder()
                .withName("Project_1")
                .withSummary("Summary Project_1")
                .withRole(Role.GLOBAL)
                .withImagePath(initFilePath("photo_2023.jpg"))
                .build();
        return mProject;
    }
}