package Encapsulamento;

import java.util.ArrayList;

public class Ex02Principal {
    public static void main(String[] args) {

        ArrayList<Ex02Agenda> contatos = new ArrayList<>();

        contatos.add(new Ex02Agenda("João Silva", "(11) 99999-0000"));
        contatos.add(new Ex02Agenda("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Ex02Agenda("Pedro Oliveira", "(31) 97777-0000"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Ex02Agenda contato : contatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    contato.getNome(),
                    contato.getTelefone());
        }
} }
