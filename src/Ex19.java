
public class Ex19 {
	public static void main(String[] args) {
		
		//숫자와 연산자를 매개변수로 받아 연산한 결과를 반환해 주는 cal메소드 만들기 
		int result1 = cal(5,7, '+');
		System.out.println(result1);
	}

	public static  int cal(int a, int b, char op) {
		int result = 0;
		if (op == '+') {
			result = a + b;
		} else if (op == '-') {
			result = a - b;
		} else if (op == '*') {
			result = a * b;
		} else if (op == '/') {
			result = a / b;
		} // if

		return result;
	}
}
