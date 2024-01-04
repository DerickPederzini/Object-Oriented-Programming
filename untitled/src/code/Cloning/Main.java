package code.Cloning;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {

        Human derick = new Human(18, "Derick");

        Human twin = (Human)derick.clone();

        System.out.println(twin.name);

    }
}
