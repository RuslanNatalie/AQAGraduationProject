package tests.api;

import baseEntities.BaseTestApi;
import configuration.ReadProperties;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;

public class TestmoTestApiGet extends BaseTestApi {
    static Logger logger = LogManager.getLogger(TestmoTestApiGet.class);

    @Test
    public void getUsers() {

        logger.info(authentication);

        given()
                .when()
                .get(Endpoints.GET_USERS)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getUsersId() {

        int userID = 2;
        String endpoint = "/api/users/" + userID;

        logger.info(authentication);

        given()
                .when()
                .get(endpoint)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getRoles() {

            logger.info(authentication);

            given()
                    .auth().oauth2(ReadProperties.getTokenFalse())
                    .when()
                    .get(Endpoints.GET_ROLES)
                    .then()
                    .log().status()
                    .log().body()
                    .statusCode(HttpStatus.SC_OK);
    }
}