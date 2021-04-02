//Write a program to check whether two String objects contain the same data
package com.hefshine.hw;

public class Q03_SameString 
{

	public static void main(String[] args) 
	{
	String s1="sagar";
	String s2="sagar";
	boolean t=false;
	if(s1.length()==s2.length())
	{
		for(int i=0;i<s1.length();i++)
		{
			
			if(s1.charAt(i)==s2.charAt(i))
			{
				t=true;
			}
			else {
				t=false;
			}
		}
	}
	if(t==true) {
		System.out.println("same");
	}
	else {
		System.out.println("not same");
	}

	}

}
