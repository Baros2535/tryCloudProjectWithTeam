package net.tryCloud.stepDefs;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class JUnit5ParameterizedTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/zipcode.csv", numLinesToSkip = 1)
    public void test2( String zip ){
        System.out.println(zip);
    }


    //try different data type
    @ParameterizedTest
    @ValueSource(strings = {"ankara","istanbul","zonguldak"})
    public void test3(String city ){
        System.out.println(city);
    }





    // using CSV file as source for parameterized test
    @ParameterizedTest
    @CsvFileSource(resources = "/zipcode.csv", numLinesToSkip = 1)
    public void test4( String zip ){
        System.out.println("zip = " + zip);
        // sending request to zipcode endpoint here
        //api.zippopotam.us/us/{zipcode}
        // baseurl : api.zippopotam.us
        //  endpoint is /us/{zipcode}
        JsonPath jsonPath = given()
                .baseUri("https://api.zippopotam.us")
                .pathParam("zipcode", zip).
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

    // using CSV file as source for parameterized test
    @ParameterizedTest
    @CsvFileSource(resources = "/countryAndZip.csv" , numLinesToSkip = 1)
    public void test4(String country,int zip ){
        System.out.println("zip = " + zip);
        System.out.println("country = " + country);
        // sending request to zipcode endpoint here
        //api.zippopotam.us/us/{zipcode}
        // baseurl : api.zippopotam.us
        //  endpoint is /us/{zipcode}
        JsonPath jsonPath = given()
                .baseUri("https://api.zippopotam.us")
                .pathParam("zipcode", zip)
                 .pathParam("country", country).

                when()
                .get("/{country}/{zipcode}").
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


