package code.staticExample;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human derick = new Human(18, "Derick", true, 1000);
        Human camile = new Human(19, "Camile", true, 1001);

        System.out.println(derick.name);
        System.out.println(camile.engaged);

        System.out.println(Human.population);

        fun();
    }

    static void fun() {
//            greeting();//you cannot use static stuff, if their instances are not static

        Main obj = new Main();
        obj.greeting();
    }


    void greeting() {
        System.out.println("Hello world");
    }
}
