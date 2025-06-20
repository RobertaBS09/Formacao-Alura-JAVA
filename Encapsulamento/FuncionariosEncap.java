package Encapsulamento;

public class FuncionariosEncap {

    private String nome;
    private String cargo;
    private double salario;
    private int controleReajuste = 0;

    public FuncionariosEncap(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInformacoes() {
        System.out.printf("Funcionario:  %s - Cargo: %s - Salário: %.2f  \n", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        if (controleReajuste>=1){
            System.out.println("\nnão pode fazer o reajuste");
        }else{
        controleReajuste++;
        salario += salario * (percentual / 100);
        System.out.printf("Novo salário de %s é %.2f  \n", nome, salario);
    }
}}

