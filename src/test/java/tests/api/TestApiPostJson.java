package tests.api;

import baseEntities.BaseTestApi;
import com.google.gson.Gson;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.AutoRun;
import models.User;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.Matchers;
import org.openqa.selenium.json.TypeToken;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestApiPostJson extends BaseTestApi {

    static Logger logger = LogManager.getLogger(TestApiPost.class);

    @Test
    public void postAutoRunGson() {

        logger.info(authentication);

        AutoRun expectedAutoRun = new AutoRun();
        expectedAutoRun.setAutoRunName("Run 1");
        expectedAutoRun.setSourceName("frontend");

        int id = given()
                .body(expectedAutoRun, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(Endpoints.CREATE_AUTO_RUN)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_CREATED)
                .extract()
                .jsonPath()
                .getInt("id");

        logger.info(id);
    }

    @Test
    public void getAllUsers() {

//    Gson gson = new Gson();

        int userID = 1;
        String endpoint = "/api/users/" + userID;

    User expectedUser = User.builder()
            .page(1)
//            .name("Natalie")
//            .timezone(null)
//            .dateFormat(null)
//            .timeFormat(null)
            .build();

        User actualUser = given()
//                .pathParam("user_id", userID)
                .get(endpoint)
                .then()
                .log().body()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(User.class);

        System.out.println(actualUser.toString());
        Assert.assertTrue(expectedUser.equals(actualUser));
}
}