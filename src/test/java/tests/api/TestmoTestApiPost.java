package tests.api;

import baseEntities.BaseTestApi;
import models.Project;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utils.Endpoints;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;

public class TestmoTestApiPost extends BaseTestApi {

    static Logger logger = LogManager.getLogger(TestmoTestApiPost.class);

    @Test
    public void getAllUsers() {

        logger.info(authentication);

        Project expectedProject = new Project();
        expectedProject.setProjectName("Run 1");
        expectedProject.setAnnouncement("frontend");

        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("name", expectedProject.getProjectName());
        jsonMap.put("source", expectedProject.getAnnouncement());

        given()
                .body(jsonMap)
                .when()
                .post(Endpoints.CREATE_AUTO_RUN)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_CREATED);
    }
}