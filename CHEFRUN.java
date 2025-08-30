import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner n=new Scanner(System.in);
int t=n.nextInt();
while(t-->0){
  float a=n.nextInt();
  float  b=n.nextInt();
  float c=n.nextInt();
  float  d=n.nextInt();
  float e=n.nextInt();
  float a1=(float)((c-a)/d);
  float a2=(float)((b-c)/e);
 
  if(a1>a2)
  System.out.println("Kefa");
  else if(a1==a2)
  System.out.println("Draw");
  else
  System.out.println("Chef");
  
  
}

	  
	}
}
