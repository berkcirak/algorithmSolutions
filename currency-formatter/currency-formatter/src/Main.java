import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale us = Locale.US;
        Locale india = new Locale("en", "IN");
        Locale china = Locale.CHINA;
        Locale france = Locale.FRANCE;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(us);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(china);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);

        String usPayment = usFormat.format(payment);
        String indiaPayment = indiaFormat.format(payment);
        String chinaPayment = chinaFormat.format(payment);
        String francePayment = franceFormat.format(payment);


        System.out.println("US: " + usPayment);
        System.out.println("India: " + indiaPayment);
        System.out.println("China: " + chinaPayment);
        System.out.println("France: " + francePayment);
    }
}