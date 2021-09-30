package by.epamtc.task01.services.task10;

import by.epamtc.task01.model.TangentFunction;
import by.epamtc.task01.view.PrintResult;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public void functionTg(TangentFunction tangentFunction){

        double start = Math.min(tangentFunction.getA(), tangentFunction.getB());
        double end = Math.max(tangentFunction.getA(), tangentFunction.getB());

        List<Double> resultList = tangentCalculation(start, end, tangentFunction.getH());
        PrintResult.printDoubleListResult(resultList);
    }

    private List<Double> tangentCalculation(double start, double end, double step){
        List<Double> list = new ArrayList<>();
        while (start <= end){
            list.add(Math.tan(start));
            start += step;
        }
        return list;
    }
}