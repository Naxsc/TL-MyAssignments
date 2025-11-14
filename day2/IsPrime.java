package week1.day2;

import java.util.Scanner;

public class IsPrime {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{	
			int i, n, a = 0; 
			sc = new Scanner(System.in);
			
			System.out.print(" Please Enter any Integer : ");
			n = sc.nextInt();		
			
			for (i = 2; i <= n/2; i++)
			{
				if(n % i == 0)
			    {
					a++;
			        break;
			    }	
			}
			if(a == 0 && n != 1 )
			{
				System.out.println( n + " is a Prime");
			}
			else
			{
			   System.out.println(n + " is Not Prime");
			}
		}
	}

	}
