package POO;

public class Ex05Medias {
    String nome;
    double nota1;
    double nota2;
    double media;
    String situacao;

    void  calculomedia(){
        media= (nota1+nota2)/2;

        if (media>=7){
            situacao ="Aprovado";
        }else{
            situacao="Reprovado";
        }
    }


    void mensagem(){
        System.out.printf("Aluno: %s \nNota 1: %.2f \nNota 2: %.2f\nMédia: %.2f\nSituação: %s",nome,nota1,nota2,media,situacao);
    }


    public static void main(String[] args) {
        Ex05Medias mediaJ =new Ex05Medias();

        mediaJ.nome="João Silva";
        mediaJ.nota1=6.5;
        mediaJ.nota2 = 7.5;

        mediaJ.calculomedia();
        mediaJ.mensagem();

    }
}


