//Write a program to get the character at the given index within theString.
package com.hefshine.cw;
import java.util.*;
public class Q2_getCharAtIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=new String("sagar");
		System.out.println(s);
		int index;
		System.out.println("Enter index");
		index=sc.nextInt();
		
		System.out.println(s.charAt(index));

	}

}
