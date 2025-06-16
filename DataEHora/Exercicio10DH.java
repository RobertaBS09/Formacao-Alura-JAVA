package DataEHora;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio10DH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("HH:mm");
        int cargaHoraria;

        System.out.println("Digite o horário de entrada (HH:mm) --> ");
        LocalTime HorarioEntrada =LocalTime.parse(sc.next(),formato);

        System.out.println("Digite a carga horária (em HORAS) --> ");
        cargaHoraria=sc.nextInt();

        System.out.println("Digite o horário real de saida (HH:mm) --> ");
        LocalTime horarioSaida =LocalTime.parse(sc.next(),formato);


        LocalTime saidaPrevista = HorarioEntrada.plusHours(cargaHoraria);

        Duration diferenca= Duration.between(saidaPrevista,horarioSaida);

        long horasExtras= diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();


        System.out.println("Horário de entrada: "+HorarioEntrada.format(formato));
        System.out.println("Horário de saída prevista: "+saidaPrevista.format(formato));
        System.out.println("Horário real de saída: "+horarioSaida.format(formato));


        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }




    }
}
