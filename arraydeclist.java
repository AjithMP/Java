package Myworkspace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraydeclist {
	int a[]=new int[2];
	  void a()
	{
	a[1]=3;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
int a[];//valid
int b[]={};//valid


int c[]={1,2,3};//valid
c=new int[4];
c=new int[5];//valid reassign array
int[] d[];//valid
int[] [] d1;
int[] e;//valid
int[] f1,f2;//valid
int g1[],g2[];//valid
int[] []m1,m2[];
int[] m4,m3[];
int[][] e1;
int[] h1[],h2[];//valild
int[] j[]=new int[5][];//valid
int[] j1[]= new int[5][6];//valid
int i[]=new int[] {1,2,3};//valid
int[] s= new int[2];//valid
s=new int[4];//valid reassign
int[] x[]={{1,2,3},{2,3,3}};//valid
InputStreamReader r=new InputStreamReader(System.in);    
    
BufferedReader bf=new BufferedReader(r);
System.out.println("Enter the number");
int a1=bf.read();
/* A[4];//invalid
int[4] B; //invalid
int [4] C[5];//invalid
int A1[]=new int[];//invalid
int p[],[] p1;//invalid
int[] q1,[]q2;//invalid
[]int aw;//invalid
[]int []t;//invalid
int v[];
v[]={1,23}//invalid intialization*/
	}
}
