package Logical;

import java.util.Arrays;

public class MissingNumberinArray {

	public static void main(String[] args) {
		 
		int a[] = {1,2,5,3};
		Arrays.sort(a);
		int firstElement = a[0];
		int compare = firstElement;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==firstElement)
			{
				firstElement++;
				continue;
			}
			else
			{
				System.out.println(firstElement+"is a missing element");
				break;
			}
			
		}
		
		

	}

}
