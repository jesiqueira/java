package part02.contrutores.exemplo001;

public class ExemploCarro {

    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Ideia", 2020);

        System.out.println(carro.getMarca());
        carro.setVariante("Sob encomenta");
        System.out.println(carro);
    }
}
