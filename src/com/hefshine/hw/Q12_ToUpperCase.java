//Write a program to convert all the characters in a string touppercase.

package com.hefshine.hw;

public class Q12_ToUpperCase 
{
	public static void main(String[] args) 
	{
		String s1="aYjDoiodM";
		System.out.println(s1.toUpperCase());
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>=97)
			{
				s2+=(char)(s1.charAt(i)-32);
			}
			else
			{
				s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
