//Write a program to test methods of StringBuilder.
package com.hefshine.cw;

public class Q9_StringBuilder 
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("sagar");
		System.out.println(sb);
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(2));
		System.out.println(sb.append(" gaikwad"));
		System.out.println(sb.reverse());
	}

}
