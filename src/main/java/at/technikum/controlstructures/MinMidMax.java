package at.technikum.controlstructures;

import java.util.Scanner;

public class MinMidMax {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Geben Sie drei Zahlen ein:");
            System.out.print("a : ");
            int a = scanner.nextInt();
            System.out.print("b : ");
            int b = scanner.nextInt();
            System.out.print("c : ");
            int c = scanner.nextInt();

            if (a == b) {
                if (b == c) {
                    System.out.printf("%d = %d = %d\n", a ,b ,c);
                    System.out.println("a = b = c");
                } else if (b < c) {
                    System.out.printf("%d = %d < %d\n", a ,b ,c);
                    System.out.println("a = b < c");
                } else { // c < b
                    System.out.printf("%d < %d = %d\n", c ,a ,b);
                    System.out.println("c < a = b");
                }
            } else if (a == c) { // a != b
                if (a < b) {
                    System.out.printf("%d = %d < %d\n", a ,c ,b);
                    System.out.println("a = c < b");
                } else { // b < a
                    System.out.printf("%d = %d < %d\n", b ,a ,c);
                    System.out.println("b < a = c");
                }
            } else if (b == c) {
                if (a < c) {
                    System.out.printf("%d = %d < %d\n", b ,a ,c);
                    System.out.println("b = a < c");
                } else { // c < a
                    System.out.printf("%d = %d < %d\n", c ,a ,b);
                    System.out.println("c < a = b");
                }
            } else { // a != b != c
                if (a < b) {
                    if (b < c) {
                        System.out.printf("%d < %d < %d\n", a ,b ,c);
                        System.out.println("a < b < c");
                    } else if (a < c) { // a < b && a < c && c < b
                        System.out.printf("%d < %d < %d\n", a ,c ,b);
                        System.out.println("a < c < b");
                    } else { // a < b && c < a && c < b
                        System.out.printf("%d < %d < %d\n", c ,a ,b);
                        System.out.println("c < a < b");
                    }
                } else { // b < a
                    if (b < c) { // b < a && b < c
                        if (a < c) {
                            System.out.printf("%d < %d < %d\n", b ,a ,c);
                            System.out.println("b < a < c");
                        } else {
                            System.out.printf("%d < %d < %d\n", b ,c ,a);
                            System.out.println("b < c < a");
                        }
                    } else { // b < a && c < a && c < b
                        System.out.printf("%d < %d < %d\n", a ,c ,b);
                        System.out.println("a < c < b");
                    }
                }
            }

        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
