package at.technikum.functions;

import java.util.Scanner;

public class TimeCalculations {
    public static void main(String[] args) {
        System.out.printf("Encode(%02d, %02d) = %d\n", 12, 45, encode(12, 45));
        System.out.printf("Encode(%02d, %02d) = %d\n", 0, 1, encode(0, 1));
        /*
        int t = read();
        print(t);
        System.out.printf("hours(%d)=%d\n", t, hours(t));
        System.out.printf("minutes(%d)=%d\n", t, minutes(t));

         */
        System.out.printf("add(%04d + %04d)=%04d\n", 2015, 233, add(2015, 233));
        System.out.printf("add(%04d + %04d)=%04d\n", 535, 1340, add(535, 1340));
        System.out.printf("add(%04d + %04d)=%04d\n", 2312, 100, add(2312, 100));
        System.out.printf("add(%04d + %04d)=%04d\n", 2245, 432, add(2245, 432));
        System.out.printf("add(%04d + %04d)=%04d\n", 2359, 2359, add(2359, 2359));

        System.out.printf("total_minutes(%04d)=%d\n", 2359, total_minutes(2359));
        System.out.printf("total_minutes(%04d)=%d\n", 59, total_minutes(59));

    }

    public static int encode(int h, int m) {
        if (h < 0 || h > 60 || m < 0 || m > 60) return -1;
        return h * 100 + m;
    }

    public static int read() {
        try (Scanner inputConsole = new Scanner(System.in)) {
            int hh = -1, mm = -1;
            while (hh < 0 || hh > 60) {
                System.out.print("hours: ");
                hh = inputConsole.nextInt();
            }
            while (mm < 0 || mm > 60) {
                System.out.print("minutes: ");
                mm = inputConsole.nextInt();
            }
            return encode(hh, mm);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
        return -1;
    }

    public static int hours(int t) {
        return t / 100;
    }

    public static int minutes(int t) {
        return t % 100;
    }

    public static void print(int t) {
        System.out.printf("%02d:%02d\n", hours(t), minutes(t));
    }

    public static void timeInString(int t) {
        System.out.printf("%02d:%02d\n", hours(t), minutes(t));
    }

    public static int add(int t1, int t2) {
        int hh1 = hours(t1);
        int hh2 = hours(t2);
        int mm1 = minutes(t1);
        int mm2 = minutes(t2);
        int resMM = 0;
        int resHH = 0;

        if (mm1 + mm2 < 60) {
            resMM = mm1 + mm2;
        } else {
            resHH += 1;
            resMM = mm1 + mm2 - 60;
        }
        if (hh1 + hh2 + resHH < 24) {
            resHH += hh1 + hh2;
        } else {
            resHH += hh1 + hh2 - 24;
        }
        return encode(resHH, resMM);
    }

    public static int total_minutes(int t) {
        return hours(t) * 60 + minutes(t);
    }
}
