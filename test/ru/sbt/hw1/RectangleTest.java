package ru.sbt.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by user on 29.09.2017.
 */
class RectangleTest {
    @Test
    public void testCalculateArea(){
        Rectangle rectangle = new Rectangle();
        assertEquals(1,rectangle.calculateArea());
        Rectangle rectangle1 = new Rectangle(2);
        assertEquals(2,rectangle1.calculateArea());
        Rectangle rectangle2 = new Rectangle(3,4);
        assertEquals(12,rectangle2.calculateArea());
    }

}