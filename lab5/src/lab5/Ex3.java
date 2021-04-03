package lab5;
import java.util.Scanner;


public class Ex3 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Sal");
	int sal = sc.nextInt();
	try{
		if(sal<3000)
			throw new EmployeeException("Invalid");
		else
			System.out.println("valid");
	}
	catch(EmployeeException e) {
		System.out.println(e);
		e.printStackTrace();
	}
	}
}