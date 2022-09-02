package ru.buttonone.numbers;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static ru.buttonone.numbers.specification.NumbersSpecifications.defaultRequestSpecification;

public class NumbersTest {

    public static final String MAIN_URL = "http://numbersapi.com";
    public static final String NUMBER_URL = "/2";
    public static final String NUMBER_URL_2 = "http://numbersapi.com/{id}";
    public static final Header requestMethod = new Header("Request method", "GET");
    public static final String ID_PATH = "/{id}";


    @DisplayName("rest assured - " + MAIN_URL + NUMBER_URL_2)
    @Test
    public void shouldHaveCorrectGet1() {

//        Response response = RestAssured.given().get("http://numbersapi.com/2");
//
////        response.prettyPrint();
////        System.out.println(response.statusCode());
//
//        Assertions.assertEquals(200, response.statusCode());

        given()
                .baseUri(MAIN_URL)
                .header(requestMethod)
                .when()
                .get(NUMBER_URL)
                .then()
                .contentType(ContentType.TEXT)
                .log().all()
                .header("Cache-Control", "no-store, no-cache, must-revalidate, proxy-revalidate, max-age=0")
                .statusCode(200);

    }

    @Test
    public void shouldHaveCorrectGet2() {

//        RequestSpecification requestSpecification
//                = new RequestSpecBuilder()
//                .addHeader("Accept-Language", "ru")
//                .setBaseUri(MAIN_URL + NUMBER_URL)
//                .build();

        ResponseSpecification responseSpecification
                = new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .expectStatusCode(200)
                .build();

        given()
                .spec(defaultRequestSpecification())
//                .pathParam("id", 2)
                .when()
                .get(ID_PATH)
                .then()
                .contentType(ContentType.TEXT)
                .spec(responseSpecification);
    }

}
// given when then (Gherkin)