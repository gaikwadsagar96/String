//Write a program to return a string with the characters of the index position 0,1,2,5,6,7, ... from a given string.
package com.hefshine.hw;

public class Q15_IndexOfCharacters 
{
	public static void main(String[] args) 
	{
		String s1="qwertyuiop";
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i)+" : "+i);
		}

	}

}
