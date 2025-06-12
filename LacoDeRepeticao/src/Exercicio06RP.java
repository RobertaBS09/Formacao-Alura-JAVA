package LacoDeRepeticao.src;

import java.util.Scanner;

public class Exercicio06RP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String senha="1234";
        String senhaDigitada;
        int tentativas=3;



        while (tentativas > 0) {
            System.out.println("Digite a senha:");
            senhaDigitada = sc.next();

            if (senhaDigitada.equals(senha)) {
                System.out.println("Senha correta! Acesso concedido!");
                return;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.printf("Senha incorreta. Você tem %d tentativa(s) restante(s).\n", tentativas);
                } else {
                    System.out.println("Conta bloqueada temporariamente.");
                }
            }
        }
    }
}
