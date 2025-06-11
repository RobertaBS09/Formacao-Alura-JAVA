package CondicionaisIfElse;

import java.util.Scanner;

public class Exercicio07IF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double valor;

        System.out.print("Digite o valor do empréstimo -->");
        valor =sc.nextDouble();

        if (valor>=1000 && valor<=5000){
            System.out.println("O valor "+valor+" , está dentro do intervalo permitido.");
        }
        else {
            System.out.println("O valor "+valor+" , não está dentro do intervalo permitido.");
        }
    }
}
