package Interfaces;

public class DrivableTest {
    public static void main(String[] args) {
        Car myCar = new Car("BMW M4GT");

        myCar.startEngine();
        myCar.stopEngine();
    }
}