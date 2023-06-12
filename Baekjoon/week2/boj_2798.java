package private_algorithm.Baekjoon.Week2;

import java.util.Arrays;
import java.util.Scanner;

public class boj_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 카드의 개수
        int M = sc.nextInt(); // 목표 합

        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int result = findMaxSum(cards, M);
        System.out.println(result);
    }

    public static int findMaxSum(int[] cards, int M) {
        int maxSum = 0;

        // 카드 3장의 합이 M을 넘지 않으면서 최대한 가까운 경우를 찾기 위해
        // 3중 반복문을 사용하여 모든 가능한 조합을 확인합니다.
        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];

                    // 합이 M을 넘지 않으면서 최대값인 경우를 갱신합니다.
                    if (sum <= M && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }

        return maxSum;
    }
}
// 블랙잭
