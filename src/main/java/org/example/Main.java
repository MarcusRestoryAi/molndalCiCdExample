package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Car car1 = new Car(0, "Green");
        Car car2 = new Car(50, "Red");

        System.out.println(car1.Status());
        System.out.println(car2.Status());

        System.out.println( car1.Accelerate(150) );
    }
}