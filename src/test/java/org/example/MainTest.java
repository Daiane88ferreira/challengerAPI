package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class MainTest {


    @Test
    public void criarUsuario() {

        RestAssured.baseURI = "https://reqres.in/";

        User user = new User("daiane", "QA");

        Response response = given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("daiane"))
                .body("job", equalTo("QA"))
                .body(matchesJsonSchemaInClasspath("userSchema.json")) //validação de contrato
                .extract().response();

        System.out.println(response.asString());
    }
}

