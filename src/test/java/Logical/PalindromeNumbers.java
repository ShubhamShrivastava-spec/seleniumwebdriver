package Logical;

import java.util.Scanner;

public class PalindromeNumbers {
	
	public static void Palindrome(int n)
	{
		int num=n;
		int reversenumber=0;
		while(num>0) 
		{
		
		reversenumber =reversenumber*10+ num%10;
		
		num=num/10;
				
				
		}
		if(reversenumber==n)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
			Scanner sc = new Scanner(System.in);
			int num=sc.nextInt();
			Palindrome(num);
	}

}
