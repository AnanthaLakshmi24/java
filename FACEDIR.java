/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=1;i<=T;i++){
		    int X=scan.nextInt();
		    int val=X%4;
		    if(val==0){
		        System.out.println("North");
		    }
		    else if(val==1){
		        System.out.println("East");
		    }
		    else if(val==2){
		        System.out.println("South");
		    }
		    else if(val==3){
		        System.out.println("West");
		    }
		}
	}
}
