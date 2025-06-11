package CondicionaisIfElse;

import java.util.Scanner;

public class Exercicio09IF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double peso;
        int idade;

        System.out.print("Digite a idade do doador :");
        idade =sc.nextInt();
        System.out.print("Digite o peso do doador :");
        peso=sc.nextDouble();

        if (idade>18 && idade<65 && peso>50){
            System.out.println("O doador é compativel");
        }
        else{
            System.out.println("O doador não é compativel");
            if (idade<18 || idade>65){
                System.out.println("Motivo: deve ter entre 18 e 65 anos");
            } else if (peso<50) {
                System.out.println("Motivo: deve pesar mais que 50kg");

            }
        }

    }
}
