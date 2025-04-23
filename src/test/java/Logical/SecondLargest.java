package Logical;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
	public static void findSecondLargest(String Numbers)
	{
		
		String[] NewArray = Numbers.split(",");
		int length =  NewArray.length;
		int[] LargestElementArray=new int[length];
		for(int i=0; i<length;i++)
		{
			LargestElementArray[i] = Integer.parseInt(NewArray[i]);
		}
		int LargestElement=LargestElementArray[0];
		for(int i=0;i<LargestElementArray.length;i++)
		{
			if(LargestElementArray[i]>LargestElement)
			{
				LargestElement = LargestElementArray[i];
			}
		}
		System.out.println(LargestElement);
		int LargestElementTwo=LargestElementArray[0];
		for(int i=0;i<LargestElementArray.length;i++)
		{
			if(LargestElementTwo<LargestElementArray[i] && LargestElementArray[i] !=LargestElement)
			{
				LargestElementTwo=LargestElementArray[i];
			}
		}
		System.out.println(LargestElementTwo);
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no separated by ,");
		String Numbers= sc.nextLine();
		findSecondLargest(Numbers);
	}

}
