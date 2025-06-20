package Encapsulamento;

public class Ex01Principal {
    String modelo;
    int ano;
    String placa;


    public Ex01Principal(String modelo, String placa,int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }


    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
}
