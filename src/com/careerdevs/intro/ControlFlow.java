package com.careerdevs.intro;

public class ControlFlow {
    public static void main() {

        //Comparison Operators------------------------------------------------
        int x = 1;
        int y = 1;
//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x < y);
//        System.out.println(x > y);
//        System.out.println(x >= y);
//        System.out.println(x <= y);

        //Logical Operators -------------------------------------------------
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        //If Statements --------------------------------------------------------------
        int temp = 32;
        if (temp > 30) {
            System.out.println("Its a hot day");
            System.out.println("Drink water");
        } else if (temp > 20) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }

        //Simplifying If Statements -------------------------------------
        int income = 120_000;
        boolean hasHighIncome02 = (income > 100_000);

        //For Loops ------------------------------------------------------
        for (int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }
        for (int i = 5; i > 0; i--){
            System.out.println("Hello World");
        }
        //for (initalizer, condition, end of iteration)

        //For-Each Loop --------------------------------------------------
        String[] fruits = {"Apple", "Mango", "Orange"};

        //if you need the index you need to use for loop
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        //for each
        // for (array type variable name : name of array)
        for (String fruit : fruits)
            System.out.println(fruit);
    }


}

