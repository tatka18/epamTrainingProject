package by.epamtc.task01.services.task8;

import by.epamtc.task01.view.PrintResult;

public class Task8 {

    public void function(double x){
        double functionResult;

        if (x >= 3) {
            functionResult = Math.pow(-x, 2) + 3 * x + 9;
        } else {
            functionResult = 1 / (Math.pow(x, 3) - 6);
        }
        PrintResult.printDoubleResult(functionResult);
    }
}
