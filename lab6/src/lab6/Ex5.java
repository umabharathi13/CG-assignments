package lab6;

import java.util.*;

public class Ex5 {
	public static int getSecondSmallest(Integer[] a, int total){  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(1);  
		return element;  
		}  
		public static void main(String args[])
		{    
		Integer b[]={10,20,30,40,50};   
		System.out.println("Second Smallest: "+getSecondSmallest(b,7));  
		}
}
