
public class Ex28 {
// 2차원 배열을 왼쪽으로 90도 회전하여 출력하기 
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();

		}
		System.out.println();

		int[][] arr2 = new int[5][5];
		int k2 = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[j][i] = k2;
				k2++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();

		}
	}
}
