//TASK 2
package com.codeway.tasks;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subjects out of 100");
	
		System.out.println("English:");
	int eng=sc.nextInt();
	System.out.println("Hindi");
	int hin=sc.nextInt();
	System.out.println("Maths");
	int maths=sc.nextInt();
	System.out.println("Science");
	int sci=sc.nextInt();
	
	int sum=eng+hin+maths+sci;
	System.out.println("Total marks obtained is: "+sum);

	float avg=sum/4f;
	System.out.println("Avg percentage is: "+avg);
	
	 if (avg >= 35 && avg < 60) {
         System.out.println("Your grade is: E");
     } else if (avg >= 60 && avg < 70) {
         System.out.println("Your grade is: D");
     } else if (avg >= 70 && avg < 80) {
         System.out.println("Your grade is: C");
     } else if (avg >= 80 && avg < 90) {
         System.out.println("Your grade is: B");
     } else if (avg >= 90 && avg <= 100) {
         System.out.println("Your grade is: A");
     } else {
         System.out.println("Invalid average percentage");
     }
	
	
	
	
	}
}
