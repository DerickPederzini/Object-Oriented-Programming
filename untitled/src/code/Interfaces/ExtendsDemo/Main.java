package code.Interfaces.ExtendsDemo;

public class Main implements B{

    @Override
    public void fun() {
        System.out.println("Fun");
    }

    @Override
    public void greet() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Main obj = new Main();

        A.demo();
        obj.greet();
    }


}
