package tests.api;

import baseEntities.BaseTestApi;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;

public class TestmoTestApiPost extends BaseTestApi {

    static Logger logger = LogManager.getLogger(TestmoTestApiPost.class);

    @Test
    public void getAllUsers() {

        logger.info(authentication);

        given()
                .body("{\"name\": \"Run 1\", \"source\": \"frontend\"}")
                .when()
                .post(Endpoints.CREATE_AUTO_RUN)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_CREATED);
    }
}