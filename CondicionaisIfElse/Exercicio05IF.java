package CondicionaisIfElse;

import java.util.Scanner;

public class Exercicio05IF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double valorCompra,valorFinal;


        System.out.print("Digite o valor da compra-->");
        valorCompra =sc.nextDouble();
        double  desconto= valorCompra *0.1;;

        if (valorCompra>=100){
            valorFinal= valorCompra-desconto;
            System.out.println("Desconto de 10% aplicado");
            System.out.println("Novo valor: R$"+valorFinal);
        }else{
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor Total: R$"+valorCompra);
        }
    }
}
