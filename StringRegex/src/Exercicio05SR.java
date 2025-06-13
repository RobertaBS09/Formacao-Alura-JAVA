package StringRegex.src;

import java.util.Scanner;

public class Exercicio05SR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto, palavra;

        System.out.print("Digite o texto: ");
        texto = sc.nextLine();

        System.out.print("Digite a palavra: ");
        palavra = sc.nextLine();

        if (texto.contains(palavra)) {
            System.out.printf("A palavra %s está presente no texto.", palavra.toUpperCase());
        } else {
            System.out.printf("A palavra %s não esta presente no texto.", palavra.toUpperCase());
        }


    }
}
