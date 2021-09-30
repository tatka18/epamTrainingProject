package by.epamtc.task01.services.task6;

import by.epamtc.task01.model.Day;
import by.epamtc.task01.view.PrintResult;

public class Task6 {
    private final int oneSecond = 1;
    private final int oneMinute = oneSecond * 60;
    private final int oneHour = oneMinute * 60;

    public void time(int seconds){

        int hours = hour(seconds);
        int minutes = minute(seconds, hours);
        int second = second(seconds, minutes, hours);

        Day day = new Day(hours, minutes, second);

        PrintResult.printItemResult(day);

    }
    private int hour(int seconds){
        return seconds / oneHour;
    }

    private int minute(int seconds, int hours){
        return (seconds - (hours * oneHour))/oneMinute;
    }

    private int second(int seconds, int minutes, int hours){
        return (seconds - (hours * oneHour) - (minutes* oneMinute)) / oneSecond;
    }
}
