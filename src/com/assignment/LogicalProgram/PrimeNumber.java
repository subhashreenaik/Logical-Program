package com.assignment.LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	      System.out.println("Enter a number :");
	      int num=  scan.nextInt();
	      int count=0;
	      for(int i=2;i<num;i++) {
	    	  if(num%i == 0) {
	    		  count++;
	    		  break;
	    	  }
	      }
	      if(count == 0) {
	    	  System.out.println("It is a prime number");
	      }
	      else {
	    	  System.out.println("it is not a prime number ");
	      }
	}

}
