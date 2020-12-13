package com.shazi.testprogram1;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
int[] myarray= {1,2,3,1,4,1,4};
		
		Set<Integer> mySet=new HashSet<Integer>();
		
		for(int i=0;i<myarray.length;i++)
		{
	
		if(!mySet.add(myarray[i]))
		{
			System.out.println("The no "+ myarray[i]+" repeated");
		}	
	}
    }
}
