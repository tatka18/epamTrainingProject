package by.epamtc.task01.run;

import by.epamtc.task01.controller.InputController;
import by.epamtc.task01.model.Day;
import by.epamtc.task01.model.PointCoordinate;
import by.epamtc.task01.model.Round;
import by.epamtc.task01.model.YearCalendar;
import by.epamtc.task01.service.Task1;
import by.epamtc.task01.service.Task10;
import by.epamtc.task01.service.Task2;
import by.epamtc.task01.service.Task3;
import by.epamtc.task01.service.Task4;
import by.epamtc.task01.service.Task5;
import by.epamtc.task01.service.Task6;
import by.epamtc.task01.service.Task7;
import by.epamtc.task01.service.Task8;
import by.epamtc.task01.service.Task9;
import by.epamtc.task01.view.PrintResult;

import java.util.LinkedHashMap;

public class Run {
    public static void main(String[] args) {
        final InputController inputController = new InputController();

        int lastNumber = new Task1().squaredLastNumber(inputController.inputSingleIntegerNumber());
        PrintResult.printIntResult(lastNumber);

        YearCalendar yearCalendar = new Task2().numberOfDaysInMonthByYear(inputController.inputYearMonth());
        PrintResult.printItemResult(yearCalendar);

        double squareCompare = new Task3().areaOfSquareCompare(inputController.inputSingleDoubleNumber());
        PrintResult.printDoubleResult(squareCompare);

        boolean ifTrue = new Task4().ifTwoOrMoreEvenNumber(inputController.integerListInput());
        PrintResult.printBooleanResult(ifTrue);

        boolean getNumber = new Task5().isPerfectNumber(inputController.inputSingleIntegerNumber());
        PrintResult.printBooleanResult(getNumber);

        Day day = new Task6().countTimeByNumberOfSeconds(inputController.inputSingleIntegerNumber());
        PrintResult.printItemResult(day);

        PointCoordinate pointCoordinate = new Task7().closerPoint(inputController.inputPointCoordinate(2));
        PrintResult.printItemResult(pointCoordinate);

        double function = new Task8().valueOfFunction(inputController.inputSingleDoubleNumber());
        PrintResult.printDoubleResult(function);

        Round round = new Task9().square(inputController.inputRadiusValue());
        PrintResult.printItemResult(round);

        LinkedHashMap<Double, Double> resultMap = new Task10().functionTg(inputController.tangentFunction());
        PrintResult.printMapResult(resultMap);
    }
}
