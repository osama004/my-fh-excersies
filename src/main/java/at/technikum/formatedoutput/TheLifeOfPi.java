package at.technikum.formatedoutput;

public class TheLifeOfPi {
    public static void main(String[] args) {
        System.out.printf("Pi = %f!\n", 3.14159265359);
        System.out.printf("Pi = %12f!\n", 3.14159265359);
        System.out.printf("Pi = %12.2f!\n", 3.14159265359);
        System.out.printf("Pi = %10.0f!\n", 3.14159265359);
        System.out.printf("Pi = %13.11f!\n", 3.14159265359);
        System.out.printf("Pi = %015f!\n", 3.14159265359);
        System.out.printf("Pi = %+015.2f!\n", 3.14159265359);
    }
}
