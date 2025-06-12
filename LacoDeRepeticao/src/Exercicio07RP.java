package LacoDeRepeticao.src;

import java.util.Scanner;

public class Exercicio07RP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int caracteres = 0;


        while (caracteres <= 3) {
            System.out.print("Digite seu nome: ");
            nome = sc.next();
            caracteres = nome.length();

            if (caracteres < 3) {
                System.out.println("Nome inválido.Digite novamente.");
            } else {
                System.out.println("Nome " + nome + " cadastrado com sucesso!");
                break;

            }
        }
    }


}
