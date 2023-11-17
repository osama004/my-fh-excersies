package at.technikum.formatedinput;

import java.util.Scanner;

public class Tax {

    /*
    Enter an amount: 100.50
    With tax added : 120.6
     */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an amount:");
            double amount = sc.nextDouble();
            double afterTax = amount + amount * 0.20;
            System.out.printf("With tax added :%.2f", afterTax);
        } catch (Throwable e) {
            System.out.println("Invalid input");
        }
    }
}
