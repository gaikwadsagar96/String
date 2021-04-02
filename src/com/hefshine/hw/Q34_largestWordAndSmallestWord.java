//Write a program to find largest & smallest word in a string. 
package com.hefshine.hw;

import java.awt.image.SampleModel;

public class Q34_largestWordAndSmallestWord 
{

	public static void main(String[] args) 
	{
		String string="sagar maruti Gaikwad is computer engineer";
		String word="",small="",large="";
		String[] words=new String[100];
		int length=0;
		//add extra space to string to get last word
		string=string+" ";
		for(int i=0;i<string.length();i++)
		{
			//split string into words
			if(string.charAt(i)!=' ') {
				word=word+string.charAt(i);
			}
			else {
				//add word to array of words
				words[length]=word;
				//increment length
				length++;
				//make empty word
				word="";
			}
		}
		//initialize small and large to first word in string
		small=large=words[0];
		//determine smallest and largest
		for(int k=0;k<length;k++)
		{
			//if length of small is greater than any word in string store value into small
			if(small.length()>words[k].length())
				small=words[k];
			//if length of large less than any word in string  store value of word into large
			if(large.length()<words[k].length())
				large=words[k];
		}
		System.out.println("smallest word: "+small);
		System.out.println("Largest word: "+large);
	}

}
