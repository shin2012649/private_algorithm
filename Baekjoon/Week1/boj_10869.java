package private_algorithm.Baekjoon.Week1;
import java.util.Scanner;
public class boj_10869 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        
        in.close();
        
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}

// 사칙 연산 