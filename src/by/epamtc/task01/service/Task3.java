package by.epamtc.task01.service;

public class Task3 {
    public double areaOfSquareCompare(double square){
        double diameterOfRound = Math.sqrt(square);
        double squareInside = areaOfSquareInside(diameterOfRound);

        return compareAreaOfSquare(square, squareInside);
    }

    public static double areaOfSquareInside(double diameterOfRound){
        return Math.pow(diameterOfRound, 2)/2;
    }

    public static double compareAreaOfSquare(double squareOutside, double squareInside){
        return squareInside / squareOutside;
    }
}
