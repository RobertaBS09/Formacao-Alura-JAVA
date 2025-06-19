package POO;

public class Ex02Obras {
    String titulo;
    String autor;
    int paginas;

   void mostrarInformacoes(){
        System.out.printf("'%s' de %s com %d paginas.",titulo,autor,paginas);
    }

    public static void main(String[] args) {
        Ex02Obras obra =new Ex02Obras();

        obra.titulo="O Guia do Mochileiro das Galáxias";
        obra.autor="Douglas Adams";
        obra.paginas=208;

        obra.mostrarInformacoes();
    }
}
