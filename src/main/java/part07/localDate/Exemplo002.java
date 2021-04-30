package part07.localDate;

import java.time.LocalDate;

public class Exemplo002 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);

        System.out.println(ontem);
    }
}
