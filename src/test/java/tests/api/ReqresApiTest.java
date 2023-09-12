package tests.api;

import io.restassured.RestAssured;
import org.apache.hc.core5.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqresApiTest {

    @Test
    public void simpleStepByStepApitest() {
        RestAssured.baseURI = "https://manage.testmo.com";
//        int userID = 2;
        String endpoint = "/api/v1/user";

        given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body();
    }
}
