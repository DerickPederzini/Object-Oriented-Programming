package code.Interfaces.Nested;

public class A {

    public interface NestedInterface {
        boolean isEven(int n);
    }


}

class B implements A.NestedInterface{

    @Override
    public boolean isEven(int n) {
        return n % 2 == 0;
    }
}

class Main {
    public static void main(String[] args) {

        B obj = new B();

        System.out.println(obj.isEven(45));

    }
}
