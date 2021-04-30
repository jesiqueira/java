package part07.localDate;

import java.time.LocalTime;

public class ExemploLocalTimes002 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        //22:02:48.140558

        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);
    }
}
