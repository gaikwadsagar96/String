//Write a program to compare a given string to another string, ignoring case considerations.
package com.hefshine.hw;

public class Q04_SameStringIgnoreCase 
{
	public static void main(String[] args) 
	{
		String s1="sagar";
		String s2="Sagar";
		int com=s1.compareToIgnoreCase(s2);
		if(com==0)
			System.out.println("same");
		else
			System.out.println("not same");

	}

}
