package ru.sbt.hw1;

/**
 * Created by Vitaly on 28.09.2017.
 */
public class Square {
    private double side;
    Square(double side){
        this.side = side;
    }

    Square(){
        this.side = 1;
    }

    public double calculateArea(){
        return side * side;
    }

    @Override
    public String toString(){
        return calculateArea()+"";
    }
}
