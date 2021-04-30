package part07.localDate;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExemploLocalTimes003 {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        //22:02:48.140558

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
        System.out.println(futuro);
    }
}
