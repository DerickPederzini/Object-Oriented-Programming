package code.Acess;

public class Main {
    public static void main(String[] args) {

        A obj = new A(9, "Derick");
        //Need to do a few things
        //1 Acess the data members
        //2 Modify them
        // - Acess modifiers exists to give more security by not letting the user directly change the components of the class outside of its class

        obj.setNum(34);



        System.out.println(obj.getNum());

    }
}
