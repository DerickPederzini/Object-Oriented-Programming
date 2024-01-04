package code.Principles.Inheritance;

public class Box {

    private double length;

    public double getLength() {//makes it able to get the value created by constructor
        return length;
    }

    public void setLength(double length) {//makes it able to change it
        this.length = length;
    }

    double height;
    double width;

    Box(){
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    Box(double side){
        this.width = side;
        this.height = side;
        this.length = side;
    }

    Box(double length, double height, double width) {

        if(length != height || length != width || height != width){
            throw new RuntimeException("Todos os lados devem ser iguais!");
        }

        this.length = length;
        this.height = height;
        this.width = width;

        System.out.println("Box successfully created");
    }

    Box(Box old){
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void displayInfo(){

        System.out.println("Running the box");

    }

}
