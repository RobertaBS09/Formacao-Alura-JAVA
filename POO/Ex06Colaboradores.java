package POO;

public class Ex06Colaboradores {
    String nome;
    String cargo;
    int nivelAcesso;

    void novosDados(String novoCargo, int novoNivel){
        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso + "\n");

        cargo = novoCargo;
        nivelAcesso = novoNivel;

        System.out.println("--- Após atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso);
    }
    public static void main(String[] args) {
        Ex06Colaboradores colaborador = new Ex06Colaboradores();
        colaborador.nome = "Júlia Oliveira";
        colaborador.cargo = "Desenvolvedor Júnior";
        colaborador.nivelAcesso = 1;

        colaborador.novosDados("Desenvolvedor Pleno", 2);
    }
}
