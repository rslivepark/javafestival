import java.util.Scanner;

public class Ex29 {
	// n과 x를 입력받는다
	// n개의 정수를 입력받고 n개의 숫자 중 x보다 작은 수만 출력하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt();
		} // for1

		int[] minArr = new int[n]; // 작은 수를 저장하는 배열
		int minCount = 0; // 작은 수의 개수를 추적하는 변수

		// arr 배열 반복하면서 x보다 작은수 찾아서
		// minArr 배열에 저장하고 minCount 증가
		for (int i = 0; i < n; i++) {
			if (arr[i] < x) {
				minArr[minCount] = arr[i];
				minCount++;
			}
		} // for2

		// minCount가 0보다 큰 경우에만 작은수 출력
		if (minCount > 0) {
			System.out.print("결과>> ");
			for (int i = 0; i < minCount; i++) {
				System.out.print(minArr[i] + " ");
			} // for
		} // if

		sc.close();
	}
}
