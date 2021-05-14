package org.example.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.example.model.Map;
import org.example.model.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeTaskApiTest {

    @BeforeEach
    public void prepare() throws IOException {

        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/")
                .addHeader("api_key", System.getProperty("api.key"))
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        RestAssured.filters(new ResponseLoggingFilter());
    }

    @Test
    public void createOrderToStore() {
        Order order = new Order();
        int id = new Random().nextInt(5000);
        int petId = new Random().nextInt(5000);

        order.setId(id);
        order.setPetId(petId);

        given()
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200);

        Order actual =
                given()
                        .pathParam("id", id)
                        .when()
                        .get("/store/order/{id}")
                        .then()
                        .statusCode(200)
                        .extract()
                        .body().
                        as(Order.class);

        assertEquals(actual.getPetId(), order.getPetId());
    }


    @Test
    public void deletedOrderFromStore() {

        given()
                .pathParam("id", System.getProperty("id"))
                .when()
                .delete("/store/order/{id}")
                .then()
                .statusCode(200);

        given()
                .pathParam("id", System.getProperty("id"))
                .when()
                .get("/store/order/{id}")
                .then()
                .statusCode(404);
    }

    @Test
    public void returnMapStatusCode() {

        Map map =
                given()
                        .when()
                        .get("/store/inventory")
                        .then()
                        .statusCode(200)
                        .extract()
                        .body()
                        .as(Map.class);

        Assertions.assertNotNull(map);
    }
}
