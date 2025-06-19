package POO;

public class Exemplo {
    public static void main(String[] args) {
        Funcionarios funcionario1 =new Funcionarios();
        funcionario1.nome="Ana";
        funcionario1.cargo ="Gerente de projetos";
        funcionario1.salario=9000.0;

        Funcionarios funcionario2 =new Funcionarios();
        funcionario2.nome ="João";
        funcionario2.cargo="Desenvolvedor";
        funcionario2.salario=8500.0;

        funcionario1.exibirInformacoes();
        funcionario2.reajustarSalario(5);
        funcionario2.exibirInformacoes();

    }
}
