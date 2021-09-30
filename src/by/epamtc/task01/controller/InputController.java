package by.epamtc.task01.controller;

import by.epamtc.task01.model.CoordinatesAB;
import by.epamtc.task01.model.TangentFunction;
import by.epamtc.task01.model.YearCalendar;
import by.epamtc.task01.scaner.Scan;

import java.util.ArrayList;
import java.util.List;

public class InputController {

    public TangentFunction tangentFunction(){
        TangentFunction tangentFunction = new TangentFunction();
        System.out.println("Input a: ");
        tangentFunction.setA(input().doubleReadFromConsole());
        System.out.println("Input b: ");
        tangentFunction.setB(input().doubleReadFromConsole());
        System.out.println("Input h: ");
        tangentFunction.setH(input().doubleReadFromConsole());
        return tangentFunction;
    }

    public CoordinatesAB inputPointABCoordinates(){
        CoordinatesAB coordinatesAB = new CoordinatesAB();

        System.out.print("A:\nx1 > ");
        coordinatesAB.setX1(input().intReadFromConsole());
        System.out.print("y1 > ");
        coordinatesAB.setY1(input().intReadFromConsole());
        System.out.print("B:\nx2 > ");
        coordinatesAB.setX2(input().intReadFromConsole());
        System.out.print("y2 > ");
        coordinatesAB.setY2(input().intReadFromConsole());

        return coordinatesAB;
    }

    public int inputRadiusValue(){
        System.out.print("Input radius value:\n" +
                "> ");
        return input().intReadFromConsole();
    }
    public int inputSingleIntegerNumber(){
        System.out.print("Input number:\n" +
                "> ");

        return input().intReadFromConsole();
    }
    public double inputSingleDoubleNumber(){
        System.out.print("Input double number:\n" +
                "> ");

        return input().doubleReadFromConsole();
    }

    public YearCalendar inputYearMonth(){
        YearCalendar yearCalendar = new YearCalendar();
        System.out.print("YEAR > ");
        yearCalendar.setYear(input().intReadFromConsole());
        System.out.print("MONTH > ");
        yearCalendar.setMonth(input().intReadFromConsole());

        return yearCalendar;
    }

    public List<Integer> integerListInput(){
        char[] letter = new char[] {'A', 'B', 'C', 'D'};

        List<Integer> list = new ArrayList<>();
        for (char c : letter) {
            System.out.print(c + " > ");
            list.add(input().intReadFromConsole());
        }
        return list;
    }

    private Scan input(){
        return new Scan();
    }
}
