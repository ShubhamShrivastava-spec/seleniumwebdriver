package Logical;

public class PrimeOddEvenSum {

	public static void main(String[] args) {
		  
		
		 int a[]= new int[5];
		 a[0]=5;
		 a[1]=10;
		 a[2]=15;
		 a[3]=20;
		 a[4]=30;
		 
		 
		 for(int n: a)
		 {
		if (n%2==0)
		{
			System.out.println("even");
		}
		else
			
		{
			System.out.println("odd");
		}
		 }
		 
		 int sum=0;
		 for(int n: a)
		 {
			 sum=sum+n;
		 }
		 	System.out.println(sum);
		 	
		 	 for(int n: a)
			 {
				 		if (n==0 ||n==1)
				 		{
				 			System.out.println("Not a prime number");
				 		}
				 		int i;
				 		
				 	for(i=2;i<=n/2;i++)
				 	{
				 		
				 		if(n%i==0)
				 		{
				 			//System.out.println(n%i);
				 			System.out.println("Not a Prime number");
				 			break;
				 		}
				 		
					 }
				 	if(i==n/2+1)
			 		{
				 		System.out.println(" Prime number");
			 		}
			 }

}
}
