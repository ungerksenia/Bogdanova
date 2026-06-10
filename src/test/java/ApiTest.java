import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class ApiTest {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void testGetMethod() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void postRowTextTest() {
        given()
                .contentType("text/plain")
                .body("{\n    \"test\": \"value\"\n}")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("{\n    \"test\": \"value\"\n}"));
    }

    @Test
    public void postFormDataTest() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    public void testPutMethod() {
        given()
                .contentType("text/plain")
                .body("This is so interesting information")
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is so interesting information"));
    }

    @Test
    public void testPatchMethod() {
        given()
                .contentType("text/plain")
                .body("Interesting information")
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo("Interesting information"));


    }

    @Test
    public void testDeleteMethod() {
        given()
                .contentType("text/plain")
                .queryParam("name","Alisa")
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("args.name", equalTo("Alisa"));
    }

}