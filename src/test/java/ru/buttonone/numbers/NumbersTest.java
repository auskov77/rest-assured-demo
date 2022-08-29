package ru.buttonone.numbers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    public static final String MAIN_URL = "http://numbersapi.com";
    public static final String NUMBER_URL = "/2";
    public static final String NUMBERSAPI_COM = "numbersapi.com";
    public static final String DATE_URL = "/8/27/date";
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36";
    public static final String CONTENT_TYPE = "text/plain; charset=utf-8";
    public static final String MATH_URL = "/8/math";

    @DisplayName("rest assured - " + MAIN_URL + NUMBER_URL)
    @Test
    public void shouldHaveCorrectGetNumberUrl() {

//        Response response = RestAssured.given().get("http://numbersapi.com/2");
//
////        response.prettyPrint();
////        System.out.println(response.statusCode());
//
//        Assertions.assertEquals(200, response.statusCode());

        RestAssured
                .given()
                .baseUri(MAIN_URL)
                .header("Request method", "GET")
                .header("Request URI", MAIN_URL + NUMBER_URL)
                .header("Accept-Encoding", "gzip, deflate")
                .header("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("Accept", "*/*")
                .header("Cache-Control", "max-age=0")
                .header("Connection", "keep-alive")
                .header("Host", NUMBERSAPI_COM)
                .header("Upgrade-Insecure-Requests", "1")
                .header("User-Agent", USER_AGENT)
                .when()
                .get(NUMBER_URL)
                .then()
                .contentType(ContentType.TEXT)
                .log().all()
                .header("Cache-Control", "no-store, no-cache, must-revalidate, proxy-revalidate, max-age=0")
                .header("Expires", "0")
                .header("Pragma", "no-cache")
                .header("X-Numbers-API-Type", "trivia")
                .header("X-Numbers-API-Number", "2")
                .header("Server", "nginx/1.4.6 (Ubuntu)")
                .header("X-Powered-By", "Express")
                .header("Connection", "keep-alive")
                .header("Content-Type", CONTENT_TYPE)
                .header("Access-Control-Allow-Origin", "*")
                .statusCode(200);
    }

    @DisplayName("rest assured - " + MAIN_URL + DATE_URL)
    @Test
    public void shouldHaveCorrectGetDateUrl() {
        RestAssured
                .given()
                .baseUri(MAIN_URL)
                .header("Request method", "GET")
                .header("Request URI", MAIN_URL + DATE_URL)
                .header("Accept-Encoding", "gzip, deflate")
                .header("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("Accept", "*/*")
                .header("Cache-Control", "max-age=0")
                .header("Connection", "keep-alive")
                .header("Host", NUMBERSAPI_COM)
                .header("Upgrade-Insecure-Requests", "1")
                .header("User-Agent", USER_AGENT)
                .when()
                .get(DATE_URL)
                .then()
                .contentType(ContentType.TEXT)
                .log().all()
                .header("Cache-Control", "no-store, no-cache, must-revalidate, proxy-revalidate, max-age=0")
                .header("Expires", "0")
                .header("Pragma", "no-cache")
                .header("X-Numbers-API-Type", "date")
                .header("X-Numbers-API-Number", "240")
                .header("Server", "nginx/1.4.6 (Ubuntu)")
                .header("X-Powered-By", "Express")
                .header("Connection", "keep-alive")
                .header("Content-Type", CONTENT_TYPE)
                .header("Access-Control-Allow-Origin", "*")
                .statusCode(200);
    }

    @DisplayName("rest assured - " + MAIN_URL + MATH_URL)
    @Test
    public void shouldHaveCorrectGetMathUrl() {
        RestAssured
                .given()
                .baseUri(MAIN_URL)
                .header("Request method", "GET")
                .header("Request URI", MAIN_URL + MATH_URL)
                .header("Accept-Encoding", "gzip, deflate")
                .header("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("Accept", "*/*")
                .header("Cache-Control", "max-age=0")
                .header("Connection", "keep-alive")
                .header("Host", NUMBERSAPI_COM)
                .header("Upgrade-Insecure-Requests", "1")
                .header("User-Agent", USER_AGENT)
                .when()
                .get(MATH_URL)
                .then()
                .contentType(ContentType.TEXT)
                .log().all()
                .header("Cache-Control", "no-store, no-cache, must-revalidate, proxy-revalidate, max-age=0")
                .header("Expires", "0")
                .header("Pragma", "no-cache")
                .header("X-Numbers-API-Type", "math")
                .header("X-Numbers-API-Number", "8")
                .header("Server", "nginx/1.4.6 (Ubuntu)")
                .header("X-Powered-By", "Express")
                .header("Connection", "keep-alive")
                .header("Content-Type", CONTENT_TYPE)
                .header("Access-Control-Allow-Origin", "*")
                .statusCode(200);
    }

}
// given when then (Gherkin)