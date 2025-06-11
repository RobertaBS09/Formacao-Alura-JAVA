import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double valorDouble;

        System.out.print("Digite um valor quebrado (double)--->");
        valorDouble=sc.nextDouble();

        System.out.println("O valor inteiro do protudo é:"+ (int)valorDouble);
    }
}
