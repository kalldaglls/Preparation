package refactoring_code;

class LightWeightCar extends Car implements Moveable {
    @Override
    void open() {
        System.out.println("Car is open");// Car -> LightWeightCar
    }
    @Override
    public void move() {
        System.out.println("Car is moving");// Car -> LightWeightCar
    }
}
