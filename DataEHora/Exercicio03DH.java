package DataEHora;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio03DH {
    public static void main(String[] args) {
        LocalTime horarioInicio =LocalTime.of(14,20,0);
        LocalTime horarioTermino =LocalTime.of(16,45,0);

        Duration duracao =Duration.between(horarioInicio,horarioTermino);

        System.out.println("Diferença de  " +duracao.toHours() + " horas e " +duracao.toMinutesPart()+" minutos");


    }
}
