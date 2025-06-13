package StringRegex.src;

import java.util.Scanner;

public class Exercicio08SR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String CPF;

        System.out.print("Digite o CPF: ");
        CPF=sc.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

        if (CPF.matches(regex)){
            System.out.printf("O CPF %s está no formato válido!", CPF);
        }else{
            System.out.printf("O CPF %s não está no formato valido",CPF);
        }


    }
}
