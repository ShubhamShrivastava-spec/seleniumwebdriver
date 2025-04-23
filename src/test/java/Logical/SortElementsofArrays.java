package Logical;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortElementsofArrays {

	public static void main(String[] args) {
		int[] a= {10,200,30,5,8};
		
		int largetnumber=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					largetnumber=a[i];
					a[i]=a[j];
					a[j]=largetnumber;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
