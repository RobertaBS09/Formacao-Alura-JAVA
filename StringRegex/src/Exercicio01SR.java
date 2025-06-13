package StringRegex.src;

import java.util.Scanner;

public class Exercicio01SR {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String nome;
        String nomeFormatado;

        System.out.print("Digite o nome: ");
        nome=sc.nextLine()                                                          ;
        nomeFormatado =nome.trim();
        System.out.printf("Nome sem espaços:  %s",nomeFormatado);
        }
}
