package com.axonactive.microservicesbook.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
public class BookResourceTest {

    @Test
    public void shouldCreateAbook() {
        given()
                .formParam("title", "Hello world")
                .formParam("author", "Tong Vu")
                .formParam("year", "2020")
                .formParam("genre", "IT")
                .when().post("/api/books")
                .then()
                .statusCode(201)
                .body("isbn_13", startsWith("13-"))
                .body("title", is("Hello world"))
                .body("author", is("Tong Vu"))
                .body("year_of_publication", is(2020))
                .body("genre", is("IT"))
                .body("creation_date", startsWith("20"));
    }

}