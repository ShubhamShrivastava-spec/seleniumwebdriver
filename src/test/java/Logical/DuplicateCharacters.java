package Logical;

import java.util.Arrays;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str= "qweerrkryu";
		int n=str.length();
		//System.out.println(n);
		
		char[] newarr =str.toCharArray();//eekqrrruwy
				Arrays.sort(newarr);
		for(int i=0;i<n-1;i++)
		{
			while(newarr[i]==newarr[i+1])
			{
				System.out.println(newarr[i+1]);
				System.out.println(newarr[i]);
				
				i++;
			}
			
				
		//System.out.println(i);
			
		}
	}

}
