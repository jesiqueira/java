package part04.data;

import java.util.Date;

public class Exemplo003 {

    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);
        System.out.println(dataNoPassado);

        Date dataNoFuturo = new Date(1719617602873L);
        System.out.println(dataNoFuturo);

        //Comparando se a dataNoPassado é posterior da danaNoFuturo
        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);

        //Comparando se a dataNoPassado é anterior a danaNoFuturo
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
    }
}
