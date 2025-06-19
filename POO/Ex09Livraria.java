package POO;

public class Ex09Livraria {
    String titulo;
    int diasAtraso;

    double calcularMulta() {
        return diasAtraso * 2.50;
    }

    void exibirDetalhes() {
        double multa = calcularMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n",
                titulo, diasAtraso, multa);
    }

    public static void main(String[] args) {
        Ex09Livraria pedido = new Ex09Livraria();
        pedido.titulo = "Dom Casmurro";
        pedido.diasAtraso = 3;

        pedido.exibirDetalhes();
    }
}
