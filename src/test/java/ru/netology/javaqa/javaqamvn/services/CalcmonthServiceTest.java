package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcmonthServiceTest {
    @Test
    public void couldRest() {
        CalcmonthService service = new CalcmonthService();
        int expected = 3;
        int actual = service.calculate(10000,3000,20000);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void couldRestLess() {
        CalcmonthService service = new CalcmonthService();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);
    }
}