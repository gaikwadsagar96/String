//Write a program to delete all extra spaces in string.
package com.hefshine.hw;

public class Q35_DeleteAllExtraSpaceInString 
{
	public static void main(String[] args) 
	{
		//String s=" Delete  Extra Space  ";
		String s="     Write  a  program    to delete all extra spaces  in string    ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')//not space
			{
				if(s.charAt(i)!=' ' || s.charAt(i+1)==' '&& s.charAt(i+2)!=' ')//current not space or next space and next of next not space 
				{
					System.out.print(s.charAt(i));//checks for middle one space
				}
			}
			else if (i!=s.length()-1 && i!=0) //current not equals to first and last char
			{
				if(s.charAt(i-1)!=' ' && s.charAt(i)+1!=' ')//prev not space and next not space
				{
					System.out.print(s.charAt(i));
				}
			}
		}
	}

}
