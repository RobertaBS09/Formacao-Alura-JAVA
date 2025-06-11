package CondicionaisIfElse;

import java.util.Scanner;

public class Exercico02IF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double media;
        String situacao;

        System.out.print("Digite o valor da média do aluno -->");
        media =sc.nextDouble();

        if (media>=7.0){
            situacao="APROVADO";
        } else if (media>=5.0 && media<6.9) {
            situacao ="RECUPERAÇÃO";

        }
        else{
            situacao="REPROVADO";
        }

        System.out.println("O estudante teve média "+ media+" e esta sua situação é "+ situacao);
    }

    public static class Exercicio06IF {
    }
}
