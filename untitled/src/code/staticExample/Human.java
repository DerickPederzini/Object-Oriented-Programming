package code.staticExample;

public class Human {
    int age;
    String name;
    boolean engaged;
    double salary;

    static long population;

    public Human(int age, String name, boolean engaged, double salary) {
        this.age = age;
        this.name = name;
        this.engaged = engaged;
        this.salary = salary;

        Human.population += 1;
    }
}
