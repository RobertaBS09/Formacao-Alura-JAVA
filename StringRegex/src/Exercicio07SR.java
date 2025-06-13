package StringRegex.src;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio07SR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String codigo;

        System.out.print("Digite o códico de referência: ");
        codigo= sc.nextLine();

        Pattern pattern=Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher=pattern.matcher(codigo);

        if (matcher.matches()){
            System.out.println("O Codigo de refêrencia está válido!");
        }else{
            System.out.printf("O codigo de refêrencia não está válido!");
        }
    }
}
