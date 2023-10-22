
public class Ex26 {
//오른쪽으로 정렬된 별 트리 출력하기 
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 4; i < j; j--) {
				System.out.print(" ");
			} // for1
			for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			} // for2
			System.out.println();
		}//for end
	}
}
