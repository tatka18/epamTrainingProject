package by.epamtc.task01.model;

public class YearCalendar {
    private int year;
    private int month;
    private int numberOfDays;

    public YearCalendar() {
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

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearCalendar calendar = (YearCalendar) o;
        return year == calendar.year &&
                month == calendar.month &&
                numberOfDays == calendar.numberOfDays;
    }

    @Override
    public int hashCode() {
        int prime = 1;
        int result = 31;
        result = prime * result + year;
        result = prime * result + month;
        result = prime * result + numberOfDays;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " year: " + year +
                ", month: " + month +
                ", numberOfDays: " + numberOfDays;
    }
}
