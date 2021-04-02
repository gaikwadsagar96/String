//Write a program to check whether a given string ends with the contents of another string.
package com.hefshine.hw;

public class Q02_EndsWith {

	public static void main(String[] args) 
	{
		String s1="Write a program to check whether a given string ends with the contents of another string";
		String s2="ing";
		boolean y=false;
		for(int i=s1.length()-1,j=s2.length()-1;j>=0;i--,j--)
		{
			if(s2.charAt(j)==s1.charAt(i))
				y=true;
			else
				y=false;
		}
		if(y)
			System.out.println("String ends with "+s2);
		else
			System.out.println("String Not end with "+s2);
			
		
		

	}

}
