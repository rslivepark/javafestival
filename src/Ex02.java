import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 일한 시간 입력받아 총임금 계산하기
		// 시급 5000원, 8시간 초과 근무시 시급 1.5배 적용

		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int wt = sc.nextInt();
		int pay = 5000;
		int total = 0;

		if (wt > 8) {
			total = 8 * pay + ((wt - 8) * 7500);
			System.out.print("총임금은 " + total + "원 입니다.");

		} else {
			total = wt * pay;
			System.out.print("총임금은 " + total + "입니다.");
		} // if
	}
}
