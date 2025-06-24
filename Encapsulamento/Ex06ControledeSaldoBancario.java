package Encapsulamento;

public class Ex06ControledeSaldoBancario {
    String titular;

    private double saldo;

    public Ex06ControledeSaldoBancario(String titular){
        this.titular=titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }  else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: %.2f\n", titular, saldo);
    }
}