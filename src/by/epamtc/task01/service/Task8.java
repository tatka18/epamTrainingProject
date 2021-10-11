package by.epamtc.task01.service;

public class Task8 {
    public double valueOfFunction(double x){
        double functionResult;

        if (x >= 3) {
            functionResult = expressionOfFunction1(x);
        } else {
            functionResult = expressionOfFunction2(x);
        }
        return functionResult;
    }

    public static double expressionOfFunction1(double x){
        return Math.pow(-x, 2) + 3 * x + 9;
    }
    public static double expressionOfFunction2(double x){
        return 1 / (Math.pow(x, 3) - 6);
    }

}
