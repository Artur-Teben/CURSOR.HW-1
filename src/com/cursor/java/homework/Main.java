package com.cursor.java.homework;
//Author: Artur Teben
//Date: June 20 2020
//E-mail: teben.artur99@gmail.com
public class Main{

    public static void main(String []args){

        byte byteValue1 = 33;
        byte byteValue2 = -34;
        byte byteResult;

        short shortValue = 10;
        int intValue = 30;
        long longValue = 9000;
        long longResult;


        float floatValue = 3.1F;
        double doubleValue = 17.4567843D;
        double doubleResult;

        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
        char symbol = '\251';

        doubleResult = doubleValue;
        doubleResult /= floatValue;
        byteResult = (byte) (byteValue1 + byteValue2);
        longResult = (longValue * shortValue) / intValue;

        System.out.println("The result of multiplication and division of integers: " + longResult);
        System.out.println("The result of adding numbers with the byte data type: " + byteResult);
        System.out.println("The result of dividing floating point numbers: " + doubleResult);
        System.out.println("The universe is a pretty big place. If it’s just us, seems like an awful waste of space.");
        System.out.println(symbol + " Carl Sagan");

        if (booleanValue1 != booleanValue2) {
            System.out.println("booleanValue1 and booleanValue2 have different values!");
        }
    }
}