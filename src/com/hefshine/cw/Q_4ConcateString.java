//Write a program to concatenate a given string to the end of another string
package com.hefshine.cw;

public class Q_4ConcateString 
{
	public static void main(String[] args) 
	{
		String s="abc";
		String s1="";
		String s2="asd";
		System.out.println(s);
		System.out.println(s.concat("xyz"));
		String s3;
		s3=s.concat(s2);
		//System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		concate(s,s2);
	}

	private static void concate(String s1, String s2) 
	{
		try {
		String s3="";
		for(int i=0;i<s1.charAt(i);i++)
		{
			s3+=s1.charAt(i);
		}
		for(int i=0;i<s2.charAt(i);i++)
		{
			s3+=s2.charAt(i);
		}
		System.out.println(s3);
	
		}
		catch(Exception e) {System.out.println();}
	}
	
}
