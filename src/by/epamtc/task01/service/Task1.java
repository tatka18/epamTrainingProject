package by.epamtc.task01.service;

public class Task1 {
    public int squaredLastNumber(int number){

        int reminderOfDivision = reminderOfDivisionByTen(number);
        int squaredNumber = squaredNumber(reminderOfDivision);

        return reminderOfDivisionByTen(squaredNumber);
    }

    public static int squaredNumber(int num){
        return (int)Math.pow(num, 2);
    }

    public static int reminderOfDivisionByTen(int number){
        return number % 10;
    }
}
