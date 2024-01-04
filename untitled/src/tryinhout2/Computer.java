package tryinhout2;

import derick.tryingOOp.Fabricante;

public class Computer implements Persistivel{

    private long id;
    private int hdSize;
    private double price;
    private String cpu;
    private boolean gpuDedicada;
    private int memoriaRam;
    private Fabricantes fabricante;

    public int getHdSize() {
        return hdSize;
    }

    public void setHdSize(int hdSize) {
        this.hdSize = hdSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public boolean isGpuDedicada() {
        return gpuDedicada;
    }

    public void setGpuDedicada(boolean gpuDedicada) {
        this.gpuDedicada = gpuDedicada;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Fabricantes getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricantes fabricante) {
        this.fabricante = fabricante;
    }

    public Computer() {
    }

    public Computer(int hdSize, double price, String cpu, boolean gpuDedicada, int memoriaRam, Fabricantes fabricante) {
        this.hdSize = hdSize;
        this.price = price;
        this.cpu = cpu;
        this.gpuDedicada = gpuDedicada;
        this.memoriaRam = memoriaRam;
        this.fabricante = fabricante;
    }

    public double calculaDesc(double quantidadeDesc){
        return price*quantidadeDesc;
    }

    boolean quantidadeRam(int quantidade) {
        if (quantidade %2 == 1) return false;

        memoriaRam += quantidade;
        price += quantidade*150;
        return true;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdSize=" + hdSize +
                ", price=" + price +
                ", cpu='" + cpu + '\'' +
                ", gpuDedicada=" + gpuDedicada +
                ", memoriaRam=" + memoriaRam +
                ", fabricante=" + fabricante +
                '}';
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Persistivel cadastrar(Persistivel p) {

        //foi cadastrado no banco de dados
        return p;
    }

    @Override
    public Persistivel consultar(long id) {
        return this;
    }

    @Override
    public Persistivel alterar(Persistivel p) {

        //alterando
        return p;
    }

    @Override
    public boolean excluir(long id) {
        return true;
    }
}


