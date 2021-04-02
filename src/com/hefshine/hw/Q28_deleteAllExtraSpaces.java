package com.hefshine.hw;

public class Q28_deleteAllExtraSpaces {

	public static void main(String[] args) 
	{
		//String s1="   sagar gaikwad    sdkjadshdk    ";
		String s1="     Write  a program    to delete all extra spaces  in string    ";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')//not space
			{
				if(s1.charAt(i)!=' '||s1.charAt(i+1)==' '&& s1.charAt(i+2)!=' ')//check next index element not be space 
				{
					System.out.print(s1.charAt(i));
				}
			}
			else if (i!=s1.length()-1 && i!=0)//i not be first and last index 
			{
				if(s1.charAt(i-1)!=' '&&s1.charAt(i)+1!=' ')//prev elment not be space and next element not be space
					System.out.print(s1.charAt(i));//print space between 2 elements
			}
		}

	}

}
