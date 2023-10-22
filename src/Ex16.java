import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        int[][] n = new int[x][x];
        int num = 1;
        int printOrder = 1; // 출력 순서: 1 순서대로, -1 역순으로

        // 배열에 숫자 할당 및 출력
        for (int i = 0; i < x; i++) {
        	// 숫자 순서대로 입력 
            if (printOrder == 1) {
                for (int j = 0; j < x; j++) {
                    n[i][j] = num;
                    num++;
                }//for
            } else { // 숫자 역순으로 입력 
                for (int j = x - 1; j >= 0; j--) {
                    n[i][j] = num;
                    num++;
                }//for
            }//if
            // 출력순서 바꾸기 
            printOrder *= -1;
        }//for

        // 배열 내용 출력
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }//for
    }
}

/*
 * 1. 코드 실행이 시작되면 `Scanner` 클래스를 사용하여 사용자로부터 정수 값을 입력받습니다. * 
 * 2. 사용자가 입력한 정수는 변수 `x`에 저장됩니다. * 
 * 3. `x`x` 크기의 2차원 배열 `n`을 생성하고, 정수 변수 `num`을 1로 초기화하며, 출력 순서를 결정하는 변수
 `printOrder`를 1로 초기화합니다. `printOrder`가 1인 경우는 순서대로, -1인 경우는 역순으로 값을 할당하도록 사용됩니다.
 * 4. 이후, 이중 반복문을 사용하여 배열에 숫자를 할당하고 출력합니다. 바깥쪽 반복문은 배열의 행을 순회하며, 안쪽 반복문은 열을 순회합니다.
 * 5. 출력 순서가 `printOrder` 변수에 따라 결정됩니다. `printOrder`가 1인 경우, 배열에 숫자가 순서대로 할당되고, `-1`인 경우에는 역순으로 할당됩니다.
 * 6. 배열에 숫자가 할당되면 `num` 변수가 1씩 증가하며 다음 숫자를 나타냅니다.
 * 7. 배열에 숫자가 할당된 후, 이중 반복문을 통해 배열 내용이 출력됩니다.
 * 8. 외부 반복문은 배열의 각 행을 순회하며, 내부 반복문은 각 행의 열을 출력합니다.
 * 9. 한 행의 출력이 끝나면 `System.out.println();`을 통해 다음 행으로 넘어갑니다.
 * 10. 프로그램이 종료됩니다.
 */