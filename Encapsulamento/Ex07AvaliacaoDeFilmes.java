package Encapsulamento;

import java.util.ArrayList;

public class Ex07AvaliacaoDeFilmes {
    private String titulo;
    private ArrayList<Integer> avaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public Ex07AvaliacaoDeFilmes(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
        } else {
            System.out.println("Nota inválida. Por favor, insira um valor entre 1 e 5.");
        }
    }

    public double calcularMedia() {
        int soma = 0;
        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }
}
