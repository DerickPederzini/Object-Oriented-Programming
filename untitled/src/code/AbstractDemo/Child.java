package code.AbstractDemo;

public class Child extends Parent{

    @Override
    void career(String name) {
        System.out.println("I want to be a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+", she is "+age);
    }

}
