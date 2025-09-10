import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	    int n=sc.nextInt();
        int Aatt[]=new int [n];
        int Adef[]=new int [n];
        int Batt[]=new int [n];
        int Bdef[]=new int [n];
        for(int i=0;i<n;i++)
        {
            Aatt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            Adef[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            Batt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            
            Bdef[i]=sc.nextInt();
        }
        int Aatts=0;
        int Adefs=0;
        int Batts=0;
        int Bdefs=0;
        for(int i=0;i<n;i++)
        {
            Aatts+=Aatt[i];
            Adefs+=Adef[i];
            Batts+=Batt[i];
            Bdefs+=Bdef[i];
        }
        if(Aatts>Batts && Adefs>Bdefs) System.out.println("A");
        else if(Aatts<Batts && Adefs<Bdefs) System.out.println("p");
        else System.out.println("DRAW");
    }
	    }

}
