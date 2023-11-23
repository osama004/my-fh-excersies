package at.technikum.conditions;

import java.util.Scanner;

public class MalReihe {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int fixFactor = -11;
            int limitFactor = -11;

            while (!(fixFactor >= -10 && fixFactor <= 10 && fixFactor != 0)) {
                System.out.print("Fixfaktor: ");
                fixFactor = scanner.nextInt();
            }
            while (!(limitFactor >= 1 && limitFactor <= 10)) {
                System.out.print("Grenzfaktor: ");
                limitFactor = scanner.nextInt();
            }
            for (int i = 1; i <= limitFactor; i++)
                System.out.printf("%2d x %d =    %d\n", i, fixFactor, i * fixFactor);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
