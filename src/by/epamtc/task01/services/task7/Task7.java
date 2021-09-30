package by.epamtc.task01.services.task7;

import by.epamtc.task01.model.CoordinatesAB;
import by.epamtc.task01.view.PrintResult;

public class Task7 {
    public void closerPoint(CoordinatesAB coordinatesAB){
        double distance1 = distance(coordinatesAB.getX1(), coordinatesAB.getY1());
        double distance2 = distance(coordinatesAB.getX2(), coordinatesAB.getY2());

        if(distance1 < distance2){
            PrintResult.printStringResult("A");
        }else PrintResult.printStringResult("B");
    }

    private double distance(double x, double y){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}
