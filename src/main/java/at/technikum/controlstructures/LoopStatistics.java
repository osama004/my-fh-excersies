package at.technikum.controlstructures;

import java.util.Scanner;

public class LoopStatistics {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double number = 0., max = Double.MIN_VALUE, min = Double.MAX_VALUE, sum = 0.;
            double mean = -1;
            int countNums = 0;
            System.out.println("enter numbers:");
            do  {
                number = sc.nextDouble();

                if (number > 0.) {
                    countNums++;
                    max = Double.max(max, number);
                    min = Double.min(min, number);
                    sum += number;
                }
            } while (number > 0.);
            if (countNums == 0)
                System.out.println("no number entered.");
             else
                System.out.printf("""
                        numbers entered: %d
                        minimum: %.2f
                        maximum: %.2f
                        mean:\t %.2f
                        """, countNums, min, max, sum / countNums);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
