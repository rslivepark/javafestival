import java.util.*;

public class Test {
	// 중복없이 숫자 뽑는 로또 프로그램 만들기
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[6];

		for (int i = 0; i < 6; i++) {
			arr[i] = rd.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			} // for
		} // for

		for (int k = 0; k < arr.length; k++) {
			int i = arr[k];
			System.out.println(" 행운의 숫자 : " + i);
		}
	}
}
