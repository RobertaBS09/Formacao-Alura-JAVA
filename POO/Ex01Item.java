package POO;

public class Ex01Item {

        String nome;
        double preco;
        int quantidade;

        public void exibirInformacoes (){
            System.out.printf("Produto: %s  \nPreço: %.2f  \nQuantidade em estoque: %d", nome,preco,quantidade);
        }

    public static void main(String[] args) {
        Ex01Item item =new Ex01Item();
        item.nome ="Mouse Gamer";
        item.preco = 159.9;
        item.quantidade = 25;

        item.exibirInformacoes();
    }
    }

