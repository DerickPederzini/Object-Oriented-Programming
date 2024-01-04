package privateThings.Main;

import privateThings.realprivate.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Thiago", 35);

        cliente.setNome("Matheus");

        System.out.println(cliente.getNome());

    }
}
