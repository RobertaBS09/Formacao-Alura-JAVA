package Encapsulamento;

import java.util.Scanner;

public class Ex08Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex08LoginValidacao aluno = new Ex08LoginValidacao("aluno2025", "escola@123");
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.print("Digite o seu usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Digite a sua senha: ");
            String senha = sc.nextLine();

            if (aluno.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
        sc.close();
    }
    }

