package ColecoesEStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Exemplo2 {
    public static void main(String[] args) {
        List <String> funcionarios=List.of("Ana","Bruno","Carlos","Amanda");

        List<String> funcionariosLetraA = funcionarios.stream().filter(f -> f.startsWith("A")).collect(Collectors.toList());

        System.out.println(funcionarios);
        System.out.println(funcionariosLetraA);




        List<Double> valoresVendas = List.of(500.0,1800.0,6200.0);

        List<Double> comissao = valoresVendas.stream().map(v -> v*0.05).collect(Collectors.toList());

        System.out.println(valoresVendas);
        System.out.println(comissao);

        double totalVendas =valoresVendas.stream().reduce(0.0,Double::sum);

        System.out.println(totalVendas);
    }
}
