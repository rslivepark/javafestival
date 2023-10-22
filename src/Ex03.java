
public class Ex03 {
	public static void main(String[] args) {
//		1-2+3-4+5-6+... +99-100
		int sum = 0;
		for(int i=1, j=-2; i<=100; i+=2, j-=2) {
		System.out.print(i + " "+ j + " ");
			sum += (i+j);
		}
		System.out.println();
		System.out.println("결과: " + sum);
	}
}
