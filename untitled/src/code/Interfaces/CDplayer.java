package code.Interfaces;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }

    @Override
    public void fun() {
        System.out.println("Fun im havingg");
    }
}
