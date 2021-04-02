//Write a program to remove a specified character from a given string.

package com.hefshine.hw;

public class Q13_RemoveSpecifiedChar 
{
	public static void main(String[] args) 
	{
		String s1="sagar";
		char ch='a';
		String s2 ="";
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==ch) 
			{
				c[i]=' ';
				break;
			}
		}
	
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]!=' ')
			{
				s2+=c[i];
			}
			else {
				continue;
			}
		}
		System.out.println(s2);
	}

}
