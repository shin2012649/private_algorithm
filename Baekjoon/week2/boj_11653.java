package private_algorithm.Baekjoon.Week2;
import java.util.Scanner;

public class boj_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if (N == 1) {
            return;
        }
        
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
        
        if (N > 1) {
            System.out.println(N);
        }
    }
}
//소인수분해
