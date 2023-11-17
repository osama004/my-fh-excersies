package at.technikum.formatedinput;

import java.util.Scanner;

public class Cube {

    /*
    Length of a side: 5
    Surface area: 150.00
    Volume: 125.00
     */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Length of a side: ");
            int sideLong = sc.nextInt();
            int circumference = 4 * sideLong;
            double surface = sideLong * sideLong;
            double volume = Math.pow(sideLong, 3);
            System.out.printf("Surface are: %.2f\n", surface);
            System.out.printf("circumference are: %d\n", circumference);
            System.out.printf("Volume: %.2f\n", volume);
        }
        catch (Exception e) {
            System.out.println("invalid input");
        }
    }
}
