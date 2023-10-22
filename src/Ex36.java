import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");

		// 입력 문자열은 trim() 메서드를 사용하여 양쪽의 공백을 제거하고,
		// toLowerCase() 메서드를 사용하여 소문자로 변환
		String str = sc.nextLine().trim().toLowerCase();
		char[] ch = str.toCharArray(); // 입력 문자열을 문자 배열로 변환

		// 알파벳 빈도수를 저장하는 용도
		int[] array = new int[26];

		// 각 문자가 알파벳인지 확인하고 빈도수를 카운트
		for (int j = 0; j < ch.length; j++) {
			for (int i = 97; i <= 122; i++) {
				// 현재 알파벳과 비교하여 일치하면
				// 해당 알파벳에 해당하는 인덱스를 사용하여 array 배열의 값을 1 증가
				if (ch[j] == i) {
					array[i - 97] += 1;
				}
			} // for
		} // for
			// 'a'부터 'z'까지의 알파벳과 그에 해당하는 빈도수를 출력
		for (int i = 97, j = 0; i <= 122; i++, j++) {
			System.out.println((char) (i) + " : " + array[j]);
		}
		sc.close();
	}
}
