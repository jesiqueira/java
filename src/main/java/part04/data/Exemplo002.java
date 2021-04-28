package part04.data;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {

        Long currentTimeMills = System.currentTimeMillis();

        System.out.println(currentTimeMills);

        Date novaData = new Date(currentTimeMills);

        System.out.println(novaData);
    }
}
