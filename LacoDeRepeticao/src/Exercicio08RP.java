package LacoDeRepeticao.src;

import java.util.Scanner;

public class Exercicio08RP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada;
        int positivos = 0, negativos = 0;

        while (true) {
            System.out.println("Digite um número (ou 'fim' para encerrar):");
            entrada = sc.next();

            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        System.out.printf("Números positivos: %d\n",positivos);
        System.out.printf("Números negativos: %d\n",negativos);
    }
}
