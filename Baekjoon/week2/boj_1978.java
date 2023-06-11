package private_algorithm.Baekjoon.Week2;
import java.util.Scanner;

public class boj_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            int No = sc.nextInt();
            if (X(No) == 1) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static int X(int N) {
        if (N < 2) {
            return 0;
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
//소수 찾기
