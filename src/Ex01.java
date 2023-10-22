import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 현재 몸무게 입력
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();

		// 목표 몸무게 입력
		System.out.print("목표몸무게 : ");
		int future = sc.nextInt();
		int i = 1;
		int j = 0;

		while (true) {
			System.out.print(i + "주차 감량 몸무게 : ");
			j = sc.nextInt();
			now -= j;
			if (future >= now) {
				break;
			} // if
			i++;
		} // while
		System.out.println(now + "kg 달성! 축하합니다. ");

	}
}
