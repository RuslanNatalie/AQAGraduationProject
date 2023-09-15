package tests.api;

import baseEntities.BaseTestApi;
import io.restassured.mapper.ObjectMapperType;
import models.AutoRun;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utils.Endpoints;
import static io.restassured.RestAssured.*;

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
}