package com.careerdevs.intro;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class DataTypes {

    public static void main() {
        //Variables----------------------------------------------------------
        //type int //name age //assignment operator = //value 30;
        //possible but not common
        //int age = 20, year = 2001;
        //camel case notation/can set variable to value of other variable
        int myAge = 30;
        int herAge = myAge;

        //Primitive Types--------------------------------------------------
        //for storing simple values
        byte b = 1;
        short s = 3000;
        int i = 40000;
        long l = 30000000L;
        float f = 3.4f;
        double d = 3.5;
        char c = 'A';

        long viewsCount = 3_123_456_789L;
        float price = 10.99f;
        char letter = 'A';
        boolean isEligible = false;

        //Reference Types--------------------------------------------------
        //complex objects
        byte age = 30;
        Date now = new Date();
        System.out.println(now);

        //Primitive vs Reference Types-------------------------------------
        byte x = 1;
        byte y = x;
        x = 2;

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        //memory holds primitive data but address for reference type.
        //primitive update will not affect other
        //reference update will affect other since they are both referencing the same place in memory

        //Strings -------------------------------------------------------
        String message01 = new String("Hello World");
        String message = "Hello World";
        String message02 = "Hello World" + "!!";
//        System.out.println( message02.endsWith("!!"));
//        System.out.println(message.startsWith("H"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("H"));
//        System.out.println(message02.replace("!", "*"));
//        System.out.println(message02);
//        System.out.println(message);
//        System.out.println(message.toLowerCase());
//        System.out.println(message.trim());

        //Arrays ------------------------------------------------------------
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        //if not specified, int defaults to 0, string defaults to "" and boolean defaults to false

        int[] numbers02 = {2,3,5,1,4};
        Arrays.sort(numbers02);
        System.out.println(Arrays.toString(numbers02));

        // Multi-dimensional Arrays ------------------------------------------------------------------------------
        int[][] numbers03 = new int[2][3];
        //2 rows and 3 columbs
        numbers03[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers03));

        int[][] numbers04 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers04));

        //Arithmetic Expressions------------------------------------------------------------------









    }



}
