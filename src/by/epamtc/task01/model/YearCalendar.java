package by.epamtc.task01.model;

import java.util.Objects;

public class YearCalendar {
    private int year;
    private int month;
    private int days;

    public YearCalendar() {
    }

    public YearCalendar(int year, int month, int days) {
        this.year = year;
        this.month = month;
        this.days = days;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearCalendar calendar = (YearCalendar) o;
        return year == calendar.year &&
                month == calendar.month &&
                days == calendar.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, days);
    }

    @Override
    public String toString() {
        return "year: " + year +
                ", month: " + month +
                ", days: " + days;
    }
}
