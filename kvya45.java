/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        number=sc.nextInt();
        while(number>0)
        {
          number=number/10;
          count++;
          System.out.println(count);
       }        
	}
}
