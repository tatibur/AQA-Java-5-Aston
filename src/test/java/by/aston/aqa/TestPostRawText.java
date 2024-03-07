package by.aston.aqa;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.equalTo;

public class TestPostRawText {
    @Test
    void testRawText() {
        given()
                .baseUri("https://postman-echo.com")
                .when()
                .contentType(ContentType.TEXT)
                .body("Belarus=Gomel")
                .log().all()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("args", anything())
                .body("data", equalTo("Belarus=Gomel"))
                .body("files", anything())
                .body("form", anything())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", anything())
                .body("headers.content-length", anything())
                //.body ("headers.content-type", equalTo("text/plain"))
                .body("headers.user-agent", anything())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.cache-control", anything())
                .body("headers.postman-token", anything())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/post"));
    }
}
