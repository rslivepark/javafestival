import java.util.Scanner;

public class Ex31 {
// 세자리수 * 세자리수 계산 과정 출력하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력>> ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 입력>> ");
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*((b/10)%10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
}
