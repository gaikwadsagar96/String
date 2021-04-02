//Write a program to get the last index of a string within a string.
package com.hefshine.hw;

import java.util.Scanner;

public class Q06_LastIndex 
{
	
	public static void main(String[] args) 
	{
		String s="aabbbcca";
		//System.out.println(s.lastIndexOf('b'));
		//System.out.println(s.lastIndexOf("a"));
		
		Scanner sc=new Scanner(System.in);
		System.out.println(s+"\n Enter charcter to print Last index");
		char c=sc.next().charAt(0);
		int index = 0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==c)
				index=i;
		}
		System.out.println(index);
	}
}
