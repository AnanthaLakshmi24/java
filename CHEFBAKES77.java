import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int cakesPerVehicle = Y / X;  
        int vehicles = (N + cakesPerVehicle - 1) / cakesPerVehicle; 
		System.out.println(vehicles);

	}
}
