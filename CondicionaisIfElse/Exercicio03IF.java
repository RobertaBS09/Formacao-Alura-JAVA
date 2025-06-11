package CondicionaisIfElse;

import java.util.Scanner;

public class Exercicio03IF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String senha = "123456";
        String senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada=sc.next();

        if (senhaDigitada.equalsIgnoreCase(senha)){
            System.out.println("Acesso Permitido!");
        }
        else {
            System.out.println("Aceso Negado!");
        }
    }
}
