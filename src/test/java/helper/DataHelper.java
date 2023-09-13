package helper;

import configuration.ReadProperties;
import models.User;

public class DataHelper {
    public static User getFirsCorrectUser() {
        User mUser = new User.Builder()
                .withTestmoAccount(ReadProperties.getTestmoAccount())
                .withLogin(ReadProperties.getTestmoLogin())
                .withPassword(ReadProperties.getTestmoPassword())
                .build();
        return mUser;
    }

    public static User getSecondCorrectUser() {
        User mUser = new User.Builder()
                .withTestmoAccount(ReadProperties.getTestmoAccount())
                .withLogin(ReadProperties.getTestmoLogin())
                .withPassword(ReadProperties.getTestmoPassword())
                .build();
        return mUser;
    }

    public static User getIncorectdUser() {
        User mUser = new User.Builder()
                .withTestmoAccount("incorrectTestmoAccount")
                .withLogin("incorrectLogin")
                .withPassword("incorrectPassword")
                .build();
        return mUser;
    }
}