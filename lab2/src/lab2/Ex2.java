package lab2;

public class Ex2 {
	public static String[] sortString(String[] str) {
		String[] result = new String[str.length];
		int mid = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length - 1; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String ex = str[i];
					str[i] = str[j];
					str[j] = ex;
				}
			}
		}

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() % 2 != 0) {
				mid = (str[i].length() + 1) / 2;
			} else {
				mid = (str[i].length() / 2);
			}
			result[i] = str[i].substring(0, mid).toUpperCase().concat(str[i].substring(mid, str[i].length()));

		}

		for (String S : result) {
			System.out.println(S);
		}
		return str;
	}

	public static void main(String[] args) {
		String[] str = { "pooja","akash","punith","priya","revanth","appu" };

		sortString(str);
	}
}