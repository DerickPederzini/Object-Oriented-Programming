package FIAP.Exercises;

public class OOP_wrapper_ex {
    public static void main(String[] args) {
        //int a = 10;
       // int b = 20;
        //Integer num = 45;

        Integer a = 45;
        Integer b = 31;

        swap(a,b);

        System.out.println(a+ " " + b);

        final int bonus = 2;

        final A derick = new A("Derick");
        derick.name = "Myself";//will not give error msg

        //when non primitive is final you cannot reassign it

        //derick = new A("New name");//will give error msg

        //Showing destroying objects

        //A obj;

        //for (int i = 0; i < 10000000; i++) {
           // obj = new A("Random name");
        //}

    }

    static void swap(Integer a, Integer b){

        //will not swap, because Integer is a final function
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class  A {
    final int number = 30;
    String name;
    //final variables have to be initialize

    public A(String name ){
        this.name = name;
    }



    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
