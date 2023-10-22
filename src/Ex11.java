import java.util.Random;

public class Ex11 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[8];
		System.out.print("배열에 있는 모든 값: ");
		
		
		// 배열에 랜덤 숫자 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}

		int max = arr[0]; // 최댓값을 첫 번째 원소로 초기화

		// 최댓값
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// 최솟값
		int min = arr[0]; // 최솟값을 첫 번째 원소로 초기화
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}
}
