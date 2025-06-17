package ColecoesEStreams;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio06CS {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        HashMap<Integer,String> clientes =new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        System.out.println("Digite o número do ID: ");
        int id=sc.nextInt();


        if (clientes.containsKey(id)){
            System.out.println("O nome do cliente com ID "+ id +" é: "+clientes.get(id));
        }else{
            System.out.println("Cliente com ID não encontrado!");
        }
    }
}
