//Write a program to print after removing duplicates from a given string.
package com.hefshine.hw;
import java.util.*;

public class Q20_RemovingDuplicates 
{
	
	public static void main(String[] args) 
	{
		String s1="sagar maruti gaikawd";
		char []a=s1.toCharArray();
		int cnt;
		for (int i = 0; i < a.length; i++) 
		{
			cnt=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j]&& a[i]!=' ')
				{
					a[j]=' ';
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=' ')
			{
				System.out.print(a[i]);
			}
		}
	}

}
