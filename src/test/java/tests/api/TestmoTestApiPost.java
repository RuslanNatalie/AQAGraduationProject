package tests.api;

import baseEntities.BaseTestApi;
import com.google.gson.Gson;
import configuration.ReadProperties;
import io.restassured.response.Response;
import models.User;
import org.apache.http.HttpStatus;
import org.openqa.selenium.json.TypeToken;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestmoTestApiPost extends BaseTestApi {

    @Test
    public void getAllUsers() {
        User expectedUser = User.builder()
                .name("Run 1")
                .source("mobile")
//                .isActive(true)
//                .roleId(1)
//                .role("Lead")
                .build();

        given()
                .auth().oauth2(ReadProperties.getToken())
                .when()
                .get(Endpoints.GET_ALL_USERS)
                .then()
                .log().body()
                .body("get(0).name", is(expectedUser.getName()))
                .body("get(0).source", equalTo(expectedUser.getSource()))
                .statusCode(HttpStatus.SC_OK);
    }
}