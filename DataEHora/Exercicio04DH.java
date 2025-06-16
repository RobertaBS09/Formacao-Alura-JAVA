package DataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio04DH {
    public static void main(String[] args) {
        LocalDate dataInicio =LocalDate.of(2025,03,15);
        LocalDate dataEntrega = dataInicio.plusDays(15);
        // poderia também criar uma variável int prazoDias com o valor de 15. Depois era só fazer o LocalDate entrega= DataInicio.plusDays(prazoDias)

        DateTimeFormatter dataFormatada= DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data de entrega: "+ dataEntrega.format(dataFormatada));
    }
}
