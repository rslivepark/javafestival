
public class Ex15 {
	// 학생들의 성적정보가 문자열로 선언되었을 때 각 성적별 학생 수 출력하기
	// 문자열 중복 개수 찾기
	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";

		// 쉼표(,)를 기준으로 문자열을 분리하여 배열로 저장
		String[] scores = score.split(",");

		// 중복 개수를 저장할 배열 
		// grades 배열과 count 배열은 항목의 순서가 같아야함 
		int[] count = new int[5]; // A, B, C, D, F

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		// 각 항목의 중복 개수를 계산
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < grades.length; j++) {
				if (scores[i].equals(String.valueOf(grades[j]))) {
					count[j]++;
				}
			}
		}

		// 결과 출력
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i] + ": " + count[i] + "개");
		}
	}
}
