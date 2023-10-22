import java.util.*;

public class Ex18 {
	public static void main(String[] args) {
		// 8자리 정수를 입력받아 반복문을 활용하여 입력받은 정수의 합을 구하여 출력하기

		// 8자리 정수 입력받기
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		System.out.print("정수입력>> ");
	
		//입력받은 값 배열에 넣기 
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		//배열 원소 값 누적하여 더하기  
		int sum = 0;
		for(int i =0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);
	}
}
