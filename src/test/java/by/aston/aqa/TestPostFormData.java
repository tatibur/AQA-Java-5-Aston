package by.aston.aqa;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.equalTo;

public class TestPostFormData {
    @Test
    void testPostMethod() {
        given()
                .baseUri("https://postman-echo.com")
                .when()
                .multiPart("Belarus", "Gomel")
                .contentType(ContentType.MULTIPART)
                .log().all()
                .post("/post")
                .then()
                .log().all().assertThat()
                .statusCode(200)
                .body("args", anything())
                .body("data", anything())
                .body("files", anything())
                .body("form.Belarus", equalTo("Gomel"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", anything())
                .body("headers.content-length", anything())
                .body("headers.user-agent", anything())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.cache-control", anything())
                .body("headers.postman-token", anything())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.cookie", anything())
                .body("headers.content-type", anything())
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/post"));
    }
}
