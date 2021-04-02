//Write a program to convert all the characters in a string to lowercase
/*
 * 1-97
	z-122
	A-65
	Z-90*/
package com.hefshine.hw;

public class Q11_ConvertStringToLowercase 
{
	public static void main(String[] args) 
	{
		String s1="AfBuiHMwlQ";
		String s2 ="";
		System.out.println(s1.toLowerCase());

		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a'&& s1.charAt(i)<='z')
				System.out.print(s1.charAt(i));
			else
				System.out.print((char)((int)s1.charAt(i)+32));
		}
		System.out.println(s2);
	}

}
