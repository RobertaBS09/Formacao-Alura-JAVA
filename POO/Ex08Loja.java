package POO;

public class Ex08Loja {
    String nome;
    int quantidade;



    void vender(int qtdVendida) {
        if (qtdVendida <= quantidade) {
            quantidade -= qtdVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public static void main(String[] args) {
        Ex08Loja item = new Ex08Loja();
        item.nome = "Camiseta";
        item.quantidade = 10;

        item.vender(3);
        item.vender(8);
    }


}
