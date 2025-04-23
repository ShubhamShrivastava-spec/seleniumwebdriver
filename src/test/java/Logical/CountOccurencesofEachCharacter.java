package Logical;

import java.util.Scanner;

public class CountOccurencesofEachCharacter {
	
	
	public static void CountOccurences(String strn)
	{
	    char[] str=strn.toCharArray();
		int length=strn.length();
		int j;
		for(int i=0;i<length;i++)
		{
			int count=1;
			for(j=i+1;j<length;j++)
			{
				if (str[i]==str[j])
				{
					count++;
					str[j]=0;
				}
			}
			if(str[i]!=0)
			{
				System.out.println(str[i]+" "+count);	
			}
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter string");
    String str= sc.nextLine();
		
    CountOccurences(str);
    
	}

}
