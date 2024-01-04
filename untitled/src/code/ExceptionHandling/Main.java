package code.ExceptionHandling;

import java.security.spec.ECField;

public class Main {
    public static void main(String[] args) throws MyException {

        int a = 5;
        int b = 0;


        try {

            String name = "Drick";
            if(!name.equals("Derick")){
                throw new MyException("Name is Derick");
            }
            divide(a, b);

        }catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }

    }

    static int divide (int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Dont divide by zero");
        }

        return a / b;
    }
}
