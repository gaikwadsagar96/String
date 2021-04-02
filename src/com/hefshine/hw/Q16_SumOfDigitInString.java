//Write a program to return the sum of the digits present in the given string. If there is no digits the sum return is 0.
package com.hefshine.hw;

public class Q16_SumOfDigitInString 
{
	public static void main(String[] args) 
	{
	/*	String s1="1234567";
		int sum=0;
		char ch;
		int n;
		for(int i=0;i<s1.length();i++)
		{
			//find char
			ch=s1.charAt(i);
			//check character is digit
			if(Character.isDigit(ch))
			{
				//find numeric value
				n=Character.getNumericValue(ch);
				sum+=n;
			}
		}
		System.out.println("Sum: "+sum);
		*/
		//------------------------
		String s2="abc88";
		int sum2=0;
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)>='0' && s2.charAt(i)<='9')
			{
				sum2=sum2+s2.charAt(i)-'0';//ie.1s'ascii value is 49 to get actual value of 1-> 49-48=1 48 is ascii value of 0
			}	
		}
		//System.out.println(sum2);
		if(sum2!=0)
			System.out.println(sum2);
		else
			System.out.println(0);
	}

}
