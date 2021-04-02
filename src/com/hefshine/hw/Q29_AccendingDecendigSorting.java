//Write a program to sort in ascending and descending order by length of the given array of strings
package com.hefshine.hw;

import java.util.Arrays;

public class Q29_AccendingDecendigSorting
{
	public static void main(String[] args) 
	{
		String s[]= {"sagar","vaibhav","akshay","harshad","shubham","prabhu","shraddha"};
		
		for(int i=0;i<s.length-1;i++)
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i]!=null)
				{
					if(s[i].compareTo(s[j])>0)
					{
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}
}
/*
public class Q29_AccendingDecendigSorting 
{

	public static void main(String[] args) 
	{
		String s1="asdsfghjkl";
		//char a[]=s1.toCharArray();
		AccendingSort(s1);
		System.out.println();
		DecendingSort(s1);
	}

	private static void DecendingSort(String s1) {
		char a[]=s1.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		
	}

	private static void AccendingSort(String s1) 
	{
		char a[]=s1.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}

}*/
