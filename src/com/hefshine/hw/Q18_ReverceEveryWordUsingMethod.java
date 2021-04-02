//Write a program to reverse every word in a string using methods.
package com.hefshine.hw;

public class Q18_ReverceEveryWordUsingMethod 
{

	public static void main(String[] args) 
	{
		String s1="Write a program    to reverse every word in a string using methodsa";
		reverceWord(s1);
	}

	private static void reverceWord(String s) 
	{
		//remove extra space
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				if(s.charAt(i)!=' ' || s.charAt(i+1)==' '&& s.charAt(i+2)!=' ')//current not space next should be space next of next not space
				{
					//System.out.print(s.charAt(i));
					s1+=s.charAt(i);
				}
			}
			else if (i!=s.length()-1 && i!=0) //current i not be first and last element
			{
				if(s.charAt(i-1)!=' ' && s.charAt(i)+1!=' ')//current not be space next not be space
				{
					//System.out.print(s.charAt(i));
					s1+=s.charAt(i);
				}
			}
		}
		//s1+=' ';//add space to last
		
		//reverce word

		s1+=" ";//add space to last so we will get next/last space 
		int prespace=0;//for index of previous space
		for (int i = 0; i < s1.length(); i++) 
		{				
			if(s1.charAt(i)==' ')//if next space found 
			{
				int space=i;//until next space
				for(int j=space-1;j>=prespace;j--)//reverce the string until previous space
				{
					System.out.print(s1.charAt(j));
				}
			}
			else if (i!=0 && s1.charAt(i)!=' ' && s1.charAt(i-1)==' ')//check first i should not be start index and current index not space and current index previous shoud be space  
			{
				prespace=i;
				System.out.println();//in space found goto next line
			}
			/*if(i==s1.length()-1) 
			{
				for(int k=s1.length()-1;k>=prespace;k--)//for last word of Line
				{
					System.out.print(s1.charAt(k));
				}
			}*/
		}
		//System.out.println(space);
	}

}
