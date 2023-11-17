package at.technikum.controlstructures;

import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter price: ");
            int price = scanner.nextInt();
            System.out.print("enter quality: ");
            int quality = scanner.nextInt();

            if (price >= 50) {
                System.out.println("high price");
                if (quality >= 50)
                    System.out.println("high quality\nluxury");
                 else
                    System.out.println("low quality\nrip off");
            } else {
                System.out.println("low price");
                if (quality >= 50)
                    System.out.println("high quality\nbargin");
                else
                    System.out.println("low quality\njunk");
            }
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
