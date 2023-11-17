package at.technikum.formatedoutput;

public class AirTicketFormat {
    public static void main(String[] args) {
        System.out.printf("%.11S%.2S%S\n", "Mandl", "Thomas", "Mr");
        System.out.printf("%.11S%.2S%S\n", "Hinteroberegginger", "Yolanda", "Mrs");
    }
}
