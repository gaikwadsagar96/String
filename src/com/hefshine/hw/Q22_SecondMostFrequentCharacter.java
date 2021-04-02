//Write a program to find the second most frequent character in a given string.
package com.hefshine.hw;

public class Q22_SecondMostFrequentCharacter 
{

	public static void main(String[] args) 
	{
		String s1="abcaba";
		char a[]=s1.toCharArray();
		int cnt=0;
		int smfcount=0;
		int mfcount=0;
		char smfc='0',mfc='0';
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					cnt++;
					if(cnt>smfcount)
					{
						smfcount=cnt;
						smfc=a[i];
						if(smfcount>mfcount )
						{
							int temp=smfcount;
							smfcount=mfcount;
							mfcount=temp;
							char tc=smfc;
							smfc=mfc;
							mfc=tc;
						}
					}
				}
			}
		}
		System.out.println("Max: "+mfc+": "+mfcount);
		System.out.println("sMax: "+smfcount+" : "+smfc);

	}

}
