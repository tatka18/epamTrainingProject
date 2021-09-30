package by.epamtc.task01.run;

import by.epamtc.task01.controller.InputController;
import by.epamtc.task01.model.Round;
import by.epamtc.task01.scaner.Scan;
import by.epamtc.task01.services.task1.Task1;
import by.epamtc.task01.services.task10.Task10;
import by.epamtc.task01.services.task2.Task2;
import by.epamtc.task01.services.task3.Task3;
import by.epamtc.task01.services.task4.Task4;
import by.epamtc.task01.services.task5.Task5;
import by.epamtc.task01.services.task6.Task6;
import by.epamtc.task01.services.task7.Task7;
import by.epamtc.task01.services.task8.Task8;
import by.epamtc.task01.services.task9.Task9;

public class Run {
    public static void main(String[] args) {
        InputController inputController = new InputController();

        new Task1().guessNumber(inputController.inputSingleIntegerNumber());

        new Task2().years(inputController.inputYearMonth());

        new Task3().squareCompare(inputController.inputSingleDoubleNumber());

        new Task4().ifTrue(inputController.integerListInput());

        new Task5().getNumber(inputController.inputSingleIntegerNumber());

        new Task6().time(inputController.inputSingleIntegerNumber());

        new Task7().closerPoint(inputController.inputPointABCoordinates());

        new Task8().function(inputController.inputSingleDoubleNumber());

        new Task9().square(inputController.inputRadiusValue());

        new Task10().functionTg(inputController.tangentFunction());
    }
}
