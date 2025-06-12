package LacoDeRepeticao.src;

import java.util.Scanner;

public class Exercicio09RP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero=sc.nextInt();

       for ( int i=1; i<=numero; i++){
           if (i%10==5){
               continue;
           }
           System.out.print(i+" ");
        }

    }
}
