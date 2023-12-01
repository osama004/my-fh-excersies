package at.technikum.functions;

import java.util.Scanner;

public class Strom {
    public static void main(String[] args) {
        try(Scanner consoleInput = new Scanner(System.in))  {
            int countValues = 0;
            float value = -100;
            float[] values = new float[16];
            System.out.println("Max. 16 Wert eingeben, 0 beendet:");
            while (countValues < 16) { // start from 0 to 15
                value = consoleInput.nextFloat();
                if (value == 999) break;
                else if (value < -100f  || value > 100f) continue;
                else values[countValues] = Math.abs(value);
                countValues++;
            }
            System.out.printf("Eingelsen: %d\nN: ", countValues);
            int countValuesForAvg = consoleInput.nextInt();
            if (countValues < countValuesForAvg) {
                System.out.println("Zu wenige Werte");
                return;
            }
            int countCpy = countValuesForAvg * 1;
            double sum = 0.;
            for (int i = countValues - 1; countValuesForAvg > 0; i--, countValuesForAvg--)
                sum += values[i];
            System.out.printf("Wert = %.2f\n", sum / countCpy);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }

}
