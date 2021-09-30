package by.epamtc.task01.services.task1;

import by.epamtc.task01.view.PrintResult;

public class Task1 {
    public void guessNumber(int number){

        int lastNumber = getLastNumber(number);
        int pow = squareOfNumber(lastNumber);

        PrintResult.printIntResult(getLastNumber(pow));
    }

    private int squareOfNumber(int num){
        return (int)Math.pow(num, 2);
    }

    private int getLastNumber(int number){
        return number % 10;
    }
}
