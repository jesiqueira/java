package part08.paradigmas.funcional;

import java.util.function.UnaryOperator;

public class Exemplo01 {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor * 3;
        int valor = 10;
        System.out.println("O resultado é: " + calcularValorVezes3.apply(valor));
    }
}
