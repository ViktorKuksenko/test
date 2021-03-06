package com.softserve.edu;

import com.softserve.edu.service.Console;
import com.softserve.edu.service.FirstTask;
import com.softserve.edu.service.SecondTask;

public class Application {
    public static void main(String[] args) {
    Console console = new Console();
    FirstTask firstTask = new FirstTask();
    SecondTask secondTask = new SecondTask();
    try{
        while(true) {
            printMenu();
            int input = console.read();
            if (input == 1) {
                console.write(firstTask.calcMaxNum(console.read()));
            } else if (input == 2) {
                console.write(secondTask.calculationOnePairXAndYWhichSatisfiesTheCondition(console.read()));
            } else if (input == 3) {
                console.write(secondTask.calculationAllPairsXAndYWhichSatisfiesTheCondition(console.read()));
            } else if (input == 4) {
                console.close();
                break;
            }
        }
    } catch (Exception ex) {
        System.out.println("Exception: ");
        ex.printStackTrace();
      }
    }
    public static void printMenu() {
        System.out.println("=====================================Menu======================================\n" +
                "1. Enter m(number, m > 1) to get the largest k which satisfies the condition 4^k < m.\n" +
                "2. Enter a number to calculate pair x,y which satisfies the condition n = x^2 + y^2\n" +
                "3. Enter a number to calculate all pairs x,y which satisfies the condition n = x^2 + y^2, x >= y\n" +
                "4. Exit\n");
    }
}
