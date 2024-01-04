package tryinhout2;

import derick.tryingOOp.Fabricante;

public class App {
    public static void main(String[] args) {

        Computer computador = new Computer(1000, 6000, "intel", true, 8, new Fabricantes("dell", "Av.paulista"));


        System.out.println(computador.getCpu());
    }
}
