package lab1;
import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,n=0,cube;
		int num=sc.nextInt();
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
			num=num/10;
			
		}
		cube=sum*sum*sum;
		System.out.println(cube);
	}
}