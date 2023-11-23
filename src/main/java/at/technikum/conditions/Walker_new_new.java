package at.technikum.conditions;
import java.util.Scanner;

public class Walker_new_new {
    int countValidMoves = 0;
    int xRow;
    int xCol;

    private Walker_new_new(int xRow, int xCol) {
        this.xRow = xRow;
        this.xCol = xCol;
    }

    private void moveRight() {
        if (xCol == 10) {
            System.out.println("Aktion unmoeglich!");
            return;
        }
        xCol++;
        countValidMoves++;
    }

    private void moveLeft() {
        if (xCol == 1) {
            System.out.println("Aktion unmoeglich!");
            return;
        }
        xCol--;
        countValidMoves++;
    }

    private void moveUp() {
        if (xRow == 1) {
            System.out.println("Aktion unmoeglich!");
            return;
        }
        xRow--;
        countValidMoves++;
    }

    private void moveDown() {
        if (xRow == 10) {
            System.out.println("Aktion unmoeglich!");
            return;
        }
        xRow++;
        countValidMoves++;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int input = 0;
            int xRow = 10, xCol = 1;
            printMap(xRow, xCol);
            Walker_new_new walker = new Walker_new_new(xRow, xCol);

            while (true) {
                System.out.print("\nEingabe: ");
                input = sc.nextInt();
                if (input != 2 && input != 4 && input != 5
                   && input != 6 && input != 8) {
                    System.out.println("Unbekannte Aktion!");
                    printMap(walker.xRow, walker.xCol);
                    continue;
                }
                if (input == 5)
                    break;
                if (input == 2) walker.moveDown();
                else if (input == 8) walker.moveUp();
                else if (input == 4) walker.moveLeft();
                else walker.moveRight();
                printMap(walker.xRow, walker.xCol);
            }
            System.out.printf("Schritte insgesamt: %d\n", walker.countValidMoves);
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
