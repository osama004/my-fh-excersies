package at.technikum.functions;

import java.util.Scanner;

public class MilchFun {
    public static void main(String[] args) {
        try(Scanner inputConsole = new Scanner(System.in)) {
            System.out.print("Fettgehalt: ");
            double fett = inputConsole.nextDouble();
            System.out.print("Haltbar: ");
            int haltbar = inputConsole.nextInt();
            ausgabe(klasse(fett, haltbar));
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
    private static int klasse(double fett, int haltbar) {
        int klasse = -1;
        if (haltbar > 1 || haltbar < 0 || fett < 0.)
            return klasse;
        if (haltbar == 1) {
            if (fett < 3.) klasse =  4;
            if (fett > 7.) klasse = 2;
            if (fett >= 3. && fett <= 7.) klasse = 6;
        } else {
            if (fett < 3.) klasse = 3;
            if (fett > 7.) klasse = 1;
            if (fett >= 3. && fett <= 7.) klasse = 5;
        }
        return klasse;
    }
    private static void ausgabe(int k) {
        switch (k) {
            case 1 -> System.out.println("Extravollmilch (frisch)");
            case 2 -> System.out.println("Extravollmilch (haltbar)");
            case 3 -> System.out.println("Leichtmilch (frisch)");
            case 4 -> System.out.println("Leichtmilch (haltbar)");
            case 5 -> System.out.println("Normalmilch (haltbar)");
            case 6 -> System.out.println("Normalmilch (frisch)");
            case -1 -> System.out.println("Ungueltige Klassifizierung!");
            default -> System.out.println("Ungueltiges Argument!");
        }
    }

}
