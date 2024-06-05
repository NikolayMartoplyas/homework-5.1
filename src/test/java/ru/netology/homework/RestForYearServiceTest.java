package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class RestForYearServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void numberOfHolidaysPerYear (int income, int expenses, int threshold, int expected ) {
        RestForYearService service = new RestForYearService();
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//
//        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
