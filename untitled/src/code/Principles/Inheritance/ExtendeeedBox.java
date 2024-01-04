package code.Principles.Inheritance;

public class ExtendeeedBox extends ExtendedBox{
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ExtendeeedBox(double length, double height, double width, double weight, String color, double price) {
        super(length, height, width, weight, color);
        this.price = price;
    }

    public ExtendeeedBox(double length, double height, double width, double weight, String color) {
        super(length, height, width, weight, color);
    }
}
