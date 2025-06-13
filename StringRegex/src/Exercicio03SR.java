package StringRegex.src;

import java.util.Scanner;

public class Exercicio03SR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto, substituida, nova;

        System.out.print("Digite o texto: ");
        texto = sc.nextLine();
        System.out.print("Digite a palavra a ser substuida: ");
        substituida = sc.nextLine();


        if (!(texto.contains(substituida))) {
            System.out.printf("A palavra %s não foi encontrada no texto.", substituida.toUpperCase());
            return;
        }
        System.out.print("Digite a nova palavra: ");
        nova = sc.nextLine();

        System.out.printf("Texto modificado: %s", texto.replace(substituida, nova));

    }
}
