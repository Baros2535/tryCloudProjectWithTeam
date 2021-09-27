package net.tryCloud.stepDefs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JUnit5MethodSource {

    @ParameterizedTest
    @MethodSource("stringProvider")
    public void test3( String city ){
        System.out.println(city);
    }

    public static List<String> stringProvider(){
        List<String> a=new ArrayList<>();
        a.add("Anakra");
        a.add("istanbul");
        a.add("Zonguldak");
        return a;

    }
}
