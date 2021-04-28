package part04.data;

import java.util.Date;

public class Exemplo004 {

    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);
        System.out.println(dataNoPassado);

        Date dataNoFuturo = new Date(1613124807691L);
        System.out.println(dataNoFuturo);

        Date mesmaDataNoFuturo = new Date(1613124807691L);
        System.out.println(mesmaDataNoFuturo);

        //Comparando se as datas são Iguais
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
        System.out.println(isEquals); //true

        //Comparando uma data com outra data
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); // futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //Datas equivamentes

        System.out.println(compareCase1); // -1
        System.out.println(compareCase2); // 1
        System.out.println(compareCase3); // 0
    }
}
