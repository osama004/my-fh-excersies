package at.technikum.functions;
import java.util.Scanner;

public class PartyHandshake {
    static Scanner sc;

    public static void main(String[] args) {
        try {
            sc = new Scanner(System.in);
            System.out.print(": ");
            int n = sc.nextInt();
            String[] names = readNames(n);
            String[] handshakes = handShakes(names);
            print(handshakes);
        } catch (Throwable e) {
            System.out.println("Invalid Input: " + e);
        } finally {
            sc.close();
        }
    }

    public static String[] readNames(int n) {
        while (n < 1) {
            System.out.print(": ");
            n = sc.nextInt();
        }
        String[] names = new String[n];
        for (int i = 0; i < n; i++)
            names[i] = sc.next();
        return names;
    }

    public static String[] handShakes(String[] names) {
        int n =  names.length;
        String[] handshakes = new String[n * (n - 1) / 2];
        for (int i = 0, indexHandshakes = 0; i < names.length; i++)
            for (int j = i + 1; j < names.length; j++, indexHandshakes++)
                handshakes[indexHandshakes] = String.format("%s -> %s", names[i], names[j]);
        return handshakes;
    }

    public static void print(String[] handshakes) {
        for (String handshake: handshakes) System.out.println(handshake);
    }
}
