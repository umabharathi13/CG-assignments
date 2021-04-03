package lab2;

public class Ex4 {
	static int[] getDuplicate(int x[]) {
		int y[] = new int[x.length];
		y[0] = x[0];
		int k = 1;
		for (int i = 1; i < x.length; i++) {
			int j = 0;
			for (; j < k; j++) {
				if (x[i] == y[j]) {
					break;
				}
			}
			if (j == k) {
				y[k] = x[i];
				k++;
			}
		}
		int z[] = new int[k];
		for (int i = 0; i < k; i++) {
			z[i] = y[i];

		}
		return z;

	}

	public static void main(String args[]) {
		int ar[] = { 25, 35, 75, 96, 44, 25, 75, 44 };
		ar = getDuplicate(ar);
		System.out.println("Duplicate array is ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + "");
		}
	}
}