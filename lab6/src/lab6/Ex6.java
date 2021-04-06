package lab6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex6 {
	public static List votersList(HashMap<Integer, String> map) throws Exception {
		List<Integer> result = new ArrayList();
		Set keys = map.keySet();
		Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			String value = (String) map.get(key);
			Date date = Ex6.StringToDate(value);
			Instant instant = date.toInstant();
			ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
			LocalDate givenDate = zone.toLocalDate();

			Period period = Period.between(givenDate, LocalDate.now());
			if (period.getYears() >= 18) {
				result.add(key);
			}

		}

		return result;
	}

	public static Date StringToDate(String dob) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date = formatter.parse(dob);
		return date;
	}

	public static void main(String args[]) throws Exception {
		HashMap<Integer, String> map = new HashMap();
		map.put(1, "10-06-2020");
		map.put(2, "03-02-1989");
		map.put(3, "02-02-1959");
		map.put(4, "18-09-1949");
		map.put(5, "30-08-2010");
		map.put(6, "10-08-1998");
		map.put(7, "10-10-2000");
		map.put(8, "10-12-1999");

		System.out.println(votersList(map));
	}
}
