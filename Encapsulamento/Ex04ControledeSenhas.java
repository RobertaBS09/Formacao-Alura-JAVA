package Encapsulamento;

public class Ex04ControledeSenhas {

    private String senha;

    public Ex04ControledeSenhas(String senhaInicial) {
        this.senha = senhaInicial;
    }

    public void setSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = senha;
            System.out.println("Senha alterada com sucesso.");
        } else {
            System.out.println("Senha atual incorreta.Não foi possivel alterar a senha.");

        }
    }
}
