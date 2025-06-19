package POO;

public class Ex04Setor {
    String local;
    double temperatura;

    void mensagem(){
        System.out.printf("Sensor no local: %s \nTemperatura: %f \n",local,temperatura);

        if (temperatura>35.5){
            System.out.println("Temperatura acima do limite!");
        }
    }


    public static void main(String[] args) {
        Ex04Setor setor=new Ex04Setor();
        setor.local= "Setor A";
        setor.temperatura=39.2;

        setor.mensagem();
    }
}
