package ru.sbt.hw1;

/**
 * Created by Vitaly on 28.09.2017.
 */
public class Circle implements Shape {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle (){
        this.radius = 1;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return calculateArea()+"";
    }
}
