package ru.sbt.hw1;

/**
 * Created by user on 29.09.2017.
 */
public class Max {
    public static Shape max(Shape sh1, Shape sh2){
        if (sh1.calculateArea()>sh2.calculateArea()) return sh1;
        return sh2;
    }
}
