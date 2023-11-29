package at.technikum.functions;

import java.util.Scanner;

public class ReadArray {
    public static void main(String[] args) {
        try (Scanner inputConsole = new Scanner(System.in)) {
            int size = 10;
            int num = 0;
            int[] numbs = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.printf("%d. number: ", i + 1);
                num = inputConsole.nextInt();
                numbs[i] = num;
            }
            System.out.println("Input finished.");
            for (int i = size - 1; i >= 0; i--)
                System.out.printf("[%d]: %d\n", i, numbs[i]);
            System.out.println("Output finished.");
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
