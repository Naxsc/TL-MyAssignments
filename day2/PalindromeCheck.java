package week1.day2;

import java.util.Scanner;

public class PalindromeCheck {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, a, rem, b = 0;
		sc = new Scanner(System.in);

		System.out.println("Please Enter any number to Check : ");
		n = sc.nextInt();
		//Helps to prevent altering the original value
		a = n;
		while(a > 0) {
			rem = a %10;
			b = b * 10 + rem;
			a = a /10;
		}
		System.out.format("Reverse of entered number is = %d\n", b);
		if(n == b) {
			System.out.format("%d is Palindrome.", n);
		}
		else  {
			System.out.format("%d is Not a Palindrome.", n);
		}

	}

}
