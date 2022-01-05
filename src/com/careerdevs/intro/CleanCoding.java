package com.careerdevs.intro;

public class CleanCoding {
    public static void main() {
       String message = greetUser("Nick", "Kopel");
    }
    //Creating Methods
    public static String greetUser(String firstName, String lastName){
       return "Hello " + firstName + " " + lastName;
    }
}
