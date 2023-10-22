import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        int[][] n = new int[x][x];
        int num = 1;

        // 배열에 숫자를 위에서 아래로 순서대로 입력
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                n[j][i] = num;
                num++;
            }//for
        }//for

        // 배열 내용 출력
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(n[i][j] + " ");
            }//for
            System.out.println();
        }//for
    }
}
