package by.epamtc.task01.model;

public class Day {
    private int hour;
    private int minute;
    private int second;

    public Day() {
    }

    public Day(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return hour == day.hour &&
                minute == day.minute &&
                second == day.second;
    }

    @Override
    public int hashCode() {
        int prime = 1;
        int result = 31;
        result = prime * result + minute;
        result = prime * result + second;
        result = prime * result + hour;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                hour + "h " +
                minute + "min " +
                + second + "sec";
    }
}
