package code.Interfaces;

public class EletricCar implements Engine, Brake, Media{

    @Override
    public void brake() {
        System.out.println("I brake like a eletric car");
        System.out.println(Brake.PRICE);
    }

    @Override
    public void start() {
        System.out.println("I start like a eletric car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a eletric car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a eletric car");
    }

    @Override
    public void fun() {
        System.out.println("I have fun like an eletric car");
    }


}
