package private_algorithm.Baekjoon.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            int sum = i;
            int temp = i;

            //각 자리수를 분해해서 더한다
            while (temp != 0) {
                sum += temp%10;
                temp = temp/10;
            }

            if (sum == n) {
                System.out.println(i);
                return;
            }
        }

        //생성자가 없을 경우 0출력
        System.out.println(0);
    }
}
//분해합
