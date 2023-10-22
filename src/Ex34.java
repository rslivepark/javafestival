import java.util.*;

public class Ex34 {
	// 2진수 입력받아 10진수로 바꾸기 
	public static void main(String[] args) {
		
	 String str1 = "01001101";
	 String str2 = "00101000";
	 
	 int toTen = Integer.parseInt(str1, 2);
	 System.out.println(str1 + "(2) = "+ toTen + "(10)");
	 toTen = Integer.parseInt(str2, 2);
	 System.out.println(str2 + "(2) = "+ toTen + "(10)");

	}
}
