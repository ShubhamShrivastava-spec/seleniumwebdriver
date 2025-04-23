package Logical;

import java.util.Scanner;

public class LargerstNumber {
	public static void main(String args[]){
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int i = sc.nextInt();
		int[] arr = new int[i];
		int k=0;
		for (k=0;k<i;k++)
		{
			System.out.println("enter digit of array");
			arr[k]= sc.nextInt();
			
		}
		// display array on terminal
		System.out.println("Your array is");
		
		for (k=0;k<i;k++)
		{
			
			System.out.println(arr[k]);
		}
		
		//find largest number in given array
		
		int arrSecond= arr[0];
		 for(k=0;k<i;k++)
		 {
			 if(arrSecond<arr[k])
			 {
				 arrSecond=arr[k];
			 }
			 
		 }
		 System.out.println("Largest element is "+arrSecond);
	}

}
