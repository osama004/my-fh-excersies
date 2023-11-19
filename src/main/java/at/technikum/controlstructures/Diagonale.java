package at.technikum.controlstructures;

import java.util.Scanner;

public class Diagonale {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int sideLen = 0;
            do {
                System.out.print(": ");
                sideLen = scanner.nextInt();
                if (sideLen % 2 != 0)
                    for (int row = 0; row < sideLen; row++) {
                        for (int col = 0; col < sideLen; col++)
                            if (row == col)
                                System.out.print("*");
                             else if (row + col + 1 == sideLen)
                                System.out.print("*");
                             else
                                System.out.print("-");
                        System.out.println();
                    }
            } while (sideLen % 2 == 0);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
