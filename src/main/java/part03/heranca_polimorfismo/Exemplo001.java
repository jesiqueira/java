package part03.heranca_polimorfismo;

public class Exemplo001 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jose edmar de Siqueira", "TI", "Gerente", 15000.0f);
        System.out.println(gerente);

        Supervisor supervisor = new Supervisor("Lucas", "TI", "supervisor", 6000.0f);
        System.out.println(supervisor);

        Atendente atendente = new Atendente("Pedro", "TI", "Atendente", 2000.0f);
        System.out.println(atendente);
    }
}
