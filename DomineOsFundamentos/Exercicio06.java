package DomineOsFundamentos;
public class Exercicio06 {
    public static void main(String[] args) {
        String categoria;
        double preco=150.0;

        if ( preco<50){
            categoria="Econômico";
        } else if (preco>50.1 && preco<200) {
            categoria="Intermediário";

        }else{
            categoria="Premium";
        }

        System.out.println("Categoria do produto: "+categoria);
    }
}
