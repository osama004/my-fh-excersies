package at.technikum.formatedinput;

import java.math.BigInteger;
import java.util.Scanner;

public class TimeCalculator_first {

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
        final BigInteger DAY = new BigInteger("86400000");
        final BigInteger HOUR = new BigInteger("3600000");
        final BigInteger MINUTE = new BigInteger("60000");
        final BigInteger SECOND = new BigInteger("1000");

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Welcome to the TimeCalculator!\nplease enter a duration in milliseconds:");
            String input = sc.nextLine();
            BigInteger integer = new BigInteger(input);
            BigInteger copy = new BigInteger(input);
            //long milsecs = 3452347890;
            int days = integer.divide(DAY).intValue();
            integer = integer.mod(DAY);
            int hours = integer.divide(HOUR).intValue();
            integer = integer.mod(HOUR);
            int minutes = integer.divide(MINUTE).intValue();
            integer = integer.mod(MINUTE);
            int seconds = integer.divide(SECOND).intValue();
            integer = integer.mod(SECOND);
            int miliesSeconds = integer.intValue();
            System.out.printf("%d ms are exactly:\n"
                    +          "days %d\n"
                    +          "hours: %d\n"
                    +          "seconds: %d\n"
                    +          "ms: %d", copy.longValue(),days, hours , seconds ,miliesSeconds);


        } catch (Throwable e) {
            System.out.println("Invalid Input");
        }
    }
}
