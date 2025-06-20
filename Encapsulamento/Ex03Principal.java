package Encapsulamento;

public class Ex03Principal {
    public static void main(String[] args) {


        Ex03Estoque p1 = new Ex03Estoque();
        p1.setNome("Mouse");
        p1.setPreco(-59.90);

        System.out.printf("Produto: %s\nPreço: %.2f\n", p1.getNome(), p1.getPreco());
    }
}
