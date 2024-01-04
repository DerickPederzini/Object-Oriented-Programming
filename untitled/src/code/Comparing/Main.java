package code.Comparing;

public class Main {
    public static void main(String[] args) {

        Student derick = new Student(2, 33.4);
        Student lucas = new Student(3, 299.3);

        if (derick.compareTo(lucas) > 0){
            System.out.println("Derick has more grade");
        }else{
            System.out.println("Lucas has more grade");
        }

    }
}
