import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 행 개수 입력 받아 역삼각형 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 77; i < 0; i--) {
			for (int j = 0; j < j + 1; j++) {
				System.out.println(i + ", " + j);
			} // for끝
		} // for끝
	}
}
