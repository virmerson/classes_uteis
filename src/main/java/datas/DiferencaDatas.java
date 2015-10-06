package datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Virmerson Bento dos Santos on 05/10/15.
 */
public class DiferencaDatas {

    public static void main(String[] args) {

        //Criando uma data
        Calendar calendar =  Calendar.getInstance();
        calendar.set(1981, 5, 6);

        Date aniversario =  calendar.getTime();

        //Descobrindo a idade
        int idade = calcularIdade(aniversario);


        System.out.println(idade);

    }

    private static int calcularIdade(Date aniversario) {

        //Obtendo um objeto Localdate a partir de uma Date
        LocalDate dataNascimento =  aniversario.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Data atual
        LocalDate hoje = LocalDate.now();

        //Numero de anos
        return Period.between(dataNascimento, hoje).getYears();
    }

}
