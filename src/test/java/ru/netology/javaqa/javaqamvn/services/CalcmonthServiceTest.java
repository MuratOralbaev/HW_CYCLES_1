package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcmonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void couldRest(int expected,int income,int expence, int treshold) {
        CalcmonthService service = new CalcmonthService();
        //int expected = 3;
        int actual = service.calculate(income, expence, treshold);
        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void couldRestLess() {
       // CalcmonthService service = new CalcmonthService();
        //int expected = 2;
        //int actual = service.calculate(100000, 60000, 150000);
      //  Assertions.assertEquals(expected, actual);
   // }
}