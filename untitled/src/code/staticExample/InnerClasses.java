package code.staticExample;

public class InnerClasses {
     static class Test { // ONLY INNER CLASSES CAN BE STATIC
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test hello = new Test("Derick");
        Test hallo = new Test("Camile");
    }
}
