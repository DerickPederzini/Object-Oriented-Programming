package FIAP.Exercises;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int x = 100;


        if (x > 100) {

            x += 10;

        } else {

            x -= 10;

        }


        int y = x == 90 ? 10 : 20;


        if (x + y > 100) {

            System.out.println("Primeiro if");

        } else if (x > 100 || x > y) {

            System.out.println("Segundo if");

        } else {

            System.out.println("Terceiro if");

        }
    }


}
