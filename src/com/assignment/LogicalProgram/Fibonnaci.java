package com.assignment.LogicalProgram;

public class Fibonnaci {

	static int fib(int n)
    {
        int f[] = new int[n + 2];
        int i;
        f[0] = 0;
        f[1] = 1;
  
        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
  
        
        return f[n];
    }
  
    public static void
    main(String args[])
    {
        int N = 10;
  
        // Print first 10 term
        for (int i = 0; i < N; i++)
            System.out.print(fib(i) + " ");
    }
}
