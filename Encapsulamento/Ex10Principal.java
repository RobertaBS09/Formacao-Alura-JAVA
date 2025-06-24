package Encapsulamento;

public class Ex10Principal {
    public static void main(String[] args) {
        Ex10Notas matematica = new Ex10Notas("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);

        System.out.println("Total de notas válidas: " + matematica.contarNotasValidas());
        System.out.printf("Média em %s: %.2f\n", matematica.getNome(), matematica.calcularMedia());

    }
}
