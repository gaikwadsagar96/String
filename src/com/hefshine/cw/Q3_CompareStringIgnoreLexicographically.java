//Write a program to compare two strings lexicographically, ignoring casedifferences.
package com.hefshine.cw;

public class Q3_CompareStringIgnoreLexicographically 
{
	public static void main(String[] args) 
	{
		String s="abc";
		String s1="Abc";
		String s2="aXz";
		System.out.println(s.compareToIgnoreCase(s2));
		System.out.println(s.compareToIgnoreCase(s1));

	}

}
