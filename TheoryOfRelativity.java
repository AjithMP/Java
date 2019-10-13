package Ajith;

public class TheoryOfRelativity {

			public static void main(String[] args)
	{
	
int n=5;
int sum=1;
int sum1=n;

for(int i=1;i<=n;i++)
{
	for(int k=n;k>i;k--)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
		if(sum>1)
		{
			System.out.print( " ");
		}
		sum++;
	}
	System.out.println( );
}
for(int i=1;i<=n;i++)
{
	for(int k=1;k<=i;k++)
	{
		System.out.print(" ");
	}
	for(int j=n;j>i;j--)
	{
		System.out.print("*");
		if(sum>1)
		{
			System.out.print(" ");
		}
		sum--;
	}
	System.out.println( );
}
	
}
}