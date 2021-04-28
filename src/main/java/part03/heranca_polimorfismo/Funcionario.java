package part03.heranca_polimorfismo;

public abstract class Funcionario {
    private float salario;
    private String nome;
    private String setor;
    private String cargo;

    public Funcionario(String nome, String setor, String cargo, float salario) {
        this.nome = nome;
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
    }

    public float calcularImposto(){
        return (float) (getSalario() * 0.01);
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", cargo='" + cargo + '\'' +
                ", imposto=" + calcularImposto() +
                '}';
    }
}
