package com.practical.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        System.out.println("Initialising ...");

        byte myByte = 127;

        short myShort = 32_111;

        int myInt = 2_111_222_333;

        // unsigned int 4_111_222_333;

        long myLong = 9_111_222_333_444_555_66L;

        float myFloat = 3.1f;

        double myDouble = 6.2;

        BigDecimal bigDecimal = new BigDecimal("9.4");

        printNumber(1);
        printNumber(1f);
        printNumber(1.0);

        byte b = 8;
        short s = 16;
        int i = 32;
        long l = 64;

        byte testb = (byte) s;
        short tests = (short) i;
        int testi = (int) l;
        long testl = i;

        byte bcal = (byte) (b+1);
        short scal = (short) (s+1);
        int ical = (int) (s+l);
        long lcal = l+1;

        float num1 = 2.7f;
        float num2 = 33.879f;
        float num3 = num1 / num2;
        System.out.println("num3 is : " + num3);

        double num01 = 2.7;
        double num02 = 33.879;
        double num03 = num01 / num02;
        System.out.println("num03 is : " + num03);

        BigDecimal number1 = new BigDecimal("2.7");
        BigDecimal number2 = new BigDecimal("33.879");
        BigDecimal number3 =  number1.divide(number2, 32, RoundingMode.CEILING);
        System.out.println("number 3  is : " + number3);

        boolean myBool = false;
        char myChar = 'a';
        String myString = "abc";

        // flow func and loops
        // Integer.parse
        // OO

        // KEYCHAIN
        // SHH KEYS

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
