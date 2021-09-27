package net.tryCloud.stepDefs;


import com.github.javafaker.Faker;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JUnit5RepeatedTest {

    @RepeatedTest(10)
    void RepeatedOne() {
        Faker faker=new Faker();
        System.out.println("faker.funnyName().name() = " + faker.funnyName().name());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());}
    }
