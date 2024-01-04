package code.Interfaces.ExtendsDemo;

public interface A {

    //static methods should always have a body
    //call via the interface name
    static void demo(){
        System.out.println("Im in Interface A");
    }

    void fun();
}
