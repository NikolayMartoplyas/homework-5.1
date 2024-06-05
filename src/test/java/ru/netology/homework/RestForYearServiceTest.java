package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RestForYearServiceTest {
    @Test
    public void numberOfHolidaysPerYear () {
        RestForYearService service = new RestForYearService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
