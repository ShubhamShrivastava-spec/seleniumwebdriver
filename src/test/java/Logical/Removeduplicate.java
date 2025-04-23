package Logical;

public class Removeduplicate {

	public static void main(String[] args) {
		  String str= "selenium";
		  
		  String newStr="";
		  
		  int length=str.length();
		  int j;
		  
		  for(int i=0;i<length;i++)//selenium
		  {
			  
			  for( j=0;j<i;j++)
			  {
			  if(str.charAt(i)==str.charAt(j))//se
			  {
				  break;
			  }
			  
			  }
			  if(j==i)
			  {
				  newStr= newStr+str.charAt(i);
			  }
			  
		  }
		  System.out.println(newStr);
	}

}
