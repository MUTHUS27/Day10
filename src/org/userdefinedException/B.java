package org.userdefinedException;

import java.util.Scanner;

public class B
{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("Please Enter the Number 1");
		 byte no1= s.nextByte();
		 System.out.println("Please Enter the Number 2");
		 byte no2 = s.nextByte();
		 
		 try {
			 System.out.println(no1/no2);
		} catch (Exception e) {
			System.out.println("Dont divide by zero");
		} 
		 
		 }
	
		
		
		
	}


