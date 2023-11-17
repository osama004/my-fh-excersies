package at.technikum.variables;

import java.util.Scanner;

public class SwapInPlace {


    /*
   Before:
    a= 23
    b: 5
    After:
    a= 5
    b: 23
     */
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.printf("Before:\na: %d\nb: %d\n", a ,b);
            a = a + b ; // 10 = 10 + 25 = 35
            b = a - b ; // 10 = 35 - 10 = 25
            a = a - b;

            System.out.printf("After:\na: %d\nb: %d\n", a ,b);
        } catch (Throwable e) {
            System.out.println("invalid Input");
        }
    }
}
