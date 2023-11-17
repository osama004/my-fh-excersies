package at.technikum.formatedinput;

import java.util.Scanner;

public class Oktal {

    public static void main(String[] args) {

        /*
            Oktalzahl eingeben: 123
            dezimal: 83
            Ziffernsumme: 11

            Oktalzahl eingeben: 777
            dezimal: 511
            Ziffernsumme: 7
         */
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("give an valid octal number or end by -1:");
            long input = sc.nextLong();
            //long input = 777;
            long decimal = 0;
            int i = 0;


            while (input != 0) {
                decimal = (long) (decimal + input % 10 * Math.pow(8, i));
                input = input / 10;
                i++;
            }
            System.out.printf("dezimal: %d\n", decimal);
            System.out.println("Bye Bye !!");
        } catch (Exception e) {
            System.out.println("Illegal input , please try again");
        }
    }
}
