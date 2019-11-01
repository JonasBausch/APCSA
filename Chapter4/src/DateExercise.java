import java.time.LocalDate;

public class DateExercise {

    /**
     * java uses unix time or epoch time which starts counting from Jan 1st 1970 (Thursday) and counts the miliseconds elapsed since then
     */
    public static void main(String[] args) {
        System.out.println(getWeekDayWithLocalDate(1, 1, 1601));
        System.out.println(getWeekDayWithLocalDate(11, 1, 2019));
        System.out.println(getWeekDayWithZeller(1, 1, 1601));
        System.out.println(getWeekDayWithZeller(11, 3, 2019));
    }

    private static String getWeekDayWithLocalDate(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

    private static int getWeekDayWithZeller(int month, int day, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        return (int) ((day + ((month + 1) * 2.6) + year + (year / 4) + 6 * (year / 100) + (year / 400) + 6) % 7);
    }

    private static String getWeekDayWithZellerAsString(int month, int day, int year) {
        int weekday = getWeekDayWithZeller(month, day, year);
        switch (weekday) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "not a valid weekday";
        }
    }

}