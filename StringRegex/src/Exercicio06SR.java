package StringRegex.src;

import java.util.Scanner;

public class Exercicio06SR {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double valor;
        String  valorFormatado;

        System.out.print("Digite o valor: " );
        valor=sc.nextDouble();

        valorFormatado=String.format("R$ %.2f",valor);

        System.out.println("Valor formatado: "+valorFormatado);


    }
}
