package lab3;

import java.util.Scanner;

public class Ex2 {
	String getimage(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String st=new String(sb);
		String s="|";
		return str+s+st;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Ex2 e=new Ex2();
		System.out.println(e.getimage(str));
		
	}

}