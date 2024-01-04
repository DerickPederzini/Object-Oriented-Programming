package derick.tryingOOp;

public class Computer {

    int hdSize;
    double price;
    String cpu;
    boolean gpuDedicada;
    int memoriaRam;
    Fabricante fabricante;

    public double calculaDesc(double quantidadeDesc){
        return price*quantidadeDesc;
    }

    boolean quantidadeRam(int quantidade) {
        if (quantidade %2 == 1) return false;

        memoriaRam += quantidade;
        price += quantidade*150;
        return true;

    }


}


