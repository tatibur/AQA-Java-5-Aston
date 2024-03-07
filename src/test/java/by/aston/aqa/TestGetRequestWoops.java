package by.aston.aqa;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TestGetRequestWoops {
    @Test
    void testWoops() {
        given()
                .baseUri("https://postman-echo.com")
                .when()
                .contentType(ContentType.JSON)
                .log().all()
                .get("/get?foo1=bar1&foo2=bar2")
                .then().assertThat()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.cache-control", anything())
                .body("headers.postman-token", anything())
                .body("headers.user-agent", anything())
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }
}
