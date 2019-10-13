package Myworkspace;

import java.util.*;

public class forincd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		char c[]=s.toCharArray();
		LinkedHashSet<Character> cc=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			cc.add(c[i]);
			
		}
	StringBuffer b=new StringBuffer();
	for(Character m: cc)
	{
		System.out.println(b.append(m));
	}
		
s=b.toString();

}
	}


