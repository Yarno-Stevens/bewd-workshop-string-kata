package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    private StringCalculator sut;

    @BeforeEach
    void setup(){
        sut = new StringCalculator();
    }

    @Test
    void addEmptyStringTest(){
        // Arrange

        //Act
        var testValue = sut.add("");

        //Assert
        Assertions.assertEquals(0, testValue);
    }

    @Test
    void addSingleNumberInStringTest(){
        // Arrange

        //Act
        var testValue = sut.add("1");

        //Assert
        Assertions.assertEquals(1, testValue);
    }

    @Test
    void addTwoNumbersInStringTest(){
        // Arrange

        //Act
        var testValue = sut.add("1,2");

        //Assert
        Assertions.assertEquals(3, testValue);
    }

    @Test
    void addRandomNumbersInStringTest(){
        // Arrange

        //Act
        var testValue = sut.add("14,22,45,13,67,89");

        //Assert
        Assertions.assertEquals(250, testValue);
    }

    @Test
    void addTwoNumberInStringWithNewLineSeparatorTest(){
        // Arrange

        //Act
        var testValue = sut.add("1\n2");

        //Assert
        Assertions.assertEquals(3, testValue);
    }

    @Test
    void addTreeNumberInStringWithNewLineSeparatorAndCommaSeparatorTest(){
        // Arrange

        //Act
        var testValue = sut.add("1\n2,3");

        //Assert
        Assertions.assertEquals(6, testValue);
    }
}