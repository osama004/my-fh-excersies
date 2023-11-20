package at.technikum.controlstructures;

import java.util.Scanner;

public class Diagonale {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int sideLen = 0;
            do {
                System.out.print(": ");
                sideLen = scanner.nextInt();
                // if (sideLen < 0) sideLen *= -1;
                if (sideLen % 2 != 0 && sideLen >= 1)
                    for (int row = 0; row < sideLen; row++) {
                        for (int col = 0; col < sideLen; col++)
                            if (row == col || row + col + 1 == sideLen)
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
