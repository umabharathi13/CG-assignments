package lab2;

import java.util.Arrays;

public class SecSmallest {
	public static int secondSmallest(int[] array) {
		if(array.length==0)return 0;
		int[] resultArray= new int[array.length];
		Arrays.sort(array);
//		  for (int i = 0; i < array.length-1; i++)
//	        {
//	            // Find the minimum element in unsorted array
//	            int min = i;
//	            for (int j = i+1; j < array.length; j++)
//	                if (array[j] < array[min])
//	                    min = j;
//	  
//	            // Swap the found minimum element with the first
//	            // element
//	            int temp = array[min];
//	            array[min] = array[i];
//	            array[i] = temp;
//	        }
		for(int i=0;i<array.length;i++) {
			resultArray[i]=array[i];
		}
		return resultArray[1];
	}
	public static void main(String[] args) {
	int[] array= {1,3,2,9,6,8};
System.out.println(secondSmallest(array));
	}

}
		