package Interfaces;

class Car implements Drivable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println(model + "'s engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(model + "'s engine stopped.");
    }
}