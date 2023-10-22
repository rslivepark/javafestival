
public class Ex12 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.print("결과 확인 : " + result);
	}

	public static boolean isDivide(int a, int b) {
		return a % b == 0;
	}
}
