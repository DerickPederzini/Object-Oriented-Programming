package code.Principles.Inheritance;

public class ExtendedBox extends Box {
    double weight;
    String color;

    public ExtendedBox(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public ExtendedBox(double length, double height, double width, double weight, String color) {
        super(length, height, width);
        //used to call the parent class constructor and initialize its values
        //EXTENDED BOX CANNOT ACESS PRIVATE BOX ELEMENTS, only if it calls its constructor

        System.out.println(super.height+" This was made using super");


        this.weight = weight;
        this.color = color;
    }
}
