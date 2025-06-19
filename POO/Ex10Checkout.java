
package POO;
import java.util.ArrayList;
import java.util.List;
public class Ex10Checkout {
    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        Ex10Checkout i1 = new Ex10Checkout();
        i1.nome = "Teclado";
        i1.preco = 120.0;
        i1.quantidade = 1;

        Ex10Checkout i2 = new Ex10Checkout();
        i2.nome = "Mouse";
        i2.preco = 60.0;
        i2.quantidade = 2;

        List<Ex10Checkout> carrinho = new ArrayList<>();
        carrinho.add(i1);
        carrinho.add(i2);

        double totalCompra = 0;
        for (Ex10Checkout item : carrinho) {
            totalCompra += item.calcularTotal();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
    }
}
