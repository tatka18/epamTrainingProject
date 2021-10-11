package by.epamtc.task01.service;

import by.epamtc.task01.model.YearCalendar;

public class Task2 {
    public YearCalendar numberOfDaysInMonthByYear(YearCalendar yearCalendar) {
        return numberOfDaysByMonth(yearCalendar);
    }

    private YearCalendar numberOfDaysByMonth(YearCalendar yearCalendar) {
        switch (yearCalendar.getMonth()) {
            case 2:
                int numberOfDays = determineNumberOfDaysInFebruary(yearCalendar);
                yearCalendar.setNumberOfDays(numberOfDays);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                yearCalendar.setNumberOfDays(30);
                break;
            default:
                yearCalendar.setNumberOfDays(31);
        }
        return yearCalendar;
    }

    private static int determineNumberOfDaysInFebruary(YearCalendar yearCalendar) {
        int numberOfDays;
        if (isLeap(yearCalendar)) {
            numberOfDays = 29;
        } else numberOfDays = 28;
        return numberOfDays;
    }

    public static boolean isLeap(YearCalendar yearCalendar) {
        if (yearCalendar.getYear() % 4 == 0) {
            return (yearCalendar.getYear() % 100 != 0)
                    | ((yearCalendar.getYear() % 100 == 0) && (yearCalendar.getYear() % 400 == 0));
        }return false;
    }
}
