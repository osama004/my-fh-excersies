package at.technikum.controlstructures;

import java.util.Scanner;

public class EANCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter all 13 digits of an EAN: ");
            long ean = sc.nextLong();
            long sumEven = 0;
            long sumOdd = 0;
            long decimalPlace = 1000000000000L;

            for (int num = 12; num >= 0 ; num--) {
                long oneDigit = ean / decimalPlace % 10L;
                //System.out.println(oneDigit);
                if (num % 2 == 0) sumEven += oneDigit;
                else sumOdd += oneDigit;
                decimalPlace /= 10;
            }



        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
