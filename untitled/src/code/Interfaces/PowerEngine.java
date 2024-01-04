package code.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop power engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate power engine");
    }

    @Override
    public void fun() {
        System.out.println("Very fun is the power engine");
    }
}
