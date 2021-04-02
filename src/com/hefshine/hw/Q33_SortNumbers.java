//Write a program to sort numbers in a String. Display the result as a String.
package com.hefshine.hw;

import java.util.Arrays;

public class Q33_SortNumbers 
{

	public static void main(String[] args) 
	{
		String s="54321";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char t=c[i];
					c[i]=c[j];
					c[j]=t;
				}
			}
		}
		//System.out.println(Arrays.toString(c));
		//String s1=String.valueOf(c);
		String s1=new String(c);
		System.out.println(s1);
	}

}
