package at.technikum.conditions;

import java.util.Scanner;

public class Jahressaldo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;
            double sum = 0.;
            double monthBalance = 0.;

            for (int monthNr = 1; monthNr <= 12; monthNr++) {
                System.out.printf("Monat %d: ", monthNr);
                monthBalance = sc.nextDouble();
                if (monthBalance == 0) System.out.println("Nullsummenspiel.");
                max = Double.max(max, monthBalance);
                min = Double.min(min, monthBalance);
                sum += monthBalance;
            }
            System.out.printf("""
                    Jahressaldo: %.2f
                    Groesster Saldo: %.2f
                    Niedrigster Saldo: %.2f
                    """, sum, max, min);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
