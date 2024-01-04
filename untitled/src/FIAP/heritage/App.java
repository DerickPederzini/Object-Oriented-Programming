package FIAP.heritage;

public class App {
    public static void main(String[] args) {

        Empregado e = new Empregado();
        Empregado g = new Gerente(5000, 30);

        System.out.printf("Proventos do empregado %,.2f\n",e.getProventos());

        System.out.printf("Proventos do gerente %,.2f",g.getProventos());
    }
}
