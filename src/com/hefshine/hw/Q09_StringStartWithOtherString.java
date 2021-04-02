//Write a program to check whether a given string starts with the contents of another string.
package com.hefshine.hw;

public class Q09_StringStartWithOtherString 
{

	public static void main(String[] args) 
	{
	String s1="sagar";
	String s2="sa";
	boolean t=false;
	for(int i=0;i<s2.length();i++)
	{
		if(s2.charAt(i)==s1.charAt(i))
		{
			t=true;
		}
		else {
			t=false;
		}
	}
	if(t=true)
		System.out.println("string s1 start with content of s2");
	else
		System.out.println("Not start");
	

	}

}
