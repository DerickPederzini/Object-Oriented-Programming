package code.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDplayer();
    private Brake brakes = new EletricCar();

    public NiceCar() {
        engine = new EletricEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start (){
        engine.start();
    }

    public void stop (){
        engine.stop();
    }

    public void startMusic (){
        player.start();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }

    public void brakes(Brake brakes){
        brakes.brake();
    }
}
