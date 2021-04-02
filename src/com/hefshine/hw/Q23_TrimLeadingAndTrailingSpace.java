//Write a program to trim any leading or trailing and extra whitespace from a given string.
package com.hefshine.hw;

public class Q23_TrimLeadingAndTrailingSpace 
{
	public static void main(String[] args) 
	{
		String s1="   sagar    gaikwad sdkjadshdk    ";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')//not space
			{
				if(s1.charAt(i)!=' '||s1.charAt(i+1)==' '&& s1.charAt(i+2)!=' ')//check current index element not be space next index shuld be space and next of next should not space 
				{
					//System.out.print(s1.charAt(i));
					s2+=s1.charAt(i);
				}
			}
			else if (i!=s1.length()-1 && i!=0)//i not be first and last index 
			{
				if(s1.charAt(i-1)!=' '&& s1.charAt(i)+1!=' ')//prev elment not be space and next element not be space
					//System.out.print(s1.charAt(i));//print space between 2 elements
					s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
