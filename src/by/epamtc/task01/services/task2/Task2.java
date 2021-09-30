package by.epamtc.task01.services.task2;

import by.epamtc.task01.model.YearCalendar;
import by.epamtc.task01.view.PrintResult;

public class Task2 {
    public void years(YearCalendar yearCalendar){
        YearCalendar result = monthIterator(yearCalendar);
        PrintResult.printStringResult(result.toString());
    }

    private YearCalendar monthIterator(YearCalendar yearCalendar){

        switch (yearCalendar.getMonth()){
            case 2:
                checkIfLeap(yearCalendar);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                yearCalendar.setDays(30);
                break;
            default:
                yearCalendar.setDays(31);
        }
        return yearCalendar;
    }

    private void checkIfLeap(YearCalendar yearCalendar){
        if(yearCalendar.getYear() % 4 == 0){
            if((yearCalendar.getYear() % 100 != 0)
                    | ((yearCalendar.getYear() % 100 == 0) && (yearCalendar.getYear() % 400 == 0)))
                yearCalendar.setDays(29);
        }else yearCalendar.setDays(28);
    }
}
