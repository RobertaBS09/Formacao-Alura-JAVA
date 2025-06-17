package ColecoesEStreams;

import java.util.List;

public class Exercicio10CS {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double Somamedia = notas.stream().reduce(0.00,Double::sum);
        double media = Somamedia/5;

        System.out.println("A média das notas é: "+media);

        double menorNota = notas.stream().min(Double::compare).get();
        double maiorNota = notas.stream().max(Double::compare).get();

        System.out.println("A menor nota foi: " + menorNota);
        System.out.println("A maior nota foi: " + maiorNota);

    }
}
