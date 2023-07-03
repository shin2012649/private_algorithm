import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수의 개수
        int M = sc.nextInt(); // 합을 구해야 하는 횟수

        int[] numbers = new int[N + 1]; // 수의 배열 (인덱스 1부터 시작)

        // 수 입력
        for (int i = 1; i <= N; i++) {
            numbers[i] = sc.nextInt();
        }

        // 누적 합 계산
        int[] prefixSum = new int[N + 1];
        prefixSum[1] = numbers[1];
        for (int i = 2; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        // 구간 합 계산
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            int sum = prefixSum[end] - prefixSum[start - 1];
            System.out.println(sum);
        }
    }
}
