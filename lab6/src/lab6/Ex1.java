package lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex1 {
	public static List getValues(HashMap<Integer,Integer> map) {
		List<Integer> result= new ArrayList();
		Set keys= map.keySet();
		Iterator iterator=keys.iterator();
		while(iterator.hasNext()) {
			Integer key= (Integer) iterator.next();
			Integer value=(Integer) map.get(key);
			result.add(value);
		}
		Collections.sort(result);
		
		return result;
	}

	public static void main(String[] args) {
		HashMap<Integer,Integer> map= new HashMap();
		map.put(1, 93);
		map.put(2, 20);
		map.put(3, 82);
		map.put(4, 35);
		map.put(5, 80);
		map.put(6, 75);
		System.out.println(getValues(map));
	}

}

