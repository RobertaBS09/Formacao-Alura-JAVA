package LacoDeRepeticao.src;

import java.util.Scanner;

public class Exercicio04RP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int fat=1,num,numImp;

        System.out.println("Digite um número-->");
        num=sc.nextInt();
        numImp=num;
        while (num>1){
            fat=num*fat;
            num--;


        }
        System.out.printf("O fatorial de %d é: %d",numImp,fat);
    }
}
