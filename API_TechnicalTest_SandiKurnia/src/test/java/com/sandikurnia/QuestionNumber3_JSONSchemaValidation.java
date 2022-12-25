package com.sandikurnia;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import java.util.List;
import java.util.Map;


public class QuestionNumber3_JSONSchemaValidation {

static int statusCodes = 200;

    @Test
    public static void main(String[] args) {

        baseURI = "https://api.punkapi.com";

//   Verify that the amount of data returned
        List<Object> ResponseA =
                RestAssured
                        .given()
                        .get("/v2/beers")
                        .as(List.class);

                given().get("/v2/beers").then().assertThat().body(matchesJsonSchemaInClasspath("jsonSchema.json"))
                        .statusCode(statusCodes)
                        .contentType(ContentType.JSON);

                System.out.println(ResponseA.size());
                Assert.assertEquals(ResponseA.size(), 25);
                System.out.println("====================================");

//Print all returned “name” of list that endpoint data
        for(int i=0;i<25;i++) {
            Map<String, Object> data1 = (Map<String, Object>) ResponseA.get(i);
            System.out.println(data1.get("name"));

        }
    }

}
