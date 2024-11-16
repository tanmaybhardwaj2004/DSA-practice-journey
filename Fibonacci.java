package Fibonacci;
//O(2^n) exponential 
import java.util.Scanner;

public class Fibonacci {
	public int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Fibonacci obj=new Fibonacci();
		System.out.println(obj.fib(n));
		sc.close();
	}

}
