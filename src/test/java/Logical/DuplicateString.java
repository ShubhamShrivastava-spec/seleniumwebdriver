package Logical;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateString {

	
	public static void findDuplicates(String arg)
	{
		char[] newValue =arg.toCharArray(); 
		Arrays.sort(newValue);
		System.out.println(newValue);
		int length = arg.length();
		
		
	    for(int i=0;i<length;i++)
	    {
	    	int counter=1;
	    	while(i<length-1&&newValue[i]==newValue[i+1]) //apple a==p aelppp
	    	{
	    		counter++;
	    		i++;
	    		
	    	}
	    	
	    
	    	System.out.println(newValue[i]+","+counter);
	    
	    }
	}
	
	
	

	public static void main(String[] args) {
		// find duplicate in string
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string");
		String value= sc.nextLine();
	    
		findDuplicates(value);
		

	}

}

