package tryinhout2;

public class Cep implements Validavel<String>{

    String numeroCep;

    public Cep(String numeroCep) {
        if (validar(numeroCep)){
            this.numeroCep = numeroCep;
        }else {
            throw new RuntimeException("CEP INVALIDO");
        }
    }

    @Override
    public boolean validar(String s) {
        return s.matches("[0-9]{5}-[0-9]{3}");
    }

    @Override
    public String toString() {
        return numeroCep;
    }
}
