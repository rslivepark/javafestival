import java.util.Scanner;

public class Ex37 {
	// 1보다 큰 정수 입력하여 N! 값 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		int result = 1;
		for(int i = 1; i<=num; i++) {
			result *= i;
		}
		System.out.print("출력 : " + result);
		
	}

}
