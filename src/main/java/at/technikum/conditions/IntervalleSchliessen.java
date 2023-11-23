package at.technikum.conditions;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class IntervalleSchliessen {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            Set<Integer> limits = new TreeSet<>();
            String limit1 = "" , limit2 = "", limit3 = "", limit4 = "";

            System.out.print("Grenze 1: ");
            limit1 = scanner.nextLine();
            if (limit1.matches("^-?\\d+$")) {
                limits.add(Integer.parseInt(limit1));
            }
            System.out.print("Grenze 2: ");
            limit2 = scanner.nextLine();
            if (limit2.matches("^-?\\d+$")) {
                limits.add(Integer.parseInt(limit2));
            }
            System.out.print("Grenze 1: ");
            limit3 = scanner.nextLine();
            if (limit3.matches("^-?\\d+$")) {
                limits.add(Integer.parseInt(limit3));
            }
            System.out.print("Grenze 2: ");
            limit4 = scanner.nextLine();
            if (limit4.matches("^-?\\d+$")) {
                limits.add(Integer.parseInt(limit4));
            }
            System.out.printf("Intervall 1: [%s, %s]\n", limit1, limit2);
            System.out.printf("Intervall 2: [%s, %s]\n", limit3, limit4);
            System.out.printf("geschlossenes Intervall: [%d, %d]\n", limits.stream().toList().get(0),
                                                                     limits.stream().toList().get(limits.size() -1));
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
