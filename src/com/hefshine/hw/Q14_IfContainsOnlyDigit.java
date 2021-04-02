//Write a program to test if a given string contains only digits
package com.hefshine.hw;
public class Q14_IfContainsOnlyDigit 
{
	public static void main(String[] args) 
	{
		String s1="122324";
		boolean yes=false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				yes=true;
			}
			else {
				yes=false;
			}
		}
		if(yes==true)
			System.out.println("contains only digits");
		else
			System.out.println("Not contains only digit");
//==========================================
		/*String s1="12345";
		char c;
		boolean yes=false;
		for(int i=0;i<s1.length();i++)
		{
			//get character
			c=s1.charAt(i);
			//check is digit
			if(Character.isDigit(c))
			{
				yes=true;
			}
			else
			{
				yes=false;
				break;
			}
		}
		if(yes==true)
		{
			System.out.println("contans only digit");
		}
		else {
			System.out.println("not contains only digit");
		}*/
	}

}
