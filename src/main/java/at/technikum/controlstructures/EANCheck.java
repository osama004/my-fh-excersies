package at.technikum.controlstructures;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EANCheck {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter all 13 digits of an EAN: ");
            long ean = sc.nextLong();

            Pattern pattern = Pattern.compile("[0-9]{13}");
            Matcher matcher = pattern.matcher(Long.toString(ean));
            boolean isValidNumber = matcher.matches();
            if(!isValidNumber) {
                System.out.println("Please type a VALID 13 digits!!!");
                return;
            }

            long sumEven = 0;
            long sumOdd = 0;
            long decimalPlace = 1000000000000L;
            long checkNum = ean % 10;
            long total = 0;
            long remainder = 0;
            //System.out.println("i am the checkNum:" + checkNum);
            for (int num = 0; num <= 12 ; num++) {
                long oneDigit = ean / decimalPlace % 10L;
                // System.out.print(oneDigit);
                if (num % 2 == 0) sumEven += oneDigit;
                else sumOdd += oneDigit;
                decimalPlace /= 10;
            }
            //System.out.println("\nSum of EvenNums:" + sumEven);
            //System.out.println("Sum of OddNums:" + sumOdd);
            total += sumEven * 3 + sumOdd;
            total -= 1;
            remainder = total % 10;
            remainder = checkNum - remainder;
            //System.out.println("I am the final remainder:" + remainder);
            if (remainder == 0) System.out.println("The EAN is VALID.");
            else System.out.println("The EAN is NOT VALID.");



        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
