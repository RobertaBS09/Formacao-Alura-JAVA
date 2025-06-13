package StringRegex.src;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercicio10SR {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String senha;

        System.out.print("Digite a senha: ");
        senha=sc.nextLine();


        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&!])[A-Za-z\\d@$!%*?&!]{8,}$";

        if (senha.matches(regex)) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha não é válida.");
        }
    }
}
