import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		// 정수 배열로 입력
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 정수 입력>> ");
			num[i] = sc.nextInt();
		} // for

		// 배열로 입력된 숫자 중 3의 배수인 경우에 출력
		System.out.print("3의 배수: ");
		for (int i = 0; i < 10; i++) {
			if (num[i] % 3 == 0) {
				System.out.print(num[i] + " ");
			} // if
		} // for
	}
}
