package at.technikum.formatedinput;

import java.util.Scanner;

public class TimeCalculator {

    /*
    Welcome to the TimeCalculator!
    please enter a duration in milliseconds:3452347890
    3452347890 ms are exactly:
    days 39
    hours 22
    minutes 59
    seconds 7
    ms 890
     */
    public static void main(String[] args) {
        final long DAY = 86400000;
        final long HOUR = 3600000;
        final long MINUTE = 60000;
        final long SECOND = 1000;

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Welcome to the TimeCalculator!\nplease enter a duration in milliseconds:");
            long input = sc.nextLong();
            long copy = Long.valueOf(input).longValue();

            long days = input / DAY;
            input = input % DAY;
            long hours = input / HOUR;
            input = input % HOUR;
            long minutes = input / MINUTE;
            input = input % MINUTE;
            long seconds = input / SECOND;
            input = input % SECOND;
            long miliesSeconds = input;
            System.out.printf("%d ms are exactly:\n"
                    +          "days %d\n"
                    +          "hours: %d\n"
                    +          "minutes: %d\n"
                    +          "seconds: %d\n"
                    +          "ms: %d", copy,days, hours ,minutes, seconds ,miliesSeconds);
        } catch (Throwable e) {
            System.out.println("Invalid Input");
        }
    }
}
