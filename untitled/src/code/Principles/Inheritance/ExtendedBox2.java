package code.Principles.Inheritance;

public class ExtendedBox2 extends Box {
    String name;

    public ExtendedBox2(double length, double height, double width, String name) {
        super(length, height, width);
        this.name = name;

        System.out.println("Child Class 2");
    }
}
