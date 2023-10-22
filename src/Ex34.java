import java.util.*;

public class Ex34 {
	// 2진수 입력받아 10진수로 바꾸기 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 입력 : ");
		String num = sc.next();

		int two = Integer.parseInt(num, 2);
		System.out.println(two);

	}
}
