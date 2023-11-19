package at.technikum.controlstructures;

import java.util.Scanner;

public class Fensterkreuz {


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int counterPoints = 0, width = 0, height = 0, horizontal = 0, vertical = 0;
            while (width <= 0) {
                System.out.print("Breite: ");
                width = sc.nextInt();
            }
            while (height <= 0) {
                System.out.print("Hoehe: ");
                height = sc.nextInt();
            }
            while (horizontal <= 0) {
                System.out.print("horizontal: ");
                horizontal = sc.nextInt();
            }
            while (vertical <= 0) {
                System.out.print("vertikal: ");
                vertical = sc.nextInt();
            }
            System.out.println();
            for (int row = 1; row <= height; row++) {
                for (int col = 1; col <= width; col++)
                    if (row != vertical && col == horizontal)
                        System.out.print("|");
                     else if (row == vertical && col == horizontal)
                        System.out.print("+");
                     else if (row == vertical)
                        System.out.print("-");
                     else {
                        System.out.print(".");
                        counterPoints++;
                    }
                System.out.println();
            }
            System.out.printf("%d dot(s).\n", counterPoints);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
