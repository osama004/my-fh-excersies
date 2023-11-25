package at.technikum.functions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorFunctions {

    static Scanner sc;
    public static void welcome() {
        System.out.println("Welcome to ColorFunctions!");
    }

    public static void good_bye() {
        System.out.println("Exiting ColorFunctions!");
    }

    public static int read_channel() {
        int num = -1;
        Scanner consoleInput = new Scanner(System.in);
        while (num < 0 || num > 255) {
            System.out.print(": ");
            num = consoleInput.nextInt();
        }
        return num;
    }

    public static int encode(int c1, int c2, int c3) {
        if (c1 < 0 || c1 > 255 || c2 < 0 || c2 > 255 || c3 < 0 || c3 > 255)
            return -1;
        return (int) (c1 * Math.pow(10, 6) + c2 * Math.pow(10, 3) + c3);
    }

    public static int read_rgb() {
        int red = -1, green = -1, blue = -1;
        System.out.print("red");
        red = read_channel();
        System.out.print("green");
        green = read_channel();
        System.out.print("blue");
        blue = read_channel();
        return encode(red, green, blue);
    }

    public static boolean isValidRGB(int rgb) {
        Pattern pattern = Pattern.compile("[0-9]{9}");
        Matcher matcher = pattern.matcher(Integer.toString(rgb));
        return matcher.matches();
    }

    public static int red(int rgb) {
        if (!isValidRGB(rgb)) {
            System.out.printf("Invalid RGB:%d\n", rgb);
            return -1;
        }
        return rgb / 1000000;
    }

    public static int green(int rgb) {
        if (!isValidRGB(rgb)) {
            System.out.printf("Invalid RGB:%d\n", rgb);
            return -1;
        }
        return rgb / 1000 % 1000;
    }

    public static int blue(int rgb) {
        if (!isValidRGB(rgb)) {
            System.out.printf("Invalid RGB:%d\n", rgb);
            return -1;
        }
        return rgb % 1000;
    }

    public static void print_rgb(int rgb) {
        if (!isValidRGB(rgb)) {
            System.out.printf("Invalid RGB:%d\n", rgb);
            return;
        }
        int red = rgb / 1000000;
        int green = rgb / 1000 % 1000;
        int blue = rgb % 1000;
        System.out.printf("R%03d G%03d B%03d\n", red, green, blue);
    }

    public static int rgb_2_cmy(int rgb) {
        // int cmy = 0, c = 0, m = 0, y = 0;
        return encode(255 - red(rgb), 255 - green(rgb), 255 - blue(rgb));
    }

    public static int cyan(int cmy) {
        if (!isValidRGB(cmy)) {
            System.out.printf("Invalid CMY:%d\n", cmy);
            return -1;
        }
        return cmy / 1000000;
    }

    public static int magenta(int cmy) {
        if (!isValidRGB(cmy)) {
            System.out.printf("Invalid CMY:%d\n", cmy);
            return -1;
        }
        return cmy / 1000 % 1000;
    }

    public static int yellow(int cmy) {
        if (!isValidRGB(cmy)) {
            System.out.printf("Invalid CMY:%d\n", cmy);
            return -1;
        }
        return cmy % 1000;
    }

    public static void print_cmy(int cmy) {
        if (!isValidRGB(cmy)) {
            System.out.printf("Invalid CMY:%d\n", cmy);
            return;
        }
        int red = cmy / 1000000;
        int green = cmy / 1000 % 1000;
        int blue = cmy % 1000;
        System.out.printf("C%03d M%03d Y%03d\n", red, green, blue);
    }

    public static void convert() {
        welcome();
        int rgb = read_rgb();
        print_rgb(rgb);
        int cmy = rgb_2_cmy(rgb);
        print_cmy(cmy);
        good_bye();
    }

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        welcome();
        good_bye();
        System.out.printf("%d\n", read_channel());
        int a, b, c;
        a = 255;
        b = 200;
        c = 1;
        System.out.printf("%d\n", encode(a, b, c));
        System.out.printf("%d\n", read_rgb());
        System.out.printf("%d\n", red(124030200));

        System.out.printf("%d\n", green(124030200));

        System.out.printf("%d\n", blue(124030200));

        print_rgb(a);
        int cmy = rgb_2_cmy(124030200);
        System.out.printf("%d\n", cmy);

        System.out.printf("%d\n", cyan(cmy));

        System.out.printf("%d\n", magenta(cmy));

        System.out.printf("%d\n", yellow(cmy));

        print_cmy(cmy);

        convert();
        sc.close();
    }


    private abstract static class Test {
        protected abstract void exec();

        void run() {
            System.out.printf("executing %s\n", this.getClass().getSimpleName());
            exec();
        }
    }


}
