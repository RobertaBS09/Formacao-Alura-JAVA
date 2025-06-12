package LacoDeRepeticao.src;

public class Exercicio03RP {
    public static void main(String[] args) {

        int soma = 0;

        for (int numeros = 1; numeros <= 100; numeros++) {
            if (numeros % 2 == 0) {
                soma += numeros;
            }
        }
        System.out.println(" A soma dos números pares de 1 a 100 é: " + soma);
    }
}
