package Encapsulamento;

public class Ex09Principal {
    public static void main(String[] args) {
        Ex09PontosParaAlunos aluno = new Ex09PontosParaAlunos("Fernanda");

        aluno.ganharPontos(120);
        aluno.exibirStatus();
    }
}
