//Write a program to test methods of StringBuffer.
package com.hefshine.cw;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;
public class Q8_StringBufferMethods 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*StringBuffer sb=new StringBuffer();
		System.out.println("Enter");
		sb.append(sc.next());*/
		StringBuffer sb1=new StringBuffer("sagar");
		//System.out.println("reverce: "+sb1.reverse());
		System.out.println(sb1.subSequence(1, 3));
		System.out.println(sb1.replace(1, 3, "abc"));
		System.out.println(sb1.deleteCharAt(3));
		System.out.println(sb1.delete(1, 3));
		//System.out.println(sb1.codePoints());
		System.out.println(sb1.capacity());
		
	}

}
