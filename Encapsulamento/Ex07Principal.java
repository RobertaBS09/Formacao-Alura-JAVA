package Encapsulamento;

public class Ex07Principal {
    public static void main(String[] args) {
        Ex07AvaliacaoDeFilmes matrix = new Ex07AvaliacaoDeFilmes("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        System.out.printf("Média de avaliações para %s: %.2f\n",
                matrix.getTitulo(), matrix.calcularMedia());
    }


}
