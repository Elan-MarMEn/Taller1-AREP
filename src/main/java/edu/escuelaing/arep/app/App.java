package edu.escuelaing.arep.app;

import edu.escuelaing.arep.app.linkedList.LinkedList;
import edu.escuelaing.arep.app.meanDevCalculator.Calculator;

public class App {

    public static void main(String[] args) {
        LinkedList set = new LinkedList();
        Calculator calculator = new Calculator();
        set.add(160);
        set.add(591);
        set.add(114);
        System.out.println(calculator.mean(set));
        System.out.println(calculator.standarDeviation(set));
    }
}
