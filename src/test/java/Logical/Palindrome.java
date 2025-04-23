package Logical;

import java.util.Scanner;

public class Palindrome {
	public static void NewPalindrome(String input)
	{
		
		
		input=input.replace(" ", "");
		int length = input.length();
		
		String reverseString="";
		for(int j=length-1;j>=0;j--)
	
		{
			reverseString=reverseString +  input.charAt(j);
		
		}
		if(reverseString.toLowerCase().equals(input.toLowerCase()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}



	public static void main(String[] args) {
		
		System.out.println("enter string for palindrome");
		
		Scanner sc = new Scanner(System.in);
		String i=sc.nextLine();
		
		 NewPalindrome(i);
		
	}
}



















/*int length = input.length();
input = input.replace(" ", "");
String reverseString="";
for(int i=length-1;i>=0;i--)
{
	reverseString=reverseString +  input.charAt(i);
}
if(reverseString.toLowerCase().equals(input.toLowerCase()))
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not a palindrome");
}*/