//Write a program to get lowest frequency of a character in a string.
package com.hefshine.hw;
import java.util.*;
public class Q25_LowestFrequencyOfChar 
{
	public static void main(String[] args) 
	{		
		String s1="aaabbbcd";
		int cnt;
		//ArrayList al=new ArrayList();
		char ch[]=s1.toCharArray();
		char a1[]=new char[s1.length()];//store character
		int a2[]=new int[s1.length()];//store char counts
		for(int i=0;i<ch.length;i++) 
		{
			cnt=1;
			if(ch[i]!=' ') 
			{	
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						cnt++;
						ch[j]=' ';		
					}
				}
			a1[i]=ch[i];//store charcters in a1
			a2[i]=cnt;//store count in a2		
			}	
		}
		//search minimum count in a2
		int min=a2[0];
		for (int i = 0; i < a2.length; i++) 
		{
				for (int j = i+1; j < a2.length; j++) 
				{
					if(a2[j]<min && a2[j]>0)
					{
						min=a2[j];
					}
				}
		}
		//PRINT MINIMUM COUNT WITH CHARACTER
		for (int i = 0; i < a2.length; i++) 
		{
			if(a2[i]==min)
				System.out.println(a1[i]+":"+a2[i]);
		}
	}
}
