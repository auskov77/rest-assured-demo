package ru.buttonone.lotr;

import io.restassured.response.ValidatableResponse;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.buttonone.model.Book;

import java.util.List;
import java.util.regex.Matcher;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("С API Властелина колец должны")
public class LotrTest {

    public static final String LOTR_API_URL = "https://the-one-api.dev/v2";

    @DisplayName(" корректно получать книги")
    @Test
    public void shouldHaveCorrectGetBooksTest(){
        ValidatableResponse validatableResponse = given()
                .baseUri(LOTR_API_URL)
                .when()
                .get("/book")
                .then()
                .statusCode(200);

        List<Book> bookList = validatableResponse
                .extract()
                .body()
                .jsonPath()
                .getList("docs", Book.class);

        System.out.println(bookList);

        //1
//        Assertions.assertAll(
//                () -> assertTrue(bookList.stream().anyMatch(b -> b.getName().equals("The Fellowship Of The Ring")))
//        );

        //2
//        MatcherAssert.assertThat(bookList, Matchers.hasItem(new Book("The Fellowship Of The Ring")));

        //3
        assertThat(bookList, hasItem(new Book("The Fellowship Of The Ring")));

        //4
//        assertThat(bookList, Matchers.contains(new Book("The Fellowship Of The Ring"),
//                new Book("The Two Towers"),
//                new Book("The Return Of The King")));

//                .log().all()
//                .statusCode(200);
    }
}
