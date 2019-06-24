package misc;
import java.util.Scanner;

public class LCM_GCD {
	public static void lcm(int n1, int n2) {
		int max, step, lcm = 0;
		lcm = (n1 > n2) ? (max = step = n1) : (max = step = n2);

		while (n1 != 0) {
			if (max % n1 == 0 && max % n2 == 0) {
				lcm = max;
				break;
			}
			max += step;
		}
		System.out.println("LCM of given number: " + lcm);
	}

	public static void gcd(int n1, int n2) {
		int i, hcf = 0;
		for (i = 1; i <= n1 || i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				hcf = i;
			}
		}
		System.out.println("GCD of given number: " + hcf);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();
		lcm(n1, n2);
		gcd(n1, n2);
	}
}
