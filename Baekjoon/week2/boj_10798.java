package private_algorithm.Baekjoon.Week2;
import java.util.Scanner;

public class boj_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] W = new String[5];

        for (int i = 0; i < 5; i++) {
            W[i] = sc.nextLine();
        }
        StringBuilder result = new StringBuilder();
        int MAX_SIZE = 0;

        for (String word : W) {
            if (word.length() > MAX_SIZE) {
                MAX_SIZE = word.length();
            }
        }
        for (int i = 0; i < MAX_SIZE; i++) {
            for (String word : W) {
                if (i < word.length()) {
                    result.append(word.charAt(i)); 
                }
            }
        }

        System.out.println(result.toString());
    }
}
// 세로 읽기

