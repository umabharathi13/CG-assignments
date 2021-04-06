package lab6;
import java.util.HashMap;
import java.util.Map;

public class Ex2{
	public static Map<Integer,Integer> getSquares(int[] array){
		Map<Integer,Integer> result= new HashMap();
		for(int x: array) {
			if(!result.containsKey(x)) {
				result.put(x, x*x);
			}else {
				continue;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9 };
System.out.println(getSquares(array));
	}

}