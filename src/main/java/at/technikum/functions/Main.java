package at.technikum.functions;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int eingabe;
        System.out.print("yyyymmdd: ");
        eingabe = sc.nextInt();

        int yyyy=eingabe/10000;
        int mm = (eingabe/100)%100;
        int dd = eingabe%100;

        if(checkDate(yyyy,mm,dd)){

            if(mm<3){
                mm+=10;
                yyyy--;
            }else mm-=2;
            int century = yyyy/100;
            int yy = yyyy%100;
            mm = (int) Math.floor(2.6*mm-0.2);
            System.out.println(mm);
            int ergebnis =  (dd + mm + yy+yy/4 + century/4 - 2*century);

            if (ergebnis < 0) ergebnis+=7;
            ergebnis = ergebnis % 7;

            System.out.print(weekdays[ergebnis]);
        }else System.out.println("not valid.");
    }

    private static boolean checkDate(int year, int month, int day){
        return day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1583 &&
                ((month != 4 && month != 6 && month != 9 && month != 11) || day <= 30) &&
                (!leap(year) || month != 2 || day <= 29) && (month != 2 || leap(year) || day <= 28);
    }

    private static boolean leap (int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}