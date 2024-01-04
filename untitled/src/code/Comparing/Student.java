package code.Comparing;

public class Student implements Comparable<Student>{
    int rollN;
    double grade;

    public Student(int rollN, double grade) {
        this.rollN = rollN;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.grade - o.grade);

        return diff;
    }


}
