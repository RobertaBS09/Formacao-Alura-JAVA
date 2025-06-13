package StringRegex.src;

import java.util.Scanner;

public class Exercicio04SR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String nomeCompleto, nomeSemPonto;
        int posicaoPonto;

        System.out.print("Digite o nome do arquivo: ");
        nomeCompleto= sc.nextLine();

        posicaoPonto=nomeCompleto.lastIndexOf(".");
        if (posicaoPonto!=-1){
            nomeSemPonto=nomeCompleto.substring(0,posicaoPonto);
            System.out.printf("Nome do arquivo sem extensão: %s",nomeSemPonto);
        }else{
            System.out.println("O arquivo não possui extensão.");
        }

    }
}
