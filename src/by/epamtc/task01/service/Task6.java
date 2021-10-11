package by.epamtc.task01.service;

import by.epamtc.task01.model.Day;

public class Task6 {
    private static final int oneSecond = 1;
    private static final int oneMinute = oneSecond * 60;
    private static final int oneHour = oneMinute * 60;

    public Day countTimeByNumberOfSeconds(int numberOfSeconds){
        int hours = hour(numberOfSeconds);
        int minutes = minute(numberOfSeconds, hours);
        int seconds = second(numberOfSeconds, hours, minutes);

        return new Day(hours, minutes, seconds);
    }
    private int hour(int numberOfSeconds){
        return numberOfSeconds / oneHour;
    }

    private int minute(int numberOfSeconds, int hours){
        return (numberOfSeconds - (hours * oneHour))/oneMinute;
    }

    private int second(int numberOfSeconds, int hours, int minutes){
        return (numberOfSeconds - (hours * oneHour) - (minutes* oneMinute)) / oneSecond;
    }
}
