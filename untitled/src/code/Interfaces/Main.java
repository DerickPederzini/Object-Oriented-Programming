package code.Interfaces;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//
//        EletricCar eletricCar = new EletricCar();
//
//        car.accelerate();
//        eletricCar.accelerate();

        NiceCar carr = new NiceCar();

        carr.start();

        carr.startMusic();

        carr.upgradeEngine(new PowerEngine());

        carr.start();

        carr.brakes(new EletricCar());


    }
}
