package net.tryCloud.stepDefs;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static io.restassured.RestAssured.given;

public class APIDDT {
//trying is going on
    @ParameterizedTest
    @CsvFileSource(resources = "/zipcode.csv", numLinesToSkip = 1)
    @Then("the user get the data from CSV {string}")
    public void the_user_get_the_data_from_csv(String zip) {
        JsonPath jsonPath = given()
                .baseUri("https://api.zippopotam.us").pathParam("zipcode", zip).
                when()
                .get("/us/{zipcode}").
                then()
                .statusCode(200)
                .assertThat()
                .extract()
                .jsonPath();

        String city = jsonPath.getString("places[0].state");
        String city1 = jsonPath.getString("places.state");

        System.out.println("city = " + city);
        System.out.println("city = " + city1);
    }
}
