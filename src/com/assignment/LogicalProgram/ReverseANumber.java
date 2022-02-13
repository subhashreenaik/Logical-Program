package com.assignment.LogicalProgram;

public class ReverseANumber {

	public static int reverseNumber(int n) {
		int reverse = 0;
        while(n !=0) {
     	   int r=n%10;  
     	   reverse=reverse*10+r;
     	   n=n/10;
	}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    for(int i=1;i<=100;i++) {
			
			System.out.println(reverseNumber(i));
		}

	}

}

