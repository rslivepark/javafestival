import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		int[] arr = { 10000, 5000, 1000, 500, 100 };
		// int[] cnt = new int[money.length];
		System.out.println();
		System.out.println("잔돈 : " + money);
		for (int i = 0; i < arr.length; i++) {
			int cnt = money / arr[i]; // cnt 지폐개수
			money %= arr[i];
			System.out.println(arr[i] + "원 : " + cnt + "개");
		}

	}
}
