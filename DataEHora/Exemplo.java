package DataEHora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exemplo {
    public static void main(String[] args) {
        LocalDate dataCompra= LocalDate.now();
        LocalDate dataPimeiraParcela = LocalDate.of(2025, 5,15);
        LocalDate dataSegundaParcela = dataPimeiraParcela.plusDays(30);

         if (dataPimeiraParcela.isBefore(LocalDate.now())){
             System.out.println("Anterior ao dia do vencimento");
         }else{
             System.out.println("Superior ao dia do vencimento.");
         }


        System.out.println("Data compra: "+dataCompra);
        System.out.println("Data primeira parcela: "+dataPimeiraParcela);
        System.out.println("Data segunda parcela: "+dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: "+dataCompra.format(formato));


        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data de conclusão formatada formatada: "+dataConclusaoCompra);
        ZonedDateTime dataCompraNy =dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data de conclusão de compra NY: "+dataCompraNy);

        LocalTime inicio = LocalTime.of(9,0);
        LocalTime fim =LocalTime.of(17,30);

        Duration duracao=Duration.between(inicio,fim);
        System.out.println("A duração do expediente : "+ duracao.toHours()+ "horas e "+duracao.toMinutesPart()+" minutos.");

        LocalDate dataPgamento =LocalDate.parse("20205-10-30");
        Period periodo = Period.between(dataCompra,dataPgamento);
        System.out.println("Diferença em dias: " + periodo.getDays());


    }

}
