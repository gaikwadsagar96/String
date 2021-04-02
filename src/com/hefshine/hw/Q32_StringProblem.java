/*Problem Statement1:
 Write a program which creates a String “Welcome to Java World” and performs the
following Returns the character at 5th position and display it.Compares the above String with
“Welcome” lexicographically ignoring case differences and display the result. Concatenates “- Let us
learn” to the above string and display it.
Returns the position of the first occurrence of character ‘a’ and display it. Replaces all
the occurrences of ‘a’ character with the new ‘e’ and display it. Returns string between
4 th position and 10th position and display it.*/
package com.hefshine.hw;

public class Q32_StringProblem 
{

	public static void main(String[] args) 
	{
		String s="Welcome to Java World";
		System.out.println(s.charAt(5));
		System.out.println(s.compareToIgnoreCase("Welcome"));
		System.out.println(s.concat("- Let us learn"));
		//Returns the position of the first occurrence of character ‘a’ and display it
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a') {
				System.out.println("position of first occurence of a: "+i);
			break;
			}
		}
		
		//Returns string between 4 th position and 10th position and display it
		for(int i=0;i<s.length();i++)
		{
			if(i>=4 && i<=10)
				System.out.print(s.charAt(i));
		}
	}

}
