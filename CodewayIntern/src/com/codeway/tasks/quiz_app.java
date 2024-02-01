package com.codeway.tasks;


import java.util.Scanner;

public class tp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] answers = {"b", "a", "d"};
        String[] responses = {"", "", ""};

        // Define the time limit for each question in milliseconds
        final long TIME_LIMIT = 15000; // 15 seconds

        int score = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Question " + (i + 1) + ": " + getQuestion(i));
            displayOptions(i);

            // Record the start time
            long startTime = System.currentTimeMillis();

            System.out.println("Your answer: ");
            responses[i] = scan.next();

            // Calculate the time taken
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;

            // Check if the answer is correct and within the time limit
            if (responses[i].equalsIgnoreCase(answers[i]) && timeTaken <= TIME_LIMIT) {
                score++;
                System.out.println("Correct! Time taken: " + timeTaken + " milliseconds");
            } else {
                System.out.println("Incorrect or time exceeded! Time taken: " + timeTaken + " milliseconds");
            }
        }

        System.out.println("Score: " + score + "/3");
    }

    private static String getQuestion(int index) {
        String[] questions = {
                "What is the capital of India?",
                "Which planet is known as the Red Planet?",
                "Which animal is known as the 'King of the Jungle'?"
        };
        return questions[index];
    }

    private static void displayOptions(int index) {
        String[][] options = {
                {"Mumbai", "New Delhi", "Kerala", "Patna"},
                {"Mars", "Jupiter", "Earth", "Sun"},
                {"Zebra", "Tiger", "Crocodile", "Lion"}
        };

        char optionChar = 'a';
        for (String option : options[index]) {
            System.out.println(optionChar + ") " + option);
            optionChar++;
        }
    }
}
