package at.technikum.formatedinput;

import java.util.Scanner;

public class Rhombus {
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

            System.out.println("012345678901234567890123\n");
            System.out.printf("%-3d%8s/\\%8s%3d\n",a," ", " ", b);
            System.out.printf("%10s/  \\%13s\n"," ", " ");
            System.out.printf("%9s/    \\%12s\n"," ", " ");
            System.out.printf("%8s| %+-1.1f |%8s\n"," ", e ," ");
            System.out.printf("%9s\\    /%12s\n"," ", " ");
            System.out.printf("%10s\\  /%13s\n"," ", " ");
            System.out.printf("%-3d%8s\\/%8s%3d\n",c," ", " ", d);

        } catch (Throwable e) {
            System.out.println("Invalid Input");
        }
    }
}
