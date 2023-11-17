package at.technikum.variables;

import java.util.Scanner;

public class Swapper {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter first number (a): ");
            int a = sc.nextInt();
            System.out.print("enter second number (b): ");
            int b = sc.nextInt();
            System.out.printf("a=%d, b=%d\n", a, b);
            int temp = b;
            b = a;
            a = temp;
            System.out.printf("swapped:\na=%d, b=%d\n", a , b);
        } catch (Throwable e) {
            System.out.println("Invalid Input");
        }
    }
}
