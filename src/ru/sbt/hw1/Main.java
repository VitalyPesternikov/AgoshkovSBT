package ru.sbt.hw1;

/**
 * Created by Vitaly on 28.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(4);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2);
        Rectangle r3 = new Rectangle(3,4);
        Square s1 = new Square();
        Square s2 = new Square(5);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(s1);
        System.out.println(s2);

    }
}
