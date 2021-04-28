package part03.heranca_polimorfismo;

public class Gerente extends Funcionario{
    public Gerente(String nome, String setor, String cargo, float salario) {
        super(nome, setor, cargo, salario);
    }

    @Override
    public float calcularImposto() {
        return (float) (getSalario() * 0.1);
    }
}
