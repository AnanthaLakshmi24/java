import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int cnt=0;
		    for(int i=0;i<n;i++){
		        if(a[i]>=x && a[i]<=y){
		            cnt++;
		        }
		    }
		    System.out.println(cnt);
		}
	}
}
