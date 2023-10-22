
import java.util.Arrays;
import java.util.Random;

public class Ex21 {
//중복 없이 숫자 뽑는 로또 프로그램 만들기 
	public static void main(String[] args) {
		Random rd = new Random();

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(45) + 1;
			// 중복제거 - 중복이 발생하면 중복이 발생된 i 값을 - 시켜서 다시생성
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			} // for
		} // for

		for (int i : arr) {
			System.out.println(" 행운의 숫자 : " + i);
		}
	}
}
