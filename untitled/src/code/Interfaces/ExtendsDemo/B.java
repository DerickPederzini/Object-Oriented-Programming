package code.Interfaces.ExtendsDemo;

public interface B extends A{

    //if the parent class in protected
    //the override in child class should be protected or greater (public)
    void greet();

}
