package code.Principles.Polymorphism;

public class Shapes {

    //if you create var of type shapes, but with the obj as one of its child classes.
    //For this example, the parent class needs to have this area method, so the other methods can override something for them.
    //This is due to the inheritance making the child classes having acess to things the parent has, if parent has none, it will not work
    void area(){
        System.out.println("I´m in shapes");
    }

}
