package Encapsulamento;

public class Ex01Veiculo {
    public static void main(String[] args) {
        Ex01Principal gol =new Ex01Principal("Gol","ABC-1234",2020);

        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: "+gol.getModelo());
        System.out.println("Placa: "+gol.getPlaca());
        System.out.println("Ano: "+gol.getAno());

    }
}
