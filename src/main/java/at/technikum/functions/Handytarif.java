package at.technikum.functions;

import java.util.Scanner;

public class Handytarif {
    public static void main(String[] args) {
        try(Scanner inputConsole = new Scanner(System.in)) {
            double basisTarif = 5.99, total = 0., telephony = 0., smsTariff = 0.;
            System.out.print("min: ");
            int minutes = inputConsole.nextInt();
            System.out.print("SMS: ");
            int smses = inputConsole.nextInt();
            while (minutes < 0 || smses < 0) {
                System.out.println("ungueltig.");
                System.out.print("min: ");
                minutes = inputConsole.nextInt();
                System.out.print("SMS: ");
                smses = inputConsole.nextInt();
            }
            if (minutes > 100) telephony += (minutes - 100) * 0.99;
            if (smses >= 1 && smses <= 10)
                smsTariff += smses * 0.05;
            else if (smses >= 11 && smses <= 20)
                smsTariff += 0.5 + 0.04 * (smses - 10);
            else if (smses >= 21 && smses <= 50)
                smsTariff += 0.9 + 0.03 * (smses - 20);
            else if (smses >= 51 && smses <= 100)
                smsTariff += 1.8 + 0.02 * (smses - 50);
            else if (smses >= 101 && smses <= 1000)
                smsTariff += 2.8 + 0.01 * (smses - 100);
            else if (smses > 1000)
                smsTariff += 11.8 + 0.005 * (smses - 1000);
            total += basisTarif + telephony + smsTariff;
            System.out.printf("zu bezahlen: %.2f + %.2f + %.2f = %.2f\n", basisTarif, telephony, smsTariff, total);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
