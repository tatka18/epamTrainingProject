package by.epamtc.task01.service;

import java.util.List;

public class Task4 {
    int evenNumbered;

    public boolean ifTwoOrMoreEvenNumber(List<Integer> integerList){
        for(int item: integerList){
           if (item % 2 == 0){
               evenNumbered = evenNumbered + 1;
           }
        }
        return evenNumbered >= 2;
    }
}
