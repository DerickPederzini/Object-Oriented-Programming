package code.Principles.Inheritance;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(4, 4, 4); //This is also static polymorphism, at compile time, java will differenciate between the
        //differences that exists in different class constructors, that way, you can have many methods with same name, but type, order, parameters, return types can be different;

        System.out.println(box.height + " " + box.getLength() + " " + box.width);

        ExtendedBox boxW = new ExtendedBox(4, "Red");
        System.out.println("BoxW: " + boxW.height + " " + boxW.color);

        ExtendedBox boxFullExtended = new ExtendedBox(5, 5, 5, 12, "Green");
        System.out.println(boxFullExtended.color + " " + boxFullExtended.height + " " + boxFullExtended.getLength() + " " + boxFullExtended.width + " " + boxFullExtended.weight);

        ExtendeeedBox box3 = new ExtendeeedBox(6,6,6,15, "Brown", 50.0);
        System.out.println(box3.color + " " + box3.height + " " + box3.getLength() + " " +
                box3.width + " " + box3.weight + " " + box3.getPrice());

        ExtendedBox2 box3_1 = new ExtendedBox2(4, 4, 4, "Meta");
        System.out.println(box3_1.name);

    }
}
