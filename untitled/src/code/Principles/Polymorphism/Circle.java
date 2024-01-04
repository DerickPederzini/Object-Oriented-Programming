package code.Principles.Polymorphism;

public class Circle extends Shapes{

    //RunTime/Dynamic Polymorphism
    //If the child class has the same methods and parameters and return types as the parent class, but the body is different, you know that overriding is happening
    //If there is not, like in constructors, the polymorphism happens in compile time

    //this will run when the circle class is created, hence is overriding the parent class method
    @Override // this is called annotation, used for checks
    void area(){
        System.out.println("Area is pi*r^2");
    }


}
