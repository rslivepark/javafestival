
import java.util.Arrays;
import java.util.Random;

public class Ex21 {
//중복 없이 숫자 뽑는 로또 프로그램 만들기 
	public static void main(String[] args) {
		// 로또 번호를 저장할 배열
		int[] lottoNumbers = new int[6];

		// 랜덤 숫자 생성을 위한 Random 객체 생성
		Random random = new Random();

		for (int i = 0; i < 6; i++) {
			int randomNumber;
			do {
				// 1부터 45 사이의 난수 생성
				randomNumber = random.nextInt(45) + 1;
			} while (contains(lottoNumbers, randomNumber)); // 중복 확인

			lottoNumbers[i] = randomNumber;
		}
		// 번호를 정렬
		Arrays.sort(lottoNumbers);

		// 생성된 로또 번호 출력
		System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
	}

	// 배열에서 숫자의 중복을 확인하는 메소드
	public static boolean contains(int[] array, int number) {
		for (int value : array) {
			if (value == number) {
				return true; // 중복된 숫자가 존재하면 true 반환
			}
		}
		return false; // 중복된 숫자가 없으면 false 반환
	}
}
