package at.technikum.variables;

import java.util.Scanner;

public class TowerOfPower {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter base:");
            int base = sc.nextInt();
            System.out.println();
            for (int exp = 1; exp <= 7; exp = exp + 1) {
                System.out.printf("%8d\n", (int) Math.pow(base, exp));
            }
        } catch (Throwable e) {
            System.out.println("Invalid Input");
        }
    }
}
