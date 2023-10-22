import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		// 정수입력받아 1,2,4,7,11과 같은 수열 n번째 항까지 출력 
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력: ");
		int n = sc.nextInt();

		for (int i = 0, j = 1; i < n; i++) {
			j += i;
			System.out.print(j + " ");
		}
	}
}
