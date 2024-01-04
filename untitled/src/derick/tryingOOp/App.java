package derick.tryingOOp;

public class App {
    public static void main(String[] args) {

        Computer pc = new Computer();

        pc.price = 5000.00;
        pc.cpu = "Intel 4400k";
        pc.hdSize = 1000;
        pc.gpuDedicada = true;
        pc.memoriaRam = 8;

        Fabricante dell = new Fabricante("Dell","Av Paulista" );;

        pc.fabricante = dell;

        double quantidadeDescTotal = pc.calculaDesc(0.2);
        System.out.println("Quantidade de desconto:"+quantidadeDescTotal);

        boolean sucesso = pc.quantidadeRam(8);

        if (sucesso){
            System.out.println("Memória RAM adicionada");
            System.out.println("Quantidade de memória RAM: "+pc.memoriaRam);
            System.out.println("Novo preço é de: "+pc.price);
        }else{
            System.out.println("Não foi possivel adicionar");
        }

    }
}
