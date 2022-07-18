package oop;

public class carExampleTest {
    public static void main(String[] args) {
        CarExample car = new CarExample();
       car.accelerateSpeed(150);
        System.out.println("Your Speed " + car.speed);
        car.lowerSpeed(60);
        System.out.println("Your Speed " + car.speed);
    }


}
