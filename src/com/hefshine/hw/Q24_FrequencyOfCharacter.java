//Write a program to find frequency of character in a string

package com.hefshine.hw;

public class Q24_FrequencyOfCharacter 
{

	public static void main(String[] args) 
	{
		String s1="sagar";
		int cnt;
		for(int i=0;i<s1.length();i++) 
		{
			cnt=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			System.out.println(s1.charAt(i)+" : "+cnt);
		}

	}

}
