package code.staticExample;

public class StaticBlock {

    static int a = 4;
    static int b;

    static {//this will only run once, when the class is called the first time
        b = a*5;

        System.out.println("Im in a Static Block");
    }

    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +(" ")+ StaticBlock.b);

        StaticBlock.b += 3;//this will add to become 23

        System.out.println(a +(" ")+ b);

        StaticBlock obj2 = new StaticBlock();// this will not load the static block again, it will keep it as 23,
        System.out.println(StaticBlock.a +(" ")+ StaticBlock.b);
    }

}
