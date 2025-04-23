package Logical;

import java.util.Scanner;

public class Fibonnaci {
	
	
	public static void Fibonacci(int  count)
	{
		int f1=0;
		int f2=1;
		System.out.println(f1+" "+f2);
		int f3;
		for(int i=2;i<count;i++)
		{
			f3=f1+f2;//1 1
			System.out.print(" "+f3);//2
			f1=f2;
			f2=f3;//2
			//1
			//System.out.println("f1 is "+f1);
		//	System.out.println("f2 is "+f2);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter length of series");
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		Fibonacci(i);

	}

}
