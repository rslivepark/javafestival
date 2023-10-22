import java.util.*;

public class Ex35 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			// 랜덤으로 정수 2개 뽑기
			Random rd = new Random();
			int n = rd.nextInt(10);
			int m = rd.nextInt(10);
			System.out.print(n + " + " + m + " = ");

			// 두 수 합 입력
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int add = n + m;

			// 사용자가 입력한 값과 두 수의 합 일치 하는지 확인
			if (add == num) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
			} // if
		} // for
		System.out.println("Game Over");

	}
}
