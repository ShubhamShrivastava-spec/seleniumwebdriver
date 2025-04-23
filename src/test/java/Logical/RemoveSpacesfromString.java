package Logical;

public class RemoveSpacesfromString {

	public static void main(String[] args) {
		String s = "We lc om e";
		String r="";
		//s=s.replace(" ", "");
		//System.out.println(s);
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' )
					{
				      r=r+s.charAt(i);
					}
			else
			{
				continue;
			}
		}
			System.out.println(r);
	}

}
