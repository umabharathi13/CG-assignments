package lab5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int n = sc.nextInt();
		try {
		if (n < 15) 
			throw new Ex1Age("Invalid");
			else
				System.out.println("Valid");
		}
		catch(Ex1Age ae) {
			System.out.println(ae);
			ae.printStackTrace();
		}
			
				
	}
}