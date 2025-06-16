package DataEHora;

import java.time.LocalDate;
import java.time.LocalTime;


public class Exercicio01DH {
    public static void main(String[] args) {

        String tarefa = "Enviar relatorio semanal";



        LocalDate tarefaCriada =  LocalDate.now();
        LocalTime tarefaHora =LocalTime.now();

        System.out.println("Tarefa: " + tarefa );
        System.out.println("Data atual: "+tarefaCriada);
        System.out.println("Hora atual: "+tarefaHora);
    }
}
