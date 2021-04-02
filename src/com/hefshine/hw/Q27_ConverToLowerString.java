//Write a program to convert all the characters in a string tolowercase.
package com.hefshine.hw;

public class Q27_ConverToLowerString 
{

	public static void main(String[] args) 
	{
		String s1="SaGAr";
		for(int i=0;i<s1.length();i++)
		{
			//char a=s1.charAt(i);
			if(s1.charAt(i)<='Z')
			{
				//char b=(char)((int)s1.charAt(i)+32);
				//(int)s1.charAt(i)-->converts into currosponding character to int value
				//(char)((int)s1.charAt(i)+32);//againt convert int value to currespondig character value 
				System.out.print((char)(s1.charAt(i)+32));
		
			}
			else {
				System.out.print(s1.charAt(i));
			}
		}
	}

}
