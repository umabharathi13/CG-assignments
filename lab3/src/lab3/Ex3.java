package lab3;

import java.util.Scanner;
public class Ex3 {
	String alterString(String str)
	{
		String str1="";
		int num=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				str1+=c;
			}
			else
			{
				num=1+(int)c;
				str1=str1+(char)num;
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Ex3 e=new Ex3();
		System.out.println(e.alterString(str));
		
	}

}
