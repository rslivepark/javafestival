import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 행 개수 입력 받아 삼각형 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");

			} // for 끝
			System.out.println();
		} // for 끝

		System.out.println("====");
		System.out.println("역삼각형 출력 ");

		// 행 개수 입력 받아 역삼각형 출력하기

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
