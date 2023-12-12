package at.technikum.functions;

import java.util.Arrays;
import java.util.Scanner;

public class ZooManager {
    static Scanner sc = new Scanner(System.in);

    static void printMenu() {
        System.out.print("-------------------------\n");
        System.out.print("1: Gewicht erfassen\n");
        System.out.print("2: Groesse erfassen\n");
        System.out.print("3: Ausgeben\n");
        System.out.print("4: Angaben pruefen\n");
        System.out.print("5: Loeschen\n");
        System.out.print("6: Durchschn. Gewicht\n");
        System.out.print("7: Durchschn. Groesse\n");
        System.out.print("8: Groesste des Schwersten\n");
        System.out.print("9: Gewicht des Groessten\n");
        System.out.print("0: Beenden\n");
        System.out.print("-------------------------\n");
    }

    static int readMenu () {
        int m;
        System.out.print(": ");
        m = sc.nextInt();
        return m;
    }
    public static void main(String[] args) {

        /* size of all Arrays */
        int size = 8;

        float[] weight = new float[size];
        float[] length = new float[size];

        int weightsCount, lengthsCount;

        System.out.print("ZooManager 2.0\n");
        System.out.print("==============\n\n");
        printMenu();

        while (true) {
            switch (readMenu()) {
                case 0:
                    sc.close();
                    return ;
                case 1:
                    read(weight);
                    break;
                case 2:
                    read(length);
                    break;
                case 3:
                    System.out.print("Gewicht: ");
                    print(weight);
                    System.out.print("\nGroesse: ");
                    print(length);
                    System.out.println();
                    break;
                case 4:
                    weightsCount = count(weight);
                    lengthsCount = count(length);
                    System.out.printf("Anzahl: %d/%d\n", weightsCount, lengthsCount);
                    if (weightsCount != lengthsCount) {
                        System.out.print("Ungueltig\n");
                    } else {
                        System.out.print("OK\n");
                    }
                    break;
                case 5:
                    clear(weight);
                    clear(length);
                    break;
                case 6:
                    System.out.printf("Durchschn. Gewicht: %.2f\n", avg(weight));
                    break;
                case 7:
                    System.out.printf("Durchschn. Groesse: %.2f\n", avg(length));
                    break;
                case 8:
                    System.out.printf("Groesste des Schwersten: %.2f\n", b_of_max_a(weight, length));
                    break;
                case 9:
                    System.out.printf("Gewicht des Groessten: %.2f\n", b_of_max_a(length, weight));
                    break;
            }
        }
    }

    public static void read(float[] values) {
        float value = 5;
        for (int i = 0; i < values.length && value != 0; i++) {
            System.out.print("v: ");
            value = sc.nextFloat();
            values[i] = value;
        }
    }

    public static void print(float[] values) {
        System.out.print("{");
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) break;
            System.out.printf(" %.2f ", values[i]);
        }
        System.out.print("}");
    }

    public static int count(float[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0f) break;
            count++;
        }
        return count;
    }

    public static void clear(float[] values) {
        Arrays.fill(values, 0f);
    }

    public static float avg(float[] values) {
        double sum = 0;
        for (float value: values) sum += value;
        return (float) (sum / count(values));
    }

    public static float b_of_max_a(float[] a, float[] b) {
        int countA = count(a);
        int countB = count(b);
        int iMax = -1;
        float foundMaxB = Float.MIN_VALUE;
        if (countA == 0 && countB == 0 || countB != countA) return -1f;
        for (int i = 0; i < countA; i++) {
            if (a[i] > foundMaxB) {
                foundMaxB = a[i];
                iMax = i;
            }
        }
        return b[iMax];
    }

}
