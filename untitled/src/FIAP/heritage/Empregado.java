package FIAP.heritage;

public class Empregado {

    private double salario;

    public double getProventos(){
        return salario;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empregado() {
        this.salario = salario;
    }




    @Override
    public String toString() {
        return "Empregado{" +
                "salario=" + salario +
                '}';
    }
}
