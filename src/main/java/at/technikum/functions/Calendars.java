package at.technikum.functions;

import java.util.Scanner;

public class Calendars {

    private static Scanner sc = new Scanner(System.in);
    private static final int SET_DATE = 0;
    private static final int IS_LEAP = 1;
    private static final int DAYS_IN_MONTH = 2;
    private static final int CHECK_DATE = 3;

    private static final int YMD_2_W = 7;
    private static final int DAY_NUMBER = 8;
    private static final int WEEK_NUMBER = 9;
    //private static final int COMPARE = 10;

    //private static final int DAY_NAME = 13;
    //private static final int PRINT_DAY = 14;
    //private static final int DAY_SHORT_NAME = 15;
    //private static final int PRINT_DAY_SHORT = 16;
    //private static final int PRINT_MONTH = 17;
    //private static final int PRINT_MONTH_SHORT = 18;
    //private static final int PRINT_DATE = 19;
    private static final int PRINT_STATISTICS = 20;
    private static final int PRINT_CALENDAR_HIGHLIGHT = 21;
    private static final int PRINT_CALENDAR = 22;
    private static final int EXIT = 666;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int day = 23, month = 11, year = 2023;
        // int day = 1, month = 1, year = 1970;
        // int day = 8, month = 1, year = 1970;
        while (true) {

            int op;
            System.out.printf("current date: %02d.%02d.%04d\n", day, month, year);
            System.out.printf("enter option: ");
            op = sc.nextInt();
            switch (op) {
                case SET_DATE:
                    System.out.printf("day: ");

                    day = sc.nextInt();
                    System.out.printf("month: ");

                    month = sc.nextInt();
                    System.out.printf("year: ");

                    year = sc.nextInt();
                    break;
                /*------------------------- BASICS ----------------------*/
                case IS_LEAP:
                    System.out.printf("\nisLeap(year): %b\n", isLeap(year));
                    break;

                case DAYS_IN_MONTH:
                    System.out.printf("\ndaysInMonth(year, month): %d\n", daysInMonth(year, month));
                    break;

                case CHECK_DATE:
                    System.out.printf("\ncheckDate1(year): %b\n", checkDate(year));
                    System.out.printf("checkDate2(year, month): %b\n", checkDate(year, month));
                    System.out.printf("checkDate3(year, month, day): %b\n", checkDate(year, month, day));
                    break;

                /*------------------------- CALCULATIONS ----------------------*/
                case YMD_2_W: {
                    System.out.printf("\nymd2w(year, month, day): %d\n", ymd2w(year, month, day));
                    break;
                }
                case DAY_NUMBER:
                    System.out.printf("\ndayNumber(year, month, day): %d\n", dayNumber(year, month, day));
                    break;

                case WEEK_NUMBER:
                    System.out.printf("\nweekNumber(year, month, day): %d\n", weekNumber(year, month, day));
                    break;

                /*------------------------- OUTPUT ----------------------*/

                case PRINT_STATISTICS:
                    System.out.printf("\nprintStatistics: ");
                    printStatistics(year, month, day);

                    break;

                /*------------------------- APPLICATIONS ----------------------*/
                case PRINT_CALENDAR_HIGHLIGHT:
                    System.out.printf("\nprintCalendar(year, month, day, 1): \n");
                    printCalendar(year, month, day, true);

                    break;
                case PRINT_CALENDAR:
                    System.out.printf("\nprintCalendar(year, month, day, 0): \n");
                    printCalendar(year, month, day, false);

                    break;
                case EXIT:
                    System.out.printf("closing.\n");
                    sc.close();

                    return;

                default:
                    ;
            }
            System.out.printf("\n");
        }


    }


    public static boolean checkDate(int year) {
        return year >= 1582 && year <= 2199;
    }

    public static boolean checkDate(int year, int month) {
        if (!checkDate(year) || month < 1 || month > 12 || (year == 1582 && month < 10))
            return false;
        return true;
    }

    public static boolean checkDate(int year, int month, int day) {
        if (!checkDate(year, month) || year == 1582 && month == 10 && day < 16)
            return false;
        return true;
    }

    public static int daysInMonth(int year, int month) {
        int daysInMonth = -1;
        if (!checkDate(year, month)) return -1;
        if (isLeap(year) && month == 2) return 29;

        if (month == 1) return 31;
        if (month == 2) return 28;
        if (month == 3) return 31;
        if (month == 4) return 30;
        if (month == 5) return 31;
        if (month == 6) return 30;
        if (month == 7) return 31;
        if (month == 8) return 31;
        if (month == 9) return 30;
        if (month == 10) return 31;
        if (month == 11) return 30;
        if (month == 12) return 31;

        return daysInMonth;
    }

    public static boolean isLeap(int year) {
        if (!checkDate(year))
            return false;
        if (year % 4 == 0)
            return true;
        else
            return year % 400 == 0;
    }

    public static int ymd2w(int year, int month, int day) {
        // not working
        if (!checkDate(year, month, day)) return -1;
        if (month < 3) {
            month += 12;
            year--;
        }
        int yy = year % 100;
        int century = year / 100;
        int weekday = (day + 13 * (month + 1) / 5 + yy + (yy / 4) + (century / 4) - (2 * century)) % 7;
        if (weekday < 0) weekday += 7;
        return weekday - 1;
    }

    public static int dayNumber(int year, int month, int day) {
        if (!checkDate(year, month, day)) return -1;
        int dayNumber = 0;
        for (int i = month - 1; i > 0; i--)
            dayNumber += daysInMonth(year, i);
        dayNumber += day;
        return dayNumber;
    }

    static int weekNumber(int year, int month, int day) {
        if (!checkDate(year, month, day)) return -1;
        int jan4thDayOfWeek = dayNumber(year, 1, 4);
        int targetDayOfWeek = dayNumber(year, month, day);
        int weekNumber = 0;
        weekNumber = (targetDayOfWeek - ymd2w(year, month, day) + 10) / 7;
        /*
        System.out.printf("""
                jan4thDayOfWeek: %d
                targetDayOfWeek: %d
                weekNumber: %d
                """, jan4thDayOfWeek, targetDayOfWeek, weekNumber);
         */


        return weekNumber;
    }

    /* Print methods !! */
    public static void printDayName(int day) {
        if (day < 0 || day > 6) {
            System.out.printf("Invalid day(%d)\n", day);
            return;
        }
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.print(daysOfWeek[day]);
    }

    public static void printMonthName(int month) {
        if (month < 1 || month > 12) {
            System.out.printf("Invalid Month(%d)\n", month);
            return;
        }
        String[] months = {"PLACEHOLDER",
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        System.out.print(months[month]);
    }

    public static void printNumberEnding(int n) {
        if (n < 0) {
            System.out.printf("Invalid Number(%d)\n", n);
            return;
        }
        if (n == 1 || n == 21 || n == 31)
            System.out.print("st");
        else if (n == 2 || n == 22)
            System.out.print("nd");
        else if (n == 3 || n == 23)
            System.out.print("rd");
        else
            System.out.print("th");
    }

    public static void printDate(int year, int month, int day) {
        printDayName(ymd2w(year, month, day));
        System.out.print(", ");
        printMonthName(month);
        System.out.printf(" %d", day);
        printNumberEnding(day);
        System.out.printf(" %d\n", year);
    }

    public static void printStatistics(int year, int month, int day) {
        System.out.println("statistics for");
        printDate(year, month, day);
        if (isLeap(year)) {
            System.out.printf("%d is a leap year\n", year);
        } else {
            System.out.printf("%d is not a leap year\n", year);
        }
        printMonthName(month);
        System.out.printf("""
                         has %d days
                        it is day %d of %d
                        it is in week %d
                        """, daysInMonth(year, month), dayNumber(year, month, day),
                year, weekNumber(year, month, day));
    }

    public static void printCalendar(int year, int month, int day, boolean highlight) {
        int indexDay = 1;
        int daysInMonth = daysInMonth(year, month);
        int weekday = ymd2w(year, month, day);
        printMonthName(month);
        System.out.printf(" %d\nMon Tue Wed Thu Fri Sat Sun\n", year);
        for (int i = 0; i < weekday; i++)  // first Row
            System.out.print("\t");
        for (int i = 0; i < 7 - weekday; i++) { // first Row
            if (highlight && indexDay == day)
                System.out.printf("<%d> ", indexDay);
            else
                System.out.printf("%2d%2s", indexDay, " ");
            indexDay++;
        }
        System.out.println();
        while (indexDay <= daysInMonth) {
            for (int i = 1; i <= 7; i++) {
                if (highlight && indexDay == day)
                    if (day < 10)
                        System.out.printf("<%d> ", indexDay);
                    else
                        System.out.printf("\b<%d> ", indexDay);
                else
                    System.out.printf("%2d%2s", indexDay, " ");
                indexDay++;
            }
            System.out.println();
        }
    }
}
