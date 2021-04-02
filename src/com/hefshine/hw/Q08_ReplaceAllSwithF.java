//Write a program to replace all the 'd' characters with 'f' characters.
package com.hefshine.hw;

public class Q08_ReplaceAllSwithF 
{
	public static void main(String[] args) 
	{
		String s1="adhfdObvdrq";
		StringBuffer s2 = new StringBuffer();
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='d')
			{
				s2.append('f');
			}
			else 
			{
				s2.append(s1.charAt(i));
			}
		}
		System.out.println(s2);

	}

}
