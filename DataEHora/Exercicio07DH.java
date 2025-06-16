package DataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio07DH {
    public static void main(String[] args) {

        LocalDate diaVencimento= LocalDate.of(2025,03,30);
        int diasDeAntecedencia =5;

        LocalDate diaAviso = diaVencimento.minusDays(diasDeAntecedencia);
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = diaAviso.format(formato);

        System.out.printf("Data do Lembrete --> %s",dataFormatada);
    }
}
