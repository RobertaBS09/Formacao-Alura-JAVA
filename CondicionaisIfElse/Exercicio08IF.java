package CondicionaisIfElse;

import java.util.Scanner;

public class Exercicio08IF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int lado1,lado2,lado3;


        System.out.print("Digite o primeiro lado:");
        lado1=sc.nextInt();
        System.out.print("Digite o segundo lado:");
        lado2=sc.nextInt();
        System.out.print("Digite o terceiro lado:");
        lado3= sc.nextInt();

        if (lado1+lado2>lado3 && lado1+lado3>lado2 && lado3+lado2>lado1){
            System.out.println("Os lados podem formar um triângulo.");
        }
        else{
            System.out.println("Os lados não podem formar um triângulo");
        }
    }
}
