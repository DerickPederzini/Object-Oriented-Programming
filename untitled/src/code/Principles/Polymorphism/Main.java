package code.Principles.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Shapes circle2 = new Circle();
        //In overriding, the class that matters for is the object class being created, not the type of the variable

        //How does java know which class should be called?
        circle2.area();
    }
}
