package baseEntities;

import configuration.ReadProperties;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseApiTest {
    protected String token;

    @BeforeTest
    public void setupUriApi() {
        RestAssured.baseURI = ReadProperties.getUrlApi();
        RestAssured.oauth2(ReadProperties.getToken());
    }
}