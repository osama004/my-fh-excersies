package at.technikum.conditions;
import java.util.Scanner;

public class Walker {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int input = 0;
            int countValidMoves = 0;
            int xRow = 10, xCol = 1;
            printMap(xRow, xCol);
            while (true) {
                System.out.print("\nEingabe: ");
                input = sc.nextInt();
                if (input != 2 && input != 4 && input != 5
                   && input != 6 && input != 8) {
                    System.out.println("Unbekannte Aktion!");
                    printMap(xRow, xCol);
                    continue;
                }
                if (input == 5)
                    break;
                if (input == 2)
                    if (xRow == 10) {
                        System.out.println("Aktion unmoeglich!");
                    } else {
                        xRow++;
                        countValidMoves++;
                    }
                else if (input == 8)
                    if (xRow == 1) {
                        System.out.println("Aktion unmoeglich!");
                    } else {
                        xRow--;
                        countValidMoves++;
                    }
                else if (input == 4)
                    if (xCol == 1) {
                        System.out.println("Aktion unmoeglich!");
                    } else {
                        xCol--;
                        countValidMoves++;
                    }
                else
                    if (xCol == 10) {
                        System.out.println("Aktion unmoeglich!");
                    } else {
                        xCol++;
                        countValidMoves++;
                    }
                printMap(xRow,xCol);
            }
            System.out.printf("Schritte insgesamt: %d\n", countValidMoves);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
    private static void printMap(int xRow, int xCol) {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10 ;col++) {
                if (row == xRow & col == xCol)
                    System.out.print("X");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}
