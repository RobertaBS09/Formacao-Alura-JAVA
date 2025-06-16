package DataEHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio02DH {
    public static void main(String[] args) {
        LocalDate dataAtual =LocalDate.now();
        LocalTime horaAtual =LocalTime.now();

        DateTimeFormatter dataFormatada= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter horaFormatada =DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data formatada: "+dataAtual.format(dataFormatada));
        System.out.println("Hora formatada: "+horaAtual.format(horaFormatada));
    }
}
