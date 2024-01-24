//TASK 3

package com.codeway.tasks;

import java.util.Scanner;

public class ATMInterface {

	public static void main(String[] args) {
		int balance=20000,withdraw,deposite,num;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Welcome to Atm Machine");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("Enter amount to withdraw");
				withdraw=sc.nextInt();
				if(balance>=withdraw) {
				balance=balance-withdraw;
				System.out.println("Balance Amount is: "+balance);
				System.out.println("Collect your Cash");
				}
				else {
					System.out.println("Insufficient Balance");
				}
				System.out.println(" ");
				break;
				
			case 2:
				System.out.println("Enter amount to deposite");
				deposite=sc.nextInt();
				balance=balance +deposite;
				System.out.println("Your Account balance is: "+balance);
				System.out.println("Amount is deposited successfully");
				System.out.println(" ");
				break;
				
			case 3:
				System.out.println("Your Account Balance is: "+balance);
				System.out.println(" ");
				break;
			case 4:
				System.exit(0);
			System.out.println(" ");
			}
		
		
		}

		
		
		
		
		
	}

}
