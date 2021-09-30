package by.epamtc.task01.services.task9;

import by.epamtc.task01.model.Round;
import by.epamtc.task01.view.PrintResult;

public class Task9 {
    public void square(double radius){
        Round round = new Round(radius);
        squareRound(round);
        circumference(round);

        PrintResult.printItemResult(round);
    }
    public void squareRound(Round round){
        round.setCircumference(2 * Math.PI * Math.pow(round.getRadius(), 2));
    }

    public void circumference(Round round){
        round.setSquare(2 * Math.PI * round.getRadius());
    }

}
