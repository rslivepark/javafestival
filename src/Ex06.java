
public class Ex06 {
	public static void main(String[] args) {

		int tot = 0;
		for (int i = 77, j = 1; i >= 1; i--, j++) {
			tot += (i * j);
			System.out.println("("+i+"*"+j+")");
		}
		System.out.println(tot);
	}
}
