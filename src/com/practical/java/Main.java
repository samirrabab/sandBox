package com.practical.java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Initialising ...");

        byte myByte = 127;

        short myShort = 32_111;

        int myInt = 2_111_222_333;

        // unsigned int 4_111_222_333;

        long myLong = 9_111_222_333_444_555_666L;

        float myFloat = 3.1f;

        double myDouble = 6.2;

        BigDecimal number = new BigDecimal("9.4");

        printNumber(1);
        printNumber(1f);
        printNumber(1.0);

        // type casting
        // type calculate
        // decimals visuals

        // char
        // bool
        // String

        // check udmey

        // flow func and loops

        // OO ...

    }

    private static void printNumber(int number) {
        System.out.println("Int is : " + number);
    }

    private static void printNumber(float number) {
        System.out.println("float is : " + number);
    }

    private static void printNumber(double number) {
        System.out.println("double is : " + number);
    }

}
