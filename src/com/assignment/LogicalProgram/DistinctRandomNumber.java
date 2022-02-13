package com.assignment.LogicalProgram;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DistinctRandomNumber {
 static void randomValue(int num) {
	 Random random = new Random();
	    ArrayList<Integer> arrayList = new ArrayList<Integer>();

	    while (arrayList.size() < num) { 
	        int a = random.nextInt(49)+1; 

	        if (!arrayList.contains(a)) {
	            arrayList.add(a);
	        }
	    }
	    System.out.println(arrayList);
 }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	      System.out.println("Enter  number of distinct coupon :");
	      int num=  scan.nextInt();
	      randomValue(num);
	      
		
	}
}


