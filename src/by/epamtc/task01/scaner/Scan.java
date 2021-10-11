package by.epamtc.task01.scaner;

import java.util.Scanner;

public class Scan {
    public int intReadFromConsole(){
        Scanner scanner = new Scanner(System.in);
       while (!scanner.hasNextInt()){
            String value = scanner.next();
            System.out.println("You've set wrong value: " + value + "\nTry again");
            scanner.hasNextInt();
        }
        return scanner.nextInt();
    }

    public double doubleReadFromConsole(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
            String value = scanner.next();
            System.out.println("You've set wrong value: " + value + "\nTry again");
            scanner.hasNextDouble();
        }
        return scanner.nextDouble();
    }
}