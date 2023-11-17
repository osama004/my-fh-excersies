package at.technikum.formatedinput;

import java.util.Scanner;

public class Hyperbel {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.print("a: ");
            int a = sc.nextInt();
            System.out.print("b: ");
            int b = sc.nextInt();
            System.out.print("c: ");
            int c = sc.nextInt();
            System.out.print("d: ");
            int d = sc.nextInt();
            System.out.print("e: ");
            double e = sc.nextDouble();

            System.out.println("\n01234567890123456");
            System.out.printf("\\%15s/\n", " ");
            System.out.printf(" \\ %011d /\n", a);
            System.out.printf("  \\%11s/\n", " ");
            System.out.printf("%03d| %03.3f |%03d\n", b, e, c);
            System.out.printf("  /%11s\\\n", " ");
            System.out.printf(" / %011d \\\n", d);
            System.out.printf("/%15s\\", " ");

        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
