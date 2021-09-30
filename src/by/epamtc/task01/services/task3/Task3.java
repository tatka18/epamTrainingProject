package by.epamtc.task01.services.task3;

import by.epamtc.task01.view.PrintResult;

public class Task3 {
    public void squareCompare(double square){
        double diagonalRound = Math.sqrt(square);
        double squareInside = squareInside(diagonalRound);

        PrintResult.printDoubleResult(squareCompare(square, squareInside));
    }

    private double squareInside(double diagonal){
        return Math.pow(diagonal, 2)/2;
    }

    private double squareCompare(double square, double squareInside){
        return squareInside / square;
    }
}
