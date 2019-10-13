package Myworkspace;

public class Palind {
int n=1;
void a(String name)
{
	//String name="String";
	if(name.length()>=n)
	{
		System.out.println(name.charAt(name.length()-n));
		n++;
		a(name);
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mdm";
		int k=0;
		boolean f=false;
		for (int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=s.charAt(k))
			{
				
				f=true;
				break;
			
			}
			
			k++;
		}
if(!f)
	System.out.println("palindrom");


	Palind p=new Palind();
	p.a("Hit" );



	}


}
