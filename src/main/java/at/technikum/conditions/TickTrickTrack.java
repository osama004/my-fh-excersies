package at.technikum.conditions;

import java.util.Scanner;

public class TickTrickTrack {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int countEquals = 1, countInput = 1, numBefore = 0, numAfter = 0;
            System.out.print("Eingabe: ");
            numBefore = sc.nextInt();
            while (countEquals < 3) {
                System.out.print("Eingabe: ");
                numAfter = sc.nextInt();
                if (numBefore > numAfter) {
                    System.out.println("Tick");
                    countEquals = 1;
                } else if (numBefore == numAfter) {
                    if (countEquals < 2)
                        System.out.println("Track");
                    countEquals++;
                } else {
                    System.out.println("Trick");
                    countEquals = 1;
                }
                numBefore = numBefore + numAfter;
                numAfter = numBefore - numAfter;
                numBefore = numBefore - numAfter;
                countInput++;
            }
            System.out.printf("Ende (%d Eingaben)\n", countInput);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
