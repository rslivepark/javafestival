import java.util.Scanner;

public class Ex32 {
//ox 점수계산
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===채점하기===");
		String ans = sc.next();
		String[] arr = ans.split("");
		int score = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals("o")) {
				score++;
			} else {
				score = 0;
			}
			sum += score;

		}
		System.out.println(sum);
	}
}
