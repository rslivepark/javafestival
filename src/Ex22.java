import java.util.Scanner;

public class Ex22 {
//사용자에게 입력받아 배열의 인덱스 수만큼 별 출력하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];

		// 배열 인덱스에 별의 출력 개수 저장하기
		for (int i = 0; i < n.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			n[i] = sc.nextInt();

		} // for

		for (int i = 0; i < n.length; i++) {
			// 배열 길이만큼 반복
			System.out.print(n[i] + " : ");
			for (int j = 0; j < n[i]; j++) {
				// 해당 인덱스에 저장된 값만큼 별표 출력
				System.out.print("*");
			}
			System.out.println();
			// 각 인덱스에 대한 출력 구분
		}
	}

}
