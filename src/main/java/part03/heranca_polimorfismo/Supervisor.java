package part03.heranca_polimorfismo;

public class Supervisor extends Funcionario{
    public Supervisor(String nome, String setor, String cargo, float salario) {
        super(nome, setor, cargo, salario);
    }

    @Override
    public float calcularImposto() {
        return (float) (getSalario() * 0.05);
    }
}
