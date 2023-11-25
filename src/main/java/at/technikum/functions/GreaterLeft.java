package at.technikum.functions;

import java.util.Scanner;

public class GreaterLeft {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print(": ");
            int size = scanner.nextInt();
            while (size < 1) {
                System.out.printf("Invalid Size of an array: %d\n", size);
                System.out.print(": ");
                size = scanner.nextInt();
            }
            int[] arrayInput = new int[size];
            int[] arrayOutput = new int[size];
            for (int i = 0; i < size; i++)
                arrayInput[i] = scanner.nextInt();
            for (int i = 1; i < size; i++) {
                int countBigger = 0;
                for (int leftIndex = 0; leftIndex < i; leftIndex++)
                    if (arrayInput[leftIndex] > arrayInput[i])
                        countBigger++;
                arrayOutput[i] = countBigger;
            }
            for (int num : arrayOutput) System.out.print(num + " ");
            System.out.println("\b");
            for (int num : arrayInput) System.out.print(num + " ");
            System.out.println("\b");
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
