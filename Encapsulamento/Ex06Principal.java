package Encapsulamento;

public class Ex06Principal {
    public static void main(String[] args) {
        Ex06ControledeSaldoBancario conta =new Ex06ControledeSaldoBancario("Ana");
        conta.depositar(1000.00);
        conta.sacar(1200.00);
        conta.exibirSaldo();
    }
}
