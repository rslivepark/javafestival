import java.util.*;

public class Ex27 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i+1);
			System.out.print("번째 수 입력: ");
			arr[i]= sc.nextInt();
		}
		System.out.println();
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
