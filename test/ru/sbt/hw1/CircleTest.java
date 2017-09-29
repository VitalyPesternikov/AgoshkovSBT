package ru.sbt.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by user on 29.09.2017.
 */
class CircleTest {
    @Test
    public void testCalculateArea() {
        Circle circle = new Circle();
        assertEquals(3.14, circle.calculateArea(),0.01);
        Circle circle1 = new Circle(2);
        assertEquals(12.56, circle1.calculateArea(),0.01);
    }

}