package com.hefshine.hw;

import java.util.Scanner;

public class Q07_LengthOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter string:");
		s=sc.next();
		System.out.println(s.length());
		int count = -1;
		for(int i=0;i<=s.length();i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
