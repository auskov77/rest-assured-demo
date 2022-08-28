package ru.buttonone.numbers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    public static final String NUMBERS_URL = "http://numbersapi.com";

    @DisplayName("rest assured - http://numbersapi.com/2")
    @Test
    public void shouldHaveCorrectGet2() {

//        Response response = RestAssured.given().get("http://numbersapi.com/2");
//
////        response.prettyPrint();
////        System.out.println(response.statusCode());
//
//        Assertions.assertEquals(200, response.statusCode());

        RestAssured
                .given()
                .baseUri(NUMBERS_URL)
                .header("Request method", "GET")
                .header("Request URI", "http://numbersapi.com/2")
                .header("Accept-Encoding", "gzip, deflate")
                .header("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("Accept", "*/*")
                .header("Cache-Control", "max-age=0")
                .header("Connection", "keep-alive")
                .header("Host", "numbersapi.com")
                .header("Upgrade-Insecure-Requests", "1")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36")
                .when()
                .get("/2")
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
                .header("Content-Type", "text/plain; charset=utf-8")
                .header("Access-Control-Allow-Origin", "*")
                .statusCode(200);
    }

    @DisplayName("rest assured - http://numbersapi.com/8/27/date")
    @Test
    public void shouldHaveCorrectGet3() {
        RestAssured
                .given()
                .baseUri(NUMBERS_URL)
                .header("Request method", "GET")
                .header("Request URI", "http://numbersapi.com/8/27/date")
                .header("Accept-Encoding", "gzip, deflate")
                .header("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("Accept", "*/*")
                .header("Cache-Control", "max-age=0")
                .header("Connection", "keep-alive")
                .header("Host", "numbersapi.com")
                .header("Upgrade-Insecure-Requests", "1")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36")
                .when()
                .get("/8/27/date")
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
                .header("Content-Type", "text/plain; charset=utf-8")
                .header("Access-Control-Allow-Origin", "*")
                .statusCode(200);
    }

    @DisplayName("rest assured - http://numbersapi.com/8/math")
    @Test
    public void shouldHaveCorrectGet4() {
        RestAssured
                .given()
                .baseUri(NUMBERS_URL)
                .header("Request method", "GET")
                .header("Request URI", "http://numbersapi.com/8/math")
                .header("Accept-Encoding", "gzip, deflate")
                .header("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("Accept", "*/*")
                .header("Cache-Control", "max-age=0")
                .header("Connection", "keep-alive")
                .header("Host", "numbersapi.com")
                .header("Upgrade-Insecure-Requests", "1")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36")
                .when()
                .get("/8/math")
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
                .header("Content-Type", "text/plain; charset=utf-8")
                .header("Access-Control-Allow-Origin", "*")
                .statusCode(200);
    }

}
// given when then (Gherkin)