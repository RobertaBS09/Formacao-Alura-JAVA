package ColecoesEStreams;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02CS {
    public static void main(String[] args) {
        List<String> listaInicial =new ArrayList<>();
        listaInicial.add("Joana");
        listaInicial.add("Lucas");
        listaInicial.add("Pedro");
        listaInicial.add("Antônio");

        System.out.println("Lista inicial: "+listaInicial);


        listaInicial.remove("Pedro");

        System.out.printf("Lista após a exclusão: %s",listaInicial);
    }
}
