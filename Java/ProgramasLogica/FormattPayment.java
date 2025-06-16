//Cambia a formatos de moneda de otros países

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class FormattPayment {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);
        System.out.println("US: " + us);    //US: $12,324.13

        NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nf4.format(payment);
        System.out.println("India: " + india);  //India: Rs.12,324.13

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf2.format(payment);
        System.out.println("China: " + china);  //China: ￥12,324.13


        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf3.format(payment);
        System.out.println("France: " + france);    //France: 12 324,13 €
    }
}
