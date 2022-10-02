package day3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static org.testng.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeMethod
    void setUp() {

        System.out.println("wykonuje test");
        calculator = new Calculator();
        System.out.println("Otwieram bazę danych");

    }

    @AfterMethod
    void tearDown() {
        System.out.println("Zamykam bazę danych");
    }

    @Test
    public void testAddTwoNumbers() {

        int actualResult = calculator.addTwoNumbers(2, 3);
        int expectedResult = 5;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubstractTwoNumber() {

        int actualResult = calculator.substractTwoNumbers(50, 21);
        int expectedResult = 29;
        assertEquals(actualResult, expectedResult);
    }


}