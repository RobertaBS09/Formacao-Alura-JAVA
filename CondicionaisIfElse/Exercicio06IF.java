package CondicionaisIfElse;

import java.util.Scanner;

public class Exercicio06IF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String diaSemana;
        String mensagem;

        System.out.print("Digite o dia da semana: ");
        diaSemana = sc.next();

        diaSemana.toLowerCase();

        if (diaSemana.equals("segunda")|| diaSemana.equals("terca")|| diaSemana.equals("quarta")||diaSemana.equals("quinta")||diaSemana.equals("sexta")){
            mensagem="é um dia útil.";
        }
        else {
            mensagem ="não é um dia útil.";
        }
        System.out.println(diaSemana+" "+ mensagem);
    }
}
