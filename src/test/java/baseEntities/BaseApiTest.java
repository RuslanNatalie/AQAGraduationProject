package baseEntities;

import configuration.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.BeforeTest;
import static io.restassured.RestAssured.given;

public class BaseApiTest {
    @BeforeTest
    public void setupUriApi() {
        RestAssured.baseURI = ReadProperties.getUrl();

        RestAssured.requestSpecification = given()
                .auth().preemptive().basic(ReadProperties.getTestmoAccount(), ReadProperties.getTestmoPassword())
                .header(HTTP.CONTENT_TYPE, ContentType.JSON);
    }
}