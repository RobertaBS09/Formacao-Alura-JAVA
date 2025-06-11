public class Exercicio05 {

    public static void main(String[] args) {
        String titulo = "O Pequeno principe";
        String autor = "Antoine de Saint-Exupéry";
        int numeroPaginas = 96;
        double precoLivro = 39.9;
        char categoria = 'F';
        String categoriaDescricao;

        if (categoria == 'F') {
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-Ficção";

        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "Historia";

        }
        else {
            categoriaDescricao= " categoria invalida";
        }

        System.out.println("Livro cadastrado: "+titulo+" , de "+autor+" .Ele possui "+numeroPaginas+" páginas, custa R$"+precoLivro+ " e pretence à categoria "+ categoriaDescricao+".");
    }
}
