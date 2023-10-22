import java.util.Scanner;

public class Ex23 {
//단 수와 곱해지길 원하는 수를 입력하여 출력하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력 : ");
		int dan = sc.nextInt();

		System.out.print("어느 수까지 출력 : ");
		int n = sc.nextInt();
		System.out.println(dan + "단");

		for (int i = 1; i <= n; i++) {
			int result = dan * i;
			System.out.println(dan + "*" + i + "=" + result);
		}
	}
}
