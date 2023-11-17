package at.technikum.formatedinput;

import java.util.Scanner;

public class Age_of_Empires {

    /*
    Your age: 37
    %d: ~37~
    %+d: ~+37~
    % d: ~ 37~
    %5d: ~ 37~
    %05d: ~00037~
    %-5d: ~37 ~
    %#x: ~0x25~
     */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Your age: ");
            int age = sc.nextInt();
            System.out.printf("%%d: ~%d~\n", age);
            System.out.printf("%%+d: ~%+d~\n", age);
            System.out.printf("%% d: ~% d~\n", age);
            System.out.printf("%%5d: ~%5d~\n", age);
            System.out.printf("%%05d: ~%05d~\n", age);
            System.out.printf("%%-5d: ~%-5d~\n", age);
            System.out.printf("%%#x: ~%#x~\n", age);
        } catch (Throwable e) {
            System.out.println("Invalid Input");
        }
    }
}
