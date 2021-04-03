package lab3;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str,",");
		int sum = 0;
		while(st.hasMoreTokens())
		{
		int n = 0;
		n = Integer.parseInt(st.nextToken());
		System.out.println("Number is: "+n);
		sum += n;
		}
		System.out.println("Sum of the numbers is: "+sum);
	}

}