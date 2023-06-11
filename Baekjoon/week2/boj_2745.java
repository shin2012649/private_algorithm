package private_algorithm.Baekjoon.Week2;
import java.util.Scanner;

public class boj_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        
        int conversion = 0;
        int power = 1;
        for (int i = N.length() - 1; i >= 0; i--) {
            int digit = getDecimalValue(N.charAt(i));
            conversion += digit * power;
            power *= B;
        }
        
        System.out.println(conversion);
    }
    
    public static int getDecimalValue(char c) {
        if (Character.isDigit(c)) {
            return c - '0';
        } else {
            return c - 'A' + 10;
        }
    }
}

// 진법변환


