package POO;

public class Funcionarios {
    String nome;
    String cargo;
    Double salario;

    public void exibirInformacoes(){
        System.out.printf("Funcionario:  %s - Cargo: %s - Salário: %.2f  \n",nome,cargo,salario    );
    }

    public void reajustarSalario (double percentual){
        salario +=  salario *(percentual/100);
        System.out.printf("Novo salário de %s é %.2f  \n",nome,salario);
    }
}
