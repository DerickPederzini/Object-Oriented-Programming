package FIAP.Exercises;

public class OOP_intro {
    public static void main(String[] args) {

        Students derick = new Students("Derick", 9, 89.4f);
        Students evelyn = new Students("Evelyn", 1, 100.00f);

        derick.changeName("Derickzinho");
        derick.greeting();

        evelyn.greeting();

        Students randomTest = new Students(derick);

        System.out.println(randomTest.name);
        System.out.println(randomTest.gpa);
        System.out.println(randomTest.number);

        //this is how you call a constructor from another constructor
        Students callingFromConstruct = new Students();

        System.out.println(callingFromConstruct.number);
    }

}
class Students {
    String name = "none";
    float gpa = 0.0f;
    int  number = 0;

    //we need a way to add the values of the above properties object by object
    // we need one work to acess every object

    void changeName(String name){
        this.name = name;
    }

    void greeting(){
        System.out.println("Hello my name is "+ this.name+", my GPA is: "+this.gpa);
    }

    Students (Students other){
        this.name = other.name;
        this.number = other.number;
        this.gpa = other.gpa;
    }

    Students(){
        //this is how you call a constructor from another constructor
        this("Amigo", 15, 93);
    }

    Students (String name, int number, float gpa){
        this.name = name;
        this.number = number;
        this.gpa = gpa;
    }
}