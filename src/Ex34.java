import java.util.*;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("2진수를 입력하세요: ");
        String binaryString = scanner.nextLine();

        int decimalNumber = binaryToDecimal(binaryString);

        System.out.println("10진수로 변환된 값: " + decimalNumber);

        scanner.close();
    }

    public static int binaryToDecimal(String binaryString) {
        int decimalNumber = 0;
        int binaryLength = binaryString.length();

        // 2진수 문자열을 뒤에서부터 읽어가면서 10진수로 변환
        for (int i = 0; i < binaryLength; i++) {
            char binaryDigit = binaryString.charAt(binaryLength - 1 - i);
            if (binaryDigit == '1') {
                // 2^i를 더하여 10진수로 변환
                decimalNumber += Math.pow(2, i);
            }
        }

        return decimalNumber;
    }
}
