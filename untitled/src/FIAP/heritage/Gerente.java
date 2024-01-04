package FIAP.heritage;

public class Gerente extends Empregado{

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getProventos() {
        return super.getSalario()*( (1+bonus/100));
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Gerente(double salario, double bonus) {
        super();

        this.bonus = bonus;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gerente{");
        sb.append("bonus=").append(bonus);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
