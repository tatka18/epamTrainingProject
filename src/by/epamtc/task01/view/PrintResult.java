package by.epamtc.task01.view;

import java.util.List;

public class PrintResult {

    public static void printIntResult(int result){
        System.out.println("Result = " + result);
    }

    public static void printDoubleResult(double result){
        System.out.println("RESULT = " + result);
    }

    public static void printBooleanResult(boolean result){
        System.out.println(result);
    }

    public static void printStringResult(String result){
        System.out.println(result);
    }

    public static void printItemResult(Object result){
        System.out.println(result.toString());
    }

    public static void printDoubleListResult(List<Double> list){
        for (double number: list){
            System.out.println(number);
        }
    }
}
