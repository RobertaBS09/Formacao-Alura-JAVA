package ColecoesEStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Exercicio07CS {
    public static void main(String[] args) {

        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
        List<String> funcionariosCom5Letras =funcionarios.stream().filter(f5 ->f5.length() <=5).collect(Collectors.toList());

        System.out.println(funcionariosCom5Letras);
    }
}
