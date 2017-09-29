package ru.sbt.hw1;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by user on 29.09.2017.
 */
class MaxTest {
    @Test
    public void testIsItMax(){
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        assertEquals(circle2,Max.max(circle1,circle2));
    }
    @Test
    public  void testIsItMax2(){
        Rectangle rec1 = new Rectangle(2,3);
        Square sq1 = new Square(5);
        assertEquals(sq1,Max.max(sq1,rec1));
    }
}