import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
//		int base = 2;
//		int n = 3;
		int result = powerN(10, 2);
		System.out.println("결과확인: " + result);

	}

	public static int powerN(int base, int n) {
		int reset = 1;

		for (int i = 0; i < n; i++) {
			reset *= base;
		}

		return reset;
	}
}
