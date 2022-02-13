package com.assignment.LogicalProgram;

import java.util.Scanner;

public class PerfectNumber {
static void perfectNumber(int num) {
	 int sum=0;
     for(int i=1;i<num;i++) {
   	  if(num%i == 0) {
   		  sum +=i;  
   	  }
   	  
     }
     if(sum == num)
           System.out.println("It is a perfect number");
     else
   	  System.out.println("It isnot a perfect number");  
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	      System.out.println("Enter a number :");
	      int num=  scan.nextInt();
	    perfectNumber(num); 
	}
}
