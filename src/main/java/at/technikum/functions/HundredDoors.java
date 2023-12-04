package at.technikum.functions;

import java.util.Arrays;
import java.util.Scanner;

public class HundredDoors {
    public static void main(String[] args) {

        try(Scanner inputConsole = new Scanner(System.in)) {
            int n = -1;
            boolean[] doorsOpen = new boolean[1];
            while (n < 1) {
                System.out.print(": ");
                n = inputConsole.nextInt();
                doorsOpen = new boolean[n];
            }
            // if (doorsOpen[i]) doorsOpen[i] = false;
            // else doorsOpen[i] = true;
            Arrays.fill(doorsOpen, true); // for (int i = 0; i < n ; i++) doorsOpen[i] = true;
            for (int person = 2; person <= n; person++)
                for (int i = person - 1; i < n ; i++)
                    if ((i + 1) % person == 0)
                        doorsOpen[i] = !doorsOpen[i]; // toggle the value
            for (int i = 0; i < n ; i++)
                System.out.printf(doorsOpen[i] ? "%d ": "", i + 1);
            System.out.println();
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
