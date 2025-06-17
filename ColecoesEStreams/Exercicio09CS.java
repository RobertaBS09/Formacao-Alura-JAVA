package ColecoesEStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Exercicio09CS {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
        double antesDoImposto =  precosProdutos.stream().reduce(0.0,Double::sum);
        System.out.println("Valor total antes do imposto: "+antesDoImposto);

        double imposto= antesDoImposto *0.08;
        double comImposto = antesDoImposto+imposto;

        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", comImposto));
    }
}
