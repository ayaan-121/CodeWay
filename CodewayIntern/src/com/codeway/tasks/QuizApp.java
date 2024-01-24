//TASK 4
package com.codeway.tasks;

import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String[] answer= {"b","a","d"};
		String[] responses= {"","",""};
		
System.out.println("1. What is the capital of India?");
System.out.println("a)Mumbai");
System.out.println("b)New Delhi");
System.out.println("c)Kerala");
System.out.println("d)Patna");

System.out.println("2. Which planet is known as the Red Planet? ");
System.out.println("a)Mars");
System.out.println("b)Jupitor");
System.out.println("c)Earth");
System.out.println("d)Sun");

System.out.println("3. Which animal is known as the ‘King of the Jungle’?");
System.out.println("a)Zebra");
System.out.println("b)Tiger");
System.out.println("c)Crocodile");
System.out.println("d)Lion");

responses[0]=scan.next();
responses[1]=scan.next();
responses[2]=scan.next();


int score=0;

for(int i=0; i<3;i++) {
	if(responses[i].equalsIgnoreCase(answer[i])) {
		score++;
	}
	
}

System.out.println("Score: "+score+"/3");





	}

}















