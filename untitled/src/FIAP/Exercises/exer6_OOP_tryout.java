package FIAP.Exercises;

import java.util.Scanner;

public class exer6_OOP_tryout {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        char sexo = 0, eyeColor = 0, hairColor = 0;
        int age = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Sexo: ");
            sexo = input.next().toUpperCase().charAt(0);;
            System.out.println("Cor do olho: ");
            eyeColor = input.next().toUpperCase().charAt(0);
            System.out.println("Cor do cabelo");
            hairColor = input.next().toUpperCase().charAt(0);;
            System.out.println("Idade: ");
            age = input.nextInt();

            Caractheristics person = new Caractheristics(sexo, eyeColor, hairColor, age);
        }



    }
}

class Caractheristics{
    char sex = 0;
    char eyeColor = 0;
    char hairColor = 0;
    int age = 0;

    Caractheristics(char sex,char eyeColor, char hairColor, int age ){
        this.sex = sex;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.age = age;

    }



}
