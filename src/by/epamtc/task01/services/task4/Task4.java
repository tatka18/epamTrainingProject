package by.epamtc.task01.services.task4;

import by.epamtc.task01.view.PrintResult;
import java.util.List;

public class Task4 {
    public void ifTrue(List<Integer> integerList){
        int evenNumbered = 0;

        for(int item: integerList){
           if (item % 2 == 0){
               evenNumbered = evenNumbered + 1;
           }
        }
        PrintResult.printBooleanResult(evenNumbered >= 2);
    }

}
