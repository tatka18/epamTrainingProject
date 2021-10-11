package by.epamtc.task01.view;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

    public static void printItemResult(Object result){
        System.out.println(result.toString());
    }

    public static void printMapResult(Map<Double, Double> mapResult){
        Set<Double> keySet = mapResult.keySet();
        for (Double key: keySet){
            System.out.println(key + "   " +  mapResult.get(key));
        }
    }
    public static void printDoubleListResult(List<Double> list){
        for (double number: list){
            System.out.println(number);
        }
    }
}
