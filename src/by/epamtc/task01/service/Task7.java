package by.epamtc.task01.service;

import by.epamtc.task01.model.PointCoordinate;

import java.util.List;

public class Task7 {
    public PointCoordinate closerPoint(List<PointCoordinate> points){
        double distance1 = calculateDistanceFromOriginOfCoordinates(points.get(0).getX(), points.get(0).getY());
        double distance2 = calculateDistanceFromOriginOfCoordinates(points.get(1).getX(), points.get(1).getY());

        if(distance1 < distance2){
            return points.get(0);
        }
        return points.get(1);
    }

    public static double calculateDistanceFromOriginOfCoordinates(double x, double y){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}
