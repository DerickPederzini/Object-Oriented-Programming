package code.Acess;

public class A {

    char yo; // every class in its package (only its package, inheritance involved)
    private int num; // only class can acess
    public String name;// every class can acess
    protected int [] arr; //class, its own package, every subclass in package (inheritance), same and different packages


    //PROTECTED IS USED WHEN WANT TO DO INHERITANCE. IF YOU TRY TO ACESS IT OUT OF ITS CLASS, YOU NEED TO ACESS VIA SUBCLASS, NORMAL CLASS WONT ALLOW IT
    //PRIVATE IS FOR SENSIVE DATA
    //IF YOU DONT WANT DATA TO BE USED BY OTHER PACKAGES, FOR EXAMPLE A STUDENTS  PACKAGE WITH INFORMATION OF STUDENTS, USE NO MODIFIER
    //PUBLIC IS IF YOU WANT TO BE ACESS EVERYWHERE

    public int getNum() {//Returns the num, since its private, thats the only way you can get its value
        return num;
    }

    public void setNum(int num) {//makes you able to set/ change the value of num
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int [num];
    }
}
