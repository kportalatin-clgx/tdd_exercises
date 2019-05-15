package com.corelogic.k8port.kata.stringcalculator;

public class StringCalculatorTest {
    public static void main(String[] args) {

        // test for no numbers
        System.out.println("No numbers test pass=" + NoNumbersTest());
        System.out.println("One number test pass=" + OneNumberTest());
    }

    public static boolean NoNumbersTest() {
        StringCalculator sc = new StringCalculator("");
        return (sc.getSum() == 0);
    }

    public static boolean OneNumberTest() {
        StringCalculator sc = new StringCalculator("1");
        return (sc.getSum() == 1);
    }
}
