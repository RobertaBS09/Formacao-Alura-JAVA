package Encapsulamento;

public class Ex05Principal {
    public static void main(String[] args) {
        Ex05ControleNivelDeBateria b =new Ex05ControleNivelDeBateria();
        b.setNivel(85);
        System.out.println("Status: "+b.exibirStatus());
    }
}
