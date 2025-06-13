package StringRegex.src;

import java.util.Scanner;

public class Exercicio02SR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto, textoMaiusculo, textoMinusculo;

        System.out.print("Digite o texto: ");
        texto = sc.nextLine();

        textoMaiusculo = texto.toUpperCase();
        textoMinusculo = texto.toLowerCase();

        System.out.printf("Texto em maiúsculas: %s %n", textoMaiusculo);
        System.out.printf("Texto em minúsculas: %s ", textoMinusculo);
    }
}
