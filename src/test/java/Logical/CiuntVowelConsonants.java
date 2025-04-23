package Logical;

import java.util.Scanner;

public class CiuntVowelConsonants {

	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);//Scanner sc=new Scanner(System.in);
		System.out.println("Enter word");
		String input=sc.nextLine(); //String input=sc.nextLine();
		
		
		
		
		
		
		int length =input.length();
		
		int vowel=0, consonant=0, numberOrSpace=0;
		
		
		for(int i=0;i<length;i++)
		{
			char ch=input.charAt(i);
			if (ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowel++;
				
			}
			else if((ch>='a' && ch<='z'))
			{
				consonant++;
			}
			else
			{
				numberOrSpace++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonant);
		System.out.println(numberOrSpace);
		

	}

}
