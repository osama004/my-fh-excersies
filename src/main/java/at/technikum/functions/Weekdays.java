package at.technikum.functions;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("yyyymmdd: ");
            int date = scanner.nextInt(); // yyyymmdd
            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            int year = date / 10000;
            int month = date % 10000;
            month = month / 100;
            int day = date % 100;
            // 20020201
            if (month < 3) {
                month += 10;
                year--;
            }

            int yy = year % 100;
            int century = year / 100;
            /*
            System.out.printf("%02d.%02d.%d", day, month, year);
            System.out.println("\nCentury: " + century);
            System.out.println("year2digits: " + yy);
            System.out.println("mm: " + ((2.6 * month - 0.2)));
             */
            int weekday = (int) (day + (2.6 * month - 0.2) + yy + (yy / 4) + (century/ 4) - (2 * century));
            if (weekday < 0) weekday += 7;
            weekday = weekday % 7;
            // System.out.println(weekday);
            System.out.println(daysOfWeek[weekday]);


        } catch (Throwable e) {
            System.out.println("Invalid Input" + e);
        }
    }
}
