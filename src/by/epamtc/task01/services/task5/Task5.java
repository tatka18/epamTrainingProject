package by.epamtc.task01.services.task5;

import by.epamtc.task01.view.PrintResult;

public class Task5 {
    public void getNumber(int numberIn){
        int i = numberIn;
        int sum = 0;

        while (i > 0){
            if(numberIn % i == 0){
                sum += i;
            }
            i--;
        }
        PrintResult.printBooleanResult((sum - numberIn) == numberIn);
    }
}
