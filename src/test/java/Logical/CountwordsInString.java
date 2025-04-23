package Logical;

public class CountwordsInString {

	public static void main(String[] args) {
		
		
		String s ="You are welcome";
		
		
			String[] r = s.split(" ");
			
			for(int i=0; i<r.length; i++)
			{
				System.out.println(r[i]);
			}
			
			System.out.println(r.length);

}
}
