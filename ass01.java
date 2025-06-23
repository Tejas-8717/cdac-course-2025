package com.ass1;
import java.util.Scanner;

public class ass01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numter");
		int number=sc.nextInt();
		
		System.out.println("given number is"+number);
		System.out.println("Binary equivalent"+Integer.toBinaryString(number));
		System.out.println("Octal equivalent :"+Integer.toOctalString(number));
		System.out.println("Hexadecimal equivalent :"+Integer.toHexString(number));
	}

}
