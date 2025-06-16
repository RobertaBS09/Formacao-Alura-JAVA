package DataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio05DH {
    public static void main(String[] args) {
        LocalDate vencimentoOg = LocalDate.of(2025,03,20);
        int mesesAdicionado=1;

        LocalDate novoVencimento = vencimentoOg.plusMonths(mesesAdicionado);

        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = novoVencimento.format(formato);

        System.out.println("Nova data de vencimento: "+dataFormatada);
    }
}
