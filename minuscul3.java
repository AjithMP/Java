package Myworkspace;

public class minuscul3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print( " ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				if(sum>1)
				{
					System.out.print(" ");
					
				}
				sum++;
			}
			System.out.println();
			System.out.println();
			
		}

	}

}
