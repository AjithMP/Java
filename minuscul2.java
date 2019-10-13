package Myworkspace;

public class minuscul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s="13.04.258";
		String s1="13.4.158";
		int a[]=new int[3];
		String tmp=" ";
		Integer b=0;
		int count=0;
	 for(int i=0;i<s.length();i++)
		{
			
			if(Character.isDigit(s.charAt(i))&&(i<s.length()))
					{
			System.out.println(tmp=tmp+s.substring(i,i+1));	
					}
		
		}
		
		
	}

}
