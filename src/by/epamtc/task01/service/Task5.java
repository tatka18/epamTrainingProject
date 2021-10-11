package by.epamtc.task01.service;

public class Task5 {
    int sum;

    public boolean isPerfectNumber(int numberIn){
        int i = numberIn;

        while (i > 0){
            if(numberIn % i == 0){
                sum += i;
            }
            i--;
        }
        return (sum - numberIn) == numberIn;
    }
}
