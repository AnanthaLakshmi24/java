import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int x= (a+1)*4;
        int y= b*3;
        int p;
        if((x+y)%8==0){
            System.out.println((x+y)/8);
        }
        else{
            System.out.println(((x+y)/8)+1);
        }
	}
}
