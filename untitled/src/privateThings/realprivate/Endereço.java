package privateThings.realprivate;

public class Endereço {

    private String logradouro;
    private String cep;

    private boolean validarCep(String cep){
        return cep.length()==9;
    }
    public void alternaEndereço(String logradouro, String cep){
        if (validarCep(cep)){
            this.cep = cep;
            this.logradouro = logradouro;
        }
    }

    public String getLogradouro(){
        return logradouro;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        if (validarCep(cep)){
            this.cep= cep;
        }
    }

}
