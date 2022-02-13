package com.assignment.LogicalProgram;

public class StopWatchElapsed {
	 static void doSomething() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long StopWatchStart = System.nanoTime();
		doSomething();
		long StopWatchEnd = System.nanoTime();
		System.out.println("It took " + (StopWatchEnd - StopWatchStart));
	}

	
}
