package at.technikum.formatedinput;

import java.util.Scanner;

public class Zahlendreher {
    /*
    Zahl: 123
    Ausgabe: 321
    Zahl: 12
    Ausgabe: 210
    Zahl: 1
    Ausgabe: 100
    Zahl: 120
    Ausgabe: 021
    Zahl: 0
    Ausgabe: 000
     */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Zahl: ");
            int num =  sc.nextInt();
            if (num % 100 > 0) {
                System.out.printf("%d%d%d", num % 10, (num / 10) % 10, num / 100 );
            }else if (num % 10 > 0) {
                System.out.printf("%d%d%d", num % 10, (num / 10) % 10, 0 );
            }else {
                System.out.printf("%d%d%d", num % 10, 0, 0);
            }
        } catch (Throwable e) {
            System.out.println("Invalid Input");
        }
    }
}
