package at.technikum.functions;

import java.util.Scanner;

public class Getrimmtesmittel {

    public static void main(String[] args) {
        double[] contributions = new double[10];
        double min, max;
        try (Scanner inputConsole = new Scanner(System.in)) {
            eingabe(contributions, inputConsole);
            System.out.print("Untergrenze: ");
            min = inputConsole.nextDouble();
            System.out.print("Obergrenze: ");
            max = inputConsole.nextDouble();
            System.out.printf("Mittel ungetrimmt: %.2f\n", sum(contributions) / contributions.length);
            trim(contributions, min, max);
            System.out.printf("Mittel getrimmt: %.2f\n", sum(contributions) / contributions.length);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }

    public static int trim(double[] betraege, double min, double max) {
        int countSetZero = 0;
        for (int i = 0; i < betraege.length; i++)
            if (betraege[i] < min || betraege[i] > max) {
                betraege[i] = 0d;
                countSetZero++;
            }
        return countSetZero;
    }

    public static void eingabe(double[] betraege, Scanner inputConsole) {
        for (int i = 0; i < betraege.length; i++) {
            System.out.printf("Zahl %d: ", i + 1);
            betraege[i] = inputConsole.nextDouble();
        }
    }

    public static double sum(double[] betraege) {
        double sum = 0;
        for (double contribution : betraege)
            sum += contribution;
        return sum;
    }
}
