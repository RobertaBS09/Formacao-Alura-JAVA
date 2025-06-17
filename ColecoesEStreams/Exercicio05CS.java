package ColecoesEStreams;

import java.util.HashMap;
import java.util.Map;

public class Exercicio05CS {
    public static void main(String[] args) {
        Map<Integer,String> clientes = new HashMap<>();

        clientes.put(1,"Christopher");
        clientes.put(2,"Marcos");
        clientes.put(3,"Matthew");

        System.out.println("O nome do cliente com ID 2 é: "+clientes.get(2));
    }
}
