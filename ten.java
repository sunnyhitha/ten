/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		int b=s.length();
		int c=b/2;
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(i==c)
			{
				if(b%2==0)
				{
					a[i]='*';
					a[i-1]='*';
				}
				else if(b%2!=0)
				{
					a[i]='*';
				}
			}
		
			
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.print(a[i]);
		}// your code goes here
	}
}
