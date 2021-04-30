package part05.calendar;

import java.util.Calendar;

public class Exemplo002 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        System.out.printf("%tF\n", agora);
        System.out.printf("%tD\n", agora);
        System.out.printf("%tr\n", agora);
        System.out.printf("%tT\n", agora);
    }
}
