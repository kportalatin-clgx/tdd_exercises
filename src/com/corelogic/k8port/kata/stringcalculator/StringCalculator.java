package com.corelogic.k8port.kata.stringcalculator;

public class StringCalculator {

    private int sum;

    public StringCalculator(String arg) {
        this.sum = 0;
        if (!arg.equals("")) {
            sum = Integer.parseInt(arg);
        }
    }

    public int getSum() {
        return this.sum;
    }
}
