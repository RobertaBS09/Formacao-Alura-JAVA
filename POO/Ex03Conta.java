package POO;

public class Ex03Conta {
    double saldo;

    void ZerarSaldo(){
        saldo= 0.0;
    }

    void exibirSaldo(){
        System.out.printf("Saldo atual: R$ %.2f \n",saldo);
    }
    public static void main(String[] args) {
        Ex03Conta conta =new Ex03Conta();

        conta.saldo = 1579.42;

        conta.exibirSaldo();
        conta.ZerarSaldo();
        conta.exibirSaldo();
    }
}
