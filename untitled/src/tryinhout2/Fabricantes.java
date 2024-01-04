package tryinhout2;

public class Fabricantes implements Persistivel{

    long id;
    String marca;
    String local;

    public Fabricantes(String marca, String local) {
        this.marca = marca;
        this.local = local;
    }

    @Override
    public String toString() {
        return "Fabricantes{" +
                "marca='" + marca + '\'' +
                ", local='" + local + '\'' +
                '}';
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Persistivel cadastrar(Persistivel p) {
        return p;
    }

    @Override
    public Persistivel consultar(long id) {
        return this;
    }

    @Override
    public Persistivel alterar(Persistivel p) {
        return p;
    }

    @Override
    public boolean excluir(long id) {
        return true;
    }
}
