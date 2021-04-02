//Write a program to count and print all the duplicates in the input string.
package com.hefshine.hw;

import java.util.Arrays;

public class Q17_duplicateInString 
{

	public static void main(String[] args) 
	{
		
		
		//option 1
	/* String s="sagarr";
	 char c[]=s.toCharArray();
	 for (int i = 0; i < c.length; i++) 
	 {
		 int cnt=1;
		 for (int j = i+1; j < c.length; j++) 
		 {
			if(c[i]==c[j])
			{
				cnt++;
			}
		 }
		 if(cnt>1)
			 System.out.println(c[i]+" : "+cnt);
	}*/
		
		//------------option 2
		String s="programg";
		String count="";
		int cnt;
		//char a;
		for(int i=0;i<s.length();i++)
		{	
			cnt=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
		//			a=s.charAt(j);
					cnt++;
				}
			}
			if(cnt>1)
			{
				count+=s.charAt(i);
				count+=cnt;			
			}
		}
		for(int i=0;i<count.length();i=i+2)
			System.out.print(count.charAt(i)+" : "+count.charAt(i+1)+"\n");
//-------------------option 3
		
		/*Q17_duplicateInString d=new Q17_duplicateInString();
		String s="sagarr",s1 ="";
		char r='r';
		char ch[]=s.toCharArray();
		ch=d.remove(ch,r);
		for (int i = 0; i < ch.length; i++) 
		{
			s1+=ch[i];
		}
		System.out.println(s1);
	}

	 char[] remove(char[] ch, char r) 
	 {
		 char s1[]=new char[ch.length-1]; 
		 for(int i=0,k=0;i<s1.length;i++)
		 {
			if(s1[i]!=r)
				s1[k++]=ch[i];
			else
				continue;
		 }
	return s1;
	}*/
//--------------------
	}
}
