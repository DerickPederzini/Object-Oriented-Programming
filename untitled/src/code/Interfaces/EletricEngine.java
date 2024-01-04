package code.Interfaces;

public class EletricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts eletric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops eletric engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate eletric engine");
    }

    @Override
    public void fun() {
        System.out.println("How fun is a eletric engine?");
    }
}
