package at.technikum.functions;

public class SimpleFunction {
    public static void main(String[] args) {
        greetMe(5, "Osama", "french");
    }
    private static void greetMe(int repetition, String name, String language) {
        String greet = greeting(language);
        for (int i = 0; i < repetition; i++) {
            System.out.printf("%s %s\n", greet, name);
        }
    }
    private static String greeting(String language) {
        if (language.equals("german")) {
            return "Hallo";
        } else if (language.equals("french")) {
            return "Bonjour";
        }
        return "Hello";
    }
}
