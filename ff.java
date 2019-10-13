package Myworkspace;

public class ff {

	public static void main(String[] args)
	{
		String s="java program";
     	s=s.replaceAll(" ","");
		for(int i=0;i<s.length();i+=2)
		{
			
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		System.out.print(" ");
		for(int i=1;i<s.length();i+=2)
		{
			System.out.print(s.charAt(i)+" ");
		}
	}

}
