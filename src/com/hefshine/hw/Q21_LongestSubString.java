//Write a program to find Length of the longest substring without repeating characters.
package com.hefshine.hw;

import java.util.Arrays;

public class Q21_LongestSubString 
{
	public static void main(String[] args) 
	{
//		String s="abcabdefgabc";
		String s="abcabcdefagt";
		char c[]=s.toCharArray();
		int si=0,ei=0,max=0;
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = i+1; j < c.length; j++) 
			{
				boolean flag=false;
				for (int k = i; k < j; k++) 
				{
					if(c[k]==c[j]||j==c.length-1)
					{
						flag=true;
					}
				}
				if(flag==true)
				{
					if(max<(j-i))
					{
						max=j-i;
						si=i;
						ei=j-1;
					}
					break;
				}
			}
		}
		System.out.println(max);
		for(int i=si;i<=ei;i++)
			System.out.print(c[i]);
		
		

		/* String s = "abcabdabc"; char c[] = s.toCharArray();
		int si = 0;
		int ei = 0;
		int max = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				boolean flag = false;
				for (int k = i; k < j; k++) {
					if (c[k] == c[j] || j == c.length - 1) {
						flag = true;
					}
				}
				if (flag == true) {
					if (max < (j - i)) {
						max = (j - i);
						si = i;
						ei = j - 1;
					}
					break;
				}
			}
		}
		System.out.println(max);
		for (int i = si; i <= ei; i++) {
			System.out.print(c[i]);
		}*/
		 
		/*String s="abcabdabc";
		char[] a = s.toCharArray();
		String ss = "";
		String[] a1 = new String[100];
		boolean y = false;
		int cnt = 0, z = 0;
		for (int i = 0; i < a.length; i++) 
		{
			int l = i;
			int k = 0;
			int subStringCount = 0;
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[l] == a[j]) 
				{
					l++;
					cnt++;
					ss += a[j];
				}
			}
			if (cnt > 0) 
			{
				a1[z] = ss;
				z++;
				ss = "";
				cnt = 0;
			}
		}
		System.out.println(Arrays.toString(a1));
		int c = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != null)
				c++;
		}
		String subS[] = new String[cnt];
		int j = 0;
		for (int i = 0; i < a1.length; i++) 
		{
			if (a1[i] != null)
				subS[j] = a1[i];
				j++;
		}

		int max = subS[0].length();
		String maxsub = "";
		for (int i = 0; i < subS.length; i++) 
		{
			int l = subS[i].length();
			if (l > max) {
				max = l;
				maxsub = subS[i];

			}

		}
		System.out.println(maxsub);

		System.out.println(Arrays.toString(a1));
*/
	}

}
