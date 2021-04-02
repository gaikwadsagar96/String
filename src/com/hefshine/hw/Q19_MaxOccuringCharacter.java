//Write a program to find the maximum occurring character in a string.

package com.hefshine.hw;

public class Q19_MaxOccuringCharacter 
{

	public static void main(String[] args) 
	{
		String s1="sagazr jzsdflkj mdzkjsbzfd fz mkzsd    oijf";
		int cnt;
		int maxcnt=0;
		char ch = 0;
		for(int i=0;i<=s1.length();i++)
		{
			cnt=0;
			for(int j=i;j<s1.length();j++)
			{
				if(s1.charAt(j)==s1.charAt(i)&& s1.charAt(i)!=' ')
				{
					cnt++;
					if(cnt>maxcnt)
					{
						maxcnt=cnt;
						ch=s1.charAt(i);
					}
				}
			}
		}
		System.out.println("Max ocuured character: "+ch );
	}

}
