import java.util.Scanner;

public class Ex24 {
//10진수 정수 입력받아 2진수 출력하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>> ");
		int n = sc.nextInt();
		String result = ""; // 2진수 결과 저장할 문자열, 초기에 빈 문자열로 초기화하기

		for (int i = n; i > 0; i /= 2) {
			// n값은 몫에 해당, 2로 계속 나누어주며 몫을 구한다 
			// 나머지는 문자열로 변환하여 result 문자열 앞에 추가

			result = result.valueOf(i % 2) + result;
		}
		System.out.println(result);
		System.out.println(result.length());
	}
}
