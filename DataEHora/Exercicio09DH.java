package DataEHora;



import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio09DH {
    public static void main(String[] args) {
       ZonedDateTime horaAtual = ZonedDateTime.now();
       ZonedDateTime horaSydney =horaAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: "+ horaAtual.format(horaFormatada));
        System.out.println("Horário atual em Sydney: "+horaSydney.format(horaFormatada));
    }
}
