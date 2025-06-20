package Encapsulamento;



public class PrincipalEncap {
    public static void main(String[] args) {
        FuncionariosEncap funcionario1 =new FuncionariosEncap("João",8500);

        funcionario1.setCargo("Desenvolvedor");

        System.out.println("Funcionario tem o cargo:"+funcionario1.getCargo());
        System.out.println("Funcionario tem o nome:"+funcionario1.getNome());
        System.out.println("Funcionario tem o salário:"+funcionario1.getSalario());



        funcionario1.reajustarSalario(5);
        funcionario1.reajustarSalario(10);
        funcionario1.exibirInformacoes();

    }
}
