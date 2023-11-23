package at.technikum.functions;

import java.util.Scanner;

public class GeradeAverage {
    public static void main(String[] args) {
        // 20 Zahlen und die aktuelle Avg rechnen
        try (Scanner inputConsole = new Scanner(System.in)) {
            int[] grades = new int[20];
            for (int i = 0; i < grades.length; i++) {
                System.out.printf("%d. Grade: ", i + 1);
                int actualValue = inputConsole.nextInt();
                if (actualValue >= 0)
                    grades[i] = actualValue;
                 else {
                    System.out.printf("Actual Average: %.2f\n", average(grades, i));
                    i--;
                }
            }
            System.out.printf("Average: %.2f", average(grades, grades.length));
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }

    private static double average(int[] grades, int size) {
        double sumGrades = 0.;
        for (int grade: grades)
            sumGrades += grade;
        return sumGrades / size;
    }
}
