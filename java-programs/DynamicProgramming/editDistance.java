package DynamicProgramming;

public class editDistance {

	public static int eD(String s1, String s2, int n, int m) {

		if (m == 0) {
			return n;
		}

		if (n == 0) {
			return m;
		}

		if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
			return eD(s1, s2, n - 1, m - 1);
		} else {
			return 1 + Math.min(eD(s1, s2, m, n - 1), Math.min(eD(s1, s2, m - 1, n), eD(s1, s2, n - 1, m - 1)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SATUR
		// SU

		System.out.println(eD("SATURDAY", "SUNDAY", 8, 6));
	}

}
