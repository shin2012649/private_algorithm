package private_algorithm.Baekjoon.Week2;

import java.util.Scanner;

public class boj_11005{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        String result = convertToBaseN(N, B);
        System.out.println(result);
    }
    
    private static String convertToBaseN(int N, int B) {
        StringBuilder sb = new StringBuilder();
        
        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                sb.append(remainder);
            } else {
                char c = (char) ('A' + remainder - 10);
                sb.append(c);
            }
            N /= B;
        }
        
        return sb.reverse().toString();
    }
}
// 진법변환

