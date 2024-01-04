package tryinhout2;

public interface Persistivel  {

    public long getId();

    public Persistivel cadastrar(Persistivel p);

    public Persistivel consultar(long id);

    public Persistivel alterar(Persistivel p);

    public boolean excluir(long id);


}
