package part06.dataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Exemplo002 {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:MMM");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);

    }
}
