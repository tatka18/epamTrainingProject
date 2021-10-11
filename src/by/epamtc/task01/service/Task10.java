package by.epamtc.task01.service;

import by.epamtc.task01.model.TangentFunction;

import java.util.*;

public class Task10 {
    public LinkedHashMap<Double, Double> functionTg(TangentFunction tangentFunction){

        LinkedHashMap<Double, Double> tangentMap = new LinkedHashMap<>();

        double start = Math.min(tangentFunction.getA(), tangentFunction.getB());
        double end = Math.max(tangentFunction.getA(), tangentFunction.getB());

        while (start <= end){
            tangentMap.put(start, tangentCalculation(start));
            start += tangentFunction.getH();
        }
       return tangentMap;
    }

    public static double tangentCalculation(double value){
        return Math.tan(value);
    }
}