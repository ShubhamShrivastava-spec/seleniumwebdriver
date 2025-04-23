package Logical;

public class RemoveJunkOrSpecialCharFromString {

	public static void main(String[] args) {
		
		String s ="S%$grg%$";
		String b="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z'||(s.charAt(i)>='A'&& s.charAt(i)<='Z' ))
			{
				b=b+s.charAt(i);
			}
			else
			{
				continue;
			}
		}
		System.out.println(b);

	}

}
