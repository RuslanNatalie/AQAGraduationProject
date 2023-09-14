package tests.api;

import baseEntities.BaseApiTest;
import configuration.ReadProperties;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class TestRailApiTest extends BaseApiTest {
    static Logger logger = LogManager.getLogger(TestRailApiTest.class);

    @Test
    public void getAllUsers1() {

        logger.info(token);

        given()
                .auth().oauth2(ReadProperties.getToken())
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .when()
                .get(Endpoints.GET_ALL_USERS)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
}