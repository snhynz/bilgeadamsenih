package oop;

import javax.swing.*;

public class CarExample {
    String brand;
    int modelYear;
    String motorType;
    int capacity;
    String color;
    int enginePower;
    int speed;

    public double accelerateSpeed(double increase) {
        speed += increase;
        return speed;
    }

    public double lowerSpeed(double decrease) {
        double afterspeed = speed - decrease;
        if (afterspeed >= 0) {
            speed = (int) afterspeed;
            return speed;

        } else {
            System.err.println("Start Engine again");

        }
        return speed;
    }
}


