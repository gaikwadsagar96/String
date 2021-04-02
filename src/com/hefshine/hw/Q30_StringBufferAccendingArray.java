//Add 10 StringBuffer objects in an Array , Count no. Of Palindrome Strings, Display in Ascending order such Strings
package com.hefshine.hw;

import java.util.Arrays;

public class Q30_StringBufferAccendingArray 
{
	public static void main(String[] args) 
	{
		StringBuffer []a= {new StringBuffer("abc"),
						new StringBuffer("xyz"),
						new StringBuffer("sagar"),
						new StringBuffer("gaikwad"),
						new StringBuffer("nilin"),
						new StringBuffer("nitin"),
						new StringBuffer("aba"),
						new StringBuffer("ijgif"),
						new StringBuffer("mc vjdf"),
						new StringBuffer("akshay")
						};
		//to store string of array
		StringBuffer sb=new StringBuffer();
		//stores palindrome strings
		String s[]=new String[100];
		//index of new string araay
		int slen=0;

		int count=0; //stores palindrom string count
		//System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) 
		{	
			sb=a[i]; //assign string of array
			int length=sb.length(); //lenght of palindrome string array
			for(int j=0; j<=(sb.length()/2);j++)//check left char is equal to right char
			{
				int l=0,r=sb.length()-1;
				if((sb).charAt(l)==sb.charAt(r))
				{
					if(j==(length/2))//if is equal string is palindrome
					{
						System.out.println(a[i]+" palindrome");
						count++;	//increase palindrom count
						s[slen]=sb.toString(); //store palindrome string to palindrome string array
						slen++;//increment s array length
					}
				}
			}
		}

		System.out.println("total palindrome string: "+count);
		//sort upto actual strings inside array
		for(int i=0;i<slen;i++)
		{
			for (int j = i+1; j < slen; j++) 
			{
					if(s[i].compareTo(s[j])>0)
					{
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				
			}
		}
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!=null)
				System.out.println(s[i]);
		}
	}
}
