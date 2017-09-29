package ru.sbt.hw1;

/**
 * Created by Vitaly on 28.09.2017.
 */
public class Rectangle implements Shape {
    private double length;
    private double width;
    Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    Rectangle (double length){
        this.length = length;
        this.width = 1;
    }

    Rectangle () {
        this.length = 1;
        this.width = 1;
    }

    public double calculateArea(){
        return length * width;
    }
    @Override
    public String toString(){
        return calculateArea()+"";
    }
}
