package DataEHora;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio08DH {
    public static void main(String[] args) {
        ZonedDateTime horarioToquio= ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String  horarioFormatado = horarioToquio.format(formato);

        System.out.printf("Horário atual em Tóquio: %s ",horarioFormatado);
    }
}
