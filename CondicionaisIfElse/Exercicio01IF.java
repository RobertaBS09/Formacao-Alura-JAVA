package CondicionaisIfElse;

import java.util.Scanner;

public class Exercicio01IF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro --> ");
        numero=sc.nextInt();

        if (numero%2==0){
            System.out.println("O número " + numero+ " é PAR");
        }
        else{
            System.out.println("O número " + numero+ " é ÍMPAR");
        }
    }
}
