//TASK 1
package com.codeway.tasks;

import java.util.*;

public class NumberGame {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        Random ran = new Random();

        int randomNum = ran.nextInt(max - min + 1) + min;

        System.out.println("Random number is: " + randomNum);
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly && attempts<=5) {
            System.out.println("The random number is generated. Please guess that number:");
            int userNum = sc.nextInt();
            
            if (userNum < 0 || userNum > 100) {
                System.out.println("Invalid number. Please enter a number between 0 and 100.");
            } else if (randomNum == userNum) {
                System.out.println("Congratulations!!! Your guessed number matches with the random number");
                guessedCorrectly = true;
            } else {
                System.out.println("Sorry, your number does not match with the random number. Try again.");
            }

            attempts++;
        }

        if (!guessedCorrectly) {
            System.out.println("You exceeded the attempts. The correct number was: " + randomNum);
        }
        else {
        	System.out.println("It took you " + attempts + " attempts to guess the correct number.");
        }
    }
}
