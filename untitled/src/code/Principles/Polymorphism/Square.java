package code.Principles.Polymorphism;

public class Square extends Shapes{

    //final can prevent overriding
    //if a class is final, all its methods will be final too
     final void area(){
        System.out.println("Area is side^2");
    }



}
