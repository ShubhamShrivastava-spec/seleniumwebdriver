package Logical;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseString {

	public static void ReverseString(String str) {
		
		String ReverseString ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			ReverseString=ReverseString+str.charAt(i);
		}
		System.out.println(ReverseString);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String input=sc.nextLine();
		
		ReverseString(input);

	}

}
