package part06.dataFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo001 {
    public static void main(String[] args) {
        Date agora = new Date();

        String dataToStr = DateFormat.getDateInstance().format(agora);
        System.out.println(dataToStr);

        dataToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dataToStr);

        dataToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dataToStr);
    }
}
