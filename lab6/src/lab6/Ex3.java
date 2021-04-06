package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex3{
	public static Map<Integer, String> getStudents(Map<Integer, Integer> map) {
		Map<Integer, String> result = new HashMap();
		Set keys = map.keySet();
		Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			if (!result.containsKey(key)) {
				Integer value = (Integer) map.get(key);
				if (value >= 90) {
					result.put(key, "Gold");
				} else if (value >= 80 && value < 90) {
					result.put(key, "Silver");
				} else if (value >= 70 && value < 80) {
					result.put(key, "Bronze");
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap();
		map.put(1, 95);
		map.put(2, 20);
		map.put(3, 82);
		map.put(4, 70);
		map.put(5, 80);
		map.put(6, 75);
		System.out.println(getStudents(map));

	}

}