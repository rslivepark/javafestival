import java.util.Scanner;

public class Ex30 {
// 대시 문자로 구성된 형태의 숫자, 대시의 개수를 출력하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		System.out.print("대시('-')의 총합 >> ");
		System.out.println(Number(num));

	}

	public static int Number(int num) {
		int result = 0;
		int[] arr = { 6, 2, 5, 5, 4, 5, 6, 4, 7, 6 }; // 숫자의 대시 개수 
		while (num > 0) {
			int num2 = num % 10;
			num /= 10;
			result += arr[num2];
		}
		return result;
	}
}
