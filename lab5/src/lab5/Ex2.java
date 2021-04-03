package lab5;

import java.util.Scanner;

public class Ex2 {
	 String firstName;
	 String lastName;
	
		public Ex2(String firstName,String lastName) {
			try {
			if(firstName.length()==0||lastName.length()==0) {
				throw new NameNotFoundException("Both first and last name must not be empty");	
			}	
			}
			catch(NameNotFoundException e) {
				System.out.println(e);
				System.exit(1);
			}
			this.firstName=firstName;
			this.lastName=lastName;
		}
		public void display() {

			System.out.println("Name of the employee: " + this.firstName+" "+ this.lastName);
		}

	public static void main(String[] args) {
		
		String firstName=null;
		String lastName=null;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first name:");
		firstName=sc.nextLine();
		System.out.println("Enter the last name:");
		lastName=sc.nextLine();
		Ex2 obj= new Ex2(firstName,lastName);
		obj.display();
	}

}