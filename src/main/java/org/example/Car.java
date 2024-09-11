package org.example;

public class Car {

    private int Velocity;
    private String Color;

    public Car(int velocity, String color) {
        this.Velocity = velocity;
        this.Color = color;
    }

    public String Accelerate(int velocity) {
        this.Velocity += velocity;

        return Status();
    }

    public String Status() {
        //String Format
        return String.format("Den %s bilen kör i %d Km/h", this.Color, this.Velocity);
    }

    public int getVelocity() {
        return Velocity;
    }

    public void setVelocity(int velocity) {
        Velocity = velocity;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
