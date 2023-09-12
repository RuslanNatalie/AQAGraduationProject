package tests.api;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;

public class HttpClientTest {
    static Logger logger = LogManager.getLogger(HttpClientTest.class);

    @Test
    public void simpleApiTest() throws IOException {
        String restUrl = "https://qabrago.testmo.net/";

        HttpUriRequest request = new HttpGet(restUrl);

        HttpResponse httpResponse = HttpClientBuilder
                .create()
                .build()
                .execute(request);

        logger.info(request);
        logger.info(httpResponse);
    }
}
