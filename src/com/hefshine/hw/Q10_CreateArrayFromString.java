//Write a program to create a character array containing the contents of a string.
package com.hefshine.hw;

public class Q10_CreateArrayFromString 
{
	public static void main(String[] args) 
	{
		String s1="containing";
		String s2="ning";
		boolean y=false;

		for (int i = 0,j=0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)==s2.charAt(j)&& i<=s1.length())
			{
				//System.out.println(564);
				y=true;
				
				if(s1.charAt(i)==s2.charAt(j) && j==s2.length())
				{
					y=true;
					System.out.println("string1 contains contends of string2");
					break;
				}
				j++;
			}
			else
			{
				j=0;
				y=false;
			}
		}
		if(!y)
		{
			System.out.println("not contains");
		}
		
	}

}
