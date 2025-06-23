package com.ass1;

import java.util.Scanner;

public class checkmethod2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter two number");
		if(sc.hasNextDouble() && (!sc.hasNextInt())) {
			double num1=sc.nextDouble();
		
		 if(sc.hasNextDouble() && (!sc.hasNextInt())) {
			 double num2=sc.nextDouble();
		  
		 double avg=(num1+num2)/2;
			 System.out.println("Average is "+(avg));	
			 
		 }
		 else {
			 System.out.println("second number is not double");
		 }
		 }
		else {
			System.out.println("number is not double");
		
		
		
	}
}

}



