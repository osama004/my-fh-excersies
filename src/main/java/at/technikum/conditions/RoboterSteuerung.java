package at.technikum.conditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoboterSteuerung {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double value = -2222.;
            while (true) {
                double[] values = new double[3];
                System.out.print("Art: ");
                int art = scanner.nextInt();
                if (art == 0) break;
                if (art < 0 || art > 4) {
                    System.out.println("** Fehler: Art unbekannt");
                    continue;
                }
                while (art == 1 || art == 2) {
                    System.out.print("1: ");
                    value = scanner.nextDouble();
                    if (value < 0 || value > 10) {
                        System.out.println("** Fehler: Wertebereich 0 - 10");
                    } else {
                        if (art == 1)
                            System.out.printf("Abstand vorne: %.2f m\n", value);
                        else
                            System.out.printf("Abstand hinten: %.2f m\n", value);
                        break;
                    }
                }
                for (int cnt = 0; cnt < 3 && (art == 3 || art == 4); cnt++) {
                    System.out.printf("%d: ", cnt + 1);
                    value = scanner.nextDouble();
                    while (art == 3 && (value > 250. || value < -250.) ||
                           art == 4 && (value > 1. || value < 0.)) {
                        System.out.println("** Fehler: Wertebereich");
                        System.out.printf("%d: ", cnt + 1);
                        value = scanner.nextDouble();
                    }
                    values[cnt] = value;
                    if (cnt == 2) {
                        if (art == 3)
                            System.out.print("Gyroskop: (");
                        else
                            System.out.print("Magnetometer: (");
                        for (double val : values)
                            System.out.printf("%.2f, ", val);
                        if (art == 3)
                            System.out.println("\b\b) g");
                        else
                            System.out.println("\b\b) T");
                    }
                }
            }
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
