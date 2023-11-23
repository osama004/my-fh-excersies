package at.technikum.conditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoboterSteuerung {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int art = 0;
            double value = 0;
            List<Double> values = new ArrayList<Double>(3);
            do {
                System.out.print("Art: ");
                art = scanner.nextInt();
                if (art < 0 || art > 4) {
                    System.out.println("** Fehler: Art unbekannt");
                    continue;
                }
                while (art == 1) {
                    System.out.print("1: ");
                    value = scanner.nextDouble();
                    if (value < 0 || value > 10) {
                        System.out.println("** Fehler: Wertebereich");
                    }
                    else {
                        System.out.printf("Abstand vorne: %.2f m\n", value);
                        break;
                    }
                }
                while (art == 2) {
                    System.out.print("1: ");
                    value = scanner.nextDouble();
                    if (value < 0 || value > 10) {
                        System.out.println("** Fehler: Wertebereich 0 - 10");
                    }
                    else {
                        System.out.printf("Abstand hinten: %.2f m\n", value);
                        break;
                    }
                }
                while (art == 3) {
                    for (int cnt = 0; cnt < 3;) {
                        value = -2222.;
                        while (value > 250. || value < -250.) {
                            System.out.printf("%d: ", cnt + 1);
                            value = scanner.nextDouble();
                            if (value > 250. || value < -250.)
                                System.out.println("** Fehler: Wertebereich zwischen -250 - +250");
                            else {
                                values.add(value);
                                cnt++;
                            }
                        }
                        if (cnt == 3)  {
                            System.out.print("Gyroskop: (");
                            for (double val : values)
                                System.out.printf("%.2f, ", val);
                            System.out.println("\b\b) g");
                            art = -1;
                            break ;
                        }
                    }
                }
                while (art == 4) {
                    for (int cnt = 0; cnt < 3;) {
                        value = -22.;
                        while (value > 1. || value < 0.) {
                            System.out.printf("%d: ", cnt + 1);
                            value = scanner.nextDouble();
                            if (value > 1. || value < 0.)
                                System.out.println("** Fehler: Wertebereich zwischen 0 - 1");
                            else {
                                values.add(value);
                                cnt++;
                            }
                        }
                        if (cnt == 3)  {
                            System.out.print("Magnetometer: (");
                            for (double val : values)
                                System.out.printf("%.2f, ", val);
                            System.out.println("\b\b) T");
                            art = -1;
                            break;
                        }
                    }
                }
            } while (art != 0);

        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
