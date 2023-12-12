package at.technikum.functions;

import java.util.Scanner;

public class ArrayEvenStatistics {
    public static void main(String[] args) {
        int[] numbs = new int[1024];

        try(Scanner inputConsole = new Scanner(System.in)) {
            int num = 0, index = -1;
            System.out.println("Input");
            while (index < 1024) {
                System.out.print(": ");
                num = inputConsole.nextInt();
                if (num == 0) {
                    System.out.print("re-enter 0 to store as value.\nany other value ends input: ");
                    num = inputConsole.nextInt();
                    if (num != 0) {
                        System.out.println("Input finished.");
                        break;
                    }
                }
                index++;
                numbs[index] = num;
            }
            if (index == -1) {
                System.out.println("no values entered.");
                return;
            }
            printEvenNumbsInfos(numbs, index + 1);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }

    private static int countEventNumbs(int[] numbs, int size) {
        int count = 0;
        for (int i = 0; i < size; i++)
            if (numbs[i] % 2 == 0)
                count++;
        return count;
    }
    private static void printEvenNumbsInfos(int [] numbs, int size) {
        double sumEvenNumbs = 0.;
        int countEventNumbs = countEventNumbs(numbs, size);
        int max = Integer.MIN_VALUE;
        int[] indexMaxValuePostions = new int[size];
        int maxValueIndex = -1;
        System.out.printf("%9s count: %d\n"," ",countEventNumbs);
        if (countEventNumbs == 0) return;
        System.out.print("index positions: [");
        for (int i = 0; i < size; i++) {
            int num = numbs[i];
            if (num % 2 == 0) {
                sumEvenNumbs += num;
                if (num > max) max = num;
                System.out.printf(" %d", i);
            }
        }
        for (int i = 0; i < size; i++) {
            int num = numbs[i];
            if (num == max) {
                maxValueIndex++;
                indexMaxValuePostions[maxValueIndex] = i;
            }
        }
        System.out.printf("""
                ]
                %11s sum: %.0f
                %10s mean: %.2f
                %11s max: %d [""", " ", sumEvenNumbs," " ,sumEvenNumbs / countEventNumbs," " ,max);
        //System.out.printf(" %d", indexMaxValuePostions[0]);
        for (int i = 0; i < maxValueIndex + 1; i++)
            System.out.printf(" %d", indexMaxValuePostions[i]);
        System.out.println("]");

    }

}
