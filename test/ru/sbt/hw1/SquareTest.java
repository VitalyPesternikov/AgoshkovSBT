package ru.sbt.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by user on 29.09.2017.
 */
class SquareTest {
    @Test
    public void testCalculateArea(){
        Square square = new Square();
        assertEquals(1,square.calculateArea());
        Square square1 = new Square(3);
        assertEquals(9,square1.calculateArea());
    }

}