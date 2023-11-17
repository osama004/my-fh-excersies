package at.technikum.formatedinput;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatConverter {
    /*
        enter date (yyyymmdd)
        19991231
        31.12.1999
        enter date (yyyymmdd)
        220001231
        invalid date
    */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
            String nowTimeString = dtf.format(LocalDateTime.now());
            //System.out.println(dtf.format(nowTimeString));
            System.out.print("enter date :");
            int date = sc.nextInt();
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            // System.out.println(LocalDate.now().format(formatter));

            int now = Integer.parseInt(nowTimeString);
            if (date <= now )
            {
                int year = date / 10000;
                int month = date % 10000;
                month = month / 100;
                int day = date % 10000;
                day = day / 100;
                System.out.printf("%d.%d.%d", day, month, year);
            }
            else
            {
                System.out.println("invalid date");
            }
        } catch (Exception e) {
            System.out.println("Invald Input!!");
        }
    }
}
